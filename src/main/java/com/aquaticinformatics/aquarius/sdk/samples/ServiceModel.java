// Date: 2022-10-25T22:34:10.5765073-07:00
// Base URL: https://demo.aqsamples.com/api/swagger.json
// Source: AQUARIUS Samples API (2022.09.5395)

package com.aquaticinformatics.aquarius.sdk.samples;

import java.time.*;
import java.util.*;
import com.google.gson.reflect.TypeToken;
import net.servicestack.client.*;
import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;

public class ServiceModel
{
    public static class Current
    {
        public static final AquariusServerVersion Version = AquariusServerVersion.Create("2022.09.5395");
    }

    @Route(Path="/v1/accessgroups", Verbs="GET")
    public static class GetAccessGroups implements IReturn<SearchResultAccessGroup>
    {
        private static Object responseType = SearchResultAccessGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/accessgroups", Verbs="POST")
    public static class PostAccessGroup implements IReturn<AccessGroup>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public Boolean CanEditAllData = null;
        public List<SamplingLocationGroup> SamplingLocationGroups = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostAccessGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PostAccessGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostAccessGroup setDescription(String value) { this.Description = value; return this; }
        public Boolean getCanEditAllData() { return CanEditAllData; }
        public PostAccessGroup setCanEditAllData(Boolean value) { this.CanEditAllData = value; return this; }
        public List<SamplingLocationGroup> getSamplingLocationGroups() { return SamplingLocationGroups; }
        public PostAccessGroup setSamplingLocationGroups(List<SamplingLocationGroup> value) { this.SamplingLocationGroups = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostAccessGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AccessGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/accessgroups/{id}", Verbs="GET")
    public static class GetAccessGroup implements IReturn<AccessGroup>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAccessGroup setId(String value) { this.Id = value; return this; }
        private static Object responseType = AccessGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/accessgroups/{id}", Verbs="PUT")
    public static class PutAccessGroup implements IReturn<AccessGroup>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public Boolean CanEditAllData = null;
        public List<SamplingLocationGroup> SamplingLocationGroups = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutAccessGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PutAccessGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutAccessGroup setDescription(String value) { this.Description = value; return this; }
        public Boolean getCanEditAllData() { return CanEditAllData; }
        public PutAccessGroup setCanEditAllData(Boolean value) { this.CanEditAllData = value; return this; }
        public List<SamplingLocationGroup> getSamplingLocationGroups() { return SamplingLocationGroups; }
        public PutAccessGroup setSamplingLocationGroups(List<SamplingLocationGroup> value) { this.SamplingLocationGroups = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutAccessGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AccessGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/accessgroups/{id}", Verbs="DELETE")
    public static class DeleteAccessGroup implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteAccessGroup setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/accessgroups/{id}/history", Verbs="GET")
    public static class GetAccessGroupHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAccessGroupHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activities", Verbs="GET")
    public static class GetActivities implements IReturn<SearchResultActivity>, IPaginatedRequest
    {
        public List<String> ActivityTemplateId = null;
        public List<String> ActivityTypes = null;
        public List<String> CollectionMethodIds = null;
        public String Cursor = null;
        public String CustomId = null;
        public String FieldVisitId = null;
        public Instant FromStartTime = null;
        public List<String> Ids = null;
        public Integer Limit = null;
        public List<String> Media = null;
        public List<String> ProjectIds = null;
        public List<String> SamplingLocationIds = null;
        public String Sort = null;
        public Instant ToStartTime = null;

        public List<String> getActivityTemplateId() { return ActivityTemplateId; }
        public GetActivities setActivityTemplateId(List<String> value) { this.ActivityTemplateId = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetActivities setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public GetActivities setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public GetActivities setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetActivities setCustomId(String value) { this.CustomId = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public GetActivities setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public Instant getFromStartTime() { return FromStartTime; }
        public GetActivities setFromStartTime(Instant value) { this.FromStartTime = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetActivities setIds(List<String> value) { this.Ids = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetActivities setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getMedia() { return Media; }
        public GetActivities setMedia(List<String> value) { this.Media = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetActivities setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetActivities setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public String getSort() { return Sort; }
        public GetActivities setSort(String value) { this.Sort = value; return this; }
        public Instant getToStartTime() { return ToStartTime; }
        public GetActivities setToStartTime(Instant value) { this.ToStartTime = value; return this; }
        private static Object responseType = SearchResultActivity.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activities", Verbs="POST")
    public static class PostActivity implements IReturn<Activity>
    {
        public ActivityType Type = null;
        public String Id = null;
        public String CustomId = null;
        public String SourceActivityId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Comment = null;
        public String LoggerFileName = null;
        public Device Device = null;
        public CollectionMethod CollectionMethod = null;
        public Medium Medium = null;
        public PlannedActivity PlannedActivity = null;
        public Quantity Depth = null;
        public SamplingLocation SamplingLocation = null;
        public FieldVisit FieldVisit = null;
        public List<SamplingContextTag> SamplingContextTags = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public Boolean Refreshed = null;
        public AuditAttributes AuditAttributes = null;

        public ActivityType getType() { return Type; }
        public PostActivity setType(ActivityType value) { this.Type = value; return this; }
        public String getId() { return Id; }
        public PostActivity setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostActivity setCustomId(String value) { this.CustomId = value; return this; }
        public String getSourceActivityId() { return SourceActivityId; }
        public PostActivity setSourceActivityId(String value) { this.SourceActivityId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PostActivity setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PostActivity setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getComment() { return Comment; }
        public PostActivity setComment(String value) { this.Comment = value; return this; }
        public String getLoggerFileName() { return LoggerFileName; }
        public PostActivity setLoggerFileName(String value) { this.LoggerFileName = value; return this; }
        public Device getDevice() { return Device; }
        public PostActivity setDevice(Device value) { this.Device = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PostActivity setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public Medium getMedium() { return Medium; }
        public PostActivity setMedium(Medium value) { this.Medium = value; return this; }
        public PlannedActivity getPlannedActivity() { return PlannedActivity; }
        public PostActivity setPlannedActivity(PlannedActivity value) { this.PlannedActivity = value; return this; }
        public Quantity getDepth() { return Depth; }
        public PostActivity setDepth(Quantity value) { this.Depth = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public PostActivity setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public FieldVisit getFieldVisit() { return FieldVisit; }
        public PostActivity setFieldVisit(FieldVisit value) { this.FieldVisit = value; return this; }
        public List<SamplingContextTag> getSamplingContextTags() { return SamplingContextTags; }
        public PostActivity setSamplingContextTags(List<SamplingContextTag> value) { this.SamplingContextTags = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PostActivity setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public Boolean getRefreshed() { return Refreshed; }
        public PostActivity setRefreshed(Boolean value) { this.Refreshed = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostActivity setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Activity.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activities", Verbs="DELETE")
    public static class DeleteActivities implements IReturnVoid
    {
        public List<String> ActivityTemplateId = null;
        public List<String> ActivityTypes = null;
        public List<String> CollectionMethodIds = null;
        public String Cursor = null;
        public String CustomId = null;
        public String FieldVisitId = null;
        public Instant FromStartTime = null;
        public List<String> Ids = null;
        public Integer Limit = null;
        public List<String> Media = null;
        public List<String> ProjectIds = null;
        public List<String> SamplingLocationIds = null;
        public String Sort = null;
        public Instant ToStartTime = null;

        public List<String> getActivityTemplateId() { return ActivityTemplateId; }
        public DeleteActivities setActivityTemplateId(List<String> value) { this.ActivityTemplateId = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public DeleteActivities setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public DeleteActivities setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public DeleteActivities setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public DeleteActivities setCustomId(String value) { this.CustomId = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public DeleteActivities setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public Instant getFromStartTime() { return FromStartTime; }
        public DeleteActivities setFromStartTime(Instant value) { this.FromStartTime = value; return this; }
        public List<String> getIds() { return Ids; }
        public DeleteActivities setIds(List<String> value) { this.Ids = value; return this; }
        public Integer getLimit() { return Limit; }
        public DeleteActivities setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getMedia() { return Media; }
        public DeleteActivities setMedia(List<String> value) { this.Media = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public DeleteActivities setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public DeleteActivities setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public String getSort() { return Sort; }
        public DeleteActivities setSort(String value) { this.Sort = value; return this; }
        public Instant getToStartTime() { return ToStartTime; }
        public DeleteActivities setToStartTime(Instant value) { this.ToStartTime = value; return this; }
    }

    @Route(Path="/v1/activities/{id}", Verbs="GET")
    public static class GetActivity implements IReturn<ActivityWithDetails>
    {
        public String Id = null;
        public Boolean Detail = null;

        public String getId() { return Id; }
        public GetActivity setId(String value) { this.Id = value; return this; }
        public Boolean getDetail() { return Detail; }
        public GetActivity setDetail(Boolean value) { this.Detail = value; return this; }
        private static Object responseType = ActivityWithDetails.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activities/{id}", Verbs="PUT")
    public static class PutActivity implements IReturn<ActivityWithDetails>
    {
        public String Id = null;
        public Boolean Detail = null;
        public ActivityWithDetailsType Type = null;
        public String CustomId = null;
        public String SourceActivityId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Comment = null;
        public String LoggerFileName = null;
        public Device Device = null;
        public CollectionMethod CollectionMethod = null;
        public Medium Medium = null;
        public PlannedActivity PlannedActivity = null;
        public Quantity Depth = null;
        public SamplingLocation SamplingLocation = null;
        public FieldVisit FieldVisit = null;
        public List<SamplingContextTag> SamplingContextTags = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public IndexConfiguration IndexConfiguration = null;
        public List<MetricResult> MetricResults = null;
        public List<SpecimenNestedInActivity> Specimens = null;
        public List<ObservationMinimal> Observations = null;
        public Boolean Refreshed = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutActivity setId(String value) { this.Id = value; return this; }
        public Boolean getDetail() { return Detail; }
        public PutActivity setDetail(Boolean value) { this.Detail = value; return this; }
        public ActivityWithDetailsType getType() { return Type; }
        public PutActivity setType(ActivityWithDetailsType value) { this.Type = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutActivity setCustomId(String value) { this.CustomId = value; return this; }
        public String getSourceActivityId() { return SourceActivityId; }
        public PutActivity setSourceActivityId(String value) { this.SourceActivityId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PutActivity setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PutActivity setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getComment() { return Comment; }
        public PutActivity setComment(String value) { this.Comment = value; return this; }
        public String getLoggerFileName() { return LoggerFileName; }
        public PutActivity setLoggerFileName(String value) { this.LoggerFileName = value; return this; }
        public Device getDevice() { return Device; }
        public PutActivity setDevice(Device value) { this.Device = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PutActivity setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public Medium getMedium() { return Medium; }
        public PutActivity setMedium(Medium value) { this.Medium = value; return this; }
        public PlannedActivity getPlannedActivity() { return PlannedActivity; }
        public PutActivity setPlannedActivity(PlannedActivity value) { this.PlannedActivity = value; return this; }
        public Quantity getDepth() { return Depth; }
        public PutActivity setDepth(Quantity value) { this.Depth = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public PutActivity setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public FieldVisit getFieldVisit() { return FieldVisit; }
        public PutActivity setFieldVisit(FieldVisit value) { this.FieldVisit = value; return this; }
        public List<SamplingContextTag> getSamplingContextTags() { return SamplingContextTags; }
        public PutActivity setSamplingContextTags(List<SamplingContextTag> value) { this.SamplingContextTags = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PutActivity setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public IndexConfiguration getIndexConfiguration() { return IndexConfiguration; }
        public PutActivity setIndexConfiguration(IndexConfiguration value) { this.IndexConfiguration = value; return this; }
        public List<MetricResult> getMetricResults() { return MetricResults; }
        public PutActivity setMetricResults(List<MetricResult> value) { this.MetricResults = value; return this; }
        public List<SpecimenNestedInActivity> getSpecimens() { return Specimens; }
        public PutActivity setSpecimens(List<SpecimenNestedInActivity> value) { this.Specimens = value; return this; }
        public List<ObservationMinimal> getObservations() { return Observations; }
        public PutActivity setObservations(List<ObservationMinimal> value) { this.Observations = value; return this; }
        public Boolean getRefreshed() { return Refreshed; }
        public PutActivity setRefreshed(Boolean value) { this.Refreshed = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutActivity setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ActivityWithDetails.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activities/{id}", Verbs="DELETE")
    public static class DeleteActivity implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteActivity setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/activities/{id}/history", Verbs="GET")
    public static class GetActivityHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetActivityHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activities/{id}/replicate", Verbs="POST")
    public static class PostActivityReplicate implements IReturn<Activity>
    {
        public String Id = null;

        public String getId() { return Id; }
        public PostActivityReplicate setId(String value) { this.Id = value; return this; }
        private static Object responseType = Activity.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activitytemplates", Verbs="GET")
    public static class GetActivityTemplates implements IReturn<SearchResultActivityTemplate>
    {
        public Integer Limit = null;
        public List<String> Search = null;
        public List<String> Type = null;

        public Integer getLimit() { return Limit; }
        public GetActivityTemplates setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetActivityTemplates setSearch(List<String> value) { this.Search = value; return this; }
        public List<String> getType() { return Type; }
        public GetActivityTemplates setType(List<String> value) { this.Type = value; return this; }
        private static Object responseType = SearchResultActivityTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activitytemplates", Verbs="POST")
    public static class PostActivityTemplate implements IReturn<ActivityTemplate>
    {
        public String Id = null;
        public List<SpecimenTemplate> SpecimenTemplates = null;
        public String CustomId = null;
        public ActivityTemplateType Type = null;
        public String Comment = null;
        public MediumType Medium = null;
        public Quantity Depth = null;
        public CollectionMethod CollectionMethod = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostActivityTemplate setId(String value) { this.Id = value; return this; }
        public List<SpecimenTemplate> getSpecimenTemplates() { return SpecimenTemplates; }
        public PostActivityTemplate setSpecimenTemplates(List<SpecimenTemplate> value) { this.SpecimenTemplates = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostActivityTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public ActivityTemplateType getType() { return Type; }
        public PostActivityTemplate setType(ActivityTemplateType value) { this.Type = value; return this; }
        public String getComment() { return Comment; }
        public PostActivityTemplate setComment(String value) { this.Comment = value; return this; }
        public MediumType getMedium() { return Medium; }
        public PostActivityTemplate setMedium(MediumType value) { this.Medium = value; return this; }
        public Quantity getDepth() { return Depth; }
        public PostActivityTemplate setDepth(Quantity value) { this.Depth = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PostActivityTemplate setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostActivityTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ActivityTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activitytemplates/{id}", Verbs="GET")
    public static class GetActivityTemplate implements IReturn<ActivityTemplate>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetActivityTemplate setId(String value) { this.Id = value; return this; }
        private static Object responseType = ActivityTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activitytemplates/{id}", Verbs="PUT")
    public static class PutActivityTemplate implements IReturn<ActivityTemplate>
    {
        public String Id = null;
        public List<SpecimenTemplate> SpecimenTemplates = null;
        public String CustomId = null;
        public ActivityTemplateType Type = null;
        public String Comment = null;
        public MediumType Medium = null;
        public Quantity Depth = null;
        public CollectionMethod CollectionMethod = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutActivityTemplate setId(String value) { this.Id = value; return this; }
        public List<SpecimenTemplate> getSpecimenTemplates() { return SpecimenTemplates; }
        public PutActivityTemplate setSpecimenTemplates(List<SpecimenTemplate> value) { this.SpecimenTemplates = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutActivityTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public ActivityTemplateType getType() { return Type; }
        public PutActivityTemplate setType(ActivityTemplateType value) { this.Type = value; return this; }
        public String getComment() { return Comment; }
        public PutActivityTemplate setComment(String value) { this.Comment = value; return this; }
        public MediumType getMedium() { return Medium; }
        public PutActivityTemplate setMedium(MediumType value) { this.Medium = value; return this; }
        public Quantity getDepth() { return Depth; }
        public PutActivityTemplate setDepth(Quantity value) { this.Depth = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PutActivityTemplate setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutActivityTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ActivityTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/activitytemplates/{id}", Verbs="DELETE")
    public static class DeleteActivityTemplate implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteActivityTemplate setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/activitytemplates/{id}/history", Verbs="GET")
    public static class GetActivityTemplateHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetActivityTemplateHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analysismethods", Verbs="GET")
    public static class GetAnalysisMethods implements IReturn<SearchResultAnalysisMethod>
    {
        public String Context = null;
        public Integer Limit = null;
        public List<String> ObservedPropertyIds = null;
        public List<String> Search = null;

        public String getContext() { return Context; }
        public GetAnalysisMethods setContext(String value) { this.Context = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetAnalysisMethods setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetAnalysisMethods setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetAnalysisMethods setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultAnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analysismethods", Verbs="POST")
    public static class PostAnalysisMethod implements IReturn<AnalysisMethod>
    {
        public String Id = null;
        public String MethodId = null;
        public String Name = null;
        public String Context = null;
        public String Description = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostAnalysisMethod setId(String value) { this.Id = value; return this; }
        public String getMethodId() { return MethodId; }
        public PostAnalysisMethod setMethodId(String value) { this.MethodId = value; return this; }
        public String getName() { return Name; }
        public PostAnalysisMethod setName(String value) { this.Name = value; return this; }
        public String getContext() { return Context; }
        public PostAnalysisMethod setContext(String value) { this.Context = value; return this; }
        public String getDescription() { return Description; }
        public PostAnalysisMethod setDescription(String value) { this.Description = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public PostAnalysisMethod setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PostAnalysisMethod setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostAnalysisMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analysismethods/{id}", Verbs="GET")
    public static class GetAnalysisMethod implements IReturn<AnalysisMethod>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAnalysisMethod setId(String value) { this.Id = value; return this; }
        private static Object responseType = AnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analysismethods/{id}", Verbs="PUT")
    public static class PutAnalysisMethod implements IReturn<AnalysisMethod>
    {
        public String Id = null;
        public String MethodId = null;
        public String Name = null;
        public String Context = null;
        public String Description = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutAnalysisMethod setId(String value) { this.Id = value; return this; }
        public String getMethodId() { return MethodId; }
        public PutAnalysisMethod setMethodId(String value) { this.MethodId = value; return this; }
        public String getName() { return Name; }
        public PutAnalysisMethod setName(String value) { this.Name = value; return this; }
        public String getContext() { return Context; }
        public PutAnalysisMethod setContext(String value) { this.Context = value; return this; }
        public String getDescription() { return Description; }
        public PutAnalysisMethod setDescription(String value) { this.Description = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public PutAnalysisMethod setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PutAnalysisMethod setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutAnalysisMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analysismethods/{id}", Verbs="DELETE")
    public static class DeleteAnalysisMethod implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteAnalysisMethod setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/analysismethods/{id}/history", Verbs="GET")
    public static class GetAnalysisMethodHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAnalysisMethodHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analyticalgroups", Verbs="GET")
    public static class GetAnalyticalGroups implements IReturn<SearchResultAnalyticalGroup>
    {
        public List<String> AnalyticalGroupTypes = null;
        public Integer Limit = null;
        public List<String> ObservedPropertyIds = null;
        public List<String> Search = null;

        public List<String> getAnalyticalGroupTypes() { return AnalyticalGroupTypes; }
        public GetAnalyticalGroups setAnalyticalGroupTypes(List<String> value) { this.AnalyticalGroupTypes = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetAnalyticalGroups setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetAnalyticalGroups setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetAnalyticalGroups setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultAnalyticalGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analyticalgroups", Verbs="POST")
    public static class PostAnalyticalGroup implements IReturn<AnalyticalGroup>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public AnalyticalGroupType Type = null;
        public Integer NumberOfObservedPropertiesInGroupItems = null;
        public Integer NumberOfAnalysisMethodsInGroupItems = null;
        public List<AnalyticalGroupItem> AnalyticalGroupItems = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostAnalyticalGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PostAnalyticalGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostAnalyticalGroup setDescription(String value) { this.Description = value; return this; }
        public AnalyticalGroupType getType() { return Type; }
        public PostAnalyticalGroup setType(AnalyticalGroupType value) { this.Type = value; return this; }
        public Integer getNumberOfObservedPropertiesInGroupItems() { return NumberOfObservedPropertiesInGroupItems; }
        public PostAnalyticalGroup setNumberOfObservedPropertiesInGroupItems(Integer value) { this.NumberOfObservedPropertiesInGroupItems = value; return this; }
        public Integer getNumberOfAnalysisMethodsInGroupItems() { return NumberOfAnalysisMethodsInGroupItems; }
        public PostAnalyticalGroup setNumberOfAnalysisMethodsInGroupItems(Integer value) { this.NumberOfAnalysisMethodsInGroupItems = value; return this; }
        public List<AnalyticalGroupItem> getAnalyticalGroupItems() { return AnalyticalGroupItems; }
        public PostAnalyticalGroup setAnalyticalGroupItems(List<AnalyticalGroupItem> value) { this.AnalyticalGroupItems = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostAnalyticalGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AnalyticalGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analyticalgroups/{id}", Verbs="GET")
    public static class GetAnalyticalGroup implements IReturn<AnalyticalGroup>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAnalyticalGroup setId(String value) { this.Id = value; return this; }
        private static Object responseType = AnalyticalGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analyticalgroups/{id}", Verbs="PUT")
    public static class PutAnalyticalGroup implements IReturn<AnalyticalGroup>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public AnalyticalGroupType Type = null;
        public Integer NumberOfObservedPropertiesInGroupItems = null;
        public Integer NumberOfAnalysisMethodsInGroupItems = null;
        public List<AnalyticalGroupItem> AnalyticalGroupItems = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutAnalyticalGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PutAnalyticalGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutAnalyticalGroup setDescription(String value) { this.Description = value; return this; }
        public AnalyticalGroupType getType() { return Type; }
        public PutAnalyticalGroup setType(AnalyticalGroupType value) { this.Type = value; return this; }
        public Integer getNumberOfObservedPropertiesInGroupItems() { return NumberOfObservedPropertiesInGroupItems; }
        public PutAnalyticalGroup setNumberOfObservedPropertiesInGroupItems(Integer value) { this.NumberOfObservedPropertiesInGroupItems = value; return this; }
        public Integer getNumberOfAnalysisMethodsInGroupItems() { return NumberOfAnalysisMethodsInGroupItems; }
        public PutAnalyticalGroup setNumberOfAnalysisMethodsInGroupItems(Integer value) { this.NumberOfAnalysisMethodsInGroupItems = value; return this; }
        public List<AnalyticalGroupItem> getAnalyticalGroupItems() { return AnalyticalGroupItems; }
        public PutAnalyticalGroup setAnalyticalGroupItems(List<AnalyticalGroupItem> value) { this.AnalyticalGroupItems = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutAnalyticalGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AnalyticalGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/analyticalgroups/{id}", Verbs="DELETE")
    public static class DeleteAnalyticalGroup implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteAnalyticalGroup setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/analyticalgroups/{id}/history", Verbs="GET")
    public static class GetAnalyticalGroupHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAnalyticalGroupHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/attachments/{id}", Verbs="GET")
    public static class GetAttachment implements IReturn<Attachment>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAttachment setId(String value) { this.Id = value; return this; }
        private static Object responseType = Attachment.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/attachments/{id}", Verbs="PUT")
    public static class PutAttachment implements IReturn<Attachment>
    {
        public String Id = null;
        public String FileName = null;
        public String ContentType = null;
        public String Comment = null;
        public Integer FileSize = null;
        public OffsetDateTime DateTaken = null;
        public String Latitude = null;
        public String Longitude = null;
        public String Resolution = null;
        public AuditAttributesFull AuditAttributes = null;

        public String getId() { return Id; }
        public PutAttachment setId(String value) { this.Id = value; return this; }
        public String getFileName() { return FileName; }
        public PutAttachment setFileName(String value) { this.FileName = value; return this; }
        public String getContentType() { return ContentType; }
        public PutAttachment setContentType(String value) { this.ContentType = value; return this; }
        public String getComment() { return Comment; }
        public PutAttachment setComment(String value) { this.Comment = value; return this; }
        public Integer getFileSize() { return FileSize; }
        public PutAttachment setFileSize(Integer value) { this.FileSize = value; return this; }
        public OffsetDateTime getDateTaken() { return DateTaken; }
        public PutAttachment setDateTaken(OffsetDateTime value) { this.DateTaken = value; return this; }
        public String getLatitude() { return Latitude; }
        public PutAttachment setLatitude(String value) { this.Latitude = value; return this; }
        public String getLongitude() { return Longitude; }
        public PutAttachment setLongitude(String value) { this.Longitude = value; return this; }
        public String getResolution() { return Resolution; }
        public PutAttachment setResolution(String value) { this.Resolution = value; return this; }
        public AuditAttributesFull getAuditAttributes() { return AuditAttributes; }
        public PutAttachment setAuditAttributes(AuditAttributesFull value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Attachment.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/attachments/{id}", Verbs="DELETE")
    public static class DeleteAttachment implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteAttachment setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/attachments/{id}/contents", Verbs="GET")
    public static class GetAttachmentContents implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetAttachmentContents setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/attachments/upload", Verbs="POST")
    public static class PostUploadAttachment implements IReturn<AttachmentRepresentation>
    {
        private static Object responseType = AttachmentRepresentation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/collectionmethods", Verbs="GET")
    public static class GetCollectionMethods implements IReturn<SearchResultCollectionMethod>
    {
        private static Object responseType = SearchResultCollectionMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/collectionmethods", Verbs="POST")
    public static class PostCollectionMethod implements IReturn<CollectionMethod>
    {
        public String Id = null;
        public String CustomId = null;
        public String IdentifierOrganization = null;
        public String Name = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostCollectionMethod setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostCollectionMethod setCustomId(String value) { this.CustomId = value; return this; }
        public String getIdentifierOrganization() { return IdentifierOrganization; }
        public PostCollectionMethod setIdentifierOrganization(String value) { this.IdentifierOrganization = value; return this; }
        public String getName() { return Name; }
        public PostCollectionMethod setName(String value) { this.Name = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostCollectionMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = CollectionMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/collectionmethods/{id}", Verbs="GET")
    public static class GetCollectionMethod implements IReturn<CollectionMethod>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetCollectionMethod setId(String value) { this.Id = value; return this; }
        private static Object responseType = CollectionMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/collectionmethods/{id}", Verbs="PUT")
    public static class PutCollectionMethod implements IReturn<CollectionMethod>
    {
        public String Id = null;
        public String CustomId = null;
        public String IdentifierOrganization = null;
        public String Name = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutCollectionMethod setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutCollectionMethod setCustomId(String value) { this.CustomId = value; return this; }
        public String getIdentifierOrganization() { return IdentifierOrganization; }
        public PutCollectionMethod setIdentifierOrganization(String value) { this.IdentifierOrganization = value; return this; }
        public String getName() { return Name; }
        public PutCollectionMethod setName(String value) { this.Name = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutCollectionMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = CollectionMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/collectionmethods/{id}", Verbs="DELETE")
    public static class DeleteCollectionMethod implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteCollectionMethod setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/collectionmethods/{id}/history", Verbs="GET")
    public static class GetCollectionMethodHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetCollectionMethodHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/detectionconditions", Verbs="GET")
    public static class GetDetectionconditions implements IReturn<SearchResultResultDetectionCondition>
    {
        private static Object responseType = SearchResultResultDetectionCondition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/detectionconditions", Verbs="POST")
    public static class PostDetectioncondition implements IReturn<ResultDetectionCondition>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostDetectioncondition setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostDetectioncondition setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostDetectioncondition setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostDetectioncondition setDescription(String value) { this.Description = value; return this; }
        public String getSystemCode() { return SystemCode; }
        public PostDetectioncondition setSystemCode(String value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostDetectioncondition setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ResultDetectionCondition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/detectionconditions/{id}", Verbs="GET")
    public static class GetDetectioncondition implements IReturn<ResultDetectionCondition>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetDetectioncondition setId(String value) { this.Id = value; return this; }
        private static Object responseType = ResultDetectionCondition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/detectionconditions/{id}", Verbs="PUT")
    public static class PutDetectioncondition implements IReturn<ResultDetectionCondition>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutDetectioncondition setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutDetectioncondition setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutDetectioncondition setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutDetectioncondition setDescription(String value) { this.Description = value; return this; }
        public String getSystemCode() { return SystemCode; }
        public PutDetectioncondition setSystemCode(String value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutDetectioncondition setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ResultDetectionCondition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/detectionconditions/{id}", Verbs="DELETE")
    public static class DeleteDetectioncondition implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteDetectioncondition setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/detectionconditions/{id}/history", Verbs="GET")
    public static class GetDetectionconditionHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetDetectionconditionHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes", Verbs="GET")
    public static class GetExtendedAttributes implements IReturn<SearchResultExtendedAttributeDefinition>
    {
        public AppliesToType AppliesToType = null;
        public String CustomId = null;
        public List<String> Ids = null;
        public Integer Limit = null;
        public List<String> Search = null;

        public AppliesToType getAppliesToType() { return AppliesToType; }
        public GetExtendedAttributes setAppliesToType(AppliesToType value) { this.AppliesToType = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetExtendedAttributes setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetExtendedAttributes setIds(List<String> value) { this.Ids = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetExtendedAttributes setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetExtendedAttributes setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultExtendedAttributeDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes", Verbs="POST")
    public static class PostExtendedAttribute implements IReturn<ExtendedAttributeDefinition>
    {
        public String Id = null;
        public String CustomId = null;
        public String Description = null;
        public DataType DataType = null;
        public AppliesToType AppliesToType = null;
        public String DefaultValue = null;
        public List<ExtendedAttributeListItem> DropDownListItems = null;
        public Boolean Mandatory = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostExtendedAttribute setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostExtendedAttribute setCustomId(String value) { this.CustomId = value; return this; }
        public String getDescription() { return Description; }
        public PostExtendedAttribute setDescription(String value) { this.Description = value; return this; }
        public DataType getDataType() { return DataType; }
        public PostExtendedAttribute setDataType(DataType value) { this.DataType = value; return this; }
        public AppliesToType getAppliesToType() { return AppliesToType; }
        public PostExtendedAttribute setAppliesToType(AppliesToType value) { this.AppliesToType = value; return this; }
        public String getDefaultValue() { return DefaultValue; }
        public PostExtendedAttribute setDefaultValue(String value) { this.DefaultValue = value; return this; }
        public List<ExtendedAttributeListItem> getDropDownListItems() { return DropDownListItems; }
        public PostExtendedAttribute setDropDownListItems(List<ExtendedAttributeListItem> value) { this.DropDownListItems = value; return this; }
        public Boolean getMandatory() { return Mandatory; }
        public PostExtendedAttribute setMandatory(Boolean value) { this.Mandatory = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostExtendedAttribute setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ExtendedAttributeDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes/{id}", Verbs="GET")
    public static class GetExtendedAttribute implements IReturn<ExtendedAttributeDefinition>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetExtendedAttribute setId(String value) { this.Id = value; return this; }
        private static Object responseType = ExtendedAttributeDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes/{id}", Verbs="PUT")
    public static class PutExtendedAttribute implements IReturn<ExtendedAttributeDefinition>
    {
        public String Id = null;
        public String CustomId = null;
        public String Description = null;
        public DataType DataType = null;
        public AppliesToType AppliesToType = null;
        public String DefaultValue = null;
        public List<ExtendedAttributeListItem> DropDownListItems = null;
        public Boolean Mandatory = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutExtendedAttribute setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutExtendedAttribute setCustomId(String value) { this.CustomId = value; return this; }
        public String getDescription() { return Description; }
        public PutExtendedAttribute setDescription(String value) { this.Description = value; return this; }
        public DataType getDataType() { return DataType; }
        public PutExtendedAttribute setDataType(DataType value) { this.DataType = value; return this; }
        public AppliesToType getAppliesToType() { return AppliesToType; }
        public PutExtendedAttribute setAppliesToType(AppliesToType value) { this.AppliesToType = value; return this; }
        public String getDefaultValue() { return DefaultValue; }
        public PutExtendedAttribute setDefaultValue(String value) { this.DefaultValue = value; return this; }
        public List<ExtendedAttributeListItem> getDropDownListItems() { return DropDownListItems; }
        public PutExtendedAttribute setDropDownListItems(List<ExtendedAttributeListItem> value) { this.DropDownListItems = value; return this; }
        public Boolean getMandatory() { return Mandatory; }
        public PutExtendedAttribute setMandatory(Boolean value) { this.Mandatory = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutExtendedAttribute setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ExtendedAttributeDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes/{id}", Verbs="DELETE")
    public static class DeleteExtendedAttribute implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteExtendedAttribute setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/extendedattributes/{id}/details", Verbs="GET")
    public static class GetExtendedAttributeDetails implements IReturn<ExtendedAttributeDefinition>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetExtendedAttributeDetails setId(String value) { this.Id = value; return this; }
        private static Object responseType = ExtendedAttributeDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes/{id}/dropdownlistitems", Verbs="GET")
    public static class GetExtendedAttributeDropdownlistitems implements IReturn<SearchResultExtendedAttributeListItem>
    {
        public String Id = null;
        public Integer Limit = null;
        public List<String> Search = null;

        public String getId() { return Id; }
        public GetExtendedAttributeDropdownlistitems setId(String value) { this.Id = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetExtendedAttributeDropdownlistitems setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetExtendedAttributeDropdownlistitems setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultExtendedAttributeListItem.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes/{id}/dropdownlistitems/{dropDownListItemId}", Verbs="GET")
    public static class GetExtendedAttributeDropdownlistitemListItem implements IReturn<ExtendedAttributeListItem>
    {
        public String Id = null;
        public String DropDownListItemId = null;

        public String getId() { return Id; }
        public GetExtendedAttributeDropdownlistitemListItem setId(String value) { this.Id = value; return this; }
        public String getDropDownListItemId() { return DropDownListItemId; }
        public GetExtendedAttributeDropdownlistitemListItem setDropDownListItemId(String value) { this.DropDownListItemId = value; return this; }
        private static Object responseType = ExtendedAttributeListItem.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/extendedattributes/{id}/history", Verbs="GET")
    public static class GetExtendedAttributeHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetExtendedAttributeHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldtrips", Verbs="GET")
    public static class GetFieldTrips implements IReturn<SearchResultFieldTripBasic>
    {
        public Integer Limit = null;
        public List<String> Search = null;

        public Integer getLimit() { return Limit; }
        public GetFieldTrips setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetFieldTrips setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultFieldTripBasic.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldtrips", Verbs="POST")
    public static class PostFieldTrip implements IReturn<FieldTrip>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<FieldVisit> FieldVisits = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostFieldTrip setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostFieldTrip setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PostFieldTrip setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PostFieldTrip setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public PostFieldTrip setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public PostFieldTrip setNotes(String value) { this.Notes = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PostFieldTrip setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<FieldVisit> getFieldVisits() { return FieldVisits; }
        public PostFieldTrip setFieldVisits(List<FieldVisit> value) { this.FieldVisits = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostFieldTrip setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = FieldTrip.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldtrips/{id}", Verbs="GET")
    public static class GetFieldTrip implements IReturn<FieldTrip>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFieldTrip setId(String value) { this.Id = value; return this; }
        private static Object responseType = FieldTrip.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldtrips/{id}", Verbs="PUT")
    public static class PutFieldTrip implements IReturn<FieldTrip>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<FieldVisit> FieldVisits = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutFieldTrip setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutFieldTrip setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PutFieldTrip setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PutFieldTrip setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public PutFieldTrip setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public PutFieldTrip setNotes(String value) { this.Notes = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PutFieldTrip setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<FieldVisit> getFieldVisits() { return FieldVisits; }
        public PutFieldTrip setFieldVisits(List<FieldVisit> value) { this.FieldVisits = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutFieldTrip setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = FieldTrip.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldtrips/{id}", Verbs="DELETE")
    public static class DeleteFieldTrip implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteFieldTrip setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/fieldtrips/{id}/history", Verbs="GET")
    public static class GetFieldTripHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFieldTripHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @DataContract
    @Route(Path="/v1/fieldvisits", Verbs="GET")
    public static class GetFieldVisits implements IReturn<SearchResultFieldVisitSimple>, IPaginatedRequest
    {
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "end-startTime")
        public Instant EndStartTime = null;
        @DataMember(Name = "fieldTripIds")
        public List<String> FieldTripIds = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "planningStatuses")
        public List<String> PlanningStatuses = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "samplingPlanIds")
        public List<String> SamplingPlanIds = null;
        @DataMember(Name = "scheduleIds")
        public List<String> ScheduleIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "start-startTime")
        public Instant StartStartTime = null;

        public String getCursor() { return Cursor; }
        public GetFieldVisits setCursor(String value) { this.Cursor = value; return this; }
        public Instant getEndStartTime() { return EndStartTime; }
        public GetFieldVisits setEndStartTime(Instant value) { this.EndStartTime = value; return this; }
        public List<String> getFieldTripIds() { return FieldTripIds; }
        public GetFieldVisits setFieldTripIds(List<String> value) { this.FieldTripIds = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetFieldVisits setIds(List<String> value) { this.Ids = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetFieldVisits setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getPlanningStatuses() { return PlanningStatuses; }
        public GetFieldVisits setPlanningStatuses(List<String> value) { this.PlanningStatuses = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetFieldVisits setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetFieldVisits setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSamplingPlanIds() { return SamplingPlanIds; }
        public GetFieldVisits setSamplingPlanIds(List<String> value) { this.SamplingPlanIds = value; return this; }
        public List<String> getScheduleIds() { return ScheduleIds; }
        public GetFieldVisits setScheduleIds(List<String> value) { this.ScheduleIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetFieldVisits setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetFieldVisits setSort(String value) { this.Sort = value; return this; }
        public Instant getStartStartTime() { return StartStartTime; }
        public GetFieldVisits setStartStartTime(Instant value) { this.StartStartTime = value; return this; }
        private static Object responseType = SearchResultFieldVisitSimple.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits", Verbs="POST")
    public static class PostFieldVisit implements IReturn<FieldVisit>
    {
        public String Id = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public FieldTripSimple FieldTrip = null;
        public ProjectSimple Project = null;
        public PlanningStatusType PlanningStatus = null;
        public SamplingLocation SamplingLocation = null;
        public List<PlannedFieldResult> PlannedFieldResults = null;
        public List<PlannedActivity> PlannedActivities = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public Schedule Schedule = null;
        public SamplingPlan SamplingPlan = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostFieldVisit setId(String value) { this.Id = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PostFieldVisit setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PostFieldVisit setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public PostFieldVisit setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public PostFieldVisit setNotes(String value) { this.Notes = value; return this; }
        public FieldTripSimple getFieldTrip() { return FieldTrip; }
        public PostFieldVisit setFieldTrip(FieldTripSimple value) { this.FieldTrip = value; return this; }
        public ProjectSimple getProject() { return Project; }
        public PostFieldVisit setProject(ProjectSimple value) { this.Project = value; return this; }
        public PlanningStatusType getPlanningStatus() { return PlanningStatus; }
        public PostFieldVisit setPlanningStatus(PlanningStatusType value) { this.PlanningStatus = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public PostFieldVisit setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public List<PlannedFieldResult> getPlannedFieldResults() { return PlannedFieldResults; }
        public PostFieldVisit setPlannedFieldResults(List<PlannedFieldResult> value) { this.PlannedFieldResults = value; return this; }
        public List<PlannedActivity> getPlannedActivities() { return PlannedActivities; }
        public PostFieldVisit setPlannedActivities(List<PlannedActivity> value) { this.PlannedActivities = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PostFieldVisit setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PostFieldVisit setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public Schedule getSchedule() { return Schedule; }
        public PostFieldVisit setSchedule(Schedule value) { this.Schedule = value; return this; }
        public SamplingPlan getSamplingPlan() { return SamplingPlan; }
        public PostFieldVisit setSamplingPlan(SamplingPlan value) { this.SamplingPlan = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostFieldVisit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = FieldVisit.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @DataContract
    @Route(Path="/v1/fieldvisits", Verbs="DELETE")
    public static class DeleteFieldVisits implements IReturnVoid
    {
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "end-startTime")
        public Instant EndStartTime = null;
        @DataMember(Name = "fieldTripIds")
        public List<String> FieldTripIds = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "planningStatuses")
        public List<String> PlanningStatuses = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "samplingPlanIds")
        public List<String> SamplingPlanIds = null;
        @DataMember(Name = "scheduleIds")
        public List<String> ScheduleIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "start-startTime")
        public Instant StartStartTime = null;

        public String getCursor() { return Cursor; }
        public DeleteFieldVisits setCursor(String value) { this.Cursor = value; return this; }
        public Instant getEndStartTime() { return EndStartTime; }
        public DeleteFieldVisits setEndStartTime(Instant value) { this.EndStartTime = value; return this; }
        public List<String> getFieldTripIds() { return FieldTripIds; }
        public DeleteFieldVisits setFieldTripIds(List<String> value) { this.FieldTripIds = value; return this; }
        public List<String> getIds() { return Ids; }
        public DeleteFieldVisits setIds(List<String> value) { this.Ids = value; return this; }
        public Integer getLimit() { return Limit; }
        public DeleteFieldVisits setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getPlanningStatuses() { return PlanningStatuses; }
        public DeleteFieldVisits setPlanningStatuses(List<String> value) { this.PlanningStatuses = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public DeleteFieldVisits setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public DeleteFieldVisits setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSamplingPlanIds() { return SamplingPlanIds; }
        public DeleteFieldVisits setSamplingPlanIds(List<String> value) { this.SamplingPlanIds = value; return this; }
        public List<String> getScheduleIds() { return ScheduleIds; }
        public DeleteFieldVisits setScheduleIds(List<String> value) { this.ScheduleIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public DeleteFieldVisits setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public DeleteFieldVisits setSort(String value) { this.Sort = value; return this; }
        public Instant getStartStartTime() { return StartStartTime; }
        public DeleteFieldVisits setStartStartTime(Instant value) { this.StartStartTime = value; return this; }
    }

    @Route(Path="/v1/fieldvisits/{fieldVisitId}/addorupdateindex", Verbs="PUT")
    public static class PutAddOrUpdateIndex implements IReturn<ActivityWithDetails>
    {
        public String FieldVisitId = null;
        public String IndexConfigId = null;

        public String getFieldVisitId() { return FieldVisitId; }
        public PutAddOrUpdateIndex setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getIndexConfigId() { return IndexConfigId; }
        public PutAddOrUpdateIndex setIndexConfigId(String value) { this.IndexConfigId = value; return this; }
        private static Object responseType = ActivityWithDetails.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits/{id}", Verbs="GET")
    public static class GetFieldVisit implements IReturn<FieldVisit>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFieldVisit setId(String value) { this.Id = value; return this; }
        private static Object responseType = FieldVisit.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits/{id}", Verbs="PUT")
    public static class PutFieldVisit implements IReturn<FieldVisit>
    {
        public String Id = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public FieldTripSimple FieldTrip = null;
        public ProjectSimple Project = null;
        public PlanningStatusType PlanningStatus = null;
        public SamplingLocation SamplingLocation = null;
        public List<PlannedFieldResult> PlannedFieldResults = null;
        public List<PlannedActivity> PlannedActivities = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public Schedule Schedule = null;
        public SamplingPlan SamplingPlan = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutFieldVisit setId(String value) { this.Id = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PutFieldVisit setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PutFieldVisit setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public PutFieldVisit setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public PutFieldVisit setNotes(String value) { this.Notes = value; return this; }
        public FieldTripSimple getFieldTrip() { return FieldTrip; }
        public PutFieldVisit setFieldTrip(FieldTripSimple value) { this.FieldTrip = value; return this; }
        public ProjectSimple getProject() { return Project; }
        public PutFieldVisit setProject(ProjectSimple value) { this.Project = value; return this; }
        public PlanningStatusType getPlanningStatus() { return PlanningStatus; }
        public PutFieldVisit setPlanningStatus(PlanningStatusType value) { this.PlanningStatus = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public PutFieldVisit setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public List<PlannedFieldResult> getPlannedFieldResults() { return PlannedFieldResults; }
        public PutFieldVisit setPlannedFieldResults(List<PlannedFieldResult> value) { this.PlannedFieldResults = value; return this; }
        public List<PlannedActivity> getPlannedActivities() { return PlannedActivities; }
        public PutFieldVisit setPlannedActivities(List<PlannedActivity> value) { this.PlannedActivities = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PutFieldVisit setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PutFieldVisit setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public Schedule getSchedule() { return Schedule; }
        public PutFieldVisit setSchedule(Schedule value) { this.Schedule = value; return this; }
        public SamplingPlan getSamplingPlan() { return SamplingPlan; }
        public PutFieldVisit setSamplingPlan(SamplingPlan value) { this.SamplingPlan = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutFieldVisit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = FieldVisit.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits/{id}", Verbs="DELETE")
    public static class DeleteFieldVisit implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteFieldVisit setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/fieldvisits/{id}/activityfromplannedactivity", Verbs="POST")
    public static class PostFieldVisitActivityFromPlannedActivity implements IReturn<Activity>
    {
        public String Id = null;
        public ActivityTemplate ActivityTemplate = null;
        public String Instruction = null;
        public PlannedActivityActivityType ActivityType = null;
        public MediumType Medium = null;
        public CollectionMethod CollectionMethod = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostFieldVisitActivityFromPlannedActivity setId(String value) { this.Id = value; return this; }
        public ActivityTemplate getActivityTemplate() { return ActivityTemplate; }
        public PostFieldVisitActivityFromPlannedActivity setActivityTemplate(ActivityTemplate value) { this.ActivityTemplate = value; return this; }
        public String getInstruction() { return Instruction; }
        public PostFieldVisitActivityFromPlannedActivity setInstruction(String value) { this.Instruction = value; return this; }
        public PlannedActivityActivityType getActivityType() { return ActivityType; }
        public PostFieldVisitActivityFromPlannedActivity setActivityType(PlannedActivityActivityType value) { this.ActivityType = value; return this; }
        public MediumType getMedium() { return Medium; }
        public PostFieldVisitActivityFromPlannedActivity setMedium(MediumType value) { this.Medium = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PostFieldVisitActivityFromPlannedActivity setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostFieldVisitActivityFromPlannedActivity setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Activity.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits/{id}/activitywithtemplate", Verbs="POST")
    public static class PostFieldVisitActivityWithTemplate implements IReturn<Activity>
    {
        public String Id = null;
        public List<SpecimenTemplate> SpecimenTemplates = null;
        public String CustomId = null;
        public ActivityTemplateType Type = null;
        public String Comment = null;
        public MediumType Medium = null;
        public Quantity Depth = null;
        public CollectionMethod CollectionMethod = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostFieldVisitActivityWithTemplate setId(String value) { this.Id = value; return this; }
        public List<SpecimenTemplate> getSpecimenTemplates() { return SpecimenTemplates; }
        public PostFieldVisitActivityWithTemplate setSpecimenTemplates(List<SpecimenTemplate> value) { this.SpecimenTemplates = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostFieldVisitActivityWithTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public ActivityTemplateType getType() { return Type; }
        public PostFieldVisitActivityWithTemplate setType(ActivityTemplateType value) { this.Type = value; return this; }
        public String getComment() { return Comment; }
        public PostFieldVisitActivityWithTemplate setComment(String value) { this.Comment = value; return this; }
        public MediumType getMedium() { return Medium; }
        public PostFieldVisitActivityWithTemplate setMedium(MediumType value) { this.Medium = value; return this; }
        public Quantity getDepth() { return Depth; }
        public PostFieldVisitActivityWithTemplate setDepth(Quantity value) { this.Depth = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PostFieldVisitActivityWithTemplate setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostFieldVisitActivityWithTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Activity.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits/{id}/attachments", Verbs="GET")
    public static class GetFieldVisitAttachments implements IReturn<SearchResultAttachment>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFieldVisitAttachments setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAttachment.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits/{id}/history", Verbs="GET")
    public static class GetFieldVisitHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFieldVisitHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/fieldvisits/{id}/statistics", Verbs="GET")
    public static class GetFieldVisitStatistics implements IReturn<FieldVisitStatistics>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFieldVisitStatistics setId(String value) { this.Id = value; return this; }
        private static Object responseType = FieldVisitStatistics.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/filters", Verbs="GET")
    public static class GetFilters implements IReturn<SearchResultFilter>
    {
        private static Object responseType = SearchResultFilter.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/filters", Verbs="POST")
    public static class PostFilter implements IReturn<Filter>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<SamplingLocation> SamplingLocations = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostFilter setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostFilter setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PostFilter setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PostFilter setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public PostFilter setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<SamplingLocation> getSamplingLocations() { return SamplingLocations; }
        public PostFilter setSamplingLocations(List<SamplingLocation> value) { this.SamplingLocations = value; return this; }
        public String getDescription() { return Description; }
        public PostFilter setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostFilter setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Filter.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/filters/{id}", Verbs="GET")
    public static class GetFilter implements IReturn<Filter>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFilter setId(String value) { this.Id = value; return this; }
        private static Object responseType = Filter.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/filters/{id}", Verbs="PUT")
    public static class PutFilter implements IReturn<Filter>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<SamplingLocation> SamplingLocations = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutFilter setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutFilter setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PutFilter setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PutFilter setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public PutFilter setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<SamplingLocation> getSamplingLocations() { return SamplingLocations; }
        public PutFilter setSamplingLocations(List<SamplingLocation> value) { this.SamplingLocations = value; return this; }
        public String getDescription() { return Description; }
        public PutFilter setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutFilter setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Filter.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/filters/{id}", Verbs="DELETE")
    public static class DeleteFilter implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteFilter setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/filters/{id}/history", Verbs="GET")
    public static class GetFilterHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetFilterHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labanalysismethods", Verbs="GET")
    public static class GetLabAnalysisMethods implements IReturn<SearchResultAnalysisMethod>
    {
        public String Context = null;
        public Integer Limit = null;
        public List<String> ObservedPropertyIds = null;
        public List<String> Search = null;

        public String getContext() { return Context; }
        public GetLabAnalysisMethods setContext(String value) { this.Context = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetLabAnalysisMethods setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetLabAnalysisMethods setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetLabAnalysisMethods setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultAnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labanalysismethods", Verbs="POST")
    public static class PostLabAnalysisMethod implements IReturn<AnalysisMethod>
    {
        public String Id = null;
        public String MethodId = null;
        public String Name = null;
        public String Context = null;
        public String Description = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostLabAnalysisMethod setId(String value) { this.Id = value; return this; }
        public String getMethodId() { return MethodId; }
        public PostLabAnalysisMethod setMethodId(String value) { this.MethodId = value; return this; }
        public String getName() { return Name; }
        public PostLabAnalysisMethod setName(String value) { this.Name = value; return this; }
        public String getContext() { return Context; }
        public PostLabAnalysisMethod setContext(String value) { this.Context = value; return this; }
        public String getDescription() { return Description; }
        public PostLabAnalysisMethod setDescription(String value) { this.Description = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public PostLabAnalysisMethod setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PostLabAnalysisMethod setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostLabAnalysisMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labanalysismethods/{id}", Verbs="GET")
    public static class GetLabAnalysisMethod implements IReturn<AnalysisMethod>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetLabAnalysisMethod setId(String value) { this.Id = value; return this; }
        private static Object responseType = AnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labanalysismethods/{id}", Verbs="PUT")
    public static class PutLabAnalysisMethod implements IReturn<AnalysisMethod>
    {
        public String Id = null;
        public String MethodId = null;
        public String Name = null;
        public String Context = null;
        public String Description = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutLabAnalysisMethod setId(String value) { this.Id = value; return this; }
        public String getMethodId() { return MethodId; }
        public PutLabAnalysisMethod setMethodId(String value) { this.MethodId = value; return this; }
        public String getName() { return Name; }
        public PutLabAnalysisMethod setName(String value) { this.Name = value; return this; }
        public String getContext() { return Context; }
        public PutLabAnalysisMethod setContext(String value) { this.Context = value; return this; }
        public String getDescription() { return Description; }
        public PutLabAnalysisMethod setDescription(String value) { this.Description = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public PutLabAnalysisMethod setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PutLabAnalysisMethod setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutLabAnalysisMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = AnalysisMethod.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labanalysismethods/{id}", Verbs="DELETE")
    public static class DeleteLabAnalysisMethod implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteLabAnalysisMethod setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/labanalysismethods/{id}/history", Verbs="GET")
    public static class GetLabAnalysisMethodHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetLabAnalysisMethodHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/laboratories", Verbs="GET")
    public static class GetLaboratories implements IReturn<SearchResultLaboratory>
    {
        private static Object responseType = SearchResultLaboratory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/laboratories", Verbs="POST")
    public static class PostLaboratory implements IReturn<Laboratory>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String Address = null;
        public String PointOfContact = null;
        public String EmailAddress = null;
        public String PhoneNumber = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostLaboratory setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostLaboratory setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostLaboratory setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostLaboratory setDescription(String value) { this.Description = value; return this; }
        public String getAddress() { return Address; }
        public PostLaboratory setAddress(String value) { this.Address = value; return this; }
        public String getPointOfContact() { return PointOfContact; }
        public PostLaboratory setPointOfContact(String value) { this.PointOfContact = value; return this; }
        public String getEmailAddress() { return EmailAddress; }
        public PostLaboratory setEmailAddress(String value) { this.EmailAddress = value; return this; }
        public String getPhoneNumber() { return PhoneNumber; }
        public PostLaboratory setPhoneNumber(String value) { this.PhoneNumber = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostLaboratory setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Laboratory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/laboratories/{id}", Verbs="GET")
    public static class GetLaboratory implements IReturn<Laboratory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetLaboratory setId(String value) { this.Id = value; return this; }
        private static Object responseType = Laboratory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/laboratories/{id}", Verbs="PUT")
    public static class PutLaboratory implements IReturn<Laboratory>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String Address = null;
        public String PointOfContact = null;
        public String EmailAddress = null;
        public String PhoneNumber = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutLaboratory setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutLaboratory setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutLaboratory setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutLaboratory setDescription(String value) { this.Description = value; return this; }
        public String getAddress() { return Address; }
        public PutLaboratory setAddress(String value) { this.Address = value; return this; }
        public String getPointOfContact() { return PointOfContact; }
        public PutLaboratory setPointOfContact(String value) { this.PointOfContact = value; return this; }
        public String getEmailAddress() { return EmailAddress; }
        public PutLaboratory setEmailAddress(String value) { this.EmailAddress = value; return this; }
        public String getPhoneNumber() { return PhoneNumber; }
        public PutLaboratory setPhoneNumber(String value) { this.PhoneNumber = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutLaboratory setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Laboratory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/laboratories/{id}", Verbs="DELETE")
    public static class DeleteLaboratory implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteLaboratory setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/laboratories/{id}/history", Verbs="GET")
    public static class GetLaboratoryHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetLaboratoryHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labreportimporthistoryevents", Verbs="GET")
    public static class GetLabReportImportHistoryEvents implements IReturn<SearchResultLabReportImportHistoryEvent>, IPaginatedRequest
    {
        public String Cursor = null;
        public List<String> LabReportIds = null;
        public Integer Limit = null;
        public String Sort = null;

        public String getCursor() { return Cursor; }
        public GetLabReportImportHistoryEvents setCursor(String value) { this.Cursor = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public GetLabReportImportHistoryEvents setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetLabReportImportHistoryEvents setLimit(Integer value) { this.Limit = value; return this; }
        public String getSort() { return Sort; }
        public GetLabReportImportHistoryEvents setSort(String value) { this.Sort = value; return this; }
        private static Object responseType = SearchResultLabReportImportHistoryEvent.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labreports", Verbs="GET")
    public static class GetLabReports implements IReturn<SearchResultLabReport>
    {
        public String CustomId = null;
        public List<String> LaboratoryIds = null;
        public Integer Limit = null;
        public List<String> Search = null;

        public String getCustomId() { return CustomId; }
        public GetLabReports setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getLaboratoryIds() { return LaboratoryIds; }
        public GetLabReports setLaboratoryIds(List<String> value) { this.LaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetLabReports setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetLabReports setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultLabReport.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labreports", Verbs="POST")
    public static class PostLabReport implements IReturn<LabReport>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime DateReceived = null;
        public String CaseNarrative = null;
        public String QcSummary = null;
        public Laboratory Laboratory = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<DomainObjectAttachment> Attachments = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostLabReport setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostLabReport setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getDateReceived() { return DateReceived; }
        public PostLabReport setDateReceived(OffsetDateTime value) { this.DateReceived = value; return this; }
        public String getCaseNarrative() { return CaseNarrative; }
        public PostLabReport setCaseNarrative(String value) { this.CaseNarrative = value; return this; }
        public String getQcSummary() { return QcSummary; }
        public PostLabReport setQcSummary(String value) { this.QcSummary = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public PostLabReport setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PostLabReport setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PostLabReport setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostLabReport setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = LabReport.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labreports/{id}", Verbs="GET")
    public static class GetLabReport implements IReturn<LabReport>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetLabReport setId(String value) { this.Id = value; return this; }
        private static Object responseType = LabReport.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labreports/{id}", Verbs="PUT")
    public static class PutLabReport implements IReturn<LabReport>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime DateReceived = null;
        public String CaseNarrative = null;
        public String QcSummary = null;
        public Laboratory Laboratory = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<DomainObjectAttachment> Attachments = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutLabReport setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutLabReport setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getDateReceived() { return DateReceived; }
        public PutLabReport setDateReceived(OffsetDateTime value) { this.DateReceived = value; return this; }
        public String getCaseNarrative() { return CaseNarrative; }
        public PutLabReport setCaseNarrative(String value) { this.CaseNarrative = value; return this; }
        public String getQcSummary() { return QcSummary; }
        public PutLabReport setQcSummary(String value) { this.QcSummary = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public PutLabReport setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PutLabReport setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PutLabReport setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutLabReport setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = LabReport.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/labreports/{id}", Verbs="DELETE")
    public static class DeleteLabReport implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteLabReport setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/labreports/{id}/history", Verbs="GET")
    public static class GetLabReportHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetLabReportHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/mediums", Verbs="GET")
    public static class GetMediums implements IReturn<SearchResultMedium>
    {
        private static Object responseType = SearchResultMedium.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/mediums", Verbs="PUT")
    public static class PutMediums implements IReturn<List<Medium>>
    {
        private static Object responseType = new TypeToken<List<Medium>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/mediums/{id}/history", Verbs="GET")
    public static class GetMediumHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetMediumHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/nullmeasurequalifiers", Verbs="GET")
    public static class GetNullMeasureQualifiers implements IReturn<SearchResultNullMeasureQualifier>
    {
        private static Object responseType = SearchResultNullMeasureQualifier.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/nullmeasurequalifiers", Verbs="POST")
    public static class PostNullMeasureQualifier implements IReturn<NullMeasureQualifier>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostNullMeasureQualifier setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostNullMeasureQualifier setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostNullMeasureQualifier setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostNullMeasureQualifier setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostNullMeasureQualifier setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = NullMeasureQualifier.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/nullmeasurequalifiers/{id}", Verbs="GET")
    public static class GetNullMeasureQualifier implements IReturn<NullMeasureQualifier>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetNullMeasureQualifier setId(String value) { this.Id = value; return this; }
        private static Object responseType = NullMeasureQualifier.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/nullmeasurequalifiers/{id}", Verbs="PUT")
    public static class PutNullMeasureQualifier implements IReturn<NullMeasureQualifier>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutNullMeasureQualifier setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutNullMeasureQualifier setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutNullMeasureQualifier setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutNullMeasureQualifier setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutNullMeasureQualifier setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = NullMeasureQualifier.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/nullmeasurequalifiers/{id}", Verbs="DELETE")
    public static class DeleteNullMeasureQualifier implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteNullMeasureQualifier setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/nullmeasurequalifiers/{id}/history", Verbs="GET")
    public static class GetNullMeasureQualifierHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetNullMeasureQualifierHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties", Verbs="GET")
    public static class GetObservedProperties implements IReturn<SearchResultObservedProperty>
    {
        public List<String> AnalysisTypes = null;
        public String CustomId = null;
        public Integer Limit = null;
        public List<String> ResultTypes = null;
        public List<String> Search = null;

        public List<String> getAnalysisTypes() { return AnalysisTypes; }
        public GetObservedProperties setAnalysisTypes(List<String> value) { this.AnalysisTypes = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetObservedProperties setCustomId(String value) { this.CustomId = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetObservedProperties setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getResultTypes() { return ResultTypes; }
        public GetObservedProperties setResultTypes(List<String> value) { this.ResultTypes = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetObservedProperties setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultObservedProperty.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties", Verbs="POST")
    public static class PostObservedProperty implements IReturn<ObservedProperty>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public ResultType ResultType = null;
        public AnalysisType AnalysisType = null;
        public UnitGroup UnitGroup = null;
        public Unit DefaultUnit = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public String CasNumber = null;
        public Quantity LowerLimit = null;
        public Quantity UpperLimit = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostObservedProperty setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostObservedProperty setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostObservedProperty setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostObservedProperty setDescription(String value) { this.Description = value; return this; }
        public ResultType getResultType() { return ResultType; }
        public PostObservedProperty setResultType(ResultType value) { this.ResultType = value; return this; }
        public AnalysisType getAnalysisType() { return AnalysisType; }
        public PostObservedProperty setAnalysisType(AnalysisType value) { this.AnalysisType = value; return this; }
        public UnitGroup getUnitGroup() { return UnitGroup; }
        public PostObservedProperty setUnitGroup(UnitGroup value) { this.UnitGroup = value; return this; }
        public Unit getDefaultUnit() { return DefaultUnit; }
        public PostObservedProperty setDefaultUnit(Unit value) { this.DefaultUnit = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PostObservedProperty setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public String getCasNumber() { return CasNumber; }
        public PostObservedProperty setCasNumber(String value) { this.CasNumber = value; return this; }
        public Quantity getLowerLimit() { return LowerLimit; }
        public PostObservedProperty setLowerLimit(Quantity value) { this.LowerLimit = value; return this; }
        public Quantity getUpperLimit() { return UpperLimit; }
        public PostObservedProperty setUpperLimit(Quantity value) { this.UpperLimit = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostObservedProperty setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ObservedProperty.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties/{id}", Verbs="GET")
    public static class GetObservedProperty implements IReturn<ObservedProperty>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetObservedProperty setId(String value) { this.Id = value; return this; }
        private static Object responseType = ObservedProperty.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties/{id}", Verbs="PUT")
    public static class PutObservedProperty implements IReturn<ObservedProperty>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public ResultType ResultType = null;
        public AnalysisType AnalysisType = null;
        public UnitGroup UnitGroup = null;
        public Unit DefaultUnit = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public String CasNumber = null;
        public Quantity LowerLimit = null;
        public Quantity UpperLimit = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutObservedProperty setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutObservedProperty setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutObservedProperty setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutObservedProperty setDescription(String value) { this.Description = value; return this; }
        public ResultType getResultType() { return ResultType; }
        public PutObservedProperty setResultType(ResultType value) { this.ResultType = value; return this; }
        public AnalysisType getAnalysisType() { return AnalysisType; }
        public PutObservedProperty setAnalysisType(AnalysisType value) { this.AnalysisType = value; return this; }
        public UnitGroup getUnitGroup() { return UnitGroup; }
        public PutObservedProperty setUnitGroup(UnitGroup value) { this.UnitGroup = value; return this; }
        public Unit getDefaultUnit() { return DefaultUnit; }
        public PutObservedProperty setDefaultUnit(Unit value) { this.DefaultUnit = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PutObservedProperty setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public String getCasNumber() { return CasNumber; }
        public PutObservedProperty setCasNumber(String value) { this.CasNumber = value; return this; }
        public Quantity getLowerLimit() { return LowerLimit; }
        public PutObservedProperty setLowerLimit(Quantity value) { this.LowerLimit = value; return this; }
        public Quantity getUpperLimit() { return UpperLimit; }
        public PutObservedProperty setUpperLimit(Quantity value) { this.UpperLimit = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutObservedProperty setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ObservedProperty.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties/{id}", Verbs="DELETE")
    public static class DeleteObservedProperty implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteObservedProperty setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/observedproperties/{id}/categoricalvalues", Verbs="GET")
    public static class GetObservedPropertyCategoricalValues implements IReturn<SearchResultCategoricalValue>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetObservedPropertyCategoricalValues setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultCategoricalValue.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties/{id}/categoricalvalues", Verbs="POST")
    public static class PostObservedPropertyCategoricalValue implements IReturn<List<CategoricalValue>>
    {
        public String Id = null;

        public String getId() { return Id; }
        public PostObservedPropertyCategoricalValue setId(String value) { this.Id = value; return this; }
        private static Object responseType = new TypeToken<List<CategoricalValue>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties/{id}/categoricalvalues", Verbs="PUT")
    public static class PutObservedPropertyCategoricalValues implements IReturn<List<CategoricalValue>>
    {
        public String Id = null;

        public String getId() { return Id; }
        public PutObservedPropertyCategoricalValues setId(String value) { this.Id = value; return this; }
        private static Object responseType = new TypeToken<List<CategoricalValue>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/observedproperties/{id}/categoricalvalues", Verbs="DELETE")
    public static class DeleteObservedPropertyCategoricalValues implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteObservedPropertyCategoricalValues setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/observedproperties/{id}/history", Verbs="GET")
    public static class GetObservedPropertyHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetObservedPropertyHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/projects", Verbs="GET")
    public static class GetProjects implements IReturn<SearchResultProject>
    {
        private static Object responseType = SearchResultProject.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/projects", Verbs="POST")
    public static class PostProject implements IReturn<Project>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public ProjectType Type = null;
        public String Description = null;
        public String ScopeStatement = null;
        public Boolean Approved = null;
        public String ApprovalAgency = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostProject setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostProject setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostProject setName(String value) { this.Name = value; return this; }
        public ProjectType getType() { return Type; }
        public PostProject setType(ProjectType value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public PostProject setDescription(String value) { this.Description = value; return this; }
        public String getScopeStatement() { return ScopeStatement; }
        public PostProject setScopeStatement(String value) { this.ScopeStatement = value; return this; }
        public Boolean getApproved() { return Approved; }
        public PostProject setApproved(Boolean value) { this.Approved = value; return this; }
        public String getApprovalAgency() { return ApprovalAgency; }
        public PostProject setApprovalAgency(String value) { this.ApprovalAgency = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PostProject setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PostProject setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostProject setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Project.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/projects/{id}", Verbs="GET")
    public static class GetProject implements IReturn<Project>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetProject setId(String value) { this.Id = value; return this; }
        private static Object responseType = Project.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/projects/{id}", Verbs="PUT")
    public static class PutProject implements IReturn<Project>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public ProjectType Type = null;
        public String Description = null;
        public String ScopeStatement = null;
        public Boolean Approved = null;
        public String ApprovalAgency = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutProject setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutProject setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutProject setName(String value) { this.Name = value; return this; }
        public ProjectType getType() { return Type; }
        public PutProject setType(ProjectType value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public PutProject setDescription(String value) { this.Description = value; return this; }
        public String getScopeStatement() { return ScopeStatement; }
        public PutProject setScopeStatement(String value) { this.ScopeStatement = value; return this; }
        public Boolean getApproved() { return Approved; }
        public PutProject setApproved(Boolean value) { this.Approved = value; return this; }
        public String getApprovalAgency() { return ApprovalAgency; }
        public PutProject setApprovalAgency(String value) { this.ApprovalAgency = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public PutProject setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public PutProject setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutProject setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Project.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/projects/{id}", Verbs="DELETE")
    public static class DeleteProject implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteProject setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/projects/{id}/history", Verbs="GET")
    public static class GetProjectHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetProjectHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/resultgrades", Verbs="GET")
    public static class GetResultGrades implements IReturn<SearchResultResultGrade>
    {
        private static Object responseType = SearchResultResultGrade.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/resultgrades", Verbs="PUT")
    public static class PutResultGrades implements IReturn<List<ResultGrade>>
    {
        private static Object responseType = new TypeToken<List<ResultGrade>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/resultgrades/{id}/history", Verbs="GET")
    public static class GetResultGradeHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetResultGradeHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/resultstatuses", Verbs="GET")
    public static class GetResultStatuses implements IReturn<SearchResultResultStatus>
    {
        private static Object responseType = SearchResultResultStatus.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/resultstatuses", Verbs="PUT")
    public static class PutResultStatuses implements IReturn<List<ResultStatus>>
    {
        private static Object responseType = new TypeToken<List<ResultStatus>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/resultstatuses/{id}/history", Verbs="GET")
    public static class GetResultStatuseHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetResultStatuseHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgroups", Verbs="GET")
    public static class GetSamplingLocationGroups implements IReturn<SearchResultSamplingLocationGroup>
    {
        private static Object responseType = SearchResultSamplingLocationGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgroups", Verbs="POST")
    public static class PostSamplingLocationGroup implements IReturn<SamplingLocationGroup>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public LocationGroupType LocationGroupType = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostSamplingLocationGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PostSamplingLocationGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostSamplingLocationGroup setDescription(String value) { this.Description = value; return this; }
        public LocationGroupType getLocationGroupType() { return LocationGroupType; }
        public PostSamplingLocationGroup setLocationGroupType(LocationGroupType value) { this.LocationGroupType = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostSamplingLocationGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SamplingLocationGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgroups/{id}", Verbs="GET")
    public static class GetSamplingLocationGroup implements IReturn<SamplingLocationGroup>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocationGroup setId(String value) { this.Id = value; return this; }
        private static Object responseType = SamplingLocationGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgroups/{id}", Verbs="PUT")
    public static class PutSamplingLocationGroup implements IReturn<SamplingLocationGroup>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public LocationGroupType LocationGroupType = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutSamplingLocationGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PutSamplingLocationGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutSamplingLocationGroup setDescription(String value) { this.Description = value; return this; }
        public LocationGroupType getLocationGroupType() { return LocationGroupType; }
        public PutSamplingLocationGroup setLocationGroupType(LocationGroupType value) { this.LocationGroupType = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutSamplingLocationGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SamplingLocationGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgroups/{id}", Verbs="DELETE")
    public static class DeleteSamplingLocationGroup implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteSamplingLocationGroup setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/samplinglocationgroups/{id}/history", Verbs="GET")
    public static class GetSamplingLocationGroupHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocationGroupHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgrouptypes", Verbs="GET")
    public static class GetSamplinglocationgrouptypes implements IReturn<SearchResultLocationGroupType>
    {
        private static Object responseType = SearchResultLocationGroupType.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgrouptypes", Verbs="PUT")
    public static class PutSamplinglocationgrouptypes implements IReturn<List<LocationGroupType>>
    {
        private static Object responseType = new TypeToken<List<LocationGroupType>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationgrouptypes/{id}/history", Verbs="GET")
    public static class GetSamplinglocationgrouptypeHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplinglocationgrouptypeHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations", Verbs="GET")
    public static class GetSamplingLocations implements IReturn<SearchResultSamplingLocation>, IPaginatedRequest
    {
        public String Cursor = null;
        public String CustomId = null;
        public Instant EndModificationTime = null;
        public Integer Limit = null;
        public List<String> LocationGroupTypeIds = null;
        public List<String> LocationTypeIds = null;
        public List<String> SamplingLocationGroupIds = null;
        public List<String> Search = null;
        public String Sort = null;
        public Instant StartModificationTime = null;

        public String getCursor() { return Cursor; }
        public GetSamplingLocations setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetSamplingLocations setCustomId(String value) { this.CustomId = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetSamplingLocations setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetSamplingLocations setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getLocationGroupTypeIds() { return LocationGroupTypeIds; }
        public GetSamplingLocations setLocationGroupTypeIds(List<String> value) { this.LocationGroupTypeIds = value; return this; }
        public List<String> getLocationTypeIds() { return LocationTypeIds; }
        public GetSamplingLocations setLocationTypeIds(List<String> value) { this.LocationTypeIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetSamplingLocations setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetSamplingLocations setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetSamplingLocations setSort(String value) { this.Sort = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetSamplingLocations setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        private static Object responseType = SearchResultSamplingLocation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations", Verbs="POST")
    public static class PostSamplingLocation implements IReturn<SamplingLocation>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public LocationType Type = null;
        public String Latitude = null;
        public String Longitude = null;
        public String HorizontalDatum = null;
        public String VerticalDatum = null;
        public String HorizontalCollectionMethod = null;
        public String VerticalCollectionMethod = null;
        public String Description = null;
        public Address Address = null;
        public Quantity Elevation = null;
        public TimeZone TimeZone = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<StandardSimple> Standards = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<SamplingLocationGroup> SamplingLocationGroups = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostSamplingLocation setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostSamplingLocation setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostSamplingLocation setName(String value) { this.Name = value; return this; }
        public LocationType getType() { return Type; }
        public PostSamplingLocation setType(LocationType value) { this.Type = value; return this; }
        public String getLatitude() { return Latitude; }
        public PostSamplingLocation setLatitude(String value) { this.Latitude = value; return this; }
        public String getLongitude() { return Longitude; }
        public PostSamplingLocation setLongitude(String value) { this.Longitude = value; return this; }
        public String getHorizontalDatum() { return HorizontalDatum; }
        public PostSamplingLocation setHorizontalDatum(String value) { this.HorizontalDatum = value; return this; }
        public String getVerticalDatum() { return VerticalDatum; }
        public PostSamplingLocation setVerticalDatum(String value) { this.VerticalDatum = value; return this; }
        public String getHorizontalCollectionMethod() { return HorizontalCollectionMethod; }
        public PostSamplingLocation setHorizontalCollectionMethod(String value) { this.HorizontalCollectionMethod = value; return this; }
        public String getVerticalCollectionMethod() { return VerticalCollectionMethod; }
        public PostSamplingLocation setVerticalCollectionMethod(String value) { this.VerticalCollectionMethod = value; return this; }
        public String getDescription() { return Description; }
        public PostSamplingLocation setDescription(String value) { this.Description = value; return this; }
        public Address getAddress() { return Address; }
        public PostSamplingLocation setAddress(Address value) { this.Address = value; return this; }
        public Quantity getElevation() { return Elevation; }
        public PostSamplingLocation setElevation(Quantity value) { this.Elevation = value; return this; }
        public TimeZone getTimeZone() { return TimeZone; }
        public PostSamplingLocation setTimeZone(TimeZone value) { this.TimeZone = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PostSamplingLocation setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<StandardSimple> getStandards() { return Standards; }
        public PostSamplingLocation setStandards(List<StandardSimple> value) { this.Standards = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PostSamplingLocation setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<SamplingLocationGroup> getSamplingLocationGroups() { return SamplingLocationGroups; }
        public PostSamplingLocation setSamplingLocationGroups(List<SamplingLocationGroup> value) { this.SamplingLocationGroups = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PostSamplingLocation setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostSamplingLocation setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SamplingLocation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations/{id}", Verbs="GET")
    public static class GetSamplingLocation implements IReturn<SamplingLocation>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocation setId(String value) { this.Id = value; return this; }
        private static Object responseType = SamplingLocation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations/{id}", Verbs="PUT")
    public static class PutSamplingLocation implements IReturn<SamplingLocation>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public LocationType Type = null;
        public String Latitude = null;
        public String Longitude = null;
        public String HorizontalDatum = null;
        public String VerticalDatum = null;
        public String HorizontalCollectionMethod = null;
        public String VerticalCollectionMethod = null;
        public String Description = null;
        public Address Address = null;
        public Quantity Elevation = null;
        public TimeZone TimeZone = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<StandardSimple> Standards = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<SamplingLocationGroup> SamplingLocationGroups = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutSamplingLocation setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutSamplingLocation setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutSamplingLocation setName(String value) { this.Name = value; return this; }
        public LocationType getType() { return Type; }
        public PutSamplingLocation setType(LocationType value) { this.Type = value; return this; }
        public String getLatitude() { return Latitude; }
        public PutSamplingLocation setLatitude(String value) { this.Latitude = value; return this; }
        public String getLongitude() { return Longitude; }
        public PutSamplingLocation setLongitude(String value) { this.Longitude = value; return this; }
        public String getHorizontalDatum() { return HorizontalDatum; }
        public PutSamplingLocation setHorizontalDatum(String value) { this.HorizontalDatum = value; return this; }
        public String getVerticalDatum() { return VerticalDatum; }
        public PutSamplingLocation setVerticalDatum(String value) { this.VerticalDatum = value; return this; }
        public String getHorizontalCollectionMethod() { return HorizontalCollectionMethod; }
        public PutSamplingLocation setHorizontalCollectionMethod(String value) { this.HorizontalCollectionMethod = value; return this; }
        public String getVerticalCollectionMethod() { return VerticalCollectionMethod; }
        public PutSamplingLocation setVerticalCollectionMethod(String value) { this.VerticalCollectionMethod = value; return this; }
        public String getDescription() { return Description; }
        public PutSamplingLocation setDescription(String value) { this.Description = value; return this; }
        public Address getAddress() { return Address; }
        public PutSamplingLocation setAddress(Address value) { this.Address = value; return this; }
        public Quantity getElevation() { return Elevation; }
        public PutSamplingLocation setElevation(Quantity value) { this.Elevation = value; return this; }
        public TimeZone getTimeZone() { return TimeZone; }
        public PutSamplingLocation setTimeZone(TimeZone value) { this.TimeZone = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PutSamplingLocation setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<StandardSimple> getStandards() { return Standards; }
        public PutSamplingLocation setStandards(List<StandardSimple> value) { this.Standards = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PutSamplingLocation setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<SamplingLocationGroup> getSamplingLocationGroups() { return SamplingLocationGroups; }
        public PutSamplingLocation setSamplingLocationGroups(List<SamplingLocationGroup> value) { this.SamplingLocationGroups = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PutSamplingLocation setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutSamplingLocation setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SamplingLocation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations/{id}", Verbs="DELETE")
    public static class DeleteSamplingLocation implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteSamplingLocation setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/samplinglocations/{id}/attachments", Verbs="GET")
    public static class GetSamplingLocationAttachments implements IReturn<SearchResultAttachment>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocationAttachments setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAttachment.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations/{id}/canedit", Verbs="GET")
    public static class GetSamplingLocationCanEdit implements IReturn<Boolean>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocationCanEdit setId(String value) { this.Id = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations/{id}/history", Verbs="GET")
    public static class GetSamplingLocationHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocationHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocations/{id}/summary", Verbs="GET")
    public static class GetSamplingLocationSummary implements IReturn<SamplingLocationSummary>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocationSummary setId(String value) { this.Id = value; return this; }
        private static Object responseType = SamplingLocationSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationtypes", Verbs="GET")
    public static class GetSamplingLocationTypes implements IReturn<SearchResultLocationType>
    {
        private static Object responseType = SearchResultLocationType.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationtypes", Verbs="PUT")
    public static class PutSamplingLocationTypes implements IReturn<List<LocationType>>
    {
        private static Object responseType = new TypeToken<List<LocationType>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/samplinglocationtypes/{id}/history", Verbs="GET")
    public static class GetSamplingLocationTypeHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSamplingLocationTypeHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/schedules", Verbs="GET")
    public static class GetSchedules implements IReturn<SearchResultSchedule>
    {
        private static Object responseType = SearchResultSchedule.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/schedules", Verbs="POST")
    public static class PostSchedule implements IReturn<Schedule>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartDate = null;
        public OffsetDateTime EndDate = null;
        public RecurrenceType RecurrenceType = null;
        public RecurrenceDayWeeklyType RecurrenceDayWeekly = null;
        public RecurrenceDayMonthlyType RecurrenceDayMonthly = null;
        public SamplingLocationGroup SamplingLocationGroup = null;
        public SamplingLocationGroupSelectionType SamplingLocationGroupSelectionType = null;
        public Integer SamplingLocationGroupSelectionTypeRandomCount = null;
        public OffsetDateTime LastGenerationDate = null;
        public List<SchedulePlannedActivity> SchedulePlannedActivities = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostSchedule setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostSchedule setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartDate() { return StartDate; }
        public PostSchedule setStartDate(OffsetDateTime value) { this.StartDate = value; return this; }
        public OffsetDateTime getEndDate() { return EndDate; }
        public PostSchedule setEndDate(OffsetDateTime value) { this.EndDate = value; return this; }
        public RecurrenceType getRecurrenceType() { return RecurrenceType; }
        public PostSchedule setRecurrenceType(RecurrenceType value) { this.RecurrenceType = value; return this; }
        public RecurrenceDayWeeklyType getRecurrenceDayWeekly() { return RecurrenceDayWeekly; }
        public PostSchedule setRecurrenceDayWeekly(RecurrenceDayWeeklyType value) { this.RecurrenceDayWeekly = value; return this; }
        public RecurrenceDayMonthlyType getRecurrenceDayMonthly() { return RecurrenceDayMonthly; }
        public PostSchedule setRecurrenceDayMonthly(RecurrenceDayMonthlyType value) { this.RecurrenceDayMonthly = value; return this; }
        public SamplingLocationGroup getSamplingLocationGroup() { return SamplingLocationGroup; }
        public PostSchedule setSamplingLocationGroup(SamplingLocationGroup value) { this.SamplingLocationGroup = value; return this; }
        public SamplingLocationGroupSelectionType getSamplingLocationGroupSelectionType() { return SamplingLocationGroupSelectionType; }
        public PostSchedule setSamplingLocationGroupSelectionType(SamplingLocationGroupSelectionType value) { this.SamplingLocationGroupSelectionType = value; return this; }
        public Integer getSamplingLocationGroupSelectionTypeRandomCount() { return SamplingLocationGroupSelectionTypeRandomCount; }
        public PostSchedule setSamplingLocationGroupSelectionTypeRandomCount(Integer value) { this.SamplingLocationGroupSelectionTypeRandomCount = value; return this; }
        public OffsetDateTime getLastGenerationDate() { return LastGenerationDate; }
        public PostSchedule setLastGenerationDate(OffsetDateTime value) { this.LastGenerationDate = value; return this; }
        public List<SchedulePlannedActivity> getSchedulePlannedActivities() { return SchedulePlannedActivities; }
        public PostSchedule setSchedulePlannedActivities(List<SchedulePlannedActivity> value) { this.SchedulePlannedActivities = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostSchedule setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Schedule.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/schedules/{id}", Verbs="GET")
    public static class GetSchedule implements IReturn<Schedule>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSchedule setId(String value) { this.Id = value; return this; }
        private static Object responseType = Schedule.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/schedules/{id}", Verbs="PUT")
    public static class PutSchedule implements IReturn<Schedule>
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartDate = null;
        public OffsetDateTime EndDate = null;
        public RecurrenceType RecurrenceType = null;
        public RecurrenceDayWeeklyType RecurrenceDayWeekly = null;
        public RecurrenceDayMonthlyType RecurrenceDayMonthly = null;
        public SamplingLocationGroup SamplingLocationGroup = null;
        public SamplingLocationGroupSelectionType SamplingLocationGroupSelectionType = null;
        public Integer SamplingLocationGroupSelectionTypeRandomCount = null;
        public OffsetDateTime LastGenerationDate = null;
        public List<SchedulePlannedActivity> SchedulePlannedActivities = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutSchedule setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutSchedule setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartDate() { return StartDate; }
        public PutSchedule setStartDate(OffsetDateTime value) { this.StartDate = value; return this; }
        public OffsetDateTime getEndDate() { return EndDate; }
        public PutSchedule setEndDate(OffsetDateTime value) { this.EndDate = value; return this; }
        public RecurrenceType getRecurrenceType() { return RecurrenceType; }
        public PutSchedule setRecurrenceType(RecurrenceType value) { this.RecurrenceType = value; return this; }
        public RecurrenceDayWeeklyType getRecurrenceDayWeekly() { return RecurrenceDayWeekly; }
        public PutSchedule setRecurrenceDayWeekly(RecurrenceDayWeeklyType value) { this.RecurrenceDayWeekly = value; return this; }
        public RecurrenceDayMonthlyType getRecurrenceDayMonthly() { return RecurrenceDayMonthly; }
        public PutSchedule setRecurrenceDayMonthly(RecurrenceDayMonthlyType value) { this.RecurrenceDayMonthly = value; return this; }
        public SamplingLocationGroup getSamplingLocationGroup() { return SamplingLocationGroup; }
        public PutSchedule setSamplingLocationGroup(SamplingLocationGroup value) { this.SamplingLocationGroup = value; return this; }
        public SamplingLocationGroupSelectionType getSamplingLocationGroupSelectionType() { return SamplingLocationGroupSelectionType; }
        public PutSchedule setSamplingLocationGroupSelectionType(SamplingLocationGroupSelectionType value) { this.SamplingLocationGroupSelectionType = value; return this; }
        public Integer getSamplingLocationGroupSelectionTypeRandomCount() { return SamplingLocationGroupSelectionTypeRandomCount; }
        public PutSchedule setSamplingLocationGroupSelectionTypeRandomCount(Integer value) { this.SamplingLocationGroupSelectionTypeRandomCount = value; return this; }
        public OffsetDateTime getLastGenerationDate() { return LastGenerationDate; }
        public PutSchedule setLastGenerationDate(OffsetDateTime value) { this.LastGenerationDate = value; return this; }
        public List<SchedulePlannedActivity> getSchedulePlannedActivities() { return SchedulePlannedActivities; }
        public PutSchedule setSchedulePlannedActivities(List<SchedulePlannedActivity> value) { this.SchedulePlannedActivities = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutSchedule setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Schedule.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/schedules/{id}", Verbs="DELETE")
    public static class DeleteSchedule implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteSchedule setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/schedules/{id}/generateFieldVisit", Verbs="POST")
    public static class PostGenerateFieldVisits implements IReturn<List<FieldVisit>>
    {
        public String Id = null;

        public String getId() { return Id; }
        public PostGenerateFieldVisits setId(String value) { this.Id = value; return this; }
        private static Object responseType = new TypeToken<List<FieldVisit>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/schedules/{id}/history", Verbs="GET")
    public static class GetScheduleHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetScheduleHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/export/fieldsheets/{fieldVisitId}", Verbs="GET")
    public static class GetExportFieldSheet implements IReturnVoid
    {
        public String FieldVisitId = null;

        public String getFieldVisitId() { return FieldVisitId; }
        public GetExportFieldSheet setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
    }

    @DataContract
    @Route(Path="/v1/services/export/observations", Verbs="GET")
    public static class GetExportObservations implements IReturnVoid
    {
        @DataMember(Name = "format")
        public GetExportObservationsFormatType Format = null;
        @DataMember(Name = "activityCustomId")
        public String ActivityCustomId = null;
        @DataMember(Name = "activityIds")
        public List<String> ActivityIds = null;
        @DataMember(Name = "activityTypes")
        public List<String> ActivityTypes = null;
        @DataMember(Name = "analysisMethodIds")
        public List<String> AnalysisMethodIds = null;
        @DataMember(Name = "analysisMethodSimpleIds")
        public List<String> AnalysisMethodSimpleIds = null;
        @DataMember(Name = "analyticalGroupIds")
        public List<String> AnalyticalGroupIds = null;
        @DataMember(Name = "collectionMethodIds")
        public List<String> CollectionMethodIds = null;
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "customId")
        public String CustomId = null;
        @DataMember(Name = "dataClassifications")
        public List<String> DataClassifications = null;
        @DataMember(Name = "depthUnitCustomId")
        public String DepthUnitCustomId = null;
        @DataMember(Name = "depthUnitId")
        public String DepthUnitId = null;
        @DataMember(Name = "depthValue")
        public Double DepthValue = null;
        @DataMember(Name = "detectionCondition")
        public String DetectionCondition = null;
        @DataMember(Name = "end-lastReindexTime")
        public Instant EndLastReindexTime = null;
        @DataMember(Name = "end-observedTime")
        public Instant EndObservedTime = null;
        @DataMember(Name = "end-resultTime")
        public Instant EndResultTime = null;
        @DataMember(Name = "endModificationTime")
        public Instant EndModificationTime = null;
        @DataMember(Name = "fieldResultType")
        public FieldResultType FieldResultType = null;
        @DataMember(Name = "fieldVisitId")
        public String FieldVisitId = null;
        @DataMember(Name = "filterId")
        public String FilterId = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "importHistoryEventId")
        public String ImportHistoryEventId = null;
        @DataMember(Name = "labReportIds")
        public List<String> LabReportIds = null;
        @DataMember(Name = "labResultLabAnalysisMethodIds")
        public List<String> LabResultLabAnalysisMethodIds = null;
        @DataMember(Name = "labResultLaboratoryIds")
        public List<String> LabResultLaboratoryIds = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "max-numericResultValue")
        public Double MaxNumericResultValue = null;
        @DataMember(Name = "media")
        public List<String> Media = null;
        @DataMember(Name = "min-numericResultValue")
        public Double MinNumericResultValue = null;
        @DataMember(Name = "numericResultValue")
        public Double NumericResultValue = null;
        @DataMember(Name = "observedPropertyIds")
        public List<String> ObservedPropertyIds = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "qualityControlTypes")
        public List<String> QualityControlTypes = null;
        @DataMember(Name = "resultGrades")
        public List<String> ResultGrades = null;
        @DataMember(Name = "resultStatuses")
        public List<String> ResultStatuses = null;
        @DataMember(Name = "sampleFraction")
        public SampleFractionType SampleFraction = null;
        @DataMember(Name = "samplingContextTagIds")
        public List<String> SamplingContextTagIds = null;
        @DataMember(Name = "samplingLocationGroupIds")
        public List<String> SamplingLocationGroupIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "specimenIds")
        public List<String> SpecimenIds = null;
        @DataMember(Name = "specimenName")
        public String SpecimenName = null;
        @DataMember(Name = "start-lastReindexTime")
        public Instant StartLastReindexTime = null;
        @DataMember(Name = "start-observedTime")
        public Instant StartObservedTime = null;
        @DataMember(Name = "start-resultTime")
        public Instant StartResultTime = null;
        @DataMember(Name = "startModificationTime")
        public Instant StartModificationTime = null;
        @DataMember(Name = "taxonIds")
        public List<String> TaxonIds = null;

        public GetExportObservationsFormatType getFormat() { return Format; }
        public GetExportObservations setFormat(GetExportObservationsFormatType value) { this.Format = value; return this; }
        public String getActivityCustomId() { return ActivityCustomId; }
        public GetExportObservations setActivityCustomId(String value) { this.ActivityCustomId = value; return this; }
        public List<String> getActivityIds() { return ActivityIds; }
        public GetExportObservations setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetExportObservations setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getAnalysisMethodIds() { return AnalysisMethodIds; }
        public GetExportObservations setAnalysisMethodIds(List<String> value) { this.AnalysisMethodIds = value; return this; }
        public List<String> getAnalysisMethodSimpleIds() { return AnalysisMethodSimpleIds; }
        public GetExportObservations setAnalysisMethodSimpleIds(List<String> value) { this.AnalysisMethodSimpleIds = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public GetExportObservations setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public GetExportObservations setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public GetExportObservations setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetExportObservations setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getDataClassifications() { return DataClassifications; }
        public GetExportObservations setDataClassifications(List<String> value) { this.DataClassifications = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public GetExportObservations setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public String getDepthUnitId() { return DepthUnitId; }
        public GetExportObservations setDepthUnitId(String value) { this.DepthUnitId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public GetExportObservations setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDetectionCondition() { return DetectionCondition; }
        public GetExportObservations setDetectionCondition(String value) { this.DetectionCondition = value; return this; }
        public Instant getEndLastReindexTime() { return EndLastReindexTime; }
        public GetExportObservations setEndLastReindexTime(Instant value) { this.EndLastReindexTime = value; return this; }
        public Instant getEndObservedTime() { return EndObservedTime; }
        public GetExportObservations setEndObservedTime(Instant value) { this.EndObservedTime = value; return this; }
        public Instant getEndResultTime() { return EndResultTime; }
        public GetExportObservations setEndResultTime(Instant value) { this.EndResultTime = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetExportObservations setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public FieldResultType getFieldResultType() { return FieldResultType; }
        public GetExportObservations setFieldResultType(FieldResultType value) { this.FieldResultType = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public GetExportObservations setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getFilterId() { return FilterId; }
        public GetExportObservations setFilterId(String value) { this.FilterId = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetExportObservations setIds(List<String> value) { this.Ids = value; return this; }
        public String getImportHistoryEventId() { return ImportHistoryEventId; }
        public GetExportObservations setImportHistoryEventId(String value) { this.ImportHistoryEventId = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public GetExportObservations setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public List<String> getLabResultLabAnalysisMethodIds() { return LabResultLabAnalysisMethodIds; }
        public GetExportObservations setLabResultLabAnalysisMethodIds(List<String> value) { this.LabResultLabAnalysisMethodIds = value; return this; }
        public List<String> getLabResultLaboratoryIds() { return LabResultLaboratoryIds; }
        public GetExportObservations setLabResultLaboratoryIds(List<String> value) { this.LabResultLaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetExportObservations setLimit(Integer value) { this.Limit = value; return this; }
        public Double getMaxNumericResultValue() { return MaxNumericResultValue; }
        public GetExportObservations setMaxNumericResultValue(Double value) { this.MaxNumericResultValue = value; return this; }
        public List<String> getMedia() { return Media; }
        public GetExportObservations setMedia(List<String> value) { this.Media = value; return this; }
        public Double getMinNumericResultValue() { return MinNumericResultValue; }
        public GetExportObservations setMinNumericResultValue(Double value) { this.MinNumericResultValue = value; return this; }
        public Double getNumericResultValue() { return NumericResultValue; }
        public GetExportObservations setNumericResultValue(Double value) { this.NumericResultValue = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetExportObservations setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetExportObservations setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getQualityControlTypes() { return QualityControlTypes; }
        public GetExportObservations setQualityControlTypes(List<String> value) { this.QualityControlTypes = value; return this; }
        public List<String> getResultGrades() { return ResultGrades; }
        public GetExportObservations setResultGrades(List<String> value) { this.ResultGrades = value; return this; }
        public List<String> getResultStatuses() { return ResultStatuses; }
        public GetExportObservations setResultStatuses(List<String> value) { this.ResultStatuses = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public GetExportObservations setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public List<String> getSamplingContextTagIds() { return SamplingContextTagIds; }
        public GetExportObservations setSamplingContextTagIds(List<String> value) { this.SamplingContextTagIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetExportObservations setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetExportObservations setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetExportObservations setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetExportObservations setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenIds() { return SpecimenIds; }
        public GetExportObservations setSpecimenIds(List<String> value) { this.SpecimenIds = value; return this; }
        public String getSpecimenName() { return SpecimenName; }
        public GetExportObservations setSpecimenName(String value) { this.SpecimenName = value; return this; }
        public Instant getStartLastReindexTime() { return StartLastReindexTime; }
        public GetExportObservations setStartLastReindexTime(Instant value) { this.StartLastReindexTime = value; return this; }
        public Instant getStartObservedTime() { return StartObservedTime; }
        public GetExportObservations setStartObservedTime(Instant value) { this.StartObservedTime = value; return this; }
        public Instant getStartResultTime() { return StartResultTime; }
        public GetExportObservations setStartResultTime(Instant value) { this.StartResultTime = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetExportObservations setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        public List<String> getTaxonIds() { return TaxonIds; }
        public GetExportObservations setTaxonIds(List<String> value) { this.TaxonIds = value; return this; }
    }

    @Route(Path="/v1/services/export/samplinglocations", Verbs="GET")
    public static class GetExportSamplingLocations implements IReturnVoid
    {
        public String Cursor = null;
        public String CustomId = null;
        public Instant EndModificationTime = null;
        public Integer Limit = null;
        public List<String> LocationGroupTypeIds = null;
        public List<String> LocationTypeIds = null;
        public List<String> SamplingLocationGroupIds = null;
        public List<String> Search = null;
        public String Sort = null;
        public Instant StartModificationTime = null;

        public String getCursor() { return Cursor; }
        public GetExportSamplingLocations setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetExportSamplingLocations setCustomId(String value) { this.CustomId = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetExportSamplingLocations setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetExportSamplingLocations setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getLocationGroupTypeIds() { return LocationGroupTypeIds; }
        public GetExportSamplingLocations setLocationGroupTypeIds(List<String> value) { this.LocationGroupTypeIds = value; return this; }
        public List<String> getLocationTypeIds() { return LocationTypeIds; }
        public GetExportSamplingLocations setLocationTypeIds(List<String> value) { this.LocationTypeIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetExportSamplingLocations setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetExportSamplingLocations setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetExportSamplingLocations setSort(String value) { this.Sort = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetExportSamplingLocations setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
    }

    @Route(Path="/v1/services/export/specimens", Verbs="GET")
    public static class GetExportSpecimens implements IReturnVoid
    {
        public List<String> ActivityIds = null;
        public List<String> ActivityTypes = null;
        public Instant After = null;
        public List<String> AnalyticalGroupIds = null;
        public Instant Before = null;
        public String Cursor = null;
        public Instant EndModificationTime = null;
        public List<String> FieldTripIds = null;
        public List<String> FieldVisitId = null;
        public List<String> LaboratoryIds = null;
        public Integer Limit = null;
        public List<String> ProjectIds = null;
        public List<String> SamplingLocationGroupIds = null;
        public List<String> SamplingLocationIds = null;
        public List<String> SamplingPlanIds = null;
        public List<String> Search = null;
        public String Sort = null;
        public List<String> SpecimenStatuses = null;
        public Instant StartModificationTime = null;

        public List<String> getActivityIds() { return ActivityIds; }
        public GetExportSpecimens setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetExportSpecimens setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public Instant getAfter() { return After; }
        public GetExportSpecimens setAfter(Instant value) { this.After = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public GetExportSpecimens setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public Instant getBefore() { return Before; }
        public GetExportSpecimens setBefore(Instant value) { this.Before = value; return this; }
        public String getCursor() { return Cursor; }
        public GetExportSpecimens setCursor(String value) { this.Cursor = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetExportSpecimens setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public List<String> getFieldTripIds() { return FieldTripIds; }
        public GetExportSpecimens setFieldTripIds(List<String> value) { this.FieldTripIds = value; return this; }
        public List<String> getFieldVisitId() { return FieldVisitId; }
        public GetExportSpecimens setFieldVisitId(List<String> value) { this.FieldVisitId = value; return this; }
        public List<String> getLaboratoryIds() { return LaboratoryIds; }
        public GetExportSpecimens setLaboratoryIds(List<String> value) { this.LaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetExportSpecimens setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetExportSpecimens setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetExportSpecimens setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetExportSpecimens setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSamplingPlanIds() { return SamplingPlanIds; }
        public GetExportSpecimens setSamplingPlanIds(List<String> value) { this.SamplingPlanIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetExportSpecimens setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetExportSpecimens setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenStatuses() { return SpecimenStatuses; }
        public GetExportSpecimens setSpecimenStatuses(List<String> value) { this.SpecimenStatuses = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetExportSpecimens setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
    }

    @Route(Path="/v1/services/import/analysismethods", Verbs="POST")
    public static class PostImportAnalysisMethods implements IReturn<AnalysisMethodImportSummary>
    {
        private static Object responseType = AnalysisMethodImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/analysismethods/dryrun", Verbs="POST")
    public static class PostImportAnalysisMethodsDryRun implements IReturn<AnalysisMethodImportSummary>
    {
        private static Object responseType = AnalysisMethodImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/fieldsheets", Verbs="POST")
    public static class PostImportFieldSheet implements IReturn<FieldSheetImportSummary>
    {
        public String TimeZoneOffset = null;

        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostImportFieldSheet setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        private static Object responseType = FieldSheetImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/fieldsheets/dryrun", Verbs="POST")
    public static class PostImportFieldSheetDryRun implements IReturn<FieldSheetImportSummary>
    {
        public String TimeZoneOffset = null;

        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostImportFieldSheetDryRun setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        private static Object responseType = FieldSheetImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/labanalysismethods", Verbs="POST")
    public static class PostImportLabAnalysisMethods implements IReturn<AnalysisMethodImportSummary>
    {
        private static Object responseType = AnalysisMethodImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/labanalysismethods/dryrun", Verbs="POST")
    public static class PostImportLabAnalysisMethodsDryRun implements IReturn<AnalysisMethodImportSummary>
    {
        private static Object responseType = AnalysisMethodImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/labreportdata", Verbs="POST")
    public static class PostImportLabReportData implements IReturn<ObservationImportSummary>
    {
        public String FileType = null;
        public String TimeZoneOffset = null;
        public Boolean CreateMissingObjects = null;
        public Boolean UpdateExistingResults = null;

        public String getFileType() { return FileType; }
        public PostImportLabReportData setFileType(String value) { this.FileType = value; return this; }
        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostImportLabReportData setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        public Boolean getCreateMissingObjects() { return CreateMissingObjects; }
        public PostImportLabReportData setCreateMissingObjects(Boolean value) { this.CreateMissingObjects = value; return this; }
        public Boolean getUpdateExistingResults() { return UpdateExistingResults; }
        public PostImportLabReportData setUpdateExistingResults(Boolean value) { this.UpdateExistingResults = value; return this; }
        private static Object responseType = ObservationImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/labreportdata/dryrun", Verbs="POST")
    public static class PostImportLabReportDataDryRun implements IReturn<ObservationImportSummary>
    {
        public String FileType = null;
        public String TimeZoneOffset = null;
        public Boolean CreateMissingObjects = null;
        public Boolean UpdateExistingResults = null;

        public String getFileType() { return FileType; }
        public PostImportLabReportDataDryRun setFileType(String value) { this.FileType = value; return this; }
        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostImportLabReportDataDryRun setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        public Boolean getCreateMissingObjects() { return CreateMissingObjects; }
        public PostImportLabReportDataDryRun setCreateMissingObjects(Boolean value) { this.CreateMissingObjects = value; return this; }
        public Boolean getUpdateExistingResults() { return UpdateExistingResults; }
        public PostImportLabReportDataDryRun setUpdateExistingResults(Boolean value) { this.UpdateExistingResults = value; return this; }
        private static Object responseType = ObservationImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/observedproperties", Verbs="POST")
    public static class PostImportObservedProperties implements IReturn<ObservedPropertyImportSummary>
    {
        private static Object responseType = ObservedPropertyImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/observedproperties/dryrun", Verbs="POST")
    public static class PostImportObservedPropertiesDryRun implements IReturn<ObservedPropertyImportSummary>
    {
        private static Object responseType = ObservedPropertyImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/samplinglocations", Verbs="POST")
    public static class PostImportSamplingLocations implements IReturn<SamplingLocationImportSummary>
    {
        public String FileType = null;

        public String getFileType() { return FileType; }
        public PostImportSamplingLocations setFileType(String value) { this.FileType = value; return this; }
        private static Object responseType = SamplingLocationImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/samplinglocations/dryrun", Verbs="POST")
    public static class PostImportSamplingLocationsDryRun implements IReturn<SamplingLocationImportSummary>
    {
        public String FileType = null;

        public String getFileType() { return FileType; }
        public PostImportSamplingLocationsDryRun setFileType(String value) { this.FileType = value; return this; }
        private static Object responseType = SamplingLocationImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/samplingplan", Verbs="POST")
    public static class PostImportSamplingPlan implements IReturn<FieldSheetImportSummary>
    {
        public String TimeZoneOffset = null;

        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostImportSamplingPlan setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        private static Object responseType = FieldSheetImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/samplingplan/dryrun", Verbs="POST")
    public static class PostImportSamplingPlanDryRun implements IReturn<FieldSheetImportSummary>
    {
        public String TimeZoneOffset = null;

        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostImportSamplingPlanDryRun setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        private static Object responseType = FieldSheetImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/taxons", Verbs="POST")
    public static class PostImportTaxons implements IReturn<TaxonImportSummary>
    {
        private static Object responseType = TaxonImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/taxons/dryrun", Verbs="POST")
    public static class PostImportTaxonsDryRun implements IReturn<TaxonImportSummary>
    {
        private static Object responseType = TaxonImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/services/import/verticalprofiledata", Verbs="POST")
    public static class PostImportVerticalProfileData implements IReturnVoid
    {
        public String ActivityId = null;
        public String SamplingLocationIds = null;
        public String TimeZoneOffset = null;

        public String getActivityId() { return ActivityId; }
        public PostImportVerticalProfileData setActivityId(String value) { this.ActivityId = value; return this; }
        public String getSamplingLocationIds() { return SamplingLocationIds; }
        public PostImportVerticalProfileData setSamplingLocationIds(String value) { this.SamplingLocationIds = value; return this; }
        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostImportVerticalProfileData setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
    }

    @Route(Path="/v1/shippingcontainers", Verbs="GET")
    public static class GetShippingContainers implements IReturn<SearchResultShippingContainer>
    {
        public Integer Limit = null;
        public List<String> Search = null;

        public Integer getLimit() { return Limit; }
        public GetShippingContainers setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetShippingContainers setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultShippingContainer.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/shippingcontainers", Verbs="POST")
    public static class PostShippingContainer implements IReturn<ShippingContainer>
    {
        public String Id = null;
        public String CustomId = null;
        public String TrackingId = null;
        public String Comment = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostShippingContainer setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostShippingContainer setCustomId(String value) { this.CustomId = value; return this; }
        public String getTrackingId() { return TrackingId; }
        public PostShippingContainer setTrackingId(String value) { this.TrackingId = value; return this; }
        public String getComment() { return Comment; }
        public PostShippingContainer setComment(String value) { this.Comment = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostShippingContainer setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ShippingContainer.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/shippingcontainers/{id}", Verbs="GET")
    public static class GetShippingContainer implements IReturn<ShippingContainer>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetShippingContainer setId(String value) { this.Id = value; return this; }
        private static Object responseType = ShippingContainer.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/shippingcontainers/{id}", Verbs="PUT")
    public static class PutShippingContainer implements IReturn<ShippingContainer>
    {
        public String Id = null;
        public String CustomId = null;
        public String TrackingId = null;
        public String Comment = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutShippingContainer setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutShippingContainer setCustomId(String value) { this.CustomId = value; return this; }
        public String getTrackingId() { return TrackingId; }
        public PutShippingContainer setTrackingId(String value) { this.TrackingId = value; return this; }
        public String getComment() { return Comment; }
        public PutShippingContainer setComment(String value) { this.Comment = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutShippingContainer setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = ShippingContainer.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/shippingcontainers/{id}", Verbs="DELETE")
    public static class DeleteShippingContainer implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteShippingContainer setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/specimens", Verbs="GET")
    public static class GetSpecimens implements IReturn<SearchResultSpecimen>, IPaginatedRequest
    {
        public List<String> ActivityIds = null;
        public List<String> ActivityTypes = null;
        public Instant After = null;
        public List<String> AnalyticalGroupIds = null;
        public Instant Before = null;
        public String Cursor = null;
        public Instant EndModificationTime = null;
        public List<String> FieldTripIds = null;
        public List<String> FieldVisitId = null;
        public List<String> LaboratoryIds = null;
        public Integer Limit = null;
        public List<String> ProjectIds = null;
        public List<String> SamplingLocationGroupIds = null;
        public List<String> SamplingLocationIds = null;
        public List<String> SamplingPlanIds = null;
        public List<String> Search = null;
        public String Sort = null;
        public List<String> SpecimenStatuses = null;
        public Instant StartModificationTime = null;

        public List<String> getActivityIds() { return ActivityIds; }
        public GetSpecimens setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetSpecimens setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public Instant getAfter() { return After; }
        public GetSpecimens setAfter(Instant value) { this.After = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public GetSpecimens setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public Instant getBefore() { return Before; }
        public GetSpecimens setBefore(Instant value) { this.Before = value; return this; }
        public String getCursor() { return Cursor; }
        public GetSpecimens setCursor(String value) { this.Cursor = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetSpecimens setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public List<String> getFieldTripIds() { return FieldTripIds; }
        public GetSpecimens setFieldTripIds(List<String> value) { this.FieldTripIds = value; return this; }
        public List<String> getFieldVisitId() { return FieldVisitId; }
        public GetSpecimens setFieldVisitId(List<String> value) { this.FieldVisitId = value; return this; }
        public List<String> getLaboratoryIds() { return LaboratoryIds; }
        public GetSpecimens setLaboratoryIds(List<String> value) { this.LaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetSpecimens setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetSpecimens setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetSpecimens setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetSpecimens setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSamplingPlanIds() { return SamplingPlanIds; }
        public GetSpecimens setSamplingPlanIds(List<String> value) { this.SamplingPlanIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetSpecimens setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetSpecimens setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenStatuses() { return SpecimenStatuses; }
        public GetSpecimens setSpecimenStatuses(List<String> value) { this.SpecimenStatuses = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetSpecimens setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        private static Object responseType = SearchResultSpecimen.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/specimens", Verbs="POST")
    public static class PostSpecimen implements IReturn<SpecimenWithObservations>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public PreservativeType Preservative = null;
        public Boolean Filtered = null;
        public String FiltrationComment = null;
        public Laboratory Laboratory = null;
        public ShippingContainer ShippingContainer = null;
        public AnalyticalGroup AnalyticalGroup = null;
        public Activity Activity = null;
        public SpecimenTemplate TemplateCreatedFrom = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public SpecimenViewStatusType Status = null;
        public Integer NumberOfRequestedObservations = null;
        public Integer NumberOfReceivedObservations = null;
        public List<Observation> Observations = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostSpecimen setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PostSpecimen setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostSpecimen setDescription(String value) { this.Description = value; return this; }
        public PreservativeType getPreservative() { return Preservative; }
        public PostSpecimen setPreservative(PreservativeType value) { this.Preservative = value; return this; }
        public Boolean getFiltered() { return Filtered; }
        public PostSpecimen setFiltered(Boolean value) { this.Filtered = value; return this; }
        public String getFiltrationComment() { return FiltrationComment; }
        public PostSpecimen setFiltrationComment(String value) { this.FiltrationComment = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public PostSpecimen setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public ShippingContainer getShippingContainer() { return ShippingContainer; }
        public PostSpecimen setShippingContainer(ShippingContainer value) { this.ShippingContainer = value; return this; }
        public AnalyticalGroup getAnalyticalGroup() { return AnalyticalGroup; }
        public PostSpecimen setAnalyticalGroup(AnalyticalGroup value) { this.AnalyticalGroup = value; return this; }
        public Activity getActivity() { return Activity; }
        public PostSpecimen setActivity(Activity value) { this.Activity = value; return this; }
        public SpecimenTemplate getTemplateCreatedFrom() { return TemplateCreatedFrom; }
        public PostSpecimen setTemplateCreatedFrom(SpecimenTemplate value) { this.TemplateCreatedFrom = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PostSpecimen setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public SpecimenViewStatusType getStatus() { return Status; }
        public PostSpecimen setStatus(SpecimenViewStatusType value) { this.Status = value; return this; }
        public Integer getNumberOfRequestedObservations() { return NumberOfRequestedObservations; }
        public PostSpecimen setNumberOfRequestedObservations(Integer value) { this.NumberOfRequestedObservations = value; return this; }
        public Integer getNumberOfReceivedObservations() { return NumberOfReceivedObservations; }
        public PostSpecimen setNumberOfReceivedObservations(Integer value) { this.NumberOfReceivedObservations = value; return this; }
        public List<Observation> getObservations() { return Observations; }
        public PostSpecimen setObservations(List<Observation> value) { this.Observations = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostSpecimen setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SpecimenWithObservations.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/specimens/{id}", Verbs="GET")
    public static class GetSpecimen implements IReturn<SpecimenWithObservations>
    {
        public String Id = null;
        public Boolean Detail = null;

        public String getId() { return Id; }
        public GetSpecimen setId(String value) { this.Id = value; return this; }
        public Boolean getDetail() { return Detail; }
        public GetSpecimen setDetail(Boolean value) { this.Detail = value; return this; }
        private static Object responseType = SpecimenWithObservations.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/specimens/{id}", Verbs="PUT")
    public static class PutSpecimen implements IReturn<SpecimenWithObservations>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public PreservativeType Preservative = null;
        public Boolean Filtered = null;
        public String FiltrationComment = null;
        public Laboratory Laboratory = null;
        public ShippingContainer ShippingContainer = null;
        public AnalyticalGroup AnalyticalGroup = null;
        public Activity Activity = null;
        public SpecimenTemplate TemplateCreatedFrom = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public SpecimenViewStatusType Status = null;
        public Integer NumberOfRequestedObservations = null;
        public Integer NumberOfReceivedObservations = null;
        public List<Observation> Observations = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutSpecimen setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PutSpecimen setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutSpecimen setDescription(String value) { this.Description = value; return this; }
        public PreservativeType getPreservative() { return Preservative; }
        public PutSpecimen setPreservative(PreservativeType value) { this.Preservative = value; return this; }
        public Boolean getFiltered() { return Filtered; }
        public PutSpecimen setFiltered(Boolean value) { this.Filtered = value; return this; }
        public String getFiltrationComment() { return FiltrationComment; }
        public PutSpecimen setFiltrationComment(String value) { this.FiltrationComment = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public PutSpecimen setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public ShippingContainer getShippingContainer() { return ShippingContainer; }
        public PutSpecimen setShippingContainer(ShippingContainer value) { this.ShippingContainer = value; return this; }
        public AnalyticalGroup getAnalyticalGroup() { return AnalyticalGroup; }
        public PutSpecimen setAnalyticalGroup(AnalyticalGroup value) { this.AnalyticalGroup = value; return this; }
        public Activity getActivity() { return Activity; }
        public PutSpecimen setActivity(Activity value) { this.Activity = value; return this; }
        public SpecimenTemplate getTemplateCreatedFrom() { return TemplateCreatedFrom; }
        public PutSpecimen setTemplateCreatedFrom(SpecimenTemplate value) { this.TemplateCreatedFrom = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PutSpecimen setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public SpecimenViewStatusType getStatus() { return Status; }
        public PutSpecimen setStatus(SpecimenViewStatusType value) { this.Status = value; return this; }
        public Integer getNumberOfRequestedObservations() { return NumberOfRequestedObservations; }
        public PutSpecimen setNumberOfRequestedObservations(Integer value) { this.NumberOfRequestedObservations = value; return this; }
        public Integer getNumberOfReceivedObservations() { return NumberOfReceivedObservations; }
        public PutSpecimen setNumberOfReceivedObservations(Integer value) { this.NumberOfReceivedObservations = value; return this; }
        public List<Observation> getObservations() { return Observations; }
        public PutSpecimen setObservations(List<Observation> value) { this.Observations = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutSpecimen setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SpecimenWithObservations.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/specimens/{id}", Verbs="DELETE")
    public static class DeleteSpecimen implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteSpecimen setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/specimens/{id}/history", Verbs="GET")
    public static class GetSpecimenHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSpecimenHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/specimens/{id}/observations", Verbs="GET")
    public static class GetSpecimenObservations implements IReturn<SearchResultObservationNestedInSpecimen>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSpecimenObservations setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultObservationNestedInSpecimen.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/spreadsheettemplates", Verbs="GET")
    public static class GetSpreadsheetTemplates implements IReturn<SearchResultSpreadsheetTemplate>
    {
        private static Object responseType = SearchResultSpreadsheetTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/spreadsheettemplates", Verbs="POST")
    public static class PostSpreadsheetTemplate implements IReturn<SpreadsheetTemplate>
    {
        public String Id = null;
        public String CustomId = null;
        public SpreadsheetTemplateType Type = null;
        public String Description = null;
        public List<DomainObjectAttachment> Attachments = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostSpreadsheetTemplate setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostSpreadsheetTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public SpreadsheetTemplateType getType() { return Type; }
        public PostSpreadsheetTemplate setType(SpreadsheetTemplateType value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public PostSpreadsheetTemplate setDescription(String value) { this.Description = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PostSpreadsheetTemplate setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostSpreadsheetTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SpreadsheetTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/spreadsheettemplates/{id}", Verbs="GET")
    public static class GetSpreadsheetTemplate implements IReturn<SpreadsheetTemplate>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSpreadsheetTemplate setId(String value) { this.Id = value; return this; }
        private static Object responseType = SpreadsheetTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/spreadsheettemplates/{id}", Verbs="PUT")
    public static class PutSpreadsheetTemplate implements IReturn<SpreadsheetTemplate>
    {
        public String Id = null;
        public String CustomId = null;
        public SpreadsheetTemplateType Type = null;
        public String Description = null;
        public List<DomainObjectAttachment> Attachments = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutSpreadsheetTemplate setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutSpreadsheetTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public SpreadsheetTemplateType getType() { return Type; }
        public PutSpreadsheetTemplate setType(SpreadsheetTemplateType value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public PutSpreadsheetTemplate setDescription(String value) { this.Description = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public PutSpreadsheetTemplate setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutSpreadsheetTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SpreadsheetTemplate.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/spreadsheettemplates/{id}", Verbs="DELETE")
    public static class DeleteSpreadsheetTemplate implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteSpreadsheetTemplate setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/spreadsheettemplates/{id}/history", Verbs="GET")
    public static class GetSpreadsheetTemplateHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetSpreadsheetTemplateHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/standards", Verbs="GET")
    public static class GetStandards implements IReturn<SearchResultStandardSimple>
    {
        private static Object responseType = SearchResultStandardSimple.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/standards", Verbs="POST")
    public static class PostStandard implements IReturn<StandardDefinition>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String IssuingOrganization = null;
        public Interval ApplicabilityRange = null;
        public Boolean Active = null;
        public List<SamplingLocationSimple> SamplingLocations = null;
        public List<ObservationStandard> ObservationStandards = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostStandard setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostStandard setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostStandard setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostStandard setDescription(String value) { this.Description = value; return this; }
        public String getIssuingOrganization() { return IssuingOrganization; }
        public PostStandard setIssuingOrganization(String value) { this.IssuingOrganization = value; return this; }
        public Interval getApplicabilityRange() { return ApplicabilityRange; }
        public PostStandard setApplicabilityRange(Interval value) { this.ApplicabilityRange = value; return this; }
        public Boolean getActive() { return Active; }
        public PostStandard setActive(Boolean value) { this.Active = value; return this; }
        public List<SamplingLocationSimple> getSamplingLocations() { return SamplingLocations; }
        public PostStandard setSamplingLocations(List<SamplingLocationSimple> value) { this.SamplingLocations = value; return this; }
        public List<ObservationStandard> getObservationStandards() { return ObservationStandards; }
        public PostStandard setObservationStandards(List<ObservationStandard> value) { this.ObservationStandards = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostStandard setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = StandardDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/standards/{id}", Verbs="GET")
    public static class GetStandard implements IReturn<StandardDefinition>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetStandard setId(String value) { this.Id = value; return this; }
        private static Object responseType = StandardDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/standards/{id}", Verbs="PUT")
    public static class PutStandard implements IReturn<StandardDefinition>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String IssuingOrganization = null;
        public Interval ApplicabilityRange = null;
        public Boolean Active = null;
        public List<SamplingLocationSimple> SamplingLocations = null;
        public List<ObservationStandard> ObservationStandards = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutStandard setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutStandard setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutStandard setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutStandard setDescription(String value) { this.Description = value; return this; }
        public String getIssuingOrganization() { return IssuingOrganization; }
        public PutStandard setIssuingOrganization(String value) { this.IssuingOrganization = value; return this; }
        public Interval getApplicabilityRange() { return ApplicabilityRange; }
        public PutStandard setApplicabilityRange(Interval value) { this.ApplicabilityRange = value; return this; }
        public Boolean getActive() { return Active; }
        public PutStandard setActive(Boolean value) { this.Active = value; return this; }
        public List<SamplingLocationSimple> getSamplingLocations() { return SamplingLocations; }
        public PutStandard setSamplingLocations(List<SamplingLocationSimple> value) { this.SamplingLocations = value; return this; }
        public List<ObservationStandard> getObservationStandards() { return ObservationStandards; }
        public PutStandard setObservationStandards(List<ObservationStandard> value) { this.ObservationStandards = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutStandard setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = StandardDefinition.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/standards/{id}", Verbs="DELETE")
    public static class DeleteStandard implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteStandard setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/standards/{id}/history", Verbs="GET")
    public static class GetStandardHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetStandardHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/status", Verbs="GET")
    public static class GetStatus implements IReturn<Status>
    {
        private static Object responseType = Status.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/tags", Verbs="GET")
    public static class GetTags implements IReturn<SearchResultSamplingContextTag>
    {
        private static Object responseType = SearchResultSamplingContextTag.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/tags", Verbs="POST")
    public static class PostTag implements IReturn<SamplingContextTag>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostTag setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PostTag setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PostTag setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostTag setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SamplingContextTag.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/tags/{id}", Verbs="GET")
    public static class GetTag implements IReturn<SamplingContextTag>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetTag setId(String value) { this.Id = value; return this; }
        private static Object responseType = SamplingContextTag.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/tags/{id}", Verbs="PUT")
    public static class PutTag implements IReturn<SamplingContextTag>
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutTag setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public PutTag setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PutTag setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutTag setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = SamplingContextTag.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/tags/{id}", Verbs="DELETE")
    public static class DeleteTag implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteTag setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/tags/{id}/history", Verbs="GET")
    public static class GetTagHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetTagHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxonomylevels", Verbs="GET")
    public static class GetTaxonomyLevels implements IReturn<SearchResultTaxonomyLevel>
    {
        private static Object responseType = SearchResultTaxonomyLevel.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxonomylevels", Verbs="PUT")
    public static class PutTaxonomyLevels implements IReturn<List<TaxonomyLevel>>
    {
        private static Object responseType = new TypeToken<List<TaxonomyLevel>>(){};
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxonomylevels/{id}/history", Verbs="GET")
    public static class GetTaxonomyLevelHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetTaxonomyLevelHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxons", Verbs="GET")
    public static class GetTaxons implements IReturn<SearchResultTaxon>
    {
        public Integer Limit = null;
        public String ScientificName = null;
        public List<String> Search = null;

        public Integer getLimit() { return Limit; }
        public GetTaxons setLimit(Integer value) { this.Limit = value; return this; }
        public String getScientificName() { return ScientificName; }
        public GetTaxons setScientificName(String value) { this.ScientificName = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetTaxons setSearch(List<String> value) { this.Search = value; return this; }
        private static Object responseType = SearchResultTaxon.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxons", Verbs="POST")
    public static class PostTaxon implements IReturn<Taxon>
    {
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public String Id = null;
        public String ScientificName = null;
        public String CommonName = null;
        public TaxonomyLevel TaxonomyLevel = null;
        public String Source = null;
        public String Comment = null;
        public String ItisTsn = null;
        public String ItisComment = null;
        public String ItisUrl = null;
        public String ParentId = null;
        public AuditAttributes AuditAttributes = null;

        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PostTaxon setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public String getId() { return Id; }
        public PostTaxon setId(String value) { this.Id = value; return this; }
        public String getScientificName() { return ScientificName; }
        public PostTaxon setScientificName(String value) { this.ScientificName = value; return this; }
        public String getCommonName() { return CommonName; }
        public PostTaxon setCommonName(String value) { this.CommonName = value; return this; }
        public TaxonomyLevel getTaxonomyLevel() { return TaxonomyLevel; }
        public PostTaxon setTaxonomyLevel(TaxonomyLevel value) { this.TaxonomyLevel = value; return this; }
        public String getSource() { return Source; }
        public PostTaxon setSource(String value) { this.Source = value; return this; }
        public String getComment() { return Comment; }
        public PostTaxon setComment(String value) { this.Comment = value; return this; }
        public String getItisTsn() { return ItisTsn; }
        public PostTaxon setItisTsn(String value) { this.ItisTsn = value; return this; }
        public String getItisComment() { return ItisComment; }
        public PostTaxon setItisComment(String value) { this.ItisComment = value; return this; }
        public String getItisUrl() { return ItisUrl; }
        public PostTaxon setItisUrl(String value) { this.ItisUrl = value; return this; }
        public String getParentId() { return ParentId; }
        public PostTaxon setParentId(String value) { this.ParentId = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostTaxon setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Taxon.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxons/{id}", Verbs="GET")
    public static class GetTaxon implements IReturn<Taxon>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetTaxon setId(String value) { this.Id = value; return this; }
        private static Object responseType = Taxon.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxons/{id}", Verbs="PUT")
    public static class PutTaxon implements IReturn<Taxon>
    {
        public String Id = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public String ScientificName = null;
        public String CommonName = null;
        public TaxonomyLevel TaxonomyLevel = null;
        public String Source = null;
        public String Comment = null;
        public String ItisTsn = null;
        public String ItisComment = null;
        public String ItisUrl = null;
        public String ParentId = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutTaxon setId(String value) { this.Id = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PutTaxon setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public String getScientificName() { return ScientificName; }
        public PutTaxon setScientificName(String value) { this.ScientificName = value; return this; }
        public String getCommonName() { return CommonName; }
        public PutTaxon setCommonName(String value) { this.CommonName = value; return this; }
        public TaxonomyLevel getTaxonomyLevel() { return TaxonomyLevel; }
        public PutTaxon setTaxonomyLevel(TaxonomyLevel value) { this.TaxonomyLevel = value; return this; }
        public String getSource() { return Source; }
        public PutTaxon setSource(String value) { this.Source = value; return this; }
        public String getComment() { return Comment; }
        public PutTaxon setComment(String value) { this.Comment = value; return this; }
        public String getItisTsn() { return ItisTsn; }
        public PutTaxon setItisTsn(String value) { this.ItisTsn = value; return this; }
        public String getItisComment() { return ItisComment; }
        public PutTaxon setItisComment(String value) { this.ItisComment = value; return this; }
        public String getItisUrl() { return ItisUrl; }
        public PutTaxon setItisUrl(String value) { this.ItisUrl = value; return this; }
        public String getParentId() { return ParentId; }
        public PutTaxon setParentId(String value) { this.ParentId = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutTaxon setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Taxon.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/taxons/{id}", Verbs="DELETE")
    public static class DeleteTaxon implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteTaxon setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/taxons/{id}/history", Verbs="GET")
    public static class GetTaxonHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetTaxonHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/timezones", Verbs="GET")
    public static class GetTimeZones implements IReturn<SearchResultTimeZone>
    {
        private static Object responseType = SearchResultTimeZone.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroups", Verbs="GET")
    public static class GetUnitGroups implements IReturn<SearchResultUnitGroup>
    {
        public String CustomId = null;
        public Integer Limit = null;
        public List<String> Search = null;
        public GetUnitGroupsSystemCodeType SystemCode = null;

        public String getCustomId() { return CustomId; }
        public GetUnitGroups setCustomId(String value) { this.CustomId = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetUnitGroups setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetUnitGroups setSearch(List<String> value) { this.Search = value; return this; }
        public GetUnitGroupsSystemCodeType getSystemCode() { return SystemCode; }
        public GetUnitGroups setSystemCode(GetUnitGroupsSystemCodeType value) { this.SystemCode = value; return this; }
        private static Object responseType = SearchResultUnitGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroups", Verbs="POST")
    public static class PostUnitGroup implements IReturn<UnitGroup>
    {
        public String Id = null;
        public String CustomId = null;
        public Boolean SupportsConversion = null;
        public UnitGroupSystemCodeType SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostUnitGroup setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostUnitGroup setCustomId(String value) { this.CustomId = value; return this; }
        public Boolean getSupportsConversion() { return SupportsConversion; }
        public PostUnitGroup setSupportsConversion(Boolean value) { this.SupportsConversion = value; return this; }
        public UnitGroupSystemCodeType getSystemCode() { return SystemCode; }
        public PostUnitGroup setSystemCode(UnitGroupSystemCodeType value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostUnitGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = UnitGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroups/{id}", Verbs="GET")
    public static class GetUnitGroup implements IReturn<UnitGroup>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUnitGroup setId(String value) { this.Id = value; return this; }
        private static Object responseType = UnitGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroups/{id}", Verbs="PUT")
    public static class PutUnitGroup implements IReturn<UnitGroup>
    {
        public String Id = null;
        public String CustomId = null;
        public Boolean SupportsConversion = null;
        public UnitGroupSystemCodeType SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutUnitGroup setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutUnitGroup setCustomId(String value) { this.CustomId = value; return this; }
        public Boolean getSupportsConversion() { return SupportsConversion; }
        public PutUnitGroup setSupportsConversion(Boolean value) { this.SupportsConversion = value; return this; }
        public UnitGroupSystemCodeType getSystemCode() { return SystemCode; }
        public PutUnitGroup setSystemCode(UnitGroupSystemCodeType value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutUnitGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = UnitGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroups/{id}", Verbs="DELETE")
    public static class DeleteUnitGroup implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteUnitGroup setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/unitgroups/{id}/history", Verbs="GET")
    public static class GetUnitGroupHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUnitGroupHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroupwithunits", Verbs="GET")
    public static class GetUnitGroupWithUnits implements IReturn<SearchResultUnitGroupWithUnits>
    {
        public String CustomId = null;
        public Integer Limit = null;
        public List<String> Search = null;
        public GetUnitGroupWithUnitsSystemCodeType SystemCode = null;

        public String getCustomId() { return CustomId; }
        public GetUnitGroupWithUnits setCustomId(String value) { this.CustomId = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetUnitGroupWithUnits setLimit(Integer value) { this.Limit = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetUnitGroupWithUnits setSearch(List<String> value) { this.Search = value; return this; }
        public GetUnitGroupWithUnitsSystemCodeType getSystemCode() { return SystemCode; }
        public GetUnitGroupWithUnits setSystemCode(GetUnitGroupWithUnitsSystemCodeType value) { this.SystemCode = value; return this; }
        private static Object responseType = SearchResultUnitGroupWithUnits.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroupwithunits", Verbs="POST")
    public static class PostUnitGroupWithUnit implements IReturn<UnitGroupWithUnits>
    {
        public String Id = null;
        public String CustomId = null;
        public Boolean SupportsConversion = null;
        public UnitGroupWithUnitsSystemCodeType SystemCode = null;
        public List<Unit> Units = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostUnitGroupWithUnit setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostUnitGroupWithUnit setCustomId(String value) { this.CustomId = value; return this; }
        public Boolean getSupportsConversion() { return SupportsConversion; }
        public PostUnitGroupWithUnit setSupportsConversion(Boolean value) { this.SupportsConversion = value; return this; }
        public UnitGroupWithUnitsSystemCodeType getSystemCode() { return SystemCode; }
        public PostUnitGroupWithUnit setSystemCode(UnitGroupWithUnitsSystemCodeType value) { this.SystemCode = value; return this; }
        public List<Unit> getUnits() { return Units; }
        public PostUnitGroupWithUnit setUnits(List<Unit> value) { this.Units = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostUnitGroupWithUnit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = UnitGroupWithUnits.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroupwithunits/{id}", Verbs="GET")
    public static class GetUnitGroupWithUnit implements IReturn<UnitGroupWithUnits>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUnitGroupWithUnit setId(String value) { this.Id = value; return this; }
        private static Object responseType = UnitGroupWithUnits.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroupwithunits/{id}", Verbs="PUT")
    public static class PutUnitGroupWithUnit implements IReturn<UnitGroup>
    {
        public String Id = null;
        public String CustomId = null;
        public Boolean SupportsConversion = null;
        public UnitGroupSystemCodeType SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutUnitGroupWithUnit setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutUnitGroupWithUnit setCustomId(String value) { this.CustomId = value; return this; }
        public Boolean getSupportsConversion() { return SupportsConversion; }
        public PutUnitGroupWithUnit setSupportsConversion(Boolean value) { this.SupportsConversion = value; return this; }
        public UnitGroupSystemCodeType getSystemCode() { return SystemCode; }
        public PutUnitGroupWithUnit setSystemCode(UnitGroupSystemCodeType value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutUnitGroupWithUnit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = UnitGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/unitgroupwithunits/{id}", Verbs="DELETE")
    public static class DeleteUnitGroupWithUnit implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteUnitGroupWithUnit setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/unitgroupwithunits/{id}/history", Verbs="GET")
    public static class GetUnitGroupWithUnitHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUnitGroupWithUnitHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/units", Verbs="GET")
    public static class GetUnits implements IReturn<SearchResultUnit>
    {
        public String CustomId = null;
        public String Unitgroup = null;

        public String getCustomId() { return CustomId; }
        public GetUnits setCustomId(String value) { this.CustomId = value; return this; }
        public String getUnitgroup() { return Unitgroup; }
        public GetUnits setUnitgroup(String value) { this.Unitgroup = value; return this; }
        private static Object responseType = SearchResultUnit.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/units", Verbs="POST")
    public static class PostUnit implements IReturn<Unit>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public Double BaseMultiplier = null;
        public Double BaseOffset = null;
        public UnitGroup UnitGroup = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostUnit setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostUnit setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PostUnit setName(String value) { this.Name = value; return this; }
        public Double getBaseMultiplier() { return BaseMultiplier; }
        public PostUnit setBaseMultiplier(Double value) { this.BaseMultiplier = value; return this; }
        public Double getBaseOffset() { return BaseOffset; }
        public PostUnit setBaseOffset(Double value) { this.BaseOffset = value; return this; }
        public UnitGroup getUnitGroup() { return UnitGroup; }
        public PostUnit setUnitGroup(UnitGroup value) { this.UnitGroup = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostUnit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Unit.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/units/{id}", Verbs="GET")
    public static class GetUnit implements IReturn<Unit>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUnit setId(String value) { this.Id = value; return this; }
        private static Object responseType = Unit.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/units/{id}", Verbs="PUT")
    public static class PutUnit implements IReturn<Unit>
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public Double BaseMultiplier = null;
        public Double BaseOffset = null;
        public UnitGroup UnitGroup = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutUnit setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutUnit setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public PutUnit setName(String value) { this.Name = value; return this; }
        public Double getBaseMultiplier() { return BaseMultiplier; }
        public PutUnit setBaseMultiplier(Double value) { this.BaseMultiplier = value; return this; }
        public Double getBaseOffset() { return BaseOffset; }
        public PutUnit setBaseOffset(Double value) { this.BaseOffset = value; return this; }
        public UnitGroup getUnitGroup() { return UnitGroup; }
        public PutUnit setUnitGroup(UnitGroup value) { this.UnitGroup = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutUnit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Unit.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/units/{id}", Verbs="DELETE")
    public static class DeleteUnit implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteUnit setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v1/units/{id}/history", Verbs="GET")
    public static class GetUnitHistory implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUnitHistory setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/users", Verbs="GET")
    public static class GetUsers implements IReturn<SearchResultUser>
    {
        private static Object responseType = SearchResultUser.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/users", Verbs="POST")
    public static class PostUser implements IReturn<User>
    {
        public String Id = null;
        public String CustomId = null;
        public UserProfile UserProfile = null;
        public String Email = null;
        public UserType UserType = null;
        public List<String> Roles = null;
        public List<String> AccessGroups = null;

        public String getId() { return Id; }
        public PostUser setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostUser setCustomId(String value) { this.CustomId = value; return this; }
        public UserProfile getUserProfile() { return UserProfile; }
        public PostUser setUserProfile(UserProfile value) { this.UserProfile = value; return this; }
        public String getEmail() { return Email; }
        public PostUser setEmail(String value) { this.Email = value; return this; }
        public UserType getUserType() { return UserType; }
        public PostUser setUserType(UserType value) { this.UserType = value; return this; }
        public List<String> getRoles() { return Roles; }
        public PostUser setRoles(List<String> value) { this.Roles = value; return this; }
        public List<String> getAccessGroups() { return AccessGroups; }
        public PostUser setAccessGroups(List<String> value) { this.AccessGroups = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/users/{id}", Verbs="GET")
    public static class GetUser implements IReturn<User>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUser setId(String value) { this.Id = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/users/{id}", Verbs="PUT")
    public static class PutUser implements IReturn<User>
    {
        public String Id = null;
        public String CustomId = null;
        public UserProfile UserProfile = null;
        public String Email = null;
        public UserType UserType = null;
        public List<String> Roles = null;
        public List<String> AccessGroups = null;

        public String getId() { return Id; }
        public PutUser setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutUser setCustomId(String value) { this.CustomId = value; return this; }
        public UserProfile getUserProfile() { return UserProfile; }
        public PutUser setUserProfile(UserProfile value) { this.UserProfile = value; return this; }
        public String getEmail() { return Email; }
        public PutUser setEmail(String value) { this.Email = value; return this; }
        public UserType getUserType() { return UserType; }
        public PutUser setUserType(UserType value) { this.UserType = value; return this; }
        public List<String> getRoles() { return Roles; }
        public PutUser setRoles(List<String> value) { this.Roles = value; return this; }
        public List<String> getAccessGroups() { return AccessGroups; }
        public PutUser setAccessGroups(List<String> value) { this.AccessGroups = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v1/users/{id}", Verbs="DELETE")
    public static class DeleteUser implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteUser setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v2/observationimports", Verbs="POST")
    public static class PostObservationImportV2 implements IReturnVoid
    {
        public String FileType = null;
        public String TimeZoneOffset = null;
        public Boolean LinkFieldVisitsForNewObservations = null;

        public String getFileType() { return FileType; }
        public PostObservationImportV2 setFileType(String value) { this.FileType = value; return this; }
        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostObservationImportV2 setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        public Boolean getLinkFieldVisitsForNewObservations() { return LinkFieldVisitsForNewObservations; }
        public PostObservationImportV2 setLinkFieldVisitsForNewObservations(Boolean value) { this.LinkFieldVisitsForNewObservations = value; return this; }
    }

    @Route(Path="/v2/observationimports/{id}/result", Verbs="GET")
    public static class GetObservationImportResultV2 implements IReturn<ObservationImportSummary>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetObservationImportResultV2 setId(String value) { this.Id = value; return this; }
        private static Object responseType = ObservationImportSummary.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/observationimports/{id}/status", Verbs="GET")
    public static class GetObservationImportStatusV2 implements IReturn<ImportProcessorTransactionStatusResponse>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetObservationImportStatusV2 setId(String value) { this.Id = value; return this; }
        private static Object responseType = ImportProcessorTransactionStatusResponse.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/observationimports/dryrun", Verbs="POST")
    public static class PostObservationsDryRunV2 implements IReturnVoid
    {
        public String FileType = null;
        public String TimeZoneOffset = null;
        public Boolean LinkFieldVisitsForNewObservations = null;

        public String getFileType() { return FileType; }
        public PostObservationsDryRunV2 setFileType(String value) { this.FileType = value; return this; }
        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public PostObservationsDryRunV2 setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        public Boolean getLinkFieldVisitsForNewObservations() { return LinkFieldVisitsForNewObservations; }
        public PostObservationsDryRunV2 setLinkFieldVisitsForNewObservations(Boolean value) { this.LinkFieldVisitsForNewObservations = value; return this; }
    }

    @DataContract
    @Route(Path="/v2/observations", Verbs="GET")
    public static class GetObservationsV2 implements IReturn<SearchResultObservation>, IPaginatedRequest
    {
        @DataMember(Name = "activityCustomId")
        public String ActivityCustomId = null;
        @DataMember(Name = "activityIds")
        public List<String> ActivityIds = null;
        @DataMember(Name = "activityTypes")
        public List<String> ActivityTypes = null;
        @DataMember(Name = "analysisMethodIds")
        public List<String> AnalysisMethodIds = null;
        @DataMember(Name = "analysisMethodSimpleIds")
        public List<String> AnalysisMethodSimpleIds = null;
        @DataMember(Name = "analyticalGroupIds")
        public List<String> AnalyticalGroupIds = null;
        @DataMember(Name = "collectionMethodIds")
        public List<String> CollectionMethodIds = null;
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "customId")
        public String CustomId = null;
        @DataMember(Name = "dataClassifications")
        public List<String> DataClassifications = null;
        @DataMember(Name = "depthUnitCustomId")
        public String DepthUnitCustomId = null;
        @DataMember(Name = "depthUnitId")
        public String DepthUnitId = null;
        @DataMember(Name = "depthValue")
        public Double DepthValue = null;
        @DataMember(Name = "detectionCondition")
        public String DetectionCondition = null;
        @DataMember(Name = "end-lastReindexTime")
        public Instant EndLastReindexTime = null;
        @DataMember(Name = "end-observedTime")
        public Instant EndObservedTime = null;
        @DataMember(Name = "end-resultTime")
        public Instant EndResultTime = null;
        @DataMember(Name = "endModificationTime")
        public Instant EndModificationTime = null;
        @DataMember(Name = "fieldResultType")
        public FieldResultType FieldResultType = null;
        @DataMember(Name = "fieldVisitId")
        public String FieldVisitId = null;
        @DataMember(Name = "filterId")
        public String FilterId = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "importHistoryEventId")
        public String ImportHistoryEventId = null;
        @DataMember(Name = "labReportIds")
        public List<String> LabReportIds = null;
        @DataMember(Name = "labResultLabAnalysisMethodIds")
        public List<String> LabResultLabAnalysisMethodIds = null;
        @DataMember(Name = "labResultLaboratoryIds")
        public List<String> LabResultLaboratoryIds = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "max-numericResultValue")
        public Double MaxNumericResultValue = null;
        @DataMember(Name = "media")
        public List<String> Media = null;
        @DataMember(Name = "min-numericResultValue")
        public Double MinNumericResultValue = null;
        @DataMember(Name = "numericResultValue")
        public Double NumericResultValue = null;
        @DataMember(Name = "observedPropertyIds")
        public List<String> ObservedPropertyIds = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "qualityControlTypes")
        public List<String> QualityControlTypes = null;
        @DataMember(Name = "resultGrades")
        public List<String> ResultGrades = null;
        @DataMember(Name = "resultStatuses")
        public List<String> ResultStatuses = null;
        @DataMember(Name = "sampleFraction")
        public SampleFractionType SampleFraction = null;
        @DataMember(Name = "samplingContextTagIds")
        public List<String> SamplingContextTagIds = null;
        @DataMember(Name = "samplingLocationGroupIds")
        public List<String> SamplingLocationGroupIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "specimenIds")
        public List<String> SpecimenIds = null;
        @DataMember(Name = "specimenName")
        public String SpecimenName = null;
        @DataMember(Name = "start-lastReindexTime")
        public Instant StartLastReindexTime = null;
        @DataMember(Name = "start-observedTime")
        public Instant StartObservedTime = null;
        @DataMember(Name = "start-resultTime")
        public Instant StartResultTime = null;
        @DataMember(Name = "startModificationTime")
        public Instant StartModificationTime = null;
        @DataMember(Name = "taxonIds")
        public List<String> TaxonIds = null;

        public String getActivityCustomId() { return ActivityCustomId; }
        public GetObservationsV2 setActivityCustomId(String value) { this.ActivityCustomId = value; return this; }
        public List<String> getActivityIds() { return ActivityIds; }
        public GetObservationsV2 setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetObservationsV2 setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getAnalysisMethodIds() { return AnalysisMethodIds; }
        public GetObservationsV2 setAnalysisMethodIds(List<String> value) { this.AnalysisMethodIds = value; return this; }
        public List<String> getAnalysisMethodSimpleIds() { return AnalysisMethodSimpleIds; }
        public GetObservationsV2 setAnalysisMethodSimpleIds(List<String> value) { this.AnalysisMethodSimpleIds = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public GetObservationsV2 setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public GetObservationsV2 setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public GetObservationsV2 setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetObservationsV2 setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getDataClassifications() { return DataClassifications; }
        public GetObservationsV2 setDataClassifications(List<String> value) { this.DataClassifications = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public GetObservationsV2 setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public String getDepthUnitId() { return DepthUnitId; }
        public GetObservationsV2 setDepthUnitId(String value) { this.DepthUnitId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public GetObservationsV2 setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDetectionCondition() { return DetectionCondition; }
        public GetObservationsV2 setDetectionCondition(String value) { this.DetectionCondition = value; return this; }
        public Instant getEndLastReindexTime() { return EndLastReindexTime; }
        public GetObservationsV2 setEndLastReindexTime(Instant value) { this.EndLastReindexTime = value; return this; }
        public Instant getEndObservedTime() { return EndObservedTime; }
        public GetObservationsV2 setEndObservedTime(Instant value) { this.EndObservedTime = value; return this; }
        public Instant getEndResultTime() { return EndResultTime; }
        public GetObservationsV2 setEndResultTime(Instant value) { this.EndResultTime = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetObservationsV2 setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public FieldResultType getFieldResultType() { return FieldResultType; }
        public GetObservationsV2 setFieldResultType(FieldResultType value) { this.FieldResultType = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public GetObservationsV2 setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getFilterId() { return FilterId; }
        public GetObservationsV2 setFilterId(String value) { this.FilterId = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetObservationsV2 setIds(List<String> value) { this.Ids = value; return this; }
        public String getImportHistoryEventId() { return ImportHistoryEventId; }
        public GetObservationsV2 setImportHistoryEventId(String value) { this.ImportHistoryEventId = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public GetObservationsV2 setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public List<String> getLabResultLabAnalysisMethodIds() { return LabResultLabAnalysisMethodIds; }
        public GetObservationsV2 setLabResultLabAnalysisMethodIds(List<String> value) { this.LabResultLabAnalysisMethodIds = value; return this; }
        public List<String> getLabResultLaboratoryIds() { return LabResultLaboratoryIds; }
        public GetObservationsV2 setLabResultLaboratoryIds(List<String> value) { this.LabResultLaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetObservationsV2 setLimit(Integer value) { this.Limit = value; return this; }
        public Double getMaxNumericResultValue() { return MaxNumericResultValue; }
        public GetObservationsV2 setMaxNumericResultValue(Double value) { this.MaxNumericResultValue = value; return this; }
        public List<String> getMedia() { return Media; }
        public GetObservationsV2 setMedia(List<String> value) { this.Media = value; return this; }
        public Double getMinNumericResultValue() { return MinNumericResultValue; }
        public GetObservationsV2 setMinNumericResultValue(Double value) { this.MinNumericResultValue = value; return this; }
        public Double getNumericResultValue() { return NumericResultValue; }
        public GetObservationsV2 setNumericResultValue(Double value) { this.NumericResultValue = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetObservationsV2 setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetObservationsV2 setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getQualityControlTypes() { return QualityControlTypes; }
        public GetObservationsV2 setQualityControlTypes(List<String> value) { this.QualityControlTypes = value; return this; }
        public List<String> getResultGrades() { return ResultGrades; }
        public GetObservationsV2 setResultGrades(List<String> value) { this.ResultGrades = value; return this; }
        public List<String> getResultStatuses() { return ResultStatuses; }
        public GetObservationsV2 setResultStatuses(List<String> value) { this.ResultStatuses = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public GetObservationsV2 setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public List<String> getSamplingContextTagIds() { return SamplingContextTagIds; }
        public GetObservationsV2 setSamplingContextTagIds(List<String> value) { this.SamplingContextTagIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetObservationsV2 setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetObservationsV2 setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetObservationsV2 setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetObservationsV2 setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenIds() { return SpecimenIds; }
        public GetObservationsV2 setSpecimenIds(List<String> value) { this.SpecimenIds = value; return this; }
        public String getSpecimenName() { return SpecimenName; }
        public GetObservationsV2 setSpecimenName(String value) { this.SpecimenName = value; return this; }
        public Instant getStartLastReindexTime() { return StartLastReindexTime; }
        public GetObservationsV2 setStartLastReindexTime(Instant value) { this.StartLastReindexTime = value; return this; }
        public Instant getStartObservedTime() { return StartObservedTime; }
        public GetObservationsV2 setStartObservedTime(Instant value) { this.StartObservedTime = value; return this; }
        public Instant getStartResultTime() { return StartResultTime; }
        public GetObservationsV2 setStartResultTime(Instant value) { this.StartResultTime = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetObservationsV2 setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        public List<String> getTaxonIds() { return TaxonIds; }
        public GetObservationsV2 setTaxonIds(List<String> value) { this.TaxonIds = value; return this; }
        private static Object responseType = SearchResultObservation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/observations", Verbs="POST")
    public static class PostObservationV2 implements IReturn<Observation>
    {
        public String Id = null;
        public String CustomId = null;
        public Activity Activity = null;
        public CollectionMethod CollectionMethod = null;
        public ObservedProperty ObservedProperty = null;
        public Specimen Specimen = null;
        public SamplingLocation SamplingLocation = null;
        public NumericResult NumericResult = null;
        public CategoricalResult CategoricalResult = null;
        public TaxonomicResult TaxonomicResult = null;
        public QualityControlType QualityControlType = null;
        public DataClassificationType DataClassification = null;
        public Medium Medium = null;
        public String MediumSubdivision = null;
        public OffsetDateTime ObservedTime = null;
        public OffsetDateTime ResultTime = null;
        public Quantity Depth = null;
        public LabInstruction LabInstruction = null;
        public LabResultDetails LabResultDetails = null;
        public AnalysisMethodSimple AnalysisMethod = null;
        public String Comment = null;
        public FieldVisit FieldVisit = null;
        public Device Device = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<RuleValidationDetails> ValidationWarnings = null;
        public ResultGrade ResultGrade = null;
        public ResultStatus ResultStatus = null;
        public PlannedFieldResult PlannedFieldResult = null;
        public ObservationStatistics Statistics = null;
        public Taxon RelatedTaxon = null;
        public OffsetDateTime LastReindexTime = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public NullMeasureQualifier NullMeasureQualifier = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PostObservationV2 setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostObservationV2 setCustomId(String value) { this.CustomId = value; return this; }
        public Activity getActivity() { return Activity; }
        public PostObservationV2 setActivity(Activity value) { this.Activity = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PostObservationV2 setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public PostObservationV2 setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public Specimen getSpecimen() { return Specimen; }
        public PostObservationV2 setSpecimen(Specimen value) { this.Specimen = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public PostObservationV2 setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public NumericResult getNumericResult() { return NumericResult; }
        public PostObservationV2 setNumericResult(NumericResult value) { this.NumericResult = value; return this; }
        public CategoricalResult getCategoricalResult() { return CategoricalResult; }
        public PostObservationV2 setCategoricalResult(CategoricalResult value) { this.CategoricalResult = value; return this; }
        public TaxonomicResult getTaxonomicResult() { return TaxonomicResult; }
        public PostObservationV2 setTaxonomicResult(TaxonomicResult value) { this.TaxonomicResult = value; return this; }
        public QualityControlType getQualityControlType() { return QualityControlType; }
        public PostObservationV2 setQualityControlType(QualityControlType value) { this.QualityControlType = value; return this; }
        public DataClassificationType getDataClassification() { return DataClassification; }
        public PostObservationV2 setDataClassification(DataClassificationType value) { this.DataClassification = value; return this; }
        public Medium getMedium() { return Medium; }
        public PostObservationV2 setMedium(Medium value) { this.Medium = value; return this; }
        public String getMediumSubdivision() { return MediumSubdivision; }
        public PostObservationV2 setMediumSubdivision(String value) { this.MediumSubdivision = value; return this; }
        public OffsetDateTime getObservedTime() { return ObservedTime; }
        public PostObservationV2 setObservedTime(OffsetDateTime value) { this.ObservedTime = value; return this; }
        public OffsetDateTime getResultTime() { return ResultTime; }
        public PostObservationV2 setResultTime(OffsetDateTime value) { this.ResultTime = value; return this; }
        public Quantity getDepth() { return Depth; }
        public PostObservationV2 setDepth(Quantity value) { this.Depth = value; return this; }
        public LabInstruction getLabInstruction() { return LabInstruction; }
        public PostObservationV2 setLabInstruction(LabInstruction value) { this.LabInstruction = value; return this; }
        public LabResultDetails getLabResultDetails() { return LabResultDetails; }
        public PostObservationV2 setLabResultDetails(LabResultDetails value) { this.LabResultDetails = value; return this; }
        public AnalysisMethodSimple getAnalysisMethod() { return AnalysisMethod; }
        public PostObservationV2 setAnalysisMethod(AnalysisMethodSimple value) { this.AnalysisMethod = value; return this; }
        public String getComment() { return Comment; }
        public PostObservationV2 setComment(String value) { this.Comment = value; return this; }
        public FieldVisit getFieldVisit() { return FieldVisit; }
        public PostObservationV2 setFieldVisit(FieldVisit value) { this.FieldVisit = value; return this; }
        public Device getDevice() { return Device; }
        public PostObservationV2 setDevice(Device value) { this.Device = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PostObservationV2 setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<RuleValidationDetails> getValidationWarnings() { return ValidationWarnings; }
        public PostObservationV2 setValidationWarnings(List<RuleValidationDetails> value) { this.ValidationWarnings = value; return this; }
        public ResultGrade getResultGrade() { return ResultGrade; }
        public PostObservationV2 setResultGrade(ResultGrade value) { this.ResultGrade = value; return this; }
        public ResultStatus getResultStatus() { return ResultStatus; }
        public PostObservationV2 setResultStatus(ResultStatus value) { this.ResultStatus = value; return this; }
        public PlannedFieldResult getPlannedFieldResult() { return PlannedFieldResult; }
        public PostObservationV2 setPlannedFieldResult(PlannedFieldResult value) { this.PlannedFieldResult = value; return this; }
        public ObservationStatistics getStatistics() { return Statistics; }
        public PostObservationV2 setStatistics(ObservationStatistics value) { this.Statistics = value; return this; }
        public Taxon getRelatedTaxon() { return RelatedTaxon; }
        public PostObservationV2 setRelatedTaxon(Taxon value) { this.RelatedTaxon = value; return this; }
        public OffsetDateTime getLastReindexTime() { return LastReindexTime; }
        public PostObservationV2 setLastReindexTime(OffsetDateTime value) { this.LastReindexTime = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PostObservationV2 setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public NullMeasureQualifier getNullMeasureQualifier() { return NullMeasureQualifier; }
        public PostObservationV2 setNullMeasureQualifier(NullMeasureQualifier value) { this.NullMeasureQualifier = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PostObservationV2 setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Observation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @DataContract
    @Route(Path="/v2/observations", Verbs="DELETE")
    public static class DeleteObservationsV2 implements IReturnVoid
    {
        @DataMember(Name = "activityCustomId")
        public String ActivityCustomId = null;
        @DataMember(Name = "activityIds")
        public List<String> ActivityIds = null;
        @DataMember(Name = "activityTypes")
        public List<String> ActivityTypes = null;
        @DataMember(Name = "analysisMethodIds")
        public List<String> AnalysisMethodIds = null;
        @DataMember(Name = "analysisMethodSimpleIds")
        public List<String> AnalysisMethodSimpleIds = null;
        @DataMember(Name = "analyticalGroupIds")
        public List<String> AnalyticalGroupIds = null;
        @DataMember(Name = "collectionMethodIds")
        public List<String> CollectionMethodIds = null;
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "customId")
        public String CustomId = null;
        @DataMember(Name = "dataClassifications")
        public List<String> DataClassifications = null;
        @DataMember(Name = "depthUnitCustomId")
        public String DepthUnitCustomId = null;
        @DataMember(Name = "depthUnitId")
        public String DepthUnitId = null;
        @DataMember(Name = "depthValue")
        public Double DepthValue = null;
        @DataMember(Name = "detectionCondition")
        public String DetectionCondition = null;
        @DataMember(Name = "end-lastReindexTime")
        public Instant EndLastReindexTime = null;
        @DataMember(Name = "end-observedTime")
        public Instant EndObservedTime = null;
        @DataMember(Name = "end-resultTime")
        public Instant EndResultTime = null;
        @DataMember(Name = "endModificationTime")
        public Instant EndModificationTime = null;
        @DataMember(Name = "fieldResultType")
        public FieldResultType FieldResultType = null;
        @DataMember(Name = "fieldVisitId")
        public String FieldVisitId = null;
        @DataMember(Name = "filterId")
        public String FilterId = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "importHistoryEventId")
        public String ImportHistoryEventId = null;
        @DataMember(Name = "labReportIds")
        public List<String> LabReportIds = null;
        @DataMember(Name = "labResultLabAnalysisMethodIds")
        public List<String> LabResultLabAnalysisMethodIds = null;
        @DataMember(Name = "labResultLaboratoryIds")
        public List<String> LabResultLaboratoryIds = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "max-numericResultValue")
        public Double MaxNumericResultValue = null;
        @DataMember(Name = "media")
        public List<String> Media = null;
        @DataMember(Name = "min-numericResultValue")
        public Double MinNumericResultValue = null;
        @DataMember(Name = "numericResultValue")
        public Double NumericResultValue = null;
        @DataMember(Name = "observedPropertyIds")
        public List<String> ObservedPropertyIds = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "qualityControlTypes")
        public List<String> QualityControlTypes = null;
        @DataMember(Name = "resultGrades")
        public List<String> ResultGrades = null;
        @DataMember(Name = "resultStatuses")
        public List<String> ResultStatuses = null;
        @DataMember(Name = "sampleFraction")
        public SampleFractionType SampleFraction = null;
        @DataMember(Name = "samplingContextTagIds")
        public List<String> SamplingContextTagIds = null;
        @DataMember(Name = "samplingLocationGroupIds")
        public List<String> SamplingLocationGroupIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "specimenIds")
        public List<String> SpecimenIds = null;
        @DataMember(Name = "specimenName")
        public String SpecimenName = null;
        @DataMember(Name = "start-lastReindexTime")
        public Instant StartLastReindexTime = null;
        @DataMember(Name = "start-observedTime")
        public Instant StartObservedTime = null;
        @DataMember(Name = "start-resultTime")
        public Instant StartResultTime = null;
        @DataMember(Name = "startModificationTime")
        public Instant StartModificationTime = null;
        @DataMember(Name = "taxonIds")
        public List<String> TaxonIds = null;

        public String getActivityCustomId() { return ActivityCustomId; }
        public DeleteObservationsV2 setActivityCustomId(String value) { this.ActivityCustomId = value; return this; }
        public List<String> getActivityIds() { return ActivityIds; }
        public DeleteObservationsV2 setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public DeleteObservationsV2 setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getAnalysisMethodIds() { return AnalysisMethodIds; }
        public DeleteObservationsV2 setAnalysisMethodIds(List<String> value) { this.AnalysisMethodIds = value; return this; }
        public List<String> getAnalysisMethodSimpleIds() { return AnalysisMethodSimpleIds; }
        public DeleteObservationsV2 setAnalysisMethodSimpleIds(List<String> value) { this.AnalysisMethodSimpleIds = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public DeleteObservationsV2 setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public DeleteObservationsV2 setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public DeleteObservationsV2 setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public DeleteObservationsV2 setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getDataClassifications() { return DataClassifications; }
        public DeleteObservationsV2 setDataClassifications(List<String> value) { this.DataClassifications = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public DeleteObservationsV2 setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public String getDepthUnitId() { return DepthUnitId; }
        public DeleteObservationsV2 setDepthUnitId(String value) { this.DepthUnitId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public DeleteObservationsV2 setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDetectionCondition() { return DetectionCondition; }
        public DeleteObservationsV2 setDetectionCondition(String value) { this.DetectionCondition = value; return this; }
        public Instant getEndLastReindexTime() { return EndLastReindexTime; }
        public DeleteObservationsV2 setEndLastReindexTime(Instant value) { this.EndLastReindexTime = value; return this; }
        public Instant getEndObservedTime() { return EndObservedTime; }
        public DeleteObservationsV2 setEndObservedTime(Instant value) { this.EndObservedTime = value; return this; }
        public Instant getEndResultTime() { return EndResultTime; }
        public DeleteObservationsV2 setEndResultTime(Instant value) { this.EndResultTime = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public DeleteObservationsV2 setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public FieldResultType getFieldResultType() { return FieldResultType; }
        public DeleteObservationsV2 setFieldResultType(FieldResultType value) { this.FieldResultType = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public DeleteObservationsV2 setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getFilterId() { return FilterId; }
        public DeleteObservationsV2 setFilterId(String value) { this.FilterId = value; return this; }
        public List<String> getIds() { return Ids; }
        public DeleteObservationsV2 setIds(List<String> value) { this.Ids = value; return this; }
        public String getImportHistoryEventId() { return ImportHistoryEventId; }
        public DeleteObservationsV2 setImportHistoryEventId(String value) { this.ImportHistoryEventId = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public DeleteObservationsV2 setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public List<String> getLabResultLabAnalysisMethodIds() { return LabResultLabAnalysisMethodIds; }
        public DeleteObservationsV2 setLabResultLabAnalysisMethodIds(List<String> value) { this.LabResultLabAnalysisMethodIds = value; return this; }
        public List<String> getLabResultLaboratoryIds() { return LabResultLaboratoryIds; }
        public DeleteObservationsV2 setLabResultLaboratoryIds(List<String> value) { this.LabResultLaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public DeleteObservationsV2 setLimit(Integer value) { this.Limit = value; return this; }
        public Double getMaxNumericResultValue() { return MaxNumericResultValue; }
        public DeleteObservationsV2 setMaxNumericResultValue(Double value) { this.MaxNumericResultValue = value; return this; }
        public List<String> getMedia() { return Media; }
        public DeleteObservationsV2 setMedia(List<String> value) { this.Media = value; return this; }
        public Double getMinNumericResultValue() { return MinNumericResultValue; }
        public DeleteObservationsV2 setMinNumericResultValue(Double value) { this.MinNumericResultValue = value; return this; }
        public Double getNumericResultValue() { return NumericResultValue; }
        public DeleteObservationsV2 setNumericResultValue(Double value) { this.NumericResultValue = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public DeleteObservationsV2 setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public DeleteObservationsV2 setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getQualityControlTypes() { return QualityControlTypes; }
        public DeleteObservationsV2 setQualityControlTypes(List<String> value) { this.QualityControlTypes = value; return this; }
        public List<String> getResultGrades() { return ResultGrades; }
        public DeleteObservationsV2 setResultGrades(List<String> value) { this.ResultGrades = value; return this; }
        public List<String> getResultStatuses() { return ResultStatuses; }
        public DeleteObservationsV2 setResultStatuses(List<String> value) { this.ResultStatuses = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public DeleteObservationsV2 setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public List<String> getSamplingContextTagIds() { return SamplingContextTagIds; }
        public DeleteObservationsV2 setSamplingContextTagIds(List<String> value) { this.SamplingContextTagIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public DeleteObservationsV2 setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public DeleteObservationsV2 setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public DeleteObservationsV2 setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public DeleteObservationsV2 setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenIds() { return SpecimenIds; }
        public DeleteObservationsV2 setSpecimenIds(List<String> value) { this.SpecimenIds = value; return this; }
        public String getSpecimenName() { return SpecimenName; }
        public DeleteObservationsV2 setSpecimenName(String value) { this.SpecimenName = value; return this; }
        public Instant getStartLastReindexTime() { return StartLastReindexTime; }
        public DeleteObservationsV2 setStartLastReindexTime(Instant value) { this.StartLastReindexTime = value; return this; }
        public Instant getStartObservedTime() { return StartObservedTime; }
        public DeleteObservationsV2 setStartObservedTime(Instant value) { this.StartObservedTime = value; return this; }
        public Instant getStartResultTime() { return StartResultTime; }
        public DeleteObservationsV2 setStartResultTime(Instant value) { this.StartResultTime = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public DeleteObservationsV2 setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        public List<String> getTaxonIds() { return TaxonIds; }
        public DeleteObservationsV2 setTaxonIds(List<String> value) { this.TaxonIds = value; return this; }
    }

    @Route(Path="/v2/observations/{id}", Verbs="GET")
    public static class GetObservationV2 implements IReturn<Observation>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetObservationV2 setId(String value) { this.Id = value; return this; }
        private static Object responseType = Observation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/observations/{id}", Verbs="PUT")
    public static class PutObservationV2 implements IReturn<Observation>
    {
        public String Id = null;
        public String CustomId = null;
        public Activity Activity = null;
        public CollectionMethod CollectionMethod = null;
        public ObservedProperty ObservedProperty = null;
        public Specimen Specimen = null;
        public SamplingLocation SamplingLocation = null;
        public NumericResult NumericResult = null;
        public CategoricalResult CategoricalResult = null;
        public TaxonomicResult TaxonomicResult = null;
        public QualityControlType QualityControlType = null;
        public DataClassificationType DataClassification = null;
        public Medium Medium = null;
        public String MediumSubdivision = null;
        public OffsetDateTime ObservedTime = null;
        public OffsetDateTime ResultTime = null;
        public Quantity Depth = null;
        public LabInstruction LabInstruction = null;
        public LabResultDetails LabResultDetails = null;
        public AnalysisMethodSimple AnalysisMethod = null;
        public String Comment = null;
        public FieldVisit FieldVisit = null;
        public Device Device = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<RuleValidationDetails> ValidationWarnings = null;
        public ResultGrade ResultGrade = null;
        public ResultStatus ResultStatus = null;
        public PlannedFieldResult PlannedFieldResult = null;
        public ObservationStatistics Statistics = null;
        public Taxon RelatedTaxon = null;
        public OffsetDateTime LastReindexTime = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public NullMeasureQualifier NullMeasureQualifier = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PutObservationV2 setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutObservationV2 setCustomId(String value) { this.CustomId = value; return this; }
        public Activity getActivity() { return Activity; }
        public PutObservationV2 setActivity(Activity value) { this.Activity = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PutObservationV2 setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public PutObservationV2 setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public Specimen getSpecimen() { return Specimen; }
        public PutObservationV2 setSpecimen(Specimen value) { this.Specimen = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public PutObservationV2 setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public NumericResult getNumericResult() { return NumericResult; }
        public PutObservationV2 setNumericResult(NumericResult value) { this.NumericResult = value; return this; }
        public CategoricalResult getCategoricalResult() { return CategoricalResult; }
        public PutObservationV2 setCategoricalResult(CategoricalResult value) { this.CategoricalResult = value; return this; }
        public TaxonomicResult getTaxonomicResult() { return TaxonomicResult; }
        public PutObservationV2 setTaxonomicResult(TaxonomicResult value) { this.TaxonomicResult = value; return this; }
        public QualityControlType getQualityControlType() { return QualityControlType; }
        public PutObservationV2 setQualityControlType(QualityControlType value) { this.QualityControlType = value; return this; }
        public DataClassificationType getDataClassification() { return DataClassification; }
        public PutObservationV2 setDataClassification(DataClassificationType value) { this.DataClassification = value; return this; }
        public Medium getMedium() { return Medium; }
        public PutObservationV2 setMedium(Medium value) { this.Medium = value; return this; }
        public String getMediumSubdivision() { return MediumSubdivision; }
        public PutObservationV2 setMediumSubdivision(String value) { this.MediumSubdivision = value; return this; }
        public OffsetDateTime getObservedTime() { return ObservedTime; }
        public PutObservationV2 setObservedTime(OffsetDateTime value) { this.ObservedTime = value; return this; }
        public OffsetDateTime getResultTime() { return ResultTime; }
        public PutObservationV2 setResultTime(OffsetDateTime value) { this.ResultTime = value; return this; }
        public Quantity getDepth() { return Depth; }
        public PutObservationV2 setDepth(Quantity value) { this.Depth = value; return this; }
        public LabInstruction getLabInstruction() { return LabInstruction; }
        public PutObservationV2 setLabInstruction(LabInstruction value) { this.LabInstruction = value; return this; }
        public LabResultDetails getLabResultDetails() { return LabResultDetails; }
        public PutObservationV2 setLabResultDetails(LabResultDetails value) { this.LabResultDetails = value; return this; }
        public AnalysisMethodSimple getAnalysisMethod() { return AnalysisMethod; }
        public PutObservationV2 setAnalysisMethod(AnalysisMethodSimple value) { this.AnalysisMethod = value; return this; }
        public String getComment() { return Comment; }
        public PutObservationV2 setComment(String value) { this.Comment = value; return this; }
        public FieldVisit getFieldVisit() { return FieldVisit; }
        public PutObservationV2 setFieldVisit(FieldVisit value) { this.FieldVisit = value; return this; }
        public Device getDevice() { return Device; }
        public PutObservationV2 setDevice(Device value) { this.Device = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public PutObservationV2 setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<RuleValidationDetails> getValidationWarnings() { return ValidationWarnings; }
        public PutObservationV2 setValidationWarnings(List<RuleValidationDetails> value) { this.ValidationWarnings = value; return this; }
        public ResultGrade getResultGrade() { return ResultGrade; }
        public PutObservationV2 setResultGrade(ResultGrade value) { this.ResultGrade = value; return this; }
        public ResultStatus getResultStatus() { return ResultStatus; }
        public PutObservationV2 setResultStatus(ResultStatus value) { this.ResultStatus = value; return this; }
        public PlannedFieldResult getPlannedFieldResult() { return PlannedFieldResult; }
        public PutObservationV2 setPlannedFieldResult(PlannedFieldResult value) { this.PlannedFieldResult = value; return this; }
        public ObservationStatistics getStatistics() { return Statistics; }
        public PutObservationV2 setStatistics(ObservationStatistics value) { this.Statistics = value; return this; }
        public Taxon getRelatedTaxon() { return RelatedTaxon; }
        public PutObservationV2 setRelatedTaxon(Taxon value) { this.RelatedTaxon = value; return this; }
        public OffsetDateTime getLastReindexTime() { return LastReindexTime; }
        public PutObservationV2 setLastReindexTime(OffsetDateTime value) { this.LastReindexTime = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public PutObservationV2 setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public NullMeasureQualifier getNullMeasureQualifier() { return NullMeasureQualifier; }
        public PutObservationV2 setNullMeasureQualifier(NullMeasureQualifier value) { this.NullMeasureQualifier = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PutObservationV2 setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        private static Object responseType = Observation.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/observations/{id}", Verbs="DELETE")
    public static class DeleteObservationV2 implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteObservationV2 setId(String value) { this.Id = value; return this; }
    }

    @Route(Path="/v2/observations/{id}/history", Verbs="GET")
    public static class GetObservationHistoryV2 implements IReturn<SearchResultAuditHistory>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetObservationHistoryV2 setId(String value) { this.Id = value; return this; }
        private static Object responseType = SearchResultAuditHistory.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @DataContract
    @Route(Path="/v2/observations/charts", Verbs="GET")
    public static class GetChartDataV2 implements IReturn<MultiChartData>
    {
        @DataMember(Name = "activityCustomId")
        public String ActivityCustomId = null;
        @DataMember(Name = "activityIds")
        public List<String> ActivityIds = null;
        @DataMember(Name = "activityTypes")
        public List<String> ActivityTypes = null;
        @DataMember(Name = "analysisMethodIds")
        public List<String> AnalysisMethodIds = null;
        @DataMember(Name = "analysisMethodSimpleIds")
        public List<String> AnalysisMethodSimpleIds = null;
        @DataMember(Name = "analyticalGroupIds")
        public List<String> AnalyticalGroupIds = null;
        @DataMember(Name = "collectionMethodIds")
        public List<String> CollectionMethodIds = null;
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "customId")
        public String CustomId = null;
        @DataMember(Name = "dataClassifications")
        public List<String> DataClassifications = null;
        @DataMember(Name = "depthUnitCustomId")
        public String DepthUnitCustomId = null;
        @DataMember(Name = "depthUnitId")
        public String DepthUnitId = null;
        @DataMember(Name = "depthValue")
        public Double DepthValue = null;
        @DataMember(Name = "detectionCondition")
        public String DetectionCondition = null;
        @DataMember(Name = "end-lastReindexTime")
        public Instant EndLastReindexTime = null;
        @DataMember(Name = "end-observedTime")
        public Instant EndObservedTime = null;
        @DataMember(Name = "end-resultTime")
        public Instant EndResultTime = null;
        @DataMember(Name = "endModificationTime")
        public Instant EndModificationTime = null;
        @DataMember(Name = "fieldResultType")
        public FieldResultType FieldResultType = null;
        @DataMember(Name = "fieldVisitId")
        public String FieldVisitId = null;
        @DataMember(Name = "filterId")
        public String FilterId = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "importHistoryEventId")
        public String ImportHistoryEventId = null;
        @DataMember(Name = "labReportIds")
        public List<String> LabReportIds = null;
        @DataMember(Name = "labResultLabAnalysisMethodIds")
        public List<String> LabResultLabAnalysisMethodIds = null;
        @DataMember(Name = "labResultLaboratoryIds")
        public List<String> LabResultLaboratoryIds = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "max-numericResultValue")
        public Double MaxNumericResultValue = null;
        @DataMember(Name = "media")
        public List<String> Media = null;
        @DataMember(Name = "min-numericResultValue")
        public Double MinNumericResultValue = null;
        @DataMember(Name = "numericResultValue")
        public Double NumericResultValue = null;
        @DataMember(Name = "observedPropertyIds")
        public List<String> ObservedPropertyIds = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "qualityControlTypes")
        public List<String> QualityControlTypes = null;
        @DataMember(Name = "resultGrades")
        public List<String> ResultGrades = null;
        @DataMember(Name = "resultStatuses")
        public List<String> ResultStatuses = null;
        @DataMember(Name = "sampleFraction")
        public SampleFractionType SampleFraction = null;
        @DataMember(Name = "samplingContextTagIds")
        public List<String> SamplingContextTagIds = null;
        @DataMember(Name = "samplingLocationGroupIds")
        public List<String> SamplingLocationGroupIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "specimenIds")
        public List<String> SpecimenIds = null;
        @DataMember(Name = "specimenName")
        public String SpecimenName = null;
        @DataMember(Name = "start-lastReindexTime")
        public Instant StartLastReindexTime = null;
        @DataMember(Name = "start-observedTime")
        public Instant StartObservedTime = null;
        @DataMember(Name = "start-resultTime")
        public Instant StartResultTime = null;
        @DataMember(Name = "startModificationTime")
        public Instant StartModificationTime = null;
        @DataMember(Name = "taxonIds")
        public List<String> TaxonIds = null;

        public String getActivityCustomId() { return ActivityCustomId; }
        public GetChartDataV2 setActivityCustomId(String value) { this.ActivityCustomId = value; return this; }
        public List<String> getActivityIds() { return ActivityIds; }
        public GetChartDataV2 setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetChartDataV2 setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getAnalysisMethodIds() { return AnalysisMethodIds; }
        public GetChartDataV2 setAnalysisMethodIds(List<String> value) { this.AnalysisMethodIds = value; return this; }
        public List<String> getAnalysisMethodSimpleIds() { return AnalysisMethodSimpleIds; }
        public GetChartDataV2 setAnalysisMethodSimpleIds(List<String> value) { this.AnalysisMethodSimpleIds = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public GetChartDataV2 setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public GetChartDataV2 setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public GetChartDataV2 setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetChartDataV2 setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getDataClassifications() { return DataClassifications; }
        public GetChartDataV2 setDataClassifications(List<String> value) { this.DataClassifications = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public GetChartDataV2 setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public String getDepthUnitId() { return DepthUnitId; }
        public GetChartDataV2 setDepthUnitId(String value) { this.DepthUnitId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public GetChartDataV2 setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDetectionCondition() { return DetectionCondition; }
        public GetChartDataV2 setDetectionCondition(String value) { this.DetectionCondition = value; return this; }
        public Instant getEndLastReindexTime() { return EndLastReindexTime; }
        public GetChartDataV2 setEndLastReindexTime(Instant value) { this.EndLastReindexTime = value; return this; }
        public Instant getEndObservedTime() { return EndObservedTime; }
        public GetChartDataV2 setEndObservedTime(Instant value) { this.EndObservedTime = value; return this; }
        public Instant getEndResultTime() { return EndResultTime; }
        public GetChartDataV2 setEndResultTime(Instant value) { this.EndResultTime = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetChartDataV2 setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public FieldResultType getFieldResultType() { return FieldResultType; }
        public GetChartDataV2 setFieldResultType(FieldResultType value) { this.FieldResultType = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public GetChartDataV2 setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getFilterId() { return FilterId; }
        public GetChartDataV2 setFilterId(String value) { this.FilterId = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetChartDataV2 setIds(List<String> value) { this.Ids = value; return this; }
        public String getImportHistoryEventId() { return ImportHistoryEventId; }
        public GetChartDataV2 setImportHistoryEventId(String value) { this.ImportHistoryEventId = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public GetChartDataV2 setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public List<String> getLabResultLabAnalysisMethodIds() { return LabResultLabAnalysisMethodIds; }
        public GetChartDataV2 setLabResultLabAnalysisMethodIds(List<String> value) { this.LabResultLabAnalysisMethodIds = value; return this; }
        public List<String> getLabResultLaboratoryIds() { return LabResultLaboratoryIds; }
        public GetChartDataV2 setLabResultLaboratoryIds(List<String> value) { this.LabResultLaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetChartDataV2 setLimit(Integer value) { this.Limit = value; return this; }
        public Double getMaxNumericResultValue() { return MaxNumericResultValue; }
        public GetChartDataV2 setMaxNumericResultValue(Double value) { this.MaxNumericResultValue = value; return this; }
        public List<String> getMedia() { return Media; }
        public GetChartDataV2 setMedia(List<String> value) { this.Media = value; return this; }
        public Double getMinNumericResultValue() { return MinNumericResultValue; }
        public GetChartDataV2 setMinNumericResultValue(Double value) { this.MinNumericResultValue = value; return this; }
        public Double getNumericResultValue() { return NumericResultValue; }
        public GetChartDataV2 setNumericResultValue(Double value) { this.NumericResultValue = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetChartDataV2 setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetChartDataV2 setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getQualityControlTypes() { return QualityControlTypes; }
        public GetChartDataV2 setQualityControlTypes(List<String> value) { this.QualityControlTypes = value; return this; }
        public List<String> getResultGrades() { return ResultGrades; }
        public GetChartDataV2 setResultGrades(List<String> value) { this.ResultGrades = value; return this; }
        public List<String> getResultStatuses() { return ResultStatuses; }
        public GetChartDataV2 setResultStatuses(List<String> value) { this.ResultStatuses = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public GetChartDataV2 setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public List<String> getSamplingContextTagIds() { return SamplingContextTagIds; }
        public GetChartDataV2 setSamplingContextTagIds(List<String> value) { this.SamplingContextTagIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetChartDataV2 setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetChartDataV2 setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetChartDataV2 setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetChartDataV2 setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenIds() { return SpecimenIds; }
        public GetChartDataV2 setSpecimenIds(List<String> value) { this.SpecimenIds = value; return this; }
        public String getSpecimenName() { return SpecimenName; }
        public GetChartDataV2 setSpecimenName(String value) { this.SpecimenName = value; return this; }
        public Instant getStartLastReindexTime() { return StartLastReindexTime; }
        public GetChartDataV2 setStartLastReindexTime(Instant value) { this.StartLastReindexTime = value; return this; }
        public Instant getStartObservedTime() { return StartObservedTime; }
        public GetChartDataV2 setStartObservedTime(Instant value) { this.StartObservedTime = value; return this; }
        public Instant getStartResultTime() { return StartResultTime; }
        public GetChartDataV2 setStartResultTime(Instant value) { this.StartResultTime = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetChartDataV2 setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        public List<String> getTaxonIds() { return TaxonIds; }
        public GetChartDataV2 setTaxonIds(List<String> value) { this.TaxonIds = value; return this; }
        private static Object responseType = MultiChartData.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @DataContract
    @Route(Path="/v2/observations/geographic", Verbs="GET")
    public static class GetGroupedObservationsV2 implements IReturn<SearchResultLocationObservationsGroup>, IPaginatedRequest
    {
        @DataMember(Name = "activityCustomId")
        public String ActivityCustomId = null;
        @DataMember(Name = "activityIds")
        public List<String> ActivityIds = null;
        @DataMember(Name = "activityTypes")
        public List<String> ActivityTypes = null;
        @DataMember(Name = "analysisMethodIds")
        public List<String> AnalysisMethodIds = null;
        @DataMember(Name = "analysisMethodSimpleIds")
        public List<String> AnalysisMethodSimpleIds = null;
        @DataMember(Name = "analyticalGroupIds")
        public List<String> AnalyticalGroupIds = null;
        @DataMember(Name = "collectionMethodIds")
        public List<String> CollectionMethodIds = null;
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "customId")
        public String CustomId = null;
        @DataMember(Name = "dataClassifications")
        public List<String> DataClassifications = null;
        @DataMember(Name = "depthUnitCustomId")
        public String DepthUnitCustomId = null;
        @DataMember(Name = "depthUnitId")
        public String DepthUnitId = null;
        @DataMember(Name = "depthValue")
        public Double DepthValue = null;
        @DataMember(Name = "detectionCondition")
        public String DetectionCondition = null;
        @DataMember(Name = "end-lastReindexTime")
        public Instant EndLastReindexTime = null;
        @DataMember(Name = "end-observedTime")
        public Instant EndObservedTime = null;
        @DataMember(Name = "end-resultTime")
        public Instant EndResultTime = null;
        @DataMember(Name = "endModificationTime")
        public Instant EndModificationTime = null;
        @DataMember(Name = "fieldResultType")
        public FieldResultType FieldResultType = null;
        @DataMember(Name = "fieldVisitId")
        public String FieldVisitId = null;
        @DataMember(Name = "filterId")
        public String FilterId = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "importHistoryEventId")
        public String ImportHistoryEventId = null;
        @DataMember(Name = "labReportIds")
        public List<String> LabReportIds = null;
        @DataMember(Name = "labResultLabAnalysisMethodIds")
        public List<String> LabResultLabAnalysisMethodIds = null;
        @DataMember(Name = "labResultLaboratoryIds")
        public List<String> LabResultLaboratoryIds = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "max-numericResultValue")
        public Double MaxNumericResultValue = null;
        @DataMember(Name = "media")
        public List<String> Media = null;
        @DataMember(Name = "min-numericResultValue")
        public Double MinNumericResultValue = null;
        @DataMember(Name = "numericResultValue")
        public Double NumericResultValue = null;
        @DataMember(Name = "observedPropertyIds")
        public List<String> ObservedPropertyIds = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "qualityControlTypes")
        public List<String> QualityControlTypes = null;
        @DataMember(Name = "resultGrades")
        public List<String> ResultGrades = null;
        @DataMember(Name = "resultStatuses")
        public List<String> ResultStatuses = null;
        @DataMember(Name = "sampleFraction")
        public SampleFractionType SampleFraction = null;
        @DataMember(Name = "samplingContextTagIds")
        public List<String> SamplingContextTagIds = null;
        @DataMember(Name = "samplingLocationGroupIds")
        public List<String> SamplingLocationGroupIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "specimenIds")
        public List<String> SpecimenIds = null;
        @DataMember(Name = "specimenName")
        public String SpecimenName = null;
        @DataMember(Name = "start-lastReindexTime")
        public Instant StartLastReindexTime = null;
        @DataMember(Name = "start-observedTime")
        public Instant StartObservedTime = null;
        @DataMember(Name = "start-resultTime")
        public Instant StartResultTime = null;
        @DataMember(Name = "startModificationTime")
        public Instant StartModificationTime = null;
        @DataMember(Name = "taxonIds")
        public List<String> TaxonIds = null;

        public String getActivityCustomId() { return ActivityCustomId; }
        public GetGroupedObservationsV2 setActivityCustomId(String value) { this.ActivityCustomId = value; return this; }
        public List<String> getActivityIds() { return ActivityIds; }
        public GetGroupedObservationsV2 setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetGroupedObservationsV2 setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getAnalysisMethodIds() { return AnalysisMethodIds; }
        public GetGroupedObservationsV2 setAnalysisMethodIds(List<String> value) { this.AnalysisMethodIds = value; return this; }
        public List<String> getAnalysisMethodSimpleIds() { return AnalysisMethodSimpleIds; }
        public GetGroupedObservationsV2 setAnalysisMethodSimpleIds(List<String> value) { this.AnalysisMethodSimpleIds = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public GetGroupedObservationsV2 setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public GetGroupedObservationsV2 setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public GetGroupedObservationsV2 setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetGroupedObservationsV2 setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getDataClassifications() { return DataClassifications; }
        public GetGroupedObservationsV2 setDataClassifications(List<String> value) { this.DataClassifications = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public GetGroupedObservationsV2 setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public String getDepthUnitId() { return DepthUnitId; }
        public GetGroupedObservationsV2 setDepthUnitId(String value) { this.DepthUnitId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public GetGroupedObservationsV2 setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDetectionCondition() { return DetectionCondition; }
        public GetGroupedObservationsV2 setDetectionCondition(String value) { this.DetectionCondition = value; return this; }
        public Instant getEndLastReindexTime() { return EndLastReindexTime; }
        public GetGroupedObservationsV2 setEndLastReindexTime(Instant value) { this.EndLastReindexTime = value; return this; }
        public Instant getEndObservedTime() { return EndObservedTime; }
        public GetGroupedObservationsV2 setEndObservedTime(Instant value) { this.EndObservedTime = value; return this; }
        public Instant getEndResultTime() { return EndResultTime; }
        public GetGroupedObservationsV2 setEndResultTime(Instant value) { this.EndResultTime = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetGroupedObservationsV2 setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public FieldResultType getFieldResultType() { return FieldResultType; }
        public GetGroupedObservationsV2 setFieldResultType(FieldResultType value) { this.FieldResultType = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public GetGroupedObservationsV2 setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getFilterId() { return FilterId; }
        public GetGroupedObservationsV2 setFilterId(String value) { this.FilterId = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetGroupedObservationsV2 setIds(List<String> value) { this.Ids = value; return this; }
        public String getImportHistoryEventId() { return ImportHistoryEventId; }
        public GetGroupedObservationsV2 setImportHistoryEventId(String value) { this.ImportHistoryEventId = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public GetGroupedObservationsV2 setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public List<String> getLabResultLabAnalysisMethodIds() { return LabResultLabAnalysisMethodIds; }
        public GetGroupedObservationsV2 setLabResultLabAnalysisMethodIds(List<String> value) { this.LabResultLabAnalysisMethodIds = value; return this; }
        public List<String> getLabResultLaboratoryIds() { return LabResultLaboratoryIds; }
        public GetGroupedObservationsV2 setLabResultLaboratoryIds(List<String> value) { this.LabResultLaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetGroupedObservationsV2 setLimit(Integer value) { this.Limit = value; return this; }
        public Double getMaxNumericResultValue() { return MaxNumericResultValue; }
        public GetGroupedObservationsV2 setMaxNumericResultValue(Double value) { this.MaxNumericResultValue = value; return this; }
        public List<String> getMedia() { return Media; }
        public GetGroupedObservationsV2 setMedia(List<String> value) { this.Media = value; return this; }
        public Double getMinNumericResultValue() { return MinNumericResultValue; }
        public GetGroupedObservationsV2 setMinNumericResultValue(Double value) { this.MinNumericResultValue = value; return this; }
        public Double getNumericResultValue() { return NumericResultValue; }
        public GetGroupedObservationsV2 setNumericResultValue(Double value) { this.NumericResultValue = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetGroupedObservationsV2 setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetGroupedObservationsV2 setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getQualityControlTypes() { return QualityControlTypes; }
        public GetGroupedObservationsV2 setQualityControlTypes(List<String> value) { this.QualityControlTypes = value; return this; }
        public List<String> getResultGrades() { return ResultGrades; }
        public GetGroupedObservationsV2 setResultGrades(List<String> value) { this.ResultGrades = value; return this; }
        public List<String> getResultStatuses() { return ResultStatuses; }
        public GetGroupedObservationsV2 setResultStatuses(List<String> value) { this.ResultStatuses = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public GetGroupedObservationsV2 setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public List<String> getSamplingContextTagIds() { return SamplingContextTagIds; }
        public GetGroupedObservationsV2 setSamplingContextTagIds(List<String> value) { this.SamplingContextTagIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetGroupedObservationsV2 setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetGroupedObservationsV2 setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetGroupedObservationsV2 setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetGroupedObservationsV2 setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenIds() { return SpecimenIds; }
        public GetGroupedObservationsV2 setSpecimenIds(List<String> value) { this.SpecimenIds = value; return this; }
        public String getSpecimenName() { return SpecimenName; }
        public GetGroupedObservationsV2 setSpecimenName(String value) { this.SpecimenName = value; return this; }
        public Instant getStartLastReindexTime() { return StartLastReindexTime; }
        public GetGroupedObservationsV2 setStartLastReindexTime(Instant value) { this.StartLastReindexTime = value; return this; }
        public Instant getStartObservedTime() { return StartObservedTime; }
        public GetGroupedObservationsV2 setStartObservedTime(Instant value) { this.StartObservedTime = value; return this; }
        public Instant getStartResultTime() { return StartResultTime; }
        public GetGroupedObservationsV2 setStartResultTime(Instant value) { this.StartResultTime = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetGroupedObservationsV2 setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        public List<String> getTaxonIds() { return TaxonIds; }
        public GetGroupedObservationsV2 setTaxonIds(List<String> value) { this.TaxonIds = value; return this; }
        private static Object responseType = SearchResultLocationObservationsGroup.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @DataContract
    @Route(Path="/v2/observations/resultgrades", Verbs="PUT")
    public static class PutBulkEditResultGradesV2 implements IReturnVoid
    {
        @DataMember(Name = "targetResultGrade")
        public String TargetResultGrade = null;
        @DataMember(Name = "activityCustomId")
        public String ActivityCustomId = null;
        @DataMember(Name = "activityIds")
        public List<String> ActivityIds = null;
        @DataMember(Name = "activityTypes")
        public List<String> ActivityTypes = null;
        @DataMember(Name = "analysisMethodIds")
        public List<String> AnalysisMethodIds = null;
        @DataMember(Name = "analysisMethodSimpleIds")
        public List<String> AnalysisMethodSimpleIds = null;
        @DataMember(Name = "analyticalGroupIds")
        public List<String> AnalyticalGroupIds = null;
        @DataMember(Name = "collectionMethodIds")
        public List<String> CollectionMethodIds = null;
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "customId")
        public String CustomId = null;
        @DataMember(Name = "dataClassifications")
        public List<String> DataClassifications = null;
        @DataMember(Name = "depthUnitCustomId")
        public String DepthUnitCustomId = null;
        @DataMember(Name = "depthUnitId")
        public String DepthUnitId = null;
        @DataMember(Name = "depthValue")
        public Double DepthValue = null;
        @DataMember(Name = "detectionCondition")
        public String DetectionCondition = null;
        @DataMember(Name = "end-lastReindexTime")
        public Instant EndLastReindexTime = null;
        @DataMember(Name = "end-observedTime")
        public Instant EndObservedTime = null;
        @DataMember(Name = "end-resultTime")
        public Instant EndResultTime = null;
        @DataMember(Name = "endModificationTime")
        public Instant EndModificationTime = null;
        @DataMember(Name = "fieldResultType")
        public FieldResultType FieldResultType = null;
        @DataMember(Name = "fieldVisitId")
        public String FieldVisitId = null;
        @DataMember(Name = "filterId")
        public String FilterId = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "importHistoryEventId")
        public String ImportHistoryEventId = null;
        @DataMember(Name = "labReportIds")
        public List<String> LabReportIds = null;
        @DataMember(Name = "labResultLabAnalysisMethodIds")
        public List<String> LabResultLabAnalysisMethodIds = null;
        @DataMember(Name = "labResultLaboratoryIds")
        public List<String> LabResultLaboratoryIds = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "max-numericResultValue")
        public Double MaxNumericResultValue = null;
        @DataMember(Name = "media")
        public List<String> Media = null;
        @DataMember(Name = "min-numericResultValue")
        public Double MinNumericResultValue = null;
        @DataMember(Name = "numericResultValue")
        public Double NumericResultValue = null;
        @DataMember(Name = "observedPropertyIds")
        public List<String> ObservedPropertyIds = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "qualityControlTypes")
        public List<String> QualityControlTypes = null;
        @DataMember(Name = "resultGrades")
        public List<String> ResultGrades = null;
        @DataMember(Name = "resultStatuses")
        public List<String> ResultStatuses = null;
        @DataMember(Name = "sampleFraction")
        public SampleFractionType SampleFraction = null;
        @DataMember(Name = "samplingContextTagIds")
        public List<String> SamplingContextTagIds = null;
        @DataMember(Name = "samplingLocationGroupIds")
        public List<String> SamplingLocationGroupIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "specimenIds")
        public List<String> SpecimenIds = null;
        @DataMember(Name = "specimenName")
        public String SpecimenName = null;
        @DataMember(Name = "start-lastReindexTime")
        public Instant StartLastReindexTime = null;
        @DataMember(Name = "start-observedTime")
        public Instant StartObservedTime = null;
        @DataMember(Name = "start-resultTime")
        public Instant StartResultTime = null;
        @DataMember(Name = "startModificationTime")
        public Instant StartModificationTime = null;
        @DataMember(Name = "taxonIds")
        public List<String> TaxonIds = null;

        public String getTargetResultGrade() { return TargetResultGrade; }
        public PutBulkEditResultGradesV2 setTargetResultGrade(String value) { this.TargetResultGrade = value; return this; }
        public String getActivityCustomId() { return ActivityCustomId; }
        public PutBulkEditResultGradesV2 setActivityCustomId(String value) { this.ActivityCustomId = value; return this; }
        public List<String> getActivityIds() { return ActivityIds; }
        public PutBulkEditResultGradesV2 setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public PutBulkEditResultGradesV2 setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getAnalysisMethodIds() { return AnalysisMethodIds; }
        public PutBulkEditResultGradesV2 setAnalysisMethodIds(List<String> value) { this.AnalysisMethodIds = value; return this; }
        public List<String> getAnalysisMethodSimpleIds() { return AnalysisMethodSimpleIds; }
        public PutBulkEditResultGradesV2 setAnalysisMethodSimpleIds(List<String> value) { this.AnalysisMethodSimpleIds = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public PutBulkEditResultGradesV2 setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public PutBulkEditResultGradesV2 setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public PutBulkEditResultGradesV2 setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutBulkEditResultGradesV2 setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getDataClassifications() { return DataClassifications; }
        public PutBulkEditResultGradesV2 setDataClassifications(List<String> value) { this.DataClassifications = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public PutBulkEditResultGradesV2 setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public String getDepthUnitId() { return DepthUnitId; }
        public PutBulkEditResultGradesV2 setDepthUnitId(String value) { this.DepthUnitId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public PutBulkEditResultGradesV2 setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDetectionCondition() { return DetectionCondition; }
        public PutBulkEditResultGradesV2 setDetectionCondition(String value) { this.DetectionCondition = value; return this; }
        public Instant getEndLastReindexTime() { return EndLastReindexTime; }
        public PutBulkEditResultGradesV2 setEndLastReindexTime(Instant value) { this.EndLastReindexTime = value; return this; }
        public Instant getEndObservedTime() { return EndObservedTime; }
        public PutBulkEditResultGradesV2 setEndObservedTime(Instant value) { this.EndObservedTime = value; return this; }
        public Instant getEndResultTime() { return EndResultTime; }
        public PutBulkEditResultGradesV2 setEndResultTime(Instant value) { this.EndResultTime = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public PutBulkEditResultGradesV2 setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public FieldResultType getFieldResultType() { return FieldResultType; }
        public PutBulkEditResultGradesV2 setFieldResultType(FieldResultType value) { this.FieldResultType = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public PutBulkEditResultGradesV2 setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getFilterId() { return FilterId; }
        public PutBulkEditResultGradesV2 setFilterId(String value) { this.FilterId = value; return this; }
        public List<String> getIds() { return Ids; }
        public PutBulkEditResultGradesV2 setIds(List<String> value) { this.Ids = value; return this; }
        public String getImportHistoryEventId() { return ImportHistoryEventId; }
        public PutBulkEditResultGradesV2 setImportHistoryEventId(String value) { this.ImportHistoryEventId = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public PutBulkEditResultGradesV2 setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public List<String> getLabResultLabAnalysisMethodIds() { return LabResultLabAnalysisMethodIds; }
        public PutBulkEditResultGradesV2 setLabResultLabAnalysisMethodIds(List<String> value) { this.LabResultLabAnalysisMethodIds = value; return this; }
        public List<String> getLabResultLaboratoryIds() { return LabResultLaboratoryIds; }
        public PutBulkEditResultGradesV2 setLabResultLaboratoryIds(List<String> value) { this.LabResultLaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public PutBulkEditResultGradesV2 setLimit(Integer value) { this.Limit = value; return this; }
        public Double getMaxNumericResultValue() { return MaxNumericResultValue; }
        public PutBulkEditResultGradesV2 setMaxNumericResultValue(Double value) { this.MaxNumericResultValue = value; return this; }
        public List<String> getMedia() { return Media; }
        public PutBulkEditResultGradesV2 setMedia(List<String> value) { this.Media = value; return this; }
        public Double getMinNumericResultValue() { return MinNumericResultValue; }
        public PutBulkEditResultGradesV2 setMinNumericResultValue(Double value) { this.MinNumericResultValue = value; return this; }
        public Double getNumericResultValue() { return NumericResultValue; }
        public PutBulkEditResultGradesV2 setNumericResultValue(Double value) { this.NumericResultValue = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public PutBulkEditResultGradesV2 setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public PutBulkEditResultGradesV2 setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getQualityControlTypes() { return QualityControlTypes; }
        public PutBulkEditResultGradesV2 setQualityControlTypes(List<String> value) { this.QualityControlTypes = value; return this; }
        public List<String> getResultGrades() { return ResultGrades; }
        public PutBulkEditResultGradesV2 setResultGrades(List<String> value) { this.ResultGrades = value; return this; }
        public List<String> getResultStatuses() { return ResultStatuses; }
        public PutBulkEditResultGradesV2 setResultStatuses(List<String> value) { this.ResultStatuses = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public PutBulkEditResultGradesV2 setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public List<String> getSamplingContextTagIds() { return SamplingContextTagIds; }
        public PutBulkEditResultGradesV2 setSamplingContextTagIds(List<String> value) { this.SamplingContextTagIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public PutBulkEditResultGradesV2 setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public PutBulkEditResultGradesV2 setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public PutBulkEditResultGradesV2 setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public PutBulkEditResultGradesV2 setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenIds() { return SpecimenIds; }
        public PutBulkEditResultGradesV2 setSpecimenIds(List<String> value) { this.SpecimenIds = value; return this; }
        public String getSpecimenName() { return SpecimenName; }
        public PutBulkEditResultGradesV2 setSpecimenName(String value) { this.SpecimenName = value; return this; }
        public Instant getStartLastReindexTime() { return StartLastReindexTime; }
        public PutBulkEditResultGradesV2 setStartLastReindexTime(Instant value) { this.StartLastReindexTime = value; return this; }
        public Instant getStartObservedTime() { return StartObservedTime; }
        public PutBulkEditResultGradesV2 setStartObservedTime(Instant value) { this.StartObservedTime = value; return this; }
        public Instant getStartResultTime() { return StartResultTime; }
        public PutBulkEditResultGradesV2 setStartResultTime(Instant value) { this.StartResultTime = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public PutBulkEditResultGradesV2 setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        public List<String> getTaxonIds() { return TaxonIds; }
        public PutBulkEditResultGradesV2 setTaxonIds(List<String> value) { this.TaxonIds = value; return this; }
    }

    @DataContract
    @Route(Path="/v2/services/export/observations", Verbs="GET")
    public static class GetObservationExportIIV2 implements IReturnVoid
    {
        @DataMember(Name = "format")
        public GetObservationExportIIFormatType Format = null;
        @DataMember(Name = "activityCustomId")
        public String ActivityCustomId = null;
        @DataMember(Name = "activityIds")
        public List<String> ActivityIds = null;
        @DataMember(Name = "activityTypes")
        public List<String> ActivityTypes = null;
        @DataMember(Name = "analysisMethodIds")
        public List<String> AnalysisMethodIds = null;
        @DataMember(Name = "analysisMethodSimpleIds")
        public List<String> AnalysisMethodSimpleIds = null;
        @DataMember(Name = "analyticalGroupIds")
        public List<String> AnalyticalGroupIds = null;
        @DataMember(Name = "collectionMethodIds")
        public List<String> CollectionMethodIds = null;
        @DataMember(Name = "cursor")
        public String Cursor = null;
        @DataMember(Name = "customId")
        public String CustomId = null;
        @DataMember(Name = "dataClassifications")
        public List<String> DataClassifications = null;
        @DataMember(Name = "depthUnitCustomId")
        public String DepthUnitCustomId = null;
        @DataMember(Name = "depthUnitId")
        public String DepthUnitId = null;
        @DataMember(Name = "depthValue")
        public Double DepthValue = null;
        @DataMember(Name = "detectionCondition")
        public String DetectionCondition = null;
        @DataMember(Name = "end-lastReindexTime")
        public Instant EndLastReindexTime = null;
        @DataMember(Name = "end-observedTime")
        public Instant EndObservedTime = null;
        @DataMember(Name = "end-resultTime")
        public Instant EndResultTime = null;
        @DataMember(Name = "endModificationTime")
        public Instant EndModificationTime = null;
        @DataMember(Name = "fieldResultType")
        public FieldResultType FieldResultType = null;
        @DataMember(Name = "fieldVisitId")
        public String FieldVisitId = null;
        @DataMember(Name = "filterId")
        public String FilterId = null;
        @DataMember(Name = "ids")
        public List<String> Ids = null;
        @DataMember(Name = "importHistoryEventId")
        public String ImportHistoryEventId = null;
        @DataMember(Name = "labReportIds")
        public List<String> LabReportIds = null;
        @DataMember(Name = "labResultLabAnalysisMethodIds")
        public List<String> LabResultLabAnalysisMethodIds = null;
        @DataMember(Name = "labResultLaboratoryIds")
        public List<String> LabResultLaboratoryIds = null;
        @DataMember(Name = "limit")
        public Integer Limit = null;
        @DataMember(Name = "max-numericResultValue")
        public Double MaxNumericResultValue = null;
        @DataMember(Name = "media")
        public List<String> Media = null;
        @DataMember(Name = "min-numericResultValue")
        public Double MinNumericResultValue = null;
        @DataMember(Name = "numericResultValue")
        public Double NumericResultValue = null;
        @DataMember(Name = "observedPropertyIds")
        public List<String> ObservedPropertyIds = null;
        @DataMember(Name = "projectIds")
        public List<String> ProjectIds = null;
        @DataMember(Name = "qualityControlTypes")
        public List<String> QualityControlTypes = null;
        @DataMember(Name = "resultGrades")
        public List<String> ResultGrades = null;
        @DataMember(Name = "resultStatuses")
        public List<String> ResultStatuses = null;
        @DataMember(Name = "sampleFraction")
        public SampleFractionType SampleFraction = null;
        @DataMember(Name = "samplingContextTagIds")
        public List<String> SamplingContextTagIds = null;
        @DataMember(Name = "samplingLocationGroupIds")
        public List<String> SamplingLocationGroupIds = null;
        @DataMember(Name = "samplingLocationIds")
        public List<String> SamplingLocationIds = null;
        @DataMember(Name = "search")
        public List<String> Search = null;
        @DataMember(Name = "sort")
        public String Sort = null;
        @DataMember(Name = "specimenIds")
        public List<String> SpecimenIds = null;
        @DataMember(Name = "specimenName")
        public String SpecimenName = null;
        @DataMember(Name = "start-lastReindexTime")
        public Instant StartLastReindexTime = null;
        @DataMember(Name = "start-observedTime")
        public Instant StartObservedTime = null;
        @DataMember(Name = "start-resultTime")
        public Instant StartResultTime = null;
        @DataMember(Name = "startModificationTime")
        public Instant StartModificationTime = null;
        @DataMember(Name = "taxonIds")
        public List<String> TaxonIds = null;

        public GetObservationExportIIFormatType getFormat() { return Format; }
        public GetObservationExportIIV2 setFormat(GetObservationExportIIFormatType value) { this.Format = value; return this; }
        public String getActivityCustomId() { return ActivityCustomId; }
        public GetObservationExportIIV2 setActivityCustomId(String value) { this.ActivityCustomId = value; return this; }
        public List<String> getActivityIds() { return ActivityIds; }
        public GetObservationExportIIV2 setActivityIds(List<String> value) { this.ActivityIds = value; return this; }
        public List<String> getActivityTypes() { return ActivityTypes; }
        public GetObservationExportIIV2 setActivityTypes(List<String> value) { this.ActivityTypes = value; return this; }
        public List<String> getAnalysisMethodIds() { return AnalysisMethodIds; }
        public GetObservationExportIIV2 setAnalysisMethodIds(List<String> value) { this.AnalysisMethodIds = value; return this; }
        public List<String> getAnalysisMethodSimpleIds() { return AnalysisMethodSimpleIds; }
        public GetObservationExportIIV2 setAnalysisMethodSimpleIds(List<String> value) { this.AnalysisMethodSimpleIds = value; return this; }
        public List<String> getAnalyticalGroupIds() { return AnalyticalGroupIds; }
        public GetObservationExportIIV2 setAnalyticalGroupIds(List<String> value) { this.AnalyticalGroupIds = value; return this; }
        public List<String> getCollectionMethodIds() { return CollectionMethodIds; }
        public GetObservationExportIIV2 setCollectionMethodIds(List<String> value) { this.CollectionMethodIds = value; return this; }
        public String getCursor() { return Cursor; }
        public GetObservationExportIIV2 setCursor(String value) { this.Cursor = value; return this; }
        public String getCustomId() { return CustomId; }
        public GetObservationExportIIV2 setCustomId(String value) { this.CustomId = value; return this; }
        public List<String> getDataClassifications() { return DataClassifications; }
        public GetObservationExportIIV2 setDataClassifications(List<String> value) { this.DataClassifications = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public GetObservationExportIIV2 setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public String getDepthUnitId() { return DepthUnitId; }
        public GetObservationExportIIV2 setDepthUnitId(String value) { this.DepthUnitId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public GetObservationExportIIV2 setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDetectionCondition() { return DetectionCondition; }
        public GetObservationExportIIV2 setDetectionCondition(String value) { this.DetectionCondition = value; return this; }
        public Instant getEndLastReindexTime() { return EndLastReindexTime; }
        public GetObservationExportIIV2 setEndLastReindexTime(Instant value) { this.EndLastReindexTime = value; return this; }
        public Instant getEndObservedTime() { return EndObservedTime; }
        public GetObservationExportIIV2 setEndObservedTime(Instant value) { this.EndObservedTime = value; return this; }
        public Instant getEndResultTime() { return EndResultTime; }
        public GetObservationExportIIV2 setEndResultTime(Instant value) { this.EndResultTime = value; return this; }
        public Instant getEndModificationTime() { return EndModificationTime; }
        public GetObservationExportIIV2 setEndModificationTime(Instant value) { this.EndModificationTime = value; return this; }
        public FieldResultType getFieldResultType() { return FieldResultType; }
        public GetObservationExportIIV2 setFieldResultType(FieldResultType value) { this.FieldResultType = value; return this; }
        public String getFieldVisitId() { return FieldVisitId; }
        public GetObservationExportIIV2 setFieldVisitId(String value) { this.FieldVisitId = value; return this; }
        public String getFilterId() { return FilterId; }
        public GetObservationExportIIV2 setFilterId(String value) { this.FilterId = value; return this; }
        public List<String> getIds() { return Ids; }
        public GetObservationExportIIV2 setIds(List<String> value) { this.Ids = value; return this; }
        public String getImportHistoryEventId() { return ImportHistoryEventId; }
        public GetObservationExportIIV2 setImportHistoryEventId(String value) { this.ImportHistoryEventId = value; return this; }
        public List<String> getLabReportIds() { return LabReportIds; }
        public GetObservationExportIIV2 setLabReportIds(List<String> value) { this.LabReportIds = value; return this; }
        public List<String> getLabResultLabAnalysisMethodIds() { return LabResultLabAnalysisMethodIds; }
        public GetObservationExportIIV2 setLabResultLabAnalysisMethodIds(List<String> value) { this.LabResultLabAnalysisMethodIds = value; return this; }
        public List<String> getLabResultLaboratoryIds() { return LabResultLaboratoryIds; }
        public GetObservationExportIIV2 setLabResultLaboratoryIds(List<String> value) { this.LabResultLaboratoryIds = value; return this; }
        public Integer getLimit() { return Limit; }
        public GetObservationExportIIV2 setLimit(Integer value) { this.Limit = value; return this; }
        public Double getMaxNumericResultValue() { return MaxNumericResultValue; }
        public GetObservationExportIIV2 setMaxNumericResultValue(Double value) { this.MaxNumericResultValue = value; return this; }
        public List<String> getMedia() { return Media; }
        public GetObservationExportIIV2 setMedia(List<String> value) { this.Media = value; return this; }
        public Double getMinNumericResultValue() { return MinNumericResultValue; }
        public GetObservationExportIIV2 setMinNumericResultValue(Double value) { this.MinNumericResultValue = value; return this; }
        public Double getNumericResultValue() { return NumericResultValue; }
        public GetObservationExportIIV2 setNumericResultValue(Double value) { this.NumericResultValue = value; return this; }
        public List<String> getObservedPropertyIds() { return ObservedPropertyIds; }
        public GetObservationExportIIV2 setObservedPropertyIds(List<String> value) { this.ObservedPropertyIds = value; return this; }
        public List<String> getProjectIds() { return ProjectIds; }
        public GetObservationExportIIV2 setProjectIds(List<String> value) { this.ProjectIds = value; return this; }
        public List<String> getQualityControlTypes() { return QualityControlTypes; }
        public GetObservationExportIIV2 setQualityControlTypes(List<String> value) { this.QualityControlTypes = value; return this; }
        public List<String> getResultGrades() { return ResultGrades; }
        public GetObservationExportIIV2 setResultGrades(List<String> value) { this.ResultGrades = value; return this; }
        public List<String> getResultStatuses() { return ResultStatuses; }
        public GetObservationExportIIV2 setResultStatuses(List<String> value) { this.ResultStatuses = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public GetObservationExportIIV2 setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public List<String> getSamplingContextTagIds() { return SamplingContextTagIds; }
        public GetObservationExportIIV2 setSamplingContextTagIds(List<String> value) { this.SamplingContextTagIds = value; return this; }
        public List<String> getSamplingLocationGroupIds() { return SamplingLocationGroupIds; }
        public GetObservationExportIIV2 setSamplingLocationGroupIds(List<String> value) { this.SamplingLocationGroupIds = value; return this; }
        public List<String> getSamplingLocationIds() { return SamplingLocationIds; }
        public GetObservationExportIIV2 setSamplingLocationIds(List<String> value) { this.SamplingLocationIds = value; return this; }
        public List<String> getSearch() { return Search; }
        public GetObservationExportIIV2 setSearch(List<String> value) { this.Search = value; return this; }
        public String getSort() { return Sort; }
        public GetObservationExportIIV2 setSort(String value) { this.Sort = value; return this; }
        public List<String> getSpecimenIds() { return SpecimenIds; }
        public GetObservationExportIIV2 setSpecimenIds(List<String> value) { this.SpecimenIds = value; return this; }
        public String getSpecimenName() { return SpecimenName; }
        public GetObservationExportIIV2 setSpecimenName(String value) { this.SpecimenName = value; return this; }
        public Instant getStartLastReindexTime() { return StartLastReindexTime; }
        public GetObservationExportIIV2 setStartLastReindexTime(Instant value) { this.StartLastReindexTime = value; return this; }
        public Instant getStartObservedTime() { return StartObservedTime; }
        public GetObservationExportIIV2 setStartObservedTime(Instant value) { this.StartObservedTime = value; return this; }
        public Instant getStartResultTime() { return StartResultTime; }
        public GetObservationExportIIV2 setStartResultTime(Instant value) { this.StartResultTime = value; return this; }
        public Instant getStartModificationTime() { return StartModificationTime; }
        public GetObservationExportIIV2 setStartModificationTime(Instant value) { this.StartModificationTime = value; return this; }
        public List<String> getTaxonIds() { return TaxonIds; }
        public GetObservationExportIIV2 setTaxonIds(List<String> value) { this.TaxonIds = value; return this; }
    }

    @Route(Path="/v2/users", Verbs="GET")
    public static class GetUsersV2 implements IReturn<SearchResultUser>
    {
        private static Object responseType = SearchResultUser.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/users", Verbs="POST")
    public static class PostUserV2 implements IReturn<User>
    {
        public String Id = null;
        public String CustomId = null;
        public UserProfile UserProfile = null;
        public String Email = null;
        public UserType UserType = null;
        public List<String> Roles = null;
        public List<String> AccessGroups = null;

        public String getId() { return Id; }
        public PostUserV2 setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PostUserV2 setCustomId(String value) { this.CustomId = value; return this; }
        public UserProfile getUserProfile() { return UserProfile; }
        public PostUserV2 setUserProfile(UserProfile value) { this.UserProfile = value; return this; }
        public String getEmail() { return Email; }
        public PostUserV2 setEmail(String value) { this.Email = value; return this; }
        public UserType getUserType() { return UserType; }
        public PostUserV2 setUserType(UserType value) { this.UserType = value; return this; }
        public List<String> getRoles() { return Roles; }
        public PostUserV2 setRoles(List<String> value) { this.Roles = value; return this; }
        public List<String> getAccessGroups() { return AccessGroups; }
        public PostUserV2 setAccessGroups(List<String> value) { this.AccessGroups = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/users/{id}", Verbs="GET")
    public static class GetUserV2 implements IReturn<User>
    {
        public String Id = null;

        public String getId() { return Id; }
        public GetUserV2 setId(String value) { this.Id = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/users/{id}", Verbs="PUT")
    public static class PutUserV2 implements IReturn<User>
    {
        public String Id = null;
        public String CustomId = null;
        public UserProfile UserProfile = null;
        public String Email = null;
        public UserType UserType = null;
        public List<String> Roles = null;
        public List<String> AccessGroups = null;

        public String getId() { return Id; }
        public PutUserV2 setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public PutUserV2 setCustomId(String value) { this.CustomId = value; return this; }
        public UserProfile getUserProfile() { return UserProfile; }
        public PutUserV2 setUserProfile(UserProfile value) { this.UserProfile = value; return this; }
        public String getEmail() { return Email; }
        public PutUserV2 setEmail(String value) { this.Email = value; return this; }
        public UserType getUserType() { return UserType; }
        public PutUserV2 setUserType(UserType value) { this.UserType = value; return this; }
        public List<String> getRoles() { return Roles; }
        public PutUserV2 setRoles(List<String> value) { this.Roles = value; return this; }
        public List<String> getAccessGroups() { return AccessGroups; }
        public PutUserV2 setAccessGroups(List<String> value) { this.AccessGroups = value; return this; }
        private static Object responseType = User.class;
        public Object getResponseType() {{ return responseType; }}
    }

    @Route(Path="/v2/users/{id}", Verbs="DELETE")
    public static class DeleteUserV2 implements IReturnVoid
    {
        public String Id = null;

        public String getId() { return Id; }
        public DeleteUserV2 setId(String value) { this.Id = value; return this; }
    }

    public static class AccessGroup
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public Boolean CanEditAllData = null;
        public List<SamplingLocationGroup> SamplingLocationGroups = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public AccessGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public AccessGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public AccessGroup setDescription(String value) { this.Description = value; return this; }
        public Boolean getCanEditAllData() { return CanEditAllData; }
        public AccessGroup setCanEditAllData(Boolean value) { this.CanEditAllData = value; return this; }
        public List<SamplingLocationGroup> getSamplingLocationGroups() { return SamplingLocationGroups; }
        public AccessGroup setSamplingLocationGroups(List<SamplingLocationGroup> value) { this.SamplingLocationGroups = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public AccessGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class Activity
    {
        public ActivityType Type = null;
        public String Id = null;
        public String CustomId = null;
        public String SourceActivityId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Comment = null;
        public String LoggerFileName = null;
        public Device Device = null;
        public CollectionMethod CollectionMethod = null;
        public Medium Medium = null;
        public PlannedActivity PlannedActivity = null;
        public Quantity Depth = null;
        public SamplingLocation SamplingLocation = null;
        public FieldVisit FieldVisit = null;
        public List<SamplingContextTag> SamplingContextTags = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public Boolean Refreshed = null;
        public AuditAttributes AuditAttributes = null;

        public ActivityType getType() { return Type; }
        public Activity setType(ActivityType value) { this.Type = value; return this; }
        public String getId() { return Id; }
        public Activity setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Activity setCustomId(String value) { this.CustomId = value; return this; }
        public String getSourceActivityId() { return SourceActivityId; }
        public Activity setSourceActivityId(String value) { this.SourceActivityId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public Activity setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public Activity setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getComment() { return Comment; }
        public Activity setComment(String value) { this.Comment = value; return this; }
        public String getLoggerFileName() { return LoggerFileName; }
        public Activity setLoggerFileName(String value) { this.LoggerFileName = value; return this; }
        public Device getDevice() { return Device; }
        public Activity setDevice(Device value) { this.Device = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public Activity setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public Medium getMedium() { return Medium; }
        public Activity setMedium(Medium value) { this.Medium = value; return this; }
        public PlannedActivity getPlannedActivity() { return PlannedActivity; }
        public Activity setPlannedActivity(PlannedActivity value) { this.PlannedActivity = value; return this; }
        public Quantity getDepth() { return Depth; }
        public Activity setDepth(Quantity value) { this.Depth = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public Activity setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public FieldVisit getFieldVisit() { return FieldVisit; }
        public Activity setFieldVisit(FieldVisit value) { this.FieldVisit = value; return this; }
        public List<SamplingContextTag> getSamplingContextTags() { return SamplingContextTags; }
        public Activity setSamplingContextTags(List<SamplingContextTag> value) { this.SamplingContextTags = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public Activity setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public Boolean getRefreshed() { return Refreshed; }
        public Activity setRefreshed(Boolean value) { this.Refreshed = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Activity setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ActivityTemplate
    {
        public String Id = null;
        public List<SpecimenTemplate> SpecimenTemplates = null;
        public String CustomId = null;
        public ActivityTemplateType Type = null;
        public String Comment = null;
        public MediumType Medium = null;
        public Quantity Depth = null;
        public CollectionMethod CollectionMethod = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ActivityTemplate setId(String value) { this.Id = value; return this; }
        public List<SpecimenTemplate> getSpecimenTemplates() { return SpecimenTemplates; }
        public ActivityTemplate setSpecimenTemplates(List<SpecimenTemplate> value) { this.SpecimenTemplates = value; return this; }
        public String getCustomId() { return CustomId; }
        public ActivityTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public ActivityTemplateType getType() { return Type; }
        public ActivityTemplate setType(ActivityTemplateType value) { this.Type = value; return this; }
        public String getComment() { return Comment; }
        public ActivityTemplate setComment(String value) { this.Comment = value; return this; }
        public MediumType getMedium() { return Medium; }
        public ActivityTemplate setMedium(MediumType value) { this.Medium = value; return this; }
        public Quantity getDepth() { return Depth; }
        public ActivityTemplate setDepth(Quantity value) { this.Depth = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public ActivityTemplate setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ActivityTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ActivityWithDetails
    {
        public ActivityWithDetailsType Type = null;
        public String Id = null;
        public String CustomId = null;
        public String SourceActivityId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Comment = null;
        public String LoggerFileName = null;
        public Device Device = null;
        public CollectionMethod CollectionMethod = null;
        public Medium Medium = null;
        public PlannedActivity PlannedActivity = null;
        public Quantity Depth = null;
        public SamplingLocation SamplingLocation = null;
        public FieldVisit FieldVisit = null;
        public List<SamplingContextTag> SamplingContextTags = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public IndexConfiguration IndexConfiguration = null;
        public List<MetricResult> MetricResults = null;
        public List<SpecimenNestedInActivity> Specimens = null;
        public List<ObservationMinimal> Observations = null;
        public Boolean Refreshed = null;
        public AuditAttributes AuditAttributes = null;

        public ActivityWithDetailsType getType() { return Type; }
        public ActivityWithDetails setType(ActivityWithDetailsType value) { this.Type = value; return this; }
        public String getId() { return Id; }
        public ActivityWithDetails setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ActivityWithDetails setCustomId(String value) { this.CustomId = value; return this; }
        public String getSourceActivityId() { return SourceActivityId; }
        public ActivityWithDetails setSourceActivityId(String value) { this.SourceActivityId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public ActivityWithDetails setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public ActivityWithDetails setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getComment() { return Comment; }
        public ActivityWithDetails setComment(String value) { this.Comment = value; return this; }
        public String getLoggerFileName() { return LoggerFileName; }
        public ActivityWithDetails setLoggerFileName(String value) { this.LoggerFileName = value; return this; }
        public Device getDevice() { return Device; }
        public ActivityWithDetails setDevice(Device value) { this.Device = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public ActivityWithDetails setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public Medium getMedium() { return Medium; }
        public ActivityWithDetails setMedium(Medium value) { this.Medium = value; return this; }
        public PlannedActivity getPlannedActivity() { return PlannedActivity; }
        public ActivityWithDetails setPlannedActivity(PlannedActivity value) { this.PlannedActivity = value; return this; }
        public Quantity getDepth() { return Depth; }
        public ActivityWithDetails setDepth(Quantity value) { this.Depth = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public ActivityWithDetails setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public FieldVisit getFieldVisit() { return FieldVisit; }
        public ActivityWithDetails setFieldVisit(FieldVisit value) { this.FieldVisit = value; return this; }
        public List<SamplingContextTag> getSamplingContextTags() { return SamplingContextTags; }
        public ActivityWithDetails setSamplingContextTags(List<SamplingContextTag> value) { this.SamplingContextTags = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public ActivityWithDetails setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public IndexConfiguration getIndexConfiguration() { return IndexConfiguration; }
        public ActivityWithDetails setIndexConfiguration(IndexConfiguration value) { this.IndexConfiguration = value; return this; }
        public List<MetricResult> getMetricResults() { return MetricResults; }
        public ActivityWithDetails setMetricResults(List<MetricResult> value) { this.MetricResults = value; return this; }
        public List<SpecimenNestedInActivity> getSpecimens() { return Specimens; }
        public ActivityWithDetails setSpecimens(List<SpecimenNestedInActivity> value) { this.Specimens = value; return this; }
        public List<ObservationMinimal> getObservations() { return Observations; }
        public ActivityWithDetails setObservations(List<ObservationMinimal> value) { this.Observations = value; return this; }
        public Boolean getRefreshed() { return Refreshed; }
        public ActivityWithDetails setRefreshed(Boolean value) { this.Refreshed = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ActivityWithDetails setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class Address
    {
        public String StreetName = null;
        public String CityName = null;
        public String StateProvinceCode = null;
        public String PostalCode = null;
        public String CountryCode = null;
        public String CountyCode = null;
        public AddressType AddressType = null;

        public String getStreetName() { return StreetName; }
        public Address setStreetName(String value) { this.StreetName = value; return this; }
        public String getCityName() { return CityName; }
        public Address setCityName(String value) { this.CityName = value; return this; }
        public String getStateProvinceCode() { return StateProvinceCode; }
        public Address setStateProvinceCode(String value) { this.StateProvinceCode = value; return this; }
        public String getPostalCode() { return PostalCode; }
        public Address setPostalCode(String value) { this.PostalCode = value; return this; }
        public String getCountryCode() { return CountryCode; }
        public Address setCountryCode(String value) { this.CountryCode = value; return this; }
        public String getCountyCode() { return CountyCode; }
        public Address setCountyCode(String value) { this.CountyCode = value; return this; }
        public AddressType getAddressType() { return AddressType; }
        public Address setAddressType(AddressType value) { this.AddressType = value; return this; }
    }

    public static class AnalysisMethod
    {
        public String Id = null;
        public String MethodId = null;
        public String Name = null;
        public String Context = null;
        public String Description = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public AnalysisMethod setId(String value) { this.Id = value; return this; }
        public String getMethodId() { return MethodId; }
        public AnalysisMethod setMethodId(String value) { this.MethodId = value; return this; }
        public String getName() { return Name; }
        public AnalysisMethod setName(String value) { this.Name = value; return this; }
        public String getContext() { return Context; }
        public AnalysisMethod setContext(String value) { this.Context = value; return this; }
        public String getDescription() { return Description; }
        public AnalysisMethod setDescription(String value) { this.Description = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public AnalysisMethod setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public AnalysisMethod setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public AnalysisMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class AnalysisMethodImportSummary
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemAnalysisMethod> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemAnalysisMethod> NonErrorImportItems = null;
        public List<ImportItemAnalysisMethod> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public AnalysisMethodImportSummary setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public AnalysisMethodImportSummary setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public AnalysisMethodImportSummary setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public AnalysisMethodImportSummary setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public AnalysisMethodImportSummary setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public AnalysisMethodImportSummary setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public AnalysisMethodImportSummary setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemAnalysisMethod> getImportItems() { return ImportItems; }
        public AnalysisMethodImportSummary setImportItems(List<ImportItemAnalysisMethod> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public AnalysisMethodImportSummary setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public AnalysisMethodImportSummary setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemAnalysisMethod> getNonErrorImportItems() { return NonErrorImportItems; }
        public AnalysisMethodImportSummary setNonErrorImportItems(List<ImportItemAnalysisMethod> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemAnalysisMethod> getErrorImportItems() { return ErrorImportItems; }
        public AnalysisMethodImportSummary setErrorImportItems(List<ImportItemAnalysisMethod> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public AnalysisMethodImportSummary setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class AnalysisMethodMinimal
    {
        public String Id = null;
        public String Name = null;

        public String getId() { return Id; }
        public AnalysisMethodMinimal setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public AnalysisMethodMinimal setName(String value) { this.Name = value; return this; }
    }

    public static class AnalysisMethodSimple
    {
        public String Id = null;
        public String MethodId = null;
        public String Name = null;
        public String Context = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public AnalysisMethodSimple setId(String value) { this.Id = value; return this; }
        public String getMethodId() { return MethodId; }
        public AnalysisMethodSimple setMethodId(String value) { this.MethodId = value; return this; }
        public String getName() { return Name; }
        public AnalysisMethodSimple setName(String value) { this.Name = value; return this; }
        public String getContext() { return Context; }
        public AnalysisMethodSimple setContext(String value) { this.Context = value; return this; }
        public String getDescription() { return Description; }
        public AnalysisMethodSimple setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public AnalysisMethodSimple setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class AnalyticalGroup
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public AnalyticalGroupType Type = null;
        public Integer NumberOfObservedPropertiesInGroupItems = null;
        public Integer NumberOfAnalysisMethodsInGroupItems = null;
        public List<AnalyticalGroupItem> AnalyticalGroupItems = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public AnalyticalGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public AnalyticalGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public AnalyticalGroup setDescription(String value) { this.Description = value; return this; }
        public AnalyticalGroupType getType() { return Type; }
        public AnalyticalGroup setType(AnalyticalGroupType value) { this.Type = value; return this; }
        public Integer getNumberOfObservedPropertiesInGroupItems() { return NumberOfObservedPropertiesInGroupItems; }
        public AnalyticalGroup setNumberOfObservedPropertiesInGroupItems(Integer value) { this.NumberOfObservedPropertiesInGroupItems = value; return this; }
        public Integer getNumberOfAnalysisMethodsInGroupItems() { return NumberOfAnalysisMethodsInGroupItems; }
        public AnalyticalGroup setNumberOfAnalysisMethodsInGroupItems(Integer value) { this.NumberOfAnalysisMethodsInGroupItems = value; return this; }
        public List<AnalyticalGroupItem> getAnalyticalGroupItems() { return AnalyticalGroupItems; }
        public AnalyticalGroup setAnalyticalGroupItems(List<AnalyticalGroupItem> value) { this.AnalyticalGroupItems = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public AnalyticalGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class AnalyticalGroupItem
    {
        public ObservedProperty ObservedProperty = null;
        public String HoldingTime = null;
        public AnalysisMethod AnalysisMethod = null;

        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public AnalyticalGroupItem setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public String getHoldingTime() { return HoldingTime; }
        public AnalyticalGroupItem setHoldingTime(String value) { this.HoldingTime = value; return this; }
        public AnalysisMethod getAnalysisMethod() { return AnalysisMethod; }
        public AnalyticalGroupItem setAnalysisMethod(AnalysisMethod value) { this.AnalysisMethod = value; return this; }
    }

    public static class AnalyticalGroupSimple
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public AnalyticalGroupSimpleType Type = null;
        public Integer NumberOfObservedPropertiesInGroupItems = null;
        public Integer NumberOfAnalysisMethodsInGroupItems = null;

        public String getId() { return Id; }
        public AnalyticalGroupSimple setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public AnalyticalGroupSimple setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public AnalyticalGroupSimple setDescription(String value) { this.Description = value; return this; }
        public AnalyticalGroupSimpleType getType() { return Type; }
        public AnalyticalGroupSimple setType(AnalyticalGroupSimpleType value) { this.Type = value; return this; }
        public Integer getNumberOfObservedPropertiesInGroupItems() { return NumberOfObservedPropertiesInGroupItems; }
        public AnalyticalGroupSimple setNumberOfObservedPropertiesInGroupItems(Integer value) { this.NumberOfObservedPropertiesInGroupItems = value; return this; }
        public Integer getNumberOfAnalysisMethodsInGroupItems() { return NumberOfAnalysisMethodsInGroupItems; }
        public AnalyticalGroupSimple setNumberOfAnalysisMethodsInGroupItems(Integer value) { this.NumberOfAnalysisMethodsInGroupItems = value; return this; }
    }

    public static class Attachment
    {
        public String Id = null;
        public String FileName = null;
        public String ContentType = null;
        public String Comment = null;
        public Integer FileSize = null;
        public OffsetDateTime DateTaken = null;
        public String Latitude = null;
        public String Longitude = null;
        public String Resolution = null;
        public AuditAttributesFull AuditAttributes = null;

        public String getId() { return Id; }
        public Attachment setId(String value) { this.Id = value; return this; }
        public String getFileName() { return FileName; }
        public Attachment setFileName(String value) { this.FileName = value; return this; }
        public String getContentType() { return ContentType; }
        public Attachment setContentType(String value) { this.ContentType = value; return this; }
        public String getComment() { return Comment; }
        public Attachment setComment(String value) { this.Comment = value; return this; }
        public Integer getFileSize() { return FileSize; }
        public Attachment setFileSize(Integer value) { this.FileSize = value; return this; }
        public OffsetDateTime getDateTaken() { return DateTaken; }
        public Attachment setDateTaken(OffsetDateTime value) { this.DateTaken = value; return this; }
        public String getLatitude() { return Latitude; }
        public Attachment setLatitude(String value) { this.Latitude = value; return this; }
        public String getLongitude() { return Longitude; }
        public Attachment setLongitude(String value) { this.Longitude = value; return this; }
        public String getResolution() { return Resolution; }
        public Attachment setResolution(String value) { this.Resolution = value; return this; }
        public AuditAttributesFull getAuditAttributes() { return AuditAttributes; }
        public Attachment setAuditAttributes(AuditAttributesFull value) { this.AuditAttributes = value; return this; }
    }

    public static class AttachmentRepresentation
    {
        public String Id = null;
        public String FileName = null;
        public String ContentType = null;
        public String Comment = null;
        public Integer FileSize = null;
        public OffsetDateTime DateTaken = null;
        public String Latitude = null;
        public String Longitude = null;
        public String Resolution = null;
        public Boolean Success = null;
        public AuditAttributesFull AuditAttributes = null;

        public String getId() { return Id; }
        public AttachmentRepresentation setId(String value) { this.Id = value; return this; }
        public String getFileName() { return FileName; }
        public AttachmentRepresentation setFileName(String value) { this.FileName = value; return this; }
        public String getContentType() { return ContentType; }
        public AttachmentRepresentation setContentType(String value) { this.ContentType = value; return this; }
        public String getComment() { return Comment; }
        public AttachmentRepresentation setComment(String value) { this.Comment = value; return this; }
        public Integer getFileSize() { return FileSize; }
        public AttachmentRepresentation setFileSize(Integer value) { this.FileSize = value; return this; }
        public OffsetDateTime getDateTaken() { return DateTaken; }
        public AttachmentRepresentation setDateTaken(OffsetDateTime value) { this.DateTaken = value; return this; }
        public String getLatitude() { return Latitude; }
        public AttachmentRepresentation setLatitude(String value) { this.Latitude = value; return this; }
        public String getLongitude() { return Longitude; }
        public AttachmentRepresentation setLongitude(String value) { this.Longitude = value; return this; }
        public String getResolution() { return Resolution; }
        public AttachmentRepresentation setResolution(String value) { this.Resolution = value; return this; }
        public Boolean getSuccess() { return Success; }
        public AttachmentRepresentation setSuccess(Boolean value) { this.Success = value; return this; }
        public AuditAttributesFull getAuditAttributes() { return AuditAttributes; }
        public AttachmentRepresentation setAuditAttributes(AuditAttributesFull value) { this.AuditAttributes = value; return this; }
    }

    public static class AuditAttributes
    {
        public String CreationUserProfileId = null;
        public OffsetDateTime CreationTime = null;
        public String ModificationUserProfileId = null;
        public OffsetDateTime ModificationTime = null;

        public String getCreationUserProfileId() { return CreationUserProfileId; }
        public AuditAttributes setCreationUserProfileId(String value) { this.CreationUserProfileId = value; return this; }
        public OffsetDateTime getCreationTime() { return CreationTime; }
        public AuditAttributes setCreationTime(OffsetDateTime value) { this.CreationTime = value; return this; }
        public String getModificationUserProfileId() { return ModificationUserProfileId; }
        public AuditAttributes setModificationUserProfileId(String value) { this.ModificationUserProfileId = value; return this; }
        public OffsetDateTime getModificationTime() { return ModificationTime; }
        public AuditAttributes setModificationTime(OffsetDateTime value) { this.ModificationTime = value; return this; }
    }

    public static class AuditAttributesFull
    {
        public String CreationUserProfileId = null;
        public OffsetDateTime CreationTime = null;
        public String ModificationUserProfileId = null;
        public OffsetDateTime ModificationTime = null;
        public UserProfile CreationUserProfile = null;
        public UserProfile ModificationUserProfile = null;

        public String getCreationUserProfileId() { return CreationUserProfileId; }
        public AuditAttributesFull setCreationUserProfileId(String value) { this.CreationUserProfileId = value; return this; }
        public OffsetDateTime getCreationTime() { return CreationTime; }
        public AuditAttributesFull setCreationTime(OffsetDateTime value) { this.CreationTime = value; return this; }
        public String getModificationUserProfileId() { return ModificationUserProfileId; }
        public AuditAttributesFull setModificationUserProfileId(String value) { this.ModificationUserProfileId = value; return this; }
        public OffsetDateTime getModificationTime() { return ModificationTime; }
        public AuditAttributesFull setModificationTime(OffsetDateTime value) { this.ModificationTime = value; return this; }
        public UserProfile getCreationUserProfile() { return CreationUserProfile; }
        public AuditAttributesFull setCreationUserProfile(UserProfile value) { this.CreationUserProfile = value; return this; }
        public UserProfile getModificationUserProfile() { return ModificationUserProfile; }
        public AuditAttributesFull setModificationUserProfile(UserProfile value) { this.ModificationUserProfile = value; return this; }
    }

    public static class AuditChange
    {
        public String Key = null;
        public String FromValue = null;
        public String FromId = null;
        public String ToValue = null;
        public String ToId = null;

        public String getKey() { return Key; }
        public AuditChange setKey(String value) { this.Key = value; return this; }
        public String getFromValue() { return FromValue; }
        public AuditChange setFromValue(String value) { this.FromValue = value; return this; }
        public String getFromId() { return FromId; }
        public AuditChange setFromId(String value) { this.FromId = value; return this; }
        public String getToValue() { return ToValue; }
        public AuditChange setToValue(String value) { this.ToValue = value; return this; }
        public String getToId() { return ToId; }
        public AuditChange setToId(String value) { this.ToId = value; return this; }
    }

    public static class AuditHistory
    {
        public OffsetDateTime ModificationTime = null;
        public UserProfile UserProfile = null;
        public OperationType Operation = null;
        public List<AuditChange> AuditChanges = null;

        public OffsetDateTime getModificationTime() { return ModificationTime; }
        public AuditHistory setModificationTime(OffsetDateTime value) { this.ModificationTime = value; return this; }
        public UserProfile getUserProfile() { return UserProfile; }
        public AuditHistory setUserProfile(UserProfile value) { this.UserProfile = value; return this; }
        public OperationType getOperation() { return Operation; }
        public AuditHistory setOperation(OperationType value) { this.Operation = value; return this; }
        public List<AuditChange> getAuditChanges() { return AuditChanges; }
        public AuditHistory setAuditChanges(List<AuditChange> value) { this.AuditChanges = value; return this; }
    }

    public static class CategoricalResult
    {
        public NullMeasureQualifier NullMeasureQualifier = null;
        public CategoricalValue FixedValue = null;
        public String Type = null;
        public String Value = null;

        public NullMeasureQualifier getNullMeasureQualifier() { return NullMeasureQualifier; }
        public CategoricalResult setNullMeasureQualifier(NullMeasureQualifier value) { this.NullMeasureQualifier = value; return this; }
        public CategoricalValue getFixedValue() { return FixedValue; }
        public CategoricalResult setFixedValue(CategoricalValue value) { this.FixedValue = value; return this; }
        public String getType() { return Type; }
        public CategoricalResult setType(String value) { this.Type = value; return this; }
        public String getValue() { return Value; }
        public CategoricalResult setValue(String value) { this.Value = value; return this; }
    }

    public static class CategoricalValue
    {
        public String Id = null;
        public String CustomId = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public CategoricalValue setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public CategoricalValue setCustomId(String value) { this.CustomId = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public CategoricalValue setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ChartData
    {
        public ObservedProperty ObservedProperty = null;
        public SamplingLocation SamplingLocation = null;
        public UnitGroupWithUnits UnitGroupWithUnits = null;
        public UnitGroupWithUnits DepthUnitGroupWithUnits = null;
        public List<ChartDataPoint> DataPoints = null;

        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public ChartData setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public ChartData setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public UnitGroupWithUnits getUnitGroupWithUnits() { return UnitGroupWithUnits; }
        public ChartData setUnitGroupWithUnits(UnitGroupWithUnits value) { this.UnitGroupWithUnits = value; return this; }
        public UnitGroupWithUnits getDepthUnitGroupWithUnits() { return DepthUnitGroupWithUnits; }
        public ChartData setDepthUnitGroupWithUnits(UnitGroupWithUnits value) { this.DepthUnitGroupWithUnits = value; return this; }
        public List<ChartDataPoint> getDataPoints() { return DataPoints; }
        public ChartData setDataPoints(List<ChartDataPoint> value) { this.DataPoints = value; return this; }
    }

    public static class ChartDataPoint
    {
        public Double Value = null;
        public String ObservationId = null;
        public OffsetDateTime ObservedTime = null;
        public String NumericResultUnitCustomId = null;
        public Double MdlValue = null;
        public String MdlValueUnitCustomId = null;
        public Double DepthValue = null;
        public String DepthUnitCustomId = null;
        public ResultDetectionCondition ResultDetectionCondition = null;

        public Double getValue() { return Value; }
        public ChartDataPoint setValue(Double value) { this.Value = value; return this; }
        public String getObservationId() { return ObservationId; }
        public ChartDataPoint setObservationId(String value) { this.ObservationId = value; return this; }
        public OffsetDateTime getObservedTime() { return ObservedTime; }
        public ChartDataPoint setObservedTime(OffsetDateTime value) { this.ObservedTime = value; return this; }
        public String getNumericResultUnitCustomId() { return NumericResultUnitCustomId; }
        public ChartDataPoint setNumericResultUnitCustomId(String value) { this.NumericResultUnitCustomId = value; return this; }
        public Double getMdlValue() { return MdlValue; }
        public ChartDataPoint setMdlValue(Double value) { this.MdlValue = value; return this; }
        public String getMdlValueUnitCustomId() { return MdlValueUnitCustomId; }
        public ChartDataPoint setMdlValueUnitCustomId(String value) { this.MdlValueUnitCustomId = value; return this; }
        public Double getDepthValue() { return DepthValue; }
        public ChartDataPoint setDepthValue(Double value) { this.DepthValue = value; return this; }
        public String getDepthUnitCustomId() { return DepthUnitCustomId; }
        public ChartDataPoint setDepthUnitCustomId(String value) { this.DepthUnitCustomId = value; return this; }
        public ResultDetectionCondition getResultDetectionCondition() { return ResultDetectionCondition; }
        public ChartDataPoint setResultDetectionCondition(ResultDetectionCondition value) { this.ResultDetectionCondition = value; return this; }
    }

    public static class CollectionMethod
    {
        public String Id = null;
        public String CustomId = null;
        public String IdentifierOrganization = null;
        public String Name = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public CollectionMethod setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public CollectionMethod setCustomId(String value) { this.CustomId = value; return this; }
        public String getIdentifierOrganization() { return IdentifierOrganization; }
        public CollectionMethod setIdentifierOrganization(String value) { this.IdentifierOrganization = value; return this; }
        public String getName() { return Name; }
        public CollectionMethod setName(String value) { this.Name = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public CollectionMethod setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class Device
    {
        public String CustomId = null;
        public String Type = null;
        public String Name = null;
        public String Description = null;

        public String getCustomId() { return CustomId; }
        public Device setCustomId(String value) { this.CustomId = value; return this; }
        public String getType() { return Type; }
        public Device setType(String value) { this.Type = value; return this; }
        public String getName() { return Name; }
        public Device setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public Device setDescription(String value) { this.Description = value; return this; }
    }



    public static class DomainObjectAttachment
    {
        public String Id = null;
        public Attachment Attachment = null;

        public String getId() { return Id; }
        public DomainObjectAttachment setId(String value) { this.Id = value; return this; }
        public Attachment getAttachment() { return Attachment; }
        public DomainObjectAttachment setAttachment(Attachment value) { this.Attachment = value; return this; }
    }

    public static class ErrorInfo
    {
        public String Message = null;
        public String LocalizationKey = null;
        public List<String> LocalizationParameters = null;
        public String RequestId = null;

        public String getMessage() { return Message; }
        public ErrorInfo setMessage(String value) { this.Message = value; return this; }
        public String getLocalizationKey() { return LocalizationKey; }
        public ErrorInfo setLocalizationKey(String value) { this.LocalizationKey = value; return this; }
        public List<String> getLocalizationParameters() { return LocalizationParameters; }
        public ErrorInfo setLocalizationParameters(List<String> value) { this.LocalizationParameters = value; return this; }
        public String getRequestId() { return RequestId; }
        public ErrorInfo setRequestId(String value) { this.RequestId = value; return this; }
    }

    public static class ExtendedAttribute
    {
        public String Id = null;
        public String AttributeId = null;
        public String Text = null;
        public Double Number = null;
        public ExtendedAttributeListItem DropDownListItem = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ExtendedAttribute setId(String value) { this.Id = value; return this; }
        public String getAttributeId() { return AttributeId; }
        public ExtendedAttribute setAttributeId(String value) { this.AttributeId = value; return this; }
        public String getText() { return Text; }
        public ExtendedAttribute setText(String value) { this.Text = value; return this; }
        public Double getNumber() { return Number; }
        public ExtendedAttribute setNumber(Double value) { this.Number = value; return this; }
        public ExtendedAttributeListItem getDropDownListItem() { return DropDownListItem; }
        public ExtendedAttribute setDropDownListItem(ExtendedAttributeListItem value) { this.DropDownListItem = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ExtendedAttribute setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ExtendedAttributeDefinition
    {
        public String Id = null;
        public String CustomId = null;
        public String Description = null;
        public DataType DataType = null;
        public AppliesToType AppliesToType = null;
        public String DefaultValue = null;
        public List<ExtendedAttributeListItem> DropDownListItems = null;
        public Boolean Mandatory = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ExtendedAttributeDefinition setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ExtendedAttributeDefinition setCustomId(String value) { this.CustomId = value; return this; }
        public String getDescription() { return Description; }
        public ExtendedAttributeDefinition setDescription(String value) { this.Description = value; return this; }
        public DataType getDataType() { return DataType; }
        public ExtendedAttributeDefinition setDataType(DataType value) { this.DataType = value; return this; }
        public AppliesToType getAppliesToType() { return AppliesToType; }
        public ExtendedAttributeDefinition setAppliesToType(AppliesToType value) { this.AppliesToType = value; return this; }
        public String getDefaultValue() { return DefaultValue; }
        public ExtendedAttributeDefinition setDefaultValue(String value) { this.DefaultValue = value; return this; }
        public List<ExtendedAttributeListItem> getDropDownListItems() { return DropDownListItems; }
        public ExtendedAttributeDefinition setDropDownListItems(List<ExtendedAttributeListItem> value) { this.DropDownListItems = value; return this; }
        public Boolean getMandatory() { return Mandatory; }
        public ExtendedAttributeDefinition setMandatory(Boolean value) { this.Mandatory = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ExtendedAttributeDefinition setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ExtendedAttributeListItem
    {
        public String Id = null;
        public String CustomId = null;

        public String getId() { return Id; }
        public ExtendedAttributeListItem setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ExtendedAttributeListItem setCustomId(String value) { this.CustomId = value; return this; }
    }

    public static class FieldSheetImportSummary
    {
        public ImportSummaryObservation FieldResultSummary = null;
        public ImportSummarySpecimen SpecimenSummary = null;

        public ImportSummaryObservation getFieldResultSummary() { return FieldResultSummary; }
        public FieldSheetImportSummary setFieldResultSummary(ImportSummaryObservation value) { this.FieldResultSummary = value; return this; }
        public ImportSummarySpecimen getSpecimenSummary() { return SpecimenSummary; }
        public FieldSheetImportSummary setSpecimenSummary(ImportSummarySpecimen value) { this.SpecimenSummary = value; return this; }
    }

    public static class FieldTrip
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<FieldVisit> FieldVisits = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public FieldTrip setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public FieldTrip setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public FieldTrip setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public FieldTrip setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public FieldTrip setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public FieldTrip setNotes(String value) { this.Notes = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public FieldTrip setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<FieldVisit> getFieldVisits() { return FieldVisits; }
        public FieldTrip setFieldVisits(List<FieldVisit> value) { this.FieldVisits = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public FieldTrip setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class FieldTripBasic
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public List<DomainObjectAttachment> Attachments = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public FieldTripBasic setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public FieldTripBasic setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public FieldTripBasic setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public FieldTripBasic setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public FieldTripBasic setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public FieldTripBasic setNotes(String value) { this.Notes = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public FieldTripBasic setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public FieldTripBasic setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class FieldTripSimple
    {
        public String Id = null;
        public String CustomId = null;

        public String getId() { return Id; }
        public FieldTripSimple setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public FieldTripSimple setCustomId(String value) { this.CustomId = value; return this; }
    }

    public static class FieldVisit
    {
        public String Id = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public FieldTripSimple FieldTrip = null;
        public ProjectSimple Project = null;
        public PlanningStatusType PlanningStatus = null;
        public SamplingLocation SamplingLocation = null;
        public List<PlannedFieldResult> PlannedFieldResults = null;
        public List<PlannedActivity> PlannedActivities = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public Schedule Schedule = null;
        public SamplingPlan SamplingPlan = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public FieldVisit setId(String value) { this.Id = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public FieldVisit setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public FieldVisit setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public FieldVisit setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public FieldVisit setNotes(String value) { this.Notes = value; return this; }
        public FieldTripSimple getFieldTrip() { return FieldTrip; }
        public FieldVisit setFieldTrip(FieldTripSimple value) { this.FieldTrip = value; return this; }
        public ProjectSimple getProject() { return Project; }
        public FieldVisit setProject(ProjectSimple value) { this.Project = value; return this; }
        public PlanningStatusType getPlanningStatus() { return PlanningStatus; }
        public FieldVisit setPlanningStatus(PlanningStatusType value) { this.PlanningStatus = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public FieldVisit setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public List<PlannedFieldResult> getPlannedFieldResults() { return PlannedFieldResults; }
        public FieldVisit setPlannedFieldResults(List<PlannedFieldResult> value) { this.PlannedFieldResults = value; return this; }
        public List<PlannedActivity> getPlannedActivities() { return PlannedActivities; }
        public FieldVisit setPlannedActivities(List<PlannedActivity> value) { this.PlannedActivities = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public FieldVisit setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public FieldVisit setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public Schedule getSchedule() { return Schedule; }
        public FieldVisit setSchedule(Schedule value) { this.Schedule = value; return this; }
        public SamplingPlan getSamplingPlan() { return SamplingPlan; }
        public FieldVisit setSamplingPlan(SamplingPlan value) { this.SamplingPlan = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public FieldVisit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class FieldVisitSimple
    {
        public String Id = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public String Participants = null;
        public String Notes = null;
        public FieldTripSimple FieldTrip = null;
        public ProjectSimple Project = null;
        public PlanningStatusType PlanningStatus = null;
        public SamplingLocationSimple SamplingLocation = null;

        public String getId() { return Id; }
        public FieldVisitSimple setId(String value) { this.Id = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public FieldVisitSimple setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public FieldVisitSimple setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public String getParticipants() { return Participants; }
        public FieldVisitSimple setParticipants(String value) { this.Participants = value; return this; }
        public String getNotes() { return Notes; }
        public FieldVisitSimple setNotes(String value) { this.Notes = value; return this; }
        public FieldTripSimple getFieldTrip() { return FieldTrip; }
        public FieldVisitSimple setFieldTrip(FieldTripSimple value) { this.FieldTrip = value; return this; }
        public ProjectSimple getProject() { return Project; }
        public FieldVisitSimple setProject(ProjectSimple value) { this.Project = value; return this; }
        public PlanningStatusType getPlanningStatus() { return PlanningStatus; }
        public FieldVisitSimple setPlanningStatus(PlanningStatusType value) { this.PlanningStatus = value; return this; }
        public SamplingLocationSimple getSamplingLocation() { return SamplingLocation; }
        public FieldVisitSimple setSamplingLocation(SamplingLocationSimple value) { this.SamplingLocation = value; return this; }
    }

    public static class FieldVisitStatistics
    {
        public Integer RoutineSampleCount = null;
        public Integer QcSampleCount = null;
        public Integer VerticalProfileCount = null;
        public Integer FieldResultCount = null;
        public Integer FieldSurveyCount = null;

        public Integer getRoutineSampleCount() { return RoutineSampleCount; }
        public FieldVisitStatistics setRoutineSampleCount(Integer value) { this.RoutineSampleCount = value; return this; }
        public Integer getQcSampleCount() { return QcSampleCount; }
        public FieldVisitStatistics setQcSampleCount(Integer value) { this.QcSampleCount = value; return this; }
        public Integer getVerticalProfileCount() { return VerticalProfileCount; }
        public FieldVisitStatistics setVerticalProfileCount(Integer value) { this.VerticalProfileCount = value; return this; }
        public Integer getFieldResultCount() { return FieldResultCount; }
        public FieldVisitStatistics setFieldResultCount(Integer value) { this.FieldResultCount = value; return this; }
        public Integer getFieldSurveyCount() { return FieldSurveyCount; }
        public FieldVisitStatistics setFieldSurveyCount(Integer value) { this.FieldSurveyCount = value; return this; }
    }

    public static class FieldVisitSummaryRepresentation
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;

        public String getId() { return Id; }
        public FieldVisitSummaryRepresentation setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public FieldVisitSummaryRepresentation setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public FieldVisitSummaryRepresentation setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
    }

    public static class Filter
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public List<ObservedProperty> ObservedProperties = null;
        public List<SamplingLocation> SamplingLocations = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Filter setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Filter setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public Filter setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public Filter setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public List<ObservedProperty> getObservedProperties() { return ObservedProperties; }
        public Filter setObservedProperties(List<ObservedProperty> value) { this.ObservedProperties = value; return this; }
        public List<SamplingLocation> getSamplingLocations() { return SamplingLocations; }
        public Filter setSamplingLocations(List<SamplingLocation> value) { this.SamplingLocations = value; return this; }
        public String getDescription() { return Description; }
        public Filter setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Filter setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class FixedValueCategoricalResult
    {
    }

    public static class ImportChangeItem
    {
        public String PropertyName = null;
        public Object Left = null;
        public Object Right = null;

        public String getPropertyName() { return PropertyName; }
        public ImportChangeItem setPropertyName(String value) { this.PropertyName = value; return this; }
        public Object getLeft() { return Left; }
        public ImportChangeItem setLeft(Object value) { this.Left = value; return this; }
        public Object getRight() { return Right; }
        public ImportChangeItem setRight(Object value) { this.Right = value; return this; }
    }

    public static class ImportError
    {
        public String ErrorCode = null;
        public String ErrorMessage = null;
        public String ErrorFieldValue = null;

        public String getErrorCode() { return ErrorCode; }
        public ImportError setErrorCode(String value) { this.ErrorCode = value; return this; }
        public String getErrorMessage() { return ErrorMessage; }
        public ImportError setErrorMessage(String value) { this.ErrorMessage = value; return this; }
        public String getErrorFieldValue() { return ErrorFieldValue; }
        public ImportError setErrorFieldValue(String value) { this.ErrorFieldValue = value; return this; }
    }

    public static class ImportHistoryEvent
    {
        public String Id = null;
        public ImportType ImportType = null;
        public OffsetDateTime ImportTime = null;
        public String FileName = null;
        public String TimeZoneOffset = null;
        public UserProfile ImportedBy = null;
        public List<String> DomainObjectIds = null;

        public String getId() { return Id; }
        public ImportHistoryEvent setId(String value) { this.Id = value; return this; }
        public ImportType getImportType() { return ImportType; }
        public ImportHistoryEvent setImportType(ImportType value) { this.ImportType = value; return this; }
        public OffsetDateTime getImportTime() { return ImportTime; }
        public ImportHistoryEvent setImportTime(OffsetDateTime value) { this.ImportTime = value; return this; }
        public String getFileName() { return FileName; }
        public ImportHistoryEvent setFileName(String value) { this.FileName = value; return this; }
        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public ImportHistoryEvent setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        public UserProfile getImportedBy() { return ImportedBy; }
        public ImportHistoryEvent setImportedBy(UserProfile value) { this.ImportedBy = value; return this; }
        public List<String> getDomainObjectIds() { return DomainObjectIds; }
        public ImportHistoryEvent setDomainObjectIds(List<String> value) { this.DomainObjectIds = value; return this; }
    }

    public static class ImportHistoryEventSimple
    {
        public String Id = null;
        public ImportType ImportType = null;
        public OffsetDateTime ImportTime = null;
        public String FileName = null;
        public String TimeZoneOffset = null;
        public UserProfile ImportedBy = null;

        public String getId() { return Id; }
        public ImportHistoryEventSimple setId(String value) { this.Id = value; return this; }
        public ImportType getImportType() { return ImportType; }
        public ImportHistoryEventSimple setImportType(ImportType value) { this.ImportType = value; return this; }
        public OffsetDateTime getImportTime() { return ImportTime; }
        public ImportHistoryEventSimple setImportTime(OffsetDateTime value) { this.ImportTime = value; return this; }
        public String getFileName() { return FileName; }
        public ImportHistoryEventSimple setFileName(String value) { this.FileName = value; return this; }
        public String getTimeZoneOffset() { return TimeZoneOffset; }
        public ImportHistoryEventSimple setTimeZoneOffset(String value) { this.TimeZoneOffset = value; return this; }
        public UserProfile getImportedBy() { return ImportedBy; }
        public ImportHistoryEventSimple setImportedBy(UserProfile value) { this.ImportedBy = value; return this; }
    }

    public static class ImportItem
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public Object Item = null;
        public Object ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItem setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItem setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItem setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItem setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItem setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public Object getItem() { return Item; }
        public ImportItem setItem(Object value) { this.Item = value; return this; }
        public Object getExistingItem() { return ExistingItem; }
        public ImportItem setExistingItem(Object value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItem setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItem setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportItemAnalysisMethod
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public AnalysisMethod Item = null;
        public AnalysisMethod ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItemAnalysisMethod setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItemAnalysisMethod setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItemAnalysisMethod setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItemAnalysisMethod setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItemAnalysisMethod setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public AnalysisMethod getItem() { return Item; }
        public ImportItemAnalysisMethod setItem(AnalysisMethod value) { this.Item = value; return this; }
        public AnalysisMethod getExistingItem() { return ExistingItem; }
        public ImportItemAnalysisMethod setExistingItem(AnalysisMethod value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItemAnalysisMethod setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItemAnalysisMethod setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportItemObject
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public Object Item = null;
        public Object ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItemObject setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItemObject setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItemObject setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItemObject setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItemObject setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public Object getItem() { return Item; }
        public ImportItemObject setItem(Object value) { this.Item = value; return this; }
        public Object getExistingItem() { return ExistingItem; }
        public ImportItemObject setExistingItem(Object value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItemObject setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItemObject setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportItemObservation
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public Observation Item = null;
        public Observation ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItemObservation setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItemObservation setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItemObservation setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItemObservation setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItemObservation setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public Observation getItem() { return Item; }
        public ImportItemObservation setItem(Observation value) { this.Item = value; return this; }
        public Observation getExistingItem() { return ExistingItem; }
        public ImportItemObservation setExistingItem(Observation value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItemObservation setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItemObservation setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportItemObservedProperty
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public ObservedProperty Item = null;
        public ObservedProperty ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItemObservedProperty setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItemObservedProperty setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItemObservedProperty setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItemObservedProperty setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItemObservedProperty setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public ObservedProperty getItem() { return Item; }
        public ImportItemObservedProperty setItem(ObservedProperty value) { this.Item = value; return this; }
        public ObservedProperty getExistingItem() { return ExistingItem; }
        public ImportItemObservedProperty setExistingItem(ObservedProperty value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItemObservedProperty setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItemObservedProperty setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportItemSamplingLocation
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public SamplingLocation Item = null;
        public SamplingLocation ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItemSamplingLocation setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItemSamplingLocation setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItemSamplingLocation setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItemSamplingLocation setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItemSamplingLocation setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public SamplingLocation getItem() { return Item; }
        public ImportItemSamplingLocation setItem(SamplingLocation value) { this.Item = value; return this; }
        public SamplingLocation getExistingItem() { return ExistingItem; }
        public ImportItemSamplingLocation setExistingItem(SamplingLocation value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItemSamplingLocation setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItemSamplingLocation setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportItemSpecimen
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public Specimen Item = null;
        public Specimen ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItemSpecimen setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItemSpecimen setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItemSpecimen setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItemSpecimen setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItemSpecimen setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public Specimen getItem() { return Item; }
        public ImportItemSpecimen setItem(Specimen value) { this.Item = value; return this; }
        public Specimen getExistingItem() { return ExistingItem; }
        public ImportItemSpecimen setExistingItem(Specimen value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItemSpecimen setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItemSpecimen setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportItemTaxon
    {
        public List<String> Fields = null;
        public Object Errors = null;
        public String RowId = null;
        public String Input = null;
        public ImportItemStatusType Status = null;
        public Taxon Item = null;
        public Taxon ExistingItem = null;
        public List<ImportChangeItem> ItemComparison = null;
        public List<String> WarningMessages = null;

        public List<String> getFields() { return Fields; }
        public ImportItemTaxon setFields(List<String> value) { this.Fields = value; return this; }
        public Object getErrors() { return Errors; }
        public ImportItemTaxon setErrors(Object value) { this.Errors = value; return this; }
        public String getRowId() { return RowId; }
        public ImportItemTaxon setRowId(String value) { this.RowId = value; return this; }
        public String getInput() { return Input; }
        public ImportItemTaxon setInput(String value) { this.Input = value; return this; }
        public ImportItemStatusType getStatus() { return Status; }
        public ImportItemTaxon setStatus(ImportItemStatusType value) { this.Status = value; return this; }
        public Taxon getItem() { return Item; }
        public ImportItemTaxon setItem(Taxon value) { this.Item = value; return this; }
        public Taxon getExistingItem() { return ExistingItem; }
        public ImportItemTaxon setExistingItem(Taxon value) { this.ExistingItem = value; return this; }
        public List<ImportChangeItem> getItemComparison() { return ItemComparison; }
        public ImportItemTaxon setItemComparison(List<ImportChangeItem> value) { this.ItemComparison = value; return this; }
        public List<String> getWarningMessages() { return WarningMessages; }
        public ImportItemTaxon setWarningMessages(List<String> value) { this.WarningMessages = value; return this; }
    }

    public static class ImportProcessorTransactionStatusResponse
    {
        public String Id = null;
        public ImportProcessorTransactionStatusType ImportProcessorTransactionStatus = null;

        public String getId() { return Id; }
        public ImportProcessorTransactionStatusResponse setId(String value) { this.Id = value; return this; }
        public ImportProcessorTransactionStatusType getImportProcessorTransactionStatus() { return ImportProcessorTransactionStatus; }
        public ImportProcessorTransactionStatusResponse setImportProcessorTransactionStatus(ImportProcessorTransactionStatusType value) { this.ImportProcessorTransactionStatus = value; return this; }
    }

    public static class ImportSummary
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemObject> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemObject> NonErrorImportItems = null;
        public List<ImportItemObject> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public ImportSummary setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public ImportSummary setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public ImportSummary setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public ImportSummary setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public ImportSummary setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public ImportSummary setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public ImportSummary setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemObject> getImportItems() { return ImportItems; }
        public ImportSummary setImportItems(List<ImportItemObject> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public ImportSummary setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public ImportSummary setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemObject> getNonErrorImportItems() { return NonErrorImportItems; }
        public ImportSummary setNonErrorImportItems(List<ImportItemObject> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemObject> getErrorImportItems() { return ErrorImportItems; }
        public ImportSummary setErrorImportItems(List<ImportItemObject> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public ImportSummary setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class ImportSummaryObservation
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemObservation> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemObservation> NonErrorImportItems = null;
        public List<ImportItemObservation> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public ImportSummaryObservation setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public ImportSummaryObservation setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public ImportSummaryObservation setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public ImportSummaryObservation setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public ImportSummaryObservation setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public ImportSummaryObservation setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public ImportSummaryObservation setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemObservation> getImportItems() { return ImportItems; }
        public ImportSummaryObservation setImportItems(List<ImportItemObservation> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public ImportSummaryObservation setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public ImportSummaryObservation setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemObservation> getNonErrorImportItems() { return NonErrorImportItems; }
        public ImportSummaryObservation setNonErrorImportItems(List<ImportItemObservation> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemObservation> getErrorImportItems() { return ErrorImportItems; }
        public ImportSummaryObservation setErrorImportItems(List<ImportItemObservation> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public ImportSummaryObservation setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class ImportSummarySpecimen
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemSpecimen> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemSpecimen> NonErrorImportItems = null;
        public List<ImportItemSpecimen> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public ImportSummarySpecimen setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public ImportSummarySpecimen setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public ImportSummarySpecimen setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public ImportSummarySpecimen setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public ImportSummarySpecimen setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public ImportSummarySpecimen setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public ImportSummarySpecimen setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemSpecimen> getImportItems() { return ImportItems; }
        public ImportSummarySpecimen setImportItems(List<ImportItemSpecimen> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public ImportSummarySpecimen setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public ImportSummarySpecimen setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemSpecimen> getNonErrorImportItems() { return NonErrorImportItems; }
        public ImportSummarySpecimen setNonErrorImportItems(List<ImportItemSpecimen> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemSpecimen> getErrorImportItems() { return ErrorImportItems; }
        public ImportSummarySpecimen setErrorImportItems(List<ImportItemSpecimen> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public ImportSummarySpecimen setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class IndexConfiguration
    {
        public String Id = null;
        public String CustomId = null;
        public String IssuingOrganization = null;
        public String Description = null;
        public Boolean UseScoreRanges = null;
        public ObservedProperty ObservedProperty = null;
        public Unit Unit = null;
        public List<IndexRange> IndexRanges = null;
        public List<MetricConfiguration> MetricConfigurations = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public IndexConfiguration setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public IndexConfiguration setCustomId(String value) { this.CustomId = value; return this; }
        public String getIssuingOrganization() { return IssuingOrganization; }
        public IndexConfiguration setIssuingOrganization(String value) { this.IssuingOrganization = value; return this; }
        public String getDescription() { return Description; }
        public IndexConfiguration setDescription(String value) { this.Description = value; return this; }
        public Boolean getUseScoreRanges() { return UseScoreRanges; }
        public IndexConfiguration setUseScoreRanges(Boolean value) { this.UseScoreRanges = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public IndexConfiguration setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public Unit getUnit() { return Unit; }
        public IndexConfiguration setUnit(Unit value) { this.Unit = value; return this; }
        public List<IndexRange> getIndexRanges() { return IndexRanges; }
        public IndexConfiguration setIndexRanges(List<IndexRange> value) { this.IndexRanges = value; return this; }
        public List<MetricConfiguration> getMetricConfigurations() { return MetricConfigurations; }
        public IndexConfiguration setMetricConfigurations(List<MetricConfiguration> value) { this.MetricConfigurations = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public IndexConfiguration setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class IndexRange
    {
        public String Id = null;
        public String Description = null;
        public String Comment = null;
        public Integer ResultingScore = null;
        public Integer LowerLimitValue = null;
        public Integer UpperLimitValue = null;

        public String getId() { return Id; }
        public IndexRange setId(String value) { this.Id = value; return this; }
        public String getDescription() { return Description; }
        public IndexRange setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public IndexRange setComment(String value) { this.Comment = value; return this; }
        public Integer getResultingScore() { return ResultingScore; }
        public IndexRange setResultingScore(Integer value) { this.ResultingScore = value; return this; }
        public Integer getLowerLimitValue() { return LowerLimitValue; }
        public IndexRange setLowerLimitValue(Integer value) { this.LowerLimitValue = value; return this; }
        public Integer getUpperLimitValue() { return UpperLimitValue; }
        public IndexRange setUpperLimitValue(Integer value) { this.UpperLimitValue = value; return this; }
    }

    public static class IndexRequestDto
    {
        public String IndexConfigId = null;

        public String getIndexConfigId() { return IndexConfigId; }
        public IndexRequestDto setIndexConfigId(String value) { this.IndexConfigId = value; return this; }
    }

    public static class InputPart
    {
        public Object Headers = null;
        public MediaType MediaType = null;
        public String BodyAsString = null;
        public Boolean ContentTypeFromMessage = null;

        public Object getHeaders() { return Headers; }
        public InputPart setHeaders(Object value) { this.Headers = value; return this; }
        public MediaType getMediaType() { return MediaType; }
        public InputPart setMediaType(MediaType value) { this.MediaType = value; return this; }
        public String getBodyAsString() { return BodyAsString; }
        public InputPart setBodyAsString(String value) { this.BodyAsString = value; return this; }
        public Boolean getContentTypeFromMessage() { return ContentTypeFromMessage; }
        public InputPart setContentTypeFromMessage(Boolean value) { this.ContentTypeFromMessage = value; return this; }
    }

    public static class LabInstruction
    {
        public AnalysisMethod AnalysisMethod = null;
        public String PreparationMethod = null;
        public String AnalysisComment = null;
        public String HoldingTime = null;
        public AuditAttributes AuditAttributes = null;

        public AnalysisMethod getAnalysisMethod() { return AnalysisMethod; }
        public LabInstruction setAnalysisMethod(AnalysisMethod value) { this.AnalysisMethod = value; return this; }
        public String getPreparationMethod() { return PreparationMethod; }
        public LabInstruction setPreparationMethod(String value) { this.PreparationMethod = value; return this; }
        public String getAnalysisComment() { return AnalysisComment; }
        public LabInstruction setAnalysisComment(String value) { this.AnalysisComment = value; return this; }
        public String getHoldingTime() { return HoldingTime; }
        public LabInstruction setHoldingTime(String value) { this.HoldingTime = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public LabInstruction setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class LabInstructionMinimal
    {
        public AnalysisMethodMinimal AnalysisMethod = null;
        public String PreparationMethod = null;
        public String AnalysisComment = null;
        public String HoldingTime = null;

        public AnalysisMethodMinimal getAnalysisMethod() { return AnalysisMethod; }
        public LabInstructionMinimal setAnalysisMethod(AnalysisMethodMinimal value) { this.AnalysisMethod = value; return this; }
        public String getPreparationMethod() { return PreparationMethod; }
        public LabInstructionMinimal setPreparationMethod(String value) { this.PreparationMethod = value; return this; }
        public String getAnalysisComment() { return AnalysisComment; }
        public LabInstructionMinimal setAnalysisComment(String value) { this.AnalysisComment = value; return this; }
        public String getHoldingTime() { return HoldingTime; }
        public LabInstructionMinimal setHoldingTime(String value) { this.HoldingTime = value; return this; }
    }

    public static class LabInstructionTemplate
    {
        public String Id = null;
        public AnalysisMethod AnalysisMethod = null;
        public ObservedProperty ObservedProperty = null;
        public String PreparationMethod = null;
        public String AnalysisComment = null;
        public String HoldingTime = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public LabInstructionTemplate setId(String value) { this.Id = value; return this; }
        public AnalysisMethod getAnalysisMethod() { return AnalysisMethod; }
        public LabInstructionTemplate setAnalysisMethod(AnalysisMethod value) { this.AnalysisMethod = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public LabInstructionTemplate setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public String getPreparationMethod() { return PreparationMethod; }
        public LabInstructionTemplate setPreparationMethod(String value) { this.PreparationMethod = value; return this; }
        public String getAnalysisComment() { return AnalysisComment; }
        public LabInstructionTemplate setAnalysisComment(String value) { this.AnalysisComment = value; return this; }
        public String getHoldingTime() { return HoldingTime; }
        public LabInstructionTemplate setHoldingTime(String value) { this.HoldingTime = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public LabInstructionTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class Laboratory
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String Address = null;
        public String PointOfContact = null;
        public String EmailAddress = null;
        public String PhoneNumber = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Laboratory setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Laboratory setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public Laboratory setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public Laboratory setDescription(String value) { this.Description = value; return this; }
        public String getAddress() { return Address; }
        public Laboratory setAddress(String value) { this.Address = value; return this; }
        public String getPointOfContact() { return PointOfContact; }
        public Laboratory setPointOfContact(String value) { this.PointOfContact = value; return this; }
        public String getEmailAddress() { return EmailAddress; }
        public Laboratory setEmailAddress(String value) { this.EmailAddress = value; return this; }
        public String getPhoneNumber() { return PhoneNumber; }
        public Laboratory setPhoneNumber(String value) { this.PhoneNumber = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Laboratory setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class LabReport
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime DateReceived = null;
        public String CaseNarrative = null;
        public String QcSummary = null;
        public Laboratory Laboratory = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<DomainObjectAttachment> Attachments = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public LabReport setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public LabReport setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getDateReceived() { return DateReceived; }
        public LabReport setDateReceived(OffsetDateTime value) { this.DateReceived = value; return this; }
        public String getCaseNarrative() { return CaseNarrative; }
        public LabReport setCaseNarrative(String value) { this.CaseNarrative = value; return this; }
        public String getQcSummary() { return QcSummary; }
        public LabReport setQcSummary(String value) { this.QcSummary = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public LabReport setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public LabReport setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public LabReport setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public LabReport setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class LabReportImportHistoryEvent
    {
        public ImportHistoryEvent ImportHistoryEvent = null;
        public LabReport LabReport = null;

        public ImportHistoryEvent getImportHistoryEvent() { return ImportHistoryEvent; }
        public LabReportImportHistoryEvent setImportHistoryEvent(ImportHistoryEvent value) { this.ImportHistoryEvent = value; return this; }
        public LabReport getLabReport() { return LabReport; }
        public LabReportImportHistoryEvent setLabReport(LabReport value) { this.LabReport = value; return this; }
    }

    public static class LabResultDetails
    {
        public String LabSampleId = null;
        public Laboratory Laboratory = null;
        public String PreparationMethod = null;
        public String DilutionFactor = null;
        public OffsetDateTime DateReceived = null;
        public String AnalysisComment = null;
        public String QualityFlag = null;
        public OffsetDateTime DatePrepared = null;
        public LabReport LabReport = null;
        public AuditAttributes AuditAttributes = null;

        public String getLabSampleId() { return LabSampleId; }
        public LabResultDetails setLabSampleId(String value) { this.LabSampleId = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public LabResultDetails setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public String getPreparationMethod() { return PreparationMethod; }
        public LabResultDetails setPreparationMethod(String value) { this.PreparationMethod = value; return this; }
        public String getDilutionFactor() { return DilutionFactor; }
        public LabResultDetails setDilutionFactor(String value) { this.DilutionFactor = value; return this; }
        public OffsetDateTime getDateReceived() { return DateReceived; }
        public LabResultDetails setDateReceived(OffsetDateTime value) { this.DateReceived = value; return this; }
        public String getAnalysisComment() { return AnalysisComment; }
        public LabResultDetails setAnalysisComment(String value) { this.AnalysisComment = value; return this; }
        public String getQualityFlag() { return QualityFlag; }
        public LabResultDetails setQualityFlag(String value) { this.QualityFlag = value; return this; }
        public OffsetDateTime getDatePrepared() { return DatePrepared; }
        public LabResultDetails setDatePrepared(OffsetDateTime value) { this.DatePrepared = value; return this; }
        public LabReport getLabReport() { return LabReport; }
        public LabResultDetails setLabReport(LabReport value) { this.LabReport = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public LabResultDetails setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class LocationGroupType
    {
        public String Id = null;
        public String CustomId = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public LocationGroupType setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public LocationGroupType setCustomId(String value) { this.CustomId = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public LocationGroupType setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class LocationObservationsGroup
    {
        public List<Observation> Observations = null;
        public SamplingLocation SamplingLocation = null;
        public Integer TotalCount = null;

        public List<Observation> getObservations() { return Observations; }
        public LocationObservationsGroup setObservations(List<Observation> value) { this.Observations = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public LocationObservationsGroup setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public Integer getTotalCount() { return TotalCount; }
        public LocationObservationsGroup setTotalCount(Integer value) { this.TotalCount = value; return this; }
    }

    public static class LocationType
    {
        public String Id = null;
        public String CustomId = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public LocationType setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public LocationType setCustomId(String value) { this.CustomId = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public LocationType setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class MediaType
    {
        public String Type = null;
        public String Subtype = null;
        public Object Parameters = null;
        public Boolean WildcardType = null;
        public Boolean WildcardSubtype = null;

        public String getType() { return Type; }
        public MediaType setType(String value) { this.Type = value; return this; }
        public String getSubtype() { return Subtype; }
        public MediaType setSubtype(String value) { this.Subtype = value; return this; }
        public Object getParameters() { return Parameters; }
        public MediaType setParameters(Object value) { this.Parameters = value; return this; }
        public Boolean getWildcardType() { return WildcardType; }
        public MediaType setWildcardType(Boolean value) { this.WildcardType = value; return this; }
        public Boolean getWildcardSubtype() { return WildcardSubtype; }
        public MediaType setWildcardSubtype(Boolean value) { this.WildcardSubtype = value; return this; }
    }

    public static class Medium
    {
        public String Id = null;
        public String CustomId = null;
        public MediumSystemCodeType SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Medium setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Medium setCustomId(String value) { this.CustomId = value; return this; }
        public MediumSystemCodeType getSystemCode() { return SystemCode; }
        public Medium setSystemCode(MediumSystemCodeType value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Medium setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class MetricConfiguration
    {
        public String Id = null;
        public String CustomId = null;
        public String Description = null;
        public AggregationType AggregationType = null;
        public Boolean IncludeChildren = null;
        public Boolean UseScoreRanges = null;
        public ObservedProperty ObservedProperty = null;
        public Unit Unit = null;
        public List<MetricRange> MetricRanges = null;
        public List<Taxon> Taxons = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public MetricConfiguration setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public MetricConfiguration setCustomId(String value) { this.CustomId = value; return this; }
        public String getDescription() { return Description; }
        public MetricConfiguration setDescription(String value) { this.Description = value; return this; }
        public AggregationType getAggregationType() { return AggregationType; }
        public MetricConfiguration setAggregationType(AggregationType value) { this.AggregationType = value; return this; }
        public Boolean getIncludeChildren() { return IncludeChildren; }
        public MetricConfiguration setIncludeChildren(Boolean value) { this.IncludeChildren = value; return this; }
        public Boolean getUseScoreRanges() { return UseScoreRanges; }
        public MetricConfiguration setUseScoreRanges(Boolean value) { this.UseScoreRanges = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public MetricConfiguration setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public Unit getUnit() { return Unit; }
        public MetricConfiguration setUnit(Unit value) { this.Unit = value; return this; }
        public List<MetricRange> getMetricRanges() { return MetricRanges; }
        public MetricConfiguration setMetricRanges(List<MetricRange> value) { this.MetricRanges = value; return this; }
        public List<Taxon> getTaxons() { return Taxons; }
        public MetricConfiguration setTaxons(List<Taxon> value) { this.Taxons = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public MetricConfiguration setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class MetricRange
    {
        public String Id = null;
        public String Description = null;
        public String Comment = null;
        public Integer ResultingScore = null;
        public Integer LowerLimitValue = null;
        public Integer UpperLimitValue = null;

        public String getId() { return Id; }
        public MetricRange setId(String value) { this.Id = value; return this; }
        public String getDescription() { return Description; }
        public MetricRange setDescription(String value) { this.Description = value; return this; }
        public String getComment() { return Comment; }
        public MetricRange setComment(String value) { this.Comment = value; return this; }
        public Integer getResultingScore() { return ResultingScore; }
        public MetricRange setResultingScore(Integer value) { this.ResultingScore = value; return this; }
        public Integer getLowerLimitValue() { return LowerLimitValue; }
        public MetricRange setLowerLimitValue(Integer value) { this.LowerLimitValue = value; return this; }
        public Integer getUpperLimitValue() { return UpperLimitValue; }
        public MetricRange setUpperLimitValue(Integer value) { this.UpperLimitValue = value; return this; }
    }

    public static class MetricResult
    {
        public String Id = null;
        public MetricConfiguration MetricConfiguration = null;
        public Double AggregationResult = null;
        public Double Score = null;
        public Boolean OverriddenByUser = null;
        public AuditAttributes AuditAttributes = null;
        public List<String> MatchedObservations = null;

        public String getId() { return Id; }
        public MetricResult setId(String value) { this.Id = value; return this; }
        public MetricConfiguration getMetricConfiguration() { return MetricConfiguration; }
        public MetricResult setMetricConfiguration(MetricConfiguration value) { this.MetricConfiguration = value; return this; }
        public Double getAggregationResult() { return AggregationResult; }
        public MetricResult setAggregationResult(Double value) { this.AggregationResult = value; return this; }
        public Double getScore() { return Score; }
        public MetricResult setScore(Double value) { this.Score = value; return this; }
        public Boolean getOverriddenByUser() { return OverriddenByUser; }
        public MetricResult setOverriddenByUser(Boolean value) { this.OverriddenByUser = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public MetricResult setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
        public List<String> getMatchedObservations() { return MatchedObservations; }
        public MetricResult setMatchedObservations(List<String> value) { this.MatchedObservations = value; return this; }
    }

    public static class MultiChartData
    {
        public List<ChartData> Charts = null;

        public List<ChartData> getCharts() { return Charts; }
        public MultiChartData setCharts(List<ChartData> value) { this.Charts = value; return this; }
    }

    public static class MultipartFormDataInput
    {
    }

    public static class NullMeasureQualifier
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public NullMeasureQualifier setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public NullMeasureQualifier setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public NullMeasureQualifier setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public NullMeasureQualifier setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public NullMeasureQualifier setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class NumericResult
    {
        public Quantity Quantity = null;
        public SampleFractionType SampleFraction = null;
        public DeterminationType DeterminationType = null;
        public ResultDetectionCondition DetectionCondition = null;
        public Quantity MethodDetectionLevel = null;
        public Quantity LowerMethodReportingLimit = null;
        public NullMeasureQualifier NullMeasureQualifier = null;
        public String RoundedValue = null;
        public SourceRoundedValueType SourceRoundedValue = null;
        public String RoundingSpecification = null;
        public AuditAttributes AuditAttributes = null;

        public Quantity getQuantity() { return Quantity; }
        public NumericResult setQuantity(Quantity value) { this.Quantity = value; return this; }
        public SampleFractionType getSampleFraction() { return SampleFraction; }
        public NumericResult setSampleFraction(SampleFractionType value) { this.SampleFraction = value; return this; }
        public DeterminationType getDeterminationType() { return DeterminationType; }
        public NumericResult setDeterminationType(DeterminationType value) { this.DeterminationType = value; return this; }
        public ResultDetectionCondition getDetectionCondition() { return DetectionCondition; }
        public NumericResult setDetectionCondition(ResultDetectionCondition value) { this.DetectionCondition = value; return this; }
        public Quantity getMethodDetectionLevel() { return MethodDetectionLevel; }
        public NumericResult setMethodDetectionLevel(Quantity value) { this.MethodDetectionLevel = value; return this; }
        public Quantity getLowerMethodReportingLimit() { return LowerMethodReportingLimit; }
        public NumericResult setLowerMethodReportingLimit(Quantity value) { this.LowerMethodReportingLimit = value; return this; }
        public NullMeasureQualifier getNullMeasureQualifier() { return NullMeasureQualifier; }
        public NumericResult setNullMeasureQualifier(NullMeasureQualifier value) { this.NullMeasureQualifier = value; return this; }
        public String getRoundedValue() { return RoundedValue; }
        public NumericResult setRoundedValue(String value) { this.RoundedValue = value; return this; }
        public SourceRoundedValueType getSourceRoundedValue() { return SourceRoundedValue; }
        public NumericResult setSourceRoundedValue(SourceRoundedValueType value) { this.SourceRoundedValue = value; return this; }
        public String getRoundingSpecification() { return RoundingSpecification; }
        public NumericResult setRoundingSpecification(String value) { this.RoundingSpecification = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public NumericResult setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class Observation
    {
        public String Id = null;
        public String CustomId = null;
        public Activity Activity = null;
        public CollectionMethod CollectionMethod = null;
        public ObservedProperty ObservedProperty = null;
        public Specimen Specimen = null;
        public SamplingLocation SamplingLocation = null;
        public NumericResult NumericResult = null;
        public CategoricalResult CategoricalResult = null;
        public TaxonomicResult TaxonomicResult = null;
        public QualityControlType QualityControlType = null;
        public DataClassificationType DataClassification = null;
        public Medium Medium = null;
        public String MediumSubdivision = null;
        public OffsetDateTime ObservedTime = null;
        public OffsetDateTime ResultTime = null;
        public Quantity Depth = null;
        public LabInstruction LabInstruction = null;
        public LabResultDetails LabResultDetails = null;
        public AnalysisMethodSimple AnalysisMethod = null;
        public String Comment = null;
        public FieldVisit FieldVisit = null;
        public Device Device = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<RuleValidationDetails> ValidationWarnings = null;
        public ResultGrade ResultGrade = null;
        public ResultStatus ResultStatus = null;
        public PlannedFieldResult PlannedFieldResult = null;
        public ObservationStatistics Statistics = null;
        public Taxon RelatedTaxon = null;
        public OffsetDateTime LastReindexTime = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public NullMeasureQualifier NullMeasureQualifier = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Observation setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Observation setCustomId(String value) { this.CustomId = value; return this; }
        public Activity getActivity() { return Activity; }
        public Observation setActivity(Activity value) { this.Activity = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public Observation setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public Observation setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public Specimen getSpecimen() { return Specimen; }
        public Observation setSpecimen(Specimen value) { this.Specimen = value; return this; }
        public SamplingLocation getSamplingLocation() { return SamplingLocation; }
        public Observation setSamplingLocation(SamplingLocation value) { this.SamplingLocation = value; return this; }
        public NumericResult getNumericResult() { return NumericResult; }
        public Observation setNumericResult(NumericResult value) { this.NumericResult = value; return this; }
        public CategoricalResult getCategoricalResult() { return CategoricalResult; }
        public Observation setCategoricalResult(CategoricalResult value) { this.CategoricalResult = value; return this; }
        public TaxonomicResult getTaxonomicResult() { return TaxonomicResult; }
        public Observation setTaxonomicResult(TaxonomicResult value) { this.TaxonomicResult = value; return this; }
        public QualityControlType getQualityControlType() { return QualityControlType; }
        public Observation setQualityControlType(QualityControlType value) { this.QualityControlType = value; return this; }
        public DataClassificationType getDataClassification() { return DataClassification; }
        public Observation setDataClassification(DataClassificationType value) { this.DataClassification = value; return this; }
        public Medium getMedium() { return Medium; }
        public Observation setMedium(Medium value) { this.Medium = value; return this; }
        public String getMediumSubdivision() { return MediumSubdivision; }
        public Observation setMediumSubdivision(String value) { this.MediumSubdivision = value; return this; }
        public OffsetDateTime getObservedTime() { return ObservedTime; }
        public Observation setObservedTime(OffsetDateTime value) { this.ObservedTime = value; return this; }
        public OffsetDateTime getResultTime() { return ResultTime; }
        public Observation setResultTime(OffsetDateTime value) { this.ResultTime = value; return this; }
        public Quantity getDepth() { return Depth; }
        public Observation setDepth(Quantity value) { this.Depth = value; return this; }
        public LabInstruction getLabInstruction() { return LabInstruction; }
        public Observation setLabInstruction(LabInstruction value) { this.LabInstruction = value; return this; }
        public LabResultDetails getLabResultDetails() { return LabResultDetails; }
        public Observation setLabResultDetails(LabResultDetails value) { this.LabResultDetails = value; return this; }
        public AnalysisMethodSimple getAnalysisMethod() { return AnalysisMethod; }
        public Observation setAnalysisMethod(AnalysisMethodSimple value) { this.AnalysisMethod = value; return this; }
        public String getComment() { return Comment; }
        public Observation setComment(String value) { this.Comment = value; return this; }
        public FieldVisit getFieldVisit() { return FieldVisit; }
        public Observation setFieldVisit(FieldVisit value) { this.FieldVisit = value; return this; }
        public Device getDevice() { return Device; }
        public Observation setDevice(Device value) { this.Device = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public Observation setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<RuleValidationDetails> getValidationWarnings() { return ValidationWarnings; }
        public Observation setValidationWarnings(List<RuleValidationDetails> value) { this.ValidationWarnings = value; return this; }
        public ResultGrade getResultGrade() { return ResultGrade; }
        public Observation setResultGrade(ResultGrade value) { this.ResultGrade = value; return this; }
        public ResultStatus getResultStatus() { return ResultStatus; }
        public Observation setResultStatus(ResultStatus value) { this.ResultStatus = value; return this; }
        public PlannedFieldResult getPlannedFieldResult() { return PlannedFieldResult; }
        public Observation setPlannedFieldResult(PlannedFieldResult value) { this.PlannedFieldResult = value; return this; }
        public ObservationStatistics getStatistics() { return Statistics; }
        public Observation setStatistics(ObservationStatistics value) { this.Statistics = value; return this; }
        public Taxon getRelatedTaxon() { return RelatedTaxon; }
        public Observation setRelatedTaxon(Taxon value) { this.RelatedTaxon = value; return this; }
        public OffsetDateTime getLastReindexTime() { return LastReindexTime; }
        public Observation setLastReindexTime(OffsetDateTime value) { this.LastReindexTime = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public Observation setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public NullMeasureQualifier getNullMeasureQualifier() { return NullMeasureQualifier; }
        public Observation setNullMeasureQualifier(NullMeasureQualifier value) { this.NullMeasureQualifier = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Observation setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ObservationImportSummary
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemObservation> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemObservation> NonErrorImportItems = null;
        public List<ImportItemObservation> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public ObservationImportSummary setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public ObservationImportSummary setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public ObservationImportSummary setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public ObservationImportSummary setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public ObservationImportSummary setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public ObservationImportSummary setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public ObservationImportSummary setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemObservation> getImportItems() { return ImportItems; }
        public ObservationImportSummary setImportItems(List<ImportItemObservation> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public ObservationImportSummary setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public ObservationImportSummary setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemObservation> getNonErrorImportItems() { return NonErrorImportItems; }
        public ObservationImportSummary setNonErrorImportItems(List<ImportItemObservation> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemObservation> getErrorImportItems() { return ErrorImportItems; }
        public ObservationImportSummary setErrorImportItems(List<ImportItemObservation> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public ObservationImportSummary setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class ObservationMinimal
    {
        public String Id = null;
        public ObservedProperty ObservedProperty = null;
        public OffsetDateTime ObservedTime = null;
        public OffsetDateTime ResultTime = null;
        public SpecimenNestedInActivity Specimen = null;
        public NumericResult NumericResult = null;
        public CategoricalResult CategoricalResult = null;
        public TaxonomicResult TaxonomicResult = null;
        public ResultStatus ResultStatus = null;
        public LabInstructionMinimal LabInstruction = null;
        public DataClassificationType DataClassification = null;
        public String Comment = null;

        public String getId() { return Id; }
        public ObservationMinimal setId(String value) { this.Id = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public ObservationMinimal setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public OffsetDateTime getObservedTime() { return ObservedTime; }
        public ObservationMinimal setObservedTime(OffsetDateTime value) { this.ObservedTime = value; return this; }
        public OffsetDateTime getResultTime() { return ResultTime; }
        public ObservationMinimal setResultTime(OffsetDateTime value) { this.ResultTime = value; return this; }
        public SpecimenNestedInActivity getSpecimen() { return Specimen; }
        public ObservationMinimal setSpecimen(SpecimenNestedInActivity value) { this.Specimen = value; return this; }
        public NumericResult getNumericResult() { return NumericResult; }
        public ObservationMinimal setNumericResult(NumericResult value) { this.NumericResult = value; return this; }
        public CategoricalResult getCategoricalResult() { return CategoricalResult; }
        public ObservationMinimal setCategoricalResult(CategoricalResult value) { this.CategoricalResult = value; return this; }
        public TaxonomicResult getTaxonomicResult() { return TaxonomicResult; }
        public ObservationMinimal setTaxonomicResult(TaxonomicResult value) { this.TaxonomicResult = value; return this; }
        public ResultStatus getResultStatus() { return ResultStatus; }
        public ObservationMinimal setResultStatus(ResultStatus value) { this.ResultStatus = value; return this; }
        public LabInstructionMinimal getLabInstruction() { return LabInstruction; }
        public ObservationMinimal setLabInstruction(LabInstructionMinimal value) { this.LabInstruction = value; return this; }
        public DataClassificationType getDataClassification() { return DataClassification; }
        public ObservationMinimal setDataClassification(DataClassificationType value) { this.DataClassification = value; return this; }
        public String getComment() { return Comment; }
        public ObservationMinimal setComment(String value) { this.Comment = value; return this; }
    }

    public static class ObservationNestedInSpecimen
    {
        public String Id = null;
        public String CustomId = null;
        public ObservedProperty ObservedProperty = null;
        public LabInstruction LabInstruction = null;
        public NumericResult NumericResult = null;
        public DataClassificationType DataClassification = null;
        public OffsetDateTime ObservedTime = null;
        public ResultStatus ResultStatus = null;
        public CategoricalResult CategoricalResult = null;
        public TaxonomicResult TaxonomicResult = null;

        public String getId() { return Id; }
        public ObservationNestedInSpecimen setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ObservationNestedInSpecimen setCustomId(String value) { this.CustomId = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public ObservationNestedInSpecimen setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public LabInstruction getLabInstruction() { return LabInstruction; }
        public ObservationNestedInSpecimen setLabInstruction(LabInstruction value) { this.LabInstruction = value; return this; }
        public NumericResult getNumericResult() { return NumericResult; }
        public ObservationNestedInSpecimen setNumericResult(NumericResult value) { this.NumericResult = value; return this; }
        public DataClassificationType getDataClassification() { return DataClassification; }
        public ObservationNestedInSpecimen setDataClassification(DataClassificationType value) { this.DataClassification = value; return this; }
        public OffsetDateTime getObservedTime() { return ObservedTime; }
        public ObservationNestedInSpecimen setObservedTime(OffsetDateTime value) { this.ObservedTime = value; return this; }
        public ResultStatus getResultStatus() { return ResultStatus; }
        public ObservationNestedInSpecimen setResultStatus(ResultStatus value) { this.ResultStatus = value; return this; }
        public CategoricalResult getCategoricalResult() { return CategoricalResult; }
        public ObservationNestedInSpecimen setCategoricalResult(CategoricalResult value) { this.CategoricalResult = value; return this; }
        public TaxonomicResult getTaxonomicResult() { return TaxonomicResult; }
        public ObservationNestedInSpecimen setTaxonomicResult(TaxonomicResult value) { this.TaxonomicResult = value; return this; }
    }

    public static class ObservationStandard
    {
        public ObservedProperty ObservedProperty = null;
        public Quantity ResultLowerLimit = null;
        public Quantity ResultUpperLimit = null;
        public String RuleText = null;
        public AuditAttributes AuditAttributes = null;

        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public ObservationStandard setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public Quantity getResultLowerLimit() { return ResultLowerLimit; }
        public ObservationStandard setResultLowerLimit(Quantity value) { this.ResultLowerLimit = value; return this; }
        public Quantity getResultUpperLimit() { return ResultUpperLimit; }
        public ObservationStandard setResultUpperLimit(Quantity value) { this.ResultUpperLimit = value; return this; }
        public String getRuleText() { return RuleText; }
        public ObservationStandard setRuleText(String value) { this.RuleText = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ObservationStandard setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ObservationStatistics
    {
        public String SamplingLocationId = null;
        public String ObservedPropertyId = null;
        public Integer Count = null;
        public Double Min = null;
        public Double P25 = null;
        public Double P5 = null;
        public Double P50 = null;
        public Double P75 = null;
        public Double P95 = null;
        public Double Max = null;

        public String getSamplingLocationId() { return SamplingLocationId; }
        public ObservationStatistics setSamplingLocationId(String value) { this.SamplingLocationId = value; return this; }
        public String getObservedPropertyId() { return ObservedPropertyId; }
        public ObservationStatistics setObservedPropertyId(String value) { this.ObservedPropertyId = value; return this; }
        public Integer getCount() { return Count; }
        public ObservationStatistics setCount(Integer value) { this.Count = value; return this; }
        public Double getMin() { return Min; }
        public ObservationStatistics setMin(Double value) { this.Min = value; return this; }
        public Double getP25() { return P25; }
        public ObservationStatistics setP25(Double value) { this.P25 = value; return this; }
        public Double getP5() { return P5; }
        public ObservationStatistics setP5(Double value) { this.P5 = value; return this; }
        public Double getP50() { return P50; }
        public ObservationStatistics setP50(Double value) { this.P50 = value; return this; }
        public Double getP75() { return P75; }
        public ObservationStatistics setP75(Double value) { this.P75 = value; return this; }
        public Double getP95() { return P95; }
        public ObservationStatistics setP95(Double value) { this.P95 = value; return this; }
        public Double getMax() { return Max; }
        public ObservationStatistics setMax(Double value) { this.Max = value; return this; }
    }

    public static class ObservedProperty
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public ResultType ResultType = null;
        public AnalysisType AnalysisType = null;
        public UnitGroup UnitGroup = null;
        public Unit DefaultUnit = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public String CasNumber = null;
        public Quantity LowerLimit = null;
        public Quantity UpperLimit = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ObservedProperty setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ObservedProperty setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public ObservedProperty setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public ObservedProperty setDescription(String value) { this.Description = value; return this; }
        public ResultType getResultType() { return ResultType; }
        public ObservedProperty setResultType(ResultType value) { this.ResultType = value; return this; }
        public AnalysisType getAnalysisType() { return AnalysisType; }
        public ObservedProperty setAnalysisType(AnalysisType value) { this.AnalysisType = value; return this; }
        public UnitGroup getUnitGroup() { return UnitGroup; }
        public ObservedProperty setUnitGroup(UnitGroup value) { this.UnitGroup = value; return this; }
        public Unit getDefaultUnit() { return DefaultUnit; }
        public ObservedProperty setDefaultUnit(Unit value) { this.DefaultUnit = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public ObservedProperty setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public String getCasNumber() { return CasNumber; }
        public ObservedProperty setCasNumber(String value) { this.CasNumber = value; return this; }
        public Quantity getLowerLimit() { return LowerLimit; }
        public ObservedProperty setLowerLimit(Quantity value) { this.LowerLimit = value; return this; }
        public Quantity getUpperLimit() { return UpperLimit; }
        public ObservedProperty setUpperLimit(Quantity value) { this.UpperLimit = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ObservedProperty setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ObservedPropertyImportSummary
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemObservedProperty> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemObservedProperty> NonErrorImportItems = null;
        public List<ImportItemObservedProperty> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public ObservedPropertyImportSummary setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public ObservedPropertyImportSummary setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public ObservedPropertyImportSummary setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public ObservedPropertyImportSummary setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public ObservedPropertyImportSummary setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public ObservedPropertyImportSummary setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public ObservedPropertyImportSummary setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemObservedProperty> getImportItems() { return ImportItems; }
        public ObservedPropertyImportSummary setImportItems(List<ImportItemObservedProperty> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public ObservedPropertyImportSummary setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public ObservedPropertyImportSummary setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemObservedProperty> getNonErrorImportItems() { return NonErrorImportItems; }
        public ObservedPropertyImportSummary setNonErrorImportItems(List<ImportItemObservedProperty> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemObservedProperty> getErrorImportItems() { return ErrorImportItems; }
        public ObservedPropertyImportSummary setErrorImportItems(List<ImportItemObservedProperty> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public ObservedPropertyImportSummary setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class PlannedActivity
    {
        public String Id = null;
        public ActivityTemplate ActivityTemplate = null;
        public String Instruction = null;
        public PlannedActivityActivityType ActivityType = null;
        public MediumType Medium = null;
        public CollectionMethod CollectionMethod = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PlannedActivity setId(String value) { this.Id = value; return this; }
        public ActivityTemplate getActivityTemplate() { return ActivityTemplate; }
        public PlannedActivity setActivityTemplate(ActivityTemplate value) { this.ActivityTemplate = value; return this; }
        public String getInstruction() { return Instruction; }
        public PlannedActivity setInstruction(String value) { this.Instruction = value; return this; }
        public PlannedActivityActivityType getActivityType() { return ActivityType; }
        public PlannedActivity setActivityType(PlannedActivityActivityType value) { this.ActivityType = value; return this; }
        public MediumType getMedium() { return Medium; }
        public PlannedActivity setMedium(MediumType value) { this.Medium = value; return this; }
        public CollectionMethod getCollectionMethod() { return CollectionMethod; }
        public PlannedActivity setCollectionMethod(CollectionMethod value) { this.CollectionMethod = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PlannedActivity setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class PlannedFieldResult
    {
        public String Id = null;
        public ObservedProperty ObservedProperty = null;
        public MediumType Medium = null;
        public String DeviceType = null;
        public String Comment = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public PlannedFieldResult setId(String value) { this.Id = value; return this; }
        public ObservedProperty getObservedProperty() { return ObservedProperty; }
        public PlannedFieldResult setObservedProperty(ObservedProperty value) { this.ObservedProperty = value; return this; }
        public MediumType getMedium() { return Medium; }
        public PlannedFieldResult setMedium(MediumType value) { this.Medium = value; return this; }
        public String getDeviceType() { return DeviceType; }
        public PlannedFieldResult setDeviceType(String value) { this.DeviceType = value; return this; }
        public String getComment() { return Comment; }
        public PlannedFieldResult setComment(String value) { this.Comment = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public PlannedFieldResult setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class Project
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public ProjectType Type = null;
        public String Description = null;
        public String ScopeStatement = null;
        public Boolean Approved = null;
        public String ApprovalAgency = null;
        public OffsetDateTime StartTime = null;
        public OffsetDateTime EndTime = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Project setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Project setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public Project setName(String value) { this.Name = value; return this; }
        public ProjectType getType() { return Type; }
        public Project setType(ProjectType value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public Project setDescription(String value) { this.Description = value; return this; }
        public String getScopeStatement() { return ScopeStatement; }
        public Project setScopeStatement(String value) { this.ScopeStatement = value; return this; }
        public Boolean getApproved() { return Approved; }
        public Project setApproved(Boolean value) { this.Approved = value; return this; }
        public String getApprovalAgency() { return ApprovalAgency; }
        public Project setApprovalAgency(String value) { this.ApprovalAgency = value; return this; }
        public OffsetDateTime getStartTime() { return StartTime; }
        public Project setStartTime(OffsetDateTime value) { this.StartTime = value; return this; }
        public OffsetDateTime getEndTime() { return EndTime; }
        public Project setEndTime(OffsetDateTime value) { this.EndTime = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Project setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ProjectSimple
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;

        public String getId() { return Id; }
        public ProjectSimple setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ProjectSimple setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public ProjectSimple setName(String value) { this.Name = value; return this; }
    }

    public static class Quantity
    {
        public Double Value = null;
        public Unit Unit = null;

        public Double getValue() { return Value; }
        public Quantity setValue(Double value) { this.Value = value; return this; }
        public Unit getUnit() { return Unit; }
        public Quantity setUnit(Unit value) { this.Unit = value; return this; }
    }

    public static class ResultDetectionCondition
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ResultDetectionCondition setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ResultDetectionCondition setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public ResultDetectionCondition setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public ResultDetectionCondition setDescription(String value) { this.Description = value; return this; }
        public String getSystemCode() { return SystemCode; }
        public ResultDetectionCondition setSystemCode(String value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ResultDetectionCondition setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ResultGrade
    {
        public String Id = null;
        public String CustomId = null;
        public ResultGradeSystemCodeType SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ResultGrade setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ResultGrade setCustomId(String value) { this.CustomId = value; return this; }
        public ResultGradeSystemCodeType getSystemCode() { return SystemCode; }
        public ResultGrade setSystemCode(ResultGradeSystemCodeType value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ResultGrade setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class ResultGradeChange
    {
        public String TargetResultGrade = null;

        public String getTargetResultGrade() { return TargetResultGrade; }
        public ResultGradeChange setTargetResultGrade(String value) { this.TargetResultGrade = value; return this; }
    }

    public static class ResultStatus
    {
        public String Id = null;
        public String CustomId = null;
        public ResultStatusSystemCodeType SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ResultStatus setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ResultStatus setCustomId(String value) { this.CustomId = value; return this; }
        public ResultStatusSystemCodeType getSystemCode() { return SystemCode; }
        public ResultStatus setSystemCode(ResultStatusSystemCodeType value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ResultStatus setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class RuleValidationDetails
    {
        public String Type = null;
        public String Description = null;
        public Object Properties = null;

        public String getType() { return Type; }
        public RuleValidationDetails setType(String value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public RuleValidationDetails setDescription(String value) { this.Description = value; return this; }
        public Object getProperties() { return Properties; }
        public RuleValidationDetails setProperties(Object value) { this.Properties = value; return this; }
    }

    public static class SamplingContextTag
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SamplingContextTag setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public SamplingContextTag setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public SamplingContextTag setDescription(String value) { this.Description = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SamplingContextTag setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SamplingLocation
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public LocationType Type = null;
        public String Latitude = null;
        public String Longitude = null;
        public String HorizontalDatum = null;
        public String VerticalDatum = null;
        public String HorizontalCollectionMethod = null;
        public String VerticalCollectionMethod = null;
        public String Description = null;
        public Address Address = null;
        public Quantity Elevation = null;
        public TimeZone TimeZone = null;
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public List<StandardSimple> Standards = null;
        public List<DomainObjectAttachment> Attachments = null;
        public List<SamplingLocationGroup> SamplingLocationGroups = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SamplingLocation setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public SamplingLocation setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public SamplingLocation setName(String value) { this.Name = value; return this; }
        public LocationType getType() { return Type; }
        public SamplingLocation setType(LocationType value) { this.Type = value; return this; }
        public String getLatitude() { return Latitude; }
        public SamplingLocation setLatitude(String value) { this.Latitude = value; return this; }
        public String getLongitude() { return Longitude; }
        public SamplingLocation setLongitude(String value) { this.Longitude = value; return this; }
        public String getHorizontalDatum() { return HorizontalDatum; }
        public SamplingLocation setHorizontalDatum(String value) { this.HorizontalDatum = value; return this; }
        public String getVerticalDatum() { return VerticalDatum; }
        public SamplingLocation setVerticalDatum(String value) { this.VerticalDatum = value; return this; }
        public String getHorizontalCollectionMethod() { return HorizontalCollectionMethod; }
        public SamplingLocation setHorizontalCollectionMethod(String value) { this.HorizontalCollectionMethod = value; return this; }
        public String getVerticalCollectionMethod() { return VerticalCollectionMethod; }
        public SamplingLocation setVerticalCollectionMethod(String value) { this.VerticalCollectionMethod = value; return this; }
        public String getDescription() { return Description; }
        public SamplingLocation setDescription(String value) { this.Description = value; return this; }
        public Address getAddress() { return Address; }
        public SamplingLocation setAddress(Address value) { this.Address = value; return this; }
        public Quantity getElevation() { return Elevation; }
        public SamplingLocation setElevation(Quantity value) { this.Elevation = value; return this; }
        public TimeZone getTimeZone() { return TimeZone; }
        public SamplingLocation setTimeZone(TimeZone value) { this.TimeZone = value; return this; }
        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public SamplingLocation setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public List<StandardSimple> getStandards() { return Standards; }
        public SamplingLocation setStandards(List<StandardSimple> value) { this.Standards = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public SamplingLocation setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public List<SamplingLocationGroup> getSamplingLocationGroups() { return SamplingLocationGroups; }
        public SamplingLocation setSamplingLocationGroups(List<SamplingLocationGroup> value) { this.SamplingLocationGroups = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public SamplingLocation setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SamplingLocation setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SamplingLocationGroup
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public LocationGroupType LocationGroupType = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SamplingLocationGroup setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public SamplingLocationGroup setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public SamplingLocationGroup setDescription(String value) { this.Description = value; return this; }
        public LocationGroupType getLocationGroupType() { return LocationGroupType; }
        public SamplingLocationGroup setLocationGroupType(LocationGroupType value) { this.LocationGroupType = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SamplingLocationGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SamplingLocationImportSummary
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemSamplingLocation> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemSamplingLocation> NonErrorImportItems = null;
        public List<ImportItemSamplingLocation> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public SamplingLocationImportSummary setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public SamplingLocationImportSummary setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public SamplingLocationImportSummary setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public SamplingLocationImportSummary setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public SamplingLocationImportSummary setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public SamplingLocationImportSummary setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public SamplingLocationImportSummary setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemSamplingLocation> getImportItems() { return ImportItems; }
        public SamplingLocationImportSummary setImportItems(List<ImportItemSamplingLocation> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public SamplingLocationImportSummary setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public SamplingLocationImportSummary setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemSamplingLocation> getNonErrorImportItems() { return NonErrorImportItems; }
        public SamplingLocationImportSummary setNonErrorImportItems(List<ImportItemSamplingLocation> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemSamplingLocation> getErrorImportItems() { return ErrorImportItems; }
        public SamplingLocationImportSummary setErrorImportItems(List<ImportItemSamplingLocation> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public SamplingLocationImportSummary setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class SamplingLocationSimple
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;

        public String getId() { return Id; }
        public SamplingLocationSimple setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public SamplingLocationSimple setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public SamplingLocationSimple setName(String value) { this.Name = value; return this; }
    }

    public static class SamplingLocationSummary
    {
        public Integer ObservationCount = null;
        public Integer FieldVisitCount = null;
        public FieldVisitSummaryRepresentation LatestFieldVisit = null;

        public Integer getObservationCount() { return ObservationCount; }
        public SamplingLocationSummary setObservationCount(Integer value) { this.ObservationCount = value; return this; }
        public Integer getFieldVisitCount() { return FieldVisitCount; }
        public SamplingLocationSummary setFieldVisitCount(Integer value) { this.FieldVisitCount = value; return this; }
        public FieldVisitSummaryRepresentation getLatestFieldVisit() { return LatestFieldVisit; }
        public SamplingLocationSummary setLatestFieldVisit(FieldVisitSummaryRepresentation value) { this.LatestFieldVisit = value; return this; }
    }

    public static class SamplingPlan
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartDate = null;
        public OffsetDateTime EndDate = null;
        public SamplingLocationGroup SamplingLocationGroup = null;
        public SamplingLocationGroupSelectionType SamplingLocationGroupSelectionType = null;
        public Integer SamplingLocationGroupSelectionTypeRandomCount = null;
        public OffsetDateTime LastGenerationDate = null;
        public List<SamplingPlanPlannedActivity> PlannedActivities = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SamplingPlan setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public SamplingPlan setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartDate() { return StartDate; }
        public SamplingPlan setStartDate(OffsetDateTime value) { this.StartDate = value; return this; }
        public OffsetDateTime getEndDate() { return EndDate; }
        public SamplingPlan setEndDate(OffsetDateTime value) { this.EndDate = value; return this; }
        public SamplingLocationGroup getSamplingLocationGroup() { return SamplingLocationGroup; }
        public SamplingPlan setSamplingLocationGroup(SamplingLocationGroup value) { this.SamplingLocationGroup = value; return this; }
        public SamplingLocationGroupSelectionType getSamplingLocationGroupSelectionType() { return SamplingLocationGroupSelectionType; }
        public SamplingPlan setSamplingLocationGroupSelectionType(SamplingLocationGroupSelectionType value) { this.SamplingLocationGroupSelectionType = value; return this; }
        public Integer getSamplingLocationGroupSelectionTypeRandomCount() { return SamplingLocationGroupSelectionTypeRandomCount; }
        public SamplingPlan setSamplingLocationGroupSelectionTypeRandomCount(Integer value) { this.SamplingLocationGroupSelectionTypeRandomCount = value; return this; }
        public OffsetDateTime getLastGenerationDate() { return LastGenerationDate; }
        public SamplingPlan setLastGenerationDate(OffsetDateTime value) { this.LastGenerationDate = value; return this; }
        public List<SamplingPlanPlannedActivity> getPlannedActivities() { return PlannedActivities; }
        public SamplingPlan setPlannedActivities(List<SamplingPlanPlannedActivity> value) { this.PlannedActivities = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SamplingPlan setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SamplingPlanPlannedActivity
    {
        public String Id = null;
        public ActivityTemplate ActivityTemplate = null;
        public String Instruction = null;
        public ActivityType ActivityType = null;
        public SamplingPlanPlannedActivityRecurrence Recurrence = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SamplingPlanPlannedActivity setId(String value) { this.Id = value; return this; }
        public ActivityTemplate getActivityTemplate() { return ActivityTemplate; }
        public SamplingPlanPlannedActivity setActivityTemplate(ActivityTemplate value) { this.ActivityTemplate = value; return this; }
        public String getInstruction() { return Instruction; }
        public SamplingPlanPlannedActivity setInstruction(String value) { this.Instruction = value; return this; }
        public ActivityType getActivityType() { return ActivityType; }
        public SamplingPlanPlannedActivity setActivityType(ActivityType value) { this.ActivityType = value; return this; }
        public SamplingPlanPlannedActivityRecurrence getRecurrence() { return Recurrence; }
        public SamplingPlanPlannedActivity setRecurrence(SamplingPlanPlannedActivityRecurrence value) { this.Recurrence = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SamplingPlanPlannedActivity setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SamplingPlanPlannedActivityRecurrence
    {
        public RecurrenceFrequencyType RecurrenceFrequency = null;
        public DayOfWeekType DayOfWeek = null;
        public List<String> MonthsOfYear = null;
        public TemporalExpressionType TemporalExpression = null;

        public RecurrenceFrequencyType getRecurrenceFrequency() { return RecurrenceFrequency; }
        public SamplingPlanPlannedActivityRecurrence setRecurrenceFrequency(RecurrenceFrequencyType value) { this.RecurrenceFrequency = value; return this; }
        public DayOfWeekType getDayOfWeek() { return DayOfWeek; }
        public SamplingPlanPlannedActivityRecurrence setDayOfWeek(DayOfWeekType value) { this.DayOfWeek = value; return this; }
        public List<String> getMonthsOfYear() { return MonthsOfYear; }
        public SamplingPlanPlannedActivityRecurrence setMonthsOfYear(List<String> value) { this.MonthsOfYear = value; return this; }
        public TemporalExpressionType getTemporalExpression() { return TemporalExpression; }
        public SamplingPlanPlannedActivityRecurrence setTemporalExpression(TemporalExpressionType value) { this.TemporalExpression = value; return this; }
    }

    public static class Schedule
    {
        public String Id = null;
        public String CustomId = null;
        public OffsetDateTime StartDate = null;
        public OffsetDateTime EndDate = null;
        public RecurrenceType RecurrenceType = null;
        public RecurrenceDayWeeklyType RecurrenceDayWeekly = null;
        public RecurrenceDayMonthlyType RecurrenceDayMonthly = null;
        public SamplingLocationGroup SamplingLocationGroup = null;
        public SamplingLocationGroupSelectionType SamplingLocationGroupSelectionType = null;
        public Integer SamplingLocationGroupSelectionTypeRandomCount = null;
        public OffsetDateTime LastGenerationDate = null;
        public List<SchedulePlannedActivity> SchedulePlannedActivities = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Schedule setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Schedule setCustomId(String value) { this.CustomId = value; return this; }
        public OffsetDateTime getStartDate() { return StartDate; }
        public Schedule setStartDate(OffsetDateTime value) { this.StartDate = value; return this; }
        public OffsetDateTime getEndDate() { return EndDate; }
        public Schedule setEndDate(OffsetDateTime value) { this.EndDate = value; return this; }
        public RecurrenceType getRecurrenceType() { return RecurrenceType; }
        public Schedule setRecurrenceType(RecurrenceType value) { this.RecurrenceType = value; return this; }
        public RecurrenceDayWeeklyType getRecurrenceDayWeekly() { return RecurrenceDayWeekly; }
        public Schedule setRecurrenceDayWeekly(RecurrenceDayWeeklyType value) { this.RecurrenceDayWeekly = value; return this; }
        public RecurrenceDayMonthlyType getRecurrenceDayMonthly() { return RecurrenceDayMonthly; }
        public Schedule setRecurrenceDayMonthly(RecurrenceDayMonthlyType value) { this.RecurrenceDayMonthly = value; return this; }
        public SamplingLocationGroup getSamplingLocationGroup() { return SamplingLocationGroup; }
        public Schedule setSamplingLocationGroup(SamplingLocationGroup value) { this.SamplingLocationGroup = value; return this; }
        public SamplingLocationGroupSelectionType getSamplingLocationGroupSelectionType() { return SamplingLocationGroupSelectionType; }
        public Schedule setSamplingLocationGroupSelectionType(SamplingLocationGroupSelectionType value) { this.SamplingLocationGroupSelectionType = value; return this; }
        public Integer getSamplingLocationGroupSelectionTypeRandomCount() { return SamplingLocationGroupSelectionTypeRandomCount; }
        public Schedule setSamplingLocationGroupSelectionTypeRandomCount(Integer value) { this.SamplingLocationGroupSelectionTypeRandomCount = value; return this; }
        public OffsetDateTime getLastGenerationDate() { return LastGenerationDate; }
        public Schedule setLastGenerationDate(OffsetDateTime value) { this.LastGenerationDate = value; return this; }
        public List<SchedulePlannedActivity> getSchedulePlannedActivities() { return SchedulePlannedActivities; }
        public Schedule setSchedulePlannedActivities(List<SchedulePlannedActivity> value) { this.SchedulePlannedActivities = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Schedule setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SchedulePlannedActivity
    {
        public String Id = null;
        public ActivityTemplate ActivityTemplate = null;
        public String Instruction = null;
        public ActivityType ActivityType = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SchedulePlannedActivity setId(String value) { this.Id = value; return this; }
        public ActivityTemplate getActivityTemplate() { return ActivityTemplate; }
        public SchedulePlannedActivity setActivityTemplate(ActivityTemplate value) { this.ActivityTemplate = value; return this; }
        public String getInstruction() { return Instruction; }
        public SchedulePlannedActivity setInstruction(String value) { this.Instruction = value; return this; }
        public ActivityType getActivityType() { return ActivityType; }
        public SchedulePlannedActivity setActivityType(ActivityType value) { this.ActivityType = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SchedulePlannedActivity setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SearchResult implements IPaginatedResponse<Object>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Object> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResult setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResult setCursor(String value) { this.Cursor = value; return this; }
        public List<Object> getDomainObjects() { return DomainObjects; }
        public SearchResult setDomainObjects(List<Object> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultAccessGroup implements IPaginatedResponse<AccessGroup>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<AccessGroup> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultAccessGroup setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultAccessGroup setCursor(String value) { this.Cursor = value; return this; }
        public List<AccessGroup> getDomainObjects() { return DomainObjects; }
        public SearchResultAccessGroup setDomainObjects(List<AccessGroup> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultActivity implements IPaginatedResponse<Activity>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Activity> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultActivity setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultActivity setCursor(String value) { this.Cursor = value; return this; }
        public List<Activity> getDomainObjects() { return DomainObjects; }
        public SearchResultActivity setDomainObjects(List<Activity> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultActivityTemplate implements IPaginatedResponse<ActivityTemplate>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ActivityTemplate> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultActivityTemplate setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultActivityTemplate setCursor(String value) { this.Cursor = value; return this; }
        public List<ActivityTemplate> getDomainObjects() { return DomainObjects; }
        public SearchResultActivityTemplate setDomainObjects(List<ActivityTemplate> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultAnalysisMethod implements IPaginatedResponse<AnalysisMethod>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<AnalysisMethod> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultAnalysisMethod setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultAnalysisMethod setCursor(String value) { this.Cursor = value; return this; }
        public List<AnalysisMethod> getDomainObjects() { return DomainObjects; }
        public SearchResultAnalysisMethod setDomainObjects(List<AnalysisMethod> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultAnalyticalGroup implements IPaginatedResponse<AnalyticalGroup>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<AnalyticalGroup> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultAnalyticalGroup setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultAnalyticalGroup setCursor(String value) { this.Cursor = value; return this; }
        public List<AnalyticalGroup> getDomainObjects() { return DomainObjects; }
        public SearchResultAnalyticalGroup setDomainObjects(List<AnalyticalGroup> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultAttachment implements IPaginatedResponse<Attachment>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Attachment> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultAttachment setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultAttachment setCursor(String value) { this.Cursor = value; return this; }
        public List<Attachment> getDomainObjects() { return DomainObjects; }
        public SearchResultAttachment setDomainObjects(List<Attachment> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultAuditHistory implements IPaginatedResponse<AuditHistory>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<AuditHistory> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultAuditHistory setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultAuditHistory setCursor(String value) { this.Cursor = value; return this; }
        public List<AuditHistory> getDomainObjects() { return DomainObjects; }
        public SearchResultAuditHistory setDomainObjects(List<AuditHistory> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultCategoricalValue implements IPaginatedResponse<CategoricalValue>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<CategoricalValue> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultCategoricalValue setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultCategoricalValue setCursor(String value) { this.Cursor = value; return this; }
        public List<CategoricalValue> getDomainObjects() { return DomainObjects; }
        public SearchResultCategoricalValue setDomainObjects(List<CategoricalValue> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultCollectionMethod implements IPaginatedResponse<CollectionMethod>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<CollectionMethod> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultCollectionMethod setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultCollectionMethod setCursor(String value) { this.Cursor = value; return this; }
        public List<CollectionMethod> getDomainObjects() { return DomainObjects; }
        public SearchResultCollectionMethod setDomainObjects(List<CollectionMethod> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultExtendedAttributeDefinition implements IPaginatedResponse<ExtendedAttributeDefinition>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ExtendedAttributeDefinition> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultExtendedAttributeDefinition setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultExtendedAttributeDefinition setCursor(String value) { this.Cursor = value; return this; }
        public List<ExtendedAttributeDefinition> getDomainObjects() { return DomainObjects; }
        public SearchResultExtendedAttributeDefinition setDomainObjects(List<ExtendedAttributeDefinition> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultExtendedAttributeListItem implements IPaginatedResponse<ExtendedAttributeListItem>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ExtendedAttributeListItem> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultExtendedAttributeListItem setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultExtendedAttributeListItem setCursor(String value) { this.Cursor = value; return this; }
        public List<ExtendedAttributeListItem> getDomainObjects() { return DomainObjects; }
        public SearchResultExtendedAttributeListItem setDomainObjects(List<ExtendedAttributeListItem> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultFieldTripBasic implements IPaginatedResponse<FieldTripBasic>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<FieldTripBasic> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultFieldTripBasic setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultFieldTripBasic setCursor(String value) { this.Cursor = value; return this; }
        public List<FieldTripBasic> getDomainObjects() { return DomainObjects; }
        public SearchResultFieldTripBasic setDomainObjects(List<FieldTripBasic> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultFieldVisitSimple implements IPaginatedResponse<FieldVisitSimple>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<FieldVisitSimple> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultFieldVisitSimple setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultFieldVisitSimple setCursor(String value) { this.Cursor = value; return this; }
        public List<FieldVisitSimple> getDomainObjects() { return DomainObjects; }
        public SearchResultFieldVisitSimple setDomainObjects(List<FieldVisitSimple> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultFilter implements IPaginatedResponse<Filter>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Filter> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultFilter setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultFilter setCursor(String value) { this.Cursor = value; return this; }
        public List<Filter> getDomainObjects() { return DomainObjects; }
        public SearchResultFilter setDomainObjects(List<Filter> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultLaboratory implements IPaginatedResponse<Laboratory>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Laboratory> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultLaboratory setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultLaboratory setCursor(String value) { this.Cursor = value; return this; }
        public List<Laboratory> getDomainObjects() { return DomainObjects; }
        public SearchResultLaboratory setDomainObjects(List<Laboratory> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultLabReport implements IPaginatedResponse<LabReport>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<LabReport> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultLabReport setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultLabReport setCursor(String value) { this.Cursor = value; return this; }
        public List<LabReport> getDomainObjects() { return DomainObjects; }
        public SearchResultLabReport setDomainObjects(List<LabReport> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultLabReportImportHistoryEvent implements IPaginatedResponse<LabReportImportHistoryEvent>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<LabReportImportHistoryEvent> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultLabReportImportHistoryEvent setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultLabReportImportHistoryEvent setCursor(String value) { this.Cursor = value; return this; }
        public List<LabReportImportHistoryEvent> getDomainObjects() { return DomainObjects; }
        public SearchResultLabReportImportHistoryEvent setDomainObjects(List<LabReportImportHistoryEvent> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultLocationGroupType implements IPaginatedResponse<LocationGroupType>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<LocationGroupType> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultLocationGroupType setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultLocationGroupType setCursor(String value) { this.Cursor = value; return this; }
        public List<LocationGroupType> getDomainObjects() { return DomainObjects; }
        public SearchResultLocationGroupType setDomainObjects(List<LocationGroupType> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultLocationObservationsGroup implements IPaginatedResponse<LocationObservationsGroup>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<LocationObservationsGroup> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultLocationObservationsGroup setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultLocationObservationsGroup setCursor(String value) { this.Cursor = value; return this; }
        public List<LocationObservationsGroup> getDomainObjects() { return DomainObjects; }
        public SearchResultLocationObservationsGroup setDomainObjects(List<LocationObservationsGroup> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultLocationType implements IPaginatedResponse<LocationType>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<LocationType> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultLocationType setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultLocationType setCursor(String value) { this.Cursor = value; return this; }
        public List<LocationType> getDomainObjects() { return DomainObjects; }
        public SearchResultLocationType setDomainObjects(List<LocationType> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultMedium implements IPaginatedResponse<Medium>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Medium> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultMedium setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultMedium setCursor(String value) { this.Cursor = value; return this; }
        public List<Medium> getDomainObjects() { return DomainObjects; }
        public SearchResultMedium setDomainObjects(List<Medium> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultNullMeasureQualifier implements IPaginatedResponse<NullMeasureQualifier>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<NullMeasureQualifier> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultNullMeasureQualifier setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultNullMeasureQualifier setCursor(String value) { this.Cursor = value; return this; }
        public List<NullMeasureQualifier> getDomainObjects() { return DomainObjects; }
        public SearchResultNullMeasureQualifier setDomainObjects(List<NullMeasureQualifier> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultObservation implements IPaginatedResponse<Observation>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Observation> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultObservation setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultObservation setCursor(String value) { this.Cursor = value; return this; }
        public List<Observation> getDomainObjects() { return DomainObjects; }
        public SearchResultObservation setDomainObjects(List<Observation> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultObservationNestedInSpecimen implements IPaginatedResponse<ObservationNestedInSpecimen>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ObservationNestedInSpecimen> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultObservationNestedInSpecimen setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultObservationNestedInSpecimen setCursor(String value) { this.Cursor = value; return this; }
        public List<ObservationNestedInSpecimen> getDomainObjects() { return DomainObjects; }
        public SearchResultObservationNestedInSpecimen setDomainObjects(List<ObservationNestedInSpecimen> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultObservedProperty implements IPaginatedResponse<ObservedProperty>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ObservedProperty> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultObservedProperty setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultObservedProperty setCursor(String value) { this.Cursor = value; return this; }
        public List<ObservedProperty> getDomainObjects() { return DomainObjects; }
        public SearchResultObservedProperty setDomainObjects(List<ObservedProperty> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultProject implements IPaginatedResponse<Project>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Project> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultProject setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultProject setCursor(String value) { this.Cursor = value; return this; }
        public List<Project> getDomainObjects() { return DomainObjects; }
        public SearchResultProject setDomainObjects(List<Project> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultResultDetectionCondition implements IPaginatedResponse<ResultDetectionCondition>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ResultDetectionCondition> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultResultDetectionCondition setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultResultDetectionCondition setCursor(String value) { this.Cursor = value; return this; }
        public List<ResultDetectionCondition> getDomainObjects() { return DomainObjects; }
        public SearchResultResultDetectionCondition setDomainObjects(List<ResultDetectionCondition> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultResultGrade implements IPaginatedResponse<ResultGrade>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ResultGrade> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultResultGrade setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultResultGrade setCursor(String value) { this.Cursor = value; return this; }
        public List<ResultGrade> getDomainObjects() { return DomainObjects; }
        public SearchResultResultGrade setDomainObjects(List<ResultGrade> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultResultStatus implements IPaginatedResponse<ResultStatus>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ResultStatus> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultResultStatus setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultResultStatus setCursor(String value) { this.Cursor = value; return this; }
        public List<ResultStatus> getDomainObjects() { return DomainObjects; }
        public SearchResultResultStatus setDomainObjects(List<ResultStatus> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultSamplingContextTag implements IPaginatedResponse<SamplingContextTag>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<SamplingContextTag> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultSamplingContextTag setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultSamplingContextTag setCursor(String value) { this.Cursor = value; return this; }
        public List<SamplingContextTag> getDomainObjects() { return DomainObjects; }
        public SearchResultSamplingContextTag setDomainObjects(List<SamplingContextTag> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultSamplingLocation implements IPaginatedResponse<SamplingLocation>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<SamplingLocation> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultSamplingLocation setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultSamplingLocation setCursor(String value) { this.Cursor = value; return this; }
        public List<SamplingLocation> getDomainObjects() { return DomainObjects; }
        public SearchResultSamplingLocation setDomainObjects(List<SamplingLocation> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultSamplingLocationGroup implements IPaginatedResponse<SamplingLocationGroup>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<SamplingLocationGroup> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultSamplingLocationGroup setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultSamplingLocationGroup setCursor(String value) { this.Cursor = value; return this; }
        public List<SamplingLocationGroup> getDomainObjects() { return DomainObjects; }
        public SearchResultSamplingLocationGroup setDomainObjects(List<SamplingLocationGroup> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultSchedule implements IPaginatedResponse<Schedule>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Schedule> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultSchedule setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultSchedule setCursor(String value) { this.Cursor = value; return this; }
        public List<Schedule> getDomainObjects() { return DomainObjects; }
        public SearchResultSchedule setDomainObjects(List<Schedule> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultShippingContainer implements IPaginatedResponse<ShippingContainer>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<ShippingContainer> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultShippingContainer setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultShippingContainer setCursor(String value) { this.Cursor = value; return this; }
        public List<ShippingContainer> getDomainObjects() { return DomainObjects; }
        public SearchResultShippingContainer setDomainObjects(List<ShippingContainer> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultSpecimen implements IPaginatedResponse<Specimen>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Specimen> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultSpecimen setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultSpecimen setCursor(String value) { this.Cursor = value; return this; }
        public List<Specimen> getDomainObjects() { return DomainObjects; }
        public SearchResultSpecimen setDomainObjects(List<Specimen> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultSpreadsheetTemplate implements IPaginatedResponse<SpreadsheetTemplate>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<SpreadsheetTemplate> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultSpreadsheetTemplate setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultSpreadsheetTemplate setCursor(String value) { this.Cursor = value; return this; }
        public List<SpreadsheetTemplate> getDomainObjects() { return DomainObjects; }
        public SearchResultSpreadsheetTemplate setDomainObjects(List<SpreadsheetTemplate> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultStandardSimple implements IPaginatedResponse<StandardSimple>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<StandardSimple> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultStandardSimple setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultStandardSimple setCursor(String value) { this.Cursor = value; return this; }
        public List<StandardSimple> getDomainObjects() { return DomainObjects; }
        public SearchResultStandardSimple setDomainObjects(List<StandardSimple> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultTaxon implements IPaginatedResponse<Taxon>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Taxon> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultTaxon setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultTaxon setCursor(String value) { this.Cursor = value; return this; }
        public List<Taxon> getDomainObjects() { return DomainObjects; }
        public SearchResultTaxon setDomainObjects(List<Taxon> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultTaxonomyLevel implements IPaginatedResponse<TaxonomyLevel>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<TaxonomyLevel> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultTaxonomyLevel setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultTaxonomyLevel setCursor(String value) { this.Cursor = value; return this; }
        public List<TaxonomyLevel> getDomainObjects() { return DomainObjects; }
        public SearchResultTaxonomyLevel setDomainObjects(List<TaxonomyLevel> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultTimeZone implements IPaginatedResponse<TimeZone>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<TimeZone> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultTimeZone setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultTimeZone setCursor(String value) { this.Cursor = value; return this; }
        public List<TimeZone> getDomainObjects() { return DomainObjects; }
        public SearchResultTimeZone setDomainObjects(List<TimeZone> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultUnit implements IPaginatedResponse<Unit>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<Unit> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultUnit setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultUnit setCursor(String value) { this.Cursor = value; return this; }
        public List<Unit> getDomainObjects() { return DomainObjects; }
        public SearchResultUnit setDomainObjects(List<Unit> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultUnitGroup implements IPaginatedResponse<UnitGroup>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<UnitGroup> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultUnitGroup setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultUnitGroup setCursor(String value) { this.Cursor = value; return this; }
        public List<UnitGroup> getDomainObjects() { return DomainObjects; }
        public SearchResultUnitGroup setDomainObjects(List<UnitGroup> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultUnitGroupWithUnits implements IPaginatedResponse<UnitGroupWithUnits>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<UnitGroupWithUnits> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultUnitGroupWithUnits setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultUnitGroupWithUnits setCursor(String value) { this.Cursor = value; return this; }
        public List<UnitGroupWithUnits> getDomainObjects() { return DomainObjects; }
        public SearchResultUnitGroupWithUnits setDomainObjects(List<UnitGroupWithUnits> value) { this.DomainObjects = value; return this; }
    }

    public static class SearchResultUser implements IPaginatedResponse<User>
    {
        public Integer TotalCount = null;
        public String Cursor = null;
        public List<User> DomainObjects = null;

        public Integer getTotalCount() { return TotalCount; }
        public SearchResultUser setTotalCount(Integer value) { this.TotalCount = value; return this; }
        public String getCursor() { return Cursor; }
        public SearchResultUser setCursor(String value) { this.Cursor = value; return this; }
        public List<User> getDomainObjects() { return DomainObjects; }
        public SearchResultUser setDomainObjects(List<User> value) { this.DomainObjects = value; return this; }
    }

    public static class ShippingContainer
    {
        public String Id = null;
        public String CustomId = null;
        public String TrackingId = null;
        public String Comment = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public ShippingContainer setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public ShippingContainer setCustomId(String value) { this.CustomId = value; return this; }
        public String getTrackingId() { return TrackingId; }
        public ShippingContainer setTrackingId(String value) { this.TrackingId = value; return this; }
        public String getComment() { return Comment; }
        public ShippingContainer setComment(String value) { this.Comment = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public ShippingContainer setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class Specimen
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public PreservativeType Preservative = null;
        public Boolean Filtered = null;
        public String FiltrationComment = null;
        public Laboratory Laboratory = null;
        public ShippingContainer ShippingContainer = null;
        public AnalyticalGroup AnalyticalGroup = null;
        public Activity Activity = null;
        public SpecimenTemplate TemplateCreatedFrom = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public SpecimenViewStatusType Status = null;
        public Integer NumberOfRequestedObservations = null;
        public Integer NumberOfReceivedObservations = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Specimen setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public Specimen setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public Specimen setDescription(String value) { this.Description = value; return this; }
        public PreservativeType getPreservative() { return Preservative; }
        public Specimen setPreservative(PreservativeType value) { this.Preservative = value; return this; }
        public Boolean getFiltered() { return Filtered; }
        public Specimen setFiltered(Boolean value) { this.Filtered = value; return this; }
        public String getFiltrationComment() { return FiltrationComment; }
        public Specimen setFiltrationComment(String value) { this.FiltrationComment = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public Specimen setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public ShippingContainer getShippingContainer() { return ShippingContainer; }
        public Specimen setShippingContainer(ShippingContainer value) { this.ShippingContainer = value; return this; }
        public AnalyticalGroup getAnalyticalGroup() { return AnalyticalGroup; }
        public Specimen setAnalyticalGroup(AnalyticalGroup value) { this.AnalyticalGroup = value; return this; }
        public Activity getActivity() { return Activity; }
        public Specimen setActivity(Activity value) { this.Activity = value; return this; }
        public SpecimenTemplate getTemplateCreatedFrom() { return TemplateCreatedFrom; }
        public Specimen setTemplateCreatedFrom(SpecimenTemplate value) { this.TemplateCreatedFrom = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public Specimen setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public SpecimenViewStatusType getStatus() { return Status; }
        public Specimen setStatus(SpecimenViewStatusType value) { this.Status = value; return this; }
        public Integer getNumberOfRequestedObservations() { return NumberOfRequestedObservations; }
        public Specimen setNumberOfRequestedObservations(Integer value) { this.NumberOfRequestedObservations = value; return this; }
        public Integer getNumberOfReceivedObservations() { return NumberOfReceivedObservations; }
        public Specimen setNumberOfReceivedObservations(Integer value) { this.NumberOfReceivedObservations = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Specimen setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SpecimenNestedInActivity
    {
        public String Id = null;
        public String Name = null;
        public PreservativeType Preservative = null;
        public Boolean Filtered = null;
        public String FiltrationComment = null;
        public AnalyticalGroupSimple AnalyticalGroup = null;

        public String getId() { return Id; }
        public SpecimenNestedInActivity setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public SpecimenNestedInActivity setName(String value) { this.Name = value; return this; }
        public PreservativeType getPreservative() { return Preservative; }
        public SpecimenNestedInActivity setPreservative(PreservativeType value) { this.Preservative = value; return this; }
        public Boolean getFiltered() { return Filtered; }
        public SpecimenNestedInActivity setFiltered(Boolean value) { this.Filtered = value; return this; }
        public String getFiltrationComment() { return FiltrationComment; }
        public SpecimenNestedInActivity setFiltrationComment(String value) { this.FiltrationComment = value; return this; }
        public AnalyticalGroupSimple getAnalyticalGroup() { return AnalyticalGroup; }
        public SpecimenNestedInActivity setAnalyticalGroup(AnalyticalGroupSimple value) { this.AnalyticalGroup = value; return this; }
    }

    public static class SpecimenTemplate
    {
        public List<LabInstructionTemplate> LabInstructionTemplates = null;
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public AnalyticalGroup AnalyticalGroup = null;
        public PreservativeType Preservative = null;
        public Boolean Filtered = null;
        public String FiltrationComment = null;
        public AuditAttributes AuditAttributes = null;

        public List<LabInstructionTemplate> getLabInstructionTemplates() { return LabInstructionTemplates; }
        public SpecimenTemplate setLabInstructionTemplates(List<LabInstructionTemplate> value) { this.LabInstructionTemplates = value; return this; }
        public String getId() { return Id; }
        public SpecimenTemplate setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public SpecimenTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public SpecimenTemplate setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public SpecimenTemplate setDescription(String value) { this.Description = value; return this; }
        public AnalyticalGroup getAnalyticalGroup() { return AnalyticalGroup; }
        public SpecimenTemplate setAnalyticalGroup(AnalyticalGroup value) { this.AnalyticalGroup = value; return this; }
        public PreservativeType getPreservative() { return Preservative; }
        public SpecimenTemplate setPreservative(PreservativeType value) { this.Preservative = value; return this; }
        public Boolean getFiltered() { return Filtered; }
        public SpecimenTemplate setFiltered(Boolean value) { this.Filtered = value; return this; }
        public String getFiltrationComment() { return FiltrationComment; }
        public SpecimenTemplate setFiltrationComment(String value) { this.FiltrationComment = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SpecimenTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SpecimenWithObservations
    {
        public String Id = null;
        public String Name = null;
        public String Description = null;
        public PreservativeType Preservative = null;
        public Boolean Filtered = null;
        public String FiltrationComment = null;
        public Laboratory Laboratory = null;
        public ShippingContainer ShippingContainer = null;
        public AnalyticalGroup AnalyticalGroup = null;
        public Activity Activity = null;
        public SpecimenTemplate TemplateCreatedFrom = null;
        public List<ExtendedAttribute> ExtendedAttributes = null;
        public SpecimenViewStatusType Status = null;
        public Integer NumberOfRequestedObservations = null;
        public Integer NumberOfReceivedObservations = null;
        public List<Observation> Observations = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SpecimenWithObservations setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public SpecimenWithObservations setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public SpecimenWithObservations setDescription(String value) { this.Description = value; return this; }
        public PreservativeType getPreservative() { return Preservative; }
        public SpecimenWithObservations setPreservative(PreservativeType value) { this.Preservative = value; return this; }
        public Boolean getFiltered() { return Filtered; }
        public SpecimenWithObservations setFiltered(Boolean value) { this.Filtered = value; return this; }
        public String getFiltrationComment() { return FiltrationComment; }
        public SpecimenWithObservations setFiltrationComment(String value) { this.FiltrationComment = value; return this; }
        public Laboratory getLaboratory() { return Laboratory; }
        public SpecimenWithObservations setLaboratory(Laboratory value) { this.Laboratory = value; return this; }
        public ShippingContainer getShippingContainer() { return ShippingContainer; }
        public SpecimenWithObservations setShippingContainer(ShippingContainer value) { this.ShippingContainer = value; return this; }
        public AnalyticalGroup getAnalyticalGroup() { return AnalyticalGroup; }
        public SpecimenWithObservations setAnalyticalGroup(AnalyticalGroup value) { this.AnalyticalGroup = value; return this; }
        public Activity getActivity() { return Activity; }
        public SpecimenWithObservations setActivity(Activity value) { this.Activity = value; return this; }
        public SpecimenTemplate getTemplateCreatedFrom() { return TemplateCreatedFrom; }
        public SpecimenWithObservations setTemplateCreatedFrom(SpecimenTemplate value) { this.TemplateCreatedFrom = value; return this; }
        public List<ExtendedAttribute> getExtendedAttributes() { return ExtendedAttributes; }
        public SpecimenWithObservations setExtendedAttributes(List<ExtendedAttribute> value) { this.ExtendedAttributes = value; return this; }
        public SpecimenViewStatusType getStatus() { return Status; }
        public SpecimenWithObservations setStatus(SpecimenViewStatusType value) { this.Status = value; return this; }
        public Integer getNumberOfRequestedObservations() { return NumberOfRequestedObservations; }
        public SpecimenWithObservations setNumberOfRequestedObservations(Integer value) { this.NumberOfRequestedObservations = value; return this; }
        public Integer getNumberOfReceivedObservations() { return NumberOfReceivedObservations; }
        public SpecimenWithObservations setNumberOfReceivedObservations(Integer value) { this.NumberOfReceivedObservations = value; return this; }
        public List<Observation> getObservations() { return Observations; }
        public SpecimenWithObservations setObservations(List<Observation> value) { this.Observations = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SpecimenWithObservations setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class SpreadsheetTemplate
    {
        public String Id = null;
        public String CustomId = null;
        public SpreadsheetTemplateType Type = null;
        public String Description = null;
        public List<DomainObjectAttachment> Attachments = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public SpreadsheetTemplate setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public SpreadsheetTemplate setCustomId(String value) { this.CustomId = value; return this; }
        public SpreadsheetTemplateType getType() { return Type; }
        public SpreadsheetTemplate setType(SpreadsheetTemplateType value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public SpreadsheetTemplate setDescription(String value) { this.Description = value; return this; }
        public List<DomainObjectAttachment> getAttachments() { return Attachments; }
        public SpreadsheetTemplate setAttachments(List<DomainObjectAttachment> value) { this.Attachments = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public SpreadsheetTemplate setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class StandardDefinition
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String IssuingOrganization = null;
        public Interval ApplicabilityRange = null;
        public Boolean Active = null;
        public List<SamplingLocationSimple> SamplingLocations = null;
        public List<ObservationStandard> ObservationStandards = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public StandardDefinition setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public StandardDefinition setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public StandardDefinition setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public StandardDefinition setDescription(String value) { this.Description = value; return this; }
        public String getIssuingOrganization() { return IssuingOrganization; }
        public StandardDefinition setIssuingOrganization(String value) { this.IssuingOrganization = value; return this; }
        public Interval getApplicabilityRange() { return ApplicabilityRange; }
        public StandardDefinition setApplicabilityRange(Interval value) { this.ApplicabilityRange = value; return this; }
        public Boolean getActive() { return Active; }
        public StandardDefinition setActive(Boolean value) { this.Active = value; return this; }
        public List<SamplingLocationSimple> getSamplingLocations() { return SamplingLocations; }
        public StandardDefinition setSamplingLocations(List<SamplingLocationSimple> value) { this.SamplingLocations = value; return this; }
        public List<ObservationStandard> getObservationStandards() { return ObservationStandards; }
        public StandardDefinition setObservationStandards(List<ObservationStandard> value) { this.ObservationStandards = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public StandardDefinition setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class StandardSimple
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public String Description = null;
        public String IssuingOrganization = null;
        public Interval ApplicabilityRange = null;
        public Boolean Active = null;

        public String getId() { return Id; }
        public StandardSimple setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public StandardSimple setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public StandardSimple setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public StandardSimple setDescription(String value) { this.Description = value; return this; }
        public String getIssuingOrganization() { return IssuingOrganization; }
        public StandardSimple setIssuingOrganization(String value) { this.IssuingOrganization = value; return this; }
        public Interval getApplicabilityRange() { return ApplicabilityRange; }
        public StandardSimple setApplicabilityRange(Interval value) { this.ApplicabilityRange = value; return this; }
        public Boolean getActive() { return Active; }
        public StandardSimple setActive(Boolean value) { this.Active = value; return this; }
    }

    public static class Status
    {
        public String ReleaseName = null;

        public String getReleaseName() { return ReleaseName; }
        public Status setReleaseName(String value) { this.ReleaseName = value; return this; }
    }

    public static class StringCategoricalResult
    {
    }

    public static class Taxon
    {
        public List<ImportHistoryEventSimple> ImportHistoryEventSimples = null;
        public String Id = null;
        public String ScientificName = null;
        public String CommonName = null;
        public TaxonomyLevel TaxonomyLevel = null;
        public String Source = null;
        public String Comment = null;
        public String ItisTsn = null;
        public String ItisComment = null;
        public String ItisUrl = null;
        public String ParentId = null;
        public AuditAttributes AuditAttributes = null;

        public List<ImportHistoryEventSimple> getImportHistoryEventSimples() { return ImportHistoryEventSimples; }
        public Taxon setImportHistoryEventSimples(List<ImportHistoryEventSimple> value) { this.ImportHistoryEventSimples = value; return this; }
        public String getId() { return Id; }
        public Taxon setId(String value) { this.Id = value; return this; }
        public String getScientificName() { return ScientificName; }
        public Taxon setScientificName(String value) { this.ScientificName = value; return this; }
        public String getCommonName() { return CommonName; }
        public Taxon setCommonName(String value) { this.CommonName = value; return this; }
        public TaxonomyLevel getTaxonomyLevel() { return TaxonomyLevel; }
        public Taxon setTaxonomyLevel(TaxonomyLevel value) { this.TaxonomyLevel = value; return this; }
        public String getSource() { return Source; }
        public Taxon setSource(String value) { this.Source = value; return this; }
        public String getComment() { return Comment; }
        public Taxon setComment(String value) { this.Comment = value; return this; }
        public String getItisTsn() { return ItisTsn; }
        public Taxon setItisTsn(String value) { this.ItisTsn = value; return this; }
        public String getItisComment() { return ItisComment; }
        public Taxon setItisComment(String value) { this.ItisComment = value; return this; }
        public String getItisUrl() { return ItisUrl; }
        public Taxon setItisUrl(String value) { this.ItisUrl = value; return this; }
        public String getParentId() { return ParentId; }
        public Taxon setParentId(String value) { this.ParentId = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Taxon setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class TaxonImportSummary
    {
        public ImportHistoryEventSimple ImportHistoryEventSimple = null;
        public Integer SuccessCount = null;
        public Integer SkippedCount = null;
        public Integer ErrorCount = null;
        public Integer NewCount = null;
        public Integer UpdateCount = null;
        public Integer ExpectedCount = null;
        public List<ImportItemTaxon> ImportItems = null;
        public List<ImportError> ImportJobErrors = null;
        public String InvalidRowsCsvUrl = null;
        public List<ImportItemTaxon> NonErrorImportItems = null;
        public List<ImportItemTaxon> ErrorImportItems = null;
        public String SummaryReportText = null;

        public ImportHistoryEventSimple getImportHistoryEventSimple() { return ImportHistoryEventSimple; }
        public TaxonImportSummary setImportHistoryEventSimple(ImportHistoryEventSimple value) { this.ImportHistoryEventSimple = value; return this; }
        public Integer getSuccessCount() { return SuccessCount; }
        public TaxonImportSummary setSuccessCount(Integer value) { this.SuccessCount = value; return this; }
        public Integer getSkippedCount() { return SkippedCount; }
        public TaxonImportSummary setSkippedCount(Integer value) { this.SkippedCount = value; return this; }
        public Integer getErrorCount() { return ErrorCount; }
        public TaxonImportSummary setErrorCount(Integer value) { this.ErrorCount = value; return this; }
        public Integer getNewCount() { return NewCount; }
        public TaxonImportSummary setNewCount(Integer value) { this.NewCount = value; return this; }
        public Integer getUpdateCount() { return UpdateCount; }
        public TaxonImportSummary setUpdateCount(Integer value) { this.UpdateCount = value; return this; }
        public Integer getExpectedCount() { return ExpectedCount; }
        public TaxonImportSummary setExpectedCount(Integer value) { this.ExpectedCount = value; return this; }
        public List<ImportItemTaxon> getImportItems() { return ImportItems; }
        public TaxonImportSummary setImportItems(List<ImportItemTaxon> value) { this.ImportItems = value; return this; }
        public List<ImportError> getImportJobErrors() { return ImportJobErrors; }
        public TaxonImportSummary setImportJobErrors(List<ImportError> value) { this.ImportJobErrors = value; return this; }
        public String getInvalidRowsCsvUrl() { return InvalidRowsCsvUrl; }
        public TaxonImportSummary setInvalidRowsCsvUrl(String value) { this.InvalidRowsCsvUrl = value; return this; }
        public List<ImportItemTaxon> getNonErrorImportItems() { return NonErrorImportItems; }
        public TaxonImportSummary setNonErrorImportItems(List<ImportItemTaxon> value) { this.NonErrorImportItems = value; return this; }
        public List<ImportItemTaxon> getErrorImportItems() { return ErrorImportItems; }
        public TaxonImportSummary setErrorImportItems(List<ImportItemTaxon> value) { this.ErrorImportItems = value; return this; }
        public String getSummaryReportText() { return SummaryReportText; }
        public TaxonImportSummary setSummaryReportText(String value) { this.SummaryReportText = value; return this; }
    }

    public static class TaxonomicResult
    {
        public String Id = null;
        public Taxon Taxon = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public TaxonomicResult setId(String value) { this.Id = value; return this; }
        public Taxon getTaxon() { return Taxon; }
        public TaxonomicResult setTaxon(Taxon value) { this.Taxon = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public TaxonomicResult setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class TaxonomyLevel
    {
        public String Id = null;
        public String CustomId = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public TaxonomyLevel setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public TaxonomyLevel setCustomId(String value) { this.CustomId = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public TaxonomyLevel setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class TimeZone
    {
        public String Id = null;
        public String CustomId = null;

        public String getId() { return Id; }
        public TimeZone setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public TimeZone setCustomId(String value) { this.CustomId = value; return this; }
    }

    public static class Unit
    {
        public String Id = null;
        public String CustomId = null;
        public String Name = null;
        public Double BaseMultiplier = null;
        public Double BaseOffset = null;
        public UnitGroup UnitGroup = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public Unit setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public Unit setCustomId(String value) { this.CustomId = value; return this; }
        public String getName() { return Name; }
        public Unit setName(String value) { this.Name = value; return this; }
        public Double getBaseMultiplier() { return BaseMultiplier; }
        public Unit setBaseMultiplier(Double value) { this.BaseMultiplier = value; return this; }
        public Double getBaseOffset() { return BaseOffset; }
        public Unit setBaseOffset(Double value) { this.BaseOffset = value; return this; }
        public UnitGroup getUnitGroup() { return UnitGroup; }
        public Unit setUnitGroup(UnitGroup value) { this.UnitGroup = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public Unit setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class UnitGroup
    {
        public String Id = null;
        public String CustomId = null;
        public Boolean SupportsConversion = null;
        public UnitGroupSystemCodeType SystemCode = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public UnitGroup setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public UnitGroup setCustomId(String value) { this.CustomId = value; return this; }
        public Boolean getSupportsConversion() { return SupportsConversion; }
        public UnitGroup setSupportsConversion(Boolean value) { this.SupportsConversion = value; return this; }
        public UnitGroupSystemCodeType getSystemCode() { return SystemCode; }
        public UnitGroup setSystemCode(UnitGroupSystemCodeType value) { this.SystemCode = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public UnitGroup setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class UnitGroupWithUnits
    {
        public String Id = null;
        public String CustomId = null;
        public Boolean SupportsConversion = null;
        public UnitGroupWithUnitsSystemCodeType SystemCode = null;
        public List<Unit> Units = null;
        public AuditAttributes AuditAttributes = null;

        public String getId() { return Id; }
        public UnitGroupWithUnits setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public UnitGroupWithUnits setCustomId(String value) { this.CustomId = value; return this; }
        public Boolean getSupportsConversion() { return SupportsConversion; }
        public UnitGroupWithUnits setSupportsConversion(Boolean value) { this.SupportsConversion = value; return this; }
        public UnitGroupWithUnitsSystemCodeType getSystemCode() { return SystemCode; }
        public UnitGroupWithUnits setSystemCode(UnitGroupWithUnitsSystemCodeType value) { this.SystemCode = value; return this; }
        public List<Unit> getUnits() { return Units; }
        public UnitGroupWithUnits setUnits(List<Unit> value) { this.Units = value; return this; }
        public AuditAttributes getAuditAttributes() { return AuditAttributes; }
        public UnitGroupWithUnits setAuditAttributes(AuditAttributes value) { this.AuditAttributes = value; return this; }
    }

    public static class User
    {
        public String Id = null;
        public String CustomId = null;
        public UserProfile UserProfile = null;
        public String Email = null;
        public UserType UserType = null;
        public List<String> Roles = null;
        public List<String> AccessGroups = null;

        public String getId() { return Id; }
        public User setId(String value) { this.Id = value; return this; }
        public String getCustomId() { return CustomId; }
        public User setCustomId(String value) { this.CustomId = value; return this; }
        public UserProfile getUserProfile() { return UserProfile; }
        public User setUserProfile(UserProfile value) { this.UserProfile = value; return this; }
        public String getEmail() { return Email; }
        public User setEmail(String value) { this.Email = value; return this; }
        public UserType getUserType() { return UserType; }
        public User setUserType(UserType value) { this.UserType = value; return this; }
        public List<String> getRoles() { return Roles; }
        public User setRoles(List<String> value) { this.Roles = value; return this; }
        public List<String> getAccessGroups() { return AccessGroups; }
        public User setAccessGroups(List<String> value) { this.AccessGroups = value; return this; }
    }

    public static class UserProfile
    {
        public String Id = null;
        public String Email = null;
        public String FirstName = null;
        public String LastName = null;
        public String FullName = null;
        public String DisplayName = null;
        public String ProfileImageUrl = null;

        public String getId() { return Id; }
        public UserProfile setId(String value) { this.Id = value; return this; }
        public String getEmail() { return Email; }
        public UserProfile setEmail(String value) { this.Email = value; return this; }
        public String getFirstName() { return FirstName; }
        public UserProfile setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public UserProfile setLastName(String value) { this.LastName = value; return this; }
        public String getFullName() { return FullName; }
        public UserProfile setFullName(String value) { this.FullName = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public UserProfile setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getProfileImageUrl() { return ProfileImageUrl; }
        public UserProfile setProfileImageUrl(String value) { this.ProfileImageUrl = value; return this; }
    }

    public static enum ActivityTemplateType
    {
        SAMPLE_INTEGRATED_VERTICAL_PROFILE,
        SAMPLE_ROUTINE,
        REPLICATE,
        BLANK,
        SPIKE,
        OTHER_QC,
        FIELD_SURVEY,
        INDEX_CALCULATION,
        NONE
    }

    public static enum ActivityType
    {
        SAMPLE_INTEGRATED_VERTICAL_PROFILE,
        SAMPLE_ROUTINE,
        REPLICATE,
        BLANK,
        SPIKE,
        OTHER_QC,
        FIELD_SURVEY,
        INDEX_CALCULATION,
        NONE
    }

    public static enum ActivityWithDetailsType
    {
        SAMPLE_INTEGRATED_VERTICAL_PROFILE,
        SAMPLE_ROUTINE,
        REPLICATE,
        BLANK,
        SPIKE,
        OTHER_QC,
        FIELD_SURVEY,
        INDEX_CALCULATION,
        NONE
    }

    public static enum AddressType
    {
        LOCATION,
        MAILING,
        SHIPPING
    }

    public static enum AggregationType
    {
        SUM
    }

    public static enum AnalysisType
    {
        BIOLOGICAL,
        CHEMICAL,
        PHYSICAL
    }

    public static enum AnalyticalGroupSimpleType
    {
        KNOWN,
        UNKNOWN,
        FIELD_SURVEY
    }

    public static enum AnalyticalGroupType
    {
        KNOWN,
        UNKNOWN,
        FIELD_SURVEY
    }

    public static enum AppliesToType
    {
        SAMPLING_LOCATION,
        OBSERVATION,
        ACTIVITY,
        FIELD_VISIT,
        SPECIMEN
    }

    public static enum DataClassificationType
    {
        LAB,
        FIELD_RESULT,
        FIELD_SURVEY,
        VERTICAL_PROFILE,
        ACTIVITY_RESULT,
        SURROGATE_RESULT
    }

    public static enum DataType
    {
        TEXT,
        NUMBER,
        DROP_DOWN_LIST
    }

    public static enum DayOfWeekType
    {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static enum DeterminationType
    {
        ACTUAL,
        BLANK_CORRECTED_CALCULATED,
        CALCULATED,
        CONTROL_ADJUSTED,
        ESTIMATED
    }

    public static enum FieldResultType
    {
        ANALYSIS,
        MEASUREMENT
    }

    public static enum GetExportObservationsFormatType
    {
        WQX,
        CROSSTAB_CSV,
        XSLX
    }

    public static enum GetObservationExportIIFormatType
    {
        CSV
    }

    public static enum GetUnitGroupsSystemCodeType
    {
        LENGTH
    }

    public static enum GetUnitGroupWithUnitsSystemCodeType
    {
        LENGTH
    }

    public static enum ImportItemStatusType
    {
        ERROR,
        NEW,
        UPDATE,
        EXPECTED,
        SKIPPED
    }

    public static enum ImportProcessorTransactionStatusType
    {
        PENDING,
        IN_PROGRESS,
        COMPLETED,
        COMPLETED_WITH_ERRORS,
        BAD_REQUEST,
        SYSTEM_ERROR
    }

    public static enum ImportType
    {
        OBSERVATION_CSV,
        OBSERVATION_LABREPORT,
        SAMPLINGLOCATION_CSV,
        OBSERVED_PROPERTIES_CSV,
        ANALYSIS_METHODS_CSV,
        TAXON_CSV,
        SAMPLING_PLAN
    }

    public static enum MediumSystemCodeType
    {
        WATER,
        SOIL,
        AIR,
        BIOLOGICAL,
        HABITAT,
        SEDIMENT,
        TISSUE,
        OTHER,
        GROUNDWATER,
        RAINWATER,
        SURFACE_WATER,
        WASTE_WATER
    }

    public static enum MediumType
    {
        WATER,
        SOIL,
        AIR,
        BIOLOGICAL,
        HABITAT,
        SEDIMENT,
        TISSUE,
        OTHER,
        GROUNDWATER,
        RAINWATER,
        SURFACE_WATER,
        WASTE_WATER
    }

    public static enum OperationType
    {
        INSERT,
        UPDATE,
        DELETE
    }

    public static enum PlannedActivityActivityType
    {
        SAMPLE_INTEGRATED_VERTICAL_PROFILE,
        SAMPLE_ROUTINE,
        REPLICATE,
        BLANK,
        SPIKE,
        OTHER_QC,
        FIELD_SURVEY,
        INDEX_CALCULATION,
        NONE
    }

    public static enum PlanningStatusType
    {
        PLANNED,
        IN_PROGRESS,
        CANCELLED,
        DONE
    }

    public static enum PreservativeType
    {
        SULFURIC_ACID,
        NITRIC_ACID,
        HYDROCHLORIC_ACID,
        SODIUM_HYDROXIDE,
        ICE,
        ISOPROPYL_ALCOHOL,
        MERCURIC_CHLORIDE,
        LIQUID_NITROGEN,
        FORMALIN,
        SODIUM_AZIDE,
        FIELD_FREEZE,
        KEEP_DARK
    }

    public static enum ProjectType
    {
        ROUTINE_MONITORING,
        EVENT_BASED_MONITORING,
        RESTORATION_PROJECT,
        STUDY
    }

    public static enum QualityControlType
    {
        NORMAL,
        REPLICATE,
        BLANK,
        SPIKE,
        OTHER_QC
    }

    public static enum RecurrenceDayMonthlyType
    {
        FIRST_DAY_OF_MONTH,
        LAST_DAY_OF_MONTH
    }

    public static enum RecurrenceDayWeeklyType
    {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static enum RecurrenceFrequencyType
    {
        WEEKLY,
        BI_WEEKLY,
        MONTHLY
    }

    public static enum RecurrenceType
    {
        WEEKLY,
        BI_WEEKLY,
        MONTHLY
    }

    public static enum ResultGradeSystemCodeType
    {
        UNKNOWN
    }

    public static enum ResultStatusSystemCodeType
    {
        REQUESTED,
        PRELIMINARY
    }

    public static enum ResultType
    {
        NUMERIC,
        CATEGORICAL,
        TAXON,
        CATEGORICAL_FIXED_VALUES
    }

    public static enum SampleFractionType
    {
        DISSOLVED,
        TOTAL
    }

    public static enum SamplingLocationGroupSelectionType
    {
        ALL,
        RANDOM
    }

    public static enum SourceRoundedValueType
    {
        PROVIDED_BY_USER,
        ROUNDING_SPECIFICATION,
        SYSTEM_DEFAULT
    }

    public static enum SpecimenViewStatusType
    {
        REQUESTED,
        RECEIVED_SOME,
        RECEIVED_ALL
    }

    public static enum SpreadsheetTemplateType
    {
        CUSTODY_LOG,
        OBSERVATION_EXPORT
    }

    public static enum TemporalExpressionType
    {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        LAST,
        FIRST_DAY_OF_MONTH,
        LAST_DAY_OF_MONTH
    }

    public static enum UnitGroupSystemCodeType
    {
        LENGTH
    }

    public static enum UnitGroupWithUnitsSystemCodeType
    {
        LENGTH
    }

    public static enum UserType
    {
        INTERNAL,
        EXTERNAL,
        SYSTEM
    }
}
