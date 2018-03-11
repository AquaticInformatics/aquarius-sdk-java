package com.aquaticinformatics.aquarius.sdk.samples;

import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SamplesClientTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void Create_Works() {

        try {
            SamplesClient client = SamplesClient.createConnectedClient("https://yourdomain.aqsamples.com", "yourtoken");

            System.out.printf("Connected to %s (%s)\n", client.Api.getEndpointUrl(), client.ServerVersion.toString());

            ServiceModel.SearchResultActivity searchResultActivity = client.Api.get(new ServiceModel.GetActivities());

            System.out.printf("Found %d activities\n", searchResultActivity.TotalCount);

        }
        catch (Exception e)
        {
            System.out.printf("ERROR: %s\n%s\n", e.getMessage(), e.toString());
        }
    }

}
