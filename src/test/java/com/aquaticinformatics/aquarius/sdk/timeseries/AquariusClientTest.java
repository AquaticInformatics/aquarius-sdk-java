package com.aquaticinformatics.aquarius.sdk.timeseries;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class AquariusClientTest {
    @Test
    public void CreateConnectedClient_AccessTokenAuth_SetsClientBearerToken() {
        String mockHostname = "http://example.com";
        String mockAccessToken = "some-access-token";
        AquariusClient client = AquariusClient.createConnectedClient(mockHostname, mockAccessToken);

        assertEquals(client.Acquisition.getBearerToken(), mockAccessToken);
        assertEquals(client.Provisioning.getBearerToken(), mockAccessToken);
        assertEquals(client.Publish.getBearerToken(), mockAccessToken);
    }
}
