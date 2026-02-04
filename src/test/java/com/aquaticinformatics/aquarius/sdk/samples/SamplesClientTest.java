package com.aquaticinformatics.aquarius.sdk.samples;

import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import junitparams.JUnitParamsRunner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Category(TestRequiresCredentials.class)
@RunWith(JUnitParamsRunner.class)
public class SamplesClientTest {
    private SamplesClient client;

    @Before
    public void forEachTest() {
        if (System.getenv("SAMPLES_CLIENT") == null || System.getenv("SAMPLES_TOKEN") == null) {
            throw new IllegalStateException("Connection Error: SAMPLES_CLIENT and SAMPLES_TOKEN environment variables have not been set.");
        }
        try {
            client = SamplesClient.createConnectedClient(System.getenv("SAMPLES_CLIENT"), System.getenv("SAMPLES_TOKEN"));
            System.out.printf("Connected to %s (%s)\n", client.Api.getEndpointUrl(), client.ServerVersion.toString());
        } catch (Exception error) {
            System.out.printf("Connection Error: %s\n", error.getMessage());
        }
    }


    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void GetActivities_ConnectedClient_ReturnsSearchResultActivities() {
        ServiceModel.SearchResultActivity searchResultActivity = client.Api.get(new ServiceModel.GetActivities());
        Assert.assertTrue(searchResultActivity.TotalCount > 0);
        System.out.printf("Found %d activities\n", searchResultActivity.TotalCount);
    }

    @Test
    public void GetLabs_ConnectedClient_ReturnsSearchResultLaboratory() {
        ServiceModel.SearchResultLaboratory searchResultLaboratory = client.Api.get(new ServiceModel.GetLaboratories());
        Assert.assertTrue(searchResultLaboratory.TotalCount > 0);
        System.out.printf("Found %d laboratories\n", searchResultLaboratory.TotalCount);
    }


    @Test
    public void PostLocation_ConnectedClient_IsSuccessful() {
        ServiceModel.PostSamplingLocation request = new ServiceModel.PostSamplingLocation();
        String locationId = "location customId" + UUID.randomUUID();
        request.CustomId = locationId;
        ServiceModel.SamplingLocation post = client.Api.post(request);
        assertEquals(post.getCustomId(), locationId);
    }


    @Test
    public void PostUploadAttachment_WithCsvFile_IsSuccessfulAndSetsCorrectMimeType() {
        ServiceModel.PostUploadAttachment postUploadAttachment = new ServiceModel.PostUploadAttachment();
        File file = new File("src/test/resources/test-csv-attachment.csv");
        ServiceModel.AttachmentRepresentation attachmentRepresentation = client.postFileWithRequest(file, postUploadAttachment);

        assertEquals(true, attachmentRepresentation.Success);
        assertEquals("text/csv", attachmentRepresentation.ContentType);
        assertEquals("test-csv-attachment.csv", attachmentRepresentation.FileName);
    }

    @Test
    public void PostLocationAttachment_WithAttachment_IsSuccessful() {
        ServiceModel.PostUploadAttachment postUploadAttachment = new ServiceModel.PostUploadAttachment();
        File file = new File("src/test/resources/test-csv-attachment.csv");
        ServiceModel.AttachmentRepresentation attachmentRepresentation = client.postFileWithRequest(file, postUploadAttachment);

        ServiceModel.PostSamplingLocation postSamplingLocation = new ServiceModel.PostSamplingLocation();
        postSamplingLocation.CustomId = UUID.randomUUID().toString();
        ServiceModel.DomainObjectAttachment e1 = mapToDomainObjectAttachment(attachmentRepresentation);
        postSamplingLocation.Attachments = List.of(e1);
        ServiceModel.SamplingLocation post = client.Api.post(postSamplingLocation);
        assertEquals(1, post.Attachments.size());
        ServiceModel.Attachment firstAttachment = post.getAttachments().get(0).getAttachment();
        assertEquals("test-csv-attachment.csv", firstAttachment.FileName);

    }

    private static ServiceModel.DomainObjectAttachment mapToDomainObjectAttachment(ServiceModel.AttachmentRepresentation from) {
        ServiceModel.DomainObjectAttachment e1 =
                new ServiceModel.DomainObjectAttachment();
        e1.Id = from.getId();
        ServiceModel.Attachment to = new ServiceModel.Attachment();
        to.setId(from.getId());
        to.setFileSize(from.getFileSize());
        to.setFileName(from.getFileName());
        to.setContentType(from.getContentType());
        to.setFileSize(from.getFileSize());
        e1.Attachment = to;
        return e1;
    }
}
