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

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class InstantDeserializerTest {

    private Gson gson;

    @Before
    public void forEachTest() {
        gson = new GsonBuilder()
                .registerTypeAdapter(Instant.class, new InstantDeserializer())
                .create();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parse_WithNullText_Throws(){
        thrown.expect(NullPointerException.class);

        InstantDeserializer.parse(null);
    }

    private Object[] validInstantTests() {
        return new Object[]{
                new Object[]{"Xmas 2015 AEST", "2015-12-25T00:00:00.1234567+10:00", Instant.parse("2015-12-24T14:00:00.1234567Z")},
                new Object[]{"Xmas 2016 UTC", "2016-12-25T00:00:00.1234567Z", Instant.parse("2016-12-25T00:00:00.1234567Z")},
                new Object[]{"Xmas 2016 UTC - 3 fractional second digits", "2016-12-25T00:00:00.123Z", Instant.parse("2016-12-25T00:00:00.123Z")},
                new Object[]{"Xmas 2016 UTC - No fractional seconds", "2016-12-25T00:00:00Z", Instant.parse("2016-12-25T00:00:00Z")},
                new Object[]{"Xmas 2017 PST", "2017-12-25T00:00:00.1234567-07:00", Instant.parse("2017-12-25T07:00:00.1234567Z")},
                new Object[]{"MaxConcreteValue", InstantDeserializer.JsonMaxConcreteValue, InstantDeserializer.MaxConcreteValue},
                new Object[]{"MinConcreteValue", InstantDeserializer.JsonMinConcreteValue, InstantDeserializer.MinConcreteValue},
                new Object[]{"MaxValue", InstantDeserializer.JsonMaxValue, InstantDeserializer.MaxValue},
                new Object[]{"MinValue", InstantDeserializer.JsonMinValue, InstantDeserializer.MinValue},
        };
    }

    @Test
    @Parameters(method = "validInstantTests")
    public void parse_WithValidInstant_ConvertsAsExpected(String reason, String instantText, Instant expected){

        Instant actual = InstantDeserializer.parse(instantText);

        assertEquals(reason, expected, actual);
    }

    @Test
    @Parameters(method = "validInstantTests")
    public void fromJson_WithValidInstant_ConvertsAsExpected(String reason, String instantText, Instant expected){

        String json = "\"" + instantText + "\"";

        Instant actual = gson.fromJson(json, Instant.class);

        assertEquals(reason, expected, actual);
    }
}
