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
	echo usage: `basename $0` "[ServerName (default: localhost)] [OutputPath (default: ./ServiceModels)]"
	echo
	echo Generates an Aquarius Samples client library that matches the services running on the server
	echo
	exit_abort "$@"
}

GeneratorProjectPath=../../../../../../../../../aquarius-sdk-net/src/SamplesServiceModelGenerator/SamplesServiceModelGenerator.csproj
Generator=../../../../../../../../../aquarius-sdk-net/src/SamplesServiceModelGenerator/bin/Release/net8.0/SamplesServiceModelGenerator.dll

ServerName=$1
OutputPath=$2

command -v dotnet >/dev/null 2>&1 || exit_abort "This script requires the .NET 8 runtime. Grab it from here: https://www.microsoft.com/net/download"
[ -f "$GeneratorProjectPath" ] || exit_abort "Can't find aquarius-sdk-net repo cloned to the same directory as aquarius-sdk-java"
[ -f "$Generator" ]    || dotnet build "$GeneratorProjectPath" -c Release || exit_abort "Can't find or build SamplesServiceModelGenerator.dll"
[ ! -z "$ServerName" ] || ServerName=https://demo.aqsamples.com
[ ! -z "$OutputPath" ] || OutputPath=./ServiceModel.java

dotnet $Generator -language=Java -filename=$OutputPath -url=$ServerName/api/swagger.json || exit_abort
