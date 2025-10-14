package com.aquaticinformatics.aquarius.sdk.samples;


import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class SamplesClientTest {
    private SamplesClient client;

    @Before
    public void forEachTest() {
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
        System.out.printf("Found %d activities\n", searchResultActivity.TotalCount);
    }

    @Test
    public void GetLabs_ConnectedClient_ReturnsSearchResultLaboratory() {
        ServiceModel.SearchResultLaboratory searchResultLaboratory = client.Api.get(new ServiceModel.GetLaboratories());
        System.out.printf("Found %d laboratories\n", searchResultLaboratory.TotalCount);
    }

}
