/* Options:
Instant: 2020-10-16 12:57:45
Version: 5.80
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: http://autoserver1/AQUARIUS/Provisioning/v1

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

    @Route(Path="/tags/{UniqueId}", Verbs="GET")
    public static class GetTag implements IReturn<Tag>
    {
        /**
        * Unique ID of the tag
        */
        @ApiMember(DataType="string", Description="Unique ID of the tag", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetTag setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Tag.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags", Verbs="GET")
    public static class GetTags implements IReturn<TagsResponse>
    {
        
        private static Object responseType = TagsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags", Verbs="POST")
    public static class PostTag extends TagRequestBase implements IReturn<Tag>
    {
        
        private static Object responseType = Tag.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/{UniqueId}", Verbs="PUT")
    public static class PutTag extends TagRequestBase implements IReturn<Tag>
    {
        /**
        * Unique ID of the tag
        */
        @ApiMember(DataType="string", Description="Unique ID of the tag", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutTag setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Tag.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/{UniqueId}", Verbs="DELETE")
    public static class DeleteTag implements IReturnVoid
    {
        /**
        * Unique ID of the tag
        */
        @ApiMember(DataType="string", Description="Unique ID of the tag", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteTag setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/approvallevels/{ApprovalLevel}", Verbs="PUT")
    public static class PutApprovalLevel extends ApprovalLevelBase implements IReturn<ApprovalLevel>
    {
        
        private static Object responseType = ApprovalLevel.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/approvallevels", Verbs="POST")
    public static class PostApprovalLevel extends ApprovalLevelBase implements IReturn<ApprovalLevel>
    {
        
        private static Object responseType = ApprovalLevel.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/approvallevels", Verbs="GET")
    public static class GetApprovalLevels implements IReturn<ApprovalLevelsResponse>
    {
        
        private static Object responseType = ApprovalLevelsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/approvallevels/{ApprovalLevel}", Verbs="GET")
    public static class GetApprovalLevel implements IReturn<ApprovalLevel>
    {
        /**
        * Approval level
        */
        @ApiMember(DataType="long integer", Description="Approval level", IsRequired=true, ParameterType="path")
        public Long ApprovalLevel = null;
        
        public Long getApprovalLevel() { return ApprovalLevel; }
        public GetApprovalLevel setApprovalLevel(Long value) { this.ApprovalLevel = value; return this; }
        private static Object responseType = ApprovalLevel.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/approvallevels/{ApprovalLevel}", Verbs="DELETE")
    public static class DeleteApprovalLevel implements IReturnVoid
    {
        /**
        * Approval level
        */
        @ApiMember(DataType="long integer", Description="Approval level", IsRequired=true, ParameterType="path")
        public Long ApprovalLevel = null;
        
        public Long getApprovalLevel() { return ApprovalLevel; }
        public DeleteApprovalLevel setApprovalLevel(Long value) { this.ApprovalLevel = value; return this; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/calculated", Verbs="POST")
    public static class PostCalculatedDerivedTimeSeries implements IReturn<TimeSeries>, IPostTimeSeriesRequest
    {
        /**
        * Unique ID of the location for which a time series is to be created
        */
        @ApiMember(DataType="string", Description="Unique ID of the location for which a time series is to be created", IsRequired=true, ParameterType="path")
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
        * Publish. If set true, will enforce that Location Publish is also true
        */
        @ApiMember(DataType="boolean", Description="Publish. If set true, will enforce that Location Publish is also true")
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
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;

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
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostCalculatedDerivedTimeSeries setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getLabel() { return Label; }
        public PostCalculatedDerivedTimeSeries setLabel(String value) { this.Label = value; return this; }
        public String getParameter() { return Parameter; }
        public PostCalculatedDerivedTimeSeries setParameter(String value) { this.Parameter = value; return this; }
        public String getUnit() { return Unit; }
        public PostCalculatedDerivedTimeSeries setUnit(String value) { this.Unit = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public PostCalculatedDerivedTimeSeries setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public PostCalculatedDerivedTimeSeries setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public PostCalculatedDerivedTimeSeries setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public Boolean isPublish() { return Publish; }
        public PostCalculatedDerivedTimeSeries setPublish(Boolean value) { this.Publish = value; return this; }
        public String getDescription() { return Description; }
        public PostCalculatedDerivedTimeSeries setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public PostCalculatedDerivedTimeSeries setComment(String value) { this.Comment = value; return this; }
        public String getMethod() { return Method; }
        public PostCalculatedDerivedTimeSeries setMethod(String value) { this.Method = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public PostCalculatedDerivedTimeSeries setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public PostCalculatedDerivedTimeSeries setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public PostCalculatedDerivedTimeSeries setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
        public ArrayList<String> getTimeSeriesUniqueIds() { return TimeSeriesUniqueIds; }
        public PostCalculatedDerivedTimeSeries setTimeSeriesUniqueIds(ArrayList<String> value) { this.TimeSeriesUniqueIds = value; return this; }
        public String getFormula() { return Formula; }
        public PostCalculatedDerivedTimeSeries setFormula(String value) { this.Formula = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/basic", Verbs="POST")
    public static class PostBasicTimeSeries implements IReturn<TimeSeries>, IPostTimeSeriesRequest
    {
        /**
        * Unique ID of the location for which a time series is to be created
        */
        @ApiMember(DataType="string", Description="Unique ID of the location for which a time series is to be created", IsRequired=true, ParameterType="path")
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
        * Publish. If set true, will enforce that Location Publish is also true
        */
        @ApiMember(DataType="boolean", Description="Publish. If set true, will enforce that Location Publish is also true")
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
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;

        /**
        * ISO 8601 Duration Format
        */
        @ApiMember(DataType="Duration", Description="ISO 8601 Duration Format", IsRequired=true)
        public Duration GapTolerance = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostBasicTimeSeries setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getLabel() { return Label; }
        public PostBasicTimeSeries setLabel(String value) { this.Label = value; return this; }
        public String getParameter() { return Parameter; }
        public PostBasicTimeSeries setParameter(String value) { this.Parameter = value; return this; }
        public String getUnit() { return Unit; }
        public PostBasicTimeSeries setUnit(String value) { this.Unit = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public PostBasicTimeSeries setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public PostBasicTimeSeries setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public PostBasicTimeSeries setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public Boolean isPublish() { return Publish; }
        public PostBasicTimeSeries setPublish(Boolean value) { this.Publish = value; return this; }
        public String getDescription() { return Description; }
        public PostBasicTimeSeries setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public PostBasicTimeSeries setComment(String value) { this.Comment = value; return this; }
        public String getMethod() { return Method; }
        public PostBasicTimeSeries setMethod(String value) { this.Method = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public PostBasicTimeSeries setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public PostBasicTimeSeries setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public PostBasicTimeSeries setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
        public Duration getGapTolerance() { return GapTolerance; }
        public PostBasicTimeSeries setGapTolerance(Duration value) { this.GapTolerance = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/reflected", Verbs="POST")
    public static class PostReflectedTimeSeries implements IReturn<TimeSeries>, IPostTimeSeriesRequest
    {
        /**
        * Unique ID of the location for which a time series is to be created
        */
        @ApiMember(DataType="string", Description="Unique ID of the location for which a time series is to be created", IsRequired=true, ParameterType="path")
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
        * Publish. If set true, will enforce that Location Publish is also true
        */
        @ApiMember(DataType="boolean", Description="Publish. If set true, will enforce that Location Publish is also true")
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
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;

        /**
        * ISO 8601 Duration Format
        */
        @ApiMember(DataType="Duration", Description="ISO 8601 Duration Format", IsRequired=true)
        public Duration GapTolerance = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostReflectedTimeSeries setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getLabel() { return Label; }
        public PostReflectedTimeSeries setLabel(String value) { this.Label = value; return this; }
        public String getParameter() { return Parameter; }
        public PostReflectedTimeSeries setParameter(String value) { this.Parameter = value; return this; }
        public String getUnit() { return Unit; }
        public PostReflectedTimeSeries setUnit(String value) { this.Unit = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public PostReflectedTimeSeries setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public PostReflectedTimeSeries setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public PostReflectedTimeSeries setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public Boolean isPublish() { return Publish; }
        public PostReflectedTimeSeries setPublish(Boolean value) { this.Publish = value; return this; }
        public String getDescription() { return Description; }
        public PostReflectedTimeSeries setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public PostReflectedTimeSeries setComment(String value) { this.Comment = value; return this; }
        public String getMethod() { return Method; }
        public PostReflectedTimeSeries setMethod(String value) { this.Method = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public PostReflectedTimeSeries setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public PostReflectedTimeSeries setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public PostReflectedTimeSeries setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
        public Duration getGapTolerance() { return GapTolerance; }
        public PostReflectedTimeSeries setGapTolerance(Duration value) { this.GapTolerance = value; return this; }
        private static Object responseType = TimeSeries.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/timeseries/statistical", Verbs="POST")
    public static class PostStatisticalDerivedTimeSeries implements IReturn<TimeSeries>, IPostTimeSeriesRequest
    {
        /**
        * Unique ID of the location for which a time series is to be created
        */
        @ApiMember(DataType="string", Description="Unique ID of the location for which a time series is to be created", IsRequired=true, ParameterType="path")
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
        * Publish. If set true, will enforce that Location Publish is also true
        */
        @ApiMember(DataType="boolean", Description="Publish. If set true, will enforce that Location Publish is also true")
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

        /**
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;

        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Computation identifier
        */
        @ApiMember(Description="Computation identifier", IsRequired=true)
        public String ComputationIdentifier = null;

        /**
        * Computation period identifier
        */
        @ApiMember(Description="Computation period identifier", IsRequired=true)
        public String ComputationPeriodIdentifier = null;

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
        @ApiMember(DataType="integer", Description="Time Step Count. Must be included for \'Statistic\' derived time-series.")
        public Integer TimeStepCount = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostStatisticalDerivedTimeSeries setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getLabel() { return Label; }
        public PostStatisticalDerivedTimeSeries setLabel(String value) { this.Label = value; return this; }
        public String getParameter() { return Parameter; }
        public PostStatisticalDerivedTimeSeries setParameter(String value) { this.Parameter = value; return this; }
        public String getUnit() { return Unit; }
        public PostStatisticalDerivedTimeSeries setUnit(String value) { this.Unit = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public PostStatisticalDerivedTimeSeries setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public PostStatisticalDerivedTimeSeries setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public PostStatisticalDerivedTimeSeries setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public Boolean isPublish() { return Publish; }
        public PostStatisticalDerivedTimeSeries setPublish(Boolean value) { this.Publish = value; return this; }
        public String getDescription() { return Description; }
        public PostStatisticalDerivedTimeSeries setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public PostStatisticalDerivedTimeSeries setComment(String value) { this.Comment = value; return this; }
        public String getMethod() { return Method; }
        public PostStatisticalDerivedTimeSeries setMethod(String value) { this.Method = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public PostStatisticalDerivedTimeSeries setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public PostStatisticalDerivedTimeSeries setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public PostStatisticalDerivedTimeSeries setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public PostStatisticalDerivedTimeSeries setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
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

    @Route(Path="/locations/{LocationUniqueId}/timeseries/datumconverted", Verbs="POST")
    public static class PostDatumConvertedTimeSeries implements IReturn<TimeSeries>, IPostTimeSeriesRequest
    {
        /**
        * Unique ID of the location for which a time series is to be created
        */
        @ApiMember(DataType="string", Description="Unique ID of the location for which a time series is to be created", IsRequired=true, ParameterType="path")
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
        * Publish. If set true, will enforce that Location Publish is also true
        */
        @ApiMember(DataType="boolean", Description="Publish. If set true, will enforce that Location Publish is also true")
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
        * Extended attribute values
        */
        @ApiMember(DataType="Array<ExtendedAttributeValue>", Description="Extended attribute values")
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;

        /**
        * Unique ID of the time-series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time-series", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Unique ID of the source reference point. Required if SourceIsLocalAssumedDatum is false; otherwise must not be specified
        */
        @ApiMember(DataType="string", Description="Unique ID of the source reference point. Required if SourceIsLocalAssumedDatum is false; otherwise must not be specified")
        public String SourceReferencePointUniqueId = null;

        /**
        * Source is Local Assumed Datum
        */
        @ApiMember(DataType="boolean", Description="Source is Local Assumed Datum")
        public Boolean SourceIsLocalAssumedDatum = null;

        /**
        * Identifier of the target reference datum. Required if TargetIsLocalAssumedDatum is false; otherwise must not be specified
        */
        @ApiMember(Description="Identifier of the target reference datum. Required if TargetIsLocalAssumedDatum is false; otherwise must not be specified")
        public String TargetStandardReferenceDatumIdentifier = null;

        /**
        * Target is Local Assumed Datum
        */
        @ApiMember(DataType="boolean", Description="Target is Local Assumed Datum")
        public Boolean TargetIsLocalAssumedDatum = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostDatumConvertedTimeSeries setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getLabel() { return Label; }
        public PostDatumConvertedTimeSeries setLabel(String value) { this.Label = value; return this; }
        public String getParameter() { return Parameter; }
        public PostDatumConvertedTimeSeries setParameter(String value) { this.Parameter = value; return this; }
        public String getUnit() { return Unit; }
        public PostDatumConvertedTimeSeries setUnit(String value) { this.Unit = value; return this; }
        public InterpolationType getInterpolationType() { return InterpolationType; }
        public PostDatumConvertedTimeSeries setInterpolationType(InterpolationType value) { this.InterpolationType = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public PostDatumConvertedTimeSeries setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public Duration getUtcOffset() { return UtcOffset; }
        public PostDatumConvertedTimeSeries setUtcOffset(Duration value) { this.UtcOffset = value; return this; }
        public Boolean isPublish() { return Publish; }
        public PostDatumConvertedTimeSeries setPublish(Boolean value) { this.Publish = value; return this; }
        public String getDescription() { return Description; }
        public PostDatumConvertedTimeSeries setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public PostDatumConvertedTimeSeries setComment(String value) { this.Comment = value; return this; }
        public String getMethod() { return Method; }
        public PostDatumConvertedTimeSeries setMethod(String value) { this.Method = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public PostDatumConvertedTimeSeries setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public PostDatumConvertedTimeSeries setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public PostDatumConvertedTimeSeries setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public PostDatumConvertedTimeSeries setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public String getSourceReferencePointUniqueId() { return SourceReferencePointUniqueId; }
        public PostDatumConvertedTimeSeries setSourceReferencePointUniqueId(String value) { this.SourceReferencePointUniqueId = value; return this; }
        public Boolean isSourceIsLocalAssumedDatum() { return SourceIsLocalAssumedDatum; }
        public PostDatumConvertedTimeSeries setSourceIsLocalAssumedDatum(Boolean value) { this.SourceIsLocalAssumedDatum = value; return this; }
        public String getTargetStandardReferenceDatumIdentifier() { return TargetStandardReferenceDatumIdentifier; }
        public PostDatumConvertedTimeSeries setTargetStandardReferenceDatumIdentifier(String value) { this.TargetStandardReferenceDatumIdentifier = value; return this; }
        public Boolean isTargetIsLocalAssumedDatum() { return TargetIsLocalAssumedDatum; }
        public PostDatumConvertedTimeSeries setTargetIsLocalAssumedDatum(Boolean value) { this.TargetIsLocalAssumedDatum = value; return this; }
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
        * Publish. If set true, will force Location Publish true
        */
        @ApiMember(DataType="boolean", Description="Publish. If set true, will force Location Publish true")
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

    @Route(Path="/users/activedirectory/{UniqueId}", Verbs="GET")
    public static class GetActiveDirectoryUser implements IReturn<ActiveDirectoryUser>
    {
        /**
        * Unique ID of the user
        */
        @ApiMember(DataType="string", Description="Unique ID of the user", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetActiveDirectoryUser setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = ActiveDirectoryUser.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/activedirectory", Verbs="POST")
    public static class PostActiveDirectoryUser extends UserBase implements IReturn<User>
    {
        /**
        * The user's domain credentials specified in User Principal Name format
        */
        @ApiMember(Description="The user\'s domain credentials specified in User Principal Name format")
        public String UserPrincipalName = null;

        /**
        * The domain user's security identifier (SID)
        */
        @ApiMember(Description="The domain user\'s security identifier (SID)")
        public String ActiveDirectorySid = null;
        
        public String getUserPrincipalName() { return UserPrincipalName; }
        public PostActiveDirectoryUser setUserPrincipalName(String value) { this.UserPrincipalName = value; return this; }
        public String getActiveDirectorySid() { return ActiveDirectorySid; }
        public PostActiveDirectoryUser setActiveDirectorySid(String value) { this.ActiveDirectorySid = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/activedirectory/{UniqueId}", Verbs="PUT")
    public static class PutActiveDirectoryUser extends PutUserBase implements IReturn<User>
    {
        /**
        * The user's domain credentials specified in User Principal Name format
        */
        @ApiMember(Description="The user\'s domain credentials specified in User Principal Name format")
        public String UserPrincipalName = null;

        /**
        * The domain user's security identifier (SID)
        */
        @ApiMember(Description="The domain user\'s security identifier (SID)")
        public String ActiveDirectorySid = null;
        
        public String getUserPrincipalName() { return UserPrincipalName; }
        public PutActiveDirectoryUser setUserPrincipalName(String value) { this.UserPrincipalName = value; return this; }
        public String getActiveDirectorySid() { return ActiveDirectorySid; }
        public PutActiveDirectoryUser setActiveDirectorySid(String value) { this.ActiveDirectorySid = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UniqueId}/activedirectory", Verbs="PUT")
    public static class PutActiveDirectoryAuth extends PutUserAuthBase implements IReturn<User>
    {
        /**
        * The user's domain credentials specified in User Principal Name format
        */
        @ApiMember(Description="The user\'s domain credentials specified in User Principal Name format")
        public String UserPrincipalName = null;

        /**
        * The domain user's security identifier (SID)
        */
        @ApiMember(Description="The domain user\'s security identifier (SID)")
        public String ActiveDirectorySid = null;
        
        public String getUserPrincipalName() { return UserPrincipalName; }
        public PutActiveDirectoryAuth setUserPrincipalName(String value) { this.UserPrincipalName = value; return this; }
        public String getActiveDirectorySid() { return ActiveDirectorySid; }
        public PutActiveDirectoryAuth setActiveDirectorySid(String value) { this.ActiveDirectorySid = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/qualifiergroups", Verbs="POST")
    public static class PostQualifierGroup implements IReturn<QualifierGroupResponse>
    {
        /**
        * Qualifier group identifier
        */
        @ApiMember(Description="Qualifier group identifier", IsRequired=true)
        public String Identifier = null;
        
        public String getIdentifier() { return Identifier; }
        public PostQualifierGroup setIdentifier(String value) { this.Identifier = value; return this; }
        private static Object responseType = QualifierGroupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/qualifiergroups", Verbs="GET")
    public static class GetQualifierGroups implements IReturn<QualifierGroupsResponse>
    {
        
        private static Object responseType = QualifierGroupsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/qualifiergroups/{UniqueId}", Verbs="DELETE")
    public static class DeleteQualifierGroup implements IReturnVoid
    {
        /**
        * Unique ID of the qualifier group
        */
        @ApiMember(Description="Unique ID of the qualifier group", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteQualifierGroup setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/qualifiergroups/{UniqueId}", Verbs="PUT")
    public static class PutQualifierGroup implements IReturn<QualifierGroupResponse>
    {
        /**
        * Unique ID of the qualifier group
        */
        @ApiMember(DataType="string", Description="Unique ID of the qualifier group", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier", IsRequired=true)
        public String Identifier = null;

        /**
        * Qualifier codes contained in this group 
        */
        @ApiMember(DataType="Array<string>", Description="Qualifier codes contained in this group ", IsRequired=true)
        public ArrayList<String> QualifierCodeList = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutQualifierGroup setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public PutQualifierGroup setIdentifier(String value) { this.Identifier = value; return this; }
        public ArrayList<String> getQualifierCodeList() { return QualifierCodeList; }
        public PutQualifierGroup setQualifierCodeList(ArrayList<String> value) { this.QualifierCodeList = value; return this; }
        private static Object responseType = QualifierGroupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/openidconnect/{UniqueId}", Verbs="GET")
    public static class GetOpenIdConnectUser implements IReturn<OpenIdConnectUser>
    {
        /**
        * Unique ID of the user
        */
        @ApiMember(DataType="string", Description="Unique ID of the user", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetOpenIdConnectUser setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = OpenIdConnectUser.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/openidconnect", Verbs="POST")
    public static class PostOpenIdConnectUser extends UserBase implements IReturn<User>, IOpenIdConnectUserAuth
    {
        /**
        * DEPRECATED: Use Identifier instead.
        */
        @ApiMember(Description="DEPRECATED: Use Identifier instead.")
        public String SubjectIdentifier = null;

        /**
        * Unique identifier within the issuer for the end-user
        */
        @ApiMember(Description="Unique identifier within the issuer for the end-user", IsRequired=true)
        public String Identifier = null;
        
        public String getSubjectIdentifier() { return SubjectIdentifier; }
        public PostOpenIdConnectUser setSubjectIdentifier(String value) { this.SubjectIdentifier = value; return this; }
        public String getIdentifier() { return Identifier; }
        public PostOpenIdConnectUser setIdentifier(String value) { this.Identifier = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/openidconnect/{UniqueId}", Verbs="PUT")
    public static class PutOpenIdConnectUser extends PutUserBase implements IReturn<User>, IOpenIdConnectUserAuth
    {
        /**
        * DEPRECATED: Use Identifier instead.
        */
        @ApiMember(Description="DEPRECATED: Use Identifier instead.")
        public String SubjectIdentifier = null;

        /**
        * Unique identifier within the issuer for the end-user
        */
        @ApiMember(Description="Unique identifier within the issuer for the end-user", IsRequired=true)
        public String Identifier = null;
        
        public String getSubjectIdentifier() { return SubjectIdentifier; }
        public PutOpenIdConnectUser setSubjectIdentifier(String value) { this.SubjectIdentifier = value; return this; }
        public String getIdentifier() { return Identifier; }
        public PutOpenIdConnectUser setIdentifier(String value) { this.Identifier = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UniqueId}/openidconnect", Verbs="PUT")
    public static class PutOpenIdConnectAuth extends PutUserAuthBase implements IReturn<User>, IOpenIdConnectUserAuth
    {
        /**
        * DEPRECATED: Use Identifier instead.
        */
        @ApiMember(Description="DEPRECATED: Use Identifier instead.")
        public String SubjectIdentifier = null;

        /**
        * Unique identifier within the issuer for the end-user
        */
        @ApiMember(Description="Unique identifier within the issuer for the end-user", IsRequired=true)
        public String Identifier = null;
        
        public String getSubjectIdentifier() { return SubjectIdentifier; }
        public PutOpenIdConnectAuth setSubjectIdentifier(String value) { this.SubjectIdentifier = value; return this; }
        public String getIdentifier() { return Identifier; }
        public PutOpenIdConnectAuth setIdentifier(String value) { this.Identifier = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() { return responseType; }
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

    @Route(Path="/openidconnect/relyingpartyconfiguration", Verbs="POST")
    public static class PostOpenIdConnectRelyingPartyConfiguration extends OpenIdConnectRelyingPartyConfigurationBase implements IReturn<OpenIdConnectRelyingPartyConfiguration>
    {
        /**
        * The issuer identifier of the OpenID Connect provider, an HTTPS URI. This can be obtained from the 'issuer' field of the OpenID Connect discovery document published by the provider.
        */
        @ApiMember(Description="The issuer identifier of the OpenID Connect provider, an HTTPS URI. This can be obtained from the \'issuer\' field of the OpenID Connect discovery document published by the provider.", IsRequired=true)
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

    @Route(Path="/roles/{UniqueId}", Verbs="GET")
    public static class GetRole implements IReturn<Role>
    {
        /**
        * Unique Id of the role
        */
        @ApiMember(DataType="string", Description="Unique Id of the role", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetRole setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Role.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/roles/{UniqueId}/flattened", Verbs="GET")
    public static class GetRoleFlattened implements IReturn<RoleFlattened>
    {
        /**
        * Unique Id of the role
        */
        @ApiMember(DataType="string", Description="Unique Id of the role", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetRoleFlattened setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = RoleFlattened.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/roles", Verbs="GET")
    public static class GetRoles implements IReturn<RolesResponse>
    {
        
        private static Object responseType = RolesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/roles", Verbs="POST")
    public static class PostRole extends RoleBase implements IReturn<Role>
    {
        
        private static Object responseType = Role.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/roles/flattened", Verbs="POST")
    public static class PostRoleFlattened extends RoleFlattenedBase implements IReturn<RoleFlattened>
    {
        
        private static Object responseType = RoleFlattened.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/roles/{UniqueId}", Verbs="PUT")
    public static class PutRole extends RoleBase implements IReturn<Role>
    {
        /**
        * Unique Id of the role
        */
        @ApiMember(DataType="string", Description="Unique Id of the role", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutRole setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Role.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/roles/{UniqueId}/flattened", Verbs="PUT")
    public static class PutRoleFlattened extends RoleFlattenedBase implements IReturn<RoleFlattened>
    {
        /**
        * Unique Id of the role
        */
        @ApiMember(DataType="string", Description="Unique Id of the role", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutRoleFlattened setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = RoleFlattened.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/roles/{UniqueId}", Verbs="DELETE")
    public static class DeleteRole implements IReturnVoid
    {
        /**
        * Unique Id of the role
        */
        @ApiMember(DataType="string", Description="Unique Id of the role", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteRole setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/tags/location", Verbs="GET")
    public static class GetLocationTags extends GetNameTagsBase implements IReturn<NameTagsResponse>
    {
        
        private static Object responseType = NameTagsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/location", Verbs="POST")
    public static class PostLocationTag extends PostNameTagBase implements IReturn<NameTag>
    {
        
        private static Object responseType = NameTag.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/location/{UniqueId}", Verbs="PUT")
    public static class PutLocationTag extends PutNameTagBase implements IReturn<NameTag>
    {
        
        private static Object responseType = NameTag.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/location/{UniqueId}", Verbs="DELETE")
    public static class DeleteLocationTag extends DeleteNameTagBase implements IReturnVoid
    {
        
    }

    @Route(Path="/reportplugins", Verbs="GET")
    public static class GetReportPlugins implements IReturn<ReportPluginResponse>
    {
        
        private static Object responseType = ReportPluginResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/reportplugins", Verbs="POST")
    public static class PostReportPlugin extends ReportPluginBase implements IReturn<ReportPlugin>
    {
        
        private static Object responseType = ReportPlugin.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/reportplugins/{UniqueId}", Verbs="PUT")
    public static class PutReportPlugin implements IReturn<ReportPlugin>
    {
        /**
        * Unique ID of the report plug-in
        */
        @ApiMember(DataType="string", Description="Unique ID of the report plug-in", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Is enabled
        */
        @ApiMember(DataType="boolean", Description="Is enabled", IsRequired=true)
        public Boolean IsEnabled = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutReportPlugin setUniqueId(String value) { this.UniqueId = value; return this; }
        public Boolean getIsEnabled() { return IsEnabled; }
        public PutReportPlugin setIsEnabled(Boolean value) { this.IsEnabled = value; return this; }
        private static Object responseType = ReportPlugin.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/reportplugins/{UniqueId}", Verbs="DELETE")
    public static class DeleteReportPlugin implements IReturnVoid
    {
        /**
        * Unique ID of the report plug-in
        */
        @ApiMember(DataType="string", Description="Unique ID of the report plug-in", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteReportPlugin setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/sensors/{UniqueId}", Verbs="GET")
    public static class GetSensor implements IReturn<Sensor>
    {
        /**
        * Unique ID of the sensor
        */
        @ApiMember(DataType="string", Description="Unique ID of the sensor", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetSensor setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Sensor.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/sensors", Verbs="POST")
    public static class PostSensor extends SensorBase implements IReturn<Sensor>
    {
        
        private static Object responseType = Sensor.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{UniqueId}", Verbs="PUT")
    public static class PutSensor extends SensorBase implements IReturn<Sensor>
    {
        /**
        * Unique ID of the sensor
        */
        @ApiMember(DataType="string", Description="Unique ID of the sensor", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutSensor setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = Sensor.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{UniqueId}", Verbs="DELETE")
    public static class DeleteSensor implements IReturnVoid
    {
        /**
        * Unique ID of the sensor
        */
        @ApiMember(DataType="string", Description="Unique ID of the sensor", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteSensor setUniqueId(String value) { this.UniqueId = value; return this; }
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

    @Route(Path="/settings/{Group}/{Key}", Verbs="GET")
    public static class GetSetting implements IReturn<Setting>, IIdentifySetting
    {
        /**
        * Setting group
        */
        @ApiMember(Description="Setting group", IsRequired=true, ParameterType="path")
        public String Group = null;

        /**
        * Setting key
        */
        @ApiMember(Description="Setting key", IsRequired=true, ParameterType="path")
        public String Key = null;
        
        public String getGroup() { return Group; }
        public GetSetting setGroup(String value) { this.Group = value; return this; }
        public String getKey() { return Key; }
        public GetSetting setKey(String value) { this.Key = value; return this; }
        private static Object responseType = Setting.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/settings", Verbs="GET")
    public static class GetSettings implements IReturn<SettingsResponse>
    {
        
        private static Object responseType = SettingsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/settings/{Group}", Verbs="GET")
    public static class GetSettingGroup implements IReturn<SettingsResponse>
    {
        /**
        * Setting group
        */
        @ApiMember(Description="Setting group", IsRequired=true, ParameterType="path")
        public String Group = null;
        
        public String getGroup() { return Group; }
        public GetSettingGroup setGroup(String value) { this.Group = value; return this; }
        private static Object responseType = SettingsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/settings", Verbs="POST")
    public static class PostSetting implements IReturn<Setting>, IModifySetting, IIdentifySetting
    {
        /**
        * Setting group
        */
        @ApiMember(Description="Setting group", IsRequired=true)
        public String Group = null;

        /**
        * Setting key
        */
        @ApiMember(Description="Setting key", IsRequired=true)
        public String Key = null;

        /**
        * Setting value
        */
        @ApiMember(Description="Setting value")
        public String Value = null;

        /**
        * Setting description
        */
        @ApiMember(Description="Setting description")
        public String Description = null;
        
        public String getGroup() { return Group; }
        public PostSetting setGroup(String value) { this.Group = value; return this; }
        public String getKey() { return Key; }
        public PostSetting setKey(String value) { this.Key = value; return this; }
        public String getValue() { return Value; }
        public PostSetting setValue(String value) { this.Value = value; return this; }
        public String getDescription() { return Description; }
        public PostSetting setDescription(String value) { this.Description = value; return this; }
        private static Object responseType = Setting.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/settings/{Group}/{Key}", Verbs="PUT")
    public static class PutSetting implements IReturn<Setting>, IModifySetting, IIdentifySetting
    {
        /**
        * Setting group
        */
        @ApiMember(Description="Setting group", IsRequired=true, ParameterType="path")
        public String Group = null;

        /**
        * Setting key
        */
        @ApiMember(Description="Setting key", IsRequired=true, ParameterType="path")
        public String Key = null;

        /**
        * Setting value
        */
        @ApiMember(Description="Setting value")
        public String Value = null;

        /**
        * Setting description
        */
        @ApiMember(Description="Setting description")
        public String Description = null;
        
        public String getGroup() { return Group; }
        public PutSetting setGroup(String value) { this.Group = value; return this; }
        public String getKey() { return Key; }
        public PutSetting setKey(String value) { this.Key = value; return this; }
        public String getValue() { return Value; }
        public PutSetting setValue(String value) { this.Value = value; return this; }
        public String getDescription() { return Description; }
        public PutSetting setDescription(String value) { this.Description = value; return this; }
        private static Object responseType = Setting.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/settings/{Group}/{Key}", Verbs="DELETE")
    public static class DeleteSetting implements IReturnVoid, IIdentifySetting
    {
        /**
        * Setting group
        */
        @ApiMember(Description="Setting group", IsRequired=true, ParameterType="path")
        public String Group = null;

        /**
        * Setting key
        */
        @ApiMember(Description="Setting key", IsRequired=true, ParameterType="path")
        public String Key = null;
        
        public String getGroup() { return Group; }
        public DeleteSetting setGroup(String value) { this.Group = value; return this; }
        public String getKey() { return Key; }
        public DeleteSetting setKey(String value) { this.Key = value; return this; }
    }

    @Route(Path="/dropdownlists/{Type}", Verbs="GET")
    public static class GetDropDownListsByType implements IReturn<DropDownListResponse>
    {
        /**
        * The type of drop-down list to return.
        */
        @ApiMember(DataType="DropDownListType", Description="The type of drop-down list to return.", IsRequired=true, ParameterType="path")
        public DropDownListType Type = null;
        
        public DropDownListType getType() { return Type; }
        public GetDropDownListsByType setType(DropDownListType value) { this.Type = value; return this; }
        private static Object responseType = DropDownListResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/dropdownlists/configurable/items", Verbs="GET")
    public static class GetConfigurableDropDownListItems implements IReturn<ConfigurableDropDownListItemsResponse>
    {
        
        private static Object responseType = ConfigurableDropDownListItemsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/dropdownlists/configurable/{DropDownListId}/{Id}", Verbs="POST")
    public static class PostConfigurableDropDownListItem extends ConfigurableDropDownListItemBase implements IReturn<ConfigurableDropDownListItem>
    {
        
        private static Object responseType = ConfigurableDropDownListItem.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/dropdownlists/configurable/{DropDownListId}/{Id}", Verbs="PUT")
    public static class PutConfigurableDropDownListItem extends ConfigurableDropDownListItemBase implements IReturn<ConfigurableDropDownListItem>
    {
        
        private static Object responseType = ConfigurableDropDownListItem.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/dropdownlists/fixed/items", Verbs="GET")
    public static class GetFixedDropDownListItems implements IReturn<FixedDropDownListItemsResponse>
    {
        
        private static Object responseType = FixedDropDownListItemsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/dropdownlists/fixed/{DropDownListId}/{Id}", Verbs="PUT")
    public static class PutFixedDropDownListItem implements IReturn<FixedDropDownListItem>
    {
        /**
        * Id of the fixed drop-down list
        */
        @ApiMember(Description="Id of the fixed drop-down list", IsRequired=true, ParameterType="path")
        public String DropDownListId = null;

        /**
        * Id of the drop-down list item to update
        */
        @ApiMember(Description="Id of the drop-down list item to update", IsRequired=true, ParameterType="path")
        public String Id = null;

        /**
        * The that will be shown for the item in drop-down lists
        */
        @ApiMember(Description="The that will be shown for the item in drop-down lists", IsRequired=true)
        public String DisplayName = null;
        
        public String getDropDownListId() { return DropDownListId; }
        public PutFixedDropDownListItem setDropDownListId(String value) { this.DropDownListId = value; return this; }
        public String getId() { return Id; }
        public PutFixedDropDownListItem setId(String value) { this.Id = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public PutFixedDropDownListItem setDisplayName(String value) { this.DisplayName = value; return this; }
        private static Object responseType = FixedDropDownListItem.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thresholdtypes", Verbs="POST")
    public static class PostThresholdType extends ThresholdTypeRequestBase implements IReturn<ThresholdType>
    {
        /**
        * Reference value code
        */
        @ApiMember(Description="Reference value code", IsRequired=true)
        public String ReferenceValueCode = null;

        /**
        * Severity
        */
        @ApiMember(DataType="ThresholdTypeSeverity", Description="Severity", IsRequired=true)
        public ThresholdTypeSeverity Severity = null;

        /**
        * Behavior to trigger thresholds of this type
        */
        @ApiMember(DataType="ThresholdBehavior", Description="Behavior to trigger thresholds of this type", IsRequired=true)
        public ThresholdBehavior CheckForBehavior = null;

        /**
        * Allow thresholds of this type to suppress data
        */
        @ApiMember(DataType="ThresholdSuppressionOption", Description="Allow thresholds of this type to suppress data", IsRequired=true)
        public ThresholdSuppressionOption ThresholdSuppressionOption = null;
        
        public String getReferenceValueCode() { return ReferenceValueCode; }
        public PostThresholdType setReferenceValueCode(String value) { this.ReferenceValueCode = value; return this; }
        public ThresholdTypeSeverity getSeverity() { return Severity; }
        public PostThresholdType setSeverity(ThresholdTypeSeverity value) { this.Severity = value; return this; }
        public ThresholdBehavior getCheckForBehavior() { return CheckForBehavior; }
        public PostThresholdType setCheckForBehavior(ThresholdBehavior value) { this.CheckForBehavior = value; return this; }
        public ThresholdSuppressionOption getThresholdSuppressionOption() { return ThresholdSuppressionOption; }
        public PostThresholdType setThresholdSuppressionOption(ThresholdSuppressionOption value) { this.ThresholdSuppressionOption = value; return this; }
        private static Object responseType = ThresholdType.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thresholdtypes/{ReferenceValueCode}", Verbs="PUT")
    public static class PutThresholdType extends ThresholdTypeRequestBase implements IReturn<ThresholdType>
    {
        /**
        * Reference value code
        */
        @ApiMember(Description="Reference value code", IsRequired=true, ParameterType="path")
        public String ReferenceValueCode = null;
        
        public String getReferenceValueCode() { return ReferenceValueCode; }
        public PutThresholdType setReferenceValueCode(String value) { this.ReferenceValueCode = value; return this; }
        private static Object responseType = ThresholdType.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thresholdtypes", Verbs="GET")
    public static class GetThresholdTypes implements IReturn<ThresholdTypesResponse>
    {
        
        private static Object responseType = ThresholdTypesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thresholdtypes/{ReferenceValueCode}", Verbs="DELETE")
    public static class DeleteThresholdType implements IReturnVoid
    {
        /**
        * Reference value code
        */
        @ApiMember(Description="Reference value code", IsRequired=true, ParameterType="path")
        public String ReferenceValueCode = null;
        
        public String getReferenceValueCode() { return ReferenceValueCode; }
        public DeleteThresholdType setReferenceValueCode(String value) { this.ReferenceValueCode = value; return this; }
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

    @Route(Path="/computationperiods", Verbs="GET")
    public static class GetComputationPeriods extends GetCodeTableBase implements IReturn<CodeTableResponse>
    {
        
        private static Object responseType = CodeTableResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/computationperiods/{PublicIdentifier}", Verbs="PUT")
    public static class PutComputationPeriod extends CodeTableRequestBase implements IReturn<CodeTable>
    {
        
        private static Object responseType = CodeTable.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/computationperiods", Verbs="POST")
    public static class PostComputationPeriod extends CodeTableRequestBase implements IReturn<CodeTable>
    {
        
        private static Object responseType = CodeTable.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/computationperiods/{PublicIdentifier}", Verbs="DELETE")
    public static class DeleteComputationPeriod extends DeleteCodeTableBase implements IReturnVoid
    {
        
    }

    @Route(Path="/grades", Verbs="POST")
    public static class PostQualityCode implements IReturn<Grade>, IQualityCodeRequest
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
        public PostQualityCode setGradeCode(Integer value) { this.GradeCode = value; return this; }
        public String getColor() { return Color; }
        public PostQualityCode setColor(String value) { this.Color = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public PostQualityCode setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public PostQualityCode setDescription(String value) { this.Description = value; return this; }
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
    public static class PutQualityCode implements IReturn<Grade>, IQualityCodeRequest
    {
        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", IsRequired=true, ParameterType="path")
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
        public PutQualityCode setGradeCode(Integer value) { this.GradeCode = value; return this; }
        public String getColor() { return Color; }
        public PutQualityCode setColor(String value) { this.Color = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public PutQualityCode setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public PutQualityCode setDescription(String value) { this.Description = value; return this; }
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

    @Route(Path="/locations/{LocationUniqueId}/datumperiods/{ValidFrom}", Verbs="PUT")
    public static class PutLocationDatumPeriod extends LocationDatumPeriodBase implements IReturn<LocationDatumResponse>
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
        public PutLocationDatumPeriod setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public PutLocationDatumPeriod setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
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

    @Route(Path="/computationtypes", Verbs="GET")
    public static class GetComputationTypes extends GetCodeTableBase implements IReturn<CodeTableResponse>
    {
        
        private static Object responseType = CodeTableResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/computationtypes/{PublicIdentifier}", Verbs="PUT")
    public static class PutComputationType extends CodeTableRequestBase implements IReturn<CodeTable>
    {
        
        private static Object responseType = CodeTable.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/computationtypes", Verbs="POST")
    public static class PostComputationType extends CodeTableRequestBase implements IReturn<CodeTable>
    {
        
        private static Object responseType = CodeTable.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/computationtypes/{PublicIdentifier}", Verbs="DELETE")
    public static class DeleteComputationType extends DeleteCodeTableBase implements IReturnVoid
    {
        
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

    @Route(Path="/qualifiers", Verbs="POST")
    public static class PostQualifier extends QualifierBase implements IReturn<QualifierResponse>
    {
        
        private static Object responseType = QualifierResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/qualifiers/{UniqueId}", Verbs="PUT")
    public static class PutQualifier implements IReturn<QualifierResponse>
    {
        /**
        * Unique ID of the qualifier 
        */
        @ApiMember(DataType="string", Description="Unique ID of the qualifier ", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Public identifier
        */
        @ApiMember(Description="Public identifier", IsRequired=true)
        public String PublicIdentifier = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Qualifier group identifiers - if no groups (an empty list is []) are specified, the qualifier will be removed from all groups and re-assigned to the 'Default' qualifier group
        */
        @ApiMember(DataType="Array<string>", Description="Qualifier group identifiers - if no groups (an empty list is []) are specified, the qualifier will be removed from all groups and re-assigned to the \'Default\' qualifier group", IsRequired=true)
        public ArrayList<String> GroupIdentifiers = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutQualifier setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getPublicIdentifier() { return PublicIdentifier; }
        public PutQualifier setPublicIdentifier(String value) { this.PublicIdentifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public PutQualifier setDisplayName(String value) { this.DisplayName = value; return this; }
        public ArrayList<String> getGroupIdentifiers() { return GroupIdentifiers; }
        public PutQualifier setGroupIdentifiers(ArrayList<String> value) { this.GroupIdentifiers = value; return this; }
        private static Object responseType = QualifierResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/qualifiers", Verbs="GET")
    public static class GetQualifiers implements IReturn<QualifiersResponse>
    {
        
        private static Object responseType = QualifiersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/qualifiers/{UniqueId}", Verbs="GET")
    public static class GetQualifier implements IReturn<QualifierResponse>
    {
        /**
        * Unique ID of the qualifier 
        */
        @ApiMember(DataType="string", Description="Unique ID of the qualifier ", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public GetQualifier setUniqueId(String value) { this.UniqueId = value; return this; }
        private static Object responseType = QualifierResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/qualifiers/{UniqueId}", Verbs="DELETE")
    public static class DeleteQualifier implements IReturnVoid
    {
        /**
        * Unique ID of the qualifier 
        */
        @ApiMember(DataType="string", Description="Unique ID of the qualifier ", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteQualifier setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    @Route(Path="/locations/{LocationUniqueId}/userroles", Verbs="GET")
    public static class GetLocationUserRoles implements IReturn<LocationUserRoles>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public GetLocationUserRoles setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = LocationUserRoles.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationfolders/{LocationFolderUniqueId}/userroles", Verbs="GET")
    public static class GetLocationFolderUserRoles implements IReturn<LocationFolderUserRoles>
    {
        /**
        * Unique ID of the location folder
        */
        @ApiMember(DataType="string", Description="Unique ID of the location folder", IsRequired=true, ParameterType="path")
        public String LocationFolderUniqueId = null;
        
        public String getLocationFolderUniqueId() { return LocationFolderUniqueId; }
        public GetLocationFolderUserRoles setLocationFolderUniqueId(String value) { this.LocationFolderUniqueId = value; return this; }
        private static Object responseType = LocationFolderUserRoles.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/userroles/{UserUniqueId}", Verbs="PUT")
    public static class PutLocationUserRole extends PutUserRoleBase implements IReturn<LocationUserRole>
    {
        /**
        * Unique Id of the location
        */
        @ApiMember(DataType="string", Description="Unique Id of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PutLocationUserRole setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = LocationUserRole.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locationfolders/{LocationFolderUniqueId}/userroles/{UserUniqueId}", Verbs="PUT")
    public static class PutLocationFolderUserRole extends PutUserRoleBase implements IReturn<LocationFolderUserRole>
    {
        /**
        * Unique Id of the location folder
        */
        @ApiMember(DataType="string", Description="Unique Id of the location folder", IsRequired=true, ParameterType="path")
        public String LocationFolderUniqueId = null;
        
        public String getLocationFolderUniqueId() { return LocationFolderUniqueId; }
        public PutLocationFolderUserRole setLocationFolderUniqueId(String value) { this.LocationFolderUniqueId = value; return this; }
        private static Object responseType = LocationFolderUserRole.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/userroles/{UserUniqueId}", Verbs="DELETE")
    public static class DeleteLocationUserRole implements IReturnVoid
    {
        /**
        * Unique Id of the location
        */
        @ApiMember(DataType="string", Description="Unique Id of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Unique Id of the user the role will be removed for
        */
        @ApiMember(DataType="string", Description="Unique Id of the user the role will be removed for", IsRequired=true, ParameterType="path")
        public String UserUniqueId = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public DeleteLocationUserRole setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getUserUniqueId() { return UserUniqueId; }
        public DeleteLocationUserRole setUserUniqueId(String value) { this.UserUniqueId = value; return this; }
    }

    @Route(Path="/locationfolders/{LocationFolderUniqueId}/userroles/{UserUniqueId}", Verbs="DELETE")
    public static class DeleteLocationFolderUserRole implements IReturnVoid
    {
        /**
        * Unique Id of the location folder
        */
        @ApiMember(DataType="string", Description="Unique Id of the location folder", IsRequired=true, ParameterType="path")
        public String LocationFolderUniqueId = null;

        /**
        * Unique Id of the user the role will be removed for
        */
        @ApiMember(DataType="string", Description="Unique Id of the user the role will be removed for", IsRequired=true, ParameterType="path")
        public String UserUniqueId = null;
        
        public String getLocationFolderUniqueId() { return LocationFolderUniqueId; }
        public DeleteLocationFolderUserRole setLocationFolderUniqueId(String value) { this.LocationFolderUniqueId = value; return this; }
        public String getUserUniqueId() { return UserUniqueId; }
        public DeleteLocationFolderUserRole setUserUniqueId(String value) { this.UserUniqueId = value; return this; }
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
        * If provided, will override password for user
        */
        @ApiMember(Description="If provided, will override password for user")
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

    @Route(Path="/tags/note", Verbs="GET")
    public static class GetNoteTags extends GetNameTagsBase implements IReturn<NameTagsResponse>
    {
        
        private static Object responseType = NameTagsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/note", Verbs="POST")
    public static class PostNoteTag extends PostNameTagBase implements IReturn<NameTag>
    {
        
        private static Object responseType = NameTag.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/note/{UniqueId}", Verbs="PUT")
    public static class PutNoteTag extends PutNameTagBase implements IReturn<NameTag>
    {
        
        private static Object responseType = NameTag.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tags/note/{UniqueId}", Verbs="DELETE")
    public static class DeleteNoteTag extends DeleteNameTagBase implements IReturnVoid
    {
        
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
    public static class PostBaseStandardReferenceDatum implements IReturn<StandardReferenceDatum>, ICreateStandardDatum, IStandardReferenceDatumIdentity
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Standard identifier
        */
        @ApiMember(Description="Standard identifier", IsRequired=true)
        public String StandardIdentifier = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Method used to determine the base reference
        */
        @ApiMember(Description="Method used to determine the base reference")
        public String Method = null;

        /**
        * Uncertainty for the base reference
        */
        @ApiMember(DataType="double", Description="Uncertainty for the base reference")
        public Double Uncertainty = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostBaseStandardReferenceDatum setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public PostBaseStandardReferenceDatum setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public String getComments() { return Comments; }
        public PostBaseStandardReferenceDatum setComments(String value) { this.Comments = value; return this; }
        public String getMethod() { return Method; }
        public PostBaseStandardReferenceDatum setMethod(String value) { this.Method = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public PostBaseStandardReferenceDatum setUncertainty(Double value) { this.Uncertainty = value; return this; }
        private static Object responseType = StandardReferenceDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/basereference", Verbs="PUT")
    public static class PutBaseStandardReferenceDatum implements IReturn<StandardReferenceDatum>, ICreateStandardDatum, IStandardReferenceDatumIdentity
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Standard identifier
        */
        @ApiMember(Description="Standard identifier", IsRequired=true)
        public String StandardIdentifier = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Method used to determine the base reference
        */
        @ApiMember(Description="Method used to determine the base reference")
        public String Method = null;

        /**
        * Uncertainty for the base reference
        */
        @ApiMember(DataType="double", Description="Uncertainty for the base reference")
        public Double Uncertainty = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PutBaseStandardReferenceDatum setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public PutBaseStandardReferenceDatum setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public String getComments() { return Comments; }
        public PutBaseStandardReferenceDatum setComments(String value) { this.Comments = value; return this; }
        public String getMethod() { return Method; }
        public PutBaseStandardReferenceDatum setMethod(String value) { this.Method = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public PutBaseStandardReferenceDatum setUncertainty(Double value) { this.Uncertainty = value; return this; }
        private static Object responseType = StandardReferenceDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/basereferenceoffset", Verbs="POST")
    public static class PostBaseStandardReferenceDatumOffset implements IReturn<StandardReferenceDatum>, ICreateStandardDatum, IStandardReferenceDatumIdentity
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Standard identifier
        */
        @ApiMember(Description="Standard identifier", IsRequired=true)
        public String StandardIdentifier = null;

        /**
        * Offset in relation to the base reference.
        */
        @ApiMember(DataType="double", Description="Offset in relation to the base reference.", IsRequired=true)
        public Double OffsetToBaseReference = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Method used to determine the offset to the base reference
        */
        @ApiMember(Description="Method used to determine the offset to the base reference")
        public String Method = null;

        /**
        * Uncertainty for the offset to the base reference
        */
        @ApiMember(DataType="double", Description="Uncertainty for the offset to the base reference")
        public Double Uncertainty = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostBaseStandardReferenceDatumOffset setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public PostBaseStandardReferenceDatumOffset setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public Double getOffsetToBaseReference() { return OffsetToBaseReference; }
        public PostBaseStandardReferenceDatumOffset setOffsetToBaseReference(Double value) { this.OffsetToBaseReference = value; return this; }
        public String getComments() { return Comments; }
        public PostBaseStandardReferenceDatumOffset setComments(String value) { this.Comments = value; return this; }
        public String getMethod() { return Method; }
        public PostBaseStandardReferenceDatumOffset setMethod(String value) { this.Method = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public PostBaseStandardReferenceDatumOffset setUncertainty(Double value) { this.Uncertainty = value; return this; }
        private static Object responseType = StandardReferenceDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/basereferenceoffset/{StandardIdentifier}", Verbs="PUT")
    public static class PutBaseStandardReferenceDatumOffset implements IReturn<StandardReferenceDatum>, ICreateStandardDatum, IStandardReferenceDatumIdentity
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

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Method used to determine the offset to the base reference
        */
        @ApiMember(Description="Method used to determine the offset to the base reference")
        public String Method = null;

        /**
        * Uncertainty for the offset to the base reference
        */
        @ApiMember(DataType="double", Description="Uncertainty for the offset to the base reference")
        public Double Uncertainty = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PutBaseStandardReferenceDatumOffset setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public PutBaseStandardReferenceDatumOffset setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public Double getOffsetToBaseReference() { return OffsetToBaseReference; }
        public PutBaseStandardReferenceDatumOffset setOffsetToBaseReference(Double value) { this.OffsetToBaseReference = value; return this; }
        public String getComments() { return Comments; }
        public PutBaseStandardReferenceDatumOffset setComments(String value) { this.Comments = value; return this; }
        public String getMethod() { return Method; }
        public PutBaseStandardReferenceDatumOffset setMethod(String value) { this.Method = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public PutBaseStandardReferenceDatumOffset setUncertainty(Double value) { this.Uncertainty = value; return this; }
        private static Object responseType = StandardReferenceDatum.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/locations/{LocationUniqueId}/standardreferencedatums/{StandardIdentifier}", Verbs="DELETE")
    public static class DeleteStandardReferenceDatum implements IReturnVoid, IStandardReferenceDatumIdentity
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
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public DeleteStandardReferenceDatum setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public DeleteStandardReferenceDatum setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
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

    @Route(Path="/locations/{LocationUniqueId}/referencepoints/{ReferencePointUniqueId}", Verbs="PUT")
    public static class PutReferencePoint extends ReferencePointBase implements IReturn<ReferencePoint>
    {
        /**
        * Unique ID of the Reference Point
        */
        @ApiMember(DataType="string", Description="Unique ID of the Reference Point", IsRequired=true, ParameterType="path")
        public String ReferencePointUniqueId = null;

        /**
        * Periods of applicablity for this reference point. Must have at least one period
        */
        @ApiMember(DataType="Array<PutReferencePointPeriod>", Description="Periods of applicablity for this reference point. Must have at least one period", IsRequired=true)
        public ArrayList<PutReferencePointPeriod> ReferencePointPeriods = null;
        
        public String getReferencePointUniqueId() { return ReferencePointUniqueId; }
        public PutReferencePoint setReferencePointUniqueId(String value) { this.ReferencePointUniqueId = value; return this; }
        public ArrayList<PutReferencePointPeriod> getReferencePointPeriods() { return ReferencePointPeriods; }
        public PutReferencePoint setReferencePointPeriods(ArrayList<PutReferencePointPeriod> value) { this.ReferencePointPeriods = value; return this; }
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

    @Route(Path="/locations/{LocationUniqueId}/tags", Verbs="PUT")
    public static class PutLocationTags implements IReturn<Location>
    {
        /**
        * Unique ID of the location
        */
        @ApiMember(DataType="string", Description="Unique ID of the location", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * DEPRECATED: use Tags instead
        */
        @ApiMember(DataType="Array<string>", Description="DEPRECATED: use Tags instead")
        public ArrayList<String> TagUniqueIds = null;

        /**
        * Tags to be assigned to the location with optional values; an empty list means the location will have no tags assigned to it.
        */
        @ApiMember(DataType="Array<ApplyTagRequest>", Description="Tags to be assigned to the location with optional values; an empty list means the location will have no tags assigned to it.")
        public ArrayList<ApplyTagRequest> Tags = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PutLocationTags setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public ArrayList<String> getTagUniqueIds() { return TagUniqueIds; }
        public PutLocationTags setTagUniqueIds(ArrayList<String> value) { this.TagUniqueIds = value; return this; }
        public ArrayList<ApplyTagRequest> getTags() { return Tags; }
        public PutLocationTags setTags(ArrayList<ApplyTagRequest> value) { this.Tags = value; return this; }
        private static Object responseType = Location.class;
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

    @Route(Path="/users", Verbs="GET")
    public static class GetUsers implements IReturn<UsersResponse>
    {
        /**
        * If specified, only users with a matching Authentication Type will be returned
        */
        @ApiMember(Description="If specified, only users with a matching Authentication Type will be returned")
        public String AuthenticationType = null;
        
        public String getAuthenticationType() { return AuthenticationType; }
        public GetUsers setAuthenticationType(String value) { this.AuthenticationType = value; return this; }
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

    @Route(Path="/fielddataplugins", Verbs="GET")
    public static class GetFieldDataPlugins implements IReturn<FieldDataPluginsResponse>
    {
        
        private static Object responseType = FieldDataPluginsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/fielddataplugins", Verbs="POST")
    public static class PostFieldDataPluginFile implements IReturn<FieldDataPlugin>, IFileUploadRequest
    {
        /**
        * File
        */
        @Ignore()
        @ApiMember(DataType="file", Description="File", IsRequired=true, ParameterType="form")
        public IHttpFile File = null;

        /**
        * Plug-in priority; 1 has highest priority; omitted or 0 means use package priority; default is to make this plug-in the highest priority
        */
        @ApiMember(DataType="integer", Description="Plug-in priority; 1 has highest priority; omitted or 0 means use package priority; default is to make this plug-in the highest priority")
        public Integer PluginPriority = null;
        
        public IHttpFile getFile() { return File; }
        public PostFieldDataPluginFile setFile(IHttpFile value) { this.File = value; return this; }
        public Integer getPluginPriority() { return PluginPriority; }
        public PostFieldDataPluginFile setPluginPriority(Integer value) { this.PluginPriority = value; return this; }
        private static Object responseType = FieldDataPlugin.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/fielddataplugins/{UniqueId}", Verbs="PUT")
    public static class PutFieldDataPlugin implements IReturn<FieldDataPlugin>
    {
        /**
        * Unique ID of the field data plug-in
        */
        @ApiMember(DataType="string", Description="Unique ID of the field data plug-in", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Plug-in priority; 1 has highest priority. Priority must be greater than zero.
        */
        @ApiMember(DataType="integer", Description="Plug-in priority; 1 has highest priority. Priority must be greater than zero.", IsRequired=true)
        public Integer PluginPriority = null;

        /**
        * Is enabled
        */
        @ApiMember(DataType="boolean", Description="Is enabled", IsRequired=true)
        public Boolean IsEnabled = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutFieldDataPlugin setUniqueId(String value) { this.UniqueId = value; return this; }
        public Integer getPluginPriority() { return PluginPriority; }
        public PutFieldDataPlugin setPluginPriority(Integer value) { this.PluginPriority = value; return this; }
        public Boolean getIsEnabled() { return IsEnabled; }
        public PutFieldDataPlugin setIsEnabled(Boolean value) { this.IsEnabled = value; return this; }
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

    public static class Tag
    {
        /**
        * Unique ID of the tag
        */
        @ApiMember(DataType="string", Description="Unique ID of the tag")
        public String UniqueId = null;

        /**
        * Unique tag key
        */
        @ApiMember(Description="Unique tag key")
        public String Key = null;

        /**
        * Value type
        */
        @ApiMember(DataType="TagValueType", Description="Value type")
        public TagValueType ValueType = null;

        /**
        * Set of pick-list values if ValueType is PickList
        */
        @ApiMember(DataType="Array<string>", Description="Set of pick-list values if ValueType is PickList")
        public ArrayList<String> PickListValues = null;

        /**
        * True if tag is applicable to Locations
        */
        @ApiMember(DataType="boolean", Description="True if tag is applicable to Locations")
        public Boolean AppliesToLocations = null;

        /**
        * True if tag is applicable to Location Notes
        */
        @ApiMember(DataType="boolean", Description="True if tag is applicable to Location Notes")
        public Boolean AppliesToLocationNotes = null;

        /**
        * True if tag is applicable to Sensors and Gauges
        */
        @ApiMember(DataType="boolean", Description="True if tag is applicable to Sensors and Gauges")
        public Boolean AppliesToSensorsGauges = null;
        
        public String getUniqueId() { return UniqueId; }
        public Tag setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getKey() { return Key; }
        public Tag setKey(String value) { this.Key = value; return this; }
        public TagValueType getValueType() { return ValueType; }
        public Tag setValueType(TagValueType value) { this.ValueType = value; return this; }
        public ArrayList<String> getPickListValues() { return PickListValues; }
        public Tag setPickListValues(ArrayList<String> value) { this.PickListValues = value; return this; }
        public Boolean isAppliesToLocations() { return AppliesToLocations; }
        public Tag setAppliesToLocations(Boolean value) { this.AppliesToLocations = value; return this; }
        public Boolean isAppliesToLocationNotes() { return AppliesToLocationNotes; }
        public Tag setAppliesToLocationNotes(Boolean value) { this.AppliesToLocationNotes = value; return this; }
        public Boolean isAppliesToSensorsGauges() { return AppliesToSensorsGauges; }
        public Tag setAppliesToSensorsGauges(Boolean value) { this.AppliesToSensorsGauges = value; return this; }
    }

    public static class TagsResponse
    {
        /**
        * The list of tags
        */
        @ApiMember(DataType="Array<Tag>", Description="The list of tags")
        public ArrayList<Tag> Results = null;
        
        public ArrayList<Tag> getResults() { return Results; }
        public TagsResponse setResults(ArrayList<Tag> value) { this.Results = value; return this; }
    }

    public static class ApprovalLevel
    {
        /**
        * Approval Level. Values &gt;=1000 are locking levels
        */
        @ApiMember(DataType="long integer", Description="Approval Level. Values &gt;=1000 are locking levels", IsRequired=true)
        public Long Level = null;

        /**
        * Color in #RRGGBB hexadecimal
        */
        @ApiMember(Description="Color in #RRGGBB hexadecimal", IsRequired=true)
        public String Color = null;

        /**
        * Description
        */
        @ApiMember(Description="Description", IsRequired=true)
        public String Description = null;
        
        public Long getLevel() { return Level; }
        public ApprovalLevel setLevel(Long value) { this.Level = value; return this; }
        public String getColor() { return Color; }
        public ApprovalLevel setColor(String value) { this.Color = value; return this; }
        public String getDescription() { return Description; }
        public ApprovalLevel setDescription(String value) { this.Description = value; return this; }
    }

    public static class ApprovalLevelsResponse
    {
        /**
        * The list of approval levels
        */
        @ApiMember(DataType="Array<ApprovalLevel>", Description="The list of approval levels")
        public ArrayList<ApprovalLevel> Results = null;
        
        public ArrayList<ApprovalLevel> getResults() { return Results; }
        public ApprovalLevelsResponse setResults(ArrayList<ApprovalLevel> value) { this.Results = value; return this; }
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
        * Publish. When true, Location Publish is also true
        */
        @ApiMember(DataType="boolean", Description="Publish. When true, Location Publish is also true")
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

    public static class ActiveDirectoryUser extends User
    {
        /**
        * The user's domain credentials specified in User Principal Name format. May be blank if the domain does not permit retrieving this value
        */
        @ApiMember(Description="The user\'s domain credentials specified in User Principal Name format. May be blank if the domain does not permit retrieving this value")
        public String UserPrincipalName = null;

        /**
        * The domain user's security identifier (SID)
        */
        @ApiMember(Description="The domain user\'s security identifier (SID)")
        public String ActiveDirectorySid = null;
        
        public String getUserPrincipalName() { return UserPrincipalName; }
        public ActiveDirectoryUser setUserPrincipalName(String value) { this.UserPrincipalName = value; return this; }
        public String getActiveDirectorySid() { return ActiveDirectorySid; }
        public ActiveDirectoryUser setActiveDirectorySid(String value) { this.ActiveDirectorySid = value; return this; }
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
        @ApiMember(DataType="boolean", Description="True if the user has the \'Can Configure System\' right")
        public Boolean CanConfigureSystem = null;

        /**
        * True if the user is licensed to launch the Rating Development toolbox
        */
        @ApiMember(DataType="boolean", Description="True if the user is licensed to launch the Rating Development toolbox")
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

    public static class QualifierGroupResponse
    {
        /**
        * Unique ID of the qualifier group
        */
        @ApiMember(DataType="string", Description="Unique ID of the qualifier group")
        public String UniqueId = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Qualifier codes in group
        */
        @ApiMember(DataType="Array<string>", Description="Qualifier codes in group")
        public ArrayList<String> QualifierCodeList = null;
        
        public String getUniqueId() { return UniqueId; }
        public QualifierGroupResponse setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public QualifierGroupResponse setIdentifier(String value) { this.Identifier = value; return this; }
        public ArrayList<String> getQualifierCodeList() { return QualifierCodeList; }
        public QualifierGroupResponse setQualifierCodeList(ArrayList<String> value) { this.QualifierCodeList = value; return this; }
    }

    public static class QualifierGroupsResponse
    {
        /**
        * The list of qualifier groups
        */
        @ApiMember(DataType="Array<QualifierGroupResponse>", Description="The list of qualifier groups")
        public ArrayList<QualifierGroupResponse> Results = null;
        
        public ArrayList<QualifierGroupResponse> getResults() { return Results; }
        public QualifierGroupsResponse setResults(ArrayList<QualifierGroupResponse> value) { this.Results = value; return this; }
    }

    public static class OpenIdConnectUser extends User
    {
        /**
        * DEPRECATED: Use Identifier instead.
        */
        @ApiMember(Description="DEPRECATED: Use Identifier instead.")
        public String SubjectIdentifier = null;

        /**
        * Unique identifier within the issuer for the end-user
        */
        @ApiMember(Description="Unique identifier within the issuer for the end-user")
        public String Identifier = null;
        
        public String getSubjectIdentifier() { return SubjectIdentifier; }
        public OpenIdConnectUser setSubjectIdentifier(String value) { this.SubjectIdentifier = value; return this; }
        public String getIdentifier() { return Identifier; }
        public OpenIdConnectUser setIdentifier(String value) { this.Identifier = value; return this; }
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

    public static class OpenIdConnectRelyingPartyConfiguration
    {
        /**
        * Issuer identifier
        */
        @ApiMember(Description="Issuer identifier")
        public String IssuerIdentifier = null;

        /**
        * The Relying Party client identifier
        */
        @ApiMember(Description="The Relying Party client identifier")
        public String ClientIdentifier = null;

        /**
        * The redirection URI for the authorization response; e.g. 'https://my-domain/AQUARIUS/apps/v1/auth/openidconnect'. Must exactly match what is specified in the OpenID Connect client for the provider used.
        */
        @ApiMember(Description="The redirection URI for the authorization response; e.g. \'https://my-domain/AQUARIUS/apps/v1/auth/openidconnect\'. Must exactly match what is specified in the OpenID Connect client for the provider used.")
        public String RedirectUri = null;

        /**
        * If not specified, defaults to 'openid', the standard scope required by the protocol.
        */
        @ApiMember(DataType="Array<string>", Description="If not specified, defaults to \'openid\', the standard scope required by the protocol.")
        public List<String> Scopes = null;

        /**
        * Optional list of hosted domains, supported for Google only
        */
        @ApiMember(DataType="Array<string>", Description="Optional list of hosted domains, supported for Google only")
        public List<String> HostedDomains = null;

        /**
        * Name of an ID token claim to use as the unique identifier for OpenID Connect users. The default behaviour is to use 'sub', the standard subject identifier claim, which is suitable for most configurations. Options vary by OpenID Connect provider. Note that if this is changed after OpenID Connect users are registered, they will not be able to login until their identifiers are updated.
        */
        @ApiMember(Description="Name of an ID token claim to use as the unique identifier for OpenID Connect users. The default behaviour is to use \'sub\', the standard subject identifier claim, which is suitable for most configurations. Options vary by OpenID Connect provider. Note that if this is changed after OpenID Connect users are registered, they will not be able to login until their identifiers are updated.")
        public String IdentifierClaim = null;

        /**
        * Short display name of the identity provider. If 'Google' or 'Microsoft', an appropriate icon will be displayed on the sign-in page.
        */
        @ApiMember(Description="Short display name of the identity provider. If \'Google\' or \'Microsoft\', an appropriate icon will be displayed on the sign-in page.")
        public String DisplayName = null;
        
        public String getIssuerIdentifier() { return IssuerIdentifier; }
        public OpenIdConnectRelyingPartyConfiguration setIssuerIdentifier(String value) { this.IssuerIdentifier = value; return this; }
        public String getClientIdentifier() { return ClientIdentifier; }
        public OpenIdConnectRelyingPartyConfiguration setClientIdentifier(String value) { this.ClientIdentifier = value; return this; }
        public String getRedirectUri() { return RedirectUri; }
        public OpenIdConnectRelyingPartyConfiguration setRedirectUri(String value) { this.RedirectUri = value; return this; }
        public List<String> getScopes() { return Scopes; }
        public OpenIdConnectRelyingPartyConfiguration setScopes(List<String> value) { this.Scopes = value; return this; }
        public List<String> getHostedDomains() { return HostedDomains; }
        public OpenIdConnectRelyingPartyConfiguration setHostedDomains(List<String> value) { this.HostedDomains = value; return this; }
        public String getIdentifierClaim() { return IdentifierClaim; }
        public OpenIdConnectRelyingPartyConfiguration setIdentifierClaim(String value) { this.IdentifierClaim = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public OpenIdConnectRelyingPartyConfiguration setDisplayName(String value) { this.DisplayName = value; return this; }
    }

    public static class Role
    {
        /**
        * Unique Id of the role
        */
        @ApiMember(DataType="string", Description="Unique Id of the role")
        public String UniqueId = null;

        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * List of approval transitions this role grants permission to perform.
        */
        @ApiMember(DataType="Array<RoleApprovalTransition>", Description="List of approval transitions this role grants permission to perform.")
        public ArrayList<RoleApprovalTransition> RoleApprovalTransitions = null;

        /**
        * True if role grants permission to: Read data and generate reports.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Read data and generate reports.")
        public Boolean CanReadData = null;

        /**
        * True if role grants permission to: Add data. Includes appending logger data, creating/editing field visits, and uploading attachments.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add data. Includes appending logger data, creating/editing field visits, and uploading attachments.")
        public Boolean CanAddData = null;

        /**
        * True if role grants permission to: Edit data. Includes making corrections to time series; editing curves and shifts within a rating model.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit data. Includes making corrections to time series; editing curves and shifts within a rating model.")
        public Boolean CanEditData = null;

        /**
        * True if role grants permission to: Edit location properties and derivations. Includes creating and editing time series, rating models, process settings.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit location properties and derivations. Includes creating and editing time series, rating models, process settings.")
        public Boolean CanEditLocationDetails = null;

        /**
        * True if role grants permission to: Add and remove locations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add and remove locations.")
        public Boolean CanAddOrRemoveLocations = null;

        /**
        * True if role grants permission to: Assign user roles for folders and locations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Assign user roles for folders and locations.")
        public Boolean CanAssignUserRoles = null;

        /**
        * True if role grants permission to: Remove field visits.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Remove field visits.")
        public Boolean CanRemoveFieldVisits = null;

        /**
        * True if role grants permission to: Add append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add append configurations.")
        public Boolean CanAddAppendConfigurations = null;

        /**
        * True if role grants permission to: Edit append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit append configurations.")
        public Boolean CanEditAppendConfigurations = null;

        /**
        * True if role grants permission to: Remove append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Remove append configurations.")
        public Boolean CanRemoveAppendConfigurations = null;
        
        public String getUniqueId() { return UniqueId; }
        public Role setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getName() { return Name; }
        public Role setName(String value) { this.Name = value; return this; }
        public ArrayList<RoleApprovalTransition> getRoleApprovalTransitions() { return RoleApprovalTransitions; }
        public Role setRoleApprovalTransitions(ArrayList<RoleApprovalTransition> value) { this.RoleApprovalTransitions = value; return this; }
        public Boolean isCanReadData() { return CanReadData; }
        public Role setCanReadData(Boolean value) { this.CanReadData = value; return this; }
        public Boolean isCanAddData() { return CanAddData; }
        public Role setCanAddData(Boolean value) { this.CanAddData = value; return this; }
        public Boolean isCanEditData() { return CanEditData; }
        public Role setCanEditData(Boolean value) { this.CanEditData = value; return this; }
        public Boolean isCanEditLocationDetails() { return CanEditLocationDetails; }
        public Role setCanEditLocationDetails(Boolean value) { this.CanEditLocationDetails = value; return this; }
        public Boolean isCanAddOrRemoveLocations() { return CanAddOrRemoveLocations; }
        public Role setCanAddOrRemoveLocations(Boolean value) { this.CanAddOrRemoveLocations = value; return this; }
        public Boolean isCanAssignUserRoles() { return CanAssignUserRoles; }
        public Role setCanAssignUserRoles(Boolean value) { this.CanAssignUserRoles = value; return this; }
        public Boolean isCanRemoveFieldVisits() { return CanRemoveFieldVisits; }
        public Role setCanRemoveFieldVisits(Boolean value) { this.CanRemoveFieldVisits = value; return this; }
        public Boolean isCanAddAppendConfigurations() { return CanAddAppendConfigurations; }
        public Role setCanAddAppendConfigurations(Boolean value) { this.CanAddAppendConfigurations = value; return this; }
        public Boolean isCanEditAppendConfigurations() { return CanEditAppendConfigurations; }
        public Role setCanEditAppendConfigurations(Boolean value) { this.CanEditAppendConfigurations = value; return this; }
        public Boolean isCanRemoveAppendConfigurations() { return CanRemoveAppendConfigurations; }
        public Role setCanRemoveAppendConfigurations(Boolean value) { this.CanRemoveAppendConfigurations = value; return this; }
    }

    public static class RoleFlattened extends RoleFlattenedBase
    {
        /**
        * Unique Id of the role
        */
        @ApiMember(DataType="string", Description="Unique Id of the role")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public RoleFlattened setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    public static class RolesResponse
    {
        /**
        * The list of roles
        */
        @ApiMember(DataType="Array<Role>", Description="The list of roles")
        public ArrayList<Role> Results = null;
        
        public ArrayList<Role> getResults() { return Results; }
        public RolesResponse setResults(ArrayList<Role> value) { this.Results = value; return this; }
    }

    public static class NameTagsResponse
    {
        /**
        * The list of tags
        */
        @ApiMember(DataType="Array<NameTag>", Description="The list of tags")
        public ArrayList<NameTag> Results = null;
        
        public ArrayList<NameTag> getResults() { return Results; }
        public NameTagsResponse setResults(ArrayList<NameTag> value) { this.Results = value; return this; }
    }

    public static class NameTag
    {
        /**
        * Unique ID of the tag
        */
        @ApiMember(DataType="string", Description="Unique ID of the tag")
        public String UniqueId = null;

        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;
        
        public String getUniqueId() { return UniqueId; }
        public NameTag setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getName() { return Name; }
        public NameTag setName(String value) { this.Name = value; return this; }
    }

    public static class ReportPluginResponse
    {
        /**
        * The list of registered reports
        */
        @ApiMember(DataType="Array<ReportPlugin>", Description="The list of registered reports")
        public ArrayList<ReportPlugin> Results = null;
        
        public ArrayList<ReportPlugin> getResults() { return Results; }
        public ReportPluginResponse setResults(ArrayList<ReportPlugin> value) { this.Results = value; return this; }
    }

    public static class ReportPlugin
    {
        /**
        * Unique ID of the registered report plug-in
        */
        @ApiMember(DataType="string", Description="Unique ID of the registered report plug-in")
        public String UniqueId = null;

        /**
        * Name of the assembly of the report plug-in
        */
        @ApiMember(Description="Name of the assembly of the report plug-in")
        public String AssemblyName = null;

        /**
        * Plug-in folder name
        */
        @ApiMember(Description="Plug-in folder name")
        public String FolderName = null;

        /**
        * Is enabled
        */
        @ApiMember(DataType="boolean", Description="Is enabled")
        public Boolean IsEnabled = null;
        
        public String getUniqueId() { return UniqueId; }
        public ReportPlugin setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getAssemblyName() { return AssemblyName; }
        public ReportPlugin setAssemblyName(String value) { this.AssemblyName = value; return this; }
        public String getFolderName() { return FolderName; }
        public ReportPlugin setFolderName(String value) { this.FolderName = value; return this; }
        public Boolean getIsEnabled() { return IsEnabled; }
        public ReportPlugin setIsEnabled(Boolean value) { this.IsEnabled = value; return this; }
    }

    public static class Sensor
    {
        /**
        * Unique ID
        */
        @ApiMember(DataType="string", Description="Unique ID")
        public String UniqueId = null;

        /**
        * Location Unique ID
        */
        @ApiMember(DataType="string", Description="Location Unique ID")
        public String LocationUniqueId = null;

        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Parameter ID
        */
        @ApiMember(Description="Parameter ID")
        public String ParameterId = null;

        /**
        * Monitoring method code
        */
        @ApiMember(Description="Monitoring method code")
        public String MethodCode = null;

        /**
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Manufacturer
        */
        @ApiMember(Description="Manufacturer")
        public String Manufacturer = null;

        /**
        * Model
        */
        @ApiMember(Description="Model")
        public String Model = null;

        /**
        * Serial Number
        */
        @ApiMember(Description="Serial Number")
        public String SerialNumber = null;

        /**
        * Last modified time (UTC)
        */
        @ApiMember(DataType="Instant", Description="Last modified time (UTC)")
        public Instant LastModifiedUtc = null;

        /**
        * Tags
        */
        @ApiMember(DataType="Array<AppliedTag>", Description="Tags")
        public ArrayList<AppliedTag> Tags = null;
        
        public String getUniqueId() { return UniqueId; }
        public Sensor setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getLocationUniqueId() { return LocationUniqueId; }
        public Sensor setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getName() { return Name; }
        public Sensor setName(String value) { this.Name = value; return this; }
        public String getParameterId() { return ParameterId; }
        public Sensor setParameterId(String value) { this.ParameterId = value; return this; }
        public String getMethodCode() { return MethodCode; }
        public Sensor setMethodCode(String value) { this.MethodCode = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public Sensor setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public String getComments() { return Comments; }
        public Sensor setComments(String value) { this.Comments = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public Sensor setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public Sensor setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public Sensor setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public Instant getLastModifiedUtc() { return LastModifiedUtc; }
        public Sensor setLastModifiedUtc(Instant value) { this.LastModifiedUtc = value; return this; }
        public ArrayList<AppliedTag> getTags() { return Tags; }
        public Sensor setTags(ArrayList<AppliedTag> value) { this.Tags = value; return this; }
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

    public static class Setting
    {
        /**
        * Setting group
        */
        @ApiMember(Description="Setting group")
        public String Group = null;

        /**
        * Setting key
        */
        @ApiMember(Description="Setting key")
        public String Key = null;

        /**
        * Setting value
        */
        @ApiMember(Description="Setting value")
        public String Value = null;

        /**
        * Setting description
        */
        @ApiMember(Description="Setting description")
        public String Description = null;

        /**
        * True if the unit is required by the system
        */
        @ApiMember(DataType="boolean", Description="True if the unit is required by the system")
        public Boolean IsSystem = null;

        /**
        * Last modified time
        */
        @ApiMember(DataType="Instant", Description="Last modified time")
        public Instant LastModifiedTime = null;
        
        public String getGroup() { return Group; }
        public Setting setGroup(String value) { this.Group = value; return this; }
        public String getKey() { return Key; }
        public Setting setKey(String value) { this.Key = value; return this; }
        public String getValue() { return Value; }
        public Setting setValue(String value) { this.Value = value; return this; }
        public String getDescription() { return Description; }
        public Setting setDescription(String value) { this.Description = value; return this; }
        public Boolean getIsSystem() { return IsSystem; }
        public Setting setIsSystem(Boolean value) { this.IsSystem = value; return this; }
        public Instant getLastModifiedTime() { return LastModifiedTime; }
        public Setting setLastModifiedTime(Instant value) { this.LastModifiedTime = value; return this; }
    }

    public static class SettingsResponse
    {
        /**
        * The list of settings
        */
        @ApiMember(DataType="Array<Setting>", Description="The list of settings")
        public ArrayList<Setting> Results = null;
        
        public ArrayList<Setting> getResults() { return Results; }
        public SettingsResponse setResults(ArrayList<Setting> value) { this.Results = value; return this; }
    }

    public static class DropDownListResponse
    {
        /**
        * The list of drop-down lists
        */
        @ApiMember(DataType="Array<DropDownList>", Description="The list of drop-down lists")
        public ArrayList<DropDownList> Results = null;
        
        public ArrayList<DropDownList> getResults() { return Results; }
        public DropDownListResponse setResults(ArrayList<DropDownList> value) { this.Results = value; return this; }
    }

    public static class ConfigurableDropDownListItemsResponse
    {
        /**
        * The list of configurable drop-down list items
        */
        @ApiMember(DataType="Array<ConfigurableDropDownListItem>", Description="The list of configurable drop-down list items")
        public ArrayList<ConfigurableDropDownListItem> Results = null;
        
        public ArrayList<ConfigurableDropDownListItem> getResults() { return Results; }
        public ConfigurableDropDownListItemsResponse setResults(ArrayList<ConfigurableDropDownListItem> value) { this.Results = value; return this; }
    }

    public static class ConfigurableDropDownListItem extends FixedDropDownListItem
    {
        /**
        * A value used to control the order of items in lists. Items with lower numbers will appear before items with higher numbers.
        */
        @ApiMember(DataType="integer", Description="A value used to control the order of items in lists. Items with lower numbers will appear before items with higher numbers.")
        public Integer DisplayOrder = null;
        
        public Integer getDisplayOrder() { return DisplayOrder; }
        public ConfigurableDropDownListItem setDisplayOrder(Integer value) { this.DisplayOrder = value; return this; }
    }

    public static class FixedDropDownListItemsResponse
    {
        /**
        * The list of fixed drop-down list items
        */
        @ApiMember(DataType="Array<FixedDropDownListItem>", Description="The list of fixed drop-down list items")
        public ArrayList<FixedDropDownListItem> Results = null;
        
        public ArrayList<FixedDropDownListItem> getResults() { return Results; }
        public FixedDropDownListItemsResponse setResults(ArrayList<FixedDropDownListItem> value) { this.Results = value; return this; }
    }

    public static class FixedDropDownListItem
    {
        /**
        * Key for the list the item belongs to.
        */
        @ApiMember(Description="Key for the list the item belongs to.")
        public String DropDownListId = null;

        /**
        * Display name for the list the item belongs to.
        */
        @ApiMember(Description="Display name for the list the item belongs to.")
        public String DropDownListDisplayName = null;

        /**
        * Key for the list item.
        */
        @ApiMember(Description="Key for the list item.")
        public String Id = null;

        /**
        * Display name for the list item.
        */
        @ApiMember(Description="Display name for the list item.")
        public String DisplayName = null;
        
        public String getDropDownListId() { return DropDownListId; }
        public FixedDropDownListItem setDropDownListId(String value) { this.DropDownListId = value; return this; }
        public String getDropDownListDisplayName() { return DropDownListDisplayName; }
        public FixedDropDownListItem setDropDownListDisplayName(String value) { this.DropDownListDisplayName = value; return this; }
        public String getId() { return Id; }
        public FixedDropDownListItem setId(String value) { this.Id = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public FixedDropDownListItem setDisplayName(String value) { this.DisplayName = value; return this; }
    }

    public static class ThresholdType
    {
        /**
        * Reference Value Code
        */
        @ApiMember(Description="Reference Value Code")
        public String ReferenceValueCode = null;

        /**
        * Severity
        */
        @ApiMember(DataType="ThresholdTypeSeverity", Description="Severity")
        public ThresholdTypeSeverity Severity = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Direction of positive elevations in relation to the reference standard
        */
        @ApiMember(DataType="ThresholdBehavior", Description="Direction of positive elevations in relation to the reference standard")
        public ThresholdBehavior CheckForBehavior = null;

        /**
        * Direction of positive elevations in relation to the reference standard
        */
        @ApiMember(DataType="ThresholdSuppressionOption", Description="Direction of positive elevations in relation to the reference standard")
        public ThresholdSuppressionOption ThresholdSuppressionOption = null;
        
        public String getReferenceValueCode() { return ReferenceValueCode; }
        public ThresholdType setReferenceValueCode(String value) { this.ReferenceValueCode = value; return this; }
        public ThresholdTypeSeverity getSeverity() { return Severity; }
        public ThresholdType setSeverity(ThresholdTypeSeverity value) { this.Severity = value; return this; }
        public String getDescription() { return Description; }
        public ThresholdType setDescription(String value) { this.Description = value; return this; }
        public ThresholdBehavior getCheckForBehavior() { return CheckForBehavior; }
        public ThresholdType setCheckForBehavior(ThresholdBehavior value) { this.CheckForBehavior = value; return this; }
        public ThresholdSuppressionOption getThresholdSuppressionOption() { return ThresholdSuppressionOption; }
        public ThresholdType setThresholdSuppressionOption(ThresholdSuppressionOption value) { this.ThresholdSuppressionOption = value; return this; }
    }

    public static class ThresholdTypesResponse
    {
        /**
        * The list of threshold types
        */
        @ApiMember(DataType="Array<ThresholdType>", Description="The list of threshold types")
        public ArrayList<ThresholdType> Results = null;
        
        public ArrayList<ThresholdType> getResults() { return Results; }
        public ThresholdTypesResponse setResults(ArrayList<ThresholdType> value) { this.Results = value; return this; }
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

    public static class CodeTableResponse
    {
        /**
        * The list of codes
        */
        @ApiMember(DataType="Array<CodeTable>", Description="The list of codes")
        public ArrayList<CodeTable> Results = null;
        
        public ArrayList<CodeTable> getResults() { return Results; }
        public CodeTableResponse setResults(ArrayList<CodeTable> value) { this.Results = value; return this; }
    }

    public static class CodeTable extends CodeTableRequestBase
    {
        /**
        * True if item is required by the system.
        */
        @ApiMember(DataType="boolean", Description="True if item is required by the system.")
        public Boolean IsSystem = null;

        /**
        * Used by the system to identify items with specific meanings.
        */
        @ApiMember(Description="Used by the system to identify items with specific meanings.")
        public String SystemCode = null;
        
        public Boolean getIsSystem() { return IsSystem; }
        public CodeTable setIsSystem(Boolean value) { this.IsSystem = value; return this; }
        public String getSystemCode() { return SystemCode; }
        public CodeTable setSystemCode(String value) { this.SystemCode = value; return this; }
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

    public static class QualifierResponse extends QualifierBase
    {
        /**
        * Unique ID of the qualifier 
        */
        @ApiMember(DataType="string", Description="Unique ID of the qualifier ")
        public String UniqueId = null;

        /**
        * True if the qualifier is required by the system
        */
        @ApiMember(DataType="boolean", Description="True if the qualifier is required by the system")
        public Boolean IsSystem = null;
        
        public String getUniqueId() { return UniqueId; }
        public QualifierResponse setUniqueId(String value) { this.UniqueId = value; return this; }
        public Boolean getIsSystem() { return IsSystem; }
        public QualifierResponse setIsSystem(Boolean value) { this.IsSystem = value; return this; }
    }

    public static class QualifiersResponse
    {
        /**
        * The list of qualifiers
        */
        @ApiMember(DataType="Array<QualifierResponse>", Description="The list of qualifiers")
        public ArrayList<QualifierResponse> Results = null;
        
        public ArrayList<QualifierResponse> getResults() { return Results; }
        public QualifiersResponse setResults(ArrayList<QualifierResponse> value) { this.Results = value; return this; }
    }

    public static class LocationUserRoles
    {
        /**
        * Unique Id of the location
        */
        @ApiMember(DataType="string", Description="Unique Id of the location")
        public String LocationUniqueId = null;

        /**
        * List of user roles applicable to this location
        */
        @ApiMember(DataType="Array<LocationUserRole>", Description="List of user roles applicable to this location")
        public ArrayList<LocationUserRole> Roles = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public LocationUserRoles setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public ArrayList<LocationUserRole> getRoles() { return Roles; }
        public LocationUserRoles setRoles(ArrayList<LocationUserRole> value) { this.Roles = value; return this; }
    }

    public static class LocationFolderUserRoles
    {
        /**
        * Unique Id of the location folder
        */
        @ApiMember(DataType="string", Description="Unique Id of the location folder")
        public String LocationFolderUniqueId = null;

        /**
        * List of user roles applicable to this location folder
        */
        @ApiMember(DataType="Array<LocationFolderUserRole>", Description="List of user roles applicable to this location folder")
        public ArrayList<LocationFolderUserRole> Roles = null;
        
        public String getLocationFolderUniqueId() { return LocationFolderUniqueId; }
        public LocationFolderUserRoles setLocationFolderUniqueId(String value) { this.LocationFolderUniqueId = value; return this; }
        public ArrayList<LocationFolderUserRole> getRoles() { return Roles; }
        public LocationFolderUserRoles setRoles(ArrayList<LocationFolderUserRole> value) { this.Roles = value; return this; }
    }

    public static class LocationUserRole extends LocationFolderUserRole
    {
        /**
        * Unique id of the location this role is applied to
        */
        @ApiMember(DataType="string", Description="Unique id of the location this role is applied to")
        public String AppliedToLocationUniqueId = null;
        
        public String getAppliedToLocationUniqueId() { return AppliedToLocationUniqueId; }
        public LocationUserRole setAppliedToLocationUniqueId(String value) { this.AppliedToLocationUniqueId = value; return this; }
    }

    public static class LocationFolderUserRole
    {
        /**
        * Unique id of the location folder this role is applied to
        */
        @ApiMember(DataType="string", Description="Unique id of the location folder this role is applied to")
        public String AppliedToLocationFolderUniqueId = null;

        /**
        * Name of the location folder this role is applied to
        */
        @ApiMember(Description="Name of the location folder this role is applied to")
        public String AppliedToLocationFolderName = null;

        /**
        * True if role is inherited from a parent location folder
        */
        @ApiMember(DataType="boolean", Description="True if role is inherited from a parent location folder")
        public Boolean InheritedFromParentLocationFolder = null;

        /**
        * Unique id of user with this role
        */
        @ApiMember(DataType="string", Description="Unique id of user with this role")
        public String UserUniqueId = null;

        /**
        * Login name of user with this role
        */
        @ApiMember(Description="Login name of user with this role")
        public String UserLoginName = null;

        /**
        * Unique id of the role this user has
        */
        @ApiMember(DataType="string", Description="Unique id of the role this user has")
        public String RoleUniqueId = null;

        /**
        * Name of the role this user has
        */
        @ApiMember(Description="Name of the role this user has")
        public String RoleName = null;
        
        public String getAppliedToLocationFolderUniqueId() { return AppliedToLocationFolderUniqueId; }
        public LocationFolderUserRole setAppliedToLocationFolderUniqueId(String value) { this.AppliedToLocationFolderUniqueId = value; return this; }
        public String getAppliedToLocationFolderName() { return AppliedToLocationFolderName; }
        public LocationFolderUserRole setAppliedToLocationFolderName(String value) { this.AppliedToLocationFolderName = value; return this; }
        public Boolean isInheritedFromParentLocationFolder() { return InheritedFromParentLocationFolder; }
        public LocationFolderUserRole setInheritedFromParentLocationFolder(Boolean value) { this.InheritedFromParentLocationFolder = value; return this; }
        public String getUserUniqueId() { return UserUniqueId; }
        public LocationFolderUserRole setUserUniqueId(String value) { this.UserUniqueId = value; return this; }
        public String getUserLoginName() { return UserLoginName; }
        public LocationFolderUserRole setUserLoginName(String value) { this.UserLoginName = value; return this; }
        public String getRoleUniqueId() { return RoleUniqueId; }
        public LocationFolderUserRole setRoleUniqueId(String value) { this.RoleUniqueId = value; return this; }
        public String getRoleName() { return RoleName; }
        public LocationFolderUserRole setRoleName(String value) { this.RoleName = value; return this; }
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
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Tags applied to this location
        */
        @ApiMember(DataType="Array<AppliedTag>", Description="Tags applied to this location")
        public ArrayList<AppliedTag> Tags = null;

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
        public Boolean isPublish() { return Publish; }
        public Location setPublish(Boolean value) { this.Publish = value; return this; }
        public ArrayList<AppliedTag> getTags() { return Tags; }
        public Location setTags(ArrayList<AppliedTag> value) { this.Tags = value; return this; }
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

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Method
        */
        @ApiMember(Description="Method")
        public String Method = null;

        /**
        * Uncertainty
        */
        @ApiMember(DataType="double", Description="Uncertainty")
        public Double Uncertainty = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public StandardReferenceDatum setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getStandardIdentifier() { return StandardIdentifier; }
        public StandardReferenceDatum setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public Boolean getIsBaseReference() { return IsBaseReference; }
        public StandardReferenceDatum setIsBaseReference(Boolean value) { this.IsBaseReference = value; return this; }
        public Double getOffsetToBaseReference() { return OffsetToBaseReference; }
        public StandardReferenceDatum setOffsetToBaseReference(Double value) { this.OffsetToBaseReference = value; return this; }
        public String getComments() { return Comments; }
        public StandardReferenceDatum setComments(String value) { this.Comments = value; return this; }
        public String getMethod() { return Method; }
        public StandardReferenceDatum setMethod(String value) { this.Method = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public StandardReferenceDatum setUncertainty(Double value) { this.Uncertainty = value; return this; }
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

        /**
        * Is enabled
        */
        @ApiMember(DataType="boolean", Description="Is enabled")
        public Boolean IsEnabled = null;
        
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
        public Boolean getIsEnabled() { return IsEnabled; }
        public FieldDataPlugin setIsEnabled(Boolean value) { this.IsEnabled = value; return this; }
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

    public static enum TagValueType
    {
        Unknown,
        None,
        PickList;
    }

    public static enum TagApplicability
    {
        AppliesToLocations,
        AppliesToLocationNotes,
        AppliesToSensorsGauges;
    }

    public static class TagRequestBase
    {
        /**
        * Unique tag key
        */
        @ApiMember(Description="Unique tag key", IsRequired=true)
        public String Key = null;

        /**
        * Value type of the tag. Defaults to None.
        */
        @ApiMember(DataType="TagValueType", Description="Value type of the tag. Defaults to None.")
        public TagValueType ValueType = null;

        /**
        * Set of pick-list values. Required if ValueType is PickList. Values must be distinct.
        */
        @ApiMember(DataType="Array<string>", Description="Set of pick-list values. Required if ValueType is PickList. Values must be distinct.")
        public ArrayList<String> PickListValues = null;

        /**
        * If set, create tag with specified applicability, selected from one or more: AppliesToLocations, AppliesToLocationNotes, AppliesToSensorsGauges.  When omitted, the tag is applicable to all.
        */
        @ApiMember(DataType="Array<TagApplicability>", Description="If set, create tag with specified applicability, selected from one or more: AppliesToLocations, AppliesToLocationNotes, AppliesToSensorsGauges.  When omitted, the tag is applicable to all.")
        public ArrayList<TagApplicability> Applicability = null;
        
        public String getKey() { return Key; }
        public TagRequestBase setKey(String value) { this.Key = value; return this; }
        public TagValueType getValueType() { return ValueType; }
        public TagRequestBase setValueType(TagValueType value) { this.ValueType = value; return this; }
        public ArrayList<String> getPickListValues() { return PickListValues; }
        public TagRequestBase setPickListValues(ArrayList<String> value) { this.PickListValues = value; return this; }
        public ArrayList<TagApplicability> getApplicability() { return Applicability; }
        public TagRequestBase setApplicability(ArrayList<TagApplicability> value) { this.Applicability = value; return this; }
    }

    public static class ApprovalLevelBase
    {
        /**
        * Approval Level. Values &gt;=1000 are locking levels
        */
        @ApiMember(DataType="long integer", Description="Approval Level. Values &gt;=1000 are locking levels", IsRequired=true)
        public Long ApprovalLevel = null;

        /**
        * Color value in #RRGGBB hexadecimal
        */
        @ApiMember(Description="Color value in #RRGGBB hexadecimal", IsRequired=true)
        public String Color = null;

        /**
        * Description
        */
        @ApiMember(Description="Description", IsRequired=true)
        public String Description = null;
        
        public Long getApprovalLevel() { return ApprovalLevel; }
        public ApprovalLevelBase setApprovalLevel(Long value) { this.ApprovalLevel = value; return this; }
        public String getColor() { return Color; }
        public ApprovalLevelBase setColor(String value) { this.Color = value; return this; }
        public String getDescription() { return Description; }
        public ApprovalLevelBase setDescription(String value) { this.Description = value; return this; }
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

    public static interface IPostTimeSeriesRequest
    {
        public String LocationUniqueId = null;
        public String Label = null;
        public String Parameter = null;
        public String Unit = null;
        public InterpolationType InterpolationType = null;
        public String SubLocationIdentifier = null;
        public String UtcOffset = null;
        public Boolean Publish = null;
        public String Description = null;
        public String Comment = null;
        public String Method = null;
        public String ComputationIdentifier = null;
        public String ComputationPeriodIdentifier = null;
        public List<ExtendedAttributeValue> ExtendedAttributeValues = null;
    }

    public static enum TimeSeriesType
    {
        Unknown(0),
        ProcessorBasic(1),
        ProcessorDerived(2),
        Reflected(4);

        private final int value;
        TimeSeriesType(final int intValue) { value = intValue; }
        public int getValue() { return value; }
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
        * Numeric type
        */
        @ApiMember(Description="Numeric type")
        public String NumericType = null;

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
        @ApiMember(DataType="integer", Description="Numeric precision")
        public Integer NumericPrecision = null;

        /**
        * Numeric scale
        */
        @ApiMember(DataType="integer", Description="Numeric scale")
        public Integer NumericScale = null;

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
        public String getNumericType() { return NumericType; }
        public ExtendedAttributeField setNumericType(String value) { this.NumericType = value; return this; }
        public Boolean isCanBeEmpty() { return CanBeEmpty; }
        public ExtendedAttributeField setCanBeEmpty(Boolean value) { this.CanBeEmpty = value; return this; }
        public Boolean getIsReadOnly() { return IsReadOnly; }
        public ExtendedAttributeField setIsReadOnly(Boolean value) { this.IsReadOnly = value; return this; }
        public Integer getNumericPrecision() { return NumericPrecision; }
        public ExtendedAttributeField setNumericPrecision(Integer value) { this.NumericPrecision = value; return this; }
        public Integer getNumericScale() { return NumericScale; }
        public ExtendedAttributeField setNumericScale(Integer value) { this.NumericScale = value; return this; }
        public Integer getColumnSize() { return ColumnSize; }
        public ExtendedAttributeField setColumnSize(Integer value) { this.ColumnSize = value; return this; }
        public List<String> getValueOptions() { return ValueOptions; }
        public ExtendedAttributeField setValueOptions(List<String> value) { this.ValueOptions = value; return this; }
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

    public static interface IOpenIdConnectUserAuth
    {
        public String SubjectIdentifier = null;
        public String Identifier = null;
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
        * The redirection URI for the authorization response; e.g. 'https://my-domain/AQUARIUS/apps/v1/auth/openidconnect'. Must exactly match what is specified in the OpenID Connect client for the provider used.
        */
        @ApiMember(Description="The redirection URI for the authorization response; e.g. \'https://my-domain/AQUARIUS/apps/v1/auth/openidconnect\'. Must exactly match what is specified in the OpenID Connect client for the provider used.", IsRequired=true)
        public String RedirectUri = null;

        /**
        * If not specified, defaults to 'openid', the standard scope required by the protocol.
        */
        @ApiMember(DataType="Array<string>", Description="If not specified, defaults to \'openid\', the standard scope required by the protocol.")
        public List<String> Scopes = null;

        /**
        * Optional list of hosted domains, supported for Google only
        */
        @ApiMember(DataType="Array<string>", Description="Optional list of hosted domains, supported for Google only")
        public List<String> HostedDomains = null;

        /**
        * Name of an ID token claim to use as the unique identifier for OpenID Connect users. The default behaviour is to use 'sub', the standard subject identifier claim, which is suitable for most configurations. Options vary by OpenID Connect provider. Note that if this is changed after OpenID Connect users are registered, they will not be able to login until their identifiers are updated.
        */
        @ApiMember(Description="Name of an ID token claim to use as the unique identifier for OpenID Connect users. The default behaviour is to use \'sub\', the standard subject identifier claim, which is suitable for most configurations. Options vary by OpenID Connect provider. Note that if this is changed after OpenID Connect users are registered, they will not be able to login until their identifiers are updated.")
        public String IdentifierClaim = null;

        /**
        * Short display name of the identity provider. If 'Google' or 'Microsoft', an appropriate icon will be displayed on the sign-in page.
        */
        @ApiMember(Description="Short display name of the identity provider. If \'Google\' or \'Microsoft\', an appropriate icon will be displayed on the sign-in page.")
        public String DisplayName = null;
        
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
        public String getIdentifierClaim() { return IdentifierClaim; }
        public OpenIdConnectRelyingPartyConfigurationBase setIdentifierClaim(String value) { this.IdentifierClaim = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public OpenIdConnectRelyingPartyConfigurationBase setDisplayName(String value) { this.DisplayName = value; return this; }
    }

    public static class RoleApprovalTransition
    {
        /**
        * Approval level of data before permitted transition.
        */
        @ApiMember(DataType="long integer", Description="Approval level of data before permitted transition.", IsRequired=true)
        public Long FromApprovalLevel = null;

        /**
        * Approval level of data after permitted transition.
        */
        @ApiMember(DataType="long integer", Description="Approval level of data after permitted transition.", IsRequired=true)
        public Long ToApprovalLevel = null;
        
        public Long getFromApprovalLevel() { return FromApprovalLevel; }
        public RoleApprovalTransition setFromApprovalLevel(Long value) { this.FromApprovalLevel = value; return this; }
        public Long getToApprovalLevel() { return ToApprovalLevel; }
        public RoleApprovalTransition setToApprovalLevel(Long value) { this.ToApprovalLevel = value; return this; }
    }

    public static class RoleFlattenedBase
    {
        /**
        * Name
        */
        @ApiMember(Description="Name", IsRequired=true)
        public String Name = null;

        /**
        * List of approval transitions this role grants permission to perform. Format: '&lt;FromLevel&gt; &lt;ToLevel&gt;'. Example: '900 1200'
        */
        @ApiMember(DataType="Array<string>", Description="List of approval transitions this role grants permission to perform. Format: \'&lt;FromLevel&gt; &lt;ToLevel&gt;\'. Example: \'900 1200\'")
        public ArrayList<String> RoleApprovalTransitions = null;

        /**
        * True if role grants permission to: Read data and generate reports.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Read data and generate reports.")
        public Boolean CanReadData = null;

        /**
        * True if role grants permission to: Add data. Includes appending logger data, creating/editing field visits, and uploading attachments.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add data. Includes appending logger data, creating/editing field visits, and uploading attachments.")
        public Boolean CanAddData = null;

        /**
        * True if role grants permission to: Edit data. Includes making corrections to time series; editing curves and shifts within a rating model.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit data. Includes making corrections to time series; editing curves and shifts within a rating model.")
        public Boolean CanEditData = null;

        /**
        * True if role grants permission to: Edit location properties and derivations. Includes creating and editing time series, rating models, process settings.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit location properties and derivations. Includes creating and editing time series, rating models, process settings.")
        public Boolean CanEditLocationDetails = null;

        /**
        * True if role grants permission to: Add and remove locations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add and remove locations.")
        public Boolean CanAddOrRemoveLocations = null;

        /**
        * True if role grants permission to: Assign user roles for folders and locations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Assign user roles for folders and locations.")
        public Boolean CanAssignUserRoles = null;

        /**
        * True if role grants permission to: Remove field visits.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Remove field visits.")
        public Boolean CanRemoveFieldVisits = null;

        /**
        * True if role grants permission to: Add append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add append configurations.")
        public Boolean CanAddAppendConfigurations = null;

        /**
        * True if role grants permission to: Edit append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit append configurations.")
        public Boolean CanEditAppendConfigurations = null;

        /**
        * True if role grants permission to: Remove append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Remove append configurations.")
        public Boolean CanRemoveAppendConfigurations = null;
        
        public String getName() { return Name; }
        public RoleFlattenedBase setName(String value) { this.Name = value; return this; }
        public ArrayList<String> getRoleApprovalTransitions() { return RoleApprovalTransitions; }
        public RoleFlattenedBase setRoleApprovalTransitions(ArrayList<String> value) { this.RoleApprovalTransitions = value; return this; }
        public Boolean isCanReadData() { return CanReadData; }
        public RoleFlattenedBase setCanReadData(Boolean value) { this.CanReadData = value; return this; }
        public Boolean isCanAddData() { return CanAddData; }
        public RoleFlattenedBase setCanAddData(Boolean value) { this.CanAddData = value; return this; }
        public Boolean isCanEditData() { return CanEditData; }
        public RoleFlattenedBase setCanEditData(Boolean value) { this.CanEditData = value; return this; }
        public Boolean isCanEditLocationDetails() { return CanEditLocationDetails; }
        public RoleFlattenedBase setCanEditLocationDetails(Boolean value) { this.CanEditLocationDetails = value; return this; }
        public Boolean isCanAddOrRemoveLocations() { return CanAddOrRemoveLocations; }
        public RoleFlattenedBase setCanAddOrRemoveLocations(Boolean value) { this.CanAddOrRemoveLocations = value; return this; }
        public Boolean isCanAssignUserRoles() { return CanAssignUserRoles; }
        public RoleFlattenedBase setCanAssignUserRoles(Boolean value) { this.CanAssignUserRoles = value; return this; }
        public Boolean isCanRemoveFieldVisits() { return CanRemoveFieldVisits; }
        public RoleFlattenedBase setCanRemoveFieldVisits(Boolean value) { this.CanRemoveFieldVisits = value; return this; }
        public Boolean isCanAddAppendConfigurations() { return CanAddAppendConfigurations; }
        public RoleFlattenedBase setCanAddAppendConfigurations(Boolean value) { this.CanAddAppendConfigurations = value; return this; }
        public Boolean isCanEditAppendConfigurations() { return CanEditAppendConfigurations; }
        public RoleFlattenedBase setCanEditAppendConfigurations(Boolean value) { this.CanEditAppendConfigurations = value; return this; }
        public Boolean isCanRemoveAppendConfigurations() { return CanRemoveAppendConfigurations; }
        public RoleFlattenedBase setCanRemoveAppendConfigurations(Boolean value) { this.CanRemoveAppendConfigurations = value; return this; }
    }

    public static class RoleBase
    {
        /**
        * Name
        */
        @ApiMember(Description="Name", IsRequired=true)
        public String Name = null;

        /**
        * List of approval transitions this role grants permission to perform.
        */
        @ApiMember(DataType="Array<RoleApprovalTransition>", Description="List of approval transitions this role grants permission to perform.")
        public ArrayList<RoleApprovalTransition> RoleApprovalTransitions = null;

        /**
        * True if role grants permission to: Read data and generate reports.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Read data and generate reports.")
        public Boolean CanReadData = null;

        /**
        * True if role grants permission to: Add data. Includes appending logger data, creating/editing field visits, and uploading attachments.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add data. Includes appending logger data, creating/editing field visits, and uploading attachments.")
        public Boolean CanAddData = null;

        /**
        * True if role grants permission to: Edit data. Includes making corrections to time series; editing curves and shifts within a rating model.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit data. Includes making corrections to time series; editing curves and shifts within a rating model.")
        public Boolean CanEditData = null;

        /**
        * True if role grants permission to: Edit location properties and derivations. Includes creating and editing time series, rating models, process settings.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit location properties and derivations. Includes creating and editing time series, rating models, process settings.")
        public Boolean CanEditLocationDetails = null;

        /**
        * True if role grants permission to: Add and remove locations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add and remove locations.")
        public Boolean CanAddOrRemoveLocations = null;

        /**
        * True if role grants permission to: Assign user roles for folders and locations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Assign user roles for folders and locations.")
        public Boolean CanAssignUserRoles = null;

        /**
        * True if role grants permission to: Remove field visits.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Remove field visits.")
        public Boolean CanRemoveFieldVisits = null;

        /**
        * True if role grants permission to: Add append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Add append configurations.")
        public Boolean CanAddAppendConfigurations = null;

        /**
        * True if role grants permission to: Edit append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Edit append configurations.")
        public Boolean CanEditAppendConfigurations = null;

        /**
        * True if role grants permission to: Remove append configurations.
        */
        @ApiMember(DataType="boolean", Description="True if role grants permission to: Remove append configurations.")
        public Boolean CanRemoveAppendConfigurations = null;
        
        public String getName() { return Name; }
        public RoleBase setName(String value) { this.Name = value; return this; }
        public ArrayList<RoleApprovalTransition> getRoleApprovalTransitions() { return RoleApprovalTransitions; }
        public RoleBase setRoleApprovalTransitions(ArrayList<RoleApprovalTransition> value) { this.RoleApprovalTransitions = value; return this; }
        public Boolean isCanReadData() { return CanReadData; }
        public RoleBase setCanReadData(Boolean value) { this.CanReadData = value; return this; }
        public Boolean isCanAddData() { return CanAddData; }
        public RoleBase setCanAddData(Boolean value) { this.CanAddData = value; return this; }
        public Boolean isCanEditData() { return CanEditData; }
        public RoleBase setCanEditData(Boolean value) { this.CanEditData = value; return this; }
        public Boolean isCanEditLocationDetails() { return CanEditLocationDetails; }
        public RoleBase setCanEditLocationDetails(Boolean value) { this.CanEditLocationDetails = value; return this; }
        public Boolean isCanAddOrRemoveLocations() { return CanAddOrRemoveLocations; }
        public RoleBase setCanAddOrRemoveLocations(Boolean value) { this.CanAddOrRemoveLocations = value; return this; }
        public Boolean isCanAssignUserRoles() { return CanAssignUserRoles; }
        public RoleBase setCanAssignUserRoles(Boolean value) { this.CanAssignUserRoles = value; return this; }
        public Boolean isCanRemoveFieldVisits() { return CanRemoveFieldVisits; }
        public RoleBase setCanRemoveFieldVisits(Boolean value) { this.CanRemoveFieldVisits = value; return this; }
        public Boolean isCanAddAppendConfigurations() { return CanAddAppendConfigurations; }
        public RoleBase setCanAddAppendConfigurations(Boolean value) { this.CanAddAppendConfigurations = value; return this; }
        public Boolean isCanEditAppendConfigurations() { return CanEditAppendConfigurations; }
        public RoleBase setCanEditAppendConfigurations(Boolean value) { this.CanEditAppendConfigurations = value; return this; }
        public Boolean isCanRemoveAppendConfigurations() { return CanRemoveAppendConfigurations; }
        public RoleBase setCanRemoveAppendConfigurations(Boolean value) { this.CanRemoveAppendConfigurations = value; return this; }
    }

    public static class GetNameTagsBase
    {
        
    }

    public static class PostNameTagBase
    {
        /**
        * Tag name
        */
        @ApiMember(Description="Tag name", IsRequired=true)
        public String Name = null;
        
        public String getName() { return Name; }
        public PostNameTagBase setName(String value) { this.Name = value; return this; }
    }

    public static class PutNameTagBase
    {
        /**
        * Unique ID of the tag
        */
        @ApiMember(DataType="string", Description="Unique ID of the tag", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Tag name
        */
        @ApiMember(Description="Tag name", IsRequired=true)
        public String Name = null;
        
        public String getUniqueId() { return UniqueId; }
        public PutNameTagBase setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getName() { return Name; }
        public PutNameTagBase setName(String value) { this.Name = value; return this; }
    }

    public static class DeleteNameTagBase
    {
        /**
        * Unique ID of the tag
        */
        @ApiMember(DataType="string", Description="Unique ID of the tag", IsRequired=true, ParameterType="path")
        public String UniqueId = null;
        
        public String getUniqueId() { return UniqueId; }
        public DeleteNameTagBase setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    public static class ReportPluginBase
    {
        /**
        * Assembly name
        */
        @ApiMember(Description="Assembly name", IsRequired=true)
        public String AssemblyName = null;

        /**
        * Plug-in folder name
        */
        @ApiMember(Description="Plug-in folder name", IsRequired=true)
        public String FolderName = null;
        
        public String getAssemblyName() { return AssemblyName; }
        public ReportPluginBase setAssemblyName(String value) { this.AssemblyName = value; return this; }
        public String getFolderName() { return FolderName; }
        public ReportPluginBase setFolderName(String value) { this.FolderName = value; return this; }
    }

    public static class AppliedTag
    {
        /**
        * UniqueId of the tag
        */
        @ApiMember(DataType="string", Description="UniqueId of the tag")
        public String UniqueId = null;

        /**
        * DEPRECATED: renamed to Key
        */
        @ApiMember(Description="DEPRECATED: renamed to Key")
        public String Name = null;

        /**
        * Key of the tag
        */
        @ApiMember(Description="Key of the tag")
        public String Key = null;

        /**
        * Value of the applied tag, if the tag's ValueType is PickList
        */
        @ApiMember(Description="Value of the applied tag, if the tag\'s ValueType is PickList")
        public String Value = null;
        
        public String getUniqueId() { return UniqueId; }
        public AppliedTag setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getName() { return Name; }
        public AppliedTag setName(String value) { this.Name = value; return this; }
        public String getKey() { return Key; }
        public AppliedTag setKey(String value) { this.Key = value; return this; }
        public String getValue() { return Value; }
        public AppliedTag setValue(String value) { this.Value = value; return this; }
    }

    public static class ApplyTagRequest
    {
        /**
        * UniqueId of the tag
        */
        @ApiMember(DataType="string", Description="UniqueId of the tag", IsRequired=true)
        public String UniqueId = null;

        /**
        * Optional value of the tag
        */
        @ApiMember(Description="Optional value of the tag")
        public String Value = null;
        
        public String getUniqueId() { return UniqueId; }
        public ApplyTagRequest setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getValue() { return Value; }
        public ApplyTagRequest setValue(String value) { this.Value = value; return this; }
    }

    public static class SensorBase
    {
        /**
        * Location Unique ID
        */
        @ApiMember(DataType="string", Description="Location Unique ID", IsRequired=true)
        public String LocationUniqueId = null;

        /**
        * Parameter ID
        */
        @ApiMember(Description="Parameter ID", IsRequired=true)
        public String ParameterId = null;

        /**
        * Monitoring method code
        */
        @ApiMember(Description="Monitoring method code", IsRequired=true)
        public String MethodCode = null;

        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Manufacturer
        */
        @ApiMember(Description="Manufacturer")
        public String Manufacturer = null;

        /**
        * Model
        */
        @ApiMember(Description="Model")
        public String Model = null;

        /**
        * Serial Number
        */
        @ApiMember(Description="Serial Number")
        public String SerialNumber = null;

        /**
        * Tags to be assigned to the sensor with optional values
        */
        @ApiMember(DataType="Array<ApplyTagRequest>", Description="Tags to be assigned to the sensor with optional values")
        public ArrayList<ApplyTagRequest> Tags = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public SensorBase setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public String getParameterId() { return ParameterId; }
        public SensorBase setParameterId(String value) { this.ParameterId = value; return this; }
        public String getMethodCode() { return MethodCode; }
        public SensorBase setMethodCode(String value) { this.MethodCode = value; return this; }
        public String getName() { return Name; }
        public SensorBase setName(String value) { this.Name = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public SensorBase setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public String getComments() { return Comments; }
        public SensorBase setComments(String value) { this.Comments = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public SensorBase setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public SensorBase setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public SensorBase setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public ArrayList<ApplyTagRequest> getTags() { return Tags; }
        public SensorBase setTags(ArrayList<ApplyTagRequest> value) { this.Tags = value; return this; }
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

    public static interface IIdentifySetting
    {
        public String Group = null;
        public String Key = null;
    }

    public static interface IModifySetting extends IIdentifySetting
    {
        public String Value = null;
        public String Description = null;
    }

    public static enum DropDownListType
    {
        Unspecified,
        Configurable,
        Fixed;
    }

    public static class DropDownList
    {
        /**
        * Key for the drop-down list.
        */
        @ApiMember(Description="Key for the drop-down list.")
        public String Id = null;

        /**
        * Display name for the drop-down list.
        */
        @ApiMember(Description="Display name for the drop-down list.")
        public String DisplayName = null;
        
        public String getId() { return Id; }
        public DropDownList setId(String value) { this.Id = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public DropDownList setDisplayName(String value) { this.DisplayName = value; return this; }
    }

    public static class ConfigurableDropDownListItemBase
    {
        /**
        * Id of the configurable drop-down list
        */
        @ApiMember(Description="Id of the configurable drop-down list", IsRequired=true, ParameterType="path")
        public String DropDownListId = null;

        /**
        * Id of the drop-down list item to update
        */
        @ApiMember(Description="Id of the drop-down list item to update", IsRequired=true, ParameterType="path")
        public String Id = null;

        /**
        * The that will be shown for the item in drop-down lists
        */
        @ApiMember(Description="The that will be shown for the item in drop-down lists", IsRequired=true)
        public String DisplayName = null;

        /**
        * A value used to control the order of items in lists. Items with lower numbers will appear before items with higher numbers.
        */
        @ApiMember(DataType="integer", Description="A value used to control the order of items in lists. Items with lower numbers will appear before items with higher numbers.", IsRequired=true)
        public Integer DisplayOrder = null;
        
        public String getDropDownListId() { return DropDownListId; }
        public ConfigurableDropDownListItemBase setDropDownListId(String value) { this.DropDownListId = value; return this; }
        public String getId() { return Id; }
        public ConfigurableDropDownListItemBase setId(String value) { this.Id = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public ConfigurableDropDownListItemBase setDisplayName(String value) { this.DisplayName = value; return this; }
        public Integer getDisplayOrder() { return DisplayOrder; }
        public ConfigurableDropDownListItemBase setDisplayOrder(Integer value) { this.DisplayOrder = value; return this; }
    }

    public static enum ThresholdTypeSeverity
    {
        Unknown,
        Info,
        Warning,
        Error;
    }

    public static enum ThresholdBehavior
    {
        Unknown,
        ThresholdAbove,
        ThresholdBelow,
        None;
    }

    public static enum ThresholdSuppressionOption
    {
        Unknown,
        Editable,
        On,
        Off;
    }

    public static class ThresholdTypeRequestBase
    {
        /**
        * Description
        */
        @ApiMember(Description="Description", IsRequired=true)
        public String Description = null;
        
        public String getDescription() { return Description; }
        public ThresholdTypeRequestBase setDescription(String value) { this.Description = value; return this; }
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

    public static class GetCodeTableBase
    {
        
    }

    public static class CodeTableRequestBase
    {
        /**
        * Public Identifier
        */
        @ApiMember(Description="Public Identifier", IsRequired=true)
        public String PublicIdentifier = null;

        /**
        * Display Name
        */
        @ApiMember(Description="Display Name")
        public String DisplayName = null;

        /**
        * Formal Name
        */
        @ApiMember(Description="Formal Name")
        public String FormalName = null;
        
        public String getPublicIdentifier() { return PublicIdentifier; }
        public CodeTableRequestBase setPublicIdentifier(String value) { this.PublicIdentifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public CodeTableRequestBase setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getFormalName() { return FormalName; }
        public CodeTableRequestBase setFormalName(String value) { this.FormalName = value; return this; }
    }

    public static class DeleteCodeTableBase
    {
        /**
        * Public identifier
        */
        @ApiMember(Description="Public identifier", IsRequired=true)
        public String PublicIdentifier = null;
        
        public String getPublicIdentifier() { return PublicIdentifier; }
        public DeleteCodeTableBase setPublicIdentifier(String value) { this.PublicIdentifier = value; return this; }
    }

    public static interface IQualityCodeRequest
    {
        public Integer GradeCode = null;
        public String Color = null;
        public String DisplayName = null;
        public String Description = null;
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

        /**
        * Optional uncertainty of elevation difference
        */
        @ApiMember(DataType="double", Description="Optional uncertainty of elevation difference")
        public Double Uncertainty = null;

        /**
        * Optional method used to determine the elevation difference
        */
        @ApiMember(Description="Optional method used to determine the elevation difference")
        public String Method = null;
        
        public Instant getValidFrom() { return ValidFrom; }
        public LocationDatumPeriodBase setValidFrom(Instant value) { this.ValidFrom = value; return this; }
        public Double getElevation() { return Elevation; }
        public LocationDatumPeriodBase setElevation(Double value) { this.Elevation = value; return this; }
        public MeasurementDirection getMeasurementDirection() { return MeasurementDirection; }
        public LocationDatumPeriodBase setMeasurementDirection(MeasurementDirection value) { this.MeasurementDirection = value; return this; }
        public String getComment() { return Comment; }
        public LocationDatumPeriodBase setComment(String value) { this.Comment = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public LocationDatumPeriodBase setUncertainty(Double value) { this.Uncertainty = value; return this; }
        public String getMethod() { return Method; }
        public LocationDatumPeriodBase setMethod(String value) { this.Method = value; return this; }
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

    public static class QualifierBase
    {
        /**
        * Public identifier
        */
        @ApiMember(Description="Public identifier", IsRequired=true)
        public String PublicIdentifier = null;

        /**
        * Qualifier code
        */
        @ApiMember(Description="Qualifier code", IsRequired=true)
        public String QualifierCode = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Qualifier group identifiers - if no groups are specified, the qualifier will be assigned to the 'Default' qualifier group
        */
        @ApiMember(DataType="Array<string>", Description="Qualifier group identifiers - if no groups are specified, the qualifier will be assigned to the \'Default\' qualifier group")
        public ArrayList<String> GroupIdentifiers = null;
        
        public String getPublicIdentifier() { return PublicIdentifier; }
        public QualifierBase setPublicIdentifier(String value) { this.PublicIdentifier = value; return this; }
        public String getQualifierCode() { return QualifierCode; }
        public QualifierBase setQualifierCode(String value) { this.QualifierCode = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public QualifierBase setDisplayName(String value) { this.DisplayName = value; return this; }
        public ArrayList<String> getGroupIdentifiers() { return GroupIdentifiers; }
        public QualifierBase setGroupIdentifiers(ArrayList<String> value) { this.GroupIdentifiers = value; return this; }
    }

    public static class PutUserRoleBase
    {
        /**
        * Unique Id of the user the role will apply to
        */
        @ApiMember(DataType="string", Description="Unique Id of the user the role will apply to", IsRequired=true, ParameterType="path")
        public String UserUniqueId = null;

        /**
        * Unique id of role to set
        */
        @ApiMember(DataType="string", Description="Unique id of role to set", IsRequired=true)
        public String RoleUniqueId = null;
        
        public String getUserUniqueId() { return UserUniqueId; }
        public PutUserRoleBase setUserUniqueId(String value) { this.UserUniqueId = value; return this; }
        public String getRoleUniqueId() { return RoleUniqueId; }
        public PutUserRoleBase setRoleUniqueId(String value) { this.RoleUniqueId = value; return this; }
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
        @ApiMember(DataType="string", Description="Unique ID of the method\'s parameter", IsRequired=true)
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
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

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
        public Boolean isPublish() { return Publish; }
        public LocationBase setPublish(Boolean value) { this.Publish = value; return this; }
        public List<ExtendedAttributeValue> getExtendedAttributeValues() { return ExtendedAttributeValues; }
        public LocationBase setExtendedAttributeValues(List<ExtendedAttributeValue> value) { this.ExtendedAttributeValues = value; return this; }
    }

    public static interface ICreateStandardDatum extends IStandardReferenceDatumIdentity
    {
        public String Comments = null;
        public String Method = null;
        public Double Uncertainty = null;
    }

    public static interface IStandardReferenceDatumIdentity
    {
        public String LocationUniqueId = null;
        public String StandardIdentifier = null;
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

    public static class PutReferencePointPeriod extends ReferencePointPeriodBase
    {
        
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

    public static interface IHttpFile
    {
    }

    public static interface IFileUploadRequest
    {
        public IHttpFile File = null;
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
        @ApiMember(DataType="boolean", Description="True if this period is measured against the location\'s local assumed datum instead of a standard datum", IsRequired=true)
        public Boolean IsMeasuredAgainstLocalAssumedDatum = null;

        /**
        * Elevation of the reference point relative to the standard or local assumed datum
        */
        @ApiMember(DataType="double", Description="Elevation of the reference point relative to the standard or local assumed datum", IsRequired=true)
        public Double Elevation = null;

        /**
        * Optional uncertainty of elevation
        */
        @ApiMember(DataType="double", Description="Optional uncertainty of elevation")
        public Double Uncertainty = null;

        /**
        * Optional method used to determine the elevation
        */
        @ApiMember(Description="Optional method used to determine the elevation")
        public String Method = null;

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
        public Double getUncertainty() { return Uncertainty; }
        public ReferencePointPeriodBase setUncertainty(Double value) { this.Uncertainty = value; return this; }
        public String getMethod() { return Method; }
        public ReferencePointPeriodBase setMethod(String value) { this.Method = value; return this; }
        public MeasurementDirection getMeasurementDirection() { return MeasurementDirection; }
        public ReferencePointPeriodBase setMeasurementDirection(MeasurementDirection value) { this.MeasurementDirection = value; return this; }
        public String getComment() { return Comment; }
        public ReferencePointPeriodBase setComment(String value) { this.Comment = value; return this; }
    }

    public static class Current
    {
        public static final AquariusServerVersion Version = AquariusServerVersion.Create("20.3.84.0");
    }
}
