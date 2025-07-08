# AppVeyor build notes

The SDK is built on AppVeyor and deployed to the Maven Central repositories.

## Build and deployment secrets

The AppVeyor build jobs perform all the code signing and deployment to the Maven repositories.

There are GPG key signatures and Central Publisher Portal service account credentials stored in encrypted formats in the `build\Maven` subfolder.
Only authorized developers can update and change these credentials.

## AppVeyor projects

### "aquarius-sdk-java"

[![Build status](https://ci.appveyor.com/api/projects/status/ggamtunnps7umnmg/branch/develop?svg=true)](https://ci.appveyor.com/project/SystemsAdministrator/aquarius-sdk-java/branch/develop)

This project builds every pull request and every merge, running all the tests. This build is hooked up to GitHub and adds the pass/fail status to each pull request, so we know if it is good to merge.

The AppVeyor build is configured by the [appveyor.yml](./appveyor.yml) file.

### "aquarius-sdk-java Nightly Snapshot"

[![Build status](https://ci.appveyor.com/api/projects/status/v5w3w11y9ovkt86w/branch/develop?svg=true)](https://ci.appveyor.com/project/SystemsAdministrator/aquarius-sdk-java-800q1/branch/develop)

This project builds the `develop` branch and deploys the result to the Maven Central SNAPSHOT repository.

This project runs every night at 8PM Pacific Standard Time if any changes were made.

This project allows developers to work with the latest unreleased code from the SDK (live life on the edge!).

The AppVeyor build is configured by the [appveyor-deploy.yml](./appveyor-deploy.yml) file.

### "aquarius-sdk-java Manual Release"

[![Build status](https://ci.appveyor.com/api/projects/status/nlhcrayb3jm9mntq/branch/master?svg=true)](https://ci.appveyor.com/project/SystemsAdministrator/aquarius-sdk-java-p7vvi/branch/master)

This project builds the `master` branch and deploys official releases to the Maven Central repository.

This project is run manually by authorized developers when a new release needs to be promoted to Maven.

The AppVeyor build is configured by the [appveyor-mvn-release.yml](./appveyor-mvn-release.yml) file.
