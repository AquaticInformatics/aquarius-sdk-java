# AQUARIUS SDK for Java

[![Build status](https://ci.appveyor.com/api/projects/status/ggamtunnps7umnmg/branch/develop?svg=true)](https://ci.appveyor.com/project/SystemsAdministrator/aquarius-sdk-java/branch/develop)

The **AQUARIUS SDK for Java** enables JAVA developers to easily work with the [AQUARIUS Platform](http://aquaticinformatics.com/products/) of environmental monitoring products.

![AQUARIUS Platform](images/aquatic-informatics.png)

* [AQUARIUS Time-Series](http://aquaticinformatics.com/products/aquarius-time-series/)
* [AQUARIUS Samples](http://aquaticinformatics.com/products/aquarius-samples/)
* [AQUARIUS WebPortal](http://aquaticinformatics.com/products/aquarius-webportal/) (coming soon!)

View the [Release Notes](ReleaseNotes.md) here.

## Consuming the SDK

- Requires Java 8

### Maven

To use this project as a dependency with [Maven](https://maven.apache.org),
add the following dependency to your project's `pom.xml`:

```xml
<dependency>
  <groupId>com.aquaticinformatics</groupId>
  <artifactId>aquarius.sdk</artifactId>
  <version>18.4.2</version>
</dependency>
```

### sbt

To use this project as a dependency with [sbt](http://www.scala-sbt.org)
add the following dependency to your project's `build.sbt`:

```scala
libraryDependencies += "com.aquaticinformatics" % "aquarius.sdk" % "18.4.2"
```

### Gradle

To use this project as a dependency with [Gradle](https://gradle.org/),
add the following dependency to your project's `build.gradle`:

```groovy
compile "com.aquaticinformatics:aquarius.sdk:18.4.2"
```

### Others

To use this project as a dependency of another build system, a
[JAR](https://docs.oracle.com/javase/8/docs/technotes/guides/jar/index.html)
can be created by running the following commands:

```sh
git clone --branch v18.4.2 https://github.com/AquaticInformatics/aquarius-sdk-java.git
cd aquarius-sdk-java
mvn package
```

The generated JAR file will be at `target/aquarius-sdk-18.4.2.jar`.

## Getting Help

See the [Wiki](https://github.com/AquaticInformatics/aquarius-sdk-java/wiki) for basic SDK concepts and examples.

## Contributing

Contributions are always welcome, no matter how large or small. Before contributing, please read the [code of conduct](CODE_OF_CONDUCT.md).

See [Contributing](CONTRIBUTING.md).

