/* Options:
Instant: 2017-12-12 17:17:08
Version: 4.512
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: http://autoserver12/AQUARIUS/Provisioning/v1

Package: com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels
GlobalNamespace: Provisioning
//AddPropertyAccessors: True
//SettersReturnThis: True
AddServiceStackTypes: False
//AddResponseStatus: False
//AddDescriptionAsComments: True
//AddImplicitVersion: 
//IncludeTypes: 
//ExcludeTypes: 
TreatTypesAsStrings: Guid
DefaultImports: java.time.*,java.util.*,net.servicestack.client.*,com.aquaticinformatics.aquarius.sdk.AquariusServerVersion
*/

package com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels;

import java.time.*;
import java.util.*;
import net.servicestack.client.*;
import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;

public class Provisioning
{

    @Route(Path="/fielddataplugins", Verbs="GET")
    public static class GetFieldDataPlugins implements IReturn<FieldDataPluginsResponse>
    {
        
        private static Object responseType = FieldDataPluginsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/fielddataplugins", Verbs="POST")
    public static class PostFieldDataPlugin implements IReturn<FieldDataPlugin>
    {
        /**
        * Plug-in folder name
        */
        @ApiMember(Description="Plug-in folder name", IsRequired=true)
        public String PluginFolderName = null;

        /**
        * Assembly qualified type name
        */
        @ApiMember(Description="Assembly qualified type name", IsRequired=true)
        public String AssemblyQualifiedTypeName = null;

        /**
        * Plug-in priority; 1 has highest priority
        */
        @ApiMember(DataType="integer", Description="Plug-in priority; 1 has highest priority", IsRequired=true)
        public Integer PluginPriority = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;
        
        public String getPluginFolderName() { return PluginFolderName; }
        public PostFieldDataPlugin setPluginFolderName(String value) { this.PluginFolderName = value; return this; }
        public String getAssemblyQualifiedTypeName() { return AssemblyQualifiedTypeName; }
        public PostFieldDataPlugin setAssemblyQualifiedTypeName(String value) { this.AssemblyQualifiedTypeName = value; return this; }
        public Integer getPluginPriority() { return PluginPriority; }
        public PostFieldDataPlugin setPluginPriority(Integer value) { this.PluginPriority = value; return this; }
        public String getDescription() { return Description; }
        public PostFieldDataPlugin setDescription(String value) { this.Description = value; return this; }
        private static Object responseType = FieldDataPlugin.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/fielddataplugins/{UniqueId}", Verbs="DELETE")
    public static class DeleteFieldDataPlugin implements IReturnVoid
    {
        /**
        * Unique ID of the field data plug-in
        */
        @ApiMember(DataType="string", Description="Unique ID of the field data plug-in", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteFieldDataPlugin setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/users/credentials", Verbs="POST")
    public static class PostCredentialsUser extends UserBase implements IReturn<User>
    {
        /**
        * Password
        */
        @ApiMember(Description="Password", IsRequired=true)
        public String Password = null;
        
        public String getPassword() { return Password; }
        public PostCredentialsUser setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/credentials/{UniqueId}", Verbs="PUT")
    public static class PutCredentialsUser extends PutUserBase implements IReturn<User>
    {
        /**
        * Password
        */
        @ApiMember(Description="Password", IsRequired=true)
        public String Password = null;
        
        public String getPassword() { return Password; }
        public PutCredentialsUser setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UniqueId}/credentials", Verbs="PUT")
    public static class PutCredentialsAuth extends PutUserAuthBase implements IReturn<User>
    {
        /**
        * Password
        */
        @ApiMember(Description="Password", IsRequired=true)
        public String Password = null;
        
        public String getPassword() { return Password; }
        public PutCredentialsAuth setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/calculated", Verbs="POST")
    public static class PostCalculatedDerivedTimeSeries extends TimeSeriesBase implements IReturn<TimeSeries>
    {
        /**
        * List of time series unique IDs of which the order translates to x1, x2… xN with x1 being the Master
        */
        @ApiMember(DataType="Array<string>", Description="List of time series unique IDs of which the order translates to x1, x2… xN with x1 being the Master", IsRequired=true)
        public ArrayList<String> TimeSeriesUniqueIds = null;

        /**
        * Formula
        */
        @ApiMember(Description="Formula", IsRequired=true)
        public String Formula = null;
        
        public ArrayList<String> getTimeSeriesUniqueIds() { return TimeSeriesUniqueIds; }
        public PostCalculatedDerivedTimeSeries setTimeSeriesUniqueIds(ArrayList<String> value) { this.TimeSeriesUniqueIds = value; return this; }
        public String getFormula() { return Formula; }
        public PostCalculatedDerivedTimeSeries setFormula(String value) { this.Formula = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/basic", Verbs="POST")
    public static class PostBasicTimeSeries extends TimeSeriesBase implements IReturn<TimeSeries>
    {
        /**
        * ISO 8601 Duration Format
        */
        @ApiMember(DataType="Duration", Description="ISO 8601 Duration Format", IsRequired=true)
        public Duration GapTolerance = null;
        
        public Duration getGapTolerance() { return GapTolerance; }
        public PostBasicTimeSeries setGapTolerance(Duration value) { this.GapTolerance = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/reflected", Verbs="POST")
    public static class PostReflectedTimeSeries extends TimeSeriesBase implements IReturn<TimeSeries>
    {
        /**
        * ISO 8601 Duration Format
        */
        @ApiMember(DataType="Duration", Description="ISO 8601 Duration Format", IsRequired=true)
        public Duration GapTolerance = null;
        
        public Duration getGapTolerance() { return GapTolerance; }
        public PostReflectedTimeSeries setGapTolerance(Duration value) { this.GapTolerance = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/statistical", Verbs="POST")
    public static class PostStatisticalDerivedTimeSeries extends TimeSeriesBase implements IReturn<TimeSeries>
    {
        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        @ApiMember(IsRequired=true)
        public String ComputationIdentifier = null;

        /**
        * New value location
        */
        @ApiMember(DataType="NewValueLocationType", Description="New value location")
        public NewValueLocationType NewValueLocation = null;

        /**
        * Require minimum coverage
        */
        @ApiMember(DataType="boolean", Description="Require minimum coverage")
        public Boolean RequireMinimumCoverage = null;

        /**
        * Coverage minimum percentage
        */
        @ApiMember(DataType="double", Description="Coverage minimum percentage")
        public Double CoverageMinimumPercentage = null;

        /**
        * Partial coverage grade
        */
        @ApiMember(DataType="integer", Description="Partial coverage grade")
        public Integer PartialCoverageGrade = null;

        /**
        * Observation offset in minutes
        */
        @ApiMember(DataType="integer", Description="Observation offset in minutes")
        public Integer ObservationOffsetInMinutes = null;

        /**
        * Time Step Count. Must be included for 'Statistic' derived time-series.
        */
        @ApiMember(DataType="integer", Description="Time Step Count. Must be included for 'Statistic' derived time-series.")
        public Integer TimeStepCount = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public PostStatisticalDerivedTimeSeries setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public PostStatisticalDerivedTimeSeries setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public NewValueLocationType getNewValueLocation() { return NewValueLocation; }
        public PostStatisticalDerivedTimeSeries setNewValueLocation(NewValueLocationType value) { this.NewValueLocation = value; return this; }
        public Boolean isRequireMinimumCoverage() { return RequireMinimumCoverage; }
        public PostStatisticalDerivedTimeSeries setRequireMinimumCoverage(Boolean value) { this.RequireMinimumCoverage = value; return this; }
        public Double getCoverageMinimumPercentage() { return CoverageMinimumPercentage; }
        public PostStatisticalDerivedTimeSeries setCoverageMinimumPercentage(Double value) { this.CoverageMinimumPercentage = value; return this; }
        public Integer getPartialCoverageGrade() { return PartialCoverageGrade; }
        public PostStatisticalDerivedTimeSeries setPartialCoverageGrade(Integer value) { this.PartialCoverageGrade = value; return this; }
        public Integer getObservationOffsetInMinutes() { return ObservationOffsetInMinutes; }
        public PostStatisticalDerivedTimeSeries setObservationOffsetInMinutes(Integer value) { this.ObservationOffsetInMinutes = value; return this; }
        public Integer getTimeStepCount() { return TimeStepCount; }
        public PostStatisticalDerivedTimeSeries setTimeStepCount(Integer value) { this.TimeStepCount = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/timeseries/{TimeSeriesUniqueId}", Verbs="GET")
    public static class GetTimeSeries implements IReturn<TimeSeries>
    {
        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series", IsRequired=true, ParameterType="path")
        public String TimeSeriesUniqueId = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public GetTimeSeries setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/interpolationtypes", Verbs="GET")
    public static class GetInterpolationTypes implements IReturn<InterpolationTypesResponse>
    {
        
        private static Object responseType = InterpolationTypesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries", Verbs="GET")
    public static class GetLocationTimeSeries implements IReturn<TimeSeriesResponse>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public GetLocationTimeSeries setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = TimeSeriesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/timeseries/{TimeSeriesUniqueId}", Verbs="DELETE")
    public static class DeleteTimeSeries implements IReturnVoid
    {
        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series", IsRequired=true, ParameterType="path")
        public String TimeSeriesUniqueId = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public DeleteTimeSeries setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
    }

    @Route(Path="/timeseries/extendedattributes", Verbs="GET")
    public static class GetTimeSeriesExtendedAttributes implements IReturn<ExtendedAttributeFieldsResponse>
    {
        
        private static Object responseType = ExtendedAttributeFieldsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/timeseries/{TimeSeriesUniqueId}", Verbs="PUT")
    public static class PutTimeSeries implements IReturn<TimeSeries>
    {
        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series", IsRequired=true, ParameterType="path")
        public String TimeSeriesUniqueId = null;

        /**
        * Label
        */
        @ApiMember(Description="Label", IsRequired=true)
        public String Label = null;

        /**
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;

        /**
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public PutTimeSeries setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public String getLabel() { return Label; }
        public PutTimeSeries setLabel(String value) { this.Label = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public PutTimeSeries setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public Boolean isPublish() { return Publish; }
        public PutTimeSeries setPublish(Boolean value) { this.Publish = value; return this; }
        public String getDescription() { return Description; }
        public PutTimeSeries setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public PutTimeSeries setComment(String value) { this.Comment = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public PutTimeSeries setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users", Verbs="GET")
    public static class GetUsers implements IReturn<UsersResponse>
    {
        
        private static Object responseType = UsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UniqueId}", Verbs="GET")
    public static class GetUser implements IReturn<User>
    {
        /**
        * Unique ID of the user
        */
        @ApiMember(DataType="string", Description="Unique ID of the user", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetUser setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UniqueId}", Verbs="DELETE")
    public static class DeleteUser implements IReturnVoid
    {
        /**
        * Unique ID of the user
        */
        @ApiMember(DataType="string", Description="Unique ID of the user", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteUser setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/session/keepalive", Verbs="GET")
    public static class GetKeepAlive implements IReturnVoid
    {
        
    }

    @Route(Path="/session", Verbs="POST")
    public static class PostSession implements IReturn<String>
    {
        /**
        * Username
        */
        @ApiMember(Description="Username")
        public String Username = null;

        /**
        * Encrypted password
        */
        @ApiMember(Description="Encrypted password")
        public String EncryptedPassword = null;

        /**
        * Optional locale. Defaults to English
        */
        @ApiMember(Description="Optional locale. Defaults to English")
        public String Locale = null;
        
        public String getUsername() { return Username; }
        public PostSession setUsername(String value) { this.Username = value; return this; }
        public String getEncryptedPassword() { return EncryptedPassword; }
        public PostSession setEncryptedPassword(String value) { this.EncryptedPassword = value; return this; }
        public String getLocale() { return Locale; }
        public PostSession setLocale(String value) { this.Locale = value; return this; }
        private static Object responseType = String.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/session", Verbs="DELETE")
    public static class DeleteSession implements IReturnVoid
    {
        
    }

    @Route(Path="/session/publickey", Verbs="GET")
    public static class GetPublicKey implements IReturn<PublicKey>
    {
        
        private static Object responseType = PublicKey.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/monitoringmethods", Verbs="POST")
    public static class PostMonitoringMethod extends MonitoringMethodWriteBase implements IReturn<MonitoringMethod>
    {
        
        private static Object responseType = MonitoringMethod.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/monitoringmethods/{MethodCode}", Verbs="GET")
    public static class GetMonitoringMethod implements IReturn<MonitoringMethod>
    {
        /**
        * Method code
        */
        @ApiMember(Description="Method code", IsRequired=true, ParameterType="path")
        public String MethodCode = null;
        
        public String getMethodCode() { return MethodCode; }
        public GetMonitoringMethod setMethodCode(String value) { this.MethodCode = value; return this; }
        private static Object responseType = MonitoringMethod.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/monitoringmethods", Verbs="GET")
    public static class GetMonitoringMethods implements IReturn<MonitoringMethodsResponse>
    {
        
        private static Object responseType = MonitoringMethodsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/monitoringmethods/{MethodCode}", Verbs="PUT")
    public static class PutMonitoringMethod extends MonitoringMethodWriteBase implements IReturn<MonitoringMethod>
    {
        
        private static Object responseType = MonitoringMethod.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/monitoringmethods/{MethodCode}", Verbs="DELETE")
    public static class DeleteMonitoringMethod implements IReturnVoid
    {
        /**
        * Method code
        */
        @ApiMember(Description="Method code", IsRequired=true, ParameterType="path")
        public String MethodCode = null;
        
        public String getMethodCode() { return MethodCode; }
        public DeleteMonitoringMethod setMethodCode(String value) { this.MethodCode = value; return this; }
    }

    @Route(Path="/locations/{LocationUniqueId}", Verbs="GET")
    public static class GetLocation implements IReturn<Location>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public GetLocation setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = Location.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations", Verbs="POST")
    public static class PostLocation extends LocationBase implements IReturn<Location>
    {
        /**
        * ISO 8601 duration format
        */
        @ApiMember(DataType="Offset", Description="ISO 8601 duration format")
        public Duration UtcOffset = null;
        
        public Duration getUtcOffset() { return UtcOffset; }
        public PostLocation setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        private static Object responseType = Location.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}", Verbs="PUT")
    public static class PutLocation extends LocationBase implements IReturn<Location>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PutLocation setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = Location.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums", Verbs="GET")
    public static class GetStandardReferenceDatums implements IReturn<StandardReferenceDatumsResponse>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public GetStandardReferenceDatums setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = StandardReferenceDatumsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/basereference", Verbs="POST")
    public static class PostBaseStandardReferenceDatum extends StandardReferenceDatumRequestBase implements IReturn<StandardReferenceDatum>
    {
        
        private static Object responseType = StandardReferenceDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/basereferenceoffset", Verbs="POST")
    public static class PostBaseStandardReferenceDatumOffset extends StandardReferenceDatumRequestBase implements IReturn<StandardReferenceDatum>
    {
        /**
        * Offset in relation to the base reference.
        */
        @ApiMember(DataType="double", Description="Offset in relation to the base reference.", IsRequired=true)
        public Double OffsetToBaseReference = null;
        
        public Double getOffsetToBaseReference() { return OffsetToBaseReference; }
        public PostBaseStandardReferenceDatumOffset setOffsetToBaseReference(Double value) { this.OffsetToBaseReference = value; return this; }
        private static Object responseType = StandardReferenceDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/basereferenceoffset/{StandardIdentifier}", Verbs="PUT")
    public static class PutBaseStandardReferenceDatumOffset implements IReturn<StandardReferenceDatum>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Standard identifier
        */
        @ApiMember(Description="Standard identifier", IsRequired=true, ParameterType="path")
        public String StandardIdentifier = null;

        /**
        * Offset in relation to the base reference.
        */
        @ApiMember(DataType="double", Description="Offset in relation to the base reference.", IsRequired=true)
        public Double OffsetToBaseReference = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PutBaseStandardReferenceDatumOffset setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public PutBaseStandardReferenceDatumOffset setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public Double getOffsetToBaseReference() { return OffsetToBaseReference; }
        public PutBaseStandardReferenceDatumOffset setOffsetToBaseReference(Double value) { this.OffsetToBaseReference = value; return this; }
        private static Object responseType = StandardReferenceDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/{StandardIdentifier}", Verbs="DELETE")
    public static class DeleteStandardReferenceDatum extends StandardReferenceDatumRequestBase implements IReturnVoid
    {
        
    }

    @Route(Path="/locations/{LocationUniqueId}/referencepoints/", Verbs="GET")
    public static class GetLocationReferencePoints implements IReturn<ReferencePointResponse>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public GetLocationReferencePoints setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = ReferencePointResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/referencepoints", Verbs="POST")
    public static class PostReferencePoint extends ReferencePointBase implements IReturn<ReferencePoint>
    {
        /**
        * Periods of applicablity for this reference point. Must have at least one period
        */
        @ApiMember(DataType="Array<PostReferencePointPeriod>", Description="Periods of applicablity for this reference point. Must have at least one period", IsRequired=true)
        public ArrayList<PostReferencePointPeriod> ReferencePointPeriods = null;
        
        public ArrayList<PostReferencePointPeriod> getReferencePointPeriods() { return ReferencePointPeriods; }
        public PostReferencePoint setReferencePointPeriods(ArrayList<PostReferencePointPeriod> value) { this.ReferencePointPeriods = value; return this; }
        private static Object responseType = ReferencePoint.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/referencepoints/{ReferencePointUniqueId}", Verbs="DELETE")
    public static class DeleteReferencePoint implements IReturnVoid
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Unique ID of the reference point
        */
        @ApiMember(DataType="string", Description="Unique ID of the reference point", IsRequired=true, ParameterType="path")
        public String ReferencePointUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public DeleteReferencePoint setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getReferencePointUniqueId() { return ReferencePointUniqueId; }
        public DeleteReferencePoint setReferencePointUniqueId(String value) { this.ReferencePointUniqueId = value; return this; }
    }

    @Route(Path="/users/activedirectory", Verbs="POST")
    public static class PostActiveDirectoryUser extends UserBase implements IReturn<User>
    {
        /**
        * The user's domain credentials specified in User Principal Name format
        */
        @ApiMember(Description="The user's domain credentials specified in User Principal Name format", IsRequired=true)
        public String UserPrincipalName = null;
        
        public String getUserPrincipalName() { return UserPrincipalName; }
        public PostActiveDirectoryUser setUserPrincipalName(String value) { this.UserPrincipalName = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/activedirectory/{UniqueId}", Verbs="PUT")
    public static class PutActiveDirectoryUser extends PutUserBase implements IReturn<User>
    {
        /**
        * The user's domain credentials specified in User Principal Name format
        */
        @ApiMember(Description="The user's domain credentials specified in User Principal Name format", IsRequired=true)
        public String UserPrincipalName = null;
        
        public String getUserPrincipalName() { return UserPrincipalName; }
        public PutActiveDirectoryUser setUserPrincipalName(String value) { this.UserPrincipalName = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UniqueId}/activedirectory", Verbs="PUT")
    public static class PutActiveDirectoryAuth extends PutUserAuthBase implements IReturn<User>
    {
        /**
        * The user's domain credentials specified in User Principal Name format
        */
        @ApiMember(Description="The user's domain credentials specified in User Principal Name format", IsRequired=true)
        public String UserPrincipalName = null;
        
        public String getUserPrincipalName() { return UserPrincipalName; }
        public PutActiveDirectoryAuth setUserPrincipalName(String value) { this.UserPrincipalName = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/standarddatums", Verbs="GET")
    public static class GetStandardDatums implements IReturn<StandardDatumsResponse>
    {
        
        private static Object responseType = StandardDatumsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/standarddatums", Verbs="POST")
    public static class PostStandardDatum extends StandardDatumBase implements IReturn<StandardDatum>
    {
        
        private static Object responseType = StandardDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/standarddatums/{Identifier}", Verbs="DELETE")
    public static class DeleteStandardDatum implements IReturnVoid
    {
        /**
        * Identifier of the standard daturm
        */
        @ApiMember(Description="Identifier of the standard daturm", IsRequired=true, ParameterType="path")
        public String Identifier = null;
        
        public String getIdentifier() { return Identifier; }
        public DeleteStandardDatum setIdentifier(String value) { this.Identifier = value; return this; }
    }

    @Route(Path="/locationfolders/{LocationFolderUniqueId}", Verbs="GET")
    public static class GetLocationFolder implements IReturn<LocationFolder>
    {
        /**
        * Unique ID of the location folder
        */
        @ApiMember(DataType="string", Description="Unique ID of the location folder", IsRequired=true, ParameterType="path")
        public String LocationFolderUniqueId = null;
        
        public String getLocationFolderUniqueId() { return LocationFolderUniqueId; }
        public GetLocationFolder setLocationFolderUniqueId(String value) { this.LocationFolderUniqueId = value; return this; }
        private static Object responseType = LocationFolder.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationfolders", Verbs="GET")
    public static class GetLocationFolders implements IReturn<LocationFoldersResponse>
    {
        
        private static Object responseType = LocationFoldersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationfolders", Verbs="POST")
    public static class PostLocationFolder extends LocationFolderWriteBase implements IReturn<LocationFolder>
    {
        /**
        * Parent location folder path
        */
        @ApiMember(Description="Parent location folder path", IsRequired=true)
        public String ParentLocationFolderPath = null;
        
        public String getParentLocationFolderPath() { return ParentLocationFolderPath; }
        public PostLocationFolder setParentLocationFolderPath(String value) { this.ParentLocationFolderPath = value; return this; }
        private static Object responseType = LocationFolder.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationfolders/{LocationFolderUniqueId}", Verbs="PUT")
    public static class PutLocationFolder extends LocationFolderWriteBase implements IReturn<LocationFolder>
    {
        /**
        * Unique ID of the location folder
        */
        @ApiMember(DataType="string", Description="Unique ID of the location folder", IsRequired=true, ParameterType="path")
        public String LocationFolderUniqueId = null;
        
        public String getLocationFolderUniqueId() { return LocationFolderUniqueId; }
        public PutLocationFolder setLocationFolderUniqueId(String value) { this.LocationFolderUniqueId = value; return this; }
        private static Object responseType = LocationFolder.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationfolders/{LocationFolderUniqueId}", Verbs="DELETE")
    public static class DeleteLocationFolder implements IReturnVoid
    {
        /**
        * Unique ID of the location folder
        */
        @ApiMember(DataType="string", Description="Unique ID of the location folder", IsRequired=true, ParameterType="path")
        public String LocationFolderUniqueId = null;
        
        public String getLocationFolderUniqueId() { return LocationFolderUniqueId; }
        public DeleteLocationFolder setLocationFolderUniqueId(String value) { this.LocationFolderUniqueId = value; return this; }
    }

    @Route(Path="/openidconnect/relyingpartyconfiguration", Verbs="POST")
    public static class PostOpenIdConnectRelyingPartyConfiguration extends OpenIdConnectRelyingPartyConfigurationBase implements IReturn<OpenIdConnectRelyingPartyConfiguration>
    {
        /**
        * An https URI specifying the fully qualified host name of the issuer
        */
        @ApiMember(Description="An https URI specifying the fully qualified host name of the issuer", IsRequired=true)
        public String IssuerIdentifier = null;
        
        public String getIssuerIdentifier() { return IssuerIdentifier; }
        public PostOpenIdConnectRelyingPartyConfiguration setIssuerIdentifier(String value) { this.IssuerIdentifier = value; return this; }
        private static Object responseType = OpenIdConnectRelyingPartyConfiguration.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/openidconnect/relyingpartyconfiguration", Verbs="GET")
    public static class GetOpenIdConnectRelyingPartyConfiguration implements IReturn<OpenIdConnectRelyingPartyConfiguration>
    {
        
        private static Object responseType = OpenIdConnectRelyingPartyConfiguration.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/openidconnect/relyingpartyconfiguration", Verbs="PUT")
    public static class PutOpenIdConnectRelyingPartyConfiguration extends OpenIdConnectRelyingPartyConfigurationBase implements IReturn<OpenIdConnectRelyingPartyConfiguration>
    {
        
        private static Object responseType = OpenIdConnectRelyingPartyConfiguration.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/openidconnect/relyingpartyconfiguration", Verbs="DELETE")
    public static class DeleteOpenIdConnectRelyingPartyConfiguration implements IReturnVoid
    {
        
    }

    @Route(Path="/users/openidconnect", Verbs="POST")
    public static class PostOpenIdConnectUser extends UserBase implements IReturn<User>
    {
        /**
        * Unique identifier within the issuer for the end-user
        */
        @ApiMember(Description="Unique identifier within the issuer for the end-user", IsRequired=true)
        public String SubjectIdentifier = null;
        
        public String getSubjectIdentifier() { return SubjectIdentifier; }
        public PostOpenIdConnectUser setSubjectIdentifier(String value) { this.SubjectIdentifier = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/openidconnect/{UniqueId}", Verbs="PUT")
    public static class PutOpenIdConnectUser extends PutUserBase implements IReturn<User>
    {
        /**
        * Unique identifier within the issuer for the end-user
        */
        @ApiMember(Description="Unique identifier within the issuer for the end-user", IsRequired=true)
        public String SubjectIdentifier = null;
        
        public String getSubjectIdentifier() { return SubjectIdentifier; }
        public PutOpenIdConnectUser setSubjectIdentifier(String value) { this.SubjectIdentifier = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UniqueId}/openidconnect", Verbs="PUT")
    public static class PutOpenIdConnectAuth extends PutUserAuthBase implements IReturn<User>
    {
        /**
        * Unique identifier within the issuer for the end-user
        */
        @ApiMember(Description="Unique identifier within the issuer for the end-user", IsRequired=true)
        public String SubjectIdentifier = null;
        
        public String getSubjectIdentifier() { return SubjectIdentifier; }
        public PutOpenIdConnectAuth setSubjectIdentifier(String value) { this.SubjectIdentifier = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationtypes", Verbs="POST")
    public static class PostLocationType extends LocationTypeBase implements IReturn<LocationType>
    {
        
        private static Object responseType = LocationType.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationtypes", Verbs="GET")
    public static class GetLocationTypes implements IReturn<LocationTypesResponse>
    {
        
        private static Object responseType = LocationTypesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationtypes/{UniqueId}", Verbs="GET")
    public static class GetLocationType implements IReturn<LocationType>
    {
        /**
        * Unique ID of the location type
        */
        @ApiMember(DataType="string", Description="Unique ID of the location type", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetLocationType setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = LocationType.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationtypes/{UniqueId}", Verbs="PUT")
    public static class PutLocationType extends LocationTypeBase implements IReturn<LocationType>
    {
        /**
        * Unique ID of the location type
        */
        @ApiMember(DataType="string", Description="Unique ID of the location type", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutLocationType setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = LocationType.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationtypes/{UniqueId}", Verbs="DELETE")
    public static class DeleteLocationType implements IReturnVoid
    {
        /**
        * Unique ID of the location type
        */
        @ApiMember(DataType="string", Description="Unique ID of the location type", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteLocationType setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/parameters", Verbs="POST")
    public static class PostParameter extends ParameterBase implements IReturn<Parameter>
    {
        
        private static Object responseType = Parameter.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/parameters", Verbs="GET")
    public static class GetParameters implements IReturn<ParametersResponse>
    {
        
        private static Object responseType = ParametersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/parameters/{UniqueId}", Verbs="GET")
    public static class GetParameter implements IReturn<Parameter>
    {
        /**
        * Unique ID of the parameter
        */
        @ApiMember(DataType="string", Description="Unique ID of the parameter", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetParameter setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Parameter.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/parameters/{UniqueId}", Verbs="PUT")
    public static class PutParameter extends ParameterBase implements IReturn<Parameter>
    {
        /**
        * Unique ID of the parameter
        */
        @ApiMember(DataType="string", Description="Unique ID of the parameter", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutParameter setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Parameter.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/parameters/{UniqueId}", Verbs="DELETE")
    public static class DeleteParameter implements IReturnVoid
    {
        /**
        * Unique ID of the parameter
        */
        @ApiMember(DataType="string", Description="Unique ID of the parameter", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteParameter setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/unitgroups", Verbs="POST")
    public static class PostUnitGroup extends UnitGroupBase implements IReturn<UnitGroup>
    {
        /**
        * Group identifier, typically English name
        */
        @ApiMember(Description="Group identifier, typically English name", IsRequired=true)
        public String GroupIdentifier = null;

        /**
        * Localized name
        */
        @ApiMember(Description="Localized name", IsRequired=true)
        public String DisplayName = null;

        /**
        * Base unit identifier
        */
        @ApiMember(Description="Base unit identifier", IsRequired=true)
        public String BaseUnitIdentifier = null;

        /**
        * Localized short name or symbol
        */
        @ApiMember(Description="Localized short name or symbol", IsRequired=true)
        public String BaseUnitSymbol = null;

        /**
        * Localized singular name
        */
        @ApiMember(Description="Localized singular name", IsRequired=true)
        public String BaseUnitSingularName = null;

        /**
        * Localized plural name
        */
        @ApiMember(Description="Localized plural name", IsRequired=true)
        public String BaseUnitPluralName = null;
        
        public String getGroupIdentifier() { return GroupIdentifier; }
        public PostUnitGroup setGroupIdentifier(String value) { this.GroupIdentifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public PostUnitGroup setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getBaseUnitIdentifier() { return BaseUnitIdentifier; }
        public PostUnitGroup setBaseUnitIdentifier(String value) { this.BaseUnitIdentifier = value; return this; }
        public String getBaseUnitSymbol() { return BaseUnitSymbol; }
        public PostUnitGroup setBaseUnitSymbol(String value) { this.BaseUnitSymbol = value; return this; }
        public String getBaseUnitSingularName() { return BaseUnitSingularName; }
        public PostUnitGroup setBaseUnitSingularName(String value) { this.BaseUnitSingularName = value; return this; }
        public String getBaseUnitPluralName() { return BaseUnitPluralName; }
        public PostUnitGroup setBaseUnitPluralName(String value) { this.BaseUnitPluralName = value; return this; }
        private static Object responseType = UnitGroup.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/unitgroups", Verbs="GET")
    public static class GetUnitGroups implements IReturn<UnitGroupsResponse>
    {
        
        private static Object responseType = UnitGroupsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/unitgroups/{UniqueId}", Verbs="GET")
    public static class GetUnitGroup implements IReturn<UnitGroup>
    {
        /**
        * Unique ID of the unit group
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit group", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetUnitGroup setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = UnitGroup.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/unitgroups/{UniqueId}", Verbs="PUT")
    public static class PutUnitGroup extends UnitGroupBase implements IReturn<UnitGroup>
    {
        /**
        * Unique ID of the unit group
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit group", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Localized name
        */
        @ApiMember(Description="Localized name", IsRequired=true)
        public String DisplayName = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutUnitGroup setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public PutUnitGroup setDisplayName(String value) { this.DisplayName = value; return this; }
        private static Object responseType = UnitGroup.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/unitgroups/{UniqueId}", Verbs="DELETE")
    public static class DeleteUnitGroup implements IReturnVoid
    {
        /**
        * Unique ID of the unit group
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit group", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteUnitGroup setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/units", Verbs="POST")
    public static class PostUnit extends UnitBase implements IReturn<Unit>
    {
        /**
        * Group identifier
        */
        @ApiMember(Description="Group identifier", IsRequired=true)
        public String GroupIdentifier = null;

        /**
        * Unit identifier
        */
        @ApiMember(Description="Unit identifier", IsRequired=true)
        public String UnitIdentifier = null;
        
        public String getGroupIdentifier() { return GroupIdentifier; }
        public PostUnit setGroupIdentifier(String value) { this.GroupIdentifier = value; return this; }
        public String getUnitIdentifier() { return UnitIdentifier; }
        public PostUnit setUnitIdentifier(String value) { this.UnitIdentifier = value; return this; }
        private static Object responseType = Unit.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/units", Verbs="GET")
    public static class GetUnits implements IReturn<PopulatedUnitGroupsResponse>
    {
        
        private static Object responseType = PopulatedUnitGroupsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/unitgroups/{UniqueId}/units", Verbs="GET")
    public static class GetUnitsInGroup implements IReturn<UnitsResponse>
    {
        /**
        * Unique ID of the unit group
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit group", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetUnitsInGroup setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = UnitsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/units/{UniqueId}", Verbs="GET")
    public static class GetUnit implements IReturn<Unit>
    {
        /**
        * Unique ID of the unit
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetUnit setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Unit.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/units/{UniqueId}", Verbs="PUT")
    public static class PutUnit extends UnitBase implements IReturn<Unit>
    {
        /**
        * Unique ID of the unit
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutUnit setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Unit.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/units/{UniqueId}", Verbs="DELETE")
    public static class DeleteUnit implements IReturnVoid
    {
        /**
        * Unique ID of the unit
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteUnit setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/unitgroups/{UniqueId}/units", Verbs="DELETE")
    public static class DeleteUnits implements IReturnVoid
    {
        /**
        * Unique ID of the unit group
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit group", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteUnits setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/locations/{LocationUniqueId}/datumperiods", Verbs="GET")
    public static class GetLocationDatum implements IReturn<LocationDatumResponse>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public GetLocationDatum setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = LocationDatumResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/datumperiods", Verbs="POST")
    public static class PostLocationDatumPeriod extends LocationDatumPeriodBase implements IReturn<LocationDatumResponse>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Reference standard this period is related to, which must be a standard reference datum for the location
        */
        @ApiMember(Description="Reference standard this period is related to, which must be a standard reference datum for the location", IsRequired=true)
        public String StandardIdentifier = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostLocationDatumPeriod setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public PostLocationDatumPeriod setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        private static Object responseType = LocationDatumResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/datumperiods", Verbs="DELETE")
    public static class DeleteLocationDatum implements IReturnVoid
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public DeleteLocationDatum setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
    }

    @Route(Path="/grades", Verbs="POST")
    public static class PostQualityCode extends QualityCodeBase implements IReturn<Grade>
    {
        
        private static Object responseType = Grade.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/grades", Verbs="GET")
    public static class GetQualityCodes implements IReturn<GradesResponse>
    {
        
        private static Object responseType = GradesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/grades/{GradeCode}", Verbs="GET")
    public static class GetQualityCode implements IReturn<Grade>
    {
        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", IsRequired=true, ParameterType="path")
        public Integer GradeCode = null;
        
        public Integer getGradeCode() { return GradeCode; }
        public GetQualityCode setGradeCode(Integer value) { this.GradeCode = value; return this; }
        private static Object responseType = Grade.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/grades/{GradeCode}", Verbs="PUT")
    public static class PutQualityCode extends QualityCodeBase implements IReturn<Grade>
    {
        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", IsRequired=true, ParameterType="path")
        public Integer GradeCode = null;
        
        public Integer getGradeCode() { return GradeCode; }
        public PutQualityCode setGradeCode(Integer value) { this.GradeCode = value; return this; }
        private static Object responseType = Grade.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/grades/{GradeCode}", Verbs="DELETE")
    public static class DeleteQualityCode implements IReturnVoid
    {
        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", IsRequired=true, ParameterType="path")
        public Integer GradeCode = null;
        
        public Integer getGradeCode() { return GradeCode; }
        public DeleteQualityCode setGradeCode(Integer value) { this.GradeCode = value; return this; }
    }

    public static class FieldDataPluginsResponse
    {
        /**
        * The list of registered field data plug-ins
        */
        @ApiMember(DataType="Array<FieldDataPlugin>", Description="The list of registered field data plug-ins")
        public ArrayList<FieldDataPlugin> Results = null;
        
        public ArrayList<FieldDataPlugin> getResults() { return Results; }
        public FieldDataPluginsResponse setResults(ArrayList<FieldDataPlugin> value) { this.Results = value; return this; }
    }

    public static class FieldDataPlugin
    {
        /**
        * Unique ID of the field data plug-in
        */
        @ApiMember(DataType="string", Description="Unique ID of the field data plug-in")
        public String UniqueId = null;

        /**
        * Plug-in folder name
        */
        @ApiMember(Description="Plug-in folder name")
        public String PluginFolderName = null;

        /**
        * Assembly qualified type name
        */
        @ApiMember(Description="Assembly qualified type name")
        public String AssemblyQualifiedTypeName = null;

        /**
        * Plug-in priority; 1 has highest priority
        */
        @ApiMember(DataType="integer", Description="Plug-in priority; 1 has highest priority")
        public Integer PluginPriority = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;
        
        public String getUniqueId() { return UniqueId; }
        public FieldDataPlugin setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getPluginFolderName() { return PluginFolderName; }
        public FieldDataPlugin setPluginFolderName(String value) { this.PluginFolderName = value; return this; }
        public String getAssemblyQualifiedTypeName() { return AssemblyQualifiedTypeName; }
        public FieldDataPlugin setAssemblyQualifiedTypeName(String value) { this.AssemblyQualifiedTypeName = value; return this; }
        public Integer getPluginPriority() { return PluginPriority; }
        public FieldDataPlugin setPluginPriority(Integer value) { this.PluginPriority = value; return this; }
        public String getDescription() { return Description; }
        public FieldDataPlugin setDescription(String value) { this.Description = value; return this; }
    }

    public static class User
    {
        /**
        * Login name
        */
        @ApiMember(Description="Login name")
        public String LoginName = null;

        /**
        * First name
        */
        @ApiMember(Description="First name")
        public String FirstName = null;

        /**
        * Last name
        */
        @ApiMember(Description="Last name")
        public String LastName = null;

        /**
        * Email
        */
        @ApiMember(Description="Email")
        public String Email = null;

        /**
        * Authentication type
        */
        @ApiMember(Description="Authentication type")
        public String AuthenticationType = null;

        /**
        * True if the user is allowed to log into the system
        */
        @ApiMember(DataType="boolean", Description="True if the user is allowed to log into the system")
        public Boolean Active = null;

        /**
        * True if the user is required to exist in the system
        */
        @ApiMember(DataType="boolean", Description="True if the user is required to exist in the system")
        public Boolean System = null;

        /**
        * True if the user has the 'Can Configure System' right
        */
        @ApiMember(DataType="boolean", Description="True if the user has the 'Can Configure System' right")
        public Boolean CanConfigureSystem = null;

        /**
        * True if the user is licenced to launch the Rating Development toolbox
        */
        @ApiMember(DataType="boolean", Description="True if the user is licenced to launch the Rating Development toolbox")
        public Boolean CanLaunchRatingDevelopmentToolbox = null;

        /**
        * Unique ID of the user
        */
        @ApiMember(DataType="string", Description="Unique ID of the user")
        public String UniqueId = null;
        
        public String getLoginName() { return LoginName; }
        public User setLoginName(String value) { this.LoginName = value; return this; }
        public String getFirstName() { return FirstName; }
        public User setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public User setLastName(String value) { this.LastName = value; return this; }
        public String getEmail() { return Email; }
        public User setEmail(String value) { this.Email = value; return this; }
        public String getAuthenticationType() { return AuthenticationType; }
        public User setAuthenticationType(String value) { this.AuthenticationType = value; return this; }
        public Boolean isActive() { return Active; }
        public User setActive(Boolean value) { this.Active = value; return this; }
        public Boolean isSystem() { return System; }
        public User setSystem(Boolean value) { this.System = value; return this; }
        public Boolean isCanConfigureSystem() { return CanConfigureSystem; }
        public User setCanConfigureSystem(Boolean value) { this.CanConfigureSystem = value; return this; }
        public Boolean isCanLaunchRatingDevelopmentToolbox() { return CanLaunchRatingDevelopmentToolbox; }
        public User setCanLaunchRatingDevelopmentToolbox(Boolean value) { this.CanLaunchRatingDevelopmentToolbox = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public User setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    public static class TimeSeries
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series")
        public String UniqueId = null;

        /**
        * Label
        */
        @ApiMember(Description="Label")
        public String Label = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Location name
        */
        @ApiMember(Description="Location name")
        public String LocationName = null;

        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier")
        public String LocationIdentifier = null;

        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location")
        public String LocationUniqueId = null;

        /**
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

        /**
        * Time series type
        */
        @ApiMember(DataType="TimeSeriesType", Description="Time series type")
        public TimeSeriesType TimeSeriesType = null;

        /**
        * Parameter
        */
        @ApiMember(Description="Parameter")
        public String Parameter = null;

        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;

        /**
        * UTC offset
        */
        @ApiMember(DataType="Offset", Description="UTC offset")
        public Duration UtcOffset = null;

        /**
        * Computation identifier
        */
        @ApiMember(Description="Computation identifier")
        public String ComputationIdentifier = null;

        /**
        * Computation period identifier
        */
        @ApiMember(Description="Computation period identifier")
        public String ComputationPeriodIdentifier = null;

        /**
        * Last modified time
        */
        @ApiMember(DataType="Instant", Description="Last modified time")
        public Instant LastModifiedTime = null;

        /**
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;
        
        public String getIdentifier() { return Identifier; }
        public TimeSeries setIdentifier(String value) { this.Identifier = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public TimeSeries setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getLabel() { return Label; }
        public TimeSeries setLabel(String value) { this.Label = value; return this; }
        public String getComment() { return Comment; }
        public TimeSeries setComment(String value) { this.Comment = value; return this; }
        public String getDescription() { return Description; }
        public TimeSeries setDescription(String value) { this.Description = value; return this; }
        public Boolean isPublish() { return Publish; }
        public TimeSeries setPublish(Boolean value) { this.Publish = value; return this; }
        public String getLocationName() { return LocationName; }
        public TimeSeries setLocationName(String value) { this.LocationName = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public TimeSeries setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getLocationUniqueId() { return LocationUniqueId; }
        public TimeSeries setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public TimeSeries setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public TimeSeriesType getTimeSeriesType() { return TimeSeriesType; }
        public TimeSeries setTimeSeriesType(TimeSeriesType value) { this.TimeSeriesType = value; return this; }
        public String getParameter() { return Parameter; }
        public TimeSeries setParameter(String value) { this.Parameter = value; return this; }
        public String getUnit() { return Unit; }
        public TimeSeries setUnit(String value) { this.Unit = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public TimeSeries setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public TimeSeries setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public TimeSeries setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public Instant getLastModifiedTime() { return LastModifiedTime; }
        public TimeSeries setLastModifiedTime(Instant value) { this.LastModifiedTime = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public TimeSeries setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
    }

    public static class InterpolationTypesResponse
    {
        /**
        * The list of interpolation types
        */
        @ApiMember(DataType="Array<InterpolationTypeEntry>", Description="The list of interpolation types")
        public ArrayList<InterpolationTypeEntry> Results = null;
        
        public ArrayList<InterpolationTypeEntry> getResults() { return Results; }
        public InterpolationTypesResponse setResults(ArrayList<InterpolationTypeEntry> value) { this.Results = value; return this; }
    }

    public static class TimeSeriesResponse
    {
        /**
        * The list of time series
        */
        @ApiMember(DataType="Array<TimeSeries>", Description="The list of time series")
        public ArrayList<TimeSeries> Results = null;
        
        public ArrayList<TimeSeries> getResults() { return Results; }
        public TimeSeriesResponse setResults(ArrayList<TimeSeries> value) { this.Results = value; return this; }
    }

    public static class ExtendedAttributeFieldsResponse
    {
        /**
        * Results
        */
        @ApiMember(DataType="Array<ExtendedAttributeField>", Description="Results")
        public List<ExtendedAttributeField> Results = null;
        
        public List<ExtendedAttributeField> getResults() { return Results; }
        public ExtendedAttributeFieldsResponse setResults(List<ExtendedAttributeField> value) { this.Results = value; return this; }
    }

    public static class UsersResponse
    {
        /**
        * The list of users
        */
        @ApiMember(DataType="Array<User>", Description="The list of users")
        public ArrayList<User> Results = null;
        
        public ArrayList<User> getResults() { return Results; }
        public UsersResponse setResults(ArrayList<User> value) { this.Results = value; return this; }
    }

    public static class PublicKey
    {
        /**
        * RSA key size in bits
        */
        @ApiMember(DataType="integer", Description="RSA key size in bits")
        public Integer KeySize = null;

        /**
        * XML blob containing the RSA public key components
        */
        @ApiMember(Description="XML blob containing the RSA public key components")
        public String Xml = null;
        
        public Integer getKeySize() { return KeySize; }
        public PublicKey setKeySize(Integer value) { this.KeySize = value; return this; }
        public String getXml() { return Xml; }
        public PublicKey setXml(String value) { this.Xml = value; return this; }
    }

    public static class MonitoringMethod
    {
        /**
        * Method code
        */
        @ApiMember(Description="Method code")
        public String MethodCode = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Parameter id
        */
        @ApiMember(Description="Parameter id")
        public String ParameterId = null;

        /**
        * Unique ID of the parameter
        */
        @ApiMember(DataType="string", Description="Unique ID of the parameter")
        public String ParameterUniqueId = null;

        /**
        * Parameter identifier
        */
        @ApiMember(Description="Parameter identifier")
        public String ParameterIdentifier = null;

        /**
        * Rounding spec
        */
        @ApiMember(Description="Rounding spec")
        public String RoundingSpec = null;

        /**
        * True if the monitoring method is required by system
        */
        @ApiMember(DataType="boolean", Description="True if the monitoring method is required by system")
        public Boolean System = null;
        
        public String getMethodCode() { return MethodCode; }
        public MonitoringMethod setMethodCode(String value) { this.MethodCode = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public MonitoringMethod setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public MonitoringMethod setDescription(String value) { this.Description = value; return this; }
        public String getParameterId() { return ParameterId; }
        public MonitoringMethod setParameterId(String value) { this.ParameterId = value; return this; }
        public String getParameterUniqueId() { return ParameterUniqueId; }
        public MonitoringMethod setParameterUniqueId(String value) { this.ParameterUniqueId = value; return this; }
        public String getParameterIdentifier() { return ParameterIdentifier; }
        public MonitoringMethod setParameterIdentifier(String value) { this.ParameterIdentifier = value; return this; }
        public String getRoundingSpec() { return RoundingSpec; }
        public MonitoringMethod setRoundingSpec(String value) { this.RoundingSpec = value; return this; }
        public Boolean isSystem() { return System; }
        public MonitoringMethod setSystem(Boolean value) { this.System = value; return this; }
    }

    public static class MonitoringMethodsResponse
    {
        /**
        * The list of monitoring methods
        */
        @ApiMember(DataType="Array<MonitoringMethod>", Description="The list of monitoring methods")
        public ArrayList<MonitoringMethod> Results = null;
        
        public ArrayList<MonitoringMethod> getResults() { return Results; }
        public MonitoringMethodsResponse setResults(ArrayList<MonitoringMethod> value) { this.Results = value; return this; }
    }

    public static class Location
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location")
        public String UniqueId = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Location name
        */
        @ApiMember(Description="Location name")
        public String LocationName = null;

        /**
        * Location path
        */
        @ApiMember(Description="Location path")
        public String LocationPath = null;

        /**
        * Location type
        */
        @ApiMember(Description="Location type")
        public String LocationType = null;

        /**
        * External locations are created by data connectors.  Only extended attributes can be modified on an external location.
        */
        @ApiMember(DataType="boolean", Description="External locations are created by data connectors.  Only extended attributes can be modified on an external location.")
        public Boolean IsExternalLocation = null;

        /**
        * Longitude (WGS 84)
        */
        @ApiMember(DataType="double", Description="Longitude (WGS 84)")
        public Double Longitude = null;

        /**
        * Latitude (WGS 84)
        */
        @ApiMember(DataType="double", Description="Latitude (WGS 84)")
        public Double Latitude = null;

        /**
        * UTC offset
        */
        @ApiMember(DataType="Offset", Description="UTC offset")
        public Duration UtcOffset = null;

        /**
        * Last modified
        */
        @ApiMember(DataType="Instant", Description="Last modified")
        public Instant LastModified = null;

        /**
        * Elevation units
        */
        @ApiMember(Description="Elevation units")
        public String ElevationUnits = null;

        /**
        * Elevation
        */
        @ApiMember(DataType="double", Description="Elevation")
        public Double Elevation = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;
        
        public String getUniqueId() { return UniqueId; }
        public Location setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public Location setIdentifier(String value) { this.Identifier = value; return this; }
        public String getLocationName() { return LocationName; }
        public Location setLocationName(String value) { this.LocationName = value; return this; }
        public String getLocationPath() { return LocationPath; }
        public Location setLocationPath(String value) { this.LocationPath = value; return this; }
        public String getLocationType() { return LocationType; }
        public Location setLocationType(String value) { this.LocationType = value; return this; }
        public Boolean getIsExternalLocation() { return IsExternalLocation; }
        public Location setIsExternalLocation(Boolean value) { this.IsExternalLocation = value; return this; }
        public Double getLongitude() { return Longitude; }
        public Location setLongitude(Double value) { this.Longitude = value; return this; }
        public Double getLatitude() { return Latitude; }
        public Location setLatitude(Double value) { this.Latitude = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public Location setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public Instant getLastModified() { return LastModified; }
        public Location setLastModified(Instant value) { this.LastModified = value; return this; }
        public String getElevationUnits() { return ElevationUnits; }
        public Location setElevationUnits(String value) { this.ElevationUnits = value; return this; }
        public Double getElevation() { return Elevation; }
        public Location setElevation(Double value) { this.Elevation = value; return this; }
        public String getDescription() { return Description; }
        public Location setDescription(String value) { this.Description = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public Location setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
    }

    public static class StandardReferenceDatumsResponse
    {
        /**
        * The list of Standard Reference Datums
        */
        @ApiMember(DataType="Array<StandardReferenceDatum>", Description="The list of Standard Reference Datums")
        public ArrayList<StandardReferenceDatum> Results = null;
        
        public ArrayList<StandardReferenceDatum> getResults() { return Results; }
        public StandardReferenceDatumsResponse setResults(ArrayList<StandardReferenceDatum> value) { this.Results = value; return this; }
    }

    public static class StandardReferenceDatum
    {
        /**
        * Unique ID of the Location
        */
        @ApiMember(DataType="string", Description="Unique ID of the Location")
        public String LocationUniqueId = null;

        /**
        * StandardIdentifier
        */
        @ApiMember(Description="StandardIdentifier")
        public String StandardIdentifier = null;

        /**
        * True if the Standard Reference Datum is the Base Reference
        */
        @ApiMember(DataType="boolean", Description="True if the Standard Reference Datum is the Base Reference")
        public Boolean IsBaseReference = null;

        /**
        * Offset in relation to the Base Reference. Not used if IsBaseReference is set to true
        */
        @ApiMember(DataType="double", Description="Offset in relation to the Base Reference. Not used if IsBaseReference is set to true")
        public Double OffsetToBaseReference = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public StandardReferenceDatum setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public StandardReferenceDatum setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public Boolean getIsBaseReference() { return IsBaseReference; }
        public StandardReferenceDatum setIsBaseReference(Boolean value) { this.IsBaseReference = value; return this; }
        public Double getOffsetToBaseReference() { return OffsetToBaseReference; }
        public StandardReferenceDatum setOffsetToBaseReference(Double value) { this.OffsetToBaseReference = value; return this; }
    }

    public static class ReferencePointResponse
    {
        /**
        * The list of reference points
        */
        @ApiMember(DataType="Array<ReferencePoint>", Description="The list of reference points")
        public ArrayList<ReferencePoint> Results = null;
        
        public ArrayList<ReferencePoint> getResults() { return Results; }
        public ReferencePointResponse setResults(ArrayList<ReferencePoint> value) { this.Results = value; return this; }
    }

    public static class ReferencePoint extends ReferencePointBase
    {
        /**
        * Unique ID of the reference point
        */
        @ApiMember(DataType="string", Description="Unique ID of the reference point")
        public String UniqueId = null;

        /**
        * Periods of applicablity for this reference point
        */
        @ApiMember(DataType="Array<ReferencePointPeriod>", Description="Periods of applicablity for this reference point")
        public ArrayList<ReferencePointPeriod> ReferencePointPeriods = null;
        
        public String getUniqueId() { return UniqueId; }
        public ReferencePoint setUniqueId(String value) { this.UniqueId = value; return this; }
        public ArrayList<ReferencePointPeriod> getReferencePointPeriods() { return ReferencePointPeriods; }
        public ReferencePoint setReferencePointPeriods(ArrayList<ReferencePointPeriod> value) { this.ReferencePointPeriods = value; return this; }
    }

    public static class StandardDatumsResponse
    {
        /**
        * The list of standard datums
        */
        @ApiMember(DataType="Array<StandardDatum>", Description="The list of standard datums")
        public ArrayList<StandardDatum> Results = null;
        
        public ArrayList<StandardDatum> getResults() { return Results; }
        public StandardDatumsResponse setResults(ArrayList<StandardDatum> value) { this.Results = value; return this; }
    }

    public static class StandardDatum
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;
        
        public String getIdentifier() { return Identifier; }
        public StandardDatum setIdentifier(String value) { this.Identifier = value; return this; }
    }

    public static class LocationFolder
    {
        /**
        * Unique ID of the location folder
        */
        @ApiMember(DataType="string", Description="Unique ID of the location folder")
        public String UniqueId = null;

        /**
        * Location folder name
        */
        @ApiMember(Description="Location folder name")
        public String LocationFolderName = null;

        /**
        * Location folder description
        */
        @ApiMember(Description="Location folder description")
        public String LocationFolderDescription = null;

        /**
        * Location folder path
        */
        @ApiMember(Description="Location folder path")
        public String LocationFolderPath = null;

        /**
        * Unique ID of the parent location folder
        */
        @ApiMember(DataType="string", Description="Unique ID of the parent location folder")
        public String ParentLocationFolderUniqueId = null;

        /**
        * Parent location folder path
        */
        @ApiMember(Description="Parent location folder path")
        public String ParentLocationFolderPath = null;
        
        public String getUniqueId() { return UniqueId; }
        public LocationFolder setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getLocationFolderName() { return LocationFolderName; }
        public LocationFolder setLocationFolderName(String value) { this.LocationFolderName = value; return this; }
        public String getLocationFolderDescription() { return LocationFolderDescription; }
        public LocationFolder setLocationFolderDescription(String value) { this.LocationFolderDescription = value; return this; }
        public String getLocationFolderPath() { return LocationFolderPath; }
        public LocationFolder setLocationFolderPath(String value) { this.LocationFolderPath = value; return this; }
        public String getParentLocationFolderUniqueId() { return ParentLocationFolderUniqueId; }
        public LocationFolder setParentLocationFolderUniqueId(String value) { this.ParentLocationFolderUniqueId = value; return this; }
        public String getParentLocationFolderPath() { return ParentLocationFolderPath; }
        public LocationFolder setParentLocationFolderPath(String value) { this.ParentLocationFolderPath = value; return this; }
    }

    public static class LocationFoldersResponse
    {
        /**
        * The list of location folders
        */
        @ApiMember(DataType="Array<LocationFolder>", Description="The list of location folders")
        public ArrayList<LocationFolder> Results = null;
        
        public ArrayList<LocationFolder> getResults() { return Results; }
        public LocationFoldersResponse setResults(ArrayList<LocationFolder> value) { this.Results = value; return this; }
    }

    public static class OpenIdConnectRelyingPartyConfiguration
    {
        /**
        * Issuer identifier
        */
        @ApiMember(Description="Issuer identifier")
        public String IssuerIdentifier = null;

        /**
        * Client identifier
        */
        @ApiMember(Description="Client identifier")
        public String ClientIdentifier = null;

        /**
        * Redirect uri
        */
        @ApiMember(Description="Redirect uri")
        public String RedirectUri = null;

        /**
        * Scopes
        */
        @ApiMember(DataType="Array<string>", Description="Scopes")
        public ArrayList<String> Scopes = null;

        /**
        * Hosted domains
        */
        @ApiMember(DataType="Array<string>", Description="Hosted domains")
        public ArrayList<String> HostedDomains = null;
        
        public String getIssuerIdentifier() { return IssuerIdentifier; }
        public OpenIdConnectRelyingPartyConfiguration setIssuerIdentifier(String value) { this.IssuerIdentifier = value; return this; }
        public String getClientIdentifier() { return ClientIdentifier; }
        public OpenIdConnectRelyingPartyConfiguration setClientIdentifier(String value) { this.ClientIdentifier = value; return this; }
        public String getRedirectUri() { return RedirectUri; }
        public OpenIdConnectRelyingPartyConfiguration setRedirectUri(String value) { this.RedirectUri = value; return this; }
        public ArrayList<String> getScopes() { return Scopes; }
        public OpenIdConnectRelyingPartyConfiguration setScopes(ArrayList<String> value) { this.Scopes = value; return this; }
        public ArrayList<String> getHostedDomains() { return HostedDomains; }
        public OpenIdConnectRelyingPartyConfiguration setHostedDomains(ArrayList<String> value) { this.HostedDomains = value; return this; }
    }

    public static class LocationType
    {
        /**
        * Type name
        */
        @ApiMember(Description="Type name")
        public String TypeName = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Attribute table name
        */
        @ApiMember(Description="Attribute table name")
        public String AttributeTableName = null;

        /**
        * Unique ID of the location type
        */
        @ApiMember(DataType="string", Description="Unique ID of the location type")
        public String UniqueId = null;

        /**
        * Extended attribute field definitions for this location type
        */
        @ApiMember(DataType="Array<ExtendedAttributeField>", Description="Extended attribute field definitions for this location type")
        public List<ExtendedAttributeField> ExtendedAttributeFields = null;
        
        public String getTypeName() { return TypeName; }
        public LocationType setTypeName(String value) { this.TypeName = value; return this; }
        public String getDescription() { return Description; }
        public LocationType setDescription(String value) { this.Description = value; return this; }
        public String getAttributeTableName() { return AttributeTableName; }
        public LocationType setAttributeTableName(String value) { this.AttributeTableName = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public LocationType setUniqueId(String value) { this.UniqueId = value; return this; }
        public List<ExtendedAttributeField> getExtendedAttributeFields() { return ExtendedAttributeFields; }
        public LocationType setExtendedAttributeFields(List<ExtendedAttributeField> value) { this.ExtendedAttributeFields = value; return this; }
    }

    public static class LocationTypesResponse
    {
        /**
        * The list of location types
        */
        @ApiMember(DataType="Array<LocationType>", Description="The list of location types")
        public ArrayList<LocationType> Results = null;
        
        public ArrayList<LocationType> getResults() { return Results; }
        public LocationTypesResponse setResults(ArrayList<LocationType> value) { this.Results = value; return this; }
    }

    public static class Parameter
    {
        /**
        * Unique ID of the parameter
        */
        @ApiMember(DataType="string", Description="Unique ID of the parameter")
        public String UniqueId = null;

        /**
        * Parameter id
        */
        @ApiMember(Description="Parameter id")
        public String ParameterId = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Unit group identifier
        */
        @ApiMember(Description="Unit group identifier")
        public String UnitGroupIdentifier = null;

        /**
        * Unit identifier
        */
        @ApiMember(Description="Unit identifier")
        public String UnitIdentifier = null;

        /**
        * Min value
        */
        @ApiMember(DataType="double", Description="Min value")
        public Double MinValue = null;

        /**
        * Max value
        */
        @ApiMember(DataType="double", Description="Max value")
        public Double MaxValue = null;

        /**
        * Interpolation type
        */
        @ApiMember(DataType="InterpolationType", Description="Interpolation type")
        public InterpolationType InterpolationType = null;

        /**
        * Rounding spec
        */
        @ApiMember(Description="Rounding spec")
        public String RoundingSpec = null;

        /**
        * True if the parameter is required by the system
        */
        @ApiMember(DataType="boolean", Description="True if the parameter is required by the system")
        public Boolean System = null;
        
        public String getUniqueId() { return UniqueId; }
        public Parameter setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getParameterId() { return ParameterId; }
        public Parameter setParameterId(String value) { this.ParameterId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public Parameter setIdentifier(String value) { this.Identifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public Parameter setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getUnitGroupIdentifier() { return UnitGroupIdentifier; }
        public Parameter setUnitGroupIdentifier(String value) { this.UnitGroupIdentifier = value; return this; }
        public String getUnitIdentifier() { return UnitIdentifier; }
        public Parameter setUnitIdentifier(String value) { this.UnitIdentifier = value; return this; }
        public Double getMinValue() { return MinValue; }
        public Parameter setMinValue(Double value) { this.MinValue = value; return this; }
        public Double getMaxValue() { return MaxValue; }
        public Parameter setMaxValue(Double value) { this.MaxValue = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public Parameter setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getRoundingSpec() { return RoundingSpec; }
        public Parameter setRoundingSpec(String value) { this.RoundingSpec = value; return this; }
        public Boolean isSystem() { return System; }
        public Parameter setSystem(Boolean value) { this.System = value; return this; }
    }

    public static class ParametersResponse
    {
        /**
        * The list of parameters
        */
        @ApiMember(DataType="Array<Parameter>", Description="The list of parameters")
        public ArrayList<Parameter> Results = null;
        
        public ArrayList<Parameter> getResults() { return Results; }
        public ParametersResponse setResults(ArrayList<Parameter> value) { this.Results = value; return this; }
    }

    public static class UnitGroup
    {
        /**
        * Group identifier
        */
        @ApiMember(Description="Group identifier")
        public String GroupIdentifier = null;

        /**
        * Base unit identifier
        */
        @ApiMember(Description="Base unit identifier")
        public String BaseUnitIdentifier = null;

        /**
        * True if the unit group is required by the system
        */
        @ApiMember(DataType="boolean", Description="True if the unit group is required by the system")
        public Boolean IsSystem = null;

        /**
        * Current dimension
        */
        @ApiMember(DataType="integer", Description="Current dimension")
        public Integer CurrentDimension = null;

        /**
        * Intensity dimension
        */
        @ApiMember(DataType="integer", Description="Intensity dimension")
        public Integer IntensityDimension = null;

        /**
        * Length dimension
        */
        @ApiMember(DataType="integer", Description="Length dimension")
        public Integer LengthDimension = null;

        /**
        * Mass dimension
        */
        @ApiMember(DataType="integer", Description="Mass dimension")
        public Integer MassDimension = null;

        /**
        * Substance dimension
        */
        @ApiMember(DataType="integer", Description="Substance dimension")
        public Integer SubstanceDimension = null;

        /**
        * Temperature dimension
        */
        @ApiMember(DataType="integer", Description="Temperature dimension")
        public Integer TemperatureDimension = null;

        /**
        * Time dimension
        */
        @ApiMember(DataType="integer", Description="Time dimension")
        public Integer TimeDimension = null;

        /**
        * Unique ID of the unit group
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit group")
        public String UniqueId = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;
        
        public String getGroupIdentifier() { return GroupIdentifier; }
        public UnitGroup setGroupIdentifier(String value) { this.GroupIdentifier = value; return this; }
        public String getBaseUnitIdentifier() { return BaseUnitIdentifier; }
        public UnitGroup setBaseUnitIdentifier(String value) { this.BaseUnitIdentifier = value; return this; }
        public Boolean getIsSystem() { return IsSystem; }
        public UnitGroup setIsSystem(Boolean value) { this.IsSystem = value; return this; }
        public Integer getCurrentDimension() { return CurrentDimension; }
        public UnitGroup setCurrentDimension(Integer value) { this.CurrentDimension = value; return this; }
        public Integer getIntensityDimension() { return IntensityDimension; }
        public UnitGroup setIntensityDimension(Integer value) { this.IntensityDimension = value; return this; }
        public Integer getLengthDimension() { return LengthDimension; }
        public UnitGroup setLengthDimension(Integer value) { this.LengthDimension = value; return this; }
        public Integer getMassDimension() { return MassDimension; }
        public UnitGroup setMassDimension(Integer value) { this.MassDimension = value; return this; }
        public Integer getSubstanceDimension() { return SubstanceDimension; }
        public UnitGroup setSubstanceDimension(Integer value) { this.SubstanceDimension = value; return this; }
        public Integer getTemperatureDimension() { return TemperatureDimension; }
        public UnitGroup setTemperatureDimension(Integer value) { this.TemperatureDimension = value; return this; }
        public Integer getTimeDimension() { return TimeDimension; }
        public UnitGroup setTimeDimension(Integer value) { this.TimeDimension = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public UnitGroup setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public UnitGroup setDisplayName(String value) { this.DisplayName = value; return this; }
    }

    public static class UnitGroupsResponse
    {
        /**
        * The list of unit groups
        */
        @ApiMember(DataType="Array<UnitGroup>", Description="The list of unit groups")
        public ArrayList<UnitGroup> Results = null;
        
        public ArrayList<UnitGroup> getResults() { return Results; }
        public UnitGroupsResponse setResults(ArrayList<UnitGroup> value) { this.Results = value; return this; }
    }

    public static class Unit
    {
        /**
        * Unit identifier
        */
        @ApiMember(Description="Unit identifier")
        public String UnitIdentifier = null;

        /**
        * Group identifier
        */
        @ApiMember(Description="Group identifier")
        public String GroupIdentifier = null;

        /**
        * Base multiplier
        */
        @ApiMember(DataType="double", Description="Base multiplier")
        public Double BaseMultiplier = null;

        /**
        * Base offset
        */
        @ApiMember(DataType="double", Description="Base offset")
        public Double BaseOffset = null;

        /**
        * True if the unit is required by the system
        */
        @ApiMember(DataType="boolean", Description="True if the unit is required by the system")
        public Boolean IsSystem = null;

        /**
        * Unique ID of the unit
        */
        @ApiMember(DataType="string", Description="Unique ID of the unit")
        public String UniqueId = null;

        /**
        * Symbol
        */
        @ApiMember(Description="Symbol")
        public String Symbol = null;

        /**
        * Singular name
        */
        @ApiMember(Description="Singular name")
        public String SingularName = null;

        /**
        * Plural name
        */
        @ApiMember(Description="Plural name")
        public String PluralName = null;
        
        public String getUnitIdentifier() { return UnitIdentifier; }
        public Unit setUnitIdentifier(String value) { this.UnitIdentifier = value; return this; }
        public String getGroupIdentifier() { return GroupIdentifier; }
        public Unit setGroupIdentifier(String value) { this.GroupIdentifier = value; return this; }
        public Double getBaseMultiplier() { return BaseMultiplier; }
        public Unit setBaseMultiplier(Double value) { this.BaseMultiplier = value; return this; }
        public Double getBaseOffset() { return BaseOffset; }
        public Unit setBaseOffset(Double value) { this.BaseOffset = value; return this; }
        public Boolean getIsSystem() { return IsSystem; }
        public Unit setIsSystem(Boolean value) { this.IsSystem = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public Unit setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getSymbol() { return Symbol; }
        public Unit setSymbol(String value) { this.Symbol = value; return this; }
        public String getSingularName() { return SingularName; }
        public Unit setSingularName(String value) { this.SingularName = value; return this; }
        public String getPluralName() { return PluralName; }
        public Unit setPluralName(String value) { this.PluralName = value; return this; }
    }

    public static class PopulatedUnitGroupsResponse
    {
        /**
        * The list of unit groups
        */
        @ApiMember(DataType="Array<PopulatedUnitGroup>", Description="The list of unit groups")
        public ArrayList<PopulatedUnitGroup> Results = null;
        
        public ArrayList<PopulatedUnitGroup> getResults() { return Results; }
        public PopulatedUnitGroupsResponse setResults(ArrayList<PopulatedUnitGroup> value) { this.Results = value; return this; }
    }

    public static class UnitsResponse
    {
        /**
        * The list of units
        */
        @ApiMember(DataType="Array<Unit>", Description="The list of units")
        public ArrayList<Unit> Results = null;
        
        public ArrayList<Unit> getResults() { return Results; }
        public UnitsResponse setResults(ArrayList<Unit> value) { this.Results = value; return this; }
    }

    public static class LocationDatumResponse
    {
        /**
        * The list of assumed local datums for the location
        */
        @ApiMember(DataType="Array<LocationDatumPeriod>", Description="The list of assumed local datums for the location")
        public ArrayList<LocationDatumPeriod> Results = null;
        
        public ArrayList<LocationDatumPeriod> getResults() { return Results; }
        public LocationDatumResponse setResults(ArrayList<LocationDatumPeriod> value) { this.Results = value; return this; }
    }

    public static class Grade
    {
        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code")
        public Integer GradeCode = null;

        /**
        * Color
        */
        @ApiMember(Description="Color")
        public String Color = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * True if the grade is required by the system
        */
        @ApiMember(DataType="boolean", Description="True if the grade is required by the system")
        public Boolean IsSystem = null;
        
        public Integer getGradeCode() { return GradeCode; }
        public Grade setGradeCode(Integer value) { this.GradeCode = value; return this; }
        public String getColor() { return Color; }
        public Grade setColor(String value) { this.Color = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public Grade setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public Grade setDescription(String value) { this.Description = value; return this; }
        public Boolean getIsSystem() { return IsSystem; }
        public Grade setIsSystem(Boolean value) { this.IsSystem = value; return this; }
    }

    public static class GradesResponse
    {
        /**
        * The list of grades
        */
        @ApiMember(DataType="Array<Grade>", Description="The list of grades")
        public ArrayList<Grade> Results = null;
        
        public ArrayList<Grade> getResults() { return Results; }
        public GradesResponse setResults(ArrayList<Grade> value) { this.Results = value; return this; }
    }

    public static class UserBase
    {
        /**
        * Login name
        */
        @ApiMember(Description="Login name", IsRequired=true)
        public String LoginName = null;

        /**
        * Inactive users cannot log in and are not counted in licensing
        */
        @ApiMember(DataType="boolean", Description="Inactive users cannot log in and are not counted in licensing", IsRequired=true)
        public Boolean Active = null;

        /**
        * Allow user to run AQUARIUS Manager and edit system settings
        */
        @ApiMember(DataType="boolean", Description="Allow user to run AQUARIUS Manager and edit system settings", IsRequired=true)
        public Boolean CanConfigureSystem = null;

        /**
        * Allow user to launch the Rating Development Toolbox
        */
        @ApiMember(DataType="boolean", Description="Allow user to launch the Rating Development Toolbox", IsRequired=true)
        public Boolean CanLaunchRatingDevelopmentToolbox = null;

        /**
        * First name
        */
        @ApiMember(Description="First name")
        public String FirstName = null;

        /**
        * Last name
        */
        @ApiMember(Description="Last name")
        public String LastName = null;

        /**
        * Email
        */
        @ApiMember(Description="Email")
        public String Email = null;
        
        public String getLoginName() { return LoginName; }
        public UserBase setLoginName(String value) { this.LoginName = value; return this; }
        public Boolean isActive() { return Active; }
        public UserBase setActive(Boolean value) { this.Active = value; return this; }
        public Boolean isCanConfigureSystem() { return CanConfigureSystem; }
        public UserBase setCanConfigureSystem(Boolean value) { this.CanConfigureSystem = value; return this; }
        public Boolean isCanLaunchRatingDevelopmentToolbox() { return CanLaunchRatingDevelopmentToolbox; }
        public UserBase setCanLaunchRatingDevelopmentToolbox(Boolean value) { this.CanLaunchRatingDevelopmentToolbox = value; return this; }
        public String getFirstName() { return FirstName; }
        public UserBase setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public UserBase setLastName(String value) { this.LastName = value; return this; }
        public String getEmail() { return Email; }
        public UserBase setEmail(String value) { this.Email = value; return this; }
    }

    public static class PutUserBase extends UserBase
    {
        /**
        * Unique ID of the user
        */
        @ApiMember(DataType="string", Description="Unique ID of the user", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutUserBase setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    public static class PutUserAuthBase
    {
        /**
        * Unique ID of the user
        */
        @ApiMember(DataType="string", Description="Unique ID of the user", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutUserAuthBase setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    public static enum InterpolationType
    {
        InstantaneousValues(1),
        PrecedingConstant(2),
        PrecedingTotals(5),
        InstantaneousTotals(6),
        DiscreteValues(7),
        SucceedingConstant(8);

        private final int value;
        InterpolationType(final int intValue) { value = intValue; }
        public int getValue() { return value; }
    }

    public static class ExtendedAttributeValue
    {
        /**
        * Column identifier
        */
        @ApiMember(Description="Column identifier")
        public String ColumnIdentifier = null;

        /**
        * Value
        */
        @ApiMember(Description="Value")
        public String Value = null;
        
        public String getColumnIdentifier() { return ColumnIdentifier; }
        public ExtendedAttributeValue setColumnIdentifier(String value) { this.ColumnIdentifier = value; return this; }
        public String getValue() { return Value; }
        public ExtendedAttributeValue setValue(String value) { this.Value = value; return this; }
    }

    public static class TimeSeriesBase
    {
        /**
        * Unique ID of the location for which a time series is to be created
        */
        @ApiMember(DataType="string", Description="Unique ID of the location for which a time series is to be created", IsRequired=true)
        public String LocationUniqueId = null;

        /**
        * Label
        */
        @ApiMember(Description="Label", IsRequired=true)
        public String Label = null;

        /**
        * The ID of the parameter
        */
        @ApiMember(Description="The ID of the parameter", IsRequired=true)
        public String Parameter = null;

        /**
        * The ID of the unit
        */
        @ApiMember(Description="The ID of the unit", IsRequired=true)
        public String Unit = null;

        /**
        * Interpolation type
        */
        @ApiMember(DataType="InterpolationType", Description="Interpolation type", IsRequired=true)
        public InterpolationType InterpolationType = null;

        /**
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

        /**
        * ISO 8601 Duration Format
        */
        @ApiMember(DataType="Offset", Description="ISO 8601 Duration Format")
        public Duration UtcOffset = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;

        /**
        * Monitoring method code
        */
        @ApiMember(Description="Monitoring method code", IsRequired=true)
        public String Method = null;

        @ApiMember()
        public String ComputationIdentifier = null;

        /**
        * Computation period identifier
        */
        @ApiMember(Description="Computation period identifier")
        public String ComputationPeriodIdentifier = null;

        /**
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public TimeSeriesBase setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getLabel() { return Label; }
        public TimeSeriesBase setLabel(String value) { this.Label = value; return this; }
        public String getParameter() { return Parameter; }
        public TimeSeriesBase setParameter(String value) { this.Parameter = value; return this; }
        public String getUnit() { return Unit; }
        public TimeSeriesBase setUnit(String value) { this.Unit = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public TimeSeriesBase setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public TimeSeriesBase setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public TimeSeriesBase setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public Boolean isPublish() { return Publish; }
        public TimeSeriesBase setPublish(Boolean value) { this.Publish = value; return this; }
        public String getDescription() { return Description; }
        public TimeSeriesBase setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public TimeSeriesBase setComment(String value) { this.Comment = value; return this; }
        public String getMethod() { return Method; }
        public TimeSeriesBase setMethod(String value) { this.Method = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public TimeSeriesBase setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public TimeSeriesBase setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public TimeSeriesBase setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
    }

    public static enum TimeSeriesType
    {
        Unknown,
        ProcessorBasic,
        ProcessorDerived,
        External,
        Reflected;
    }

    public static enum NewValueLocationType
    {
        Unknown,
        Start,
        End;
    }

    public static class InterpolationTypeEntry
    {
        /**
        * Interpolation type
        */
        @ApiMember(Description="Interpolation type")
        public String InterpolationType = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Value
        */
        @ApiMember(DataType="integer", Description="Value")
        public Integer Value = null;
        
        public String getInterpolationType() { return InterpolationType; }
        public InterpolationTypeEntry setInterpolationType(String value) { this.InterpolationType = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public InterpolationTypeEntry setDisplayName(String value) { this.DisplayName = value; return this; }
        public Integer getValue() { return Value; }
        public InterpolationTypeEntry setValue(Integer value) { this.Value = value; return this; }
    }

    public static class ExtendedAttributeField
    {
        /**
        * Column identifier
        */
        @ApiMember(Description="Column identifier")
        public String ColumnIdentifier = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Field type
        */
        @ApiMember(DataType="ExtendedAttributeFieldType", Description="Field type")
        public ExtendedAttributeFieldType FieldType = null;

        /**
        * Can be empty
        */
        @ApiMember(DataType="boolean", Description="Can be empty")
        public Boolean CanBeEmpty = null;

        /**
        * Is read only
        */
        @ApiMember(DataType="boolean", Description="Is read only")
        public Boolean IsReadOnly = null;

        /**
        * Numeric precision
        */
        @ApiMember(DataType="short", Description="Numeric precision")
        public Short NumericPrecision = null;

        /**
        * Numeric scale
        */
        @ApiMember(DataType="short", Description="Numeric scale")
        public Short NumericScale = null;

        /**
        * Column size
        */
        @ApiMember(DataType="integer", Description="Column size")
        public Integer ColumnSize = null;

        /**
        * Value options
        */
        @ApiMember(DataType="Array<string>", Description="Value options")
        public List<String> ValueOptions = null;
        
        public String getColumnIdentifier() { return ColumnIdentifier; }
        public ExtendedAttributeField setColumnIdentifier(String value) { this.ColumnIdentifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public ExtendedAttributeField setDisplayName(String value) { this.DisplayName = value; return this; }
        public ExtendedAttributeFieldType getFieldType() { return FieldType; }
        public ExtendedAttributeField setFieldType(ExtendedAttributeFieldType value) { this.FieldType = value; return this; }
        public Boolean isCanBeEmpty() { return CanBeEmpty; }
        public ExtendedAttributeField setCanBeEmpty(Boolean value) { this.CanBeEmpty = value; return this; }
        public Boolean getIsReadOnly() { return IsReadOnly; }
        public ExtendedAttributeField setIsReadOnly(Boolean value) { this.IsReadOnly = value; return this; }
        public Short getNumericPrecision() { return NumericPrecision; }
        public ExtendedAttributeField setNumericPrecision(Short value) { this.NumericPrecision = value; return this; }
        public Short getNumericScale() { return NumericScale; }
        public ExtendedAttributeField setNumericScale(Short value) { this.NumericScale = value; return this; }
        public Integer getColumnSize() { return ColumnSize; }
        public ExtendedAttributeField setColumnSize(Integer value) { this.ColumnSize = value; return this; }
        public List<String> getValueOptions() { return ValueOptions; }
        public ExtendedAttributeField setValueOptions(List<String> value) { this.ValueOptions = value; return this; }
    }

    public static class MonitoringMethodWriteBase
    {
        /**
        * Method code
        */
        @ApiMember(Description="Method code", IsRequired=true)
        public String MethodCode = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name", IsRequired=true)
        public String DisplayName = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Unique ID of the method's parameter
        */
        @ApiMember(DataType="string", Description="Unique ID of the method's parameter", IsRequired=true)
        public String ParameterUniqueId = null;

        /**
        * Rounding spec
        */
        @ApiMember(Description="Rounding spec")
        public String RoundingSpec = null;
        
        public String getMethodCode() { return MethodCode; }
        public MonitoringMethodWriteBase setMethodCode(String value) { this.MethodCode = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public MonitoringMethodWriteBase setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public MonitoringMethodWriteBase setDescription(String value) { this.Description = value; return this; }
        public String getParameterUniqueId() { return ParameterUniqueId; }
        public MonitoringMethodWriteBase setParameterUniqueId(String value) { this.ParameterUniqueId = value; return this; }
        public String getRoundingSpec() { return RoundingSpec; }
        public MonitoringMethodWriteBase setRoundingSpec(String value) { this.RoundingSpec = value; return this; }
    }

    public static class LocationBase
    {
        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier", IsRequired=true)
        public String LocationIdentifier = null;

        /**
        * Location name
        */
        @ApiMember(Description="Location name", IsRequired=true)
        public String LocationName = null;

        /**
        * Location path
        */
        @ApiMember(Description="Location path", IsRequired=true)
        public String LocationPath = null;

        /**
        * Location type
        */
        @ApiMember(Description="Location type", IsRequired=true)
        public String LocationType = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Longitude (WGS 84)
        */
        @ApiMember(DataType="double", Description="Longitude (WGS 84)")
        public Double Longitude = null;

        /**
        * Latitude (WGS 84)
        */
        @ApiMember(DataType="double", Description="Latitude (WGS 84)")
        public Double Latitude = null;

        /**
        * Elevation units
        */
        @ApiMember(Description="Elevation units")
        public String ElevationUnits = null;

        /**
        * Elevation
        */
        @ApiMember(DataType="double", Description="Elevation")
        public Double Elevation = null;

        /**
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public LocationBase setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getLocationName() { return LocationName; }
        public LocationBase setLocationName(String value) { this.LocationName = value; return this; }
        public String getLocationPath() { return LocationPath; }
        public LocationBase setLocationPath(String value) { this.LocationPath = value; return this; }
        public String getLocationType() { return LocationType; }
        public LocationBase setLocationType(String value) { this.LocationType = value; return this; }
        public String getDescription() { return Description; }
        public LocationBase setDescription(String value) { this.Description = value; return this; }
        public Double getLongitude() { return Longitude; }
        public LocationBase setLongitude(Double value) { this.Longitude = value; return this; }
        public Double getLatitude() { return Latitude; }
        public LocationBase setLatitude(Double value) { this.Latitude = value; return this; }
        public String getElevationUnits() { return ElevationUnits; }
        public LocationBase setElevationUnits(String value) { this.ElevationUnits = value; return this; }
        public Double getElevation() { return Elevation; }
        public LocationBase setElevation(Double value) { this.Elevation = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public LocationBase setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
    }

    public static class StandardReferenceDatumRequestBase
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * StandardIdentifier
        */
        @ApiMember(Description="StandardIdentifier", IsRequired=true)
        public String StandardIdentifier = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public StandardReferenceDatumRequestBase setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public StandardReferenceDatumRequestBase setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
    }

    public static class PostReferencePointPeriod extends ReferencePointPeriodBase
    {
        
    }

    public static class ReferencePointBase
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Name
        */
        @ApiMember(Description="Name", IsRequired=true)
        public String Name = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Decommissioned date
        */
        @ApiMember(DataType="Instant", Description="Decommissioned date")
        public Instant DecommissionedDate = null;

        /**
        * Decommissioned reason
        */
        @ApiMember(Description="Decommissioned reason")
        public String DecommissionedReason = null;

        /**
        * Indicates this reference point has been the primary since the date herein; if null, the point is a regular reference point.
        */
        @ApiMember(DataType="Instant", Description="Indicates this reference point has been the primary since the date herein; if null, the point is a regular reference point.")
        public Instant PrimarySinceDate = null;

        /**
        * Longitude (WGS 84)
        */
        @ApiMember(DataType="double", Description="Longitude (WGS 84)")
        public Double Longitude = null;

        /**
        * Latitude (WGS 84)
        */
        @ApiMember(DataType="double", Description="Latitude (WGS 84)")
        public Double Latitude = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public ReferencePointBase setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getName() { return Name; }
        public ReferencePointBase setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public ReferencePointBase setDescription(String value) { this.Description = value; return this; }
        public Instant getDecommissionedDate() { return DecommissionedDate; }
        public ReferencePointBase setDecommissionedDate(Instant value) { this.DecommissionedDate = value; return this; }
        public String getDecommissionedReason() { return DecommissionedReason; }
        public ReferencePointBase setDecommissionedReason(String value) { this.DecommissionedReason = value; return this; }
        public Instant getPrimarySinceDate() { return PrimarySinceDate; }
        public ReferencePointBase setPrimarySinceDate(Instant value) { this.PrimarySinceDate = value; return this; }
        public Double getLongitude() { return Longitude; }
        public ReferencePointBase setLongitude(Double value) { this.Longitude = value; return this; }
        public Double getLatitude() { return Latitude; }
        public ReferencePointBase setLatitude(Double value) { this.Latitude = value; return this; }
    }

    public static class ReferencePointPeriod extends ReferencePointPeriodBase
    {
        /**
        * Unique ID of the reference point
        */
        @ApiMember(DataType="string", Description="Unique ID of the reference point")
        public String ReferencePointUniqueId = null;

        /**
        * Applied date
        */
        @ApiMember(DataType="Instant", Description="Applied date")
        public Instant AppliedTimeUtc = null;

        /**
        * Applied by user
        */
        @ApiMember(Description="Applied by user")
        public String AppliedByUser = null;
        
        public String getReferencePointUniqueId() { return ReferencePointUniqueId; }
        public ReferencePointPeriod setReferencePointUniqueId(String value) { this.ReferencePointUniqueId = value; return this; }
        public Instant getAppliedTimeUtc() { return AppliedTimeUtc; }
        public ReferencePointPeriod setAppliedTimeUtc(Instant value) { this.AppliedTimeUtc = value; return this; }
        public String getAppliedByUser() { return AppliedByUser; }
        public ReferencePointPeriod setAppliedByUser(String value) { this.AppliedByUser = value; return this; }
    }

    public static class StandardDatumBase
    {
        /**
        * Identifier of the standard datum
        */
        @ApiMember(Description="Identifier of the standard datum", IsRequired=true)
        public String Identifier = null;
        
        public String getIdentifier() { return Identifier; }
        public StandardDatumBase setIdentifier(String value) { this.Identifier = value; return this; }
    }

    public static class LocationFolderWriteBase
    {
        /**
        * Location folder name
        */
        @ApiMember(Description="Location folder name", IsRequired=true)
        public String LocationFolderName = null;

        /**
        * Location folder description
        */
        @ApiMember(Description="Location folder description")
        public String LocationFolderDescription = null;
        
        public String getLocationFolderName() { return LocationFolderName; }
        public LocationFolderWriteBase setLocationFolderName(String value) { this.LocationFolderName = value; return this; }
        public String getLocationFolderDescription() { return LocationFolderDescription; }
        public LocationFolderWriteBase setLocationFolderDescription(String value) { this.LocationFolderDescription = value; return this; }
    }

    public static class OpenIdConnectRelyingPartyConfigurationBase
    {
        /**
        * The Relying Party client identifier
        */
        @ApiMember(Description="The Relying Party client identifier", IsRequired=true)
        public String ClientIdentifier = null;

        /**
        * The Relying Party client secret
        */
        @ApiMember(Description="The Relying Party client secret", IsRequired=true)
        public String ClientSecret = null;

        /**
        * The redirection URI for the authorization response; e.g. http://my-domain/AQUARIUS/apps/v1/auth/openidconnect
        */
        @ApiMember(Description="The redirection URI for the authorization response; e.g. http://my-domain/AQUARIUS/apps/v1/auth/openidconnect", IsRequired=true)
        public String RedirectUri = null;

        /**
        * If not specified, defaults to openid
        */
        @ApiMember(DataType="IList", Description="If not specified, defaults to openid")
        public List<String> Scopes = null;

        /**
        * Hosted domains
        */
        @ApiMember(DataType="Array<string>", Description="Hosted domains")
        public List<String> HostedDomains = null;
        
        public String getClientIdentifier() { return ClientIdentifier; }
        public OpenIdConnectRelyingPartyConfigurationBase setClientIdentifier(String value) { this.ClientIdentifier = value; return this; }
        public String getClientSecret() { return ClientSecret; }
        public OpenIdConnectRelyingPartyConfigurationBase setClientSecret(String value) { this.ClientSecret = value; return this; }
        public String getRedirectUri() { return RedirectUri; }
        public OpenIdConnectRelyingPartyConfigurationBase setRedirectUri(String value) { this.RedirectUri = value; return this; }
        public List<String> getScopes() { return Scopes; }
        public OpenIdConnectRelyingPartyConfigurationBase setScopes(List<String> value) { this.Scopes = value; return this; }
        public List<String> getHostedDomains() { return HostedDomains; }
        public OpenIdConnectRelyingPartyConfigurationBase setHostedDomains(List<String> value) { this.HostedDomains = value; return this; }
    }

    public static class LocationTypeBase
    {
        /**
        * Type name
        */
        @ApiMember(Description="Type name", IsRequired=true)
        public String TypeName = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Name of database table used for extended attributes, omit if none
        */
        @ApiMember(Description="Name of database table used for extended attributes, omit if none")
        public String AttributeTableName = null;
        
        public String getTypeName() { return TypeName; }
        public LocationTypeBase setTypeName(String value) { this.TypeName = value; return this; }
        public String getDescription() { return Description; }
        public LocationTypeBase setDescription(String value) { this.Description = value; return this; }
        public String getAttributeTableName() { return AttributeTableName; }
        public LocationTypeBase setAttributeTableName(String value) { this.AttributeTableName = value; return this; }
    }

    public static class ParameterBase
    {
        /**
        * Parameter id
        */
        @ApiMember(Description="Parameter id", IsRequired=true)
        public String ParameterId = null;

        /**
        * The display ID of the parameter
        */
        @ApiMember(Description="The display ID of the parameter", IsRequired=true)
        public String Identifier = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name", IsRequired=true)
        public String DisplayName = null;

        /**
        * Unit group identifier
        */
        @ApiMember(Description="Unit group identifier", IsRequired=true)
        public String UnitGroupIdentifier = null;

        /**
        * Unit identifier
        */
        @ApiMember(Description="Unit identifier", IsRequired=true)
        public String UnitIdentifier = null;

        /**
        * Min value
        */
        @ApiMember(DataType="double", Description="Min value")
        public Double MinValue = null;

        /**
        * Max value
        */
        @ApiMember(DataType="double", Description="Max value")
        public Double MaxValue = null;

        /**
        * Interpolation type
        */
        @ApiMember(DataType="InterpolationType", Description="Interpolation type", IsRequired=true)
        public InterpolationType InterpolationType = null;

        /**
        * Rounding spec
        */
        @ApiMember(Description="Rounding spec")
        public String RoundingSpec = null;
        
        public String getParameterId() { return ParameterId; }
        public ParameterBase setParameterId(String value) { this.ParameterId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public ParameterBase setIdentifier(String value) { this.Identifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public ParameterBase setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getUnitGroupIdentifier() { return UnitGroupIdentifier; }
        public ParameterBase setUnitGroupIdentifier(String value) { this.UnitGroupIdentifier = value; return this; }
        public String getUnitIdentifier() { return UnitIdentifier; }
        public ParameterBase setUnitIdentifier(String value) { this.UnitIdentifier = value; return this; }
        public Double getMinValue() { return MinValue; }
        public ParameterBase setMinValue(Double value) { this.MinValue = value; return this; }
        public Double getMaxValue() { return MaxValue; }
        public ParameterBase setMaxValue(Double value) { this.MaxValue = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public ParameterBase setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getRoundingSpec() { return RoundingSpec; }
        public ParameterBase setRoundingSpec(String value) { this.RoundingSpec = value; return this; }
    }

    public static class UnitGroupBase
    {
        /**
        * Current dimension
        */
        @ApiMember(DataType="integer", Description="Current dimension")
        public Integer CurrentDimension = null;

        /**
        * Intensity dimension
        */
        @ApiMember(DataType="integer", Description="Intensity dimension")
        public Integer IntensityDimension = null;

        /**
        * Length dimension
        */
        @ApiMember(DataType="integer", Description="Length dimension")
        public Integer LengthDimension = null;

        /**
        * Mass dimension
        */
        @ApiMember(DataType="integer", Description="Mass dimension")
        public Integer MassDimension = null;

        /**
        * Substance dimension
        */
        @ApiMember(DataType="integer", Description="Substance dimension")
        public Integer SubstanceDimension = null;

        /**
        * Temperature dimension
        */
        @ApiMember(DataType="integer", Description="Temperature dimension")
        public Integer TemperatureDimension = null;

        /**
        * Time dimension
        */
        @ApiMember(DataType="integer", Description="Time dimension")
        public Integer TimeDimension = null;
        
        public Integer getCurrentDimension() { return CurrentDimension; }
        public UnitGroupBase setCurrentDimension(Integer value) { this.CurrentDimension = value; return this; }
        public Integer getIntensityDimension() { return IntensityDimension; }
        public UnitGroupBase setIntensityDimension(Integer value) { this.IntensityDimension = value; return this; }
        public Integer getLengthDimension() { return LengthDimension; }
        public UnitGroupBase setLengthDimension(Integer value) { this.LengthDimension = value; return this; }
        public Integer getMassDimension() { return MassDimension; }
        public UnitGroupBase setMassDimension(Integer value) { this.MassDimension = value; return this; }
        public Integer getSubstanceDimension() { return SubstanceDimension; }
        public UnitGroupBase setSubstanceDimension(Integer value) { this.SubstanceDimension = value; return this; }
        public Integer getTemperatureDimension() { return TemperatureDimension; }
        public UnitGroupBase setTemperatureDimension(Integer value) { this.TemperatureDimension = value; return this; }
        public Integer getTimeDimension() { return TimeDimension; }
        public UnitGroupBase setTimeDimension(Integer value) { this.TimeDimension = value; return this; }
    }

    public static class UnitBase
    {
        /**
        * Base multiplier
        */
        @ApiMember(DataType="double", Description="Base multiplier", IsRequired=true)
        public Double BaseMultiplier = null;

        /**
        * Base offset
        */
        @ApiMember(DataType="double", Description="Base offset", IsRequired=true)
        public Double BaseOffset = null;

        /**
        * Localized short name or symbol
        */
        @ApiMember(Description="Localized short name or symbol", IsRequired=true)
        public String Symbol = null;

        /**
        * Localized singular name
        */
        @ApiMember(Description="Localized singular name", IsRequired=true)
        public String SingularName = null;

        /**
        * Localized plural name
        */
        @ApiMember(Description="Localized plural name", IsRequired=true)
        public String PluralName = null;
        
        public Double getBaseMultiplier() { return BaseMultiplier; }
        public UnitBase setBaseMultiplier(Double value) { this.BaseMultiplier = value; return this; }
        public Double getBaseOffset() { return BaseOffset; }
        public UnitBase setBaseOffset(Double value) { this.BaseOffset = value; return this; }
        public String getSymbol() { return Symbol; }
        public UnitBase setSymbol(String value) { this.Symbol = value; return this; }
        public String getSingularName() { return SingularName; }
        public UnitBase setSingularName(String value) { this.SingularName = value; return this; }
        public String getPluralName() { return PluralName; }
        public UnitBase setPluralName(String value) { this.PluralName = value; return this; }
    }

    public static class PopulatedUnitGroup extends UnitGroup
    {
        /**
        * The list of units within the group
        */
        @ApiMember(DataType="Array<Unit>", Description="The list of units within the group")
        public List<Unit> Units = null;
        
        public List<Unit> getUnits() { return Units; }
        public PopulatedUnitGroup setUnits(List<Unit> value) { this.Units = value; return this; }
    }

    public static class LocationDatumPeriod extends LocationDatumPeriodBase
    {
        /**
        * Applied date
        */
        @ApiMember(DataType="Instant", Description="Applied date")
        public Instant AppliedTimeUtc = null;

        /**
        * Applied by user
        */
        @ApiMember(Description="Applied by user")
        public String AppliedByUser = null;

        /**
        * Reference standard this period is related to
        */
        @ApiMember(DataType="StandardReferenceDatum", Description="Reference standard this period is related to")
        public StandardReferenceDatum ReferenceStandard = null;
        
        public Instant getAppliedTimeUtc() { return AppliedTimeUtc; }
        public LocationDatumPeriod setAppliedTimeUtc(Instant value) { this.AppliedTimeUtc = value; return this; }
        public String getAppliedByUser() { return AppliedByUser; }
        public LocationDatumPeriod setAppliedByUser(String value) { this.AppliedByUser = value; return this; }
        public StandardReferenceDatum getReferenceStandard() { return ReferenceStandard; }
        public LocationDatumPeriod setReferenceStandard(StandardReferenceDatum value) { this.ReferenceStandard = value; return this; }
    }

    public static enum MeasurementDirection
    {
        Unknown,
        FromTopToBottom,
        FromBottomToTop;
    }

    public static class LocationDatumPeriodBase
    {
        /**
        * Time this period is valid from
        */
        @ApiMember(DataType="Instant", Description="Time this period is valid from", IsRequired=true)
        public Instant ValidFrom = null;

        /**
        * Elevation difference from the reference standard
        */
        @ApiMember(DataType="double", Description="Elevation difference from the reference standard", IsRequired=true)
        public Double Elevation = null;

        /**
        * Direction of positive elevations in relation to the reference standard
        */
        @ApiMember(DataType="MeasurementDirection", Description="Direction of positive elevations in relation to the reference standard", IsRequired=true)
        public MeasurementDirection MeasurementDirection = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;
        
        public Instant getValidFrom() { return ValidFrom; }
        public LocationDatumPeriodBase setValidFrom(Instant value) { this.ValidFrom = value; return this; }
        public Double getElevation() { return Elevation; }
        public LocationDatumPeriodBase setElevation(Double value) { this.Elevation = value; return this; }
        public MeasurementDirection getMeasurementDirection() { return MeasurementDirection; }
        public LocationDatumPeriodBase setMeasurementDirection(MeasurementDirection value) { this.MeasurementDirection = value; return this; }
        public String getComment() { return Comment; }
        public LocationDatumPeriodBase setComment(String value) { this.Comment = value; return this; }
    }

    public static class QualityCodeBase
    {
        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", IsRequired=true)
        public Integer GradeCode = null;

        /**
        * Color value in #RRGGBB hexadecimal
        */
        @ApiMember(Description="Color value in #RRGGBB hexadecimal", IsRequired=true)
        public String Color = null;

        /**
        * Localized short display name
        */
        @ApiMember(Description="Localized short display name", IsRequired=true)
        public String DisplayName = null;

        /**
        * Localized description
        */
        @ApiMember(Description="Localized description")
        public String Description = null;
        
        public Integer getGradeCode() { return GradeCode; }
        public QualityCodeBase setGradeCode(Integer value) { this.GradeCode = value; return this; }
        public String getColor() { return Color; }
        public QualityCodeBase setColor(String value) { this.Color = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public QualityCodeBase setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public QualityCodeBase setDescription(String value) { this.Description = value; return this; }
    }

    public static enum ExtendedAttributeFieldType
    {
        Boolean,
        DateTime,
        Number,
        String,
        StringOption;
    }

    public static class ReferencePointPeriodBase
    {
        /**
        * Time this period is valid from
        */
        @ApiMember(DataType="Instant", Description="Time this period is valid from", IsRequired=true)
        public Instant ValidFrom = null;

        /**
        * Standard identifier. Standard reference datum must already be defined in this location
        */
        @ApiMember(Description="Standard identifier. Standard reference datum must already be defined in this location")
        public String StandardIdentifier = null;

        /**
        * True if this period is measured against the location's local assumed datum instead of a standard datum
        */
        @ApiMember(DataType="boolean", Description="True if this period is measured against the location's local assumed datum instead of a standard datum", IsRequired=true)
        public Boolean IsMeasuredAgainstLocalAssumedDatum = null;

        /**
        * Elevation of the reference point relative to the standard or local assumed datum
        */
        @ApiMember(DataType="double", Description="Elevation of the reference point relative to the standard or local assumed datum", IsRequired=true)
        public Double Elevation = null;

        /**
        * Direction of positive elevations in relation to the reference point
        */
        @ApiMember(DataType="MeasurementDirection", Description="Direction of positive elevations in relation to the reference point", IsRequired=true)
        public MeasurementDirection MeasurementDirection = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;
        
        public Instant getValidFrom() { return ValidFrom; }
        public ReferencePointPeriodBase setValidFrom(Instant value) { this.ValidFrom = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public ReferencePointPeriodBase setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public Boolean getIsMeasuredAgainstLocalAssumedDatum() { return IsMeasuredAgainstLocalAssumedDatum; }
        public ReferencePointPeriodBase setIsMeasuredAgainstLocalAssumedDatum(Boolean value) { this.IsMeasuredAgainstLocalAssumedDatum = value; return this; }
        public Double getElevation() { return Elevation; }
        public ReferencePointPeriodBase setElevation(Double value) { this.Elevation = value; return this; }
        public MeasurementDirection getMeasurementDirection() { return MeasurementDirection; }
        public ReferencePointPeriodBase setMeasurementDirection(MeasurementDirection value) { this.MeasurementDirection = value; return this; }
        public String getComment() { return Comment; }
        public ReferencePointPeriodBase setComment(String value) { this.Comment = value; return this; }
    }

    public static class Current
    {
        public static final AquariusServerVersion Version = AquariusServerVersion.Create("17.4.79.0");
    }
}
