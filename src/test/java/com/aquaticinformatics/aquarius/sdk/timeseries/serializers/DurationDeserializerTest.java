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

@RunWith(JUnitParamsRunner.class)
public class DurationDeserializerTest {

    private Gson gson;

    @Before
    public void forEachTest() {
        gson = new GsonBuilder()
                .registerTypeAdapter(Duration.class, new DurationDeserializer())
                .create();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parse_WithNullText_Throws(){
        thrown.expect(NullPointerException.class);

        DurationDeserializer.parse(null);
    }

    private Object[] validDurationTests() {
        return new Object[]{
                new Object[]{"One hour, 30 minutes from now", "PT1H30M", Duration.ofHours(1).plusMinutes(30)},
                new Object[]{"45 minutes ago", "-PT45M", Duration.ofMinutes(-45)},
                new Object[]{"MaxValue", DurationDeserializer.JsonMaxValue, DurationDeserializer.MaxValue},
                new Object[]{"MinValue", DurationDeserializer.JsonMinValue, DurationDeserializer.MinValue},
        };
    }

    @Test
    @Parameters(method = "validDurationTests")
    public void parse_WithValidDuration_ConvertsAsExpected(String reason, String text, Duration expected) {
        Duration actual = DurationDeserializer.parse(text);

        assertEquals(reason, expected, actual);
    }

    @Test
    @Parameters(method = "validDurationTests")
    public void fromJson_WithValidDuration_ConvertsAsExpected(String reason, String text, Duration expected) {

        String json = "\"" + text + "\"";

        Duration actual = gson.fromJson(json, Duration.class);

        assertEquals(reason, expected, actual);
    }
}
