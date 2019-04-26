#!/bin/bash

# Collects and encrypts the required files

# Helper functions
exit_abort () {
	[ ! -z "$1" ] && echo ERROR: "$1"
	echo
	echo 'ABORTED!'
	exit $ERRCODE
}

show_usage() {
	echo usage: `basename $0` "SecretPassphrase"
	echo
	echo "Collects and encrypts all the files using AppVeyor's secure-file utility"
	echo
	exit_abort "$@"
}

SecureFile=../../../secure-file/tools/secure-file.exe
SecretPassphrase=$1

[ -f "$SecureFile" ] || exit_abort "Can't find $SecureFile. Try 'nuget install secure-file -ExcludeVersion'"
[ ! -z "$SecretPassphrase" ] || show_usage "Specify a passphrase to use for encrypting the files"

gpg --export -a "Open Source Aquatics (OpenSource-AI) <opensource@aquaticinformatics.com>" > OpenSourceAquatics.public.gpg.asc || exit_abort "Can't export public key"
gpg --export-secret-key -a "Open Source Aquatics (OpenSource-AI) <opensource@aquaticinformatics.com>" > OpenSourceAquatics.secret.gpg.asc || exit_abort "Can't export private key"
$SecureFile -encrypt OpenSourceAquatics.secret.gpg.asc -secret "$SecretPassphrase" || exit_abort "Can't encrypt secret key"
$SecureFile -encrypt OpenSourceAquatics.public.gpg.asc -secret "$SecretPassphrase" || exit_abort "Can't encrypt public key"
$SecureFile -encrypt "$USERPROFILE/.m2/settings-security.xml" -secret "$SecretPassphrase" -out ./settings-security.xml.enc || exit_abort "Can't encrypt master Maven password"
$SecureFile -encrypt "$USERPROFILE/.m2/settings.xml" -secret "$SecretPassphrase" -out ./settings.xml.enc || exit_abort "Can't encrypt Maven secrets"
