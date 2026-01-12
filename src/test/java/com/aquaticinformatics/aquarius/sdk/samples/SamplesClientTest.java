package com.aquaticinformatics.aquarius.sdk.samples;


import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

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

}
