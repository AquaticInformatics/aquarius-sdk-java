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

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class OffsetDateTimeDeserializerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private Gson gson;

    @Before
    public void forEachTest() {
        gson = new GsonBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeDeserializer())
                .create();
    }

    @Test
    public void parse_WithNullText_Throws() {
        thrown.expect(NullPointerException.class);

        OffsetDateTimeDeserializer.parse(null);
    }

    private Object[] validOffsetDateTimeTests() {
        return new Object[]{
                new Object[]{"Xmas 2015 AEST", "2015-12-25T00:00:00.123+10:00", OffsetDateTime.parse("2015-12-25T00:00:00.123+10:00")},
                new Object[]{"Xmas 2016 UTC", "2016-12-25T00:00:00.123Z", OffsetDateTime.parse("2016-12-25T00:00:00.123Z")},
                new Object[]{"Xmas 2016 UTC - 3 fractional second digits", "2016-12-25T00:00:00.123Z", OffsetDateTime.parse("2016-12-25T00:00:00.123Z")},
                new Object[]{"Xmas 2017 PST", "2017-12-25T00:00:00.123-07:00", OffsetDateTime.parse("2017-12-25T00:00:00.123-07:00")},
                new Object[]{"Xmas 2017 with aggressively negative UTC offset", "2017-12-25T00:00:00.123-17:00", OffsetDateTime.parse("2017-12-25T00:00:00.123-17:00")},
                new Object[]{"Xmas 2015 with aggressively positive UTC offset", "2015-12-25T00:00:00.123+18:00", OffsetDateTime.parse("2015-12-25T00:00:00.123+18:00")},
                new Object[]{"MaxConcreteValue", OffsetDateTimeDeserializer.JsonMaxConcreteValue, OffsetDateTimeDeserializer.MaxConcreteValue},
                new Object[]{"MinConcreteValue", OffsetDateTimeDeserializer.JsonMinConcreteValue, OffsetDateTimeDeserializer.MinConcreteValue},
                new Object[]{"MaxValue", OffsetDateTimeDeserializer.JsonMaxValue, OffsetDateTimeDeserializer.MaxValue},
                new Object[]{"MinValue", OffsetDateTimeDeserializer.JsonMinValue, OffsetDateTimeDeserializer.MinValue},
                new Object[]{"Xmas 2017 PST with timezone datum code", "2017-12-25T00:00:00.123-07:00[PST]", OffsetDateTime.parse("2017-12-25T00:00:00.123-07:00")},
                new Object[]{"Missing time component assumes midnight (Vancouver)", "2020-12-01T-07:00", OffsetDateTime.parse("2020-12-01T00:00:00.000-07:00")},
                new Object[]{"Missing time component assumes midnight (Sydney)", "2020-12-01T+10:00", OffsetDateTime.parse("2020-12-01T00:00:00.000+10:00")},
                new Object[]{"Missing offset component assumes UTC", "2020-12-01T00:00:00.000", OffsetDateTime.parse("2020-12-01T00:00:00.000Z")},
                new Object[]{"Missing both offset and time component assumes midnight and UTC", "2000-07-15T", OffsetDateTime.parse("2000-07-15T00:00:00.000Z")},
                new Object[]{"Missing time component and offset is UTC assumes midnight", "2000-07-15TZ", OffsetDateTime.parse("2000-07-15T00:00:00.000Z")},
                new Object[]{"Missing time and timezone in datum code", "2000-07-15T[PST]", OffsetDateTime.parse("2000-07-15T00:00:00.000Z")},
                // not sure of the expected behaviour but logic adds UTC if offset time is not present

        };
    }

    @Test
    @Parameters(method = "validOffsetDateTimeTests")
    public void parse_WithValidOffsetDateTime_ConvertsAsExpected(String reason, String offsetDateTimeText, OffsetDateTime expected) {

        OffsetDateTime actual = OffsetDateTimeDeserializer.parse(offsetDateTimeText);

        assertEquals(reason, expected, actual);
    }

    @Test
    @Parameters(method = "validOffsetDateTimeTests")
    public void fromJson_WithValidOffsetDateTime_ConvertsAsExpected(String reason, String offsetDateTimeText, OffsetDateTime expected) {

        String json = "\"" + offsetDateTimeText + "\"";

        OffsetDateTime actual = gson.fromJson(json, OffsetDateTime.class);

        assertEquals(reason, expected, actual);
    }
}
