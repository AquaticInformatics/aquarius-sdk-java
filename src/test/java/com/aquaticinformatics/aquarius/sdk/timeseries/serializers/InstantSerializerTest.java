package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.time.Instant;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class InstantSerializerTest {

    private Gson gson;

    @Before
    public void forEachTest() {
        gson = new GsonBuilder()
                .registerTypeAdapter(Instant.class, new InstantSerializer())
                .create();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void format_WithNullInstant_Throws(){
        thrown.expect(NullPointerException.class);

        InstantSerializer.format(null);
    }

    private Object[] validInstantTests() {
        return new Object[]{
                new Object[]{"Xmas 2015 AEST", ZonedDateTime.parse("2015-12-25T00:00:00+10:00").toInstant(), "2015-12-24T14:00:00.0000000Z"},
                new Object[]{"Xmas 2015 AEST and 7 fractional seconds", ZonedDateTime.parse("2015-12-25T00:00:00.1234567+10:00").toInstant(), "2015-12-24T14:00:00.1234567Z"},
                new Object[]{"Xmas 2016 UTC", Instant.parse("2016-12-25T00:00:00Z"), "2016-12-25T00:00:00.0000000Z"},
                new Object[]{"Xmas 2016 UTC and 7 fractional seconds", Instant.parse("2016-12-25T00:00:00.1234567Z"), "2016-12-25T00:00:00.1234567Z"},
                new Object[]{"Xmas 2016 UTC and 9 fractional digits truncates to 7 fractional seconds", Instant.parse("2016-12-25T00:00:00.123456789Z"), "2016-12-25T00:00:00.1234567Z"},
                new Object[]{"Xmas 2017 PST", ZonedDateTime.parse("2017-12-25T00:00:00-07:00").toInstant(), "2017-12-25T07:00:00.0000000Z"},
                new Object[]{"Xmas 2017 PST and 7 fractional seconds", ZonedDateTime.parse("2017-12-25T00:00:00.1234567-07:00").toInstant(), "2017-12-25T07:00:00.1234567Z"},
        };
    }

    @Test
    @Parameters(method = "validInstantTests")
    public void format_WithValidInstant_ConvertsAsExpected(String reason, Instant instant, String expected){

        String actual = InstantSerializer.format(instant);

        assertEquals(reason, expected, actual);
    }

    @Test
    @Parameters(method = "validInstantTests")
    public void toJson_WithValidInstant_ConvertsAsExpected(String reason, Instant instant, String expected){

        String expectedJson = "\"" + expected + "\"";
        String actual = gson.toJson(instant);

        assertEquals(reason, expectedJson, actual);
    }
}
