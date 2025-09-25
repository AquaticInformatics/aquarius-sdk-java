package com.aquaticinformatics.aquarius.sdk.samples.serializers;

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
    public void parse_WithNullText_Throws() {
        thrown.expect(NullPointerException.class);

        InstantDeserializer.parse(null);
    }

    private Object[] validInstantTests() {
        return new Object[]{
                new Object[]{"Xmas 2015 AEST", "2015-12-25T00:00:00.123+10:00", Instant.parse("2015-12-24T14:00:00.123Z")},
                new Object[]{"Xmas 2016 UTC", "2016-12-25T00:00:00.123Z", Instant.parse("2016-12-25T00:00:00.123Z")},
                new Object[]{"Xmas 2016 UTC - 3 fractional second digits", "2016-12-25T00:00:00.123Z", Instant.parse("2016-12-25T00:00:00.123Z")},
                new Object[]{"Xmas 2017 PST", "2017-12-25T00:00:00.123-07:00", Instant.parse("2017-12-25T07:00:00.123Z")},
                new Object[]{"Xmas 2017 with aggressively negative UTC offset", "2017-12-25T00:00:00.123-17:00", Instant.parse("2017-12-25T17:00:00.123Z")},
                new Object[]{"Xmas 2015 with aggressively positive UTC offset", "2015-12-25T00:00:00.123+18:00", Instant.parse("2015-12-24T06:00:00.123Z")},
                new Object[]{"MaxConcreteValue", InstantDeserializer.JsonMaxConcreteValue, InstantDeserializer.MaxConcreteValue},
                new Object[]{"MinConcreteValue", InstantDeserializer.JsonMinConcreteValue, InstantDeserializer.MinConcreteValue},
                new Object[]{"MaxValue", InstantDeserializer.JsonMaxValue, InstantDeserializer.MaxValue},
                new Object[]{"MinValue", InstantDeserializer.JsonMinValue, InstantDeserializer.MinValue},
                new Object[]{"Xmas 2017 PST with timezone datum code", "2017-12-25T00:00:00.123-07:00[PST]", Instant.parse("2017-12-25T07:00:00.123Z")},
                new Object[]{"Missing time component assumes midnight (Vancouver)", "2020-12-01T-07:00", Instant.parse("2020-12-01T07:00:00.000Z")},
                new Object[]{"Missing time component assumes midnight (Sydney)", "2020-12-01T+10:00", Instant.parse("2020-11-30T14:00:00.000Z")},
                new Object[]{"Missing offset component assumes UTC", "2020-12-01T00:00:00.000", Instant.parse("2020-12-01T00:00:00.000Z")},
                new Object[]{"Missing both offset and time component assumes midnight and UTC", "2000-07-15T", Instant.parse("2000-07-15T00:00:00.000Z")},
                new Object[]{"Missing time component and offset is UTC assumes midnight", "2000-07-15TZ", Instant.parse("2000-07-15T00:00:00.000Z")},
        };
    }

    @Test
    @Parameters(method = "validInstantTests")
    public void parse_WithValidInstant_ConvertsAsExpected(String reason, String instantText, Instant expected) {

        Instant actual = InstantDeserializer.parse(instantText);

        assertEquals(reason, expected, actual);
    }

    @Test
    @Parameters(method = "validInstantTests")
    public void fromJson_WithValidInstant_ConvertsAsExpected(String reason, String instantText, Instant expected) {

        String json = "\"" + instantText + "\"";

        Instant actual = gson.fromJson(json, Instant.class);

        assertEquals(reason, expected, actual);
    }
}
