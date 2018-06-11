package com.aquaticinformatics.aquarius.sdk.helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SdkServiceClientTest {

    @Test
    public void removeUnescapedQuotesTest() {
        SdkServiceClient client = SdkServiceClient.Create("", "", null, null);
        String case_1 = "\"Test\"";
        String expected_1 = "Test";
        String case_2 = "\\\"Test\\\"";
        String expected_2 = "\\\"Test\\\"";
        String case_3 = "\\\\\"Test\\\"";
        String expected_3 = "\\\\Test\\\"";
        String case_4 = "\\\\\"Test\\\\\"";
        String expected_4 = "\\\\Test\\\\";
        String case_5 = "\\\\\\\\\"T\"e\\\"st\\\\\\\\\\\"";
        String expected_5 = "\\\\\\\\Te\\\"st\\\\\\\\\\\"";
        
        assertEquals(expected_1, client.removeUnescapedQuotes(case_1, 0));
        assertEquals(expected_2, client.removeUnescapedQuotes(case_2, 0));
        assertEquals(expected_3, client.removeUnescapedQuotes(case_3, 0));
        assertEquals(expected_4, client.removeUnescapedQuotes(case_4, 0));
        assertEquals(expected_5, client.removeUnescapedQuotes(case_5, 0));
    }
}
