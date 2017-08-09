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
[ ! -z "$ServerName" ] || ServerName=localhost
[ ! -z "$OutputPath" ] || OutputPath=.

mkdir -p "$OutputPath" || exit_abort "Can't create OutputPath=$OutputPath"
echo "Determining AQUARIUS Server version ..."
ApiVersionJson=`curl -s http://$ServerName/AQUARIUS/apps/v1/version` || exit_abort "Can't determine AQUARIUS server version of $ServerName"
ApiVersion=`echo "$ApiVersionJson" | sed -e "s/{\"ApiVersion\":\"//" -e "s/\"}//"`

echo "Generating $OutputFile ..."
OutputFile=$OutputPath/$EndPointName.java
curl -s -o t.t "http://$ServerName/AQUARIUS/$EndPoint/types/java?Package=com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels&GlobalNamespace=$EndPointName&AddServiceStackTypes=false&TreatTypesAsStrings=Guid&DefaultImports=java.time.*,java.util.*,net.servicestack.client.*,com.aquaticinformatics.aquarius.sdk.AquariusServerVersion" || exit_abort "Can't read endpoint"
cat t.t | sed -e "s/\bIList</List</g" \
    -e "s/\bIReadOnlyList</List</g" \
    -e "s/\bNullable<Double>/Double/g" \
    -e "s/\bOffset\b/ZoneOffset/g" \
    -e "s/\bDate\b/Instant/g" \
    -e "s/^}/\\n    public static class Current\\n    {\\n        public static final AquariusServerVersion Version = AquariusServerVersion.Create(\"$ApiVersion\");\\n    }\\n\\n}/" >> "$OutputFile"
rm t.t
unix2dos "$OutputFile"
echo "Complete."
