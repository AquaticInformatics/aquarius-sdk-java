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

SecureFile=../../../secure-file/appveyor-tools/secure-file.exe
SecretPassphrase=$1

[ -f "$SecureFile" ] || exit_abort "Can't find $SecureFile. Try 'https://www.appveyor.com/docs/how-to/secure-files/'"
[ ! -z "$SecretPassphrase" ] || show_usage "Specify a passphrase to use for encrypting the files"

gpg --export -a "Open Source Aquatics (OpenSource-AI) <opensource@aquaticinformatics.com>" > OpenSourceAquatics.public.gpg.asc || exit_abort "Can't export public key"
gpg --export-secret-key -a "Open Source Aquatics (OpenSource-AI) <opensource@aquaticinformatics.com>" > OpenSourceAquatics.secret.gpg.asc || exit_abort "Can't export private key"
echo Encrypting OpenSourceAquatics.secret.gpg.asc
$SecureFile -encrypt OpenSourceAquatics.secret.gpg.asc -secret "$SecretPassphrase" || exit_abort "Can't encrypt secret key"
echo Encrypting OpenSourceAquatics.public.gpg.asc
$SecureFile -encrypt OpenSourceAquatics.public.gpg.asc -secret "$SecretPassphrase" || exit_abort "Can't encrypt public key"
echo Encrypting "$USERPROFILE/.m2/settings-security.xml" but really just settings-security.xml
$SecureFile -encrypt settings-security.xml -secret "$SecretPassphrase" -out ./settings-security.xml.enc || exit_abort "Can't encrypt master Maven password"
echo Encrypting "$USERPROFILE/.m2/settings.xml" but really just settings.xml
$SecureFile -encrypt settings.xml -secret "$SecretPassphrase" -out ./settings.xml.enc || exit_abort "Can't encrypt Maven secrets"
