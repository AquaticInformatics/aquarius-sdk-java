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

import java.time.Duration;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)public class DurationSerializerTest {

    private Gson gson;

    @Before
    public void forEachTest() {
        gson = new GsonBuilder()
                .registerTypeAdapter(Duration.class, new DurationSerializer())
                .create();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void format_WithNullInstant_Throws(){
        thrown.expect(NullPointerException.class);

        DurationSerializer.format(null);
    }
    private Object[] validDurationTests() {
        return new Object[]{
                new Object[]{"One hour, 30 minutes from now", Duration.ofHours(1).plusMinutes(30), "PT1H30M"},
                new Object[]{"45 minutes ago", Duration.ofMinutes(-45), "-PT45M"},
        };
    }

    @Test
    @Parameters(method = "validDurationTests")
    public void format_WithValidDuration_ConvertsAsExpected(String reason, Duration duration, String expected) {
        String actual = DurationSerializer.format(duration);

        assertEquals(reason, expected, actual);
    }

    @Test
    @Parameters(method = "validDurationTests")
    public void toJson_WithValidDuration_ConvertsAsExpected(String reason, Duration duration, String expected) {

        String expectedJson = "\"" + expected + "\"";

        String actual = gson.toJson(duration);

        assertEquals(reason, expectedJson, actual);
    }
}
