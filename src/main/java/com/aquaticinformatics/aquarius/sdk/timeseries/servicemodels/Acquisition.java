/* Options:
Instant: 2017-12-04 13:32:13
Version: 4.512
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: http://autoserver12/AQUARIUS/Acquisition/v2

Package: com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels
GlobalNamespace: Acquisition
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

public class Acquisition
{

    @Route(Path="/locations/{LocationUniqueId}/attachments/reports", Verbs="POST")
    public static class PostReportAttachment implements IReturn<PostReportResponse>
    {
        /**
        * Title of the report
        */
        @ApiMember(Description="Title of the report", IsRequired=true)
        public String Title = null;

        /**
        * Description of the report
        */
        @ApiMember(Description="Description of the report")
        public String Description = null;

        /**
        * Comments about the report
        */
        @ApiMember(Description="Comments about the report")
        public String Comments = null;

        /**
        * Unique ID of the location to add the report to
        */
        @ApiMember(DataType="string", Description="Unique ID of the location to add the report to", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        /**
        * Unique IDs of source time-series displayed in report
        */
        @ApiMember(DataType="Array<string>", Description="Unique IDs of source time-series displayed in report")
        public ArrayList<String> SourceTimeSeriesUniqueIds = null;

        /**
        * Time range of source data displayed in report
        */
        @ApiMember(DataType="Interval", Description="Time range of source data displayed in report")
        public Interval SourceTimeRange = null;

        /**
        * Time report was created
        */
        @ApiMember(DataType="Instant", Description="Time report was created")
        public Instant CreatedTime = null;

        public String getTitle() { return Title; }
        public PostReportAttachment setTitle(String value) { this.Title = value; return this; }
        public String getDescription() { return Description; }
        public PostReportAttachment setDescription(String value) { this.Description = value; return this; }
        public String getComments() { return Comments; }
        public PostReportAttachment setComments(String value) { this.Comments = value; return this; }
        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostReportAttachment setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        public ArrayList<String> getSourceTimeSeriesUniqueIds() { return SourceTimeSeriesUniqueIds; }
        public PostReportAttachment setSourceTimeSeriesUniqueIds(ArrayList<String> value) { this.SourceTimeSeriesUniqueIds = value; return this; }
        public Interval getSourceTimeRange() { return SourceTimeRange; }
        public PostReportAttachment setSourceTimeRange(Interval value) { this.SourceTimeRange = value; return this; }
        public Instant getCreatedTime() { return CreatedTime; }
        public PostReportAttachment setCreatedTime(Instant value) { this.CreatedTime = value; return this; }
        private static Object responseType = PostReportResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/attachments/reports/{ReportUniqueId}", Verbs="DELETE")
    public static class DeleteReportAttachment implements IReturnVoid
    {
        /**
        * Unique ID of report
        */
        @ApiMember(DataType="string", Description="Unique ID of report", IsRequired=true, ParameterType="path")
        public String ReportUniqueId = null;
        
        public String getReportUniqueId() { return ReportUniqueId; }
        public DeleteReportAttachment setReportUniqueId(String value) { this.ReportUniqueId = value; return this; }
    }

    @Route(Path="/locations/{LocationUniqueId}/visits/upload/plugins", Verbs="POST")
    public static class PostVisitFile implements IReturn<PostVisitFileResponse>
    {
        /**
        * Unique ID of the location of visits in the file
        */
        @ApiMember(DataType="string", Description="Unique ID of the location of visits in the file", IsRequired=true, ParameterType="path")
        public String LocationUniqueId = null;

        public String getLocationUniqueId() { return LocationUniqueId; }
        public PostVisitFile setLocationUniqueId(String value) { this.LocationUniqueId = value; return this; }
        private static Object responseType = PostVisitFileResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/timeseries/appendstatus/{AppendRequestIdentifier}", Verbs="GET")
    public static class GetTimeSeriesAppendStatus implements IReturn<TimeSeriesAppendStatus>
    {
        /**
        * Identifier returned from a previous append request
        */
        @ApiMember(Description="Identifier returned from a previous append request", IsRequired=true, ParameterType="path")
        public String AppendRequestIdentifier = null;
        
        public String getAppendRequestIdentifier() { return AppendRequestIdentifier; }
        public GetTimeSeriesAppendStatus setAppendRequestIdentifier(String value) { this.AppendRequestIdentifier = value; return this; }
        private static Object responseType = TimeSeriesAppendStatus.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/timeseries/{UniqueId}/append", Verbs="POST")
    public static class PostTimeSeriesAppend implements IReturn<AppendResponse>
    {
        /**
        * The unique ID (from Publish API) of the time series to receive points
        */
        @ApiMember(DataType="string", Description="The unique ID (from Publish API) of the time series to receive points", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Points to append (can be empty)
        */
        @ApiMember(DataType="Array<TimeSeriesPoint>", Description="Points to append (can be empty)")
        public ArrayList<TimeSeriesPoint> Points = null;
        
        public String getUniqueId() { return UniqueId; }
        public PostTimeSeriesAppend setUniqueId(String value) { this.UniqueId = value; return this; }
        public ArrayList<TimeSeriesPoint> getPoints() { return Points; }
        public PostTimeSeriesAppend setPoints(ArrayList<TimeSeriesPoint> value) { this.Points = value; return this; }
        private static Object responseType = AppendResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/timeseries/{UniqueId}/overwriteappend", Verbs="POST")
    public static class PostTimeSeriesOverwriteAppend implements IReturn<AppendResponse>
    {
        /**
        * The unique ID (from Publish API) of the time series to receive points
        */
        @ApiMember(DataType="string", Description="The unique ID (from Publish API) of the time series to receive points", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Points to append (can be empty). All points must lie within the time range
        */
        @ApiMember(DataType="Array<TimeSeriesPoint>", Description="Points to append (can be empty). All points must lie within the time range")
        public ArrayList<TimeSeriesPoint> Points = null;

        /**
        * Time range to delete before appending points
        */
        @ApiMember(DataType="Interval", Description="Time range to delete before appending points")
        public Interval TimeRange = null;
        
        public String getUniqueId() { return UniqueId; }
        public PostTimeSeriesOverwriteAppend setUniqueId(String value) { this.UniqueId = value; return this; }
        public ArrayList<TimeSeriesPoint> getPoints() { return Points; }
        public PostTimeSeriesOverwriteAppend setPoints(ArrayList<TimeSeriesPoint> value) { this.Points = value; return this; }
        public Interval getTimeRange() { return TimeRange; }
        public PostTimeSeriesOverwriteAppend setTimeRange(Interval value) { this.TimeRange = value; return this; }
        private static Object responseType = AppendResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/timeseries/{UniqueId}/reflected", Verbs="POST")
    public static class PostReflectedTimeSeries implements IReturn<AppendResponse>
    {
        /**
        * The unique ID (from Publish API) of the reflected time series to receive points
        */
        @ApiMember(DataType="string", Description="The unique ID (from Publish API) of the reflected time series to receive points", IsRequired=true, ParameterType="path")
        public String UniqueId = null;

        /**
        * Points to append (can be empty). All points must lie within the time range
        */
        @ApiMember(DataType="Array<ReflectedTimeSeriesPoint>", Description="Points to append (can be empty). All points must lie within the time range")
        public ArrayList<ReflectedTimeSeriesPoint> Points = null;

        /**
        * Time range to update. Any existing points in the time range will be overwritten
        */
        @ApiMember(DataType="Interval", Description="Time range to update. Any existing points in the time range will be overwritten", IsRequired=true)
        public Interval TimeRange = null;
        
        public String getUniqueId() { return UniqueId; }
        public PostReflectedTimeSeries setUniqueId(String value) { this.UniqueId = value; return this; }
        public ArrayList<ReflectedTimeSeriesPoint> getPoints() { return Points; }
        public PostReflectedTimeSeries setPoints(ArrayList<ReflectedTimeSeriesPoint> value) { this.Points = value; return this; }
        public Interval getTimeRange() { return TimeRange; }
        public PostReflectedTimeSeries setTimeRange(Interval value) { this.TimeRange = value; return this; }
        private static Object responseType = AppendResponse.class;
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

    public static class PostReportResponse
    {
        /**
        * Unique ID of the created report
        */
        @ApiMember(DataType="string", Description="Unique ID of the created report")
        public String ReportUniqueId = null;
        
        public String getReportUniqueId() { return ReportUniqueId; }
        public PostReportResponse setReportUniqueId(String value) { this.ReportUniqueId = value; return this; }
    }

    public static class PostVisitFileResponse
    {
        /**
        * Relative URIs of created visits
        */
        @ApiMember(DataType="Array<string>", Description="Relative URIs of created visits")
        public ArrayList<String> VisitUris = null;

        /**
        * Registered field data plug-in that processed the file
        */
        @ApiMember(DataType="FieldDataPlugin", Description="Registered field data plug-in that processed the file")
        public FieldDataPlugin HandledByPlugin = null;
        
        public ArrayList<String> getVisitUris() { return VisitUris; }
        public PostVisitFileResponse setVisitUris(ArrayList<String> value) { this.VisitUris = value; return this; }
        public FieldDataPlugin getHandledByPlugin() { return HandledByPlugin; }
        public PostVisitFileResponse setHandledByPlugin(FieldDataPlugin value) { this.HandledByPlugin = value; return this; }
    }

    public static class TimeSeriesAppendStatus
    {
        /**
        * Internal ID of the time series
        */
        @ApiMember(Description="Internal ID of the time series")
        public Long TimeSeriesId = null;

        public AppendStatusCode AppendStatus = null;
        /**
        * When AppendStatus=Completed: Version of the time series containing the appended points
        */
        @ApiMember(Description="When AppendStatus=Completed: Version of the time series containing the appended points")
        public Long AppendedVersion = null;

        /**
        * When AppendStatus=Completed: Number of points successfully appended
        */
        @ApiMember(Description="When AppendStatus=Completed: Number of points successfully appended")
        public Integer NumberOfPointsAppended = null;

        /**
        * When AppendStatus=Completed: Number of points successfully deleted
        */
        @ApiMember(Description="When AppendStatus=Completed: Number of points successfully deleted")
        public Integer NumberOfPointsDeleted = null;
        
        public Long getTimeSeriesId() { return TimeSeriesId; }
        public TimeSeriesAppendStatus setTimeSeriesId(Long value) { this.TimeSeriesId = value; return this; }
        public AppendStatusCode getAppendStatus() { return AppendStatus; }
        public TimeSeriesAppendStatus setAppendStatus(AppendStatusCode value) { this.AppendStatus = value; return this; }
        public Long getAppendedVersion() { return AppendedVersion; }
        public TimeSeriesAppendStatus setAppendedVersion(Long value) { this.AppendedVersion = value; return this; }
        public Integer getNumberOfPointsAppended() { return NumberOfPointsAppended; }
        public TimeSeriesAppendStatus setNumberOfPointsAppended(Integer value) { this.NumberOfPointsAppended = value; return this; }
        public Integer getNumberOfPointsDeleted() { return NumberOfPointsDeleted; }
        public TimeSeriesAppendStatus setNumberOfPointsDeleted(Integer value) { this.NumberOfPointsDeleted = value; return this; }
    }

    public static class AppendResponse
    {
        /**
        * A token to use in subsequent GetTimeSeriesAppendStatus calls
        */
        @ApiMember(Description="A token to use in subsequent GetTimeSeriesAppendStatus calls")
        public String AppendRequestIdentifier = null;
        
        public String getAppendRequestIdentifier() { return AppendRequestIdentifier; }
        public AppendResponse setAppendRequestIdentifier(String value) { this.AppendRequestIdentifier = value; return this; }
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

    public static class FieldDataPlugin
    {
        /**
        * Name
        */
        @ApiMember(Description="Name")
        public String Name = null;

        /**
        * Unique id
        */
        @ApiMember(DataType="string", Description="Unique id")
        public String UniqueId = null;
        
        public String getName() { return Name; }
        public FieldDataPlugin setName(String value) { this.Name = value; return this; }
        public String getUniqueId() { return UniqueId; }
        public FieldDataPlugin setUniqueId(String value) { this.UniqueId = value; return this; }
    }

    public static enum AppendStatusCode
    {
        Pending,
        Completed,
        Failed;
    }

    public static class TimeSeriesPoint
    {
        /**
        * ISO 8601 timestamp
        */
        @ApiMember(DataType="Instant", Description="ISO 8601 timestamp", IsRequired=true)
        public Instant Time = null;

        /**
        * The value of the point. Null or empty to represent a NaN
        */
        @ApiMember(DataType="double", Description="The value of the point. Null or empty to represent a NaN")
        public Double Value = null;
        
        public Instant getTime() { return Time; }
        public TimeSeriesPoint setTime(Instant value) { this.Time = value; return this; }
        public Double getValue() { return Value; }
        public TimeSeriesPoint setValue(Double value) { this.Value = value; return this; }
    }

    public static class ReflectedTimeSeriesPoint extends TimeSeriesPoint
    {
        /**
        * Grade code
        */
        @ApiMember(DataType="integer", Description="Grade code")
        public Integer GradeCode = null;

        /**
        * Qualifier codes
        */
        @ApiMember(DataType="Array<string>", Description="Qualifier codes")
        public ArrayList<String> Qualifiers = null;
        
        public Integer getGradeCode() { return GradeCode; }
        public ReflectedTimeSeriesPoint setGradeCode(Integer value) { this.GradeCode = value; return this; }
        public ArrayList<String> getQualifiers() { return Qualifiers; }
        public ReflectedTimeSeriesPoint setQualifiers(ArrayList<String> value) { this.Qualifiers = value; return this; }
    }

    public static class Current
    {
        public static final AquariusServerVersion Version = AquariusServerVersion.Create("17.4.73.0");
    }
}
