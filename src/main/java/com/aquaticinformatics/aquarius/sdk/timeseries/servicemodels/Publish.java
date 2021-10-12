/* Options:
Instant: 2021-10-12 16:40:59
Version: 5.104
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: https://aqts-pg.aquariusdev.net/AQUARIUS/Publish/v2

Package: com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels
GlobalNamespace: Publish
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

public class Publish
{

    @Route(Path="/GetLocationData", Verbs="GET")
    public static class LocationDataServiceRequest implements IReturn<LocationDataServiceResponse>
    {
        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier", IsRequired=true)
        public String LocationIdentifier = null;

        /**
        * True if location attachments should be included in the results
        */
        @ApiMember(DataType="boolean", Description="True if location attachments should be included in the results")
        public Boolean IncludeLocationAttachments = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public LocationDataServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public Boolean isIncludeLocationAttachments() { return IncludeLocationAttachments; }
        public LocationDataServiceRequest setIncludeLocationAttachments(Boolean value) { this.IncludeLocationAttachments = value; return this; }
        private static Object responseType = LocationDataServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetLocationDescriptionList", Verbs="GET")
    public static class LocationDescriptionListServiceRequest implements IReturn<LocationDescriptionListServiceResponse>
    {
        /**
        * Filter results to the given location name (supports *partialname* pattern*)
        */
        @ApiMember(Description="Filter results to the given location name (supports *partialname* pattern*)")
        public String LocationName = null;

        /**
        * Filter results to the given location identifier (supports *partialname* pattern)
        */
        @ApiMember(Description="Filter results to the given location identifier (supports *partialname* pattern)")
        public String LocationIdentifier = null;

        /**
        * Filter results to the given location folder (supports *partialname* pattern)
        */
        @ApiMember(Description="Filter results to the given location folder (supports *partialname* pattern)")
        public String LocationFolder = null;

        /**
        * DEPRECATED: renamed to TagKeys
        */
        @ApiMember(DataType="array", Description="DEPRECATED: renamed to TagKeys")
        public ArrayList<String> TagNames = null;

        /**
        * Filter results to locations matching all tags by key (supports *partialname* pattern)
        */
        @ApiMember(DataType="array", Description="Filter results to locations matching all tags by key (supports *partialname* pattern)")
        public ArrayList<String> TagKeys = null;

        /**
        * Filter results to locations matching all tags by value (supports *partialname* pattern)
        */
        @ApiMember(DataType="array", Description="Filter results to locations matching all tags by value (supports *partialname* pattern)")
        public ArrayList<String> TagValues = null;

        /**
        * Filter results to items matching the given extended attribute values
        */
        @ApiMember(DataType="array", Description="Filter results to items matching the given extended attribute values")
        public ArrayList<ExtendedAttributeFilter> ExtendedFilters = null;

        /**
        * Filter results to items matching the Publish value
        */
        @ApiMember(DataType="boolean", Description="Filter results to items matching the Publish value")
        public Boolean Publish = null;

        /**
        * Filter results to items modified at or after the ChangesSinceToken time
        */
        @ApiMember(DataType="string", Description="Filter results to items modified at or after the ChangesSinceToken time", Format="date-time")
        public Instant ChangesSinceToken = null;
        
        public String getLocationName() { return LocationName; }
        public LocationDescriptionListServiceRequest setLocationName(String value) { this.LocationName = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public LocationDescriptionListServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getLocationFolder() { return LocationFolder; }
        public LocationDescriptionListServiceRequest setLocationFolder(String value) { this.LocationFolder = value; return this; }
        public ArrayList<String> getTagNames() { return TagNames; }
        public LocationDescriptionListServiceRequest setTagNames(ArrayList<String> value) { this.TagNames = value; return this; }
        public ArrayList<String> getTagKeys() { return TagKeys; }
        public LocationDescriptionListServiceRequest setTagKeys(ArrayList<String> value) { this.TagKeys = value; return this; }
        public ArrayList<String> getTagValues() { return TagValues; }
        public LocationDescriptionListServiceRequest setTagValues(ArrayList<String> value) { this.TagValues = value; return this; }
        public ArrayList<ExtendedAttributeFilter> getExtendedFilters() { return ExtendedFilters; }
        public LocationDescriptionListServiceRequest setExtendedFilters(ArrayList<ExtendedAttributeFilter> value) { this.ExtendedFilters = value; return this; }
        public Boolean isPublish() { return Publish; }
        public LocationDescriptionListServiceRequest setPublish(Boolean value) { this.Publish = value; return this; }
        public Instant getChangesSinceToken() { return ChangesSinceToken; }
        public LocationDescriptionListServiceRequest setChangesSinceToken(Instant value) { this.ChangesSinceToken = value; return this; }
        private static Object responseType = LocationDescriptionListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetExpandedStageTable", Verbs="GET")
    public static class ExpandedStageTableServiceRequest implements IReturn<ExpandedStageTableServiceResponse>
    {
        /**
        * The unique ID of the time series
        */
        @ApiMember(DataType="string", Description="The unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Table step size increment. Defaults to 0.01
        */
        @ApiMember(DataType="number", Description="Table step size increment. Defaults to 0.01", Format="double")
        public Double StepSize = null;

        /**
        * Forces the response time values to a specific UTC offset. Defaults to the time series UTC offset
        */
        @ApiMember(DataType="number", Description="Forces the response time values to a specific UTC offset. Defaults to the time series UTC offset", Format="double")
        public Double UtcOffset = null;

        /**
        * Table starting value
        */
        @ApiMember(DataType="number", Description="Table starting value", Format="double", IsRequired=true)
        public Double StartValue = null;

        /**
        * Table ending value
        */
        @ApiMember(DataType="number", Description="Table ending value", Format="double", IsRequired=true)
        public Double EndValue = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public ExpandedStageTableServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Double getStepSize() { return StepSize; }
        public ExpandedStageTableServiceRequest setStepSize(Double value) { this.StepSize = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public ExpandedStageTableServiceRequest setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public Double getStartValue() { return StartValue; }
        public ExpandedStageTableServiceRequest setStartValue(Double value) { this.StartValue = value; return this; }
        public Double getEndValue() { return EndValue; }
        public ExpandedStageTableServiceRequest setEndValue(Double value) { this.EndValue = value; return this; }
        private static Object responseType = ExpandedStageTableServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetReportList", Verbs="GET")
    public static class ReportListServiceRequest implements IReturn<ReportListServiceResponse>
    {
        /**
        * Filter results to given location unique ID
        */
        @ApiMember(DataType="string", Description="Filter results to given location unique ID", Format="guid")
        public String LocationUniqueId = null;

        /**
        * Filter results to given source time series unique IDs
        */
        @ApiMember(DataType="array", Description="Filter results to given source time series unique IDs")
        public ArrayList<String> TimeSeriesUniqueIds = null;

        /**
        * Filter results to the given user unique ID
        */
        @ApiMember(DataType="string", Description="Filter results to the given user unique ID", Format="guid")
        public String UserUniqueId = null;

        /**
        * Filter results to the given report title
        */
        @ApiMember(Description="Filter results to the given report title")
        public String ReportTitle = null;

        /**
        * Filter results to given report unique IDs
        */
        @ApiMember(DataType="array", Description="Filter results to given report unique IDs")
        public ArrayList<String> ReportUniqueIds = null;

        /**
        * Filter results to items created at or after the CreatedFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items created at or after the CreatedFrom time", Format="date-time")
        public Instant CreatedFrom = null;

        /**
        * Filter results to items matching all tags by key (supports *partialname* pattern)
        */
        @ApiMember(DataType="array", Description="Filter results to items matching all tags by key (supports *partialname* pattern)")
        public ArrayList<String> TagKeys = null;

        /**
        * Filter results to items matching all tags by value (supports *partialname* pattern)
        */
        @ApiMember(DataType="array", Description="Filter results to items matching all tags by value (supports *partialname* pattern)")
        public ArrayList<String> TagValues = null;

        /**
        * Limit the number of results items, after all filtering and ordering
        */
        @ApiMember(DataType="integer", Description="Limit the number of results items, after all filtering and ordering", Format="int32")
        public Integer MaxResults = null;
        
        public String getLocationUniqueId() { return LocationUniqueId; }
        public ReportListServiceRequest setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public ArrayList<String> getTimeSeriesUniqueIds() { return TimeSeriesUniqueIds; }
        public ReportListServiceRequest setTimeSeriesUniqueIds(ArrayList<String> value) { this.TimeSeriesUniqueIds = value; return this; }
        public String getUserUniqueId() { return UserUniqueId; }
        public ReportListServiceRequest setUserUniqueId(String value) { this.UserUniqueId = value; return this; }
        public String getReportTitle() { return ReportTitle; }
        public ReportListServiceRequest setReportTitle(String value) { this.ReportTitle = value; return this; }
        public ArrayList<String> getReportUniqueIds() { return ReportUniqueIds; }
        public ReportListServiceRequest setReportUniqueIds(ArrayList<String> value) { this.ReportUniqueIds = value; return this; }
        public Instant getCreatedFrom() { return CreatedFrom; }
        public ReportListServiceRequest setCreatedFrom(Instant value) { this.CreatedFrom = value; return this; }
        public ArrayList<String> getTagKeys() { return TagKeys; }
        public ReportListServiceRequest setTagKeys(ArrayList<String> value) { this.TagKeys = value; return this; }
        public ArrayList<String> getTagValues() { return TagValues; }
        public ReportListServiceRequest setTagValues(ArrayList<String> value) { this.TagValues = value; return this; }
        public Integer getMaxResults() { return MaxResults; }
        public ReportListServiceRequest setMaxResults(Integer value) { this.MaxResults = value; return this; }
        private static Object responseType = ReportListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetRatingCurveList", Verbs="GET")
    public static class RatingCurveListServiceRequest implements IReturn<RatingCurveListServiceResponse>
    {
        /**
        * Rating model identifier
        */
        @ApiMember(Description="Rating model identifier", IsRequired=true)
        public String RatingModelIdentifier = null;

        /**
        * Forces the response time values to a specific UTC offset. Defaults to the location UTC offset
        */
        @ApiMember(DataType="number", Description="Forces the response time values to a specific UTC offset. Defaults to the location UTC offset", Format="double")
        public Double UtcOffset = null;

        /**
        * Filter results to curves with a Period.StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to curves with a Period.StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to curves with a Period.EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to curves with a Period.EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;
        
        public String getRatingModelIdentifier() { return RatingModelIdentifier; }
        public RatingCurveListServiceRequest setRatingModelIdentifier(String value) { this.RatingModelIdentifier = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public RatingCurveListServiceRequest setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public RatingCurveListServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public RatingCurveListServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = RatingCurveListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetParameterList", Verbs="GET")
    public static class ParameterListServiceRequest implements IReturn<ParameterListServiceResponse>
    {
        
        private static Object responseType = ParameterListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetRatingModelInputValues", Verbs="GET")
    public static class RatingModelInputValuesServiceRequest implements IReturn<RatingModelInputValuesServiceResponse>
    {
        /**
        * Rating model identifier
        */
        @ApiMember(Description="Rating model identifier", IsRequired=true)
        public String RatingModelIdentifier = null;

        /**
        * Output values
        */
        @ApiMember(DataType="array", Description="Output values", IsRequired=true)
        public ArrayList<Double> OutputValues = null;

        /**
        * Effective time of the calculation. Defaults to the current time if not specified
        */
        @ApiMember(DataType="string", Description="Effective time of the calculation. Defaults to the current time if not specified", Format="date-time")
        public Instant EffectiveTime = null;
        
        public String getRatingModelIdentifier() { return RatingModelIdentifier; }
        public RatingModelInputValuesServiceRequest setRatingModelIdentifier(String value) { this.RatingModelIdentifier = value; return this; }
        public ArrayList<Double> getOutputValues() { return OutputValues; }
        public RatingModelInputValuesServiceRequest setOutputValues(ArrayList<Double> value) { this.OutputValues = value; return this; }
        public Instant getEffectiveTime() { return EffectiveTime; }
        public RatingModelInputValuesServiceRequest setEffectiveTime(Instant value) { this.EffectiveTime = value; return this; }
        private static Object responseType = RatingModelInputValuesServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetApprovalsTransactionList", Verbs="GET")
    public static class TimeSeriesApprovalsTransactionListServiceRequest implements IReturn<TimeSeriesApprovalsTransactionListServiceResponse>
    {
        /**
        * The unique ID of the time series
        */
        @ApiMember(DataType="string", Description="The unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Filter results to items with a StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items with an EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items with an EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public TimeSeriesApprovalsTransactionListServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public TimeSeriesApprovalsTransactionListServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public TimeSeriesApprovalsTransactionListServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = TimeSeriesApprovalsTransactionListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetEffectiveRatingCurve", Verbs="GET")
    public static class EffectiveRatingCurveServiceRequest implements IReturn<EffectiveRatingCurveServiceResponse>
    {
        /**
        * Rating model identifier
        */
        @ApiMember(Description="Rating model identifier", IsRequired=true)
        public String RatingModelIdentifier = null;

        /**
        * Table step size increment. Defaults to 0.01
        */
        @ApiMember(DataType="number", Description="Table step size increment. Defaults to 0.01", Format="double")
        public Double StepSize = null;

        /**
        * Forces the response time values to a specific UTC offset. Defaults to the location UTC offset
        */
        @ApiMember(DataType="number", Description="Forces the response time values to a specific UTC offset. Defaults to the location UTC offset", Format="double")
        public Double UtcOffset = null;

        /**
        * Table start value. Required for equation-based ratings. Defaults to minimum table value for table-based ratings
        */
        @ApiMember(DataType="number", Description="Table start value. Required for equation-based ratings. Defaults to minimum table value for table-based ratings", Format="double")
        public Double StartValue = null;

        /**
        * Table end value. Required for equation-based ratings. Defaults to maximum table value for table-based ratings
        */
        @ApiMember(DataType="number", Description="Table end value. Required for equation-based ratings. Defaults to maximum table value for table-based ratings", Format="double")
        public Double EndValue = null;

        /**
        * Effective time of the calculation. Defaults to the current time if not specified
        */
        @ApiMember(DataType="string", Description="Effective time of the calculation. Defaults to the current time if not specified", Format="date-time")
        public Instant EffectiveTime = null;
        
        public String getRatingModelIdentifier() { return RatingModelIdentifier; }
        public EffectiveRatingCurveServiceRequest setRatingModelIdentifier(String value) { this.RatingModelIdentifier = value; return this; }
        public Double getStepSize() { return StepSize; }
        public EffectiveRatingCurveServiceRequest setStepSize(Double value) { this.StepSize = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public EffectiveRatingCurveServiceRequest setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public Double getStartValue() { return StartValue; }
        public EffectiveRatingCurveServiceRequest setStartValue(Double value) { this.StartValue = value; return this; }
        public Double getEndValue() { return EndValue; }
        public EffectiveRatingCurveServiceRequest setEndValue(Double value) { this.EndValue = value; return this; }
        public Instant getEffectiveTime() { return EffectiveTime; }
        public EffectiveRatingCurveServiceRequest setEffectiveTime(Instant value) { this.EffectiveTime = value; return this; }
        private static Object responseType = EffectiveRatingCurveServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetSensorsAndGauges", Verbs="GET,POST")
    public static class SensorsAndGaugesServiceRequest implements IReturn<SensorsAndGaugesServiceResponse>
    {
        /**
        * Filter results to sensors and gauges for this location
        */
        @ApiMember(Description="Filter results to sensors and gauges for this location")
        public String LocationIdentifier = null;

        /**
        * Filter results to sensors and gauges for these locations. Limited to roughly 60 items for a GET request; use POST to avoid this limit.
        */
        @ApiMember(DataType="array", Description="Filter results to sensors and gauges for these locations. Limited to roughly 60 items for a GET request; use POST to avoid this limit.")
        public ArrayList<String> LocationUniqueIds = null;

        /**
        * Filter results to sensors and gauges matching all tags by key (supports *partialname* pattern)
        */
        @ApiMember(DataType="array", Description="Filter results to sensors and gauges matching all tags by key (supports *partialname* pattern)")
        public ArrayList<String> TagKeys = null;

        /**
        * Filter results to sensors and gauges matching all tags by value (supports *partialname* pattern)
        */
        @ApiMember(DataType="array", Description="Filter results to sensors and gauges matching all tags by value (supports *partialname* pattern)")
        public ArrayList<String> TagValues = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public SensorsAndGaugesServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public ArrayList<String> getLocationUniqueIds() { return LocationUniqueIds; }
        public SensorsAndGaugesServiceRequest setLocationUniqueIds(ArrayList<String> value) { this.LocationUniqueIds = value; return this; }
        public ArrayList<String> getTagKeys() { return TagKeys; }
        public SensorsAndGaugesServiceRequest setTagKeys(ArrayList<String> value) { this.TagKeys = value; return this; }
        public ArrayList<String> getTagValues() { return TagValues; }
        public SensorsAndGaugesServiceRequest setTagValues(ArrayList<String> value) { this.TagValues = value; return this; }
        private static Object responseType = SensorsAndGaugesServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetDownchainProcessorListByTimeSeries", Verbs="GET")
    public static class DownchainProcessorListByTimeSeriesServiceRequest implements IReturn<ProcessorListServiceResponse>
    {
        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Filter results to items with a ProcessorPeriod.StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a ProcessorPeriod.StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items with a ProcessorPeriod.EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a ProcessorPeriod.EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public DownchainProcessorListByTimeSeriesServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public DownchainProcessorListByTimeSeriesServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public DownchainProcessorListByTimeSeriesServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = ProcessorListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetGradeList", Verbs="GET")
    public static class GradeListServiceRequest implements IReturn<GradeListServiceResponse>
    {
        
        private static Object responseType = GradeListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetRatingModelEffectiveShifts", Verbs="GET")
    public static class RatingModelEffectiveShiftsServiceRequest implements IReturn<RatingModelEffectiveShiftsServiceResponse>
    {
        /**
        * Unique ID of the input time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the input time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Rating model identifier
        */
        @ApiMember(Description="Rating model identifier", IsRequired=true)
        public String RatingModelIdentifier = null;

        /**
        * Read the input time series starting at the QueryFrom time. Defaults to beginning of record
        */
        @ApiMember(DataType="string", Description="Read the input time series starting at the QueryFrom time. Defaults to beginning of record", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Read the input time series ending at the QueryTo time. Defaults to the end of record.
        */
        @ApiMember(DataType="string", Description="Read the input time series ending at the QueryTo time. Defaults to the end of record.", Format="date-time")
        public Instant QueryTo = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public RatingModelEffectiveShiftsServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public String getRatingModelIdentifier() { return RatingModelIdentifier; }
        public RatingModelEffectiveShiftsServiceRequest setRatingModelIdentifier(String value) { this.RatingModelIdentifier = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public RatingModelEffectiveShiftsServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public RatingModelEffectiveShiftsServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = RatingModelEffectiveShiftsServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetRatingModelEffectiveShiftsByStageValues", Verbs="GET")
    public static class RatingModelEffectiveShiftsByStageValuesServiceRequest implements IReturn<RatingModelEffectiveShiftsByStageValuesServiceResponse>
    {
        /**
        * Rating model identifier
        */
        @ApiMember(Description="Rating model identifier", IsRequired=true)
        public String RatingModelIdentifier = null;

        /**
        * The time at which the shift is to be applied
        */
        @ApiMember(DataType="string", Description="The time at which the shift is to be applied", Format="date-time", IsRequired=true)
        public Instant MeasurementTime = null;

        /**
        * The input stage values to which the shift is to be applied
        */
        @ApiMember(DataType="array", Description="The input stage values to which the shift is to be applied", IsRequired=true)
        public ArrayList<Double> StageValues = null;
        
        public String getRatingModelIdentifier() { return RatingModelIdentifier; }
        public RatingModelEffectiveShiftsByStageValuesServiceRequest setRatingModelIdentifier(String value) { this.RatingModelIdentifier = value; return this; }
        public Instant getMeasurementTime() { return MeasurementTime; }
        public RatingModelEffectiveShiftsByStageValuesServiceRequest setMeasurementTime(Instant value) { this.MeasurementTime = value; return this; }
        public ArrayList<Double> getStageValues() { return StageValues; }
        public RatingModelEffectiveShiftsByStageValuesServiceRequest setStageValues(ArrayList<Double> value) { this.StageValues = value; return this; }
        private static Object responseType = RatingModelEffectiveShiftsByStageValuesServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTimeSeriesRawData", Verbs="GET")
    public static class TimeSeriesDataRawServiceRequest implements IReturn<TimeSeriesDataServiceResponse>
    {
        /**
        * The unique ID of the time series
        */
        @ApiMember(DataType="string", Description="The unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Filter results to items at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;

        /**
        * Sets the level of time series detail to report. One of 'All', 'PointsOnly', or 'MetadataOnly'. Defaults to 'All'
        */
        @ApiMember(Description="Sets the level of time series detail to report. One of 'All', 'PointsOnly', or 'MetadataOnly'. Defaults to 'All'")
        public String GetParts = null;

        /**
        * The unit identifier for points. Defaults to the time series unit
        */
        @ApiMember(Description="The unit identifier for points. Defaults to the time series unit")
        public String Unit = null;

        /**
        * Forces the response time values to a specific UTC offset. Defaults to the time series UTC offset
        */
        @ApiMember(DataType="number", Description="Forces the response time values to a specific UTC offset. Defaults to the time series UTC offset", Format="double")
        public Double UtcOffset = null;

        /**
        * True if data values should have rounding rules applied
        */
        @ApiMember(DataType="boolean", Description="True if data values should have rounding rules applied")
        public Boolean ApplyRounding = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public TimeSeriesDataRawServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public TimeSeriesDataRawServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public TimeSeriesDataRawServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        public String getGetParts() { return GetParts; }
        public TimeSeriesDataRawServiceRequest setGetParts(String value) { this.GetParts = value; return this; }
        public String getUnit() { return Unit; }
        public TimeSeriesDataRawServiceRequest setUnit(String value) { this.Unit = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public TimeSeriesDataRawServiceRequest setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public Boolean isApplyRounding() { return ApplyRounding; }
        public TimeSeriesDataRawServiceRequest setApplyRounding(Boolean value) { this.ApplyRounding = value; return this; }
        private static Object responseType = TimeSeriesDataServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTimeSeriesCorrectedData", Verbs="GET")
    public static class TimeSeriesDataCorrectedServiceRequest implements IReturn<TimeSeriesDataServiceResponse>
    {
        /**
        * The unique ID of the time series
        */
        @ApiMember(DataType="string", Description="The unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Filter results to items at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;

        /**
        * The level of time series detail to report. One of 'All', 'PointsOnly', or 'MetadataOnly'. Defaults to 'All'
        */
        @ApiMember(Description="The level of time series detail to report. One of 'All', 'PointsOnly', or 'MetadataOnly'. Defaults to 'All'")
        public String GetParts = null;

        /**
        * The unit identifier for points. Defaults to the time series unit
        */
        @ApiMember(Description="The unit identifier for points. Defaults to the time series unit")
        public String Unit = null;

        /**
        * Forces the response time values to a specific UTC offset. Defaults to the time series UTC offset
        */
        @ApiMember(DataType="number", Description="Forces the response time values to a specific UTC offset. Defaults to the time series UTC offset", Format="double")
        public Double UtcOffset = null;

        /**
        * True if data values should have rounding rules applied
        */
        @ApiMember(DataType="boolean", Description="True if data values should have rounding rules applied")
        public Boolean ApplyRounding = null;

        /**
        * Defaults to false. See the API reference guide for details
        */
        @ApiMember(DataType="boolean", Description="Defaults to false. See the API reference guide for details")
        public Boolean ReturnFullCoverage = null;

        /**
        * True if the point results should include gap markers
        */
        @ApiMember(DataType="boolean", Description="True if the point results should include gap markers")
        public Boolean IncludeGapMarkers = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public TimeSeriesDataCorrectedServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public TimeSeriesDataCorrectedServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public TimeSeriesDataCorrectedServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        public String getGetParts() { return GetParts; }
        public TimeSeriesDataCorrectedServiceRequest setGetParts(String value) { this.GetParts = value; return this; }
        public String getUnit() { return Unit; }
        public TimeSeriesDataCorrectedServiceRequest setUnit(String value) { this.Unit = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public TimeSeriesDataCorrectedServiceRequest setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public Boolean isApplyRounding() { return ApplyRounding; }
        public TimeSeriesDataCorrectedServiceRequest setApplyRounding(Boolean value) { this.ApplyRounding = value; return this; }
        public Boolean isReturnFullCoverage() { return ReturnFullCoverage; }
        public TimeSeriesDataCorrectedServiceRequest setReturnFullCoverage(Boolean value) { this.ReturnFullCoverage = value; return this; }
        public Boolean isIncludeGapMarkers() { return IncludeGapMarkers; }
        public TimeSeriesDataCorrectedServiceRequest setIncludeGapMarkers(Boolean value) { this.IncludeGapMarkers = value; return this; }
        private static Object responseType = TimeSeriesDataServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTimeSeriesData", Verbs="GET")
    public static class TimeAlignedDataServiceRequest implements IReturn<TimeAlignedDataServiceResponse>
    {
        /**
        * The unique IDs of the time-series to retrieve
        */
        @ApiMember(DataType="array", Description="The unique IDs of the time-series to retrieve", IsRequired=true)
        public ArrayList<String> TimeSeriesUniqueIds = null;

        /**
        * The unit identifiers for points. Defaults to the time-series unit
        */
        @ApiMember(DataType="array", Description="The unit identifiers for points. Defaults to the time-series unit")
        public ArrayList<String> TimeSeriesOutputUnitIds = null;

        /**
        * Filter results to items at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;

        /**
        * Forces the response time values to a specific UTC offset. Defaults to the UTC offset of the first time-series
        */
        @ApiMember(DataType="number", Description="Forces the response time values to a specific UTC offset. Defaults to the UTC offset of the first time-series", Format="double")
        public Double UtcOffset = null;

        /**
        * True if data values should have rounding rules applied
        */
        @ApiMember(DataType="boolean", Description="True if data values should have rounding rules applied")
        public Boolean ApplyRounding = null;

        /**
        * True if the point results should include gap markers
        */
        @ApiMember(DataType="boolean", Description="True if the point results should include gap markers")
        public Boolean IncludeGapMarkers = null;
        
        public ArrayList<String> getTimeSeriesUniqueIds() { return TimeSeriesUniqueIds; }
        public TimeAlignedDataServiceRequest setTimeSeriesUniqueIds(ArrayList<String> value) { this.TimeSeriesUniqueIds = value; return this; }
        public ArrayList<String> getTimeSeriesOutputUnitIds() { return TimeSeriesOutputUnitIds; }
        public TimeAlignedDataServiceRequest setTimeSeriesOutputUnitIds(ArrayList<String> value) { this.TimeSeriesOutputUnitIds = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public TimeAlignedDataServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public TimeAlignedDataServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public TimeAlignedDataServiceRequest setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public Boolean isApplyRounding() { return ApplyRounding; }
        public TimeAlignedDataServiceRequest setApplyRounding(Boolean value) { this.ApplyRounding = value; return this; }
        public Boolean isIncludeGapMarkers() { return IncludeGapMarkers; }
        public TimeAlignedDataServiceRequest setIncludeGapMarkers(Boolean value) { this.IncludeGapMarkers = value; return this; }
        private static Object responseType = TimeAlignedDataServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetUpchainProcessorListByTimeSeries", Verbs="GET")
    public static class UpchainProcessorListByTimeSeriesServiceRequest implements IReturn<ProcessorListServiceResponse>
    {
        /**
        * Unique ID of the time series
        */
        @ApiMember(DataType="string", Description="Unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Filter results to items with a ProcessorPeriod.StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a ProcessorPeriod.StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items with a ProcessorPeriod.EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a ProcessorPeriod.EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public UpchainProcessorListByTimeSeriesServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public UpchainProcessorListByTimeSeriesServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public UpchainProcessorListByTimeSeriesServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = ProcessorListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetDownchainProcessorListByRatingModel", Verbs="GET")
    public static class DownchainProcessorListByRatingModelServiceRequest implements IReturn<ProcessorListServiceResponse>
    {
        /**
        * Rating model identifier
        */
        @ApiMember(Description="Rating model identifier", IsRequired=true)
        public String RatingModelIdentifier = null;

        /**
        * Filter results to items with a ProcessorPeriod.StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a ProcessorPeriod.StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items with a ProcessorPeriod.EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a ProcessorPeriod.EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;
        
        public String getRatingModelIdentifier() { return RatingModelIdentifier; }
        public DownchainProcessorListByRatingModelServiceRequest setRatingModelIdentifier(String value) { this.RatingModelIdentifier = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public DownchainProcessorListByRatingModelServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public DownchainProcessorListByRatingModelServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = ProcessorListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Round/ByParameter", Verbs="PUT")
    public static class RoundServiceRequest implements IReturn<RoundServiceResponse>
    {
        /**
        * The data is for this parameter
        */
        @ApiMember(Description="The data is for this parameter", IsRequired=true)
        public String ParameterDisplayId = null;

        /**
        * The data is in this unit. Used to modify rounding spec to maintain precision
        */
        @ApiMember(Description="The data is in this unit. Used to modify rounding spec to maintain precision", IsRequired=true)
        public String UnitId = null;

        /**
        * The data was measured using this method. Specify only if known
        */
        @ApiMember(Description="The data was measured using this method. Specify only if known")
        public String MethodCode = null;

        /**
        * If specified, return this value for inputs which are NaNs. Otherwise returns EMPTY for NaNs.
        */
        @ApiMember(Description="If specified, return this value for inputs which are NaNs. Otherwise returns EMPTY for NaNs.")
        public String ValueForNaN = null;

        /**
        * A list of data values to be rounded and returned as strings
        */
        @ApiMember(DataType="array", Description="A list of data values to be rounded and returned as strings", IsRequired=true)
        public ArrayList<Double> Data = null;
        
        public String getParameterDisplayId() { return ParameterDisplayId; }
        public RoundServiceRequest setParameterDisplayId(String value) { this.ParameterDisplayId = value; return this; }
        public String getUnitId() { return UnitId; }
        public RoundServiceRequest setUnitId(String value) { this.UnitId = value; return this; }
        public String getMethodCode() { return MethodCode; }
        public RoundServiceRequest setMethodCode(String value) { this.MethodCode = value; return this; }
        public String getValueForNaN() { return ValueForNaN; }
        public RoundServiceRequest setValueForNaN(String value) { this.ValueForNaN = value; return this; }
        public ArrayList<Double> getData() { return Data; }
        public RoundServiceRequest setData(ArrayList<Double> value) { this.Data = value; return this; }
        private static Object responseType = RoundServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Round/ToSpec", Verbs="PUT")
    public static class RoundServiceSpecRequest implements IReturn<RoundServiceResponse>
    {
        /**
        * Use this rounding specification to round the data
        */
        @ApiMember(Description="Use this rounding specification to round the data", IsRequired=true)
        public String RoundingSpec = null;

        /**
        * If specified, return this value for inputs which are NaNs. Otherwise returns EMPTY for NaNs.
        */
        @ApiMember(Description="If specified, return this value for inputs which are NaNs. Otherwise returns EMPTY for NaNs.")
        public String ValueForNaN = null;

        /**
        * A list of data values to be rounded and returned as strings
        */
        @ApiMember(DataType="array", Description="A list of data values to be rounded and returned as strings", IsRequired=true)
        public ArrayList<Double> Data = null;
        
        public String getRoundingSpec() { return RoundingSpec; }
        public RoundServiceSpecRequest setRoundingSpec(String value) { this.RoundingSpec = value; return this; }
        public String getValueForNaN() { return ValueForNaN; }
        public RoundServiceSpecRequest setValueForNaN(String value) { this.ValueForNaN = value; return this; }
        public ArrayList<Double> getData() { return Data; }
        public RoundServiceSpecRequest setData(ArrayList<Double> value) { this.Data = value; return this; }
        private static Object responseType = RoundServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTimeSeriesDescriptionList", Verbs="GET")
    public static class TimeSeriesDescriptionServiceRequest implements IReturn<TimeSeriesDescriptionListServiceResponse>
    {
        /**
        * Filter results to the given location
        */
        @ApiMember(Description="Filter results to the given location")
        public String LocationIdentifier = null;

        /**
        * Filter results to items matching the parameter identifier
        */
        @ApiMember(Description="Filter results to items matching the parameter identifier")
        public String Parameter = null;

        /**
        * Filter results to items matching the Publish value
        */
        @ApiMember(DataType="boolean", Description="Filter results to items matching the Publish value")
        public Boolean Publish = null;

        /**
        * Filter results to items matching the computation identifier
        */
        @ApiMember(Description="Filter results to items matching the computation identifier")
        public String ComputationIdentifier = null;

        /**
        * Filter results to items matching the computation period identifier
        */
        @ApiMember(Description="Filter results to items matching the computation period identifier")
        public String ComputationPeriodIdentifier = null;

        /**
        * Filter results to items matching the given extended attribute values
        */
        @ApiMember(DataType="array", Description="Filter results to items matching the given extended attribute values")
        public ArrayList<ExtendedAttributeFilter> ExtendedFilters = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public TimeSeriesDescriptionServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getParameter() { return Parameter; }
        public TimeSeriesDescriptionServiceRequest setParameter(String value) { this.Parameter = value; return this; }
        public Boolean isPublish() { return Publish; }
        public TimeSeriesDescriptionServiceRequest setPublish(Boolean value) { this.Publish = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public TimeSeriesDescriptionServiceRequest setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public TimeSeriesDescriptionServiceRequest setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public ArrayList<ExtendedAttributeFilter> getExtendedFilters() { return ExtendedFilters; }
        public TimeSeriesDescriptionServiceRequest setExtendedFilters(ArrayList<ExtendedAttributeFilter> value) { this.ExtendedFilters = value; return this; }
        private static Object responseType = TimeSeriesDescriptionListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTimeSeriesUniqueIdList", Verbs="GET")
    public static class TimeSeriesUniqueIdListServiceRequest implements IReturn<TimeSeriesUniqueIdListServiceResponse>
    {
        /**
        * Filter results to items modified at or after the ChangesSinceToken time
        */
        @ApiMember(DataType="string", Description="Filter results to items modified at or after the ChangesSinceToken time", Format="date-time")
        public Instant ChangesSinceToken = null;

        /**
        * Filter results to a specific change event type: 'Data' or 'Attribute'
        */
        @ApiMember(Description="Filter results to a specific change event type: 'Data' or 'Attribute'")
        public String ChangeEventType = null;

        /**
        * Filter results to the given location
        */
        @ApiMember(Description="Filter results to the given location")
        public String LocationIdentifier = null;

        /**
        * Filter results to items maching the Parameter identifier
        */
        @ApiMember(Description="Filter results to items maching the Parameter identifier")
        public String Parameter = null;

        /**
        * Filter results to items matching the Publish value
        */
        @ApiMember(DataType="boolean", Description="Filter results to items matching the Publish value")
        public Boolean Publish = null;

        /**
        * Filter results to items matching the computation identifier
        */
        @ApiMember(Description="Filter results to items matching the computation identifier")
        public String ComputationIdentifier = null;

        /**
        * Filter results to items matching the computation period identifier
        */
        @ApiMember(Description="Filter results to items matching the computation period identifier")
        public String ComputationPeriodIdentifier = null;

        /**
        * Filter results to items matching the given extended attribute values
        */
        @ApiMember(DataType="array", Description="Filter results to items matching the given extended attribute values")
        public ArrayList<ExtendedAttributeFilter> ExtendedFilters = null;
        
        public Instant getChangesSinceToken() { return ChangesSinceToken; }
        public TimeSeriesUniqueIdListServiceRequest setChangesSinceToken(Instant value) { this.ChangesSinceToken = value; return this; }
        public String getChangeEventType() { return ChangeEventType; }
        public TimeSeriesUniqueIdListServiceRequest setChangeEventType(String value) { this.ChangeEventType = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public TimeSeriesUniqueIdListServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getParameter() { return Parameter; }
        public TimeSeriesUniqueIdListServiceRequest setParameter(String value) { this.Parameter = value; return this; }
        public Boolean isPublish() { return Publish; }
        public TimeSeriesUniqueIdListServiceRequest setPublish(Boolean value) { this.Publish = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public TimeSeriesUniqueIdListServiceRequest setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public TimeSeriesUniqueIdListServiceRequest setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public ArrayList<ExtendedAttributeFilter> getExtendedFilters() { return ExtendedFilters; }
        public TimeSeriesUniqueIdListServiceRequest setExtendedFilters(ArrayList<ExtendedAttributeFilter> value) { this.ExtendedFilters = value; return this; }
        private static Object responseType = TimeSeriesUniqueIdListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetFieldVisitDescriptionList", Verbs="GET")
    public static class FieldVisitDescriptionListServiceRequest implements IReturn<FieldVisitDescriptionListServiceResponse>
    {
        /**
        * Filter results to the given location
        */
        @ApiMember(Description="Filter results to the given location")
        public String LocationIdentifier = null;

        /**
        * Filter results to items with a StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items with an EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items with an EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;

        /**
        * True if the results should include invalid field visits which require operator attention.
        */
        @ApiMember(DataType="boolean", Description="True if the results should include invalid field visits which require operator attention.")
        public Boolean IncludeInvalidFieldVisits = null;

        /**
        * Filter results to items modified at or after the ChangesSinceToken time
        */
        @ApiMember(DataType="string", Description="Filter results to items modified at or after the ChangesSinceToken time", Format="date-time")
        public Instant ChangesSinceToken = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public FieldVisitDescriptionListServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public FieldVisitDescriptionListServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public FieldVisitDescriptionListServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        public Boolean isIncludeInvalidFieldVisits() { return IncludeInvalidFieldVisits; }
        public FieldVisitDescriptionListServiceRequest setIncludeInvalidFieldVisits(Boolean value) { this.IncludeInvalidFieldVisits = value; return this; }
        public Instant getChangesSinceToken() { return ChangesSinceToken; }
        public FieldVisitDescriptionListServiceRequest setChangesSinceToken(Instant value) { this.ChangesSinceToken = value; return this; }
        private static Object responseType = FieldVisitDescriptionListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetMetadataChangeTransactionList", Verbs="GET")
    public static class MetadataChangeTransactionListServiceRequest implements IReturn<MetadataChangeTransactionListServiceResponse>
    {
        /**
        * The unique ID of the time series
        */
        @ApiMember(DataType="string", Description="The unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Filter results to items with a StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items with an EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items with an EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public MetadataChangeTransactionListServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public MetadataChangeTransactionListServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public MetadataChangeTransactionListServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = MetadataChangeTransactionListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTagList", Verbs="GET")
    public static class TagListServiceRequest implements IReturn<TagListServiceResponse>
    {
        /**
        * If set, return only tags with specified applicability, selected from: AppliesToLocations, AppliesToLocationNotes, AppliesToSensorsGauges, AppliesToAttachments, AppliesToReports
        */
        @ApiMember(AllowMultiple=true, DataType="array", Description="If set, return only tags with specified applicability, selected from: AppliesToLocations, AppliesToLocationNotes, AppliesToSensorsGauges, AppliesToAttachments, AppliesToReports")
        public ArrayList<TagApplicability> Applicability = null;
        
        public ArrayList<TagApplicability> getApplicability() { return Applicability; }
        public TagListServiceRequest setApplicability(ArrayList<TagApplicability> value) { this.Applicability = value; return this; }
        private static Object responseType = TagListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetLocationTagList", Verbs="GET")
    public static class LocationTagListServiceRequest implements IReturn<LocationTagListServiceResponse>
    {
        
        private static Object responseType = LocationTagListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTimeSeriesDescriptionListByUniqueId", Verbs="GET,POST")
    public static class TimeSeriesDescriptionListByUniqueIdServiceRequest implements IReturn<TimeSeriesDescriptionListByUniqueIdServiceResponse>
    {
        /**
        * A collection of time series unique IDs to query. Limited to roughly 60 items for a GET request; use POST to avoid this limit.
        */
        @ApiMember(DataType="array", Description="A collection of time series unique IDs to query. Limited to roughly 60 items for a GET request; use POST to avoid this limit.")
        public ArrayList<String> TimeSeriesUniqueIds = null;
        
        public ArrayList<String> getTimeSeriesUniqueIds() { return TimeSeriesUniqueIds; }
        public TimeSeriesDescriptionListByUniqueIdServiceRequest setTimeSeriesUniqueIds(ArrayList<String> value) { this.TimeSeriesUniqueIds = value; return this; }
        private static Object responseType = TimeSeriesDescriptionListByUniqueIdServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetFieldVisitData", Verbs="GET")
    public static class FieldVisitDataServiceRequest implements IReturn<FieldVisitDataServiceResponse>, IFieldVisitDataRequest
    {
        /**
        * Field visit identifier
        */
        @ApiMember(Description="Field visit identifier", IsRequired=true)
        public String FieldVisitIdentifier = null;

        /**
        * If set, only report the specific activity type: One of Inspection, DischargeSummary, DischargePointVelocity, DischargeVolumetric, DischargeEngineeredStructure, DischargeAdcp, DischargeOtherMethod, GageHeightAtZeroFlow, ControlCondition, CrossSectionSurvey or LevelSurvey
        */
        @ApiMember(Description="If set, only report the specific activity type: One of Inspection, DischargeSummary, DischargePointVelocity, DischargeVolumetric, DischargeEngineeredStructure, DischargeAdcp, DischargeOtherMethod, GageHeightAtZeroFlow, ControlCondition, CrossSectionSurvey or LevelSurvey")
        public String DiscreteMeasurementActivity = null;

        /**
        * True if node details (raw JSON of each specific activity) should be included
        */
        @ApiMember(DataType="boolean", Description="True if node details (raw JSON of each specific activity) should be included")
        public Boolean IncludeNodeDetails = null;

        /**
        * True if invalid activities (requiring operator intervention) should be included
        */
        @ApiMember(DataType="boolean", Description="True if invalid activities (requiring operator intervention) should be included")
        public Boolean IncludeInvalidActivities = null;

        /**
        * True if data values should have rounding rules applied
        */
        @ApiMember(DataType="boolean", Description="True if data values should have rounding rules applied")
        public Boolean ApplyRounding = null;

        /**
        * True if point velocity discharge activities should include verticals
        */
        @ApiMember(DataType="boolean", Description="True if point velocity discharge activities should include verticals")
        public Boolean IncludeVerticals = null;

        /**
        * True if cross-section survey activities should include cross-section profile
        */
        @ApiMember(DataType="boolean", Description="True if cross-section survey activities should include cross-section profile")
        public Boolean IncludeCrossSectionSurveyProfile = null;

        /**
        * True if length reading values should be converted to the Local Assumed Datum
        */
        @ApiMember(DataType="boolean", Description="True if length reading values should be converted to the Local Assumed Datum")
        public Boolean ConvertToLocalAssumedDatum = null;

        /**
        * If set, length reading values will be converted to the specified Standard Reference Datum
        */
        @ApiMember(Description="If set, length reading values will be converted to the specified Standard Reference Datum")
        public String ConvertToStandardReferenceDatum = null;
        
        public String getFieldVisitIdentifier() { return FieldVisitIdentifier; }
        public FieldVisitDataServiceRequest setFieldVisitIdentifier(String value) { this.FieldVisitIdentifier = value; return this; }
        public String getDiscreteMeasurementActivity() { return DiscreteMeasurementActivity; }
        public FieldVisitDataServiceRequest setDiscreteMeasurementActivity(String value) { this.DiscreteMeasurementActivity = value; return this; }
        public Boolean isIncludeNodeDetails() { return IncludeNodeDetails; }
        public FieldVisitDataServiceRequest setIncludeNodeDetails(Boolean value) { this.IncludeNodeDetails = value; return this; }
        public Boolean isIncludeInvalidActivities() { return IncludeInvalidActivities; }
        public FieldVisitDataServiceRequest setIncludeInvalidActivities(Boolean value) { this.IncludeInvalidActivities = value; return this; }
        public Boolean isApplyRounding() { return ApplyRounding; }
        public FieldVisitDataServiceRequest setApplyRounding(Boolean value) { this.ApplyRounding = value; return this; }
        public Boolean isIncludeVerticals() { return IncludeVerticals; }
        public FieldVisitDataServiceRequest setIncludeVerticals(Boolean value) { this.IncludeVerticals = value; return this; }
        public Boolean isIncludeCrossSectionSurveyProfile() { return IncludeCrossSectionSurveyProfile; }
        public FieldVisitDataServiceRequest setIncludeCrossSectionSurveyProfile(Boolean value) { this.IncludeCrossSectionSurveyProfile = value; return this; }
        public Boolean isConvertToLocalAssumedDatum() { return ConvertToLocalAssumedDatum; }
        public FieldVisitDataServiceRequest setConvertToLocalAssumedDatum(Boolean value) { this.ConvertToLocalAssumedDatum = value; return this; }
        public String getConvertToStandardReferenceDatum() { return ConvertToStandardReferenceDatum; }
        public FieldVisitDataServiceRequest setConvertToStandardReferenceDatum(String value) { this.ConvertToStandardReferenceDatum = value; return this; }
        private static Object responseType = FieldVisitDataServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetActiveMetersAndCalibrations", Verbs="GET")
    public static class ActiveMetersAndCalibrationsServiceRequest implements IReturn<ActiveMetersAndCalibrationsServiceResponse>
    {
        
        private static Object responseType = ActiveMetersAndCalibrationsServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetFieldVisitDataByLocation", Verbs="GET")
    public static class FieldVisitDataByLocationServiceRequest implements IReturn<FieldVisitDataByLocationServiceResponse>, IFieldVisitDataRequest
    {
        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier", IsRequired=true)
        public String LocationIdentifier = null;

        /**
        * If set, only return specified activity types, selected from: Reading, Inspection, CalibrationCheck, DischargeSummary, DischargePointVelocity, DischargeVolumetric, DischargeEngineeredStructure, DischargeAdcp, DischargeOtherMethod, GageHeightAtZeroFlow, ControlCondition, CrossSectionSurvey, LevelSurvey, Attachment
        */
        @ApiMember(AllowMultiple=true, DataType="array", Description="If set, only return specified activity types, selected from: Reading, Inspection, CalibrationCheck, DischargeSummary, DischargePointVelocity, DischargeVolumetric, DischargeEngineeredStructure, DischargeAdcp, DischargeOtherMethod, GageHeightAtZeroFlow, ControlCondition, CrossSectionSurvey, LevelSurvey, Attachment")
        public ArrayList<ActivityType> Activities = null;

        /**
        * If set, only return readings and calibrations of the specified parameters
        */
        @ApiMember(DataType="array", Description="If set, only return readings and calibrations of the specified parameters")
        public ArrayList<String> Parameters = null;

        /**
        * If set, only return inspections of the specified types, selected from: BubbleGage, CrestStageGage, WireWeightGage, MaximumMinimumGage, WaterQuality, FieldMeter, Other
        */
        @ApiMember(AllowMultiple=true, DataType="array", Description="If set, only return inspections of the specified types, selected from: BubbleGage, CrestStageGage, WireWeightGage, MaximumMinimumGage, WaterQuality, FieldMeter, Other")
        public ArrayList<InspectionType> InspectionTypes = null;

        /**
        * True if node details (raw JSON of each specific activity) should be included
        */
        @ApiMember(DataType="boolean", Description="True if node details (raw JSON of each specific activity) should be included")
        public Boolean IncludeNodeDetails = null;

        /**
        * True if invalid activities (requiring operator intervention) should be included
        */
        @ApiMember(DataType="boolean", Description="True if invalid activities (requiring operator intervention) should be included")
        public Boolean IncludeInvalidActivities = null;

        /**
        * True if data values should have rounding rules applied
        */
        @ApiMember(DataType="boolean", Description="True if data values should have rounding rules applied")
        public Boolean ApplyRounding = null;

        /**
        * True if point velocity discharge activities should include verticals
        */
        @ApiMember(DataType="boolean", Description="True if point velocity discharge activities should include verticals")
        public Boolean IncludeVerticals = null;

        /**
        * True if cross-section survey activities should include cross-section profile
        */
        @ApiMember(DataType="boolean", Description="True if cross-section survey activities should include cross-section profile")
        public Boolean IncludeCrossSectionSurveyProfile = null;

        /**
        * True if length reading values should be converted to the Local Assumed Datum
        */
        @ApiMember(DataType="boolean", Description="True if length reading values should be converted to the Local Assumed Datum")
        public Boolean ConvertToLocalAssumedDatum = null;

        /**
        * If set, length reading values will be converted to the specified Standard Reference Datum
        */
        @ApiMember(Description="If set, length reading values will be converted to the specified Standard Reference Datum")
        public String ConvertToStandardReferenceDatum = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public FieldVisitDataByLocationServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public ArrayList<ActivityType> getActivities() { return Activities; }
        public FieldVisitDataByLocationServiceRequest setActivities(ArrayList<ActivityType> value) { this.Activities = value; return this; }
        public ArrayList<String> getParameters() { return Parameters; }
        public FieldVisitDataByLocationServiceRequest setParameters(ArrayList<String> value) { this.Parameters = value; return this; }
        public ArrayList<InspectionType> getInspectionTypes() { return InspectionTypes; }
        public FieldVisitDataByLocationServiceRequest setInspectionTypes(ArrayList<InspectionType> value) { this.InspectionTypes = value; return this; }
        public Boolean isIncludeNodeDetails() { return IncludeNodeDetails; }
        public FieldVisitDataByLocationServiceRequest setIncludeNodeDetails(Boolean value) { this.IncludeNodeDetails = value; return this; }
        public Boolean isIncludeInvalidActivities() { return IncludeInvalidActivities; }
        public FieldVisitDataByLocationServiceRequest setIncludeInvalidActivities(Boolean value) { this.IncludeInvalidActivities = value; return this; }
        public Boolean isApplyRounding() { return ApplyRounding; }
        public FieldVisitDataByLocationServiceRequest setApplyRounding(Boolean value) { this.ApplyRounding = value; return this; }
        public Boolean isIncludeVerticals() { return IncludeVerticals; }
        public FieldVisitDataByLocationServiceRequest setIncludeVerticals(Boolean value) { this.IncludeVerticals = value; return this; }
        public Boolean isIncludeCrossSectionSurveyProfile() { return IncludeCrossSectionSurveyProfile; }
        public FieldVisitDataByLocationServiceRequest setIncludeCrossSectionSurveyProfile(Boolean value) { this.IncludeCrossSectionSurveyProfile = value; return this; }
        public Boolean isConvertToLocalAssumedDatum() { return ConvertToLocalAssumedDatum; }
        public FieldVisitDataByLocationServiceRequest setConvertToLocalAssumedDatum(Boolean value) { this.ConvertToLocalAssumedDatum = value; return this; }
        public String getConvertToStandardReferenceDatum() { return ConvertToStandardReferenceDatum; }
        public FieldVisitDataByLocationServiceRequest setConvertToStandardReferenceDatum(String value) { this.ConvertToStandardReferenceDatum = value; return this; }
        private static Object responseType = FieldVisitDataByLocationServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetFieldVisitReadingsByLocation", Verbs="GET")
    public static class GetFieldVisitReadingsByLocationServiceRequest implements IReturn<FieldVisitReadingsByLocationServiceResponse>
    {
        /**
        * Location identifier. Must be empty when LocationUniqueId is set.
        */
        @ApiMember(Description="Location identifier. Must be empty when LocationUniqueId is set.")
        public String LocationIdentifier = null;

        /**
        * Location unique ID. Must be empty when LocationIdentifier is set.
        */
        @ApiMember(DataType="string", Description="Location unique ID. Must be empty when LocationIdentifier is set.", Format="guid")
        public String LocationUniqueId = null;

        /**
        * If set, only return readings of the specified parameters
        */
        @ApiMember(DataType="array", Description="If set, only return readings of the specified parameters")
        public ArrayList<String> Parameters = null;

        /**
        * Filter results to items matching the Publish value
        */
        @ApiMember(DataType="boolean", Description="Filter results to items matching the Publish value")
        public Boolean Publish = null;

        /**
        * True if data values should have rounding rules applied
        */
        @ApiMember(DataType="boolean", Description="True if data values should have rounding rules applied")
        public Boolean ApplyRounding = null;

        /**
        * True if length reading values should be converted to all configured vertical datums in the location
        */
        @ApiMember(DataType="boolean", Description="True if length reading values should be converted to all configured vertical datums in the location")
        public Boolean ApplyDatumConversion = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public GetFieldVisitReadingsByLocationServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getLocationUniqueId() { return LocationUniqueId; }
        public GetFieldVisitReadingsByLocationServiceRequest setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public ArrayList<String> getParameters() { return Parameters; }
        public GetFieldVisitReadingsByLocationServiceRequest setParameters(ArrayList<String> value) { this.Parameters = value; return this; }
        public Boolean isPublish() { return Publish; }
        public GetFieldVisitReadingsByLocationServiceRequest setPublish(Boolean value) { this.Publish = value; return this; }
        public Boolean isApplyRounding() { return ApplyRounding; }
        public GetFieldVisitReadingsByLocationServiceRequest setApplyRounding(Boolean value) { this.ApplyRounding = value; return this; }
        public Boolean isApplyDatumConversion() { return ApplyDatumConversion; }
        public GetFieldVisitReadingsByLocationServiceRequest setApplyDatumConversion(Boolean value) { this.ApplyDatumConversion = value; return this; }
        private static Object responseType = FieldVisitReadingsByLocationServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetTrendLineAnalysis", Verbs="POST")
    public static class TrendLineAnalysisServiceRequest implements IReturn<TrendLineAnalysisServiceResponse>
    {
        /**
        * Type of regression analysis
        */
        @ApiMember(DataType="string", Description="Type of regression analysis", IsRequired=true)
        public TrendLineAnalysisType Type = null;

        /**
        * Start Time
        */
        @ApiMember(DataType="string", Description="Start Time", Format="date-time", IsRequired=true)
        public Instant QueryFrom = null;

        /**
        * End Time
        */
        @ApiMember(DataType="string", Description="End Time", Format="date-time", IsRequired=true)
        public Instant QueryTo = null;

        /**
        * List of data points to perform analysis on. Requires a minimum of three points, and points sorted by timestamp in ascending order. Must not contain any duplicate times.
        */
        @ApiMember(DataType="array", Description="List of data points to perform analysis on. Requires a minimum of three points, and points sorted by timestamp in ascending order. Must not contain any duplicate times.", IsRequired=true)
        public ArrayList<TimeSeriesPoint> Points = null;
        
        public TrendLineAnalysisType getType() { return Type; }
        public TrendLineAnalysisServiceRequest setType(TrendLineAnalysisType value) { this.Type = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public TrendLineAnalysisServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public TrendLineAnalysisServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        public ArrayList<TimeSeriesPoint> getPoints() { return Points; }
        public TrendLineAnalysisServiceRequest setPoints(ArrayList<TimeSeriesPoint> value) { this.Points = value; return this; }
        private static Object responseType = TrendLineAnalysisServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetUnitList", Verbs="GET")
    public static class UnitListServiceRequest implements IReturn<UnitListServiceResponse>
    {
        /**
        * Filter results to the given Unit Group
        */
        @ApiMember(Description="Filter results to the given Unit Group")
        public String GroupIdentifier = null;
        
        public String getGroupIdentifier() { return GroupIdentifier; }
        public UnitListServiceRequest setGroupIdentifier(String value) { this.GroupIdentifier = value; return this; }
        private static Object responseType = UnitListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetAuthToken", Verbs="GET")
    public static class GetAuthTokenServiceRequest implements IReturn<String>
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
        * Locale
        */
        @ApiMember(Description="Locale")
        public String Locale = null;
        
        public String getUsername() { return Username; }
        public GetAuthTokenServiceRequest setUsername(String value) { this.Username = value; return this; }
        public String getEncryptedPassword() { return EncryptedPassword; }
        public GetAuthTokenServiceRequest setEncryptedPassword(String value) { this.EncryptedPassword = value; return this; }
        public String getLocale() { return Locale; }
        public GetAuthTokenServiceRequest setLocale(String value) { this.Locale = value; return this; }
        private static Object responseType = String.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetRatingModelDescriptionList", Verbs="GET")
    public static class RatingModelDescriptionListServiceRequest implements IReturn<RatingModelDescriptionListServiceResponse>
    {
        /**
        * Filter results to the given location
        */
        @ApiMember(Description="Filter results to the given location")
        public String LocationIdentifier = null;

        /**
        * Filter results to items matching the Publish value
        */
        @ApiMember(DataType="boolean", Description="Filter results to items matching the Publish value")
        public Boolean Publish = null;

        /**
        * Filter results to items maching the InputParameter identifier
        */
        @ApiMember(Description="Filter results to items maching the InputParameter identifier")
        public String InputParameter = null;

        /**
        * Filter results to items maching the OutputParameter identifier
        */
        @ApiMember(Description="Filter results to items maching the OutputParameter identifier")
        public String OutputParameter = null;

        /**
        * Filter results to items modified at or after the ChangesSinceToken time
        */
        @ApiMember(DataType="string", Description="Filter results to items modified at or after the ChangesSinceToken time", Format="date-time")
        public Instant ChangesSinceToken = null;
        
        public String getLocationIdentifier() { return LocationIdentifier; }
        public RatingModelDescriptionListServiceRequest setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public Boolean isPublish() { return Publish; }
        public RatingModelDescriptionListServiceRequest setPublish(Boolean value) { this.Publish = value; return this; }
        public String getInputParameter() { return InputParameter; }
        public RatingModelDescriptionListServiceRequest setInputParameter(String value) { this.InputParameter = value; return this; }
        public String getOutputParameter() { return OutputParameter; }
        public RatingModelDescriptionListServiceRequest setOutputParameter(String value) { this.OutputParameter = value; return this; }
        public Instant getChangesSinceToken() { return ChangesSinceToken; }
        public RatingModelDescriptionListServiceRequest setChangesSinceToken(Instant value) { this.ChangesSinceToken = value; return this; }
        private static Object responseType = RatingModelDescriptionListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetRatingModelOutputValues", Verbs="GET")
    public static class RatingModelOutputValuesServiceRequest implements IReturn<RatingModelOutputValuesServiceResponse>
    {
        /**
        * Rating model identifier
        */
        @ApiMember(Description="Rating model identifier", IsRequired=true)
        public String RatingModelIdentifier = null;

        /**
        * Input values
        */
        @ApiMember(DataType="array", Description="Input values", IsRequired=true)
        public ArrayList<Double> InputValues = null;

        /**
        * Effective time of the calculation. Defaults to the current time if not specified
        */
        @ApiMember(DataType="string", Description="Effective time of the calculation. Defaults to the current time if not specified", Format="date-time")
        public Instant EffectiveTime = null;

        /**
        * Set to false to disable rating curve shifts, otherwise true
        */
        @ApiMember(DataType="boolean", Description="Set to false to disable rating curve shifts, otherwise true")
        public Boolean ApplyShifts = null;
        
        public String getRatingModelIdentifier() { return RatingModelIdentifier; }
        public RatingModelOutputValuesServiceRequest setRatingModelIdentifier(String value) { this.RatingModelIdentifier = value; return this; }
        public ArrayList<Double> getInputValues() { return InputValues; }
        public RatingModelOutputValuesServiceRequest setInputValues(ArrayList<Double> value) { this.InputValues = value; return this; }
        public Instant getEffectiveTime() { return EffectiveTime; }
        public RatingModelOutputValuesServiceRequest setEffectiveTime(Instant value) { this.EffectiveTime = value; return this; }
        public Boolean isApplyShifts() { return ApplyShifts; }
        public RatingModelOutputValuesServiceRequest setApplyShifts(Boolean value) { this.ApplyShifts = value; return this; }
        private static Object responseType = RatingModelOutputValuesServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetCorrectionList", Verbs="GET")
    public static class CorrectionListServiceRequest implements IReturn<CorrectionListServiceResponse>
    {
        /**
        * The unique ID of the time series
        */
        @ApiMember(DataType="string", Description="The unique ID of the time series", Format="guid", IsRequired=true)
        public String TimeSeriesUniqueId = null;

        /**
        * Filter results to items with a StartTime at or after the QueryFrom time
        */
        @ApiMember(DataType="string", Description="Filter results to items with a StartTime at or after the QueryFrom time", Format="date-time")
        public Instant QueryFrom = null;

        /**
        * Filter results to items with an EndTime at or before the QueryTo time
        */
        @ApiMember(DataType="string", Description="Filter results to items with an EndTime at or before the QueryTo time", Format="date-time")
        public Instant QueryTo = null;
        
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public CorrectionListServiceRequest setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public Instant getQueryFrom() { return QueryFrom; }
        public CorrectionListServiceRequest setQueryFrom(Instant value) { this.QueryFrom = value; return this; }
        public Instant getQueryTo() { return QueryTo; }
        public CorrectionListServiceRequest setQueryTo(Instant value) { this.QueryTo = value; return this; }
        private static Object responseType = CorrectionListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetMonitoringMethodList", Verbs="GET")
    public static class MonitoringMethodListServiceRequest implements IReturn<MonitoringMethodListServiceResponse>
    {
        
        private static Object responseType = MonitoringMethodListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetQualifierList", Verbs="GET")
    public static class QualifierListServiceRequest implements IReturn<QualifierListServiceResponse>
    {
        
        private static Object responseType = QualifierListServiceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/GetApprovalList", Verbs="GET")
    public static class ApprovalListServiceRequest implements IReturn<ApprovalListServiceResponse>
    {
        
        private static Object responseType = ApprovalListServiceResponse.class;
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

    public static class LocationDataServiceResponse extends PublishServiceResponse
    {
        /**
        * Location name
        */
        @ApiMember(Description="Location name")
        public String LocationName = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Unique id
        */
        @ApiMember(DataType="string", Description="Unique id", Format="guid")
        public String UniqueId = null;

        /**
        * Location type
        */
        @ApiMember(Description="Location type")
        public String LocationType = null;

        /**
        * External locations are created by data connectors.
        */
        @ApiMember(DataType="boolean", Description="External locations are created by data connectors.")
        public Boolean IsExternalLocation = null;

        /**
        * Latitude
        */
        @ApiMember(DataType="number", Description="Latitude", Format="double")
        public Double Latitude = null;

        /**
        * Longitude
        */
        @ApiMember(DataType="number", Description="Longitude", Format="double")
        public Double Longitude = null;

        /**
        * Srid
        */
        @ApiMember(DataType="number", Description="Srid", Format="double")
        public Double Srid = null;

        /**
        * Elevation units
        */
        @ApiMember(Description="Elevation units")
        public String ElevationUnits = null;

        /**
        * Elevation
        */
        @ApiMember(DataType="number", Description="Elevation", Format="double")
        public Double Elevation = null;

        /**
        * Utc offset
        */
        @ApiMember(DataType="number", Description="Utc offset", Format="double")
        public Double UtcOffset = null;

        /**
        * Tags
        */
        @ApiMember(DataType="array", Description="Tags")
        public ArrayList<TagMetadata> Tags = null;

        /**
        * Extended attributes
        */
        @ApiMember(DataType="array", Description="Extended attributes")
        public ArrayList<ExtendedAttribute> ExtendedAttributes = null;

        /**
        * Location remarks
        */
        @ApiMember(DataType="array", Description="Location remarks")
        public ArrayList<LocationRemark> LocationRemarks = null;

        /**
        * Location notes
        */
        @ApiMember(DataType="array", Description="Location notes")
        public ArrayList<LocationNote> LocationNotes = null;

        /**
        * Attachments
        */
        @ApiMember(DataType="array", Description="Attachments")
        public ArrayList<Attachment> Attachments = null;

        /**
        * Location datum
        */
        @ApiMember(DataType="LocationDatum", Description="Location datum")
        public LocationDatum LocationDatum = null;

        /**
        * Reference points
        */
        @ApiMember(DataType="array", Description="Reference points")
        public ArrayList<ReferencePoint> ReferencePoints = null;
        
        public String getLocationName() { return LocationName; }
        public LocationDataServiceResponse setLocationName(String value) { this.LocationName = value; return this; }
        public String getDescription() { return Description; }
        public LocationDataServiceResponse setDescription(String value) { this.Description = value; return this; }
        public String getIdentifier() { return Identifier; }
        public LocationDataServiceResponse setIdentifier(String value) { this.Identifier = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public LocationDataServiceResponse setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getLocationType() { return LocationType; }
        public LocationDataServiceResponse setLocationType(String value) { this.LocationType = value; return this; }
        public Boolean getIsExternalLocation() { return IsExternalLocation; }
        public LocationDataServiceResponse setIsExternalLocation(Boolean value) { this.IsExternalLocation = value; return this; }
        public Double getLatitude() { return Latitude; }
        public LocationDataServiceResponse setLatitude(Double value) { this.Latitude = value; return this; }
        public Double getLongitude() { return Longitude; }
        public LocationDataServiceResponse setLongitude(Double value) { this.Longitude = value; return this; }
        public Double getSrid() { return Srid; }
        public LocationDataServiceResponse setSrid(Double value) { this.Srid = value; return this; }
        public String getElevationUnits() { return ElevationUnits; }
        public LocationDataServiceResponse setElevationUnits(String value) { this.ElevationUnits = value; return this; }
        public Double getElevation() { return Elevation; }
        public LocationDataServiceResponse setElevation(Double value) { this.Elevation = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public LocationDataServiceResponse setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public ArrayList<TagMetadata> getTags() { return Tags; }
        public LocationDataServiceResponse setTags(ArrayList<TagMetadata> value) { this.Tags = value; return this; }
        public ArrayList<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public LocationDataServiceResponse setExtendedAttributes(ArrayList<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public ArrayList<LocationRemark> getLocationRemarks() { return LocationRemarks; }
        public LocationDataServiceResponse setLocationRemarks(ArrayList<LocationRemark> value) { this.LocationRemarks = value; return this; }
        public ArrayList<LocationNote> getLocationNotes() { return LocationNotes; }
        public LocationDataServiceResponse setLocationNotes(ArrayList<LocationNote> value) { this.LocationNotes = value; return this; }
        public ArrayList<Attachment> getAttachments() { return Attachments; }
        public LocationDataServiceResponse setAttachments(ArrayList<Attachment> value) { this.Attachments = value; return this; }
        public LocationDatum getLocationDatum() { return LocationDatum; }
        public LocationDataServiceResponse setLocationDatum(LocationDatum value) { this.LocationDatum = value; return this; }
        public ArrayList<ReferencePoint> getReferencePoints() { return ReferencePoints; }
        public LocationDataServiceResponse setReferencePoints(ArrayList<ReferencePoint> value) { this.ReferencePoints = value; return this; }
    }

    public static class LocationDescriptionListServiceResponse extends PublishServiceResponse
    {
        /**
        * Location descriptions
        */
        @ApiMember(DataType="array", Description="Location descriptions")
        public ArrayList<LocationDescription> LocationDescriptions = null;

        /**
        * Next token
        */
        @ApiMember(DataType="string", Description="Next token", Format="date-time")
        public Instant NextToken = null;
        
        public ArrayList<LocationDescription> getLocationDescriptions() { return LocationDescriptions; }
        public LocationDescriptionListServiceResponse setLocationDescriptions(ArrayList<LocationDescription> value) { this.LocationDescriptions = value; return this; }
        public Instant getNextToken() { return NextToken; }
        public LocationDescriptionListServiceResponse setNextToken(Instant value) { this.NextToken = value; return this; }
    }

    public static class ExpandedStageTableServiceResponse extends PublishServiceResponse
    {
        /**
        * Expanded stage table
        */
        @ApiMember(DataType="array", Description="Expanded stage table")
        public ArrayList<StagePoint> ExpandedStageTable = null;

        /**
        * Corrections
        */
        @ApiMember(DataType="array", Description="Corrections")
        public ArrayList<Correction> Corrections = null;
        
        public ArrayList<StagePoint> getExpandedStageTable() { return ExpandedStageTable; }
        public ExpandedStageTableServiceResponse setExpandedStageTable(ArrayList<StagePoint> value) { this.ExpandedStageTable = value; return this; }
        public ArrayList<Correction> getCorrections() { return Corrections; }
        public ExpandedStageTableServiceResponse setCorrections(ArrayList<Correction> value) { this.Corrections = value; return this; }
    }

    public static class ReportListServiceResponse extends PublishServiceResponse
    {
        /**
        * Reports
        */
        @ApiMember(DataType="array", Description="Reports")
        public ArrayList<Report> Reports = null;
        
        public ArrayList<Report> getReports() { return Reports; }
        public ReportListServiceResponse setReports(ArrayList<Report> value) { this.Reports = value; return this; }
    }

    public static class RatingCurveListServiceResponse extends PublishServiceResponse
    {
        /**
        * Rating curves
        */
        @ApiMember(DataType="array", Description="Rating curves")
        public List<RatingCurve> RatingCurves = null;

        /**
        * Approvals
        */
        @ApiMember(DataType="array", Description="Approvals")
        public List<Approval> Approvals = null;
        
        public List<RatingCurve> getRatingCurves() { return RatingCurves; }
        public RatingCurveListServiceResponse setRatingCurves(List<RatingCurve> value) { this.RatingCurves = value; return this; }
        public List<Approval> getApprovals() { return Approvals; }
        public RatingCurveListServiceResponse setApprovals(List<Approval> value) { this.Approvals = value; return this; }
    }

    public static class ParameterListServiceResponse extends PublishServiceResponse
    {
        /**
        * Parameters
        */
        @ApiMember(DataType="array", Description="Parameters")
        public ArrayList<ParameterMetadata> Parameters = null;
        
        public ArrayList<ParameterMetadata> getParameters() { return Parameters; }
        public ParameterListServiceResponse setParameters(ArrayList<ParameterMetadata> value) { this.Parameters = value; return this; }
    }

    public static class RatingModelInputValuesServiceResponse extends PublishServiceResponse
    {
        /**
        * Input values
        */
        @ApiMember(DataType="array", Description="Input values")
        public ArrayList<Double> InputValues = null;
        
        public ArrayList<Double> getInputValues() { return InputValues; }
        public RatingModelInputValuesServiceResponse setInputValues(ArrayList<Double> value) { this.InputValues = value; return this; }
    }

    public static class TimeSeriesApprovalsTransactionListServiceResponse extends PublishServiceResponse
    {
        /**
        * Approvals transactions
        */
        @ApiMember(DataType="array", Description="Approvals transactions")
        public List<ApprovalsTransaction> ApprovalsTransactions = null;
        
        public List<ApprovalsTransaction> getApprovalsTransactions() { return ApprovalsTransactions; }
        public TimeSeriesApprovalsTransactionListServiceResponse setApprovalsTransactions(List<ApprovalsTransaction> value) { this.ApprovalsTransactions = value; return this; }
    }

    public static class EffectiveRatingCurveServiceResponse extends PublishServiceResponse
    {
        /**
        * Expanded rating curve
        */
        @ApiMember(DataType="ExpandedRatingCurve", Description="Expanded rating curve")
        public ExpandedRatingCurve ExpandedRatingCurve = null;
        
        public ExpandedRatingCurve getExpandedRatingCurve() { return ExpandedRatingCurve; }
        public EffectiveRatingCurveServiceResponse setExpandedRatingCurve(ExpandedRatingCurve value) { this.ExpandedRatingCurve = value; return this; }
    }

    public static class SensorsAndGaugesServiceResponse extends PublishServiceResponse
    {
        /**
        * Monitoring methods
        */
        @ApiMember(DataType="array", Description="Monitoring methods")
        public ArrayList<LocationMonitoringMethod> MonitoringMethods = null;
        
        public ArrayList<LocationMonitoringMethod> getMonitoringMethods() { return MonitoringMethods; }
        public SensorsAndGaugesServiceResponse setMonitoringMethods(ArrayList<LocationMonitoringMethod> value) { this.MonitoringMethods = value; return this; }
    }

    public static class ProcessorListServiceResponse extends PublishServiceResponse
    {
        /**
        * Processors
        */
        @ApiMember(DataType="array", Description="Processors")
        public ArrayList<Processor> Processors = null;
        
        public ArrayList<Processor> getProcessors() { return Processors; }
        public ProcessorListServiceResponse setProcessors(ArrayList<Processor> value) { this.Processors = value; return this; }
    }

    public static class GradeListServiceResponse extends PublishServiceResponse
    {
        /**
        * Grades
        */
        @ApiMember(DataType="array", Description="Grades")
        public ArrayList<GradeMetadata> Grades = null;
        
        public ArrayList<GradeMetadata> getGrades() { return Grades; }
        public GradeListServiceResponse setGrades(ArrayList<GradeMetadata> value) { this.Grades = value; return this; }
    }

    public static class RatingModelEffectiveShiftsServiceResponse extends PublishServiceResponse
    {
        /**
        * Effective shifts
        */
        @ApiMember(DataType="array", Description="Effective shifts")
        public ArrayList<EffectiveShift> EffectiveShifts = null;
        
        public ArrayList<EffectiveShift> getEffectiveShifts() { return EffectiveShifts; }
        public RatingModelEffectiveShiftsServiceResponse setEffectiveShifts(ArrayList<EffectiveShift> value) { this.EffectiveShifts = value; return this; }
    }

    public static class RatingModelEffectiveShiftsByStageValuesServiceResponse extends PublishServiceResponse
    {
        /**
        * Timestamp
        */
        @ApiMember(DataType="string", Description="Timestamp", Format="date-time")
        public Instant Timestamp = null;

        /**
        * Effective shift values
        */
        @ApiMember(DataType="array", Description="Effective shift values")
        public ArrayList<Double> EffectiveShiftValues = null;
        
        public Instant getTimestamp() { return Timestamp; }
        public RatingModelEffectiveShiftsByStageValuesServiceResponse setTimestamp(Instant value) { this.Timestamp = value; return this; }
        public ArrayList<Double> getEffectiveShiftValues() { return EffectiveShiftValues; }
        public RatingModelEffectiveShiftsByStageValuesServiceResponse setEffectiveShiftValues(ArrayList<Double> value) { this.EffectiveShiftValues = value; return this; }
    }

    public static class TimeSeriesDataServiceResponse extends PublishServiceResponse
    {
        /**
        * Unique id
        */
        @ApiMember(DataType="string", Description="Unique id", Format="guid")
        public String UniqueId = null;

        /**
        * Parameter
        */
        @ApiMember(Description="Parameter")
        public String Parameter = null;

        /**
        * Label
        */
        @ApiMember(Description="Label")
        public String Label = null;

        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier")
        public String LocationIdentifier = null;

        /**
        * Num points
        */
        @ApiMember(DataType="integer", Description="Num points", Format="int64")
        public Long NumPoints = null;

        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;

        /**
        * Approvals
        */
        @ApiMember(DataType="array", Description="Approvals")
        public ArrayList<Approval> Approvals = null;

        /**
        * Qualifiers
        */
        @ApiMember(DataType="array", Description="Qualifiers")
        public ArrayList<Qualifier> Qualifiers = null;

        /**
        * Methods
        */
        @ApiMember(DataType="array", Description="Methods")
        public ArrayList<Method> Methods = null;

        /**
        * Grades
        */
        @ApiMember(DataType="array", Description="Grades")
        public ArrayList<Grade> Grades = null;

        /**
        * Gap tolerances
        */
        @ApiMember(DataType="array", Description="Gap tolerances")
        public ArrayList<GapTolerance> GapTolerances = null;

        /**
        * Interpolation types
        */
        @ApiMember(DataType="array", Description="Interpolation types")
        public ArrayList<InterpolationType> InterpolationTypes = null;

        /**
        * Notes
        */
        @ApiMember(DataType="array", Description="Notes")
        public ArrayList<Note> Notes = null;

        /**
        * Time range
        */
        @ApiMember(DataType="StatisticalTimeRange", Description="Time range")
        public StatisticalTimeRange TimeRange = null;

        /**
        * Points
        */
        @ApiMember(DataType="array", Description="Points")
        public ArrayList<TimeSeriesPoint> Points = null;
        
        public String getUniqueId() { return UniqueId; }
        public TimeSeriesDataServiceResponse setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getParameter() { return Parameter; }
        public TimeSeriesDataServiceResponse setParameter(String value) { this.Parameter = value; return this; }
        public String getLabel() { return Label; }
        public TimeSeriesDataServiceResponse setLabel(String value) { this.Label = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public TimeSeriesDataServiceResponse setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public Long getNumPoints() { return NumPoints; }
        public TimeSeriesDataServiceResponse setNumPoints(Long value) { this.NumPoints = value; return this; }
        public String getUnit() { return Unit; }
        public TimeSeriesDataServiceResponse setUnit(String value) { this.Unit = value; return this; }
        public ArrayList<Approval> getApprovals() { return Approvals; }
        public TimeSeriesDataServiceResponse setApprovals(ArrayList<Approval> value) { this.Approvals = value; return this; }
        public ArrayList<Qualifier> getQualifiers() { return Qualifiers; }
        public TimeSeriesDataServiceResponse setQualifiers(ArrayList<Qualifier> value) { this.Qualifiers = value; return this; }
        public ArrayList<Method> getMethods() { return Methods; }
        public TimeSeriesDataServiceResponse setMethods(ArrayList<Method> value) { this.Methods = value; return this; }
        public ArrayList<Grade> getGrades() { return Grades; }
        public TimeSeriesDataServiceResponse setGrades(ArrayList<Grade> value) { this.Grades = value; return this; }
        public ArrayList<GapTolerance> getGapTolerances() { return GapTolerances; }
        public TimeSeriesDataServiceResponse setGapTolerances(ArrayList<GapTolerance> value) { this.GapTolerances = value; return this; }
        public ArrayList<InterpolationType> getInterpolationTypes() { return InterpolationTypes; }
        public TimeSeriesDataServiceResponse setInterpolationTypes(ArrayList<InterpolationType> value) { this.InterpolationTypes = value; return this; }
        public ArrayList<Note> getNotes() { return Notes; }
        public TimeSeriesDataServiceResponse setNotes(ArrayList<Note> value) { this.Notes = value; return this; }
        public StatisticalTimeRange getTimeRange() { return TimeRange; }
        public TimeSeriesDataServiceResponse setTimeRange(StatisticalTimeRange value) { this.TimeRange = value; return this; }
        public ArrayList<TimeSeriesPoint> getPoints() { return Points; }
        public TimeSeriesDataServiceResponse setPoints(ArrayList<TimeSeriesPoint> value) { this.Points = value; return this; }
    }

    public static class TimeAlignedDataServiceResponse extends PublishServiceResponse
    {
        /**
        * Summary info of the retrieved time-series
        */
        @ApiMember(DataType="array", Description="Summary info of the retrieved time-series")
        public ArrayList<TimeAlignedTimeSeriesInfo> TimeSeries = null;

        /**
        * Time range
        */
        @ApiMember(DataType="TimeRange", Description="Time range")
        public TimeRange TimeRange = null;

        /**
        * Number of points
        */
        @ApiMember(DataType="integer", Description="Number of points", Format="int32")
        public Integer NumPoints = null;

        /**
        * Points
        */
        @ApiMember(DataType="array", Description="Points")
        public ArrayList<TimeAlignedPoint> Points = null;
        
        public ArrayList<TimeAlignedTimeSeriesInfo> getTimeSeries() { return TimeSeries; }
        public TimeAlignedDataServiceResponse setTimeSeries(ArrayList<TimeAlignedTimeSeriesInfo> value) { this.TimeSeries = value; return this; }
        public TimeRange getTimeRange() { return TimeRange; }
        public TimeAlignedDataServiceResponse setTimeRange(TimeRange value) { this.TimeRange = value; return this; }
        public Integer getNumPoints() { return NumPoints; }
        public TimeAlignedDataServiceResponse setNumPoints(Integer value) { this.NumPoints = value; return this; }
        public ArrayList<TimeAlignedPoint> getPoints() { return Points; }
        public TimeAlignedDataServiceResponse setPoints(ArrayList<TimeAlignedPoint> value) { this.Points = value; return this; }
    }

    public static class RoundServiceResponse extends PublishServiceResponse
    {
        /**
        * Values rounded as requested
        */
        @ApiMember(DataType="array", Description="Values rounded as requested")
        public ArrayList<String> Data = null;
        
        public ArrayList<String> getData() { return Data; }
        public RoundServiceResponse setData(ArrayList<String> value) { this.Data = value; return this; }
    }

    public static class TimeSeriesDescriptionListServiceResponse extends PublishServiceResponse
    {
        /**
        * Time series descriptions
        */
        @ApiMember(DataType="array", Description="Time series descriptions")
        public ArrayList<TimeSeriesDescription> TimeSeriesDescriptions = null;
        
        public ArrayList<TimeSeriesDescription> getTimeSeriesDescriptions() { return TimeSeriesDescriptions; }
        public TimeSeriesDescriptionListServiceResponse setTimeSeriesDescriptions(ArrayList<TimeSeriesDescription> value) { this.TimeSeriesDescriptions = value; return this; }
    }

    public static class TimeSeriesUniqueIdListServiceResponse extends PublishServiceResponse
    {
        /**
        * Token expired
        */
        @ApiMember(DataType="boolean", Description="Token expired")
        public Boolean TokenExpired = null;

        /**
        * Next token
        */
        @ApiMember(DataType="string", Description="Next token", Format="date-time")
        public Instant NextToken = null;

        /**
        * Time series unique ids
        */
        @ApiMember(DataType="array", Description="Time series unique ids")
        public ArrayList<TimeSeriesUniqueIds> TimeSeriesUniqueIds = null;
        
        public Boolean isTokenExpired() { return TokenExpired; }
        public TimeSeriesUniqueIdListServiceResponse setTokenExpired(Boolean value) { this.TokenExpired = value; return this; }
        public Instant getNextToken() { return NextToken; }
        public TimeSeriesUniqueIdListServiceResponse setNextToken(Instant value) { this.NextToken = value; return this; }
        public ArrayList<TimeSeriesUniqueIds> getTimeSeriesUniqueIds() { return TimeSeriesUniqueIds; }
        public TimeSeriesUniqueIdListServiceResponse setTimeSeriesUniqueIds(ArrayList<TimeSeriesUniqueIds> value) { this.TimeSeriesUniqueIds = value; return this; }
    }

    public static class FieldVisitDescriptionListServiceResponse extends PublishServiceResponse
    {
        /**
        * Field visit descriptions
        */
        @ApiMember(DataType="array", Description="Field visit descriptions")
        public ArrayList<FieldVisitDescription> FieldVisitDescriptions = null;

        /**
        * Field visits that have been deleted since the requested ChangesSinceToken
        */
        @ApiMember(DataType="array", Description="Field visits that have been deleted since the requested ChangesSinceToken")
        public ArrayList<FieldVisitDescription> DeletedFieldVisitDescriptions = null;

        /**
        * Next token
        */
        @ApiMember(DataType="string", Description="Next token", Format="date-time")
        public Instant NextToken = null;
        
        public ArrayList<FieldVisitDescription> getFieldVisitDescriptions() { return FieldVisitDescriptions; }
        public FieldVisitDescriptionListServiceResponse setFieldVisitDescriptions(ArrayList<FieldVisitDescription> value) { this.FieldVisitDescriptions = value; return this; }
        public ArrayList<FieldVisitDescription> getDeletedFieldVisitDescriptions() { return DeletedFieldVisitDescriptions; }
        public FieldVisitDescriptionListServiceResponse setDeletedFieldVisitDescriptions(ArrayList<FieldVisitDescription> value) { this.DeletedFieldVisitDescriptions = value; return this; }
        public Instant getNextToken() { return NextToken; }
        public FieldVisitDescriptionListServiceResponse setNextToken(Instant value) { this.NextToken = value; return this; }
    }

    public static class MetadataChangeTransactionListServiceResponse extends PublishServiceResponse
    {
        /**
        * Metadata change transactions
        */
        @ApiMember(DataType="array", Description="Metadata change transactions")
        public List<MetadataChangeTransaction> MetadataChangeTransactions = null;
        
        public List<MetadataChangeTransaction> getMetadataChangeTransactions() { return MetadataChangeTransactions; }
        public MetadataChangeTransactionListServiceResponse setMetadataChangeTransactions(List<MetadataChangeTransaction> value) { this.MetadataChangeTransactions = value; return this; }
    }

    public static class TagListServiceResponse extends PublishServiceResponse
    {
        /**
        * Tags
        */
        @ApiMember(DataType="array", Description="Tags")
        public ArrayList<TagDefinition> Tags = null;
        
        public ArrayList<TagDefinition> getTags() { return Tags; }
        public TagListServiceResponse setTags(ArrayList<TagDefinition> value) { this.Tags = value; return this; }
    }

    public static class LocationTagListServiceResponse
    {
        /**
        * Response version
        */
        @ApiMember(DataType="integer", Description="Response version", Format="int32")
        public Integer ResponseVersion = null;

        /**
        * Response time
        */
        @ApiMember(DataType="string", Description="Response time", Format="date-time")
        public Instant ResponseTime = null;

        /**
        * Summary
        */
        @ApiMember(Description="Summary")
        public String Summary = null;

        /**
        * Tags
        */
        @ApiMember(DataType="array", Description="Tags")
        public ArrayList<NameTagDefinition> Tags = null;
        
        public Integer getResponseVersion() { return ResponseVersion; }
        public LocationTagListServiceResponse setResponseVersion(Integer value) { this.ResponseVersion = value; return this; }
        public Instant getResponseTime() { return ResponseTime; }
        public LocationTagListServiceResponse setResponseTime(Instant value) { this.ResponseTime = value; return this; }
        public String getSummary() { return Summary; }
        public LocationTagListServiceResponse setSummary(String value) { this.Summary = value; return this; }
        public ArrayList<NameTagDefinition> getTags() { return Tags; }
        public LocationTagListServiceResponse setTags(ArrayList<NameTagDefinition> value) { this.Tags = value; return this; }
    }

    public static class TimeSeriesDescriptionListByUniqueIdServiceResponse extends PublishServiceResponse
    {
        /**
        * Time series descriptions
        */
        @ApiMember(DataType="array", Description="Time series descriptions")
        public ArrayList<TimeSeriesDescription> TimeSeriesDescriptions = null;
        
        public ArrayList<TimeSeriesDescription> getTimeSeriesDescriptions() { return TimeSeriesDescriptions; }
        public TimeSeriesDescriptionListByUniqueIdServiceResponse setTimeSeriesDescriptions(ArrayList<TimeSeriesDescription> value) { this.TimeSeriesDescriptions = value; return this; }
    }

    public static class FieldVisitDataServiceResponse extends PublishServiceResponse implements IFieldVisitData
    {
        /**
        * Field visit identifier
        */
        @ApiMember(Description="Field visit identifier")
        public String Identifier = null;

        /**
        * Attachments
        */
        @ApiMember(DataType="array", Description="Attachments")
        public ArrayList<Attachment> Attachments = null;

        /**
        * Discharge activities
        */
        @ApiMember(DataType="array", Description="Discharge activities")
        public ArrayList<DischargeActivity> DischargeActivities = null;

        /**
        * Gage height at zero flow activity
        */
        @ApiMember(DataType="GageHeightAtZeroFlowActivity", Description="Gage height at zero flow activity")
        public GageHeightAtZeroFlowActivity GageHeightAtZeroFlowActivity = null;

        /**
        * Control condition activity
        */
        @ApiMember(DataType="ControlConditionActivity", Description="Control condition activity")
        public ControlConditionActivity ControlConditionActivity = null;

        /**
        * Inspection activity
        */
        @ApiMember(DataType="InspectionActivity", Description="Inspection activity")
        public InspectionActivity InspectionActivity = null;

        /**
        * Cross-section survey activity
        */
        @ApiMember(DataType="array", Description="Cross-section survey activity")
        public ArrayList<CrossSectionSurveyActivity> CrossSectionSurveyActivity = null;

        /**
        * Level survey activity
        */
        @ApiMember(DataType="LevelSurveyActivity", Description="Level survey activity")
        public LevelSurveyActivity LevelSurveyActivity = null;

        /**
        * Approval
        */
        @ApiMember(DataType="FieldVisitApproval", Description="Approval")
        public FieldVisitApproval Approval = null;

        /**
        * Summary results for a requested datum conversion
        */
        @ApiMember(DataType="DatumConversionResult", Description="Summary results for a requested datum conversion")
        public DatumConversionResult DatumConversionResult = null;
        
        public String getIdentifier() { return Identifier; }
        public FieldVisitDataServiceResponse setIdentifier(String value) { this.Identifier = value; return this; }
        public ArrayList<Attachment> getAttachments() { return Attachments; }
        public FieldVisitDataServiceResponse setAttachments(ArrayList<Attachment> value) { this.Attachments = value; return this; }
        public ArrayList<DischargeActivity> getDischargeActivities() { return DischargeActivities; }
        public FieldVisitDataServiceResponse setDischargeActivities(ArrayList<DischargeActivity> value) { this.DischargeActivities = value; return this; }
        public GageHeightAtZeroFlowActivity getGageHeightAtZeroFlowActivity() { return GageHeightAtZeroFlowActivity; }
        public FieldVisitDataServiceResponse setGageHeightAtZeroFlowActivity(GageHeightAtZeroFlowActivity value) { this.GageHeightAtZeroFlowActivity = value; return this; }
        public ControlConditionActivity getControlConditionActivity() { return ControlConditionActivity; }
        public FieldVisitDataServiceResponse setControlConditionActivity(ControlConditionActivity value) { this.ControlConditionActivity = value; return this; }
        public InspectionActivity getInspectionActivity() { return InspectionActivity; }
        public FieldVisitDataServiceResponse setInspectionActivity(InspectionActivity value) { this.InspectionActivity = value; return this; }
        public ArrayList<CrossSectionSurveyActivity> getCrossSectionSurveyActivity() { return CrossSectionSurveyActivity; }
        public FieldVisitDataServiceResponse setCrossSectionSurveyActivity(ArrayList<CrossSectionSurveyActivity> value) { this.CrossSectionSurveyActivity = value; return this; }
        public LevelSurveyActivity getLevelSurveyActivity() { return LevelSurveyActivity; }
        public FieldVisitDataServiceResponse setLevelSurveyActivity(LevelSurveyActivity value) { this.LevelSurveyActivity = value; return this; }
        public FieldVisitApproval getApproval() { return Approval; }
        public FieldVisitDataServiceResponse setApproval(FieldVisitApproval value) { this.Approval = value; return this; }
        public DatumConversionResult getDatumConversionResult() { return DatumConversionResult; }
        public FieldVisitDataServiceResponse setDatumConversionResult(DatumConversionResult value) { this.DatumConversionResult = value; return this; }
    }

    public static class ActiveMetersAndCalibrationsServiceResponse extends PublishServiceResponse
    {
        /**
        * Current meter details
        */
        @ApiMember(DataType="array", Description="Current meter details")
        public ArrayList<ActiveMeterDetails> ActiveMeterDetails = null;
        
        public ArrayList<ActiveMeterDetails> getActiveMeterDetails() { return ActiveMeterDetails; }
        public ActiveMetersAndCalibrationsServiceResponse setActiveMeterDetails(ArrayList<ActiveMeterDetails> value) { this.ActiveMeterDetails = value; return this; }
    }

    public static class FieldVisitDataByLocationServiceResponse extends PublishServiceResponse
    {
        /**
        * Field visit descriptions and data
        */
        @ApiMember(DataType="array", Description="Field visit descriptions and data")
        public ArrayList<FieldVisit> FieldVisitData = null;
        
        public ArrayList<FieldVisit> getFieldVisitData() { return FieldVisitData; }
        public FieldVisitDataByLocationServiceResponse setFieldVisitData(ArrayList<FieldVisit> value) { this.FieldVisitData = value; return this; }
    }

    public static class FieldVisitReadingsByLocationServiceResponse extends PublishServiceResponse
    {
        /**
        * Field visit readings
        */
        @ApiMember(DataType="array", Description="Field visit readings")
        public ArrayList<FieldVisitReading> FieldVisitReadings = null;
        
        public ArrayList<FieldVisitReading> getFieldVisitReadings() { return FieldVisitReadings; }
        public FieldVisitReadingsByLocationServiceResponse setFieldVisitReadings(ArrayList<FieldVisitReading> value) { this.FieldVisitReadings = value; return this; }
    }

    public static class TrendLineAnalysisServiceResponse extends PublishServiceResponse
    {
        /**
        * Trend line analysis
        */
        @ApiMember(DataType="TrendLineAnalysis", Description="Trend line analysis")
        public TrendLineAnalysis TrendLineAnalysis = null;
        
        public TrendLineAnalysis getTrendLineAnalysis() { return TrendLineAnalysis; }
        public TrendLineAnalysisServiceResponse setTrendLineAnalysis(TrendLineAnalysis value) { this.TrendLineAnalysis = value; return this; }
    }

    public static class UnitListServiceResponse extends PublishServiceResponse
    {
        /**
        * Units
        */
        @ApiMember(DataType="array", Description="Units")
        public ArrayList<UnitMetadata> Units = null;
        
        public ArrayList<UnitMetadata> getUnits() { return Units; }
        public UnitListServiceResponse setUnits(ArrayList<UnitMetadata> value) { this.Units = value; return this; }
    }

    public static class RatingModelDescriptionListServiceResponse extends PublishServiceResponse
    {
        /**
        * Rating model descriptions
        */
        @ApiMember(DataType="array", Description="Rating model descriptions")
        public List<RatingModelDescription> RatingModelDescriptions = null;

        /**
        * Next token
        */
        @ApiMember(DataType="string", Description="Next token", Format="date-time")
        public Instant NextToken = null;
        
        public List<RatingModelDescription> getRatingModelDescriptions() { return RatingModelDescriptions; }
        public RatingModelDescriptionListServiceResponse setRatingModelDescriptions(List<RatingModelDescription> value) { this.RatingModelDescriptions = value; return this; }
        public Instant getNextToken() { return NextToken; }
        public RatingModelDescriptionListServiceResponse setNextToken(Instant value) { this.NextToken = value; return this; }
    }

    public static class RatingModelOutputValuesServiceResponse extends PublishServiceResponse
    {
        /**
        * Output values
        */
        @ApiMember(DataType="array", Description="Output values")
        public ArrayList<Double> OutputValues = null;
        
        public ArrayList<Double> getOutputValues() { return OutputValues; }
        public RatingModelOutputValuesServiceResponse setOutputValues(ArrayList<Double> value) { this.OutputValues = value; return this; }
    }

    public static class CorrectionListServiceResponse extends PublishServiceResponse
    {
        /**
        * Corrections
        */
        @ApiMember(DataType="array", Description="Corrections")
        public ArrayList<Correction> Corrections = null;
        
        public ArrayList<Correction> getCorrections() { return Corrections; }
        public CorrectionListServiceResponse setCorrections(ArrayList<Correction> value) { this.Corrections = value; return this; }
    }

    public static class MonitoringMethodListServiceResponse
    {
        /**
        * Response version
        */
        @ApiMember(DataType="integer", Description="Response version", Format="int32")
        public Integer ResponseVersion = null;

        /**
        * Response time
        */
        @ApiMember(DataType="string", Description="Response time", Format="date-time")
        public Instant ResponseTime = null;

        /**
        * Summary
        */
        @ApiMember(Description="Summary")
        public String Summary = null;

        /**
        * Monitoring methods
        */
        @ApiMember(DataType="array", Description="Monitoring methods")
        public ArrayList<MonitoringMethod> MonitoringMethods = null;
        
        public Integer getResponseVersion() { return ResponseVersion; }
        public MonitoringMethodListServiceResponse setResponseVersion(Integer value) { this.ResponseVersion = value; return this; }
        public Instant getResponseTime() { return ResponseTime; }
        public MonitoringMethodListServiceResponse setResponseTime(Instant value) { this.ResponseTime = value; return this; }
        public String getSummary() { return Summary; }
        public MonitoringMethodListServiceResponse setSummary(String value) { this.Summary = value; return this; }
        public ArrayList<MonitoringMethod> getMonitoringMethods() { return MonitoringMethods; }
        public MonitoringMethodListServiceResponse setMonitoringMethods(ArrayList<MonitoringMethod> value) { this.MonitoringMethods = value; return this; }
    }

    public static class QualifierListServiceResponse extends PublishServiceResponse
    {
        /**
        * Qualifiers
        */
        @ApiMember(DataType="array", Description="Qualifiers")
        public ArrayList<QualifierMetadata> Qualifiers = null;
        
        public ArrayList<QualifierMetadata> getQualifiers() { return Qualifiers; }
        public QualifierListServiceResponse setQualifiers(ArrayList<QualifierMetadata> value) { this.Qualifiers = value; return this; }
    }

    public static class ApprovalListServiceResponse extends PublishServiceResponse
    {
        /**
        * Approvals
        */
        @ApiMember(DataType="array", Description="Approvals")
        public ArrayList<ApprovalMetadata> Approvals = null;
        
        public ArrayList<ApprovalMetadata> getApprovals() { return Approvals; }
        public ApprovalListServiceResponse setApprovals(ArrayList<ApprovalMetadata> value) { this.Approvals = value; return this; }
    }

    public static class PublicKey
    {
        /**
        * RSA key size in bits
        */
        @ApiMember(DataType="integer", Description="RSA key size in bits", Format="int32")
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

    public static class TagMetadata
    {
        /**
        * UniqueId of the tag
        */
        @ApiMember(DataType="string", Description="UniqueId of the tag", Format="guid")
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
        @ApiMember(Description="Value of the applied tag, if the tag's ValueType is PickList")
        public String Value = null;
        
        public String getUniqueId() { return UniqueId; }
        public TagMetadata setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getName() { return Name; }
        public TagMetadata setName(String value) { this.Name = value; return this; }
        public String getKey() { return Key; }
        public TagMetadata setKey(String value) { this.Key = value; return this; }
        public String getValue() { return Value; }
        public TagMetadata setValue(String value) { this.Value = value; return this; }
    }

    public static class ExtendedAttribute
    {
        /**
        * UniqueId of the extended attribute
        */
        @ApiMember(DataType="string", Description="UniqueId of the extended attribute", Format="guid")
        public String UniqueId = null;

        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Type
        */
        @ApiMember(Description="Type")
        public String Type = null;

        /**
        * Value
        */
        @ApiMember(DataType="object", Description="Value")
        public Object Value = null;
        
        public String getUniqueId() { return UniqueId; }
        public ExtendedAttribute setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getName() { return Name; }
        public ExtendedAttribute setName(String value) { this.Name = value; return this; }
        public String getType() { return Type; }
        public ExtendedAttribute setType(String value) { this.Type = value; return this; }
        public Object getValue() { return Value; }
        public ExtendedAttribute setValue(Object value) { this.Value = value; return this; }
    }

    public static class LocationRemark
    {
        /**
        * Create time
        */
        @ApiMember(DataType="string", Description="Create time", Format="date-time")
        public Instant CreateTime = null;

        /**
        * From time
        */
        @ApiMember(DataType="string", Description="From time", Format="date-time")
        public Instant FromTime = null;

        /**
        * To time
        */
        @ApiMember(DataType="string", Description="To time", Format="date-time")
        public Instant ToTime = null;

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
        * Remark
        */
        @ApiMember(Description="Remark")
        public String Remark = null;
        
        public Instant getCreateTime() { return CreateTime; }
        public LocationRemark setCreateTime(Instant value) { this.CreateTime = value; return this; }
        public Instant getFromTime() { return FromTime; }
        public LocationRemark setFromTime(Instant value) { this.FromTime = value; return this; }
        public Instant getToTime() { return ToTime; }
        public LocationRemark setToTime(Instant value) { this.ToTime = value; return this; }
        public String getTypeName() { return TypeName; }
        public LocationRemark setTypeName(String value) { this.TypeName = value; return this; }
        public String getDescription() { return Description; }
        public LocationRemark setDescription(String value) { this.Description = value; return this; }
        public String getRemark() { return Remark; }
        public LocationRemark setRemark(String value) { this.Remark = value; return this; }
    }

    public static class LocationNote
    {
        /**
        * UniqueId
        */
        @ApiMember(DataType="string", Description="UniqueId", Format="guid")
        public String UniqueId = null;

        /**
        * Create time (UTC)
        */
        @ApiMember(DataType="string", Description="Create time (UTC)", Format="date-time")
        public Instant CreateTimeUtc = null;

        /**
        * Last modified time (UTC)
        */
        @ApiMember(DataType="string", Description="Last modified time (UTC)", Format="date-time")
        public Instant LastModifiedUtc = null;

        /**
        * From time (UTC)
        */
        @ApiMember(DataType="string", Description="From time (UTC)", Format="date-time")
        public Instant FromTimeUtc = null;

        /**
        * To time (UTC)
        */
        @ApiMember(DataType="string", Description="To time (UTC)", Format="date-time")
        public Instant ToTimeUtc = null;

        /**
        * Details
        */
        @ApiMember(Description="Details")
        public String Details = null;

        /**
        * Time-series unique id
        */
        @ApiMember(DataType="string", Description="Time-series unique id", Format="guid")
        public String TimeSeriesUniqueId = null;

        /**
        * Location note tags
        */
        @ApiMember(DataType="array", Description="Location note tags")
        public ArrayList<TagMetadata> Tags = null;

        /**
        * User who last modified this note
        */
        @ApiMember(Description="User who last modified this note")
        public String LastModifiedByUser = null;
        
        public String getUniqueId() { return UniqueId; }
        public LocationNote setUniqueId(String value) { this.UniqueId = value; return this; }
        public Instant getCreateTimeUtc() { return CreateTimeUtc; }
        public LocationNote setCreateTimeUtc(Instant value) { this.CreateTimeUtc = value; return this; }
        public Instant getLastModifiedUtc() { return LastModifiedUtc; }
        public LocationNote setLastModifiedUtc(Instant value) { this.LastModifiedUtc = value; return this; }
        public Instant getFromTimeUtc() { return FromTimeUtc; }
        public LocationNote setFromTimeUtc(Instant value) { this.FromTimeUtc = value; return this; }
        public Instant getToTimeUtc() { return ToTimeUtc; }
        public LocationNote setToTimeUtc(Instant value) { this.ToTimeUtc = value; return this; }
        public String getDetails() { return Details; }
        public LocationNote setDetails(String value) { this.Details = value; return this; }
        public String getTimeSeriesUniqueId() { return TimeSeriesUniqueId; }
        public LocationNote setTimeSeriesUniqueId(String value) { this.TimeSeriesUniqueId = value; return this; }
        public ArrayList<TagMetadata> getTags() { return Tags; }
        public LocationNote setTags(ArrayList<TagMetadata> value) { this.Tags = value; return this; }
        public String getLastModifiedByUser() { return LastModifiedByUser; }
        public LocationNote setLastModifiedByUser(String value) { this.LastModifiedByUser = value; return this; }
    }

    public static class Attachment
    {
        /**
        * Attachment type
        */
        @ApiMember(DataType="string", Description="Attachment type")
        public AttachmentType AttachmentType = null;

        /**
        * Attachment category
        */
        @ApiMember(DataType="AttachmentCategory", Description="Attachment category")
        public AttachmentCategory AttachmentCategory = null;

        /**
        * File name
        */
        @ApiMember(Description="File name")
        public String FileName = null;

        /**
        * Unique ID of the attachment
        */
        @ApiMember(DataType="string", Description="Unique ID of the attachment", Format="guid")
        public String UniqueId = null;

        /**
        * Instant created
        */
        @ApiMember(DataType="string", Description="Instant created", Format="date-time")
        public Instant DateCreated = null;

        /**
        * Instant uploaded
        */
        @ApiMember(DataType="string", Description="Instant uploaded", Format="date-time")
        public Instant DateUploaded = null;

        /**
        * Instant last accessed
        */
        @ApiMember(DataType="string", Description="Instant last accessed", Format="date-time")
        public Instant DateLastAccessed = null;

        /**
        * Uploaded by user
        */
        @ApiMember(Description="Uploaded by user")
        public String UploadedByUser = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;

        /**
        * Gps latitude
        */
        @ApiMember(DataType="number", Description="Gps latitude", Format="double")
        public Double GpsLatitude = null;

        /**
        * Gps longitude
        */
        @ApiMember(DataType="number", Description="Gps longitude", Format="double")
        public Double GpsLongitude = null;

        /**
        * Url
        */
        @ApiMember(Description="Url")
        public String Url = null;

        /**
        * Tags
        */
        @ApiMember(DataType="array", Description="Tags")
        public ArrayList<TagMetadata> Tags = null;
        
        public AttachmentType getAttachmentType() { return AttachmentType; }
        public Attachment setAttachmentType(AttachmentType value) { this.AttachmentType = value; return this; }
        public AttachmentCategory getAttachmentCategory() { return AttachmentCategory; }
        public Attachment setAttachmentCategory(AttachmentCategory value) { this.AttachmentCategory = value; return this; }
        public String getFileName() { return FileName; }
        public Attachment setFileName(String value) { this.FileName = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public Attachment setUniqueId(String value) { this.UniqueId = value; return this; }
        public Instant getDateCreated() { return DateCreated; }
        public Attachment setDateCreated(Instant value) { this.DateCreated = value; return this; }
        public Instant getDateUploaded() { return DateUploaded; }
        public Attachment setDateUploaded(Instant value) { this.DateUploaded = value; return this; }
        public Instant getDateLastAccessed() { return DateLastAccessed; }
        public Attachment setDateLastAccessed(Instant value) { this.DateLastAccessed = value; return this; }
        public String getUploadedByUser() { return UploadedByUser; }
        public Attachment setUploadedByUser(String value) { this.UploadedByUser = value; return this; }
        public String getComment() { return Comment; }
        public Attachment setComment(String value) { this.Comment = value; return this; }
        public Double getGpsLatitude() { return GpsLatitude; }
        public Attachment setGpsLatitude(Double value) { this.GpsLatitude = value; return this; }
        public Double getGpsLongitude() { return GpsLongitude; }
        public Attachment setGpsLongitude(Double value) { this.GpsLongitude = value; return this; }
        public String getUrl() { return Url; }
        public Attachment setUrl(String value) { this.Url = value; return this; }
        public ArrayList<TagMetadata> getTags() { return Tags; }
        public Attachment setTags(ArrayList<TagMetadata> value) { this.Tags = value; return this; }
    }

    public static class LocationDatum
    {
        /**
        * Reference standard
        */
        @ApiMember(DataType="LocationReferenceStandard", Description="Reference standard")
        public LocationReferenceStandard ReferenceStandard = null;

        /**
        * Datum periods
        */
        @ApiMember(DataType="array", Description="Datum periods")
        public ArrayList<LocationDatumPeriod> DatumPeriods = null;
        
        public LocationReferenceStandard getReferenceStandard() { return ReferenceStandard; }
        public LocationDatum setReferenceStandard(LocationReferenceStandard value) { this.ReferenceStandard = value; return this; }
        public ArrayList<LocationDatumPeriod> getDatumPeriods() { return DatumPeriods; }
        public LocationDatum setDatumPeriods(ArrayList<LocationDatumPeriod> value) { this.DatumPeriods = value; return this; }
    }

    public static class ReferencePoint
    {
        /**
        * Unique ID of the reference point
        */
        @ApiMember(DataType="string", Description="Unique ID of the reference point", Format="guid")
        public String UniqueId = null;

        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Decommissioned date
        */
        @ApiMember(DataType="string", Description="Decommissioned date", Format="date-time")
        public Instant DecommissionedDate = null;

        /**
        * Decommissioned reason
        */
        @ApiMember(Description="Decommissioned reason")
        public String DecommissionedReason = null;

        /**
        * Point has been the primary reference point since this date. If no date is provided, the point is treated as a regular point.
        */
        @ApiMember(DataType="string", Description="Point has been the primary reference point since this date. If no date is provided, the point is treated as a regular point.", Format="date-time")
        public Instant PrimarySinceDate = null;

        /**
        * Latitude (WGS 84)
        */
        @ApiMember(DataType="number", Description="Latitude (WGS 84)", Format="double")
        public Double Latitude = null;

        /**
        * Longitude (WGS 84)
        */
        @ApiMember(DataType="number", Description="Longitude (WGS 84)", Format="double")
        public Double Longitude = null;

        /**
        * Periods of applicability
        */
        @ApiMember(DataType="array", Description="Periods of applicability")
        public ArrayList<ReferencePointPeriod> ReferencePointPeriods = null;
        
        public String getUniqueId() { return UniqueId; }
        public ReferencePoint setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getName() { return Name; }
        public ReferencePoint setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public ReferencePoint setDescription(String value) { this.Description = value; return this; }
        public Instant getDecommissionedDate() { return DecommissionedDate; }
        public ReferencePoint setDecommissionedDate(Instant value) { this.DecommissionedDate = value; return this; }
        public String getDecommissionedReason() { return DecommissionedReason; }
        public ReferencePoint setDecommissionedReason(String value) { this.DecommissionedReason = value; return this; }
        public Instant getPrimarySinceDate() { return PrimarySinceDate; }
        public ReferencePoint setPrimarySinceDate(Instant value) { this.PrimarySinceDate = value; return this; }
        public Double getLatitude() { return Latitude; }
        public ReferencePoint setLatitude(Double value) { this.Latitude = value; return this; }
        public Double getLongitude() { return Longitude; }
        public ReferencePoint setLongitude(Double value) { this.Longitude = value; return this; }
        public ArrayList<ReferencePointPeriod> getReferencePointPeriods() { return ReferencePointPeriods; }
        public ReferencePoint setReferencePointPeriods(ArrayList<ReferencePointPeriod> value) { this.ReferencePointPeriods = value; return this; }
    }

    public static class PublishServiceResponse
    {
        /**
        * Response version
        */
        @ApiMember(DataType="integer", Description="Response version", Format="int32")
        public Integer ResponseVersion = null;

        /**
        * Response time
        */
        @ApiMember(DataType="string", Description="Response time", Format="date-time")
        public Instant ResponseTime = null;

        /**
        * Summary
        */
        @ApiMember(Description="Summary")
        public String Summary = null;
        
        public Integer getResponseVersion() { return ResponseVersion; }
        public PublishServiceResponse setResponseVersion(Integer value) { this.ResponseVersion = value; return this; }
        public Instant getResponseTime() { return ResponseTime; }
        public PublishServiceResponse setResponseTime(Instant value) { this.ResponseTime = value; return this; }
        public String getSummary() { return Summary; }
        public PublishServiceResponse setSummary(String value) { this.Summary = value; return this; }
    }

    public static class ExtendedAttributeFilter
    {
        /**
        * Filter name
        */
        @ApiMember(Description="Filter name")
        public String FilterName = null;

        /**
        * Filter value
        */
        @ApiMember(Description="Filter value")
        public String FilterValue = null;
        
        public String getFilterName() { return FilterName; }
        public ExtendedAttributeFilter setFilterName(String value) { this.FilterName = value; return this; }
        public String getFilterValue() { return FilterValue; }
        public ExtendedAttributeFilter setFilterValue(String value) { this.FilterValue = value; return this; }
    }

    public static class LocationDescription
    {
        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Unique id
        */
        @ApiMember(DataType="string", Description="Unique id", Format="guid")
        public String UniqueId = null;

        /**
        * External locations are created by data connectors.
        */
        @ApiMember(DataType="boolean", Description="External locations are created by data connectors.")
        public Boolean IsExternalLocation = null;

        /**
        * Primary folder
        */
        @ApiMember(Description="Primary folder")
        public String PrimaryFolder = null;

        /**
        * Secondary folders
        */
        @ApiMember(DataType="array", Description="Secondary folders")
        public ArrayList<String> SecondaryFolders = null;

        /**
        * Last modified
        */
        @ApiMember(DataType="string", Description="Last modified", Format="date-time")
        public Instant LastModified = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Tags
        */
        @ApiMember(DataType="array", Description="Tags")
        public ArrayList<TagMetadata> Tags = null;
        
        public String getName() { return Name; }
        public LocationDescription setName(String value) { this.Name = value; return this; }
        public String getIdentifier() { return Identifier; }
        public LocationDescription setIdentifier(String value) { this.Identifier = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public LocationDescription setUniqueId(String value) { this.UniqueId = value; return this; }
        public Boolean getIsExternalLocation() { return IsExternalLocation; }
        public LocationDescription setIsExternalLocation(Boolean value) { this.IsExternalLocation = value; return this; }
        public String getPrimaryFolder() { return PrimaryFolder; }
        public LocationDescription setPrimaryFolder(String value) { this.PrimaryFolder = value; return this; }
        public ArrayList<String> getSecondaryFolders() { return SecondaryFolders; }
        public LocationDescription setSecondaryFolders(ArrayList<String> value) { this.SecondaryFolders = value; return this; }
        public Instant getLastModified() { return LastModified; }
        public LocationDescription setLastModified(Instant value) { this.LastModified = value; return this; }
        public Boolean isPublish() { return Publish; }
        public LocationDescription setPublish(Boolean value) { this.Publish = value; return this; }
        public ArrayList<TagMetadata> getTags() { return Tags; }
        public LocationDescription setTags(ArrayList<TagMetadata> value) { this.Tags = value; return this; }
    }

    public static class StagePoint
    {
        /**
        * Input value
        */
        @ApiMember(DataType="number", Description="Input value", Format="double")
        public Double InputValue = null;

        /**
        * Correction
        */
        @ApiMember(DataType="number", Description="Correction", Format="double")
        public Double Correction = null;

        /**
        * Corrected value
        */
        @ApiMember(DataType="number", Description="Corrected value", Format="double")
        public Double CorrectedValue = null;
        
        public Double getInputValue() { return InputValue; }
        public StagePoint setInputValue(Double value) { this.InputValue = value; return this; }
        public Double getCorrection() { return Correction; }
        public StagePoint setCorrection(Double value) { this.Correction = value; return this; }
        public Double getCorrectedValue() { return CorrectedValue; }
        public StagePoint setCorrectedValue(Double value) { this.CorrectedValue = value; return this; }
    }

    public static class Correction
    {
        /**
        * Type
        */
        @ApiMember(DataType="string", Description="Type")
        public CorrectionType Type = null;

        /**
        * Start time
        */
        @ApiMember(DataType="string", Description="Start time", Format="date-time")
        public Instant StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="string", Description="End time", Format="date-time")
        public Instant EndTime = null;

        /**
        * Applied time utc
        */
        @ApiMember(DataType="string", Description="Applied time utc", Format="date-time")
        public Instant AppliedTimeUtc = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        public HashMap<String,Object> Parameters = null;
        /**
        * Processing order
        */
        @ApiMember(DataType="CorrectionProcessingOrder", Description="Processing order")
        public CorrectionProcessingOrder ProcessingOrder = null;
        
        public CorrectionType getType() { return Type; }
        public Correction setType(CorrectionType value) { this.Type = value; return this; }
        public Instant getStartTime() { return StartTime; }
        public Correction setStartTime(Instant value) { this.StartTime = value; return this; }
        public Instant getEndTime() { return EndTime; }
        public Correction setEndTime(Instant value) { this.EndTime = value; return this; }
        public Instant getAppliedTimeUtc() { return AppliedTimeUtc; }
        public Correction setAppliedTimeUtc(Instant value) { this.AppliedTimeUtc = value; return this; }
        public String getComment() { return Comment; }
        public Correction setComment(String value) { this.Comment = value; return this; }
        public String getUser() { return User; }
        public Correction setUser(String value) { this.User = value; return this; }
        public HashMap<String,Object> getParameters() { return Parameters; }
        public Correction setParameters(HashMap<String,Object> value) { this.Parameters = value; return this; }
        public CorrectionProcessingOrder getProcessingOrder() { return ProcessingOrder; }
        public Correction setProcessingOrder(CorrectionProcessingOrder value) { this.ProcessingOrder = value; return this; }
    }

    public static class Report
    {
        /**
        * ReportUniqueId
        */
        @ApiMember(DataType="string", Description="ReportUniqueId", Format="guid")
        public String ReportUniqueId = null;

        /**
        * Title
        */
        @ApiMember(Description="Title")
        public String Title = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Created time (UTC)
        */
        @ApiMember(DataType="string", Description="Created time (UTC)", Format="date-time")
        public Instant CreatedTime = null;

        /**
        * Time range of source data displayed in report (UTC)
        */
        @ApiMember(DataType="TimeRange", Description="Time range of source data displayed in report (UTC)")
        public TimeRange SourceTimeRange = null;

        /**
        * Is transient
        */
        @ApiMember(DataType="boolean", Description="Is transient")
        public Boolean IsTransient = null;

        /**
        * Source time-series unique IDs
        */
        @ApiMember(DataType="array", Description="Source time-series unique IDs")
        public ArrayList<String> SourceTimeSeriesUniqueIds = null;

        /**
        * Location unique ID
        */
        @ApiMember(DataType="string", Description="Location unique ID", Format="guid")
        public String LocationUniqueId = null;

        /**
        * Tags
        */
        @ApiMember(DataType="array", Description="Tags")
        public ArrayList<TagMetadata> Tags = null;

        /**
        * Report creator's user unique ID
        */
        @ApiMember(DataType="string", Description="Report creator's user unique ID", Format="guid")
        public String UserUniqueId = null;

        /**
        * Report creator's user name
        */
        @ApiMember(Description="Report creator's user name")
        public String UserName = null;

        /**
        * Attachment URL
        */
        @ApiMember(Description="Attachment URL")
        public String Url = null;
        
        public String getReportUniqueId() { return ReportUniqueId; }
        public Report setReportUniqueId(String value) { this.ReportUniqueId = value; return this; }
        public String getTitle() { return Title; }
        public Report setTitle(String value) { this.Title = value; return this; }
        public String getDescription() { return Description; }
        public Report setDescription(String value) { this.Description = value; return this; }
        public String getComments() { return Comments; }
        public Report setComments(String value) { this.Comments = value; return this; }
        public Instant getCreatedTime() { return CreatedTime; }
        public Report setCreatedTime(Instant value) { this.CreatedTime = value; return this; }
        public TimeRange getSourceTimeRange() { return SourceTimeRange; }
        public Report setSourceTimeRange(TimeRange value) { this.SourceTimeRange = value; return this; }
        public Boolean getIsTransient() { return IsTransient; }
        public Report setIsTransient(Boolean value) { this.IsTransient = value; return this; }
        public ArrayList<String> getSourceTimeSeriesUniqueIds() { return SourceTimeSeriesUniqueIds; }
        public Report setSourceTimeSeriesUniqueIds(ArrayList<String> value) { this.SourceTimeSeriesUniqueIds = value; return this; }
        public String getLocationUniqueId() { return LocationUniqueId; }
        public Report setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public ArrayList<TagMetadata> getTags() { return Tags; }
        public Report setTags(ArrayList<TagMetadata> value) { this.Tags = value; return this; }
        public String getUserUniqueId() { return UserUniqueId; }
        public Report setUserUniqueId(String value) { this.UserUniqueId = value; return this; }
        public String getUserName() { return UserName; }
        public Report setUserName(String value) { this.UserName = value; return this; }
        public String getUrl() { return Url; }
        public Report setUrl(String value) { this.Url = value; return this; }
    }

    public static class RatingCurve
    {
        /**
        * Id
        */
        @ApiMember(Description="Id")
        public String Id = null;

        /**
        * Type
        */
        @ApiMember(DataType="string", Description="Type")
        public RatingCurveType Type = null;

        /**
        * Equation
        */
        @ApiMember(Description="Equation")
        public String Equation = null;

        /**
        * Remarks
        */
        @ApiMember(Description="Remarks")
        public String Remarks = null;

        /**
        * Input parameter
        */
        @ApiMember(DataType="ParameterWithUnit", Description="Input parameter")
        public ParameterWithUnit InputParameter = null;

        /**
        * Output parameter
        */
        @ApiMember(DataType="ParameterWithUnit", Description="Output parameter")
        public ParameterWithUnit OutputParameter = null;

        /**
        * Periods of applicability
        */
        @ApiMember(DataType="array", Description="Periods of applicability")
        public ArrayList<PeriodOfApplicability> PeriodsOfApplicability = null;

        /**
        * Shifts
        */
        @ApiMember(DataType="array", Description="Shifts")
        public ArrayList<RatingShift> Shifts = null;

        /**
        * Base rating table
        */
        @ApiMember(DataType="array", Description="Base rating table")
        public ArrayList<RatingPoint> BaseRatingTable = null;

        /**
        * Offsets
        */
        @ApiMember(DataType="array", Description="Offsets")
        public ArrayList<OffsetPoint> Offsets = null;
        
        public String getId() { return Id; }
        public RatingCurve setId(String value) { this.Id = value; return this; }
        public RatingCurveType getType() { return Type; }
        public RatingCurve setType(RatingCurveType value) { this.Type = value; return this; }
        public String getEquation() { return Equation; }
        public RatingCurve setEquation(String value) { this.Equation = value; return this; }
        public String getRemarks() { return Remarks; }
        public RatingCurve setRemarks(String value) { this.Remarks = value; return this; }
        public ParameterWithUnit getInputParameter() { return InputParameter; }
        public RatingCurve setInputParameter(ParameterWithUnit value) { this.InputParameter = value; return this; }
        public ParameterWithUnit getOutputParameter() { return OutputParameter; }
        public RatingCurve setOutputParameter(ParameterWithUnit value) { this.OutputParameter = value; return this; }
        public ArrayList<PeriodOfApplicability> getPeriodsOfApplicability() { return PeriodsOfApplicability; }
        public RatingCurve setPeriodsOfApplicability(ArrayList<PeriodOfApplicability> value) { this.PeriodsOfApplicability = value; return this; }
        public ArrayList<RatingShift> getShifts() { return Shifts; }
        public RatingCurve setShifts(ArrayList<RatingShift> value) { this.Shifts = value; return this; }
        public ArrayList<RatingPoint> getBaseRatingTable() { return BaseRatingTable; }
        public RatingCurve setBaseRatingTable(ArrayList<RatingPoint> value) { this.BaseRatingTable = value; return this; }
        public ArrayList<OffsetPoint> getOffsets() { return Offsets; }
        public RatingCurve setOffsets(ArrayList<OffsetPoint> value) { this.Offsets = value; return this; }
    }

    public static class Approval extends TimeRange
    {
        /**
        * Approval level
        */
        @ApiMember(DataType="integer", Description="Approval level", Format="int32")
        public Integer ApprovalLevel = null;

        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        /**
        * Level description
        */
        @ApiMember(Description="Level description")
        public String LevelDescription = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;
        
        public Integer getApprovalLevel() { return ApprovalLevel; }
        public Approval setApprovalLevel(Integer value) { this.ApprovalLevel = value; return this; }
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public Approval setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public Approval setUser(String value) { this.User = value; return this; }
        public String getLevelDescription() { return LevelDescription; }
        public Approval setLevelDescription(String value) { this.LevelDescription = value; return this; }
        public String getComment() { return Comment; }
        public Approval setComment(String value) { this.Comment = value; return this; }
    }

    public static class ParameterMetadata
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

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
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Interpolation type
        */
        @ApiMember(Description="Interpolation type")
        public String InterpolationType = null;

        /**
        * Rounding spec
        */
        @ApiMember(Description="Rounding spec")
        public String RoundingSpec = null;
        
        public String getIdentifier() { return Identifier; }
        public ParameterMetadata setIdentifier(String value) { this.Identifier = value; return this; }
        public String getUnitGroupIdentifier() { return UnitGroupIdentifier; }
        public ParameterMetadata setUnitGroupIdentifier(String value) { this.UnitGroupIdentifier = value; return this; }
        public String getUnitIdentifier() { return UnitIdentifier; }
        public ParameterMetadata setUnitIdentifier(String value) { this.UnitIdentifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public ParameterMetadata setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getInterpolationType() { return InterpolationType; }
        public ParameterMetadata setInterpolationType(String value) { this.InterpolationType = value; return this; }
        public String getRoundingSpec() { return RoundingSpec; }
        public ParameterMetadata setRoundingSpec(String value) { this.RoundingSpec = value; return this; }
    }

    public static class ApprovalsTransaction extends Approval
    {
        
    }

    public static class ExpandedRatingCurve
    {
        /**
        * Id
        */
        @ApiMember(Description="Id")
        public String Id = null;

        /**
        * Type
        */
        @ApiMember(DataType="string", Description="Type")
        public RatingCurveType Type = null;

        /**
        * Remarks
        */
        @ApiMember(Description="Remarks")
        public String Remarks = null;

        /**
        * Input parameter
        */
        @ApiMember(DataType="ParameterWithUnit", Description="Input parameter")
        public ParameterWithUnit InputParameter = null;

        /**
        * Output parameter
        */
        @ApiMember(DataType="ParameterWithUnit", Description="Output parameter")
        public ParameterWithUnit OutputParameter = null;

        /**
        * Periods of applicability
        */
        @ApiMember(DataType="array", Description="Periods of applicability")
        public ArrayList<PeriodOfApplicability> PeriodsOfApplicability = null;

        /**
        * Shifts
        */
        @ApiMember(DataType="array", Description="Shifts")
        public ArrayList<RatingShift> Shifts = null;

        /**
        * Offsets
        */
        @ApiMember(DataType="array", Description="Offsets")
        public ArrayList<OffsetPoint> Offsets = null;

        /**
        * Is blended
        */
        @ApiMember(DataType="boolean", Description="Is blended")
        public Boolean IsBlended = null;

        /**
        * Base rating table
        */
        @ApiMember(DataType="array", Description="Base rating table")
        public ArrayList<RatingPoint> BaseRatingTable = null;

        /**
        * Adjusted rating table
        */
        @ApiMember(DataType="array", Description="Adjusted rating table")
        public ArrayList<RatingPoint> AdjustedRatingTable = null;
        
        public String getId() { return Id; }
        public ExpandedRatingCurve setId(String value) { this.Id = value; return this; }
        public RatingCurveType getType() { return Type; }
        public ExpandedRatingCurve setType(RatingCurveType value) { this.Type = value; return this; }
        public String getRemarks() { return Remarks; }
        public ExpandedRatingCurve setRemarks(String value) { this.Remarks = value; return this; }
        public ParameterWithUnit getInputParameter() { return InputParameter; }
        public ExpandedRatingCurve setInputParameter(ParameterWithUnit value) { this.InputParameter = value; return this; }
        public ParameterWithUnit getOutputParameter() { return OutputParameter; }
        public ExpandedRatingCurve setOutputParameter(ParameterWithUnit value) { this.OutputParameter = value; return this; }
        public ArrayList<PeriodOfApplicability> getPeriodsOfApplicability() { return PeriodsOfApplicability; }
        public ExpandedRatingCurve setPeriodsOfApplicability(ArrayList<PeriodOfApplicability> value) { this.PeriodsOfApplicability = value; return this; }
        public ArrayList<RatingShift> getShifts() { return Shifts; }
        public ExpandedRatingCurve setShifts(ArrayList<RatingShift> value) { this.Shifts = value; return this; }
        public ArrayList<OffsetPoint> getOffsets() { return Offsets; }
        public ExpandedRatingCurve setOffsets(ArrayList<OffsetPoint> value) { this.Offsets = value; return this; }
        public Boolean getIsBlended() { return IsBlended; }
        public ExpandedRatingCurve setIsBlended(Boolean value) { this.IsBlended = value; return this; }
        public ArrayList<RatingPoint> getBaseRatingTable() { return BaseRatingTable; }
        public ExpandedRatingCurve setBaseRatingTable(ArrayList<RatingPoint> value) { this.BaseRatingTable = value; return this; }
        public ArrayList<RatingPoint> getAdjustedRatingTable() { return AdjustedRatingTable; }
        public ExpandedRatingCurve setAdjustedRatingTable(ArrayList<RatingPoint> value) { this.AdjustedRatingTable = value; return this; }
    }

    public static class LocationMonitoringMethod
    {
        /**
        * UniqueId
        */
        @ApiMember(DataType="string", Description="UniqueId", Format="guid")
        public String UniqueId = null;

        /**
        * Location Identifier
        */
        @ApiMember(Description="Location Identifier")
        public String LocationIdentifier = null;

        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Method Code
        */
        @ApiMember(Description="Method Code")
        public String MethodCode = null;

        /**
        * Method Display Name
        */
        @ApiMember(Description="Method Display Name")
        public String Method = null;

        /**
        * Parameter Name
        */
        @ApiMember(Description="Parameter Name")
        public String Parameter = null;

        /**
        * Parameter Id
        */
        @ApiMember(Description="Parameter Id")
        public String ParameterId = null;

        /**
        * Parameter Unique Id
        */
        @ApiMember(DataType="string", Description="Parameter Unique Id", Format="guid")
        public String ParameterUniqueId = null;

        /**
        * Unit Id
        */
        @ApiMember(Description="Unit Id")
        public String UnitId = null;

        /**
        * Unit Name
        */
        @ApiMember(Description="Unit Name")
        public String UnitName = null;

        /**
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;

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
        @ApiMember(DataType="string", Description="Last modified time (UTC)", Format="date-time")
        public Instant LastModifiedUtc = null;

        /**
        * Tags
        */
        @ApiMember(DataType="array", Description="Tags")
        public ArrayList<TagMetadata> Tags = null;
        
        public String getUniqueId() { return UniqueId; }
        public LocationMonitoringMethod setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public LocationMonitoringMethod setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getName() { return Name; }
        public LocationMonitoringMethod setName(String value) { this.Name = value; return this; }
        public String getMethodCode() { return MethodCode; }
        public LocationMonitoringMethod setMethodCode(String value) { this.MethodCode = value; return this; }
        public String getMethod() { return Method; }
        public LocationMonitoringMethod setMethod(String value) { this.Method = value; return this; }
        public String getParameter() { return Parameter; }
        public LocationMonitoringMethod setParameter(String value) { this.Parameter = value; return this; }
        public String getParameterId() { return ParameterId; }
        public LocationMonitoringMethod setParameterId(String value) { this.ParameterId = value; return this; }
        public String getParameterUniqueId() { return ParameterUniqueId; }
        public LocationMonitoringMethod setParameterUniqueId(String value) { this.ParameterUniqueId = value; return this; }
        public String getUnitId() { return UnitId; }
        public LocationMonitoringMethod setUnitId(String value) { this.UnitId = value; return this; }
        public String getUnitName() { return UnitName; }
        public LocationMonitoringMethod setUnitName(String value) { this.UnitName = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public LocationMonitoringMethod setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public String getComment() { return Comment; }
        public LocationMonitoringMethod setComment(String value) { this.Comment = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public LocationMonitoringMethod setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public LocationMonitoringMethod setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public LocationMonitoringMethod setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public Instant getLastModifiedUtc() { return LastModifiedUtc; }
        public LocationMonitoringMethod setLastModifiedUtc(Instant value) { this.LastModifiedUtc = value; return this; }
        public ArrayList<TagMetadata> getTags() { return Tags; }
        public LocationMonitoringMethod setTags(ArrayList<TagMetadata> value) { this.Tags = value; return this; }
    }

    public static class Processor
    {
        /**
        * Processor type
        */
        @ApiMember(Description="Processor type")
        public String ProcessorType = null;

        /**
        * Input time series unique ids
        */
        @ApiMember(DataType="array", Description="Input time series unique ids")
        public ArrayList<String> InputTimeSeriesUniqueIds = null;

        /**
        * Output time series unique id
        */
        @ApiMember(DataType="string", Description="Output time series unique id", Format="guid")
        public String OutputTimeSeriesUniqueId = null;

        /**
        * Processor period
        */
        @ApiMember(DataType="TimeRange", Description="Processor period")
        public TimeRange ProcessorPeriod = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Input rating model identifier
        */
        @ApiMember(Description="Input rating model identifier")
        public String InputRatingModelIdentifier = null;

        public HashMap<String,String> Settings = null;
        
        public String getProcessorType() { return ProcessorType; }
        public Processor setProcessorType(String value) { this.ProcessorType = value; return this; }
        public ArrayList<String> getInputTimeSeriesUniqueIds() { return InputTimeSeriesUniqueIds; }
        public Processor setInputTimeSeriesUniqueIds(ArrayList<String> value) { this.InputTimeSeriesUniqueIds = value; return this; }
        public String getOutputTimeSeriesUniqueId() { return OutputTimeSeriesUniqueId; }
        public Processor setOutputTimeSeriesUniqueId(String value) { this.OutputTimeSeriesUniqueId = value; return this; }
        public TimeRange getProcessorPeriod() { return ProcessorPeriod; }
        public Processor setProcessorPeriod(TimeRange value) { this.ProcessorPeriod = value; return this; }
        public String getDescription() { return Description; }
        public Processor setDescription(String value) { this.Description = value; return this; }
        public String getInputRatingModelIdentifier() { return InputRatingModelIdentifier; }
        public Processor setInputRatingModelIdentifier(String value) { this.InputRatingModelIdentifier = value; return this; }
        public HashMap<String,String> getSettings() { return Settings; }
        public Processor setSettings(HashMap<String,String> value) { this.Settings = value; return this; }
    }

    public static class GradeMetadata
    {
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
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Color
        */
        @ApiMember(Description="Color")
        public String Color = null;
        
        public String getIdentifier() { return Identifier; }
        public GradeMetadata setIdentifier(String value) { this.Identifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public GradeMetadata setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public GradeMetadata setDescription(String value) { this.Description = value; return this; }
        public String getColor() { return Color; }
        public GradeMetadata setColor(String value) { this.Color = value; return this; }
    }

    public static class EffectiveShift
    {
        /**
        * Timestamp
        */
        @ApiMember(DataType="string", Description="Timestamp", Format="date-time")
        public Instant Timestamp = null;

        /**
        * Value
        */
        @ApiMember(DataType="number", Description="Value", Format="double")
        public Double Value = null;
        
        public Instant getTimestamp() { return Timestamp; }
        public EffectiveShift setTimestamp(Instant value) { this.Timestamp = value; return this; }
        public Double getValue() { return Value; }
        public EffectiveShift setValue(Double value) { this.Value = value; return this; }
    }

    public static class Qualifier extends TimeRange
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Instant applied
        */
        @ApiMember(DataType="string", Description="Instant applied", Format="date-time")
        public Instant DateApplied = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;
        
        public String getIdentifier() { return Identifier; }
        public Qualifier setIdentifier(String value) { this.Identifier = value; return this; }
        public Instant getDateApplied() { return DateApplied; }
        public Qualifier setDateApplied(Instant value) { this.DateApplied = value; return this; }
        public String getUser() { return User; }
        public Qualifier setUser(String value) { this.User = value; return this; }
    }

    public static class Method extends TimeRange
    {
        /**
        * Method code
        */
        @ApiMember(Description="Method code")
        public String MethodCode = null;
        
        public String getMethodCode() { return MethodCode; }
        public Method setMethodCode(String value) { this.MethodCode = value; return this; }
    }

    public static class Grade extends TimeRange
    {
        /**
        * Grade code
        */
        @ApiMember(Description="Grade code")
        public String GradeCode = null;
        
        public String getGradeCode() { return GradeCode; }
        public Grade setGradeCode(String value) { this.GradeCode = value; return this; }
    }

    public static class GapTolerance extends TimeRange
    {
        /**
        * Tolerance in minutes
        */
        @ApiMember(DataType="number", Description="Tolerance in minutes", Format="double")
        public Double ToleranceInMinutes = null;
        
        public Double getToleranceInMinutes() { return ToleranceInMinutes; }
        public GapTolerance setToleranceInMinutes(Double value) { this.ToleranceInMinutes = value; return this; }
    }

    public static class InterpolationType extends TimeRange
    {
        /**
        * Type
        */
        @ApiMember(Description="Type")
        public String Type = null;
        
        public String getType() { return Type; }
        public InterpolationType setType(String value) { this.Type = value; return this; }
    }

    public static class Note extends TimeRange
    {
        /**
        * Note text
        */
        @ApiMember(Description="Note text")
        public String NoteText = null;
        
        public String getNoteText() { return NoteText; }
        public Note setNoteText(String value) { this.NoteText = value; return this; }
    }

    public static class StatisticalTimeRange
    {
        /**
        * Start time
        */
        @ApiMember(DataType="StatisticalDateTimeOffset", Description="Start time")
        public StatisticalDateTimeOffset StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="StatisticalDateTimeOffset", Description="End time")
        public StatisticalDateTimeOffset EndTime = null;
        
        public StatisticalDateTimeOffset getStartTime() { return StartTime; }
        public StatisticalTimeRange setStartTime(StatisticalDateTimeOffset value) { this.StartTime = value; return this; }
        public StatisticalDateTimeOffset getEndTime() { return EndTime; }
        public StatisticalTimeRange setEndTime(StatisticalDateTimeOffset value) { this.EndTime = value; return this; }
    }

    public static class TimeSeriesPoint
    {
        /**
        * Timestamp
        */
        @ApiMember(DataType="StatisticalDateTimeOffset", Description="Timestamp")
        public StatisticalDateTimeOffset Timestamp = null;

        /**
        * Value
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Value")
        public DoubleWithDisplay Value = null;
        
        public StatisticalDateTimeOffset getTimestamp() { return Timestamp; }
        public TimeSeriesPoint setTimestamp(StatisticalDateTimeOffset value) { this.Timestamp = value; return this; }
        public DoubleWithDisplay getValue() { return Value; }
        public TimeSeriesPoint setValue(DoubleWithDisplay value) { this.Value = value; return this; }
    }

    public static class TimeAlignedTimeSeriesInfo
    {
        /**
        * Unique id
        */
        @ApiMember(DataType="string", Description="Unique id", Format="guid")
        public String UniqueId = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Parameter
        */
        @ApiMember(Description="Parameter")
        public String Parameter = null;

        /**
        * Label
        */
        @ApiMember(Description="Label")
        public String Label = null;

        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;

        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier")
        public String LocationIdentifier = null;

        /**
        * Interpolation type
        */
        @ApiMember(Description="Interpolation type")
        public String InterpolationType = null;
        
        public String getUniqueId() { return UniqueId; }
        public TimeAlignedTimeSeriesInfo setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public TimeAlignedTimeSeriesInfo setIdentifier(String value) { this.Identifier = value; return this; }
        public String getParameter() { return Parameter; }
        public TimeAlignedTimeSeriesInfo setParameter(String value) { this.Parameter = value; return this; }
        public String getLabel() { return Label; }
        public TimeAlignedTimeSeriesInfo setLabel(String value) { this.Label = value; return this; }
        public String getUnit() { return Unit; }
        public TimeAlignedTimeSeriesInfo setUnit(String value) { this.Unit = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public TimeAlignedTimeSeriesInfo setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getInterpolationType() { return InterpolationType; }
        public TimeAlignedTimeSeriesInfo setInterpolationType(String value) { this.InterpolationType = value; return this; }
    }

    public static class TimeRange
    {
        /**
        * Start time
        */
        @ApiMember(DataType="string", Description="Start time", Format="date-time")
        public Instant StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="string", Description="End time", Format="date-time")
        public Instant EndTime = null;
        
        public Instant getStartTime() { return StartTime; }
        public TimeRange setStartTime(Instant value) { this.StartTime = value; return this; }
        public Instant getEndTime() { return EndTime; }
        public TimeRange setEndTime(Instant value) { this.EndTime = value; return this; }
    }

    public static class TimeAlignedPoint
    {
        /**
        * Timestamp
        */
        @ApiMember(DataType="string", Description="Timestamp", Format="date-time")
        public Instant Timestamp = null;

        /**
        * Numeric value of output time-series 1
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 1", Format="double")
        public Double NumericValue1 = null;

        /**
        * Display value of output time-series 1
        */
        @ApiMember(Description="Display value of output time-series 1")
        public String DisplayValue1 = null;

        /**
        * Grade code of output time-series 1
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 1", Format="int64")
        public Long GradeCode1 = null;

        /**
        * Grade name of output time-series 1
        */
        @ApiMember(Description="Grade name of output time-series 1")
        public String GradeName1 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 1
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 1")
        public String Qualifiers1 = null;

        /**
        * Method of output time-series 1
        */
        @ApiMember(Description="Method of output time-series 1")
        public String Method1 = null;

        /**
        * Approval level of output time-series 1
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 1", Format="int64")
        public Long ApprovalLevel1 = null;

        /**
        * Approval name of output time-series 1
        */
        @ApiMember(Description="Approval name of output time-series 1")
        public String ApprovalName1 = null;

        /**
        * Numeric value of output time-series 2
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 2", Format="double")
        public Double NumericValue2 = null;

        /**
        * Display value of output time-series 2
        */
        @ApiMember(Description="Display value of output time-series 2")
        public String DisplayValue2 = null;

        /**
        * Grade code of output time-series 2
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 2", Format="int64")
        public Long GradeCode2 = null;

        /**
        * Grade name of output time-series 2
        */
        @ApiMember(Description="Grade name of output time-series 2")
        public String GradeName2 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 2
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 2")
        public String Qualifiers2 = null;

        /**
        * Method of output time-series 2
        */
        @ApiMember(Description="Method of output time-series 2")
        public String Method2 = null;

        /**
        * Approval level of output time-series 2
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 2", Format="int64")
        public Long ApprovalLevel2 = null;

        /**
        * Approval name of output time-series 2
        */
        @ApiMember(Description="Approval name of output time-series 2")
        public String ApprovalName2 = null;

        /**
        * Numeric value of output time-series 3
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 3", Format="double")
        public Double NumericValue3 = null;

        /**
        * Display value of output time-series 3
        */
        @ApiMember(Description="Display value of output time-series 3")
        public String DisplayValue3 = null;

        /**
        * Grade code of output time-series 3
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 3", Format="int64")
        public Long GradeCode3 = null;

        /**
        * Grade name of output time-series 3
        */
        @ApiMember(Description="Grade name of output time-series 3")
        public String GradeName3 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 3
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 3")
        public String Qualifiers3 = null;

        /**
        * Method of output time-series 3
        */
        @ApiMember(Description="Method of output time-series 3")
        public String Method3 = null;

        /**
        * Approval level of output time-series 3
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 3", Format="int64")
        public Long ApprovalLevel3 = null;

        /**
        * Approval name of output time-series 3
        */
        @ApiMember(Description="Approval name of output time-series 3")
        public String ApprovalName3 = null;

        /**
        * Numeric value of output time-series 4
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 4", Format="double")
        public Double NumericValue4 = null;

        /**
        * Display value of output time-series 4
        */
        @ApiMember(Description="Display value of output time-series 4")
        public String DisplayValue4 = null;

        /**
        * Grade code of output time-series 4
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 4", Format="int64")
        public Long GradeCode4 = null;

        /**
        * Grade name of output time-series 4
        */
        @ApiMember(Description="Grade name of output time-series 4")
        public String GradeName4 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 4
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 4")
        public String Qualifiers4 = null;

        /**
        * Method of output time-series 4
        */
        @ApiMember(Description="Method of output time-series 4")
        public String Method4 = null;

        /**
        * Approval level of output time-series 4
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 4", Format="int64")
        public Long ApprovalLevel4 = null;

        /**
        * Approval name of output time-series 4
        */
        @ApiMember(Description="Approval name of output time-series 4")
        public String ApprovalName4 = null;

        /**
        * Numeric value of output time-series 5
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 5", Format="double")
        public Double NumericValue5 = null;

        /**
        * Display value of output time-series 5
        */
        @ApiMember(Description="Display value of output time-series 5")
        public String DisplayValue5 = null;

        /**
        * Grade code of output time-series 5
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 5", Format="int64")
        public Long GradeCode5 = null;

        /**
        * Grade name of output time-series 5
        */
        @ApiMember(Description="Grade name of output time-series 5")
        public String GradeName5 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 5
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 5")
        public String Qualifiers5 = null;

        /**
        * Method of output time-series 5
        */
        @ApiMember(Description="Method of output time-series 5")
        public String Method5 = null;

        /**
        * Approval level of output time-series 5
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 5", Format="int64")
        public Long ApprovalLevel5 = null;

        /**
        * Approval name of output time-series 5
        */
        @ApiMember(Description="Approval name of output time-series 5")
        public String ApprovalName5 = null;

        /**
        * Numeric value of output time-series 6
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 6", Format="double")
        public Double NumericValue6 = null;

        /**
        * Display value of output time-series 6
        */
        @ApiMember(Description="Display value of output time-series 6")
        public String DisplayValue6 = null;

        /**
        * Grade code of output time-series 6
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 6", Format="int64")
        public Long GradeCode6 = null;

        /**
        * Grade name of output time-series 6
        */
        @ApiMember(Description="Grade name of output time-series 6")
        public String GradeName6 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 6
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 6")
        public String Qualifiers6 = null;

        /**
        * Method of output time-series 6
        */
        @ApiMember(Description="Method of output time-series 6")
        public String Method6 = null;

        /**
        * Approval level of output time-series 6
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 6", Format="int64")
        public Long ApprovalLevel6 = null;

        /**
        * Approval name of output time-series 6
        */
        @ApiMember(Description="Approval name of output time-series 6")
        public String ApprovalName6 = null;

        /**
        * Numeric value of output time-series 7
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 7", Format="double")
        public Double NumericValue7 = null;

        /**
        * Display value of output time-series 7
        */
        @ApiMember(Description="Display value of output time-series 7")
        public String DisplayValue7 = null;

        /**
        * Grade code of output time-series 7
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 7", Format="int64")
        public Long GradeCode7 = null;

        /**
        * Grade name of output time-series 7
        */
        @ApiMember(Description="Grade name of output time-series 7")
        public String GradeName7 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 7
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 7")
        public String Qualifiers7 = null;

        /**
        * Method of output time-series 7
        */
        @ApiMember(Description="Method of output time-series 7")
        public String Method7 = null;

        /**
        * Approval level of output time-series 7
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 7", Format="int64")
        public Long ApprovalLevel7 = null;

        /**
        * Approval name of output time-series 7
        */
        @ApiMember(Description="Approval name of output time-series 7")
        public String ApprovalName7 = null;

        /**
        * Numeric value of output time-series 8
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 8", Format="double")
        public Double NumericValue8 = null;

        /**
        * Display value of output time-series 8
        */
        @ApiMember(Description="Display value of output time-series 8")
        public String DisplayValue8 = null;

        /**
        * Grade code of output time-series 8
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 8", Format="int64")
        public Long GradeCode8 = null;

        /**
        * Grade name of output time-series 8
        */
        @ApiMember(Description="Grade name of output time-series 8")
        public String GradeName8 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 8
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 8")
        public String Qualifiers8 = null;

        /**
        * Method of output time-series 8
        */
        @ApiMember(Description="Method of output time-series 8")
        public String Method8 = null;

        /**
        * Approval level of output time-series 8
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 8", Format="int64")
        public Long ApprovalLevel8 = null;

        /**
        * Approval name of output time-series 8
        */
        @ApiMember(Description="Approval name of output time-series 8")
        public String ApprovalName8 = null;

        /**
        * Numeric value of output time-series 9
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 9", Format="double")
        public Double NumericValue9 = null;

        /**
        * Display value of output time-series 9
        */
        @ApiMember(Description="Display value of output time-series 9")
        public String DisplayValue9 = null;

        /**
        * Grade code of output time-series 9
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 9", Format="int64")
        public Long GradeCode9 = null;

        /**
        * Grade name of output time-series 9
        */
        @ApiMember(Description="Grade name of output time-series 9")
        public String GradeName9 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 9
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 9")
        public String Qualifiers9 = null;

        /**
        * Method of output time-series 9
        */
        @ApiMember(Description="Method of output time-series 9")
        public String Method9 = null;

        /**
        * Approval level of output time-series 9
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 9", Format="int64")
        public Long ApprovalLevel9 = null;

        /**
        * Approval name of output time-series 9
        */
        @ApiMember(Description="Approval name of output time-series 9")
        public String ApprovalName9 = null;

        /**
        * Numeric value of output time-series 10
        */
        @ApiMember(DataType="number", Description="Numeric value of output time-series 10", Format="double")
        public Double NumericValue10 = null;

        /**
        * Display value of output time-series 10
        */
        @ApiMember(Description="Display value of output time-series 10")
        public String DisplayValue10 = null;

        /**
        * Grade code of output time-series 10
        */
        @ApiMember(DataType="integer", Description="Grade code of output time-series 10", Format="int64")
        public Long GradeCode10 = null;

        /**
        * Grade name of output time-series 10
        */
        @ApiMember(Description="Grade name of output time-series 10")
        public String GradeName10 = null;

        /**
        * Comma-separated list of qualifiers of output time-series 10
        */
        @ApiMember(Description="Comma-separated list of qualifiers of output time-series 10")
        public String Qualifiers10 = null;

        /**
        * Method of output time-series 10
        */
        @ApiMember(Description="Method of output time-series 10")
        public String Method10 = null;

        /**
        * Approval level of output time-series 10
        */
        @ApiMember(DataType="integer", Description="Approval level of output time-series 10", Format="int64")
        public Long ApprovalLevel10 = null;

        /**
        * Approval name of output time-series 10
        */
        @ApiMember(Description="Approval name of output time-series 10")
        public String ApprovalName10 = null;
        
        public Instant getTimestamp() { return Timestamp; }
        public TimeAlignedPoint setTimestamp(Instant value) { this.Timestamp = value; return this; }
        public Double getNumericValue1() { return NumericValue1; }
        public TimeAlignedPoint setNumericValue1(Double value) { this.NumericValue1 = value; return this; }
        public String getDisplayValue1() { return DisplayValue1; }
        public TimeAlignedPoint setDisplayValue1(String value) { this.DisplayValue1 = value; return this; }
        public Long getGradeCode1() { return GradeCode1; }
        public TimeAlignedPoint setGradeCode1(Long value) { this.GradeCode1 = value; return this; }
        public String getGradeName1() { return GradeName1; }
        public TimeAlignedPoint setGradeName1(String value) { this.GradeName1 = value; return this; }
        public String getQualifiers1() { return Qualifiers1; }
        public TimeAlignedPoint setQualifiers1(String value) { this.Qualifiers1 = value; return this; }
        public String getMethod1() { return Method1; }
        public TimeAlignedPoint setMethod1(String value) { this.Method1 = value; return this; }
        public Long getApprovalLevel1() { return ApprovalLevel1; }
        public TimeAlignedPoint setApprovalLevel1(Long value) { this.ApprovalLevel1 = value; return this; }
        public String getApprovalName1() { return ApprovalName1; }
        public TimeAlignedPoint setApprovalName1(String value) { this.ApprovalName1 = value; return this; }
        public Double getNumericValue2() { return NumericValue2; }
        public TimeAlignedPoint setNumericValue2(Double value) { this.NumericValue2 = value; return this; }
        public String getDisplayValue2() { return DisplayValue2; }
        public TimeAlignedPoint setDisplayValue2(String value) { this.DisplayValue2 = value; return this; }
        public Long getGradeCode2() { return GradeCode2; }
        public TimeAlignedPoint setGradeCode2(Long value) { this.GradeCode2 = value; return this; }
        public String getGradeName2() { return GradeName2; }
        public TimeAlignedPoint setGradeName2(String value) { this.GradeName2 = value; return this; }
        public String getQualifiers2() { return Qualifiers2; }
        public TimeAlignedPoint setQualifiers2(String value) { this.Qualifiers2 = value; return this; }
        public String getMethod2() { return Method2; }
        public TimeAlignedPoint setMethod2(String value) { this.Method2 = value; return this; }
        public Long getApprovalLevel2() { return ApprovalLevel2; }
        public TimeAlignedPoint setApprovalLevel2(Long value) { this.ApprovalLevel2 = value; return this; }
        public String getApprovalName2() { return ApprovalName2; }
        public TimeAlignedPoint setApprovalName2(String value) { this.ApprovalName2 = value; return this; }
        public Double getNumericValue3() { return NumericValue3; }
        public TimeAlignedPoint setNumericValue3(Double value) { this.NumericValue3 = value; return this; }
        public String getDisplayValue3() { return DisplayValue3; }
        public TimeAlignedPoint setDisplayValue3(String value) { this.DisplayValue3 = value; return this; }
        public Long getGradeCode3() { return GradeCode3; }
        public TimeAlignedPoint setGradeCode3(Long value) { this.GradeCode3 = value; return this; }
        public String getGradeName3() { return GradeName3; }
        public TimeAlignedPoint setGradeName3(String value) { this.GradeName3 = value; return this; }
        public String getQualifiers3() { return Qualifiers3; }
        public TimeAlignedPoint setQualifiers3(String value) { this.Qualifiers3 = value; return this; }
        public String getMethod3() { return Method3; }
        public TimeAlignedPoint setMethod3(String value) { this.Method3 = value; return this; }
        public Long getApprovalLevel3() { return ApprovalLevel3; }
        public TimeAlignedPoint setApprovalLevel3(Long value) { this.ApprovalLevel3 = value; return this; }
        public String getApprovalName3() { return ApprovalName3; }
        public TimeAlignedPoint setApprovalName3(String value) { this.ApprovalName3 = value; return this; }
        public Double getNumericValue4() { return NumericValue4; }
        public TimeAlignedPoint setNumericValue4(Double value) { this.NumericValue4 = value; return this; }
        public String getDisplayValue4() { return DisplayValue4; }
        public TimeAlignedPoint setDisplayValue4(String value) { this.DisplayValue4 = value; return this; }
        public Long getGradeCode4() { return GradeCode4; }
        public TimeAlignedPoint setGradeCode4(Long value) { this.GradeCode4 = value; return this; }
        public String getGradeName4() { return GradeName4; }
        public TimeAlignedPoint setGradeName4(String value) { this.GradeName4 = value; return this; }
        public String getQualifiers4() { return Qualifiers4; }
        public TimeAlignedPoint setQualifiers4(String value) { this.Qualifiers4 = value; return this; }
        public String getMethod4() { return Method4; }
        public TimeAlignedPoint setMethod4(String value) { this.Method4 = value; return this; }
        public Long getApprovalLevel4() { return ApprovalLevel4; }
        public TimeAlignedPoint setApprovalLevel4(Long value) { this.ApprovalLevel4 = value; return this; }
        public String getApprovalName4() { return ApprovalName4; }
        public TimeAlignedPoint setApprovalName4(String value) { this.ApprovalName4 = value; return this; }
        public Double getNumericValue5() { return NumericValue5; }
        public TimeAlignedPoint setNumericValue5(Double value) { this.NumericValue5 = value; return this; }
        public String getDisplayValue5() { return DisplayValue5; }
        public TimeAlignedPoint setDisplayValue5(String value) { this.DisplayValue5 = value; return this; }
        public Long getGradeCode5() { return GradeCode5; }
        public TimeAlignedPoint setGradeCode5(Long value) { this.GradeCode5 = value; return this; }
        public String getGradeName5() { return GradeName5; }
        public TimeAlignedPoint setGradeName5(String value) { this.GradeName5 = value; return this; }
        public String getQualifiers5() { return Qualifiers5; }
        public TimeAlignedPoint setQualifiers5(String value) { this.Qualifiers5 = value; return this; }
        public String getMethod5() { return Method5; }
        public TimeAlignedPoint setMethod5(String value) { this.Method5 = value; return this; }
        public Long getApprovalLevel5() { return ApprovalLevel5; }
        public TimeAlignedPoint setApprovalLevel5(Long value) { this.ApprovalLevel5 = value; return this; }
        public String getApprovalName5() { return ApprovalName5; }
        public TimeAlignedPoint setApprovalName5(String value) { this.ApprovalName5 = value; return this; }
        public Double getNumericValue6() { return NumericValue6; }
        public TimeAlignedPoint setNumericValue6(Double value) { this.NumericValue6 = value; return this; }
        public String getDisplayValue6() { return DisplayValue6; }
        public TimeAlignedPoint setDisplayValue6(String value) { this.DisplayValue6 = value; return this; }
        public Long getGradeCode6() { return GradeCode6; }
        public TimeAlignedPoint setGradeCode6(Long value) { this.GradeCode6 = value; return this; }
        public String getGradeName6() { return GradeName6; }
        public TimeAlignedPoint setGradeName6(String value) { this.GradeName6 = value; return this; }
        public String getQualifiers6() { return Qualifiers6; }
        public TimeAlignedPoint setQualifiers6(String value) { this.Qualifiers6 = value; return this; }
        public String getMethod6() { return Method6; }
        public TimeAlignedPoint setMethod6(String value) { this.Method6 = value; return this; }
        public Long getApprovalLevel6() { return ApprovalLevel6; }
        public TimeAlignedPoint setApprovalLevel6(Long value) { this.ApprovalLevel6 = value; return this; }
        public String getApprovalName6() { return ApprovalName6; }
        public TimeAlignedPoint setApprovalName6(String value) { this.ApprovalName6 = value; return this; }
        public Double getNumericValue7() { return NumericValue7; }
        public TimeAlignedPoint setNumericValue7(Double value) { this.NumericValue7 = value; return this; }
        public String getDisplayValue7() { return DisplayValue7; }
        public TimeAlignedPoint setDisplayValue7(String value) { this.DisplayValue7 = value; return this; }
        public Long getGradeCode7() { return GradeCode7; }
        public TimeAlignedPoint setGradeCode7(Long value) { this.GradeCode7 = value; return this; }
        public String getGradeName7() { return GradeName7; }
        public TimeAlignedPoint setGradeName7(String value) { this.GradeName7 = value; return this; }
        public String getQualifiers7() { return Qualifiers7; }
        public TimeAlignedPoint setQualifiers7(String value) { this.Qualifiers7 = value; return this; }
        public String getMethod7() { return Method7; }
        public TimeAlignedPoint setMethod7(String value) { this.Method7 = value; return this; }
        public Long getApprovalLevel7() { return ApprovalLevel7; }
        public TimeAlignedPoint setApprovalLevel7(Long value) { this.ApprovalLevel7 = value; return this; }
        public String getApprovalName7() { return ApprovalName7; }
        public TimeAlignedPoint setApprovalName7(String value) { this.ApprovalName7 = value; return this; }
        public Double getNumericValue8() { return NumericValue8; }
        public TimeAlignedPoint setNumericValue8(Double value) { this.NumericValue8 = value; return this; }
        public String getDisplayValue8() { return DisplayValue8; }
        public TimeAlignedPoint setDisplayValue8(String value) { this.DisplayValue8 = value; return this; }
        public Long getGradeCode8() { return GradeCode8; }
        public TimeAlignedPoint setGradeCode8(Long value) { this.GradeCode8 = value; return this; }
        public String getGradeName8() { return GradeName8; }
        public TimeAlignedPoint setGradeName8(String value) { this.GradeName8 = value; return this; }
        public String getQualifiers8() { return Qualifiers8; }
        public TimeAlignedPoint setQualifiers8(String value) { this.Qualifiers8 = value; return this; }
        public String getMethod8() { return Method8; }
        public TimeAlignedPoint setMethod8(String value) { this.Method8 = value; return this; }
        public Long getApprovalLevel8() { return ApprovalLevel8; }
        public TimeAlignedPoint setApprovalLevel8(Long value) { this.ApprovalLevel8 = value; return this; }
        public String getApprovalName8() { return ApprovalName8; }
        public TimeAlignedPoint setApprovalName8(String value) { this.ApprovalName8 = value; return this; }
        public Double getNumericValue9() { return NumericValue9; }
        public TimeAlignedPoint setNumericValue9(Double value) { this.NumericValue9 = value; return this; }
        public String getDisplayValue9() { return DisplayValue9; }
        public TimeAlignedPoint setDisplayValue9(String value) { this.DisplayValue9 = value; return this; }
        public Long getGradeCode9() { return GradeCode9; }
        public TimeAlignedPoint setGradeCode9(Long value) { this.GradeCode9 = value; return this; }
        public String getGradeName9() { return GradeName9; }
        public TimeAlignedPoint setGradeName9(String value) { this.GradeName9 = value; return this; }
        public String getQualifiers9() { return Qualifiers9; }
        public TimeAlignedPoint setQualifiers9(String value) { this.Qualifiers9 = value; return this; }
        public String getMethod9() { return Method9; }
        public TimeAlignedPoint setMethod9(String value) { this.Method9 = value; return this; }
        public Long getApprovalLevel9() { return ApprovalLevel9; }
        public TimeAlignedPoint setApprovalLevel9(Long value) { this.ApprovalLevel9 = value; return this; }
        public String getApprovalName9() { return ApprovalName9; }
        public TimeAlignedPoint setApprovalName9(String value) { this.ApprovalName9 = value; return this; }
        public Double getNumericValue10() { return NumericValue10; }
        public TimeAlignedPoint setNumericValue10(Double value) { this.NumericValue10 = value; return this; }
        public String getDisplayValue10() { return DisplayValue10; }
        public TimeAlignedPoint setDisplayValue10(String value) { this.DisplayValue10 = value; return this; }
        public Long getGradeCode10() { return GradeCode10; }
        public TimeAlignedPoint setGradeCode10(Long value) { this.GradeCode10 = value; return this; }
        public String getGradeName10() { return GradeName10; }
        public TimeAlignedPoint setGradeName10(String value) { this.GradeName10 = value; return this; }
        public String getQualifiers10() { return Qualifiers10; }
        public TimeAlignedPoint setQualifiers10(String value) { this.Qualifiers10 = value; return this; }
        public String getMethod10() { return Method10; }
        public TimeAlignedPoint setMethod10(String value) { this.Method10 = value; return this; }
        public Long getApprovalLevel10() { return ApprovalLevel10; }
        public TimeAlignedPoint setApprovalLevel10(Long value) { this.ApprovalLevel10 = value; return this; }
        public String getApprovalName10() { return ApprovalName10; }
        public TimeAlignedPoint setApprovalName10(String value) { this.ApprovalName10 = value; return this; }
    }

    public static class TimeSeriesDescription
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Unique id
        */
        @ApiMember(DataType="string", Description="Unique id", Format="guid")
        public String UniqueId = null;

        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier")
        public String LocationIdentifier = null;

        /**
        * Parameter
        */
        @ApiMember(Description="Parameter")
        public String Parameter = null;

        /**
        * Parameter Id
        */
        @ApiMember(Description="Parameter Id")
        public String ParameterId = null;

        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;

        /**
        * Utc offset
        */
        @ApiMember(DataType="number", Description="Utc offset", Format="double")
        public Double UtcOffset = null;

        /**
        * Utc offset iso duration
        */
        @ApiMember(DataType="string", Description="Utc offset iso duration", Format="offset from UTC")
        public String UtcOffsetIsoDuration = null;

        /**
        * Last modified
        */
        @ApiMember(DataType="string", Description="Last modified", Format="date-time")
        public Instant LastModified = null;

        /**
        * Raw start time
        */
        @ApiMember(DataType="string", Description="Raw start time", Format="date-time")
        public Instant RawStartTime = null;

        /**
        * Raw end time
        */
        @ApiMember(DataType="string", Description="Raw end time", Format="date-time")
        public Instant RawEndTime = null;

        /**
        * Corrected start time
        */
        @ApiMember(DataType="string", Description="Corrected start time", Format="date-time")
        public Instant CorrectedStartTime = null;

        /**
        * Corrected end time
        */
        @ApiMember(DataType="string", Description="Corrected end time", Format="date-time")
        public Instant CorrectedEndTime = null;

        /**
        * Time series type
        */
        @ApiMember(Description="Time series type")
        public String TimeSeriesType = null;

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
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

        /**
        * Extended attributes
        */
        @ApiMember(DataType="array", Description="Extended attributes")
        public List<ExtendedAttribute> ExtendedAttributes = null;

        /**
        * Thresholds
        */
        @ApiMember(DataType="array", Description="Thresholds")
        public List<TimeSeriesThreshold> Thresholds = null;
        
        public String getIdentifier() { return Identifier; }
        public TimeSeriesDescription setIdentifier(String value) { this.Identifier = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public TimeSeriesDescription setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public TimeSeriesDescription setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getParameter() { return Parameter; }
        public TimeSeriesDescription setParameter(String value) { this.Parameter = value; return this; }
        public String getParameterId() { return ParameterId; }
        public TimeSeriesDescription setParameterId(String value) { this.ParameterId = value; return this; }
        public String getUnit() { return Unit; }
        public TimeSeriesDescription setUnit(String value) { this.Unit = value; return this; }
        public Double getUtcOffset() { return UtcOffset; }
        public TimeSeriesDescription setUtcOffset(Double value) { this.UtcOffset = value; return this; }
        public String getUtcOffsetIsoDuration() { return UtcOffsetIsoDuration; }
        public TimeSeriesDescription setUtcOffsetIsoDuration(String value) { this.UtcOffsetIsoDuration = value; return this; }
        public Instant getLastModified() { return LastModified; }
        public TimeSeriesDescription setLastModified(Instant value) { this.LastModified = value; return this; }
        public Instant getRawStartTime() { return RawStartTime; }
        public TimeSeriesDescription setRawStartTime(Instant value) { this.RawStartTime = value; return this; }
        public Instant getRawEndTime() { return RawEndTime; }
        public TimeSeriesDescription setRawEndTime(Instant value) { this.RawEndTime = value; return this; }
        public Instant getCorrectedStartTime() { return CorrectedStartTime; }
        public TimeSeriesDescription setCorrectedStartTime(Instant value) { this.CorrectedStartTime = value; return this; }
        public Instant getCorrectedEndTime() { return CorrectedEndTime; }
        public TimeSeriesDescription setCorrectedEndTime(Instant value) { this.CorrectedEndTime = value; return this; }
        public String getTimeSeriesType() { return TimeSeriesType; }
        public TimeSeriesDescription setTimeSeriesType(String value) { this.TimeSeriesType = value; return this; }
        public String getLabel() { return Label; }
        public TimeSeriesDescription setLabel(String value) { this.Label = value; return this; }
        public String getComment() { return Comment; }
        public TimeSeriesDescription setComment(String value) { this.Comment = value; return this; }
        public String getDescription() { return Description; }
        public TimeSeriesDescription setDescription(String value) { this.Description = value; return this; }
        public Boolean isPublish() { return Publish; }
        public TimeSeriesDescription setPublish(Boolean value) { this.Publish = value; return this; }
        public String getComputationIdentifier() { return ComputationIdentifier; }
        public TimeSeriesDescription setComputationIdentifier(String value) { this.ComputationIdentifier = value; return this; }
        public String getComputationPeriodIdentifier() { return ComputationPeriodIdentifier; }
        public TimeSeriesDescription setComputationPeriodIdentifier(String value) { this.ComputationPeriodIdentifier = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public TimeSeriesDescription setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public TimeSeriesDescription setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public List<TimeSeriesThreshold> getThresholds() { return Thresholds; }
        public TimeSeriesDescription setThresholds(List<TimeSeriesThreshold> value) { this.Thresholds = value; return this; }
    }

    public static class TimeSeriesUniqueIds
    {
        /**
        * Unique id
        */
        @ApiMember(DataType="string", Description="Unique id", Format="guid")
        public String UniqueId = null;

        /**
        * First point changed
        */
        @ApiMember(DataType="string", Description="First point changed", Format="date-time")
        public Instant FirstPointChanged = null;

        /**
        * Has attribute change
        */
        @ApiMember(DataType="boolean", Description="Has attribute change")
        public Boolean HasAttributeChange = null;

        /**
        * Time-series has been deleted
        */
        @ApiMember(DataType="boolean", Description="Time-series has been deleted")
        public Boolean IsDeleted = null;

        /**
        * Last time attributes on the time-series matched the given filters; null when time-series current attributes matched the given filters
        */
        @ApiMember(DataType="string", Description="Last time attributes on the time-series matched the given filters; null when time-series current attributes matched the given filters", Format="date-time")
        public Instant LastMatchedTime = null;
        
        public String getUniqueId() { return UniqueId; }
        public TimeSeriesUniqueIds setUniqueId(String value) { this.UniqueId = value; return this; }
        public Instant getFirstPointChanged() { return FirstPointChanged; }
        public TimeSeriesUniqueIds setFirstPointChanged(Instant value) { this.FirstPointChanged = value; return this; }
        public Boolean isHasAttributeChange() { return HasAttributeChange; }
        public TimeSeriesUniqueIds setHasAttributeChange(Boolean value) { this.HasAttributeChange = value; return this; }
        public Boolean getIsDeleted() { return IsDeleted; }
        public TimeSeriesUniqueIds setIsDeleted(Boolean value) { this.IsDeleted = value; return this; }
        public Instant getLastMatchedTime() { return LastMatchedTime; }
        public TimeSeriesUniqueIds setLastMatchedTime(Instant value) { this.LastMatchedTime = value; return this; }
    }

    public static class FieldVisitDescription
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier")
        public String LocationIdentifier = null;

        /**
        * Start time
        */
        @ApiMember(DataType="string", Description="Start time", Format="date-time")
        public Instant StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="string", Description="End time", Format="date-time")
        public Instant EndTime = null;

        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Remarks
        */
        @ApiMember(Description="Remarks")
        public String Remarks = null;

        /**
        * Weather
        */
        @ApiMember(Description="Weather")
        public String Weather = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;

        /**
        * Completed work
        */
        @ApiMember(DataType="CompletedWork", Description="Completed work")
        public CompletedWork CompletedWork = null;

        /**
        * Last modified
        */
        @ApiMember(DataType="string", Description="Last modified", Format="date-time")
        public Instant LastModified = null;

        /**
        * Last time the deleted field visit matched the given filters; set only when request includes ChangesSinceToken
        */
        @ApiMember(DataType="string", Description="Last time the deleted field visit matched the given filters; set only when request includes ChangesSinceToken", Format="date-time")
        public Instant LastMatchedTime = null;
        
        public String getIdentifier() { return Identifier; }
        public FieldVisitDescription setIdentifier(String value) { this.Identifier = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public FieldVisitDescription setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public Instant getStartTime() { return StartTime; }
        public FieldVisitDescription setStartTime(Instant value) { this.StartTime = value; return this; }
        public Instant getEndTime() { return EndTime; }
        public FieldVisitDescription setEndTime(Instant value) { this.EndTime = value; return this; }
        public String getParty() { return Party; }
        public FieldVisitDescription setParty(String value) { this.Party = value; return this; }
        public String getRemarks() { return Remarks; }
        public FieldVisitDescription setRemarks(String value) { this.Remarks = value; return this; }
        public String getWeather() { return Weather; }
        public FieldVisitDescription setWeather(String value) { this.Weather = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public FieldVisitDescription setIsValid(Boolean value) { this.IsValid = value; return this; }
        public CompletedWork getCompletedWork() { return CompletedWork; }
        public FieldVisitDescription setCompletedWork(CompletedWork value) { this.CompletedWork = value; return this; }
        public Instant getLastModified() { return LastModified; }
        public FieldVisitDescription setLastModified(Instant value) { this.LastModified = value; return this; }
        public Instant getLastMatchedTime() { return LastMatchedTime; }
        public FieldVisitDescription setLastMatchedTime(Instant value) { this.LastMatchedTime = value; return this; }
    }

    public static class MetadataChangeTransaction
    {
        /**
        * Applied time
        */
        @ApiMember(DataType="string", Description="Applied time", Format="date-time")
        public Instant AppliedTime = null;

        /**
        * Applied by user
        */
        @ApiMember(Description="Applied by user")
        public String AppliedByUser = null;

        /**
        * Content type
        */
        @ApiMember(DataType="string", Description="Content type")
        public MetadataChangeContentType ContentType = null;

        /**
        * Gap tolerance operations
        */
        @ApiMember(DataType="array", Description="Gap tolerance operations")
        public List<GapToleranceOperation> GapToleranceOperations = null;

        /**
        * Grade operations
        */
        @ApiMember(DataType="array", Description="Grade operations")
        public List<GradeOperation> GradeOperations = null;

        /**
        * Interpolation type operations
        */
        @ApiMember(DataType="array", Description="Interpolation type operations")
        public List<InterpolationTypeOperation> InterpolationTypeOperations = null;

        /**
        * Method operations
        */
        @ApiMember(DataType="array", Description="Method operations")
        public List<MethodOperation> MethodOperations = null;

        /**
        * Note operations
        */
        @ApiMember(DataType="array", Description="Note operations")
        public List<NoteOperation> NoteOperations = null;

        /**
        * Qualifier operations
        */
        @ApiMember(DataType="array", Description="Qualifier operations")
        public List<QualifierOperation> QualifierOperations = null;

        /**
        * Correction operations
        */
        @ApiMember(DataType="array", Description="Correction operations")
        public List<CorrectionOperation> CorrectionOperations = null;
        
        public Instant getAppliedTime() { return AppliedTime; }
        public MetadataChangeTransaction setAppliedTime(Instant value) { this.AppliedTime = value; return this; }
        public String getAppliedByUser() { return AppliedByUser; }
        public MetadataChangeTransaction setAppliedByUser(String value) { this.AppliedByUser = value; return this; }
        public MetadataChangeContentType getContentType() { return ContentType; }
        public MetadataChangeTransaction setContentType(MetadataChangeContentType value) { this.ContentType = value; return this; }
        public List<GapToleranceOperation> getGapToleranceOperations() { return GapToleranceOperations; }
        public MetadataChangeTransaction setGapToleranceOperations(List<GapToleranceOperation> value) { this.GapToleranceOperations = value; return this; }
        public List<GradeOperation> getGradeOperations() { return GradeOperations; }
        public MetadataChangeTransaction setGradeOperations(List<GradeOperation> value) { this.GradeOperations = value; return this; }
        public List<InterpolationTypeOperation> getInterpolationTypeOperations() { return InterpolationTypeOperations; }
        public MetadataChangeTransaction setInterpolationTypeOperations(List<InterpolationTypeOperation> value) { this.InterpolationTypeOperations = value; return this; }
        public List<MethodOperation> getMethodOperations() { return MethodOperations; }
        public MetadataChangeTransaction setMethodOperations(List<MethodOperation> value) { this.MethodOperations = value; return this; }
        public List<NoteOperation> getNoteOperations() { return NoteOperations; }
        public MetadataChangeTransaction setNoteOperations(List<NoteOperation> value) { this.NoteOperations = value; return this; }
        public List<QualifierOperation> getQualifierOperations() { return QualifierOperations; }
        public MetadataChangeTransaction setQualifierOperations(List<QualifierOperation> value) { this.QualifierOperations = value; return this; }
        public List<CorrectionOperation> getCorrectionOperations() { return CorrectionOperations; }
        public MetadataChangeTransaction setCorrectionOperations(List<CorrectionOperation> value) { this.CorrectionOperations = value; return this; }
    }

    public static enum TagApplicability
    {
        AppliesToLocations,
        AppliesToLocationNotes,
        AppliesToSensorsGauges,
        AppliesToAttachments,
        AppliesToReports;
    }

    public static class TagDefinition
    {
        /**
        * Key of the tag
        */
        @ApiMember(Description="Key of the tag")
        public String Key = null;

        /**
        * UniqueId
        */
        @ApiMember(DataType="string", Description="UniqueId", Format="guid")
        public String UniqueId = null;

        /**
        * Value type
        */
        @ApiMember(DataType="TagValueType", Description="Value type")
        public TagValueType ValueType = null;

        /**
        * Set of pick-list values if ValueType is PickList
        */
        @ApiMember(DataType="array", Description="Set of pick-list values if ValueType is PickList")
        public ArrayList<String> PickListValues = null;

        /**
        * True if tag is applicable to Attachments
        */
        @ApiMember(DataType="boolean", Description="True if tag is applicable to Attachments")
        public Boolean AppliesToAttachments = null;

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
        * True if tag is applicable to Reports
        */
        @ApiMember(DataType="boolean", Description="True if tag is applicable to Reports")
        public Boolean AppliesToReports = null;

        /**
        * True if tag is applicable to Sensors and Gauges
        */
        @ApiMember(DataType="boolean", Description="True if tag is applicable to Sensors and Gauges")
        public Boolean AppliesToSensorsGauges = null;
        
        public String getKey() { return Key; }
        public TagDefinition setKey(String value) { this.Key = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public TagDefinition setUniqueId(String value) { this.UniqueId = value; return this; }
        public TagValueType getValueType() { return ValueType; }
        public TagDefinition setValueType(TagValueType value) { this.ValueType = value; return this; }
        public ArrayList<String> getPickListValues() { return PickListValues; }
        public TagDefinition setPickListValues(ArrayList<String> value) { this.PickListValues = value; return this; }
        public Boolean isAppliesToAttachments() { return AppliesToAttachments; }
        public TagDefinition setAppliesToAttachments(Boolean value) { this.AppliesToAttachments = value; return this; }
        public Boolean isAppliesToLocations() { return AppliesToLocations; }
        public TagDefinition setAppliesToLocations(Boolean value) { this.AppliesToLocations = value; return this; }
        public Boolean isAppliesToLocationNotes() { return AppliesToLocationNotes; }
        public TagDefinition setAppliesToLocationNotes(Boolean value) { this.AppliesToLocationNotes = value; return this; }
        public Boolean isAppliesToReports() { return AppliesToReports; }
        public TagDefinition setAppliesToReports(Boolean value) { this.AppliesToReports = value; return this; }
        public Boolean isAppliesToSensorsGauges() { return AppliesToSensorsGauges; }
        public TagDefinition setAppliesToSensorsGauges(Boolean value) { this.AppliesToSensorsGauges = value; return this; }
    }

    public static class NameTagDefinition extends TagDefinition
    {
        /**
        * DEPRECATED: renamed to Key
        */
        @ApiMember(Description="DEPRECATED: renamed to Key")
        public String Name = null;
        
        public String getName() { return Name; }
        public NameTagDefinition setName(String value) { this.Name = value; return this; }
    }

    public static interface IFieldVisitDataRequest
    {
        public Boolean IncludeNodeDetails = null;
        public Boolean IncludeInvalidActivities = null;
        public Boolean ApplyRounding = null;
        public Boolean IncludeVerticals = null;
        public Boolean IncludeCrossSectionSurveyProfile = null;
        public Boolean ConvertToLocalAssumedDatum = null;
        public String ConvertToStandardReferenceDatum = null;
    }

    public static class DischargeActivity
    {
        /**
        * Discharge summary
        */
        @ApiMember(DataType="DischargeSummary", Description="Discharge summary")
        public DischargeSummary DischargeSummary = null;

        /**
        * Volumetric discharge activities
        */
        @ApiMember(DataType="array", Description="Volumetric discharge activities")
        public ArrayList<VolumetricDischargeActivity> VolumetricDischargeActivities = null;

        /**
        * Engineered structure discharge activities
        */
        @ApiMember(DataType="array", Description="Engineered structure discharge activities")
        public ArrayList<EngineeredStructureDischargeActivity> EngineeredStructureDischargeActivities = null;

        /**
        * Point velocity discharge activities
        */
        @ApiMember(DataType="array", Description="Point velocity discharge activities")
        public ArrayList<PointVelocityDischargeActivity> PointVelocityDischargeActivities = null;

        /**
        * Other method discharge activities
        */
        @ApiMember(DataType="array", Description="Other method discharge activities")
        public ArrayList<OtherMethodDischargeActivity> OtherMethodDischargeActivities = null;

        /**
        * Adcp discharge activities
        */
        @ApiMember(DataType="array", Description="Adcp discharge activities")
        public ArrayList<AdcpDischargeActivity> AdcpDischargeActivities = null;
        
        public DischargeSummary getDischargeSummary() { return DischargeSummary; }
        public DischargeActivity setDischargeSummary(DischargeSummary value) { this.DischargeSummary = value; return this; }
        public ArrayList<VolumetricDischargeActivity> getVolumetricDischargeActivities() { return VolumetricDischargeActivities; }
        public DischargeActivity setVolumetricDischargeActivities(ArrayList<VolumetricDischargeActivity> value) { this.VolumetricDischargeActivities = value; return this; }
        public ArrayList<EngineeredStructureDischargeActivity> getEngineeredStructureDischargeActivities() { return EngineeredStructureDischargeActivities; }
        public DischargeActivity setEngineeredStructureDischargeActivities(ArrayList<EngineeredStructureDischargeActivity> value) { this.EngineeredStructureDischargeActivities = value; return this; }
        public ArrayList<PointVelocityDischargeActivity> getPointVelocityDischargeActivities() { return PointVelocityDischargeActivities; }
        public DischargeActivity setPointVelocityDischargeActivities(ArrayList<PointVelocityDischargeActivity> value) { this.PointVelocityDischargeActivities = value; return this; }
        public ArrayList<OtherMethodDischargeActivity> getOtherMethodDischargeActivities() { return OtherMethodDischargeActivities; }
        public DischargeActivity setOtherMethodDischargeActivities(ArrayList<OtherMethodDischargeActivity> value) { this.OtherMethodDischargeActivities = value; return this; }
        public ArrayList<AdcpDischargeActivity> getAdcpDischargeActivities() { return AdcpDischargeActivities; }
        public DischargeActivity setAdcpDischargeActivities(ArrayList<AdcpDischargeActivity> value) { this.AdcpDischargeActivities = value; return this; }
    }

    public static class GageHeightAtZeroFlowActivity
    {
        /**
        * Observed date
        */
        @ApiMember(DataType="string", Description="Observed date", Format="date-time")
        public Instant ObservedDate = null;

        /**
        * Applicable since
        */
        @ApiMember(DataType="string", Description="Applicable since", Format="date-time")
        public Instant ApplicableSince = null;

        /**
        * Zero flow height
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Zero flow height")
        public DoubleWithDisplay ZeroFlowHeight = null;

        /**
        * Is observed
        */
        @ApiMember(DataType="boolean", Description="Is observed")
        public Boolean IsObserved = null;

        /**
        * Calculated details
        */
        @ApiMember(DataType="GageHeightAtZeroFlowCalculatedDetails", Description="Calculated details")
        public GageHeightAtZeroFlowCalculatedDetails CalculatedDetails = null;

        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;
        
        public Instant getObservedDate() { return ObservedDate; }
        public GageHeightAtZeroFlowActivity setObservedDate(Instant value) { this.ObservedDate = value; return this; }
        public Instant getApplicableSince() { return ApplicableSince; }
        public GageHeightAtZeroFlowActivity setApplicableSince(Instant value) { this.ApplicableSince = value; return this; }
        public DoubleWithDisplay getZeroFlowHeight() { return ZeroFlowHeight; }
        public GageHeightAtZeroFlowActivity setZeroFlowHeight(DoubleWithDisplay value) { this.ZeroFlowHeight = value; return this; }
        public Boolean getIsObserved() { return IsObserved; }
        public GageHeightAtZeroFlowActivity setIsObserved(Boolean value) { this.IsObserved = value; return this; }
        public GageHeightAtZeroFlowCalculatedDetails getCalculatedDetails() { return CalculatedDetails; }
        public GageHeightAtZeroFlowActivity setCalculatedDetails(GageHeightAtZeroFlowCalculatedDetails value) { this.CalculatedDetails = value; return this; }
        public String getUnit() { return Unit; }
        public GageHeightAtZeroFlowActivity setUnit(String value) { this.Unit = value; return this; }
        public String getComments() { return Comments; }
        public GageHeightAtZeroFlowActivity setComments(String value) { this.Comments = value; return this; }
        public String getParty() { return Party; }
        public GageHeightAtZeroFlowActivity setParty(String value) { this.Party = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public GageHeightAtZeroFlowActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
    }

    public static class ControlConditionActivity
    {
        /**
        * Control code
        */
        @ApiMember(Description="Control code")
        public String ControlCode = null;

        /**
        * Flow over control
        */
        @ApiMember(Description="Flow over control")
        public String FlowOverControl = null;

        /**
        * Control cleaned
        */
        @ApiMember(DataType="string", Description="Control cleaned")
        public ControlCleanedType ControlCleaned = null;

        /**
        * Control condition
        */
        @ApiMember(Description="Control condition")
        public String ControlCondition = null;

        /**
        * Instant cleaned
        */
        @ApiMember(DataType="string", Description="Instant cleaned", Format="date-time")
        public Instant DateCleaned = null;

        /**
        * Distance to gage
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Distance to gage")
        public QuantityWithDisplay DistanceToGage = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;
        
        public String getControlCode() { return ControlCode; }
        public ControlConditionActivity setControlCode(String value) { this.ControlCode = value; return this; }
        public String getFlowOverControl() { return FlowOverControl; }
        public ControlConditionActivity setFlowOverControl(String value) { this.FlowOverControl = value; return this; }
        public ControlCleanedType getControlCleaned() { return ControlCleaned; }
        public ControlConditionActivity setControlCleaned(ControlCleanedType value) { this.ControlCleaned = value; return this; }
        public String getControlCondition() { return ControlCondition; }
        public ControlConditionActivity setControlCondition(String value) { this.ControlCondition = value; return this; }
        public Instant getDateCleaned() { return DateCleaned; }
        public ControlConditionActivity setDateCleaned(Instant value) { this.DateCleaned = value; return this; }
        public QuantityWithDisplay getDistanceToGage() { return DistanceToGage; }
        public ControlConditionActivity setDistanceToGage(QuantityWithDisplay value) { this.DistanceToGage = value; return this; }
        public String getComments() { return Comments; }
        public ControlConditionActivity setComments(String value) { this.Comments = value; return this; }
        public String getParty() { return Party; }
        public ControlConditionActivity setParty(String value) { this.Party = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public ControlConditionActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
    }

    public static class InspectionActivity
    {
        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Readings
        */
        @ApiMember(DataType="array", Description="Readings")
        public ArrayList<Reading> Readings = null;

        /**
        * Number of readings which could not be converted to the target datum
        */
        @ApiMember(DataType="integer", Description="Number of readings which could not be converted to the target datum", Format="int32")
        public Integer NumberOfReadingsNotDatumConverted = null;

        /**
        * Calibration checks
        */
        @ApiMember(DataType="array", Description="Calibration checks")
        public ArrayList<CalibrationCheck> CalibrationChecks = null;

        /**
        * Inspections
        */
        @ApiMember(DataType="array", Description="Inspections")
        public ArrayList<Inspection> Inspections = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;
        
        public String getParty() { return Party; }
        public InspectionActivity setParty(String value) { this.Party = value; return this; }
        public ArrayList<Reading> getReadings() { return Readings; }
        public InspectionActivity setReadings(ArrayList<Reading> value) { this.Readings = value; return this; }
        public Integer getNumberOfReadingsNotDatumConverted() { return NumberOfReadingsNotDatumConverted; }
        public InspectionActivity setNumberOfReadingsNotDatumConverted(Integer value) { this.NumberOfReadingsNotDatumConverted = value; return this; }
        public ArrayList<CalibrationCheck> getCalibrationChecks() { return CalibrationChecks; }
        public InspectionActivity setCalibrationChecks(ArrayList<CalibrationCheck> value) { this.CalibrationChecks = value; return this; }
        public ArrayList<Inspection> getInspections() { return Inspections; }
        public InspectionActivity setInspections(ArrayList<Inspection> value) { this.Inspections = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public InspectionActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
    }

    public static class CrossSectionSurveyActivity
    {
        /**
        * Start time
        */
        @ApiMember(DataType="string", Description="Start time", Format="date-time")
        public Instant StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="string", Description="End time", Format="date-time")
        public Instant EndTime = null;

        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Channel
        */
        @ApiMember(Description="Channel")
        public String Channel = null;

        /**
        * Relative location
        */
        @ApiMember(Description="Relative location")
        public String RelativeLocation = null;

        /**
        * Starting point
        */
        @ApiMember(DataType="string", Description="Starting point")
        public StartPointType StartingPoint = null;

        /**
        * Stage
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Stage")
        public QuantityWithDisplay Stage = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Cross-section points
        */
        @ApiMember(DataType="array", Description="Cross-section points")
        public ArrayList<CrossSectionPoint> CrossSectionPoints = null;
        
        public Instant getStartTime() { return StartTime; }
        public CrossSectionSurveyActivity setStartTime(Instant value) { this.StartTime = value; return this; }
        public Instant getEndTime() { return EndTime; }
        public CrossSectionSurveyActivity setEndTime(Instant value) { this.EndTime = value; return this; }
        public String getParty() { return Party; }
        public CrossSectionSurveyActivity setParty(String value) { this.Party = value; return this; }
        public String getChannel() { return Channel; }
        public CrossSectionSurveyActivity setChannel(String value) { this.Channel = value; return this; }
        public String getRelativeLocation() { return RelativeLocation; }
        public CrossSectionSurveyActivity setRelativeLocation(String value) { this.RelativeLocation = value; return this; }
        public StartPointType getStartingPoint() { return StartingPoint; }
        public CrossSectionSurveyActivity setStartingPoint(StartPointType value) { this.StartingPoint = value; return this; }
        public QuantityWithDisplay getStage() { return Stage; }
        public CrossSectionSurveyActivity setStage(QuantityWithDisplay value) { this.Stage = value; return this; }
        public String getComments() { return Comments; }
        public CrossSectionSurveyActivity setComments(String value) { this.Comments = value; return this; }
        public ArrayList<CrossSectionPoint> getCrossSectionPoints() { return CrossSectionPoints; }
        public CrossSectionSurveyActivity setCrossSectionPoints(ArrayList<CrossSectionPoint> value) { this.CrossSectionPoints = value; return this; }
    }

    public static class LevelSurveyActivity
    {
        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Origin reference point unique ID
        */
        @ApiMember(DataType="string", Description="Origin reference point unique ID", Format="guid")
        public String OriginReferencePointUniqueId = null;

        /**
        * Measurement method
        */
        @ApiMember(Description="Measurement method")
        public String Method = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Level survey measurements
        */
        @ApiMember(DataType="array", Description="Level survey measurements")
        public ArrayList<LevelSurveyMeasurement> LevelMeasurements = null;
        
        public String getParty() { return Party; }
        public LevelSurveyActivity setParty(String value) { this.Party = value; return this; }
        public String getOriginReferencePointUniqueId() { return OriginReferencePointUniqueId; }
        public LevelSurveyActivity setOriginReferencePointUniqueId(String value) { this.OriginReferencePointUniqueId = value; return this; }
        public String getMethod() { return Method; }
        public LevelSurveyActivity setMethod(String value) { this.Method = value; return this; }
        public String getComments() { return Comments; }
        public LevelSurveyActivity setComments(String value) { this.Comments = value; return this; }
        public ArrayList<LevelSurveyMeasurement> getLevelMeasurements() { return LevelMeasurements; }
        public LevelSurveyActivity setLevelMeasurements(ArrayList<LevelSurveyMeasurement> value) { this.LevelMeasurements = value; return this; }
    }

    public static class FieldVisitApproval
    {
        /**
        * Approval level
        */
        @ApiMember(DataType="integer", Description="Approval level", Format="int64")
        public Long ApprovalLevel = null;

        /**
        * Level description
        */
        @ApiMember(Description="Level description")
        public String LevelDescription = null;
        
        public Long getApprovalLevel() { return ApprovalLevel; }
        public FieldVisitApproval setApprovalLevel(Long value) { this.ApprovalLevel = value; return this; }
        public String getLevelDescription() { return LevelDescription; }
        public FieldVisitApproval setLevelDescription(String value) { this.LevelDescription = value; return this; }
    }

    public static class DatumConversionResult
    {
        /**
        * True if values are converted to the target reference datum
        */
        @ApiMember(DataType="boolean", Description="True if values are converted to the target reference datum")
        public Boolean ValuesConverted = null;

        /**
        * The reason, if any, that values could not be converted to the target reference datum
        */
        @ApiMember(Description="The reason, if any, that values could not be converted to the target reference datum")
        public String FailureReason = null;

        /**
        * Target reference datum
        */
        @ApiMember(Description="Target reference datum")
        public String TargetDatum = null;
        
        public Boolean isValuesConverted() { return ValuesConverted; }
        public DatumConversionResult setValuesConverted(Boolean value) { this.ValuesConverted = value; return this; }
        public String getFailureReason() { return FailureReason; }
        public DatumConversionResult setFailureReason(String value) { this.FailureReason = value; return this; }
        public String getTargetDatum() { return TargetDatum; }
        public DatumConversionResult setTargetDatum(String value) { this.TargetDatum = value; return this; }
    }

    public static interface IFieldVisitData
    {
        public String Identifier = null;
        public ArrayList<Attachment> Attachments = null;
        public ArrayList<DischargeActivity> DischargeActivities = null;
        public GageHeightAtZeroFlowActivity GageHeightAtZeroFlowActivity = null;
        public ControlConditionActivity ControlConditionActivity = null;
        public InspectionActivity InspectionActivity = null;
        public ArrayList<CrossSectionSurveyActivity> CrossSectionSurveyActivity = null;
        public LevelSurveyActivity LevelSurveyActivity = null;
        public FieldVisitApproval Approval = null;
        public DatumConversionResult DatumConversionResult = null;
    }

    public static class ActiveMeterDetails extends CurrentMeter
    {
        /**
        * Meter type
        */
        @ApiMember(DataType="string", Description="Meter type")
        public MeterType MeterType = null;

        /**
        * Configuration
        */
        @ApiMember(Description="Configuration")
        public String Configuration = null;

        /**
        * Firmware version
        */
        @ApiMember(Description="Firmware version")
        public String FirmwareVersion = null;

        /**
        * Software version
        */
        @ApiMember(Description="Software version")
        public String SoftwareVersion = null;

        /**
        * Meter calibrations
        */
        @ApiMember(DataType="array", Description="Meter calibrations")
        public ArrayList<ActiveMeterCalibration> MeterCalibrations = null;
        
        public MeterType getMeterType() { return MeterType; }
        public ActiveMeterDetails setMeterType(MeterType value) { this.MeterType = value; return this; }
        public String getConfiguration() { return Configuration; }
        public ActiveMeterDetails setConfiguration(String value) { this.Configuration = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public ActiveMeterDetails setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getSoftwareVersion() { return SoftwareVersion; }
        public ActiveMeterDetails setSoftwareVersion(String value) { this.SoftwareVersion = value; return this; }
        public ArrayList<ActiveMeterCalibration> getMeterCalibrations() { return MeterCalibrations; }
        public ActiveMeterDetails setMeterCalibrations(ArrayList<ActiveMeterCalibration> value) { this.MeterCalibrations = value; return this; }
    }

    public static enum ActivityType
    {
        Reading,
        Inspection,
        CalibrationCheck,
        DischargeSummary,
        DischargePointVelocity,
        DischargeVolumetric,
        DischargeEngineeredStructure,
        DischargeAdcp,
        DischargeOtherMethod,
        GageHeightAtZeroFlow,
        ControlCondition,
        CrossSectionSurvey,
        LevelSurvey,
        Attachment;
    }

    public static enum InspectionType
    {
        Unknown,
        BubbleGage,
        CrestStageGage,
        WireWeightGage,
        MaximumMinimumGage,
        WaterQuality,
        FieldMeter,
        Other;
    }

    public static class FieldVisit extends FieldVisitDescription implements IFieldVisitData
    {
        /**
        * Attachments
        */
        @ApiMember(DataType="array", Description="Attachments")
        public ArrayList<Attachment> Attachments = null;

        /**
        * Discharge activities
        */
        @ApiMember(DataType="array", Description="Discharge activities")
        public ArrayList<DischargeActivity> DischargeActivities = null;

        /**
        * Gage height at zero flow activity
        */
        @ApiMember(DataType="GageHeightAtZeroFlowActivity", Description="Gage height at zero flow activity")
        public GageHeightAtZeroFlowActivity GageHeightAtZeroFlowActivity = null;

        /**
        * Control condition activity
        */
        @ApiMember(DataType="ControlConditionActivity", Description="Control condition activity")
        public ControlConditionActivity ControlConditionActivity = null;

        /**
        * Inspection activity
        */
        @ApiMember(DataType="InspectionActivity", Description="Inspection activity")
        public InspectionActivity InspectionActivity = null;

        /**
        * Cross-section survey activity
        */
        @ApiMember(DataType="array", Description="Cross-section survey activity")
        public ArrayList<CrossSectionSurveyActivity> CrossSectionSurveyActivity = null;

        /**
        * Level survey activity
        */
        @ApiMember(DataType="LevelSurveyActivity", Description="Level survey activity")
        public LevelSurveyActivity LevelSurveyActivity = null;

        /**
        * Approval
        */
        @ApiMember(DataType="FieldVisitApproval", Description="Approval")
        public FieldVisitApproval Approval = null;

        /**
        * Summary results for a requested datum conversion
        */
        @ApiMember(DataType="DatumConversionResult", Description="Summary results for a requested datum conversion")
        public DatumConversionResult DatumConversionResult = null;
        
        public ArrayList<Attachment> getAttachments() { return Attachments; }
        public FieldVisit setAttachments(ArrayList<Attachment> value) { this.Attachments = value; return this; }
        public ArrayList<DischargeActivity> getDischargeActivities() { return DischargeActivities; }
        public FieldVisit setDischargeActivities(ArrayList<DischargeActivity> value) { this.DischargeActivities = value; return this; }
        public GageHeightAtZeroFlowActivity getGageHeightAtZeroFlowActivity() { return GageHeightAtZeroFlowActivity; }
        public FieldVisit setGageHeightAtZeroFlowActivity(GageHeightAtZeroFlowActivity value) { this.GageHeightAtZeroFlowActivity = value; return this; }
        public ControlConditionActivity getControlConditionActivity() { return ControlConditionActivity; }
        public FieldVisit setControlConditionActivity(ControlConditionActivity value) { this.ControlConditionActivity = value; return this; }
        public InspectionActivity getInspectionActivity() { return InspectionActivity; }
        public FieldVisit setInspectionActivity(InspectionActivity value) { this.InspectionActivity = value; return this; }
        public ArrayList<CrossSectionSurveyActivity> getCrossSectionSurveyActivity() { return CrossSectionSurveyActivity; }
        public FieldVisit setCrossSectionSurveyActivity(ArrayList<CrossSectionSurveyActivity> value) { this.CrossSectionSurveyActivity = value; return this; }
        public LevelSurveyActivity getLevelSurveyActivity() { return LevelSurveyActivity; }
        public FieldVisit setLevelSurveyActivity(LevelSurveyActivity value) { this.LevelSurveyActivity = value; return this; }
        public FieldVisitApproval getApproval() { return Approval; }
        public FieldVisit setApproval(FieldVisitApproval value) { this.Approval = value; return this; }
        public DatumConversionResult getDatumConversionResult() { return DatumConversionResult; }
        public FieldVisit setDatumConversionResult(DatumConversionResult value) { this.DatumConversionResult = value; return this; }
    }

    public static class FieldVisitReading
    {
        /**
        * Approval
        */
        @ApiMember(DataType="FieldVisitApproval", Description="Approval")
        public FieldVisitApproval Approval = null;

        /**
        * Control condition
        */
        @ApiMember(Description="Control condition")
        public String ControlCondition = null;

        /**
        * Field visit identifier
        */
        @ApiMember(Description="Field visit identifier")
        public String FieldVisitIdentifier = null;

        /**
        * Value
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Value")
        public QuantityWithDisplay Value = null;

        /**
        * Value
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Value")
        public QuantityWithDisplay AdjustmentAmount = null;

        /**
        * Uncertainty
        */
        @ApiMember(DataType="Uncertainty", Description="Uncertainty")
        public Uncertainty Uncertainty = null;

        /**
        * Datum converted values where applicable.
        */
        @ApiMember(DataType="array", Description="Datum converted values where applicable.")
        public ArrayList<DatumConvertedQuantityWithDisplay> DatumConvertedValues = null;

        /**
        * Parameter Name
        */
        @ApiMember(Description="Parameter Name")
        public String Parameter = null;

        /**
        * Parameter Id
        */
        @ApiMember(Description="Parameter Id")
        public String ParameterId = null;

        /**
        * Monitoring method
        */
        @ApiMember(Description="Monitoring method")
        public String MonitoringMethod = null;

        /**
        * Sub location identifier
        */
        @ApiMember(Description="Sub location identifier")
        public String SubLocationIdentifier = null;

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
        * Serial number
        */
        @ApiMember(Description="Serial number")
        public String SerialNumber = null;

        /**
        * Time
        */
        @ApiMember(DataType="string", Description="Time", Format="date-time")
        public Instant Time = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", Format="int32")
        public Integer GradeCode = null;

        /**
        * Qualifiers
        */
        @ApiMember(DataType="array", Description="Qualifiers")
        public ArrayList<String> Qualifiers = null;

        /**
        * Field visit reading type
        */
        @ApiMember(DataType="string", Description="Field visit reading type")
        public FieldVisitReadingType ReadingType = null;

        /**
        * Reference point unique ID
        */
        @ApiMember(DataType="string", Description="Reference point unique ID", Format="guid")
        public String ReferencePointUniqueId = null;

        /**
        * Indicates if this reading is measured against the local assumed datum of the reading's location
        */
        @ApiMember(DataType="boolean", Description="Indicates if this reading is measured against the local assumed datum of the reading's location")
        public Boolean UseLocationDatumAsReference = null;
        
        public FieldVisitApproval getApproval() { return Approval; }
        public FieldVisitReading setApproval(FieldVisitApproval value) { this.Approval = value; return this; }
        public String getControlCondition() { return ControlCondition; }
        public FieldVisitReading setControlCondition(String value) { this.ControlCondition = value; return this; }
        public String getFieldVisitIdentifier() { return FieldVisitIdentifier; }
        public FieldVisitReading setFieldVisitIdentifier(String value) { this.FieldVisitIdentifier = value; return this; }
        public QuantityWithDisplay getValue() { return Value; }
        public FieldVisitReading setValue(QuantityWithDisplay value) { this.Value = value; return this; }
        public QuantityWithDisplay getAdjustmentAmount() { return AdjustmentAmount; }
        public FieldVisitReading setAdjustmentAmount(QuantityWithDisplay value) { this.AdjustmentAmount = value; return this; }
        public Uncertainty getUncertainty() { return Uncertainty; }
        public FieldVisitReading setUncertainty(Uncertainty value) { this.Uncertainty = value; return this; }
        public ArrayList<DatumConvertedQuantityWithDisplay> getDatumConvertedValues() { return DatumConvertedValues; }
        public FieldVisitReading setDatumConvertedValues(ArrayList<DatumConvertedQuantityWithDisplay> value) { this.DatumConvertedValues = value; return this; }
        public String getParameter() { return Parameter; }
        public FieldVisitReading setParameter(String value) { this.Parameter = value; return this; }
        public String getParameterId() { return ParameterId; }
        public FieldVisitReading setParameterId(String value) { this.ParameterId = value; return this; }
        public String getMonitoringMethod() { return MonitoringMethod; }
        public FieldVisitReading setMonitoringMethod(String value) { this.MonitoringMethod = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public FieldVisitReading setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public FieldVisitReading setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public FieldVisitReading setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public FieldVisitReading setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public Instant getTime() { return Time; }
        public FieldVisitReading setTime(Instant value) { this.Time = value; return this; }
        public String getComments() { return Comments; }
        public FieldVisitReading setComments(String value) { this.Comments = value; return this; }
        public Boolean isPublish() { return Publish; }
        public FieldVisitReading setPublish(Boolean value) { this.Publish = value; return this; }
        public Integer getGradeCode() { return GradeCode; }
        public FieldVisitReading setGradeCode(Integer value) { this.GradeCode = value; return this; }
        public ArrayList<String> getQualifiers() { return Qualifiers; }
        public FieldVisitReading setQualifiers(ArrayList<String> value) { this.Qualifiers = value; return this; }
        public FieldVisitReadingType getReadingType() { return ReadingType; }
        public FieldVisitReading setReadingType(FieldVisitReadingType value) { this.ReadingType = value; return this; }
        public String getReferencePointUniqueId() { return ReferencePointUniqueId; }
        public FieldVisitReading setReferencePointUniqueId(String value) { this.ReferencePointUniqueId = value; return this; }
        public Boolean isUseLocationDatumAsReference() { return UseLocationDatumAsReference; }
        public FieldVisitReading setUseLocationDatumAsReference(Boolean value) { this.UseLocationDatumAsReference = value; return this; }
    }

    public static enum TrendLineAnalysisType
    {
        Linear;
    }

    public static class TrendLineAnalysis
    {
        /**
        * Type of regression analysis
        */
        @ApiMember(DataType="string", Description="Type of regression analysis")
        public TrendLineAnalysisType Type = null;

        /**
        * Start point of period
        */
        @ApiMember(DataType="TimeSeriesPoint", Description="Start point of period")
        public TimeSeriesPoint StartPoint = null;

        /**
        * End point of period
        */
        @ApiMember(DataType="TimeSeriesPoint", Description="End point of period")
        public TimeSeriesPoint EndPoint = null;

        /**
        * Actual absolute change, as the difference between the first and last measurement values
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Actual absolute change, as the difference between the first and last measurement values")
        public DoubleWithDisplay ActualAbsoluteChange = null;

        /**
        * Modeled absolute change, as the difference between the first and last trend line values
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Modeled absolute change, as the difference between the first and last trend line values")
        public DoubleWithDisplay ModeledAbsoluteChange = null;

        /**
        * Actual percentage change, as the actual absolute change relative to the first measurement value
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Actual percentage change, as the actual absolute change relative to the first measurement value")
        public DoubleWithDisplay ActualPercentageChange = null;

        /**
        * Modeled percentage change, as the modeled absolute change relative to the first trend line value
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Modeled percentage change, as the modeled absolute change relative to the first trend line value")
        public DoubleWithDisplay ModeledPercentageChange = null;

        /**
        * Minimum value
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Minimum value")
        public DoubleWithDisplay MinValue = null;

        /**
        * Maximum value
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Maximum value")
        public DoubleWithDisplay MaxValue = null;

        /**
        * Lower Quartile (Q1) of residuals
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Lower Quartile (Q1) of residuals")
        public DoubleWithDisplay LowerQuartileOfResiduals = null;

        /**
        * Median (Q2) of residuals
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Median (Q2) of residuals")
        public DoubleWithDisplay MedianOfResiduals = null;

        /**
        * Upper Quartile (Q3) of residuals
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Upper Quartile (Q3) of residuals")
        public DoubleWithDisplay UpperQuartileOfResiduals = null;

        /**
        * Trend line slope measured in data units per year
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Trend line slope measured in data units per year")
        public DoubleWithDisplay Slope = null;

        /**
        * Trend line intercept, as the value of the trend line at the time of QueryFrom
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Trend line intercept, as the value of the trend line at the time of QueryFrom")
        public DoubleWithDisplay Intercept = null;

        /**
        * Standard error in trend line slope
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Standard error in trend line slope")
        public DoubleWithDisplay SlopeStandardError = null;

        /**
        * Standard deviation of results
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Standard deviation of results")
        public DoubleWithDisplay StandardDeviation = null;

        /**
        * Trend line correlation coefficient
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Trend line correlation coefficient")
        public DoubleWithDisplay CorrelationCoefficient = null;
        
        public TrendLineAnalysisType getType() { return Type; }
        public TrendLineAnalysis setType(TrendLineAnalysisType value) { this.Type = value; return this; }
        public TimeSeriesPoint getStartPoint() { return StartPoint; }
        public TrendLineAnalysis setStartPoint(TimeSeriesPoint value) { this.StartPoint = value; return this; }
        public TimeSeriesPoint getEndPoint() { return EndPoint; }
        public TrendLineAnalysis setEndPoint(TimeSeriesPoint value) { this.EndPoint = value; return this; }
        public DoubleWithDisplay getActualAbsoluteChange() { return ActualAbsoluteChange; }
        public TrendLineAnalysis setActualAbsoluteChange(DoubleWithDisplay value) { this.ActualAbsoluteChange = value; return this; }
        public DoubleWithDisplay getModeledAbsoluteChange() { return ModeledAbsoluteChange; }
        public TrendLineAnalysis setModeledAbsoluteChange(DoubleWithDisplay value) { this.ModeledAbsoluteChange = value; return this; }
        public DoubleWithDisplay getActualPercentageChange() { return ActualPercentageChange; }
        public TrendLineAnalysis setActualPercentageChange(DoubleWithDisplay value) { this.ActualPercentageChange = value; return this; }
        public DoubleWithDisplay getModeledPercentageChange() { return ModeledPercentageChange; }
        public TrendLineAnalysis setModeledPercentageChange(DoubleWithDisplay value) { this.ModeledPercentageChange = value; return this; }
        public DoubleWithDisplay getMinValue() { return MinValue; }
        public TrendLineAnalysis setMinValue(DoubleWithDisplay value) { this.MinValue = value; return this; }
        public DoubleWithDisplay getMaxValue() { return MaxValue; }
        public TrendLineAnalysis setMaxValue(DoubleWithDisplay value) { this.MaxValue = value; return this; }
        public DoubleWithDisplay getLowerQuartileOfResiduals() { return LowerQuartileOfResiduals; }
        public TrendLineAnalysis setLowerQuartileOfResiduals(DoubleWithDisplay value) { this.LowerQuartileOfResiduals = value; return this; }
        public DoubleWithDisplay getMedianOfResiduals() { return MedianOfResiduals; }
        public TrendLineAnalysis setMedianOfResiduals(DoubleWithDisplay value) { this.MedianOfResiduals = value; return this; }
        public DoubleWithDisplay getUpperQuartileOfResiduals() { return UpperQuartileOfResiduals; }
        public TrendLineAnalysis setUpperQuartileOfResiduals(DoubleWithDisplay value) { this.UpperQuartileOfResiduals = value; return this; }
        public DoubleWithDisplay getSlope() { return Slope; }
        public TrendLineAnalysis setSlope(DoubleWithDisplay value) { this.Slope = value; return this; }
        public DoubleWithDisplay getIntercept() { return Intercept; }
        public TrendLineAnalysis setIntercept(DoubleWithDisplay value) { this.Intercept = value; return this; }
        public DoubleWithDisplay getSlopeStandardError() { return SlopeStandardError; }
        public TrendLineAnalysis setSlopeStandardError(DoubleWithDisplay value) { this.SlopeStandardError = value; return this; }
        public DoubleWithDisplay getStandardDeviation() { return StandardDeviation; }
        public TrendLineAnalysis setStandardDeviation(DoubleWithDisplay value) { this.StandardDeviation = value; return this; }
        public DoubleWithDisplay getCorrelationCoefficient() { return CorrelationCoefficient; }
        public TrendLineAnalysis setCorrelationCoefficient(DoubleWithDisplay value) { this.CorrelationCoefficient = value; return this; }
    }

    public static class UnitMetadata
    {
        /**
        * UniqueId
        */
        @ApiMember(DataType="string", Description="UniqueId", Format="guid")
        public String UniqueId = null;

        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Group identifier
        */
        @ApiMember(Description="Group identifier")
        public String GroupIdentifier = null;

        /**
        * Symbol
        */
        @ApiMember(Description="Symbol")
        public String Symbol = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;

        /**
        * Base multiplier
        */
        @ApiMember(Description="Base multiplier")
        public String BaseMultiplier = null;

        /**
        * Base offset
        */
        @ApiMember(Description="Base offset")
        public String BaseOffset = null;
        
        public String getUniqueId() { return UniqueId; }
        public UnitMetadata setUniqueId(String value) { this.UniqueId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public UnitMetadata setIdentifier(String value) { this.Identifier = value; return this; }
        public String getGroupIdentifier() { return GroupIdentifier; }
        public UnitMetadata setGroupIdentifier(String value) { this.GroupIdentifier = value; return this; }
        public String getSymbol() { return Symbol; }
        public UnitMetadata setSymbol(String value) { this.Symbol = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public UnitMetadata setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getBaseMultiplier() { return BaseMultiplier; }
        public UnitMetadata setBaseMultiplier(String value) { this.BaseMultiplier = value; return this; }
        public String getBaseOffset() { return BaseOffset; }
        public UnitMetadata setBaseOffset(String value) { this.BaseOffset = value; return this; }
    }

    public static class RatingModelDescription
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Label
        */
        @ApiMember(Description="Label")
        public String Label = null;

        /**
        * Location identifier
        */
        @ApiMember(Description="Location identifier")
        public String LocationIdentifier = null;

        /**
        * Input parameter
        */
        @ApiMember(Description="Input parameter")
        public String InputParameter = null;

        /**
        * Input unit
        */
        @ApiMember(Description="Input unit")
        public String InputUnit = null;

        /**
        * Output parameter
        */
        @ApiMember(Description="Output parameter")
        public String OutputParameter = null;

        /**
        * Output unit
        */
        @ApiMember(Description="Output unit")
        public String OutputUnit = null;

        /**
        * Template name
        */
        @ApiMember(Description="Template name")
        public String TemplateName = null;

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
        * Last modified
        */
        @ApiMember(DataType="string", Description="Last modified", Format="date-time")
        public Instant LastModified = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;
        
        public String getIdentifier() { return Identifier; }
        public RatingModelDescription setIdentifier(String value) { this.Identifier = value; return this; }
        public String getLabel() { return Label; }
        public RatingModelDescription setLabel(String value) { this.Label = value; return this; }
        public String getLocationIdentifier() { return LocationIdentifier; }
        public RatingModelDescription setLocationIdentifier(String value) { this.LocationIdentifier = value; return this; }
        public String getInputParameter() { return InputParameter; }
        public RatingModelDescription setInputParameter(String value) { this.InputParameter = value; return this; }
        public String getInputUnit() { return InputUnit; }
        public RatingModelDescription setInputUnit(String value) { this.InputUnit = value; return this; }
        public String getOutputParameter() { return OutputParameter; }
        public RatingModelDescription setOutputParameter(String value) { this.OutputParameter = value; return this; }
        public String getOutputUnit() { return OutputUnit; }
        public RatingModelDescription setOutputUnit(String value) { this.OutputUnit = value; return this; }
        public String getTemplateName() { return TemplateName; }
        public RatingModelDescription setTemplateName(String value) { this.TemplateName = value; return this; }
        public String getDescription() { return Description; }
        public RatingModelDescription setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public RatingModelDescription setComment(String value) { this.Comment = value; return this; }
        public Instant getLastModified() { return LastModified; }
        public RatingModelDescription setLastModified(Instant value) { this.LastModified = value; return this; }
        public Boolean isPublish() { return Publish; }
        public RatingModelDescription setPublish(Boolean value) { this.Publish = value; return this; }
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
        * Parameter
        */
        @ApiMember(Description="Parameter")
        public String Parameter = null;

        /**
        * Rounding spec
        */
        @ApiMember(Description="Rounding spec")
        public String RoundingSpec = null;
        
        public String getMethodCode() { return MethodCode; }
        public MonitoringMethod setMethodCode(String value) { this.MethodCode = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public MonitoringMethod setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getDescription() { return Description; }
        public MonitoringMethod setDescription(String value) { this.Description = value; return this; }
        public String getParameter() { return Parameter; }
        public MonitoringMethod setParameter(String value) { this.Parameter = value; return this; }
        public String getRoundingSpec() { return RoundingSpec; }
        public MonitoringMethod setRoundingSpec(String value) { this.RoundingSpec = value; return this; }
    }

    public static class QualifierMetadata
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Code
        */
        @ApiMember(Description="Code")
        public String Code = null;

        /**
        * Display name
        */
        @ApiMember(Description="Display name")
        public String DisplayName = null;
        
        public String getIdentifier() { return Identifier; }
        public QualifierMetadata setIdentifier(String value) { this.Identifier = value; return this; }
        public String getCode() { return Code; }
        public QualifierMetadata setCode(String value) { this.Code = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public QualifierMetadata setDisplayName(String value) { this.DisplayName = value; return this; }
    }

    public static class ApprovalMetadata
    {
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
        * Color
        */
        @ApiMember(Description="Color")
        public String Color = null;
        
        public String getIdentifier() { return Identifier; }
        public ApprovalMetadata setIdentifier(String value) { this.Identifier = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public ApprovalMetadata setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getColor() { return Color; }
        public ApprovalMetadata setColor(String value) { this.Color = value; return this; }
    }

    public static enum AttachmentType
    {
        Unknown,
        Binary,
        Swami,
        Image,
        Video,
        Audio,
        Pdf,
        Xml,
        Text,
        Zip,
        HistoricalSwami,
        AquaCalc,
        FlowTracker,
        Hfc,
        ScotLogger,
        SonTek,
        WinRiver,
        LoggerFile,
        GeneratedReport,
        Csv,
        FieldDataPlugin;
    }

    public static enum AttachmentCategory
    {
        Unknown,
        None,
        LocationPhoto,
        Notes,
        Site,
        Channel,
        Measurement,
        CrossSection,
        Inspection,
        InventoryControl,
        LevelSurvey,
        Report;
    }

    public static class LocationReferenceStandard
    {
        /**
        * Reference standard
        */
        @ApiMember(Description="Reference standard")
        public String ReferenceStandard = null;

        /**
        * Reference standard offsets
        */
        @ApiMember(DataType="array", Description="Reference standard offsets")
        public ArrayList<ReferenceStandardOffset> ReferenceStandardOffsets = null;

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
        @ApiMember(DataType="number", Description="Uncertainty", Format="double")
        public Double Uncertainty = null;
        
        public String getReferenceStandard() { return ReferenceStandard; }
        public LocationReferenceStandard setReferenceStandard(String value) { this.ReferenceStandard = value; return this; }
        public ArrayList<ReferenceStandardOffset> getReferenceStandardOffsets() { return ReferenceStandardOffsets; }
        public LocationReferenceStandard setReferenceStandardOffsets(ArrayList<ReferenceStandardOffset> value) { this.ReferenceStandardOffsets = value; return this; }
        public String getComments() { return Comments; }
        public LocationReferenceStandard setComments(String value) { this.Comments = value; return this; }
        public String getMethod() { return Method; }
        public LocationReferenceStandard setMethod(String value) { this.Method = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public LocationReferenceStandard setUncertainty(Double value) { this.Uncertainty = value; return this; }
    }

    public static class LocationDatumPeriod
    {
        /**
        * Standard
        */
        @ApiMember(Description="Standard")
        public String Standard = null;

        /**
        * Time range
        */
        @ApiMember(DataType="TimeRange", Description="Time range")
        public TimeRange TimeRange = null;

        /**
        * Unit identifier
        */
        @ApiMember(Description="Unit identifier")
        public String UnitIdentifier = null;

        /**
        * Offset to standard
        */
        @ApiMember(DataType="number", Description="Offset to standard", Format="double")
        public Double OffsetToStandard = null;

        /**
        * Uncertainty of offset to standard if any
        */
        @ApiMember(DataType="number", Description="Uncertainty of offset to standard if any", Format="double")
        public Double Uncertainty = null;

        /**
        * Method used to determine the offset
        */
        @ApiMember(Description="Method used to determine the offset")
        public String Method = null;

        /**
        * Direction that positive measurements are taken in relation to the reference point
        */
        @ApiMember(DataType="string", Description="Direction that positive measurements are taken in relation to the reference point")
        public MeasurementDirection MeasurementDirection = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Applied time utc
        */
        @ApiMember(DataType="string", Description="Applied time utc", Format="date-time")
        public Instant AppliedTimeUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;
        
        public String getStandard() { return Standard; }
        public LocationDatumPeriod setStandard(String value) { this.Standard = value; return this; }
        public TimeRange getTimeRange() { return TimeRange; }
        public LocationDatumPeriod setTimeRange(TimeRange value) { this.TimeRange = value; return this; }
        public String getUnitIdentifier() { return UnitIdentifier; }
        public LocationDatumPeriod setUnitIdentifier(String value) { this.UnitIdentifier = value; return this; }
        public Double getOffsetToStandard() { return OffsetToStandard; }
        public LocationDatumPeriod setOffsetToStandard(Double value) { this.OffsetToStandard = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public LocationDatumPeriod setUncertainty(Double value) { this.Uncertainty = value; return this; }
        public String getMethod() { return Method; }
        public LocationDatumPeriod setMethod(String value) { this.Method = value; return this; }
        public MeasurementDirection getMeasurementDirection() { return MeasurementDirection; }
        public LocationDatumPeriod setMeasurementDirection(MeasurementDirection value) { this.MeasurementDirection = value; return this; }
        public String getComments() { return Comments; }
        public LocationDatumPeriod setComments(String value) { this.Comments = value; return this; }
        public Instant getAppliedTimeUtc() { return AppliedTimeUtc; }
        public LocationDatumPeriod setAppliedTimeUtc(Instant value) { this.AppliedTimeUtc = value; return this; }
        public String getUser() { return User; }
        public LocationDatumPeriod setUser(String value) { this.User = value; return this; }
    }

    public static class ReferencePointPeriod
    {
        /**
        * Standard Identifier. Empty when the elevation is measured against the local assumed datum.
        */
        @ApiMember(Description="Standard Identifier. Empty when the elevation is measured against the local assumed datum.")
        public String StandardIdentifier = null;

        /**
        * True if this period is measured against the location's local assumed datum instead of a standard datum
        */
        @ApiMember(DataType="boolean", Description="True if this period is measured against the location's local assumed datum instead of a standard datum")
        public Boolean IsMeasuredAgainstLocalAssumedDatum = null;

        /**
        * Time this period is valid from
        */
        @ApiMember(DataType="string", Description="Time this period is valid from", Format="date-time")
        public Instant ValidFrom = null;

        /**
        * Unit identifier
        */
        @ApiMember(Description="Unit identifier")
        public String Unit = null;

        /**
        * Elevation of the reference point relative to the standard or local assumed datum
        */
        @ApiMember(DataType="number", Description="Elevation of the reference point relative to the standard or local assumed datum", Format="double")
        public Double Elevation = null;

        /**
        * Optional uncertainty of elevation
        */
        @ApiMember(DataType="number", Description="Optional uncertainty of elevation", Format="double")
        public Double Uncertainty = null;

        /**
        * Optional method used to determine the elevation
        */
        @ApiMember(Description="Optional method used to determine the elevation")
        public String Method = null;

        /**
        * Direction of positive elevations in relation to the reference point
        */
        @ApiMember(DataType="string", Description="Direction of positive elevations in relation to the reference point")
        public MeasurementDirection MeasurementDirection = null;

        /**
        * Comment
        */
        @ApiMember(Description="Comment")
        public String Comment = null;

        /**
        * Applied date
        */
        @ApiMember(DataType="string", Description="Applied date", Format="date-time")
        public Instant AppliedTime = null;

        /**
        * Applied by user
        */
        @ApiMember(Description="Applied by user")
        public String AppliedByUser = null;
        
        public String getStandardIdentifier() { return StandardIdentifier; }
        public ReferencePointPeriod setStandardIdentifier(String value) { this.StandardIdentifier = value; return this; }
        public Boolean getIsMeasuredAgainstLocalAssumedDatum() { return IsMeasuredAgainstLocalAssumedDatum; }
        public ReferencePointPeriod setIsMeasuredAgainstLocalAssumedDatum(Boolean value) { this.IsMeasuredAgainstLocalAssumedDatum = value; return this; }
        public Instant getValidFrom() { return ValidFrom; }
        public ReferencePointPeriod setValidFrom(Instant value) { this.ValidFrom = value; return this; }
        public String getUnit() { return Unit; }
        public ReferencePointPeriod setUnit(String value) { this.Unit = value; return this; }
        public Double getElevation() { return Elevation; }
        public ReferencePointPeriod setElevation(Double value) { this.Elevation = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public ReferencePointPeriod setUncertainty(Double value) { this.Uncertainty = value; return this; }
        public String getMethod() { return Method; }
        public ReferencePointPeriod setMethod(String value) { this.Method = value; return this; }
        public MeasurementDirection getMeasurementDirection() { return MeasurementDirection; }
        public ReferencePointPeriod setMeasurementDirection(MeasurementDirection value) { this.MeasurementDirection = value; return this; }
        public String getComment() { return Comment; }
        public ReferencePointPeriod setComment(String value) { this.Comment = value; return this; }
        public Instant getAppliedTime() { return AppliedTime; }
        public ReferencePointPeriod setAppliedTime(Instant value) { this.AppliedTime = value; return this; }
        public String getAppliedByUser() { return AppliedByUser; }
        public ReferencePointPeriod setAppliedByUser(String value) { this.AppliedByUser = value; return this; }
    }

    public static enum CorrectionType
    {
        Offset,
        UsgsMultiPoint,
        RevertToRaw,
        DeleteRegion,
        CopyPaste,
        FillGaps,
        PersistenceGapFill,
        Drift,
        Percent,
        ReplaceWithGap,
        ClockDrift,
        Resample,
        Recession,
        AdjustableTrim,
        ThresholdTrim,
        ThresholdSuppression,
        FlagTrim,
        SingleGap,
        Amplification,
        SinglePoint,
        Deviation;
    }

    public static enum CorrectionProcessingOrder
    {
        PreProcessing,
        Normal,
        PostProcessing,
        Suppression;
    }

    public static enum RatingCurveType
    {
        LinearTable,
        LogarithmicTable,
        StandardEquation,
        DescriptiveEquation,
        LinearRegressionModel;
    }

    public static class ParameterWithUnit
    {
        /**
        * Parameter name
        */
        @ApiMember(Description="Parameter name")
        public String ParameterName = null;

        /**
        * Parameter unit
        */
        @ApiMember(Description="Parameter unit")
        public String ParameterUnit = null;
        
        public String getParameterName() { return ParameterName; }
        public ParameterWithUnit setParameterName(String value) { this.ParameterName = value; return this; }
        public String getParameterUnit() { return ParameterUnit; }
        public ParameterWithUnit setParameterUnit(String value) { this.ParameterUnit = value; return this; }
    }

    public static class PeriodOfApplicability
    {
        /**
        * Start time
        */
        @ApiMember(DataType="string", Description="Start time", Format="date-time")
        public Instant StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="string", Description="End time", Format="date-time")
        public Instant EndTime = null;

        /**
        * Remarks
        */
        @ApiMember(Description="Remarks")
        public String Remarks = null;
        
        public Instant getStartTime() { return StartTime; }
        public PeriodOfApplicability setStartTime(Instant value) { this.StartTime = value; return this; }
        public Instant getEndTime() { return EndTime; }
        public PeriodOfApplicability setEndTime(Instant value) { this.EndTime = value; return this; }
        public String getRemarks() { return Remarks; }
        public PeriodOfApplicability setRemarks(String value) { this.Remarks = value; return this; }
    }

    public static class RatingShift
    {
        /**
        * Period of applicability
        */
        @ApiMember(DataType="PeriodOfApplicability", Description="Period of applicability")
        public PeriodOfApplicability PeriodOfApplicability = null;

        /**
        * Shift points
        */
        @ApiMember(DataType="array", Description="Shift points")
        public ArrayList<RatingShiftPoint> ShiftPoints = null;
        
        public PeriodOfApplicability getPeriodOfApplicability() { return PeriodOfApplicability; }
        public RatingShift setPeriodOfApplicability(PeriodOfApplicability value) { this.PeriodOfApplicability = value; return this; }
        public ArrayList<RatingShiftPoint> getShiftPoints() { return ShiftPoints; }
        public RatingShift setShiftPoints(ArrayList<RatingShiftPoint> value) { this.ShiftPoints = value; return this; }
    }

    public static class RatingPoint
    {
        /**
        * Input value
        */
        @ApiMember(DataType="number", Description="Input value", Format="double")
        public Double InputValue = null;

        /**
        * Output value
        */
        @ApiMember(DataType="number", Description="Output value", Format="double")
        public Double OutputValue = null;
        
        public Double getInputValue() { return InputValue; }
        public RatingPoint setInputValue(Double value) { this.InputValue = value; return this; }
        public Double getOutputValue() { return OutputValue; }
        public RatingPoint setOutputValue(Double value) { this.OutputValue = value; return this; }
    }

    public static class OffsetPoint
    {
        /**
        * Input value
        */
        @ApiMember(DataType="number", Description="Input value", Format="double")
        public Double InputValue = null;

        /**
        * Offset
        */
        @ApiMember(DataType="number", Description="Offset", Format="double")
        public Double Offset = null;
        
        public Double getInputValue() { return InputValue; }
        public OffsetPoint setInputValue(Double value) { this.InputValue = value; return this; }
        public Double getOffset() { return Offset; }
        public OffsetPoint setOffset(Double value) { this.Offset = value; return this; }
    }

    public static class StatisticalDateTimeOffset
    {
        /**
        * Instant time offset
        */
        @ApiMember(DataType="string", Description="Instant time offset", Format="date-time")
        public Instant DateTimeOffset = null;

        /**
        * Represents end of time period
        */
        @ApiMember(DataType="boolean", Description="Represents end of time period")
        public Boolean RepresentsEndOfTimePeriod = null;
        
        public Instant getDateTimeOffset() { return DateTimeOffset; }
        public StatisticalDateTimeOffset setDateTimeOffset(Instant value) { this.DateTimeOffset = value; return this; }
        public Boolean isRepresentsEndOfTimePeriod() { return RepresentsEndOfTimePeriod; }
        public StatisticalDateTimeOffset setRepresentsEndOfTimePeriod(Boolean value) { this.RepresentsEndOfTimePeriod = value; return this; }
    }

    public static class DoubleWithDisplay
    {
        /**
        * Numeric
        */
        @ApiMember(DataType="number", Description="Numeric", Format="double")
        public Double Numeric = null;

        /**
        * Display
        */
        @ApiMember(Description="Display")
        public String Display = null;
        
        public Double getNumeric() { return Numeric; }
        public DoubleWithDisplay setNumeric(Double value) { this.Numeric = value; return this; }
        public String getDisplay() { return Display; }
        public DoubleWithDisplay setDisplay(String value) { this.Display = value; return this; }
    }

    public static class TimeSeriesThreshold
    {
        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Description
        */
        @ApiMember(Description="Description")
        public String Description = null;

        /**
        * Reference code
        */
        @ApiMember(Description="Reference code")
        public String ReferenceCode = null;

        /**
        * Severity
        */
        @ApiMember(DataType="integer", Description="Severity", Format="int32")
        public Integer Severity = null;

        /**
        * Type
        */
        @ApiMember(DataType="string", Description="Type")
        public ThresholdType Type = null;

        /**
        * Processing order
        */
        @ApiMember(DataType="string", Description="Processing order")
        public CorrectionProcessingOrder ProcessingOrder = null;

        /**
        * Display color
        */
        @ApiMember(Description="Display color")
        public String DisplayColor = null;

        /**
        * Periods
        */
        @ApiMember(DataType="array", Description="Periods")
        public ArrayList<TimeSeriesThresholdPeriod> Periods = null;
        
        public String getName() { return Name; }
        public TimeSeriesThreshold setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public TimeSeriesThreshold setDescription(String value) { this.Description = value; return this; }
        public String getReferenceCode() { return ReferenceCode; }
        public TimeSeriesThreshold setReferenceCode(String value) { this.ReferenceCode = value; return this; }
        public Integer getSeverity() { return Severity; }
        public TimeSeriesThreshold setSeverity(Integer value) { this.Severity = value; return this; }
        public ThresholdType getType() { return Type; }
        public TimeSeriesThreshold setType(ThresholdType value) { this.Type = value; return this; }
        public CorrectionProcessingOrder getProcessingOrder() { return ProcessingOrder; }
        public TimeSeriesThreshold setProcessingOrder(CorrectionProcessingOrder value) { this.ProcessingOrder = value; return this; }
        public String getDisplayColor() { return DisplayColor; }
        public TimeSeriesThreshold setDisplayColor(String value) { this.DisplayColor = value; return this; }
        public ArrayList<TimeSeriesThresholdPeriod> getPeriods() { return Periods; }
        public TimeSeriesThreshold setPeriods(ArrayList<TimeSeriesThresholdPeriod> value) { this.Periods = value; return this; }
    }

    public static class CompletedWork
    {
        /**
        * Collection agency
        */
        @ApiMember(Description="Collection agency")
        public String CollectionAgency = null;

        /**
        * Biological sample taken
        */
        @ApiMember(DataType="boolean", Description="Biological sample taken")
        public Boolean BiologicalSampleTaken = null;

        /**
        * Ground water level performed
        */
        @ApiMember(DataType="boolean", Description="Ground water level performed")
        public Boolean GroundWaterLevelPerformed = null;

        /**
        * Levels performed
        */
        @ApiMember(DataType="boolean", Description="Levels performed")
        public Boolean LevelsPerformed = null;

        /**
        * Other sample taken
        */
        @ApiMember(DataType="boolean", Description="Other sample taken")
        public Boolean OtherSampleTaken = null;

        /**
        * Recorder data collected
        */
        @ApiMember(DataType="boolean", Description="Recorder data collected")
        public Boolean RecorderDataCollected = null;

        /**
        * Sediment sample taken
        */
        @ApiMember(DataType="boolean", Description="Sediment sample taken")
        public Boolean SedimentSampleTaken = null;

        /**
        * Safety inspection performed
        */
        @ApiMember(DataType="boolean", Description="Safety inspection performed")
        public Boolean SafetyInspectionPerformed = null;

        /**
        * Water quality sample taken
        */
        @ApiMember(DataType="boolean", Description="Water quality sample taken")
        public Boolean WaterQualitySampleTaken = null;
        
        public String getCollectionAgency() { return CollectionAgency; }
        public CompletedWork setCollectionAgency(String value) { this.CollectionAgency = value; return this; }
        public Boolean isBiologicalSampleTaken() { return BiologicalSampleTaken; }
        public CompletedWork setBiologicalSampleTaken(Boolean value) { this.BiologicalSampleTaken = value; return this; }
        public Boolean isGroundWaterLevelPerformed() { return GroundWaterLevelPerformed; }
        public CompletedWork setGroundWaterLevelPerformed(Boolean value) { this.GroundWaterLevelPerformed = value; return this; }
        public Boolean isLevelsPerformed() { return LevelsPerformed; }
        public CompletedWork setLevelsPerformed(Boolean value) { this.LevelsPerformed = value; return this; }
        public Boolean isOtherSampleTaken() { return OtherSampleTaken; }
        public CompletedWork setOtherSampleTaken(Boolean value) { this.OtherSampleTaken = value; return this; }
        public Boolean isRecorderDataCollected() { return RecorderDataCollected; }
        public CompletedWork setRecorderDataCollected(Boolean value) { this.RecorderDataCollected = value; return this; }
        public Boolean isSedimentSampleTaken() { return SedimentSampleTaken; }
        public CompletedWork setSedimentSampleTaken(Boolean value) { this.SedimentSampleTaken = value; return this; }
        public Boolean isSafetyInspectionPerformed() { return SafetyInspectionPerformed; }
        public CompletedWork setSafetyInspectionPerformed(Boolean value) { this.SafetyInspectionPerformed = value; return this; }
        public Boolean isWaterQualitySampleTaken() { return WaterQualitySampleTaken; }
        public CompletedWork setWaterQualitySampleTaken(Boolean value) { this.WaterQualitySampleTaken = value; return this; }
    }

    public static enum MetadataChangeContentType
    {
        Default,
        Corrected;
    }

    public static class GapToleranceOperation extends GapTolerance implements IStackPositionMetadataOperation
    {
        /**
        * Operation type
        */
        @ApiMember(DataType="string", Description="Operation type")
        public MetadataChangeOperationType OperationType = null;

        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        /**
        * Stack position
        */
        @ApiMember(DataType="integer", Description="Stack position", Format="int32")
        public Integer StackPosition = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;
        
        public MetadataChangeOperationType getOperationType() { return OperationType; }
        public GapToleranceOperation setOperationType(MetadataChangeOperationType value) { this.OperationType = value; return this; }
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public GapToleranceOperation setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public GapToleranceOperation setUser(String value) { this.User = value; return this; }
        public Integer getStackPosition() { return StackPosition; }
        public GapToleranceOperation setStackPosition(Integer value) { this.StackPosition = value; return this; }
        public String getComments() { return Comments; }
        public GapToleranceOperation setComments(String value) { this.Comments = value; return this; }
    }

    public static class GradeOperation extends Grade implements IStackPositionMetadataOperation
    {
        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        /**
        * Operation type
        */
        @ApiMember(DataType="string", Description="Operation type")
        public MetadataChangeOperationType OperationType = null;

        /**
        * Stack position
        */
        @ApiMember(DataType="integer", Description="Stack position", Format="int32")
        public Integer StackPosition = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;
        
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public GradeOperation setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public GradeOperation setUser(String value) { this.User = value; return this; }
        public MetadataChangeOperationType getOperationType() { return OperationType; }
        public GradeOperation setOperationType(MetadataChangeOperationType value) { this.OperationType = value; return this; }
        public Integer getStackPosition() { return StackPosition; }
        public GradeOperation setStackPosition(Integer value) { this.StackPosition = value; return this; }
        public String getComments() { return Comments; }
        public GradeOperation setComments(String value) { this.Comments = value; return this; }
    }

    public static class InterpolationTypeOperation extends InterpolationType implements IStackPositionMetadataOperation
    {
        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        /**
        * Operation type
        */
        @ApiMember(DataType="string", Description="Operation type")
        public MetadataChangeOperationType OperationType = null;

        /**
        * Stack position
        */
        @ApiMember(DataType="integer", Description="Stack position", Format="int32")
        public Integer StackPosition = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;
        
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public InterpolationTypeOperation setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public InterpolationTypeOperation setUser(String value) { this.User = value; return this; }
        public MetadataChangeOperationType getOperationType() { return OperationType; }
        public InterpolationTypeOperation setOperationType(MetadataChangeOperationType value) { this.OperationType = value; return this; }
        public Integer getStackPosition() { return StackPosition; }
        public InterpolationTypeOperation setStackPosition(Integer value) { this.StackPosition = value; return this; }
        public String getComments() { return Comments; }
        public InterpolationTypeOperation setComments(String value) { this.Comments = value; return this; }
    }

    public static class MethodOperation extends Method implements IStackPositionMetadataOperation
    {
        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        /**
        * Operation type
        */
        @ApiMember(DataType="string", Description="Operation type")
        public MetadataChangeOperationType OperationType = null;

        /**
        * Stack position
        */
        @ApiMember(DataType="integer", Description="Stack position", Format="int32")
        public Integer StackPosition = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;
        
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public MethodOperation setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public MethodOperation setUser(String value) { this.User = value; return this; }
        public MetadataChangeOperationType getOperationType() { return OperationType; }
        public MethodOperation setOperationType(MetadataChangeOperationType value) { this.OperationType = value; return this; }
        public Integer getStackPosition() { return StackPosition; }
        public MethodOperation setStackPosition(Integer value) { this.StackPosition = value; return this; }
        public String getComments() { return Comments; }
        public MethodOperation setComments(String value) { this.Comments = value; return this; }
    }

    public static class NoteOperation extends Note implements IMetadataChangeOperation
    {
        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        /**
        * Operation type
        */
        @ApiMember(DataType="string", Description="Operation type")
        public MetadataChangeOperationType OperationType = null;
        
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public NoteOperation setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public NoteOperation setUser(String value) { this.User = value; return this; }
        public MetadataChangeOperationType getOperationType() { return OperationType; }
        public NoteOperation setOperationType(MetadataChangeOperationType value) { this.OperationType = value; return this; }
    }

    public static class QualifierOperation extends TimeRange implements IMetadataChangeOperation
    {
        /**
        * Identifier
        */
        @ApiMember(Description="Identifier")
        public String Identifier = null;

        /**
        * Operation type
        */
        @ApiMember(DataType="string", Description="Operation type")
        public MetadataChangeOperationType OperationType = null;

        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;
        
        public String getIdentifier() { return Identifier; }
        public QualifierOperation setIdentifier(String value) { this.Identifier = value; return this; }
        public MetadataChangeOperationType getOperationType() { return OperationType; }
        public QualifierOperation setOperationType(MetadataChangeOperationType value) { this.OperationType = value; return this; }
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public QualifierOperation setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public QualifierOperation setUser(String value) { this.User = value; return this; }
    }

    public static class CorrectionOperation extends TimeRange implements IStackPositionMetadataOperation
    {
        /**
        * Type
        */
        @ApiMember(DataType="string", Description="Type")
        public CorrectionType Type = null;

        public HashMap<String,Object> Parameters = null;
        /**
        * Processing order
        */
        @ApiMember(DataType="CorrectionProcessingOrder", Description="Processing order")
        public CorrectionProcessingOrder ProcessingOrder = null;

        /**
        * Instant applied utc
        */
        @ApiMember(DataType="string", Description="Instant applied utc", Format="date-time")
        public Instant DateAppliedUtc = null;

        /**
        * User
        */
        @ApiMember(Description="User")
        public String User = null;

        /**
        * Operation type
        */
        @ApiMember(DataType="string", Description="Operation type")
        public MetadataChangeOperationType OperationType = null;

        /**
        * Stack position
        */
        @ApiMember(DataType="integer", Description="Stack position", Format="int32")
        public Integer StackPosition = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;
        
        public CorrectionType getType() { return Type; }
        public CorrectionOperation setType(CorrectionType value) { this.Type = value; return this; }
        public HashMap<String,Object> getParameters() { return Parameters; }
        public CorrectionOperation setParameters(HashMap<String,Object> value) { this.Parameters = value; return this; }
        public CorrectionProcessingOrder getProcessingOrder() { return ProcessingOrder; }
        public CorrectionOperation setProcessingOrder(CorrectionProcessingOrder value) { this.ProcessingOrder = value; return this; }
        public Instant getDateAppliedUtc() { return DateAppliedUtc; }
        public CorrectionOperation setDateAppliedUtc(Instant value) { this.DateAppliedUtc = value; return this; }
        public String getUser() { return User; }
        public CorrectionOperation setUser(String value) { this.User = value; return this; }
        public MetadataChangeOperationType getOperationType() { return OperationType; }
        public CorrectionOperation setOperationType(MetadataChangeOperationType value) { this.OperationType = value; return this; }
        public Integer getStackPosition() { return StackPosition; }
        public CorrectionOperation setStackPosition(Integer value) { this.StackPosition = value; return this; }
        public String getComments() { return Comments; }
        public CorrectionOperation setComments(String value) { this.Comments = value; return this; }
    }

    public static enum TagValueType
    {
        Unknown,
        None,
        PickList,
        String,
        Number,
        Boolean;
    }

    public static class DischargeSummary
    {
        /**
        * Measurement start time
        */
        @ApiMember(DataType="string", Description="Measurement start time", Format="date-time")
        public Instant MeasurementStartTime = null;

        /**
        * Measurement end time
        */
        @ApiMember(DataType="string", Description="Measurement end time", Format="date-time")
        public Instant MeasurementEndTime = null;

        /**
        * Measurement time
        */
        @ApiMember(DataType="string", Description="Measurement time", Format="date-time")
        public Instant MeasurementTime = null;

        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Base flow
        */
        @ApiMember(DataType="string", Description="Base flow")
        public BaseFlowType BaseFlow = null;

        /**
        * Adjustment
        */
        @ApiMember(DataType="Adjustment", Description="Adjustment")
        public Adjustment Adjustment = null;

        /**
        * Alternate rating discharge
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Alternate rating discharge")
        public QuantityWithDisplay AlternateRatingDischarge = null;

        /**
        * Discharge
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Discharge")
        public QuantityWithDisplay Discharge = null;

        /**
        * Discharge method
        */
        @ApiMember(Description="Discharge method")
        public String DischargeMethod = null;

        /**
        * Mean gage height
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Mean gage height")
        public QuantityWithDisplay MeanGageHeight = null;

        /**
        * Gage height adjustment amount
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Gage height adjustment amount")
        public QuantityWithDisplay GageHeightAdjustmentAmount = null;

        /**
        * True if the mean gage height was converted to the target datum
        */
        @ApiMember(DataType="boolean", Description="True if the mean gage height was converted to the target datum")
        public Boolean MeanGageHeightWasDatumConverted = null;

        /**
        * Mean gage height method
        */
        @ApiMember(Description="Mean gage height method")
        public String MeanGageHeightMethod = null;

        /**
        * Mean index velocity
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Mean index velocity")
        public QuantityWithDisplay MeanIndexVelocity = null;

        /**
        * Discharge measurement reason
        */
        @ApiMember(DataType="string", Description="Discharge measurement reason")
        public DischargeMeasurementReasonType DischargeMeasurementReason = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Gage height comments
        */
        @ApiMember(Description="Gage height comments")
        public String GageHeightComments = null;

        /**
        * Gage height calculation
        */
        @ApiMember(DataType="string", Description="Gage height calculation")
        public GageHeightCalculationType GageHeightCalculation = null;

        /**
        * Gage height readings
        */
        @ApiMember(DataType="array", Description="Gage height readings")
        public ArrayList<GageHeightReading> GageHeightReadings = null;

        /**
        * Difference during visit
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Difference during visit")
        public DoubleWithDisplay DifferenceDuringVisit = null;

        /**
        * Duration in hours
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Duration in hours")
        public DoubleWithDisplay DurationInHours = null;

        /**
        * Quality Assurance Comments
        */
        @ApiMember(Description="Quality Assurance Comments")
        public String QualityAssuranceComments = null;

        /**
        * Discharge Uncertainty
        */
        @ApiMember(DataType="DischargeUncertainty", Description="Discharge Uncertainty")
        public DischargeUncertainty DischargeUncertainty = null;

        /**
        * DEPRECATED: Use DischargeUncertainty.QualitativeUncertainty instead.
        */
        @ApiMember(DataType="string", Description="DEPRECATED: Use DischargeUncertainty.QualitativeUncertainty instead.")
        public MeasurementGradeType MeasurementGrade = null;

        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", Format="int32")
        public Integer GradeCode = null;

        /**
        * Measurement id
        */
        @ApiMember(Description="Measurement id")
        public String MeasurementId = null;

        /**
        * Reviewer
        */
        @ApiMember(Description="Reviewer")
        public String Reviewer = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;
        
        public Instant getMeasurementStartTime() { return MeasurementStartTime; }
        public DischargeSummary setMeasurementStartTime(Instant value) { this.MeasurementStartTime = value; return this; }
        public Instant getMeasurementEndTime() { return MeasurementEndTime; }
        public DischargeSummary setMeasurementEndTime(Instant value) { this.MeasurementEndTime = value; return this; }
        public Instant getMeasurementTime() { return MeasurementTime; }
        public DischargeSummary setMeasurementTime(Instant value) { this.MeasurementTime = value; return this; }
        public String getParty() { return Party; }
        public DischargeSummary setParty(String value) { this.Party = value; return this; }
        public BaseFlowType getBaseFlow() { return BaseFlow; }
        public DischargeSummary setBaseFlow(BaseFlowType value) { this.BaseFlow = value; return this; }
        public Adjustment getAdjustment() { return Adjustment; }
        public DischargeSummary setAdjustment(Adjustment value) { this.Adjustment = value; return this; }
        public QuantityWithDisplay getAlternateRatingDischarge() { return AlternateRatingDischarge; }
        public DischargeSummary setAlternateRatingDischarge(QuantityWithDisplay value) { this.AlternateRatingDischarge = value; return this; }
        public QuantityWithDisplay getDischarge() { return Discharge; }
        public DischargeSummary setDischarge(QuantityWithDisplay value) { this.Discharge = value; return this; }
        public String getDischargeMethod() { return DischargeMethod; }
        public DischargeSummary setDischargeMethod(String value) { this.DischargeMethod = value; return this; }
        public QuantityWithDisplay getMeanGageHeight() { return MeanGageHeight; }
        public DischargeSummary setMeanGageHeight(QuantityWithDisplay value) { this.MeanGageHeight = value; return this; }
        public QuantityWithDisplay getGageHeightAdjustmentAmount() { return GageHeightAdjustmentAmount; }
        public DischargeSummary setGageHeightAdjustmentAmount(QuantityWithDisplay value) { this.GageHeightAdjustmentAmount = value; return this; }
        public Boolean isMeanGageHeightWasDatumConverted() { return MeanGageHeightWasDatumConverted; }
        public DischargeSummary setMeanGageHeightWasDatumConverted(Boolean value) { this.MeanGageHeightWasDatumConverted = value; return this; }
        public String getMeanGageHeightMethod() { return MeanGageHeightMethod; }
        public DischargeSummary setMeanGageHeightMethod(String value) { this.MeanGageHeightMethod = value; return this; }
        public QuantityWithDisplay getMeanIndexVelocity() { return MeanIndexVelocity; }
        public DischargeSummary setMeanIndexVelocity(QuantityWithDisplay value) { this.MeanIndexVelocity = value; return this; }
        public DischargeMeasurementReasonType getDischargeMeasurementReason() { return DischargeMeasurementReason; }
        public DischargeSummary setDischargeMeasurementReason(DischargeMeasurementReasonType value) { this.DischargeMeasurementReason = value; return this; }
        public String getComments() { return Comments; }
        public DischargeSummary setComments(String value) { this.Comments = value; return this; }
        public String getGageHeightComments() { return GageHeightComments; }
        public DischargeSummary setGageHeightComments(String value) { this.GageHeightComments = value; return this; }
        public GageHeightCalculationType getGageHeightCalculation() { return GageHeightCalculation; }
        public DischargeSummary setGageHeightCalculation(GageHeightCalculationType value) { this.GageHeightCalculation = value; return this; }
        public ArrayList<GageHeightReading> getGageHeightReadings() { return GageHeightReadings; }
        public DischargeSummary setGageHeightReadings(ArrayList<GageHeightReading> value) { this.GageHeightReadings = value; return this; }
        public DoubleWithDisplay getDifferenceDuringVisit() { return DifferenceDuringVisit; }
        public DischargeSummary setDifferenceDuringVisit(DoubleWithDisplay value) { this.DifferenceDuringVisit = value; return this; }
        public DoubleWithDisplay getDurationInHours() { return DurationInHours; }
        public DischargeSummary setDurationInHours(DoubleWithDisplay value) { this.DurationInHours = value; return this; }
        public String getQualityAssuranceComments() { return QualityAssuranceComments; }
        public DischargeSummary setQualityAssuranceComments(String value) { this.QualityAssuranceComments = value; return this; }
        public DischargeUncertainty getDischargeUncertainty() { return DischargeUncertainty; }
        public DischargeSummary setDischargeUncertainty(DischargeUncertainty value) { this.DischargeUncertainty = value; return this; }
        public MeasurementGradeType getMeasurementGrade() { return MeasurementGrade; }
        public DischargeSummary setMeasurementGrade(MeasurementGradeType value) { this.MeasurementGrade = value; return this; }
        public Integer getGradeCode() { return GradeCode; }
        public DischargeSummary setGradeCode(Integer value) { this.GradeCode = value; return this; }
        public String getMeasurementId() { return MeasurementId; }
        public DischargeSummary setMeasurementId(String value) { this.MeasurementId = value; return this; }
        public String getReviewer() { return Reviewer; }
        public DischargeSummary setReviewer(String value) { this.Reviewer = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public DischargeSummary setIsValid(Boolean value) { this.IsValid = value; return this; }
        public Boolean isPublish() { return Publish; }
        public DischargeSummary setPublish(Boolean value) { this.Publish = value; return this; }
    }

    public static class VolumetricDischargeActivity
    {
        /**
        * Discharge channel measurement
        */
        @ApiMember(DataType="DischargeChannelMeasurement", Description="Discharge channel measurement")
        public DischargeChannelMeasurement DischargeChannelMeasurement = null;

        /**
        * Volumetric discharge readings
        */
        @ApiMember(DataType="array", Description="Volumetric discharge readings")
        public ArrayList<VolumetricDischargeReading> VolumetricDischargeReadings = null;

        /**
        * Measurement container volume
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Measurement container volume")
        public QuantityWithDisplay MeasurementContainerVolume = null;

        /**
        * Is observed
        */
        @ApiMember(DataType="boolean", Description="Is observed")
        public Boolean IsObserved = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;
        
        public DischargeChannelMeasurement getDischargeChannelMeasurement() { return DischargeChannelMeasurement; }
        public VolumetricDischargeActivity setDischargeChannelMeasurement(DischargeChannelMeasurement value) { this.DischargeChannelMeasurement = value; return this; }
        public ArrayList<VolumetricDischargeReading> getVolumetricDischargeReadings() { return VolumetricDischargeReadings; }
        public VolumetricDischargeActivity setVolumetricDischargeReadings(ArrayList<VolumetricDischargeReading> value) { this.VolumetricDischargeReadings = value; return this; }
        public QuantityWithDisplay getMeasurementContainerVolume() { return MeasurementContainerVolume; }
        public VolumetricDischargeActivity setMeasurementContainerVolume(QuantityWithDisplay value) { this.MeasurementContainerVolume = value; return this; }
        public Boolean getIsObserved() { return IsObserved; }
        public VolumetricDischargeActivity setIsObserved(Boolean value) { this.IsObserved = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public VolumetricDischargeActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
    }

    public static class EngineeredStructureDischargeActivity
    {
        /**
        * Discharge channel measurement
        */
        @ApiMember(DataType="DischargeChannelMeasurement", Description="Discharge channel measurement")
        public DischargeChannelMeasurement DischargeChannelMeasurement = null;

        /**
        * Structure type
        */
        @ApiMember(Description="Structure type")
        public String StructureType = null;

        /**
        * Equation for selected structure
        */
        @ApiMember(Description="Equation for selected structure")
        public String EquationForSelectedStructure = null;

        /**
        * Mean head
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Mean head")
        public QuantityWithDisplay MeanHead = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;
        
        public DischargeChannelMeasurement getDischargeChannelMeasurement() { return DischargeChannelMeasurement; }
        public EngineeredStructureDischargeActivity setDischargeChannelMeasurement(DischargeChannelMeasurement value) { this.DischargeChannelMeasurement = value; return this; }
        public String getStructureType() { return StructureType; }
        public EngineeredStructureDischargeActivity setStructureType(String value) { this.StructureType = value; return this; }
        public String getEquationForSelectedStructure() { return EquationForSelectedStructure; }
        public EngineeredStructureDischargeActivity setEquationForSelectedStructure(String value) { this.EquationForSelectedStructure = value; return this; }
        public QuantityWithDisplay getMeanHead() { return MeanHead; }
        public EngineeredStructureDischargeActivity setMeanHead(QuantityWithDisplay value) { this.MeanHead = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public EngineeredStructureDischargeActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
    }

    public static class PointVelocityDischargeActivity
    {
        /**
        * Discharge channel measurement
        */
        @ApiMember(DataType="DischargeChannelMeasurement", Description="Discharge channel measurement")
        public DischargeChannelMeasurement DischargeChannelMeasurement = null;

        /**
        * Distance to meter
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Distance to meter")
        public QuantityWithDisplay DistanceToMeter = null;

        /**
        * Width
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Width")
        public QuantityWithDisplay Width = null;

        /**
        * Area
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Area")
        public QuantityWithDisplay Area = null;

        /**
        * Velocity average
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Velocity average")
        public QuantityWithDisplay VelocityAverage = null;

        /**
        * Mean observation duration in seconds
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Mean observation duration in seconds")
        public DoubleWithDisplay MeanObservationDurationInSeconds = null;

        /**
        * Suspension coefficient used
        */
        @ApiMember(DataType="boolean", Description="Suspension coefficient used")
        public Boolean SuspensionCoefficientUsed = null;

        /**
        * Method coefficient used
        */
        @ApiMember(DataType="boolean", Description="Method coefficient used")
        public Boolean MethodCoefficientUsed = null;

        /**
        * Horizontal coefficient used
        */
        @ApiMember(DataType="boolean", Description="Horizontal coefficient used")
        public Boolean HorizontalCoefficientUsed = null;

        /**
        * Meter inspected before
        */
        @ApiMember(DataType="boolean", Description="Meter inspected before")
        public Boolean MeterInspectedBefore = null;

        /**
        * Meter inspected after
        */
        @ApiMember(DataType="boolean", Description="Meter inspected after")
        public Boolean MeterInspectedAfter = null;

        /**
        * Number of panels
        */
        @ApiMember(DataType="integer", Description="Number of panels", Format="int32")
        public Integer NumberOfPanels = null;

        /**
        * Meter equation
        */
        @ApiMember(Description="Meter equation")
        public String MeterEquation = null;

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
        * Serial number
        */
        @ApiMember(Description="Serial number")
        public String SerialNumber = null;

        /**
        * Discharge method
        */
        @ApiMember(DataType="string", Description="Discharge method")
        public DischargeMethodType DischargeMethod = null;

        /**
        * Suspension weight
        */
        @ApiMember(Description="Suspension weight")
        public String SuspensionWeight = null;

        /**
        * Velocity observation method
        */
        @ApiMember(Description="Velocity observation method")
        public String VelocityObservationMethod = null;

        /**
        * Firmware version
        */
        @ApiMember(Description="Firmware version")
        public String FirmwareVersion = null;

        /**
        * Software version
        */
        @ApiMember(Description="Software version")
        public String SoftwareVersion = null;

        /**
        * Starting point
        */
        @ApiMember(DataType="string", Description="Starting point")
        public StartPointType StartPoint = null;

        /**
        * Node details
        */
        @ApiMember(Description="Node details")
        public String NodeDetails = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;

        /**
        * Verticals
        */
        @ApiMember(DataType="array", Description="Verticals")
        public ArrayList<Vertical> Verticals = null;
        
        public DischargeChannelMeasurement getDischargeChannelMeasurement() { return DischargeChannelMeasurement; }
        public PointVelocityDischargeActivity setDischargeChannelMeasurement(DischargeChannelMeasurement value) { this.DischargeChannelMeasurement = value; return this; }
        public QuantityWithDisplay getDistanceToMeter() { return DistanceToMeter; }
        public PointVelocityDischargeActivity setDistanceToMeter(QuantityWithDisplay value) { this.DistanceToMeter = value; return this; }
        public QuantityWithDisplay getWidth() { return Width; }
        public PointVelocityDischargeActivity setWidth(QuantityWithDisplay value) { this.Width = value; return this; }
        public QuantityWithDisplay getArea() { return Area; }
        public PointVelocityDischargeActivity setArea(QuantityWithDisplay value) { this.Area = value; return this; }
        public QuantityWithDisplay getVelocityAverage() { return VelocityAverage; }
        public PointVelocityDischargeActivity setVelocityAverage(QuantityWithDisplay value) { this.VelocityAverage = value; return this; }
        public DoubleWithDisplay getMeanObservationDurationInSeconds() { return MeanObservationDurationInSeconds; }
        public PointVelocityDischargeActivity setMeanObservationDurationInSeconds(DoubleWithDisplay value) { this.MeanObservationDurationInSeconds = value; return this; }
        public Boolean isSuspensionCoefficientUsed() { return SuspensionCoefficientUsed; }
        public PointVelocityDischargeActivity setSuspensionCoefficientUsed(Boolean value) { this.SuspensionCoefficientUsed = value; return this; }
        public Boolean isMethodCoefficientUsed() { return MethodCoefficientUsed; }
        public PointVelocityDischargeActivity setMethodCoefficientUsed(Boolean value) { this.MethodCoefficientUsed = value; return this; }
        public Boolean isHorizontalCoefficientUsed() { return HorizontalCoefficientUsed; }
        public PointVelocityDischargeActivity setHorizontalCoefficientUsed(Boolean value) { this.HorizontalCoefficientUsed = value; return this; }
        public Boolean isMeterInspectedBefore() { return MeterInspectedBefore; }
        public PointVelocityDischargeActivity setMeterInspectedBefore(Boolean value) { this.MeterInspectedBefore = value; return this; }
        public Boolean isMeterInspectedAfter() { return MeterInspectedAfter; }
        public PointVelocityDischargeActivity setMeterInspectedAfter(Boolean value) { this.MeterInspectedAfter = value; return this; }
        public Integer getNumberOfPanels() { return NumberOfPanels; }
        public PointVelocityDischargeActivity setNumberOfPanels(Integer value) { this.NumberOfPanels = value; return this; }
        public String getMeterEquation() { return MeterEquation; }
        public PointVelocityDischargeActivity setMeterEquation(String value) { this.MeterEquation = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public PointVelocityDischargeActivity setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public PointVelocityDischargeActivity setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public PointVelocityDischargeActivity setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public DischargeMethodType getDischargeMethod() { return DischargeMethod; }
        public PointVelocityDischargeActivity setDischargeMethod(DischargeMethodType value) { this.DischargeMethod = value; return this; }
        public String getSuspensionWeight() { return SuspensionWeight; }
        public PointVelocityDischargeActivity setSuspensionWeight(String value) { this.SuspensionWeight = value; return this; }
        public String getVelocityObservationMethod() { return VelocityObservationMethod; }
        public PointVelocityDischargeActivity setVelocityObservationMethod(String value) { this.VelocityObservationMethod = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public PointVelocityDischargeActivity setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getSoftwareVersion() { return SoftwareVersion; }
        public PointVelocityDischargeActivity setSoftwareVersion(String value) { this.SoftwareVersion = value; return this; }
        public StartPointType getStartPoint() { return StartPoint; }
        public PointVelocityDischargeActivity setStartPoint(StartPointType value) { this.StartPoint = value; return this; }
        public String getNodeDetails() { return NodeDetails; }
        public PointVelocityDischargeActivity setNodeDetails(String value) { this.NodeDetails = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public PointVelocityDischargeActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
        public ArrayList<Vertical> getVerticals() { return Verticals; }
        public PointVelocityDischargeActivity setVerticals(ArrayList<Vertical> value) { this.Verticals = value; return this; }
    }

    public static class OtherMethodDischargeActivity
    {
        /**
        * Discharge channel measurement
        */
        @ApiMember(DataType="DischargeChannelMeasurement", Description="Discharge channel measurement")
        public DischargeChannelMeasurement DischargeChannelMeasurement = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;
        
        public DischargeChannelMeasurement getDischargeChannelMeasurement() { return DischargeChannelMeasurement; }
        public OtherMethodDischargeActivity setDischargeChannelMeasurement(DischargeChannelMeasurement value) { this.DischargeChannelMeasurement = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public OtherMethodDischargeActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
    }

    public static class AdcpDischargeActivity
    {
        /**
        * Discharge channel measurement
        */
        @ApiMember(DataType="DischargeChannelMeasurement", Description="Discharge channel measurement")
        public DischargeChannelMeasurement DischargeChannelMeasurement = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;

        /**
        * Number of transects
        */
        @ApiMember(DataType="integer", Description="Number of transects", Format="int32")
        public Integer NumberOfTransects = null;

        /**
        * Magnetic variation
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Magnetic variation")
        public DoubleWithDisplay MagneticVariation = null;

        /**
        * Discharge coefficient variation
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Discharge coefficient variation")
        public DoubleWithDisplay DischargeCoefficientVariation = null;

        /**
        * Percent of discharge measured
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Percent of discharge measured")
        public DoubleWithDisplay PercentOfDischargeMeasured = null;

        /**
        * Top estimate exponent
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Top estimate exponent")
        public DoubleWithDisplay TopEstimateExponent = null;

        /**
        * Bottom estimate exponent
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Bottom estimate exponent")
        public DoubleWithDisplay BottomEstimateExponent = null;

        /**
        * Width
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Width")
        public QuantityWithDisplay Width = null;

        /**
        * Area
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Area")
        public QuantityWithDisplay Area = null;

        /**
        * Velocity average
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Velocity average")
        public QuantityWithDisplay VelocityAverage = null;

        /**
        * Transducer depth
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Transducer depth")
        public QuantityWithDisplay TransducerDepth = null;

        /**
        * Adcp device type
        */
        @ApiMember(Description="Adcp device type")
        public String AdcpDeviceType = null;

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
        * Serial number
        */
        @ApiMember(Description="Serial number")
        public String SerialNumber = null;

        /**
        * Navigation method
        */
        @ApiMember(Description="Navigation method")
        public String NavigationMethod = null;

        /**
        * Firmware version
        */
        @ApiMember(Description="Firmware version")
        public String FirmwareVersion = null;

        /**
        * Software version
        */
        @ApiMember(Description="Software version")
        public String SoftwareVersion = null;

        /**
        * Top estimate method
        */
        @ApiMember(Description="Top estimate method")
        public String TopEstimateMethod = null;

        /**
        * Bottom estimate method
        */
        @ApiMember(Description="Bottom estimate method")
        public String BottomEstimateMethod = null;

        /**
        * Depth reference
        */
        @ApiMember(Description="Depth reference")
        public String DepthReference = null;

        /**
        * Node details
        */
        @ApiMember(Description="Node details")
        public String NodeDetails = null;
        
        public DischargeChannelMeasurement getDischargeChannelMeasurement() { return DischargeChannelMeasurement; }
        public AdcpDischargeActivity setDischargeChannelMeasurement(DischargeChannelMeasurement value) { this.DischargeChannelMeasurement = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public AdcpDischargeActivity setIsValid(Boolean value) { this.IsValid = value; return this; }
        public Integer getNumberOfTransects() { return NumberOfTransects; }
        public AdcpDischargeActivity setNumberOfTransects(Integer value) { this.NumberOfTransects = value; return this; }
        public DoubleWithDisplay getMagneticVariation() { return MagneticVariation; }
        public AdcpDischargeActivity setMagneticVariation(DoubleWithDisplay value) { this.MagneticVariation = value; return this; }
        public DoubleWithDisplay getDischargeCoefficientVariation() { return DischargeCoefficientVariation; }
        public AdcpDischargeActivity setDischargeCoefficientVariation(DoubleWithDisplay value) { this.DischargeCoefficientVariation = value; return this; }
        public DoubleWithDisplay getPercentOfDischargeMeasured() { return PercentOfDischargeMeasured; }
        public AdcpDischargeActivity setPercentOfDischargeMeasured(DoubleWithDisplay value) { this.PercentOfDischargeMeasured = value; return this; }
        public DoubleWithDisplay getTopEstimateExponent() { return TopEstimateExponent; }
        public AdcpDischargeActivity setTopEstimateExponent(DoubleWithDisplay value) { this.TopEstimateExponent = value; return this; }
        public DoubleWithDisplay getBottomEstimateExponent() { return BottomEstimateExponent; }
        public AdcpDischargeActivity setBottomEstimateExponent(DoubleWithDisplay value) { this.BottomEstimateExponent = value; return this; }
        public QuantityWithDisplay getWidth() { return Width; }
        public AdcpDischargeActivity setWidth(QuantityWithDisplay value) { this.Width = value; return this; }
        public QuantityWithDisplay getArea() { return Area; }
        public AdcpDischargeActivity setArea(QuantityWithDisplay value) { this.Area = value; return this; }
        public QuantityWithDisplay getVelocityAverage() { return VelocityAverage; }
        public AdcpDischargeActivity setVelocityAverage(QuantityWithDisplay value) { this.VelocityAverage = value; return this; }
        public QuantityWithDisplay getTransducerDepth() { return TransducerDepth; }
        public AdcpDischargeActivity setTransducerDepth(QuantityWithDisplay value) { this.TransducerDepth = value; return this; }
        public String getAdcpDeviceType() { return AdcpDeviceType; }
        public AdcpDischargeActivity setAdcpDeviceType(String value) { this.AdcpDeviceType = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public AdcpDischargeActivity setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public AdcpDischargeActivity setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public AdcpDischargeActivity setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public String getNavigationMethod() { return NavigationMethod; }
        public AdcpDischargeActivity setNavigationMethod(String value) { this.NavigationMethod = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public AdcpDischargeActivity setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getSoftwareVersion() { return SoftwareVersion; }
        public AdcpDischargeActivity setSoftwareVersion(String value) { this.SoftwareVersion = value; return this; }
        public String getTopEstimateMethod() { return TopEstimateMethod; }
        public AdcpDischargeActivity setTopEstimateMethod(String value) { this.TopEstimateMethod = value; return this; }
        public String getBottomEstimateMethod() { return BottomEstimateMethod; }
        public AdcpDischargeActivity setBottomEstimateMethod(String value) { this.BottomEstimateMethod = value; return this; }
        public String getDepthReference() { return DepthReference; }
        public AdcpDischargeActivity setDepthReference(String value) { this.DepthReference = value; return this; }
        public String getNodeDetails() { return NodeDetails; }
        public AdcpDischargeActivity setNodeDetails(String value) { this.NodeDetails = value; return this; }
    }

    public static class GageHeightAtZeroFlowCalculatedDetails
    {
        /**
        * Stage
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Stage")
        public DoubleWithDisplay Stage = null;

        /**
        * Depth
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Depth")
        public DoubleWithDisplay Depth = null;

        /**
        * Depth certainty
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Depth certainty")
        public DoubleWithDisplay DepthCertainty = null;
        
        public DoubleWithDisplay getStage() { return Stage; }
        public GageHeightAtZeroFlowCalculatedDetails setStage(DoubleWithDisplay value) { this.Stage = value; return this; }
        public DoubleWithDisplay getDepth() { return Depth; }
        public GageHeightAtZeroFlowCalculatedDetails setDepth(DoubleWithDisplay value) { this.Depth = value; return this; }
        public DoubleWithDisplay getDepthCertainty() { return DepthCertainty; }
        public GageHeightAtZeroFlowCalculatedDetails setDepthCertainty(DoubleWithDisplay value) { this.DepthCertainty = value; return this; }
    }

    public static enum ControlCleanedType
    {
        Unknown,
        Unspecified,
        ControlCleaned,
        ControlNotCleaned;
    }

    public static class QuantityWithDisplay extends DoubleWithDisplay
    {
        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;
        
        public String getUnit() { return Unit; }
        public QuantityWithDisplay setUnit(String value) { this.Unit = value; return this; }
    }

    public static class Reading
    {
        /**
        * Parameter Name
        */
        @ApiMember(Description="Parameter Name")
        public String Parameter = null;

        /**
        * Parameter Id
        */
        @ApiMember(Description="Parameter Id")
        public String ParameterId = null;

        /**
        * Monitoring method
        */
        @ApiMember(Description="Monitoring method")
        public String MonitoringMethod = null;

        /**
        * Value
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Value")
        public DoubleWithDisplay Value = null;

        /**
        * AdjustmentAmount
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="AdjustmentAmount")
        public DoubleWithDisplay AdjustmentAmount = null;

        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;

        /**
        * Uncertainty
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Uncertainty")
        public DoubleWithDisplay Uncertainty = null;

        /**
        * Reading type
        */
        @ApiMember(DataType="string", Description="Reading type")
        public ReadingType ReadingType = null;

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
        * Serial number
        */
        @ApiMember(Description="Serial number")
        public String SerialNumber = null;

        /**
        * Time
        */
        @ApiMember(DataType="string", Description="Time", Format="date-time")
        public Instant Time = null;

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
        * Node details
        */
        @ApiMember(Description="Node details")
        public String NodeDetails = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;

        /**
        * Reference point unique ID
        */
        @ApiMember(DataType="string", Description="Reference point unique ID", Format="guid")
        public String ReferencePointUniqueId = null;

        /**
        * Indicates if this reading is measured against the local assumed datum of the reading's location
        */
        @ApiMember(DataType="boolean", Description="Indicates if this reading is measured against the local assumed datum of the reading's location")
        public Boolean UseLocationDatumAsReference = null;

        /**
        * Reading Qualifier
        */
        @ApiMember(Description="Reading Qualifier")
        public String ReadingQualifier = null;

        /**
        * Reading Qualifiers
        */
        @ApiMember(DataType="array", Description="Reading Qualifiers")
        public ArrayList<String> ReadingQualifiers = null;

        /**
        * Groundwater measurements
        */
        @ApiMember(DataType="GroundWaterMeasurement", Description="Groundwater measurements")
        public GroundWaterMeasurement GroundWaterMeasurement = null;

        /**
        * Sensor unique ID
        */
        @ApiMember(DataType="string", Description="Sensor unique ID", Format="guid")
        public String SensorUniqueId = null;

        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code", Format="int32")
        public Integer GradeCode = null;
        
        public String getParameter() { return Parameter; }
        public Reading setParameter(String value) { this.Parameter = value; return this; }
        public String getParameterId() { return ParameterId; }
        public Reading setParameterId(String value) { this.ParameterId = value; return this; }
        public String getMonitoringMethod() { return MonitoringMethod; }
        public Reading setMonitoringMethod(String value) { this.MonitoringMethod = value; return this; }
        public DoubleWithDisplay getValue() { return Value; }
        public Reading setValue(DoubleWithDisplay value) { this.Value = value; return this; }
        public DoubleWithDisplay getAdjustmentAmount() { return AdjustmentAmount; }
        public Reading setAdjustmentAmount(DoubleWithDisplay value) { this.AdjustmentAmount = value; return this; }
        public String getUnit() { return Unit; }
        public Reading setUnit(String value) { this.Unit = value; return this; }
        public DoubleWithDisplay getUncertainty() { return Uncertainty; }
        public Reading setUncertainty(DoubleWithDisplay value) { this.Uncertainty = value; return this; }
        public ReadingType getReadingType() { return ReadingType; }
        public Reading setReadingType(ReadingType value) { this.ReadingType = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public Reading setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public Reading setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public Reading setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public Instant getTime() { return Time; }
        public Reading setTime(Instant value) { this.Time = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public Reading setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public String getComments() { return Comments; }
        public Reading setComments(String value) { this.Comments = value; return this; }
        public String getNodeDetails() { return NodeDetails; }
        public Reading setNodeDetails(String value) { this.NodeDetails = value; return this; }
        public Boolean isPublish() { return Publish; }
        public Reading setPublish(Boolean value) { this.Publish = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public Reading setIsValid(Boolean value) { this.IsValid = value; return this; }
        public String getReferencePointUniqueId() { return ReferencePointUniqueId; }
        public Reading setReferencePointUniqueId(String value) { this.ReferencePointUniqueId = value; return this; }
        public Boolean isUseLocationDatumAsReference() { return UseLocationDatumAsReference; }
        public Reading setUseLocationDatumAsReference(Boolean value) { this.UseLocationDatumAsReference = value; return this; }
        public String getReadingQualifier() { return ReadingQualifier; }
        public Reading setReadingQualifier(String value) { this.ReadingQualifier = value; return this; }
        public ArrayList<String> getReadingQualifiers() { return ReadingQualifiers; }
        public Reading setReadingQualifiers(ArrayList<String> value) { this.ReadingQualifiers = value; return this; }
        public GroundWaterMeasurement getGroundWaterMeasurement() { return GroundWaterMeasurement; }
        public Reading setGroundWaterMeasurement(GroundWaterMeasurement value) { this.GroundWaterMeasurement = value; return this; }
        public String getSensorUniqueId() { return SensorUniqueId; }
        public Reading setSensorUniqueId(String value) { this.SensorUniqueId = value; return this; }
        public Integer getGradeCode() { return GradeCode; }
        public Reading setGradeCode(Integer value) { this.GradeCode = value; return this; }
    }

    public static class CalibrationCheck
    {
        /**
        * Parameter Name
        */
        @ApiMember(Description="Parameter Name")
        public String Parameter = null;

        /**
        * Parameter Id
        */
        @ApiMember(Description="Parameter Id")
        public String ParameterId = null;

        /**
        * Standard
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Standard")
        public DoubleWithDisplay Standard = null;

        /**
        * Standard details
        */
        @ApiMember(DataType="StandardDetails", Description="Standard details")
        public StandardDetails StandardDetails = null;

        /**
        * Monitoring method
        */
        @ApiMember(Description="Monitoring method")
        public String MonitoringMethod = null;

        /**
        * Value
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Value")
        public DoubleWithDisplay Value = null;

        /**
        * Difference
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Difference")
        public DoubleWithDisplay Difference = null;

        /**
        * Percent difference
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Percent difference")
        public DoubleWithDisplay PercentDifference = null;

        /**
        * Unit
        */
        @ApiMember(Description="Unit")
        public String Unit = null;

        /**
        * Calibration check type
        */
        @ApiMember(DataType="string", Description="Calibration check type")
        public CalibrationCheckType CalibrationCheckType = null;

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
        * Serial number
        */
        @ApiMember(Description="Serial number")
        public String SerialNumber = null;

        /**
        * Time
        */
        @ApiMember(DataType="string", Description="Time", Format="date-time")
        public Instant Time = null;

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
        * Node details
        */
        @ApiMember(Description="Node details")
        public String NodeDetails = null;

        /**
        * Publish
        */
        @ApiMember(DataType="boolean", Description="Publish")
        public Boolean Publish = null;

        /**
        * Is valid
        */
        @ApiMember(DataType="boolean", Description="Is valid")
        public Boolean IsValid = null;

        /**
        * Sensor unique ID
        */
        @ApiMember(DataType="string", Description="Sensor unique ID", Format="guid")
        public String SensorUniqueId = null;
        
        public String getParameter() { return Parameter; }
        public CalibrationCheck setParameter(String value) { this.Parameter = value; return this; }
        public String getParameterId() { return ParameterId; }
        public CalibrationCheck setParameterId(String value) { this.ParameterId = value; return this; }
        public DoubleWithDisplay getStandard() { return Standard; }
        public CalibrationCheck setStandard(DoubleWithDisplay value) { this.Standard = value; return this; }
        public StandardDetails getStandardDetails() { return StandardDetails; }
        public CalibrationCheck setStandardDetails(StandardDetails value) { this.StandardDetails = value; return this; }
        public String getMonitoringMethod() { return MonitoringMethod; }
        public CalibrationCheck setMonitoringMethod(String value) { this.MonitoringMethod = value; return this; }
        public DoubleWithDisplay getValue() { return Value; }
        public CalibrationCheck setValue(DoubleWithDisplay value) { this.Value = value; return this; }
        public DoubleWithDisplay getDifference() { return Difference; }
        public CalibrationCheck setDifference(DoubleWithDisplay value) { this.Difference = value; return this; }
        public DoubleWithDisplay getPercentDifference() { return PercentDifference; }
        public CalibrationCheck setPercentDifference(DoubleWithDisplay value) { this.PercentDifference = value; return this; }
        public String getUnit() { return Unit; }
        public CalibrationCheck setUnit(String value) { this.Unit = value; return this; }
        public CalibrationCheckType getCalibrationCheckType() { return CalibrationCheckType; }
        public CalibrationCheck setCalibrationCheckType(CalibrationCheckType value) { this.CalibrationCheckType = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public CalibrationCheck setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public CalibrationCheck setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public CalibrationCheck setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public Instant getTime() { return Time; }
        public CalibrationCheck setTime(Instant value) { this.Time = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public CalibrationCheck setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public String getComments() { return Comments; }
        public CalibrationCheck setComments(String value) { this.Comments = value; return this; }
        public String getNodeDetails() { return NodeDetails; }
        public CalibrationCheck setNodeDetails(String value) { this.NodeDetails = value; return this; }
        public Boolean isPublish() { return Publish; }
        public CalibrationCheck setPublish(Boolean value) { this.Publish = value; return this; }
        public Boolean getIsValid() { return IsValid; }
        public CalibrationCheck setIsValid(Boolean value) { this.IsValid = value; return this; }
        public String getSensorUniqueId() { return SensorUniqueId; }
        public CalibrationCheck setSensorUniqueId(String value) { this.SensorUniqueId = value; return this; }
    }

    public static class Inspection
    {
        /**
        * Inspection type
        */
        @ApiMember(DataType="string", Description="Inspection type")
        public InspectionType InspectionType = null;

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
        * Serial number
        */
        @ApiMember(Description="Serial number")
        public String SerialNumber = null;

        /**
        * Time
        */
        @ApiMember(DataType="string", Description="Time", Format="date-time")
        public Instant Time = null;

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
        
        public InspectionType getInspectionType() { return InspectionType; }
        public Inspection setInspectionType(InspectionType value) { this.InspectionType = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public Inspection setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public Inspection setModel(String value) { this.Model = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public Inspection setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public Instant getTime() { return Time; }
        public Inspection setTime(Instant value) { this.Time = value; return this; }
        public String getSubLocationIdentifier() { return SubLocationIdentifier; }
        public Inspection setSubLocationIdentifier(String value) { this.SubLocationIdentifier = value; return this; }
        public String getComments() { return Comments; }
        public Inspection setComments(String value) { this.Comments = value; return this; }
    }

    public static enum StartPointType
    {
        Unknown,
        Unspecified,
        LeftEdgeOfWater,
        RightEdgeOfWater;
    }

    public static class CrossSectionPoint
    {
        /**
        * Point order
        */
        @ApiMember(DataType="integer", Description="Point order", Format="int32")
        public Integer PointOrder = null;

        /**
        * Distance
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Distance")
        public QuantityWithDisplay Distance = null;

        /**
        * Elevation
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Elevation")
        public QuantityWithDisplay Elevation = null;

        /**
        * Depth
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Depth")
        public QuantityWithDisplay Depth = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;
        
        public Integer getPointOrder() { return PointOrder; }
        public CrossSectionPoint setPointOrder(Integer value) { this.PointOrder = value; return this; }
        public QuantityWithDisplay getDistance() { return Distance; }
        public CrossSectionPoint setDistance(QuantityWithDisplay value) { this.Distance = value; return this; }
        public QuantityWithDisplay getElevation() { return Elevation; }
        public CrossSectionPoint setElevation(QuantityWithDisplay value) { this.Elevation = value; return this; }
        public QuantityWithDisplay getDepth() { return Depth; }
        public CrossSectionPoint setDepth(QuantityWithDisplay value) { this.Depth = value; return this; }
        public String getComments() { return Comments; }
        public CrossSectionPoint setComments(String value) { this.Comments = value; return this; }
    }

    public static class LevelSurveyMeasurement
    {
        /**
        * Measured reference point unique ID
        */
        @ApiMember(DataType="string", Description="Measured reference point unique ID", Format="guid")
        public String ReferencePointUniqueId = null;

        /**
        * Measured elevation
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Measured elevation")
        public QuantityWithDisplay MeasuredElevation = null;

        /**
        * Measurement time
        */
        @ApiMember(DataType="string", Description="Measurement time", Format="date-time")
        public Instant MeasurementTime = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;
        
        public String getReferencePointUniqueId() { return ReferencePointUniqueId; }
        public LevelSurveyMeasurement setReferencePointUniqueId(String value) { this.ReferencePointUniqueId = value; return this; }
        public QuantityWithDisplay getMeasuredElevation() { return MeasuredElevation; }
        public LevelSurveyMeasurement setMeasuredElevation(QuantityWithDisplay value) { this.MeasuredElevation = value; return this; }
        public Instant getMeasurementTime() { return MeasurementTime; }
        public LevelSurveyMeasurement setMeasurementTime(Instant value) { this.MeasurementTime = value; return this; }
        public String getComments() { return Comments; }
        public LevelSurveyMeasurement setComments(String value) { this.Comments = value; return this; }
    }

    public static enum MeterType
    {
        Unknown,
        Unspecified,
        SidewaysLookingAdvm,
        UpwardLookingAdvm,
        Estimated,
        Adcp,
        Adv,
        ElectromagneticVelocityMeter,
        IceVaneMeter,
        PolymerCupAaMeter,
        PolymerCupPygmyMeter,
        OpticalCurrent,
        HorizontalShaft,
        PriceAa,
        Pygmy,
        Radar,
        TimeOfTravel,
        Nwis48TransferredVelocity,
        UltrasonicMeter;
    }

    public static class ActiveMeterCalibration
    {
        /**
        * Visit date
        */
        @ApiMember(DataType="string", Description="Visit date", Format="date-time")
        public Instant FirstUsedDate = null;

        /**
        * Equations
        */
        @ApiMember(DataType="array", Description="Equations")
        public ArrayList<ActiveMeterCalibrationEquation> Equations = null;
        
        public Instant getFirstUsedDate() { return FirstUsedDate; }
        public ActiveMeterCalibration setFirstUsedDate(Instant value) { this.FirstUsedDate = value; return this; }
        public ArrayList<ActiveMeterCalibrationEquation> getEquations() { return Equations; }
        public ActiveMeterCalibration setEquations(ArrayList<ActiveMeterCalibrationEquation> value) { this.Equations = value; return this; }
    }

    public static class CurrentMeter
    {
        /**
        * Serial number
        */
        @ApiMember(Description="Serial number")
        public String SerialNumber = null;

        /**
        * Model
        */
        @ApiMember(Description="Model")
        public String Model = null;

        /**
        * Manufacturer
        */
        @ApiMember(Description="Manufacturer")
        public String Manufacturer = null;
        
        public String getSerialNumber() { return SerialNumber; }
        public CurrentMeter setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public String getModel() { return Model; }
        public CurrentMeter setModel(String value) { this.Model = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public CurrentMeter setManufacturer(String value) { this.Manufacturer = value; return this; }
    }

    public static class Uncertainty
    {
        /**
        * Uncertainty Type in use
        */
        @ApiMember(DataType="string", Description="Uncertainty Type in use")
        public UncertaintyType UncertaintyType = null;

        /**
        * Quantitative (Type A) Uncertainty
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Quantitative (Type A) Uncertainty")
        public DoubleWithDisplay QuantitativeUncertainty = null;

        /**
        * Qualitative (Type B) Uncertainty
        */
        @ApiMember(DataType="string", Description="Qualitative (Type B) Uncertainty")
        public QualitativeUncertaintyType QualitativeUncertainty = null;
        
        public UncertaintyType getUncertaintyType() { return UncertaintyType; }
        public Uncertainty setUncertaintyType(UncertaintyType value) { this.UncertaintyType = value; return this; }
        public DoubleWithDisplay getQuantitativeUncertainty() { return QuantitativeUncertainty; }
        public Uncertainty setQuantitativeUncertainty(DoubleWithDisplay value) { this.QuantitativeUncertainty = value; return this; }
        public QualitativeUncertaintyType getQualitativeUncertainty() { return QualitativeUncertainty; }
        public Uncertainty setQualitativeUncertainty(QualitativeUncertaintyType value) { this.QualitativeUncertainty = value; return this; }
    }

    public static class DatumConvertedQuantityWithDisplay extends QuantityWithDisplay
    {
        /**
        * Target reference datum
        */
        @ApiMember(Description="Target reference datum")
        public String TargetDatum = null;
        
        public String getTargetDatum() { return TargetDatum; }
        public DatumConvertedQuantityWithDisplay setTargetDatum(String value) { this.TargetDatum = value; return this; }
    }

    public static enum FieldVisitReadingType
    {
        Unknown,
        RoutineBefore,
        Routine,
        RoutineAfter,
        ResetBefore,
        ResetAfter,
        CleaningBefore,
        CleaningAfter,
        AfterCalibration,
        ReferencePrimary,
        Reference,
        MeanGageHeight,
        ExtremeMin,
        ExtremeMax,
        Discharge,
        MeanIndexVelocity;
    }

    public static class ReferenceStandardOffset
    {
        /**
        * Standard
        */
        @ApiMember(Description="Standard")
        public String Standard = null;

        /**
        * Offset to reference standard
        */
        @ApiMember(DataType="number", Description="Offset to reference standard", Format="double")
        public Double OffsetToReferenceStandard = null;

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
        @ApiMember(DataType="number", Description="Uncertainty", Format="double")
        public Double Uncertainty = null;
        
        public String getStandard() { return Standard; }
        public ReferenceStandardOffset setStandard(String value) { this.Standard = value; return this; }
        public Double getOffsetToReferenceStandard() { return OffsetToReferenceStandard; }
        public ReferenceStandardOffset setOffsetToReferenceStandard(Double value) { this.OffsetToReferenceStandard = value; return this; }
        public String getComments() { return Comments; }
        public ReferenceStandardOffset setComments(String value) { this.Comments = value; return this; }
        public String getMethod() { return Method; }
        public ReferenceStandardOffset setMethod(String value) { this.Method = value; return this; }
        public Double getUncertainty() { return Uncertainty; }
        public ReferenceStandardOffset setUncertainty(Double value) { this.Uncertainty = value; return this; }
    }

    public static enum MeasurementDirection
    {
        Unknown,
        FromTopToBottom,
        FromBottomToTop;
    }

    public static class RatingShiftPoint
    {
        /**
        * Input value
        */
        @ApiMember(DataType="number", Description="Input value", Format="double")
        public Double InputValue = null;

        /**
        * Shift
        */
        @ApiMember(DataType="number", Description="Shift", Format="double")
        public Double Shift = null;
        
        public Double getInputValue() { return InputValue; }
        public RatingShiftPoint setInputValue(Double value) { this.InputValue = value; return this; }
        public Double getShift() { return Shift; }
        public RatingShiftPoint setShift(Double value) { this.Shift = value; return this; }
    }

    public static enum ThresholdType
    {
        Unknown,
        ThresholdAbove,
        ThresholdBelow,
        None;
    }

    public static class TimeSeriesThresholdPeriod
    {
        /**
        * Start time
        */
        @ApiMember(DataType="string", Description="Start time", Format="date-time")
        public Instant StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="string", Description="End time", Format="date-time")
        public Instant EndTime = null;

        /**
        * Applied time
        */
        @ApiMember(DataType="string", Description="Applied time", Format="date-time")
        public Instant AppliedTime = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Reference value
        */
        @ApiMember(DataType="number", Description="Reference value", Format="double")
        public Double ReferenceValue = null;

        /**
        * Secondary reference value
        */
        @ApiMember(DataType="number", Description="Secondary reference value", Format="double")
        public Double SecondaryReferenceValue = null;

        /**
        * Suppress data
        */
        @ApiMember(DataType="boolean", Description="Suppress data")
        public Boolean SuppressData = null;
        
        public Instant getStartTime() { return StartTime; }
        public TimeSeriesThresholdPeriod setStartTime(Instant value) { this.StartTime = value; return this; }
        public Instant getEndTime() { return EndTime; }
        public TimeSeriesThresholdPeriod setEndTime(Instant value) { this.EndTime = value; return this; }
        public Instant getAppliedTime() { return AppliedTime; }
        public TimeSeriesThresholdPeriod setAppliedTime(Instant value) { this.AppliedTime = value; return this; }
        public String getComments() { return Comments; }
        public TimeSeriesThresholdPeriod setComments(String value) { this.Comments = value; return this; }
        public Double getReferenceValue() { return ReferenceValue; }
        public TimeSeriesThresholdPeriod setReferenceValue(Double value) { this.ReferenceValue = value; return this; }
        public Double getSecondaryReferenceValue() { return SecondaryReferenceValue; }
        public TimeSeriesThresholdPeriod setSecondaryReferenceValue(Double value) { this.SecondaryReferenceValue = value; return this; }
        public Boolean isSuppressData() { return SuppressData; }
        public TimeSeriesThresholdPeriod setSuppressData(Boolean value) { this.SuppressData = value; return this; }
    }

    public static enum MetadataChangeOperationType
    {
        Creation,
        Deletion;
    }

    public static interface IStackPositionMetadataOperation extends IMetadataChangeOperation
    {
        public Integer StackPosition = null;
        public String Comments = null;
    }

    public static interface IMetadataChangeOperation
    {
        public Instant DateAppliedUtc = null;
        public String User = null;
        public MetadataChangeOperationType OperationType = null;
    }

    public static enum BaseFlowType
    {
        Unknown,
        Unspecified,
        BaseFlow,
        NonBaseFlow;
    }

    public static class Adjustment
    {
        /**
        * Adjustment amount
        */
        @ApiMember(DataType="number", Description="Adjustment amount", Format="double")
        public Double AdjustmentAmount = null;

        /**
        * Adjustment type
        */
        @ApiMember(DataType="string", Description="Adjustment type")
        public AdjustmentType AdjustmentType = null;

        /**
        * Reason for adjustment
        */
        @ApiMember(DataType="string", Description="Reason for adjustment")
        public ReasonForAdjustmentType ReasonForAdjustment = null;
        
        public Double getAdjustmentAmount() { return AdjustmentAmount; }
        public Adjustment setAdjustmentAmount(Double value) { this.AdjustmentAmount = value; return this; }
        public AdjustmentType getAdjustmentType() { return AdjustmentType; }
        public Adjustment setAdjustmentType(AdjustmentType value) { this.AdjustmentType = value; return this; }
        public ReasonForAdjustmentType getReasonForAdjustment() { return ReasonForAdjustment; }
        public Adjustment setReasonForAdjustment(ReasonForAdjustmentType value) { this.ReasonForAdjustment = value; return this; }
    }

    public static enum DischargeMeasurementReasonType
    {
        Unknown,
        Routine,
        Check;
    }

    public static enum GageHeightCalculationType
    {
        Unknown,
        ManuallyCalculated,
        SimpleAverage;
    }

    public static class GageHeightReading
    {
        /**
        * Is used
        */
        @ApiMember(DataType="boolean", Description="Is used")
        public Boolean IsUsed = null;

        /**
        * Reading time
        */
        @ApiMember(DataType="string", Description="Reading time", Format="date-time")
        public Instant ReadingTime = null;

        /**
        * Gage height
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Gage height")
        public DoubleWithDisplay GageHeight = null;
        
        public Boolean getIsUsed() { return IsUsed; }
        public GageHeightReading setIsUsed(Boolean value) { this.IsUsed = value; return this; }
        public Instant getReadingTime() { return ReadingTime; }
        public GageHeightReading setReadingTime(Instant value) { this.ReadingTime = value; return this; }
        public DoubleWithDisplay getGageHeight() { return GageHeight; }
        public GageHeightReading setGageHeight(DoubleWithDisplay value) { this.GageHeight = value; return this; }
    }

    public static class DischargeUncertainty
    {
        /**
        * Active Uncertainty Type in use
        */
        @ApiMember(DataType="string", Description="Active Uncertainty Type in use")
        public UncertaintyType ActiveUncertaintyType = null;

        /**
        * Quantitative (Type A) Uncertainty
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Quantitative (Type A) Uncertainty")
        public DoubleWithDisplay QuantitativeUncertainty = null;

        /**
        * Qualitative (Type B) Uncertainty
        */
        @ApiMember(DataType="string", Description="Qualitative (Type B) Uncertainty")
        public QualitativeUncertaintyType QualitativeUncertainty = null;
        
        public UncertaintyType getActiveUncertaintyType() { return ActiveUncertaintyType; }
        public DischargeUncertainty setActiveUncertaintyType(UncertaintyType value) { this.ActiveUncertaintyType = value; return this; }
        public DoubleWithDisplay getQuantitativeUncertainty() { return QuantitativeUncertainty; }
        public DischargeUncertainty setQuantitativeUncertainty(DoubleWithDisplay value) { this.QuantitativeUncertainty = value; return this; }
        public QualitativeUncertaintyType getQualitativeUncertainty() { return QualitativeUncertainty; }
        public DischargeUncertainty setQualitativeUncertainty(QualitativeUncertaintyType value) { this.QualitativeUncertainty = value; return this; }
    }

    public static enum MeasurementGradeType
    {
        Unknown,
        Unspecified,
        Excellent,
        Good,
        Fair,
        Poor;
    }

    public static class DischargeChannelMeasurement
    {
        /**
        * Channel
        */
        @ApiMember(Description="Channel")
        public String Channel = null;

        /**
        * Start time
        */
        @ApiMember(DataType="string", Description="Start time", Format="date-time")
        public Instant StartTime = null;

        /**
        * End time
        */
        @ApiMember(DataType="string", Description="End time", Format="date-time")
        public Instant EndTime = null;

        /**
        * Discharge
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Discharge")
        public QuantityWithDisplay Discharge = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Party
        */
        @ApiMember(Description="Party")
        public String Party = null;

        /**
        * Distance to gage
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Distance to gage")
        public QuantityWithDisplay DistanceToGage = null;

        /**
        * Horizontal flow
        */
        @ApiMember(DataType="string", Description="Horizontal flow")
        public HorizontalFlowType HorizontalFlow = null;

        /**
        * Channel stability
        */
        @ApiMember(DataType="string", Description="Channel stability")
        public ChannelStabilityType ChannelStability = null;

        /**
        * Channel material
        */
        @ApiMember(DataType="string", Description="Channel material")
        public ChannelMaterialType ChannelMaterial = null;

        /**
        * Channel evenness
        */
        @ApiMember(DataType="string", Description="Channel evenness")
        public ChannelEvennessType ChannelEvenness = null;

        /**
        * Vertical velocity distribution
        */
        @ApiMember(DataType="string", Description="Vertical velocity distribution")
        public VerticalVelocityDistributionType VerticalVelocityDistribution = null;

        /**
        * Velocity variation
        */
        @ApiMember(DataType="string", Description="Velocity variation")
        public VelocityVariationType VelocityVariation = null;

        /**
        * Measurement location to gage
        */
        @ApiMember(DataType="string", Description="Measurement location to gage")
        public MeasurementLocationToGageType MeasurementLocationToGage = null;

        /**
        * Meter suspension
        */
        @ApiMember(DataType="string", Description="Meter suspension")
        public MeterSuspensionType MeterSuspension = null;

        /**
        * Deployment method
        */
        @ApiMember(DataType="string", Description="Deployment method")
        public DeploymentMethodType DeploymentMethod = null;

        /**
        * Current meter
        */
        @ApiMember(DataType="string", Description="Current meter")
        public CurrentMeterType CurrentMeter = null;

        /**
        * Monitoring method
        */
        @ApiMember(Description="Monitoring method")
        public String MonitoringMethod = null;
        
        public String getChannel() { return Channel; }
        public DischargeChannelMeasurement setChannel(String value) { this.Channel = value; return this; }
        public Instant getStartTime() { return StartTime; }
        public DischargeChannelMeasurement setStartTime(Instant value) { this.StartTime = value; return this; }
        public Instant getEndTime() { return EndTime; }
        public DischargeChannelMeasurement setEndTime(Instant value) { this.EndTime = value; return this; }
        public QuantityWithDisplay getDischarge() { return Discharge; }
        public DischargeChannelMeasurement setDischarge(QuantityWithDisplay value) { this.Discharge = value; return this; }
        public String getComments() { return Comments; }
        public DischargeChannelMeasurement setComments(String value) { this.Comments = value; return this; }
        public String getParty() { return Party; }
        public DischargeChannelMeasurement setParty(String value) { this.Party = value; return this; }
        public QuantityWithDisplay getDistanceToGage() { return DistanceToGage; }
        public DischargeChannelMeasurement setDistanceToGage(QuantityWithDisplay value) { this.DistanceToGage = value; return this; }
        public HorizontalFlowType getHorizontalFlow() { return HorizontalFlow; }
        public DischargeChannelMeasurement setHorizontalFlow(HorizontalFlowType value) { this.HorizontalFlow = value; return this; }
        public ChannelStabilityType getChannelStability() { return ChannelStability; }
        public DischargeChannelMeasurement setChannelStability(ChannelStabilityType value) { this.ChannelStability = value; return this; }
        public ChannelMaterialType getChannelMaterial() { return ChannelMaterial; }
        public DischargeChannelMeasurement setChannelMaterial(ChannelMaterialType value) { this.ChannelMaterial = value; return this; }
        public ChannelEvennessType getChannelEvenness() { return ChannelEvenness; }
        public DischargeChannelMeasurement setChannelEvenness(ChannelEvennessType value) { this.ChannelEvenness = value; return this; }
        public VerticalVelocityDistributionType getVerticalVelocityDistribution() { return VerticalVelocityDistribution; }
        public DischargeChannelMeasurement setVerticalVelocityDistribution(VerticalVelocityDistributionType value) { this.VerticalVelocityDistribution = value; return this; }
        public VelocityVariationType getVelocityVariation() { return VelocityVariation; }
        public DischargeChannelMeasurement setVelocityVariation(VelocityVariationType value) { this.VelocityVariation = value; return this; }
        public MeasurementLocationToGageType getMeasurementLocationToGage() { return MeasurementLocationToGage; }
        public DischargeChannelMeasurement setMeasurementLocationToGage(MeasurementLocationToGageType value) { this.MeasurementLocationToGage = value; return this; }
        public MeterSuspensionType getMeterSuspension() { return MeterSuspension; }
        public DischargeChannelMeasurement setMeterSuspension(MeterSuspensionType value) { this.MeterSuspension = value; return this; }
        public DeploymentMethodType getDeploymentMethod() { return DeploymentMethod; }
        public DischargeChannelMeasurement setDeploymentMethod(DeploymentMethodType value) { this.DeploymentMethod = value; return this; }
        public CurrentMeterType getCurrentMeter() { return CurrentMeter; }
        public DischargeChannelMeasurement setCurrentMeter(CurrentMeterType value) { this.CurrentMeter = value; return this; }
        public String getMonitoringMethod() { return MonitoringMethod; }
        public DischargeChannelMeasurement setMonitoringMethod(String value) { this.MonitoringMethod = value; return this; }
    }

    public static class VolumetricDischargeReading
    {
        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Duration in seconds
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Duration in seconds")
        public DoubleWithDisplay DurationInSeconds = null;

        /**
        * Starting volume
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Starting volume")
        public DoubleWithDisplay StartingVolume = null;

        /**
        * Ending volume
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Ending volume")
        public DoubleWithDisplay EndingVolume = null;

        /**
        * Discharge
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Discharge")
        public DoubleWithDisplay Discharge = null;

        /**
        * Is used
        */
        @ApiMember(DataType="boolean", Description="Is used")
        public Boolean IsUsed = null;

        /**
        * Volume change
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Volume change")
        public DoubleWithDisplay VolumeChange = null;
        
        public String getName() { return Name; }
        public VolumetricDischargeReading setName(String value) { this.Name = value; return this; }
        public DoubleWithDisplay getDurationInSeconds() { return DurationInSeconds; }
        public VolumetricDischargeReading setDurationInSeconds(DoubleWithDisplay value) { this.DurationInSeconds = value; return this; }
        public DoubleWithDisplay getStartingVolume() { return StartingVolume; }
        public VolumetricDischargeReading setStartingVolume(DoubleWithDisplay value) { this.StartingVolume = value; return this; }
        public DoubleWithDisplay getEndingVolume() { return EndingVolume; }
        public VolumetricDischargeReading setEndingVolume(DoubleWithDisplay value) { this.EndingVolume = value; return this; }
        public DoubleWithDisplay getDischarge() { return Discharge; }
        public VolumetricDischargeReading setDischarge(DoubleWithDisplay value) { this.Discharge = value; return this; }
        public Boolean getIsUsed() { return IsUsed; }
        public VolumetricDischargeReading setIsUsed(Boolean value) { this.IsUsed = value; return this; }
        public DoubleWithDisplay getVolumeChange() { return VolumeChange; }
        public VolumetricDischargeReading setVolumeChange(DoubleWithDisplay value) { this.VolumeChange = value; return this; }
    }

    public static enum DischargeMethodType
    {
        Unknown,
        MidSection,
        MeanSection;
    }

    public static class Vertical
    {
        /**
        * Vertical number
        */
        @ApiMember(DataType="number", Description="Vertical number", Format="double")
        public Double VerticalNumber = null;

        /**
        * Tagline position
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Tagline position")
        public QuantityWithDisplay TaglinePosition = null;

        /**
        * Effective depth
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Effective depth")
        public QuantityWithDisplay EffectiveDepth = null;

        /**
        * Velocity method
        */
        @ApiMember(DataType="string", Description="Velocity method")
        public PointVelocityObservationType VelocityObservationMethod = null;

        /**
        * Mean velocity
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Mean velocity")
        public QuantityWithDisplay MeanVelocity = null;

        /**
        * Segment width
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Segment width")
        public QuantityWithDisplay SegmentWidth = null;

        /**
        * Segment velocity
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Segment velocity")
        public QuantityWithDisplay SegmentVelocity = null;

        /**
        * Segment area
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Segment area")
        public QuantityWithDisplay SegmentArea = null;

        /**
        * Is discharge estimated
        */
        @ApiMember(DataType="boolean", Description="Is discharge estimated")
        public Boolean IsDischargeEstimated = null;

        /**
        * Segment discharge
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Segment discharge")
        public QuantityWithDisplay SegmentDischarge = null;

        /**
        * Percentage of total discharge
        */
        @ApiMember(DataType="number", Description="Percentage of total discharge", Format="double")
        public Double PercentageOfTotalDischarge = null;

        /**
        * Vertical type
        */
        @ApiMember(DataType="string", Description="Vertical type")
        public VerticalType VerticalType = null;

        /**
        * Measurement condition
        */
        @ApiMember(DataType="string", Description="Measurement condition")
        public MeasurementCondition MeasurementCondition = null;

        /**
        * Ice covered data
        */
        @ApiMember(DataType="string", Description="Ice covered data")
        public IceCoveredData IceCoveredData = null;

        /**
        * Open water data
        */
        @ApiMember(DataType="string", Description="Open water data")
        public OpenWaterData OpenWaterData = null;

        /**
        * Flow direction type
        */
        @ApiMember(DataType="string", Description="Flow direction type")
        public FlowDirectionType FlowDirection = null;

        /**
        * Measurement time
        */
        @ApiMember(DataType="string", Description="Measurement time", Format="date-time")
        public Instant MeasurementTime = null;

        /**
        * Is Sounded Depth estimated
        */
        @ApiMember(DataType="boolean", Description="Is Sounded Depth estimated")
        public Boolean IsSoundedDepthEstimated = null;

        /**
        * Sounded depth
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Sounded depth")
        public QuantityWithDisplay SoundedDepth = null;

        /**
        * Cosine of unique flow
        */
        @ApiMember(DataType="number", Description="Cosine of unique flow", Format="double")
        public Double CosineOfUniqueFlow = null;

        /**
        * Comments
        */
        @ApiMember(Description="Comments")
        public String Comments = null;

        /**
        * Velocity observation
        */
        @ApiMember(DataType="string", Description="Velocity observation")
        public VelocityObservation VelocityObservation = null;

        /**
        * Current Meter
        */
        @ApiMember(DataType="string", Description="Current Meter")
        public CurrentMeter CurrentMeter = null;

        /**
        * Calibration
        */
        @ApiMember(DataType="array", Description="Calibration")
        public ArrayList<Calibration> Calibrations = null;
        
        public Double getVerticalNumber() { return VerticalNumber; }
        public Vertical setVerticalNumber(Double value) { this.VerticalNumber = value; return this; }
        public QuantityWithDisplay getTaglinePosition() { return TaglinePosition; }
        public Vertical setTaglinePosition(QuantityWithDisplay value) { this.TaglinePosition = value; return this; }
        public QuantityWithDisplay getEffectiveDepth() { return EffectiveDepth; }
        public Vertical setEffectiveDepth(QuantityWithDisplay value) { this.EffectiveDepth = value; return this; }
        public PointVelocityObservationType getVelocityObservationMethod() { return VelocityObservationMethod; }
        public Vertical setVelocityObservationMethod(PointVelocityObservationType value) { this.VelocityObservationMethod = value; return this; }
        public QuantityWithDisplay getMeanVelocity() { return MeanVelocity; }
        public Vertical setMeanVelocity(QuantityWithDisplay value) { this.MeanVelocity = value; return this; }
        public QuantityWithDisplay getSegmentWidth() { return SegmentWidth; }
        public Vertical setSegmentWidth(QuantityWithDisplay value) { this.SegmentWidth = value; return this; }
        public QuantityWithDisplay getSegmentVelocity() { return SegmentVelocity; }
        public Vertical setSegmentVelocity(QuantityWithDisplay value) { this.SegmentVelocity = value; return this; }
        public QuantityWithDisplay getSegmentArea() { return SegmentArea; }
        public Vertical setSegmentArea(QuantityWithDisplay value) { this.SegmentArea = value; return this; }
        public Boolean getIsDischargeEstimated() { return IsDischargeEstimated; }
        public Vertical setIsDischargeEstimated(Boolean value) { this.IsDischargeEstimated = value; return this; }
        public QuantityWithDisplay getSegmentDischarge() { return SegmentDischarge; }
        public Vertical setSegmentDischarge(QuantityWithDisplay value) { this.SegmentDischarge = value; return this; }
        public Double getPercentageOfTotalDischarge() { return PercentageOfTotalDischarge; }
        public Vertical setPercentageOfTotalDischarge(Double value) { this.PercentageOfTotalDischarge = value; return this; }
        public VerticalType getVerticalType() { return VerticalType; }
        public Vertical setVerticalType(VerticalType value) { this.VerticalType = value; return this; }
        public MeasurementCondition getMeasurementCondition() { return MeasurementCondition; }
        public Vertical setMeasurementCondition(MeasurementCondition value) { this.MeasurementCondition = value; return this; }
        public IceCoveredData getIceCoveredData() { return IceCoveredData; }
        public Vertical setIceCoveredData(IceCoveredData value) { this.IceCoveredData = value; return this; }
        public OpenWaterData getOpenWaterData() { return OpenWaterData; }
        public Vertical setOpenWaterData(OpenWaterData value) { this.OpenWaterData = value; return this; }
        public FlowDirectionType getFlowDirection() { return FlowDirection; }
        public Vertical setFlowDirection(FlowDirectionType value) { this.FlowDirection = value; return this; }
        public Instant getMeasurementTime() { return MeasurementTime; }
        public Vertical setMeasurementTime(Instant value) { this.MeasurementTime = value; return this; }
        public Boolean getIsSoundedDepthEstimated() { return IsSoundedDepthEstimated; }
        public Vertical setIsSoundedDepthEstimated(Boolean value) { this.IsSoundedDepthEstimated = value; return this; }
        public QuantityWithDisplay getSoundedDepth() { return SoundedDepth; }
        public Vertical setSoundedDepth(QuantityWithDisplay value) { this.SoundedDepth = value; return this; }
        public Double getCosineOfUniqueFlow() { return CosineOfUniqueFlow; }
        public Vertical setCosineOfUniqueFlow(Double value) { this.CosineOfUniqueFlow = value; return this; }
        public String getComments() { return Comments; }
        public Vertical setComments(String value) { this.Comments = value; return this; }
        public VelocityObservation getVelocityObservation() { return VelocityObservation; }
        public Vertical setVelocityObservation(VelocityObservation value) { this.VelocityObservation = value; return this; }
        public CurrentMeter getCurrentMeter() { return CurrentMeter; }
        public Vertical setCurrentMeter(CurrentMeter value) { this.CurrentMeter = value; return this; }
        public ArrayList<Calibration> getCalibrations() { return Calibrations; }
        public Vertical setCalibrations(ArrayList<Calibration> value) { this.Calibrations = value; return this; }
    }

    public static enum ReadingType
    {
        Unknown,
        RoutineBefore,
        Routine,
        RoutineAfter,
        ResetBefore,
        ResetAfter,
        CleaningBefore,
        CleaningAfter,
        AfterCalibration,
        ReferencePrimary,
        Reference,
        ExtremeMin,
        ExtremeMax;
    }

    public static class GroundWaterMeasurement
    {
        /**
        * Cut
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Cut")
        public DoubleWithDisplay Cut = null;

        /**
        * Hold
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Hold")
        public DoubleWithDisplay Hold = null;

        /**
        * Tape correction
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Tape correction")
        public DoubleWithDisplay TapeCorrection = null;

        /**
        * Water level
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Water level")
        public DoubleWithDisplay WaterLevel = null;
        
        public DoubleWithDisplay getCut() { return Cut; }
        public GroundWaterMeasurement setCut(DoubleWithDisplay value) { this.Cut = value; return this; }
        public DoubleWithDisplay getHold() { return Hold; }
        public GroundWaterMeasurement setHold(DoubleWithDisplay value) { this.Hold = value; return this; }
        public DoubleWithDisplay getTapeCorrection() { return TapeCorrection; }
        public GroundWaterMeasurement setTapeCorrection(DoubleWithDisplay value) { this.TapeCorrection = value; return this; }
        public DoubleWithDisplay getWaterLevel() { return WaterLevel; }
        public GroundWaterMeasurement setWaterLevel(DoubleWithDisplay value) { this.WaterLevel = value; return this; }
    }

    public static class StandardDetails
    {
        /**
        * Standard code
        */
        @ApiMember(Description="Standard code")
        public String StandardCode = null;

        /**
        * Lot number
        */
        @ApiMember(Description="Lot number")
        public String LotNumber = null;

        /**
        * Temperature
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Temperature")
        public DoubleWithDisplay Temperature = null;

        /**
        * Expiration date
        */
        @ApiMember(DataType="string", Description="Expiration date", Format="date-time")
        public Instant ExpirationDate = null;
        
        public String getStandardCode() { return StandardCode; }
        public StandardDetails setStandardCode(String value) { this.StandardCode = value; return this; }
        public String getLotNumber() { return LotNumber; }
        public StandardDetails setLotNumber(String value) { this.LotNumber = value; return this; }
        public DoubleWithDisplay getTemperature() { return Temperature; }
        public StandardDetails setTemperature(DoubleWithDisplay value) { this.Temperature = value; return this; }
        public Instant getExpirationDate() { return ExpirationDate; }
        public StandardDetails setExpirationDate(Instant value) { this.ExpirationDate = value; return this; }
    }

    public static enum CalibrationCheckType
    {
        Unknown,
        PreCalibration,
        Calibration,
        PostCalibration,
        CheckbarAsFound,
        CheckbarAsChanged;
    }

    public static class ActiveMeterCalibrationEquation extends Calibration
    {
        
    }

    public static enum UncertaintyType
    {
        None,
        Quantitative,
        Qualitative;
    }

    public static enum QualitativeUncertaintyType
    {
        Unknown,
        Unspecified,
        Excellent,
        Good,
        Fair,
        Poor;
    }

    public static enum AdjustmentType
    {
        Unknown,
        Percentage,
        Amount;
    }

    public static enum ReasonForAdjustmentType
    {
        Unknown,
        Unspecified,
        Measured,
        AdjustedForStorage,
        AdjustedForOtherFlows,
        MainChannelFlowOnly,
        AdjustedForTidalEffect,
        AdjustedForOtherFactors;
    }

    public static enum HorizontalFlowType
    {
        Unknown,
        Unspecified,
        Even,
        Uneven;
    }

    public static enum ChannelStabilityType
    {
        Unknown,
        Unspecified,
        Soft,
        Firm;
    }

    public static enum ChannelMaterialType
    {
        Unknown,
        Unspecified,
        SiltMud,
        Sand,
        Gravel,
        Cobbles,
        CobblesBoulders,
        BedrockLedgeArtificial;
    }

    public static enum ChannelEvennessType
    {
        Unknown,
        Unspecified,
        Even,
        Uneven;
    }

    public static enum VerticalVelocityDistributionType
    {
        Unknown,
        Unspecified,
        Uniform,
        Standard,
        NonStandard;
    }

    public static enum VelocityVariationType
    {
        Unknown,
        Unspecified,
        Steady,
        Pulsating;
    }

    public static enum MeasurementLocationToGageType
    {
        Unknown,
        Unspecified,
        AtTheGage,
        Upstream,
        Downstream;
    }

    public static enum MeterSuspensionType
    {
        Unknown,
        Unspecified,
        TopSettingWadingRod,
        RoundRod,
        PackReel,
        AReel,
        BReel,
        EReel,
        Handline,
        RigidBoatMount,
        TetheredBoat,
        IceSurfaceMount;
    }

    public static enum DeploymentMethodType
    {
        Unknown,
        Unspecified,
        Wading,
        BridgeUpstreamSide,
        BridgeDownstreamSide,
        Cableway,
        Ice,
        MannedMovingBoat,
        StationaryBoat,
        RemoteControlledBoat,
        Other,
        Boat,
        BridgeCrane;
    }

    public static enum CurrentMeterType
    {
        Unknown,
        Unspecified,
        SidewaysLookingAdvm,
        UpwardLookingAdvm,
        Estimated,
        Adcp,
        Adv,
        ElectromagneticVelocityMeter,
        IceVaneMeter,
        PolymerCupAaMeter,
        PolymerCupPygmyMeter,
        OpticalCurrent,
        HorizontalShaft,
        PriceAa,
        Pygmy,
        Radar,
        TimeOfTravel,
        Nwis48TransferredVelocity,
        UltrasonicMeter;
    }

    public static enum PointVelocityObservationType
    {
        Unknown,
        OneAtPointFive,
        OneAtPointSix,
        OneAtPointTwoAndPointEight,
        OneAtPointTwoPointSixAndPointEight,
        FivePoint,
        SixPoint,
        ElevenPoint,
        Surface;
    }

    public static enum VerticalType
    {
        Unknown,
        MidRiver,
        StartEdgeNoWaterBefore,
        EndEdgeNoWaterAfter;
    }

    public static enum MeasurementCondition
    {
        Unknown,
        OpenWater,
        IceCovered;
    }

    public static class IceCoveredData
    {
        /**
        * Ice thickness
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Ice thickness")
        public QuantityWithDisplay IceThickness = null;

        /**
        * Water surface to bottom of slush
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Water surface to bottom of slush")
        public QuantityWithDisplay WaterSurfaceToBottomOfSlush = null;

        /**
        * Water surface to bottom of ice
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Water surface to bottom of ice")
        public QuantityWithDisplay WaterSurfaceToBottomOfIce = null;

        /**
        * Ice assembly type
        */
        @ApiMember(Description="Ice assembly type")
        public String IceAssemblyType = null;

        /**
        * Above footing
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Above footing")
        public QuantityWithDisplay AboveFooting = null;

        /**
        * Below footing
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Below footing")
        public QuantityWithDisplay BelowFooting = null;

        /**
        * Under ice coefficient
        */
        @ApiMember(DataType="number", Description="Under ice coefficient", Format="double")
        public Double UnderIceCoefficient = null;
        
        public QuantityWithDisplay getIceThickness() { return IceThickness; }
        public IceCoveredData setIceThickness(QuantityWithDisplay value) { this.IceThickness = value; return this; }
        public QuantityWithDisplay getWaterSurfaceToBottomOfSlush() { return WaterSurfaceToBottomOfSlush; }
        public IceCoveredData setWaterSurfaceToBottomOfSlush(QuantityWithDisplay value) { this.WaterSurfaceToBottomOfSlush = value; return this; }
        public QuantityWithDisplay getWaterSurfaceToBottomOfIce() { return WaterSurfaceToBottomOfIce; }
        public IceCoveredData setWaterSurfaceToBottomOfIce(QuantityWithDisplay value) { this.WaterSurfaceToBottomOfIce = value; return this; }
        public String getIceAssemblyType() { return IceAssemblyType; }
        public IceCoveredData setIceAssemblyType(String value) { this.IceAssemblyType = value; return this; }
        public QuantityWithDisplay getAboveFooting() { return AboveFooting; }
        public IceCoveredData setAboveFooting(QuantityWithDisplay value) { this.AboveFooting = value; return this; }
        public QuantityWithDisplay getBelowFooting() { return BelowFooting; }
        public IceCoveredData setBelowFooting(QuantityWithDisplay value) { this.BelowFooting = value; return this; }
        public Double getUnderIceCoefficient() { return UnderIceCoefficient; }
        public IceCoveredData setUnderIceCoefficient(Double value) { this.UnderIceCoefficient = value; return this; }
    }

    public static class OpenWaterData
    {
        /**
        * Suspension Weight
        */
        @ApiMember(Description="Suspension Weight")
        public String SuspensionWeight = null;

        /**
        * Distance to meter
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Distance to meter")
        public QuantityWithDisplay DistanceToMeter = null;

        /**
        * Dry Line Angle
        */
        @ApiMember(DataType="number", Description="Dry Line Angle", Format="double")
        public Double DryLineAngle = null;

        /**
        * Surface Coefficient
        */
        @ApiMember(DataType="number", Description="Surface Coefficient", Format="double")
        public Double SurfaceCoefficient = null;

        /**
        * Distance to water surface
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Distance to water surface")
        public QuantityWithDisplay DistanceToWaterSurface = null;

        /**
        * Dry Line Correction
        */
        @ApiMember(DataType="number", Description="Dry Line Correction", Format="double")
        public Double DryLineCorrection = null;

        /**
        * Wet Line Correction
        */
        @ApiMember(DataType="number", Description="Wet Line Correction", Format="double")
        public Double WetLineCorrection = null;
        
        public String getSuspensionWeight() { return SuspensionWeight; }
        public OpenWaterData setSuspensionWeight(String value) { this.SuspensionWeight = value; return this; }
        public QuantityWithDisplay getDistanceToMeter() { return DistanceToMeter; }
        public OpenWaterData setDistanceToMeter(QuantityWithDisplay value) { this.DistanceToMeter = value; return this; }
        public Double getDryLineAngle() { return DryLineAngle; }
        public OpenWaterData setDryLineAngle(Double value) { this.DryLineAngle = value; return this; }
        public Double getSurfaceCoefficient() { return SurfaceCoefficient; }
        public OpenWaterData setSurfaceCoefficient(Double value) { this.SurfaceCoefficient = value; return this; }
        public QuantityWithDisplay getDistanceToWaterSurface() { return DistanceToWaterSurface; }
        public OpenWaterData setDistanceToWaterSurface(QuantityWithDisplay value) { this.DistanceToWaterSurface = value; return this; }
        public Double getDryLineCorrection() { return DryLineCorrection; }
        public OpenWaterData setDryLineCorrection(Double value) { this.DryLineCorrection = value; return this; }
        public Double getWetLineCorrection() { return WetLineCorrection; }
        public OpenWaterData setWetLineCorrection(Double value) { this.WetLineCorrection = value; return this; }
    }

    public static enum FlowDirectionType
    {
        Unknown,
        Normal,
        Reversed;
    }

    public static class VelocityObservation
    {
        /**
        * Deployment Method
        */
        @ApiMember(DataType="string", Description="Deployment Method")
        public DeploymentMethodType DeploymentMethod = null;

        /**
        * Velocity Depth Observations
        */
        @ApiMember(DataType="array", Description="Velocity Depth Observations")
        public List<VelocityDepthObservation> Observations = null;
        
        public DeploymentMethodType getDeploymentMethod() { return DeploymentMethod; }
        public VelocityObservation setDeploymentMethod(DeploymentMethodType value) { this.DeploymentMethod = value; return this; }
        public List<VelocityDepthObservation> getObservations() { return Observations; }
        public VelocityObservation setObservations(List<VelocityDepthObservation> value) { this.Observations = value; return this; }
    }

    public static class Calibration
    {
        /**
        * Range start
        */
        @ApiMember(DataType="number", Description="Range start", Format="double")
        public Double RangeStart = null;

        /**
        * Range end
        */
        @ApiMember(DataType="number", Description="Range end", Format="double")
        public Double RangeEnd = null;

        /**
        * Slope
        */
        @ApiMember(DataType="number", Description="Slope", Format="double")
        public Double Slope = null;

        /**
        * Intercept
        */
        @ApiMember(DataType="number", Description="Intercept", Format="double")
        public Double Intercept = null;

        /**
        * Intercept unit
        */
        @ApiMember(Description="Intercept unit")
        public String InterceptUnit = null;
        
        public Double getRangeStart() { return RangeStart; }
        public Calibration setRangeStart(Double value) { this.RangeStart = value; return this; }
        public Double getRangeEnd() { return RangeEnd; }
        public Calibration setRangeEnd(Double value) { this.RangeEnd = value; return this; }
        public Double getSlope() { return Slope; }
        public Calibration setSlope(Double value) { this.Slope = value; return this; }
        public Double getIntercept() { return Intercept; }
        public Calibration setIntercept(Double value) { this.Intercept = value; return this; }
        public String getInterceptUnit() { return InterceptUnit; }
        public Calibration setInterceptUnit(String value) { this.InterceptUnit = value; return this; }
    }

    public static class VelocityDepthObservation
    {
        /**
        * Depth
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Depth")
        public QuantityWithDisplay Depth = null;

        /**
        * Revolution count
        */
        @ApiMember(DataType="integer", Description="Revolution count", Format="int32")
        public Integer RevolutionCount = null;

        /**
        * Observation interval in seconds
        */
        @ApiMember(DataType="DoubleWithDisplay", Description="Observation interval in seconds")
        public DoubleWithDisplay ObservationIntervalInSeconds = null;

        /**
        * Velocity
        */
        @ApiMember(DataType="QuantityWithDisplay", Description="Velocity")
        public QuantityWithDisplay Velocity = null;

        /**
        * Is velocity estimated
        */
        @ApiMember(DataType="boolean", Description="Is velocity estimated")
        public Boolean IsVelocityEstimated = null;

        /**
        * Depth multiplier
        */
        @ApiMember(DataType="number", Description="Depth multiplier", Format="double")
        public Double DepthMultiplier = null;

        /**
        * Weighting
        */
        @ApiMember(DataType="number", Description="Weighting", Format="double")
        public Double Weighting = null;
        
        public QuantityWithDisplay getDepth() { return Depth; }
        public VelocityDepthObservation setDepth(QuantityWithDisplay value) { this.Depth = value; return this; }
        public Integer getRevolutionCount() { return RevolutionCount; }
        public VelocityDepthObservation setRevolutionCount(Integer value) { this.RevolutionCount = value; return this; }
        public DoubleWithDisplay getObservationIntervalInSeconds() { return ObservationIntervalInSeconds; }
        public VelocityDepthObservation setObservationIntervalInSeconds(DoubleWithDisplay value) { this.ObservationIntervalInSeconds = value; return this; }
        public QuantityWithDisplay getVelocity() { return Velocity; }
        public VelocityDepthObservation setVelocity(QuantityWithDisplay value) { this.Velocity = value; return this; }
        public Boolean getIsVelocityEstimated() { return IsVelocityEstimated; }
        public VelocityDepthObservation setIsVelocityEstimated(Boolean value) { this.IsVelocityEstimated = value; return this; }
        public Double getDepthMultiplier() { return DepthMultiplier; }
        public VelocityDepthObservation setDepthMultiplier(Double value) { this.DepthMultiplier = value; return this; }
        public Double getWeighting() { return Weighting; }
        public VelocityDepthObservation setWeighting(Double value) { this.Weighting = value; return this; }
    }

    public static class Current
    {
        public static final AquariusServerVersion Version = AquariusServerVersion.Create("21.3.83.0");
    }
}
