## AQUARIUS.SDK Java Release Notes

This page highlights some changes in the SDK.

Not all changes will be listed, but you can always [compare by version tags](https://github.com/AquaticInformatics/aquarius-sdk-java/compare/v17.2.26...v17.2.28) to see the full source code difference.

### 18.8.1

- Updated the service models for the AQUARIUS Time-Series 2018.4 release.

### 18.7.1

- Updated the service models for the AQUARIUS Time-Series 2018.3 release.

### 18.6.3

- Added automatic password encryption of TimeSeries client connections, just like the .NET SDK

### 18.6.2

- Fixed a JSV serialization bug ([Issue #52](https://github.com/AquaticInformatics/aquarius-sdk-java/issues/52)) so that extended attribute filter requests can be sent from the Java SDK.
- Thanks to Zackary Moore @ USGS for this community contribution!

### 18.6.1

- Updated the service models for the AQUARIUS Time-Series 2018.2 release.

### 18.5.2

- Enumeration values are now deserialized using case-insensitive logic.

### 18.5.1

- Updated service models for the AQUARIUS Samples 2018.05 release

### 18.4.2

- Authenticate against the Publish endpoint instead of Provisioning, since that endpoint is more likely to be active and able to quickly respond. This internal change should be invisible to SDK consumers.

### 18.4.1

- Updated service models for the AQUARIUS Samples 2018.04 release
- This Java SDK has skipped the 18.2 and 18.3 versions, to keep its "Major.Minor" version in sync with the .NET SDK.

### 18.1.1

- Updated service models for the AQUARIUS Time-Series 2018.1 release
- Initial BETA support for the AQUARIUS Samples 2018.03 release.

Since the Samples API support is considered BETA, there may be some breaking changes. We welcome community feedback to help smooth out any rough edges.

### 17.4.3

- Fixed an Instant JSON deserialization bug.

### 17.4.1

- Updated service models for the AQUARIUS Time-Series 2017.4 release

### 17.3.1

- Initial public release of the SDK, supporting the AQUARIUS Time-Series 2017.3 release
