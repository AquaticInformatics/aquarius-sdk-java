#!/bin/bash

# This is can be installed in your ~/bin folder, outside of any repo.

# Helper functions
exit_abort () {
	[ ! -z "$1" ] && echo ERROR: "$1"
	echo
	echo 'ABORTED!'
	exit $ERRCODE
}

show_usage() {
	echo usage: `basename $0` "EndPointNamespace EndPointRelativeUrl [ServerName (default: localhost)] [OutputPath (default: .)]"
	echo
	echo "Generates an Aquarius NG client service model code file via ServiceStack's built-in /types/<language> generator available on a live REST endpoint"
	echo
	exit_abort "$@"
}

EndPointName=$1
EndPoint=$2
ServerName=$3
OutputPath=$4

[ ! -z "$EndPointName" ] || show_usage "No namespace! Specify a namespace for the generated code"
[ ! -z "$EndPoint" ] || show_usage "No endpoint! Specify a relative URL for the endpoint to inspect"
[ ! -z "$ServerName" ] || ServerName=http://localhost
[ ! -z "$OutputPath" ] || OutputPath=.

mkdir -p "$OutputPath" || exit_abort "Can't create OutputPath=$OutputPath"
echo "Determining AQUARIUS Server version ..."
ApiVersionJson=`curl -s $ServerName/AQUARIUS/apps/v1/version` || exit_abort "Can't determine AQUARIUS server version of $ServerName"
ApiVersion=`echo "$ApiVersionJson" | sed -e "s/{\"ApiVersion\":\"//" -e "s/\"}//"`

echo "Generating $OutputFile ..."
OutputFile=$OutputPath/$EndPointName.java
TempFile=t.t

rm -f "$TempFile" "$TempFile".*

# Ask the ServiceStack endpoint to generate the annotated Java DTOs
curl -s -o "$TempFile" "$ServerName/AQUARIUS/$EndPoint/types/java?Package=com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels&GlobalNamespace=$EndPointName&AddServiceStackTypes=false&TreatTypesAsStrings=Guid&DefaultImports=java.time.*,java.util.*,net.servicestack.client.*,com.aquaticinformatics.aquarius.sdk.AquariusServerVersion" || exit_abort "Can't read endpoint"

# Now we need to work around some of the limitations of the ServiceStack code generators.
# All of this 3-phase regex madness could be eliminated if the ServiceStack code generator supported an "Aliases" dictionary

# Phase 1 - Map a few .NET types to appropriate Java types
unset typeMap
declare -A typeMap
typeMap["IList<"]="List<"             # All the .NET list variants map to a simple Java list
typeMap["IReadOnlyList<"]="List<"
typeMap["Nullable<Double>"]="Double"  # Doubles are already nullable in Java
typeMap["Date\\b"]="Instant"             # Use java.time.Instant for accurate timestamps

for sourceType in ${!typeMap[@]}; do
  destType=${typeMap[${sourceType}]}

  # Use a simple sed substitution to map these types
  sed -i.bak -e "s/\\b${sourceType}/${destType}/g" "$TempFile"
done

# Also append a built-in Current version property into the service model namespace
sed -i.bak -e "s/^}/    public static class Current\\n    {\\n        public static final AquariusServerVersion Version = AquariusServerVersion.Create(\"$ApiVersion\");\\n    }\\n}/" "$TempFile"

# When "public static interface IFileUploadRequest" exists, insert "public static interface IHttpFile {}"
sed -i.bak -e "s/public static interface IFileUploadRequest/public static interface IHttpFile\\n    {\\n    }\\n\\n    public static interface IFileUploadRequest/" "$TempFile"

# 2021.1 added a hidden IFileUploadRequest.IsFileRequired property with [ApiMember(ExcludeInSchema = true)][IgnoreDataMember] attributes.
# The built-in ServiceStack code generator endpoint doesn't respect these attributes.
# So we need to manually detect and remove the IsFileRequired property so that everything compiles.
# This blunt-hammer approach works for 2021.1, but may need to be revisited if a property of the same name ever needs to exist in the API
sed -i.bak -e "s/        public Boolean IsFileRequired = null;/        \\/\\/ HACK from generate_code_from_live_endpoint.sh \\/\\/ public Boolean IsFileRequired = null;/" "$TempFile"

# Fix any "public static interface IDerived implements IBase" to "public static interface IDerived extends IBase"
sed -i.bak -e "s/public static interface \\(I[A-Za-z0-9]*\\) implements \\(I[A-Za-z0-9]*\\)/public static interface \1 extends \2/" "$TempFile"

# Phase 2 - Map some NodaTime .NET struct datatypes (exported as Java strings) to more appropriate Java types.
# We need to match regular expressions across multiline statements, so switch to perl, using -0777 for "slurp the entire file as one record".
# Relevant XKCD: https://xkcd.com/1171/

unset typeMap
declare -A typeMap
typeMap["interval"]="Interval"  # NodaTime.Interval maps to java.time.Interval
typeMap["duration"]="Duration"  # NodaTime.Duration maps to java.time.Duration
typeMap["offset from UTC"]="Duration"    # NodaTime.Offset   maps to java.time.Duration

cp "$TempFile" "$TempFile".map

for sourceType in ${!typeMap[@]}; do
  destType=${typeMap[${sourceType}]}

  # Compose the multiline regex to find fields needing to be remapped
  # \1 matches the @ApiMember line
  # \2 matches the subsequent "public" field prefix
  # \3 matches the field name
  apiMemberRegex="\n([ \t]*\@ApiMember\(DataType=\"string\",.*Format=\"${sourceType}\".*)\n( *public )String (.*) = null;"

  # Build some # <FieldName> = <DestType> lines, which we will extract later in Phase 3
  perl -0777 -p -i.bak -e "s/$apiMemberRegex/\n# \3 = $destType/g" "$TempFile".map

  # Modify the @ApiMember declaration to use the correct Java type
  perl -0777 -p -i.bak -e "s/$apiMemberRegex/\n\1\n\2$destType \3 = null;/g" "$TempFile"

done

# Phase 3 - Extract the # <FieldName> = <DestType> lines and repair the generated getters/setters
fieldName=
destType=
index=0
for item in `grep "^#" "$TempFile".map | cut -d' ' -f2,4 | sort | uniq`; do
  if ((index == 0)); then
    fieldName=$item
    index=1
    continue
  else
    destType=$item
    index=0
  fi

  # Now we have a $fieldName and $destType to tweak

  # Compose a regex that matches the String getter/setter pattern
  # \1 matches the getter prefix
  # \2 matches the getter suffix
  # \3 matches the setter prefix
  # \4 matches the setter suffix
  regex="\n([ \t]*public) String get$fieldName\(\)(.*)\n([ \t]*public \w+) set$fieldName\(String value\)(.*)\n"

  # Modify the getter/setter to map the field's type
  perl -0777 -p -i.bak -e "s/$regex/\n\1 $destType get$fieldName()\2\n\3 set$fieldName($destType value)\4\n/g" "$TempFile"

done

mv "$TempFile" "$OutputFile"
unix2dos "$OutputFile"
rm -f "$TempFile".bak "$TempFile".map "$TempFile".map.bak

echo "Complete."
