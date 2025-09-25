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

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class OffsetDateTimeSerializerTest {

    private Gson gson;

    @Before
    public void forEachTest() {
        gson = new GsonBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeSerializer())
                .create();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void format_WithNullInstant_Throws() {
        thrown.expect(NullPointerException.class);

        OffsetDateTimeSerializer.format(null);
    }

    private Object[] validOffsetDateTimeTests() {
        return new Object[]{
                new Object[]{"Xmas 2015 AEST", ZonedDateTime.parse("2015-12-25T00:00:00+10:00").toOffsetDateTime(), "2015-12-25T00:00:00.000+10:00"},
                new Object[]{"Xmas 2015 AEST and 7 fractional seconds", ZonedDateTime.parse("2015-12-25T00:00:00.1234567+10:00").toOffsetDateTime(), "2015-12-25T00:00:00.123+10:00"},
                new Object[]{"Xmas 2016 UTC", OffsetDateTime.parse("2016-12-25T00:00:00Z"), "2016-12-25T00:00:00.000Z"},
                new Object[]{"Xmas 2016 UTC and 7 fractional seconds", OffsetDateTime.parse("2016-12-25T00:00:00.1234567Z"), "2016-12-25T00:00:00.123Z"},
                new Object[]{"Xmas 2016 UTC and 9 fractional digits truncates to 3 fractional seconds", OffsetDateTime.parse("2016-12-25T00:00:00.123456789Z"), "2016-12-25T00:00:00.123Z"},
                new Object[]{"Xmas 2017 PST", ZonedDateTime.parse("2017-12-25T00:00:00-07:00").toOffsetDateTime(), "2017-12-25T00:00:00.000-07:00"},
                new Object[]{"Xmas 2017 PST and 7 fractional seconds", ZonedDateTime.parse("2017-12-25T00:00:00.1234567-07:00").toOffsetDateTime(), "2017-12-25T00:00:00.123-07:00"},
                new Object[]{"MaxConcreteValue", OffsetDateTimeDeserializer.MaxConcreteValue, OffsetDateTimeDeserializer.JsonMaxConcreteValue},
                new Object[]{"MinConcreteValue", OffsetDateTimeDeserializer.MinConcreteValue, OffsetDateTimeDeserializer.JsonMinConcreteValue},
                new Object[]{"MaxConcreteValue plus one tick", OffsetDateTimeDeserializer.MaxConcreteValue.plusNanos(1000), OffsetDateTimeDeserializer.JsonMaxValue},
                new Object[]{"MinConcreteValue minus one tick", OffsetDateTimeDeserializer.MinConcreteValue.minusNanos(1000), OffsetDateTimeDeserializer.JsonMinValue},
                new Object[]{"MaxValue", OffsetDateTimeDeserializer.MaxValue, OffsetDateTimeDeserializer.JsonMaxValue},
                new Object[]{"MinValue", OffsetDateTimeDeserializer.MinValue, OffsetDateTimeDeserializer.JsonMinValue},
        };
    }

    @Test
    @Parameters(method = "validOffsetDateTimeTests")
    public void format_WithValidOffsetDateTime_ConvertsAsExpected(String reason, OffsetDateTime offsetDateTime, String expected) {

        String actual = OffsetDateTimeSerializer.format(offsetDateTime);

        assertEquals(reason, expected, actual);
    }

    @Test
    @Parameters(method = "validOffsetDateTimeTests")
    public void toJson_WithValidOffsetDateTime_ConvertsAsExpected(String reason, OffsetDateTime offsetDateTime, String expected) {

        String expectedJson = "\"" + expected + "\"";
        String actual = gson.toJson(offsetDateTime);

        assertEquals(reason, expectedJson, actual);
    }
}

