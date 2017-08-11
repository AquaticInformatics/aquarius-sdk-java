package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset;
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
import java.time.format.DateTimeParseException;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StatisticalDateTimeOffsetDeserializerTest {

    private Gson gson;

    @Before
    public void forEachTest() {
        gson = new GsonBuilder()
                .registerTypeAdapter(StatisticalDateTimeOffset.class, new StatisticalDateTimeOffsetDeserializer())
                .create();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parse_WithNullText_Throws() {
        thrown.expect(NullPointerException.class);

        StatisticalDateTimeOffsetDeserializer.parse(null);
    }

    @Test
    public void parse_WithEmptyText_Throws() {
        thrown.expect(DateTimeParseException.class);

        StatisticalDateTimeOffsetDeserializer.parse("");
    }

    private Object[] validTimestampTests() {
        return new Object[]{
                new Object[]{"Xmas 2015 AEST",         "2015-12-25T00:00:00.0000000+10:00", false, Instant.parse("2015-12-24T14:00:00Z")},
                new Object[]{"BoxingDay 2015 AEST",    "2015-12-26T00:00:00.0000000+10:00", false, Instant.parse("2015-12-25T14:00:00Z")},
                new Object[]{"Xmas.Midnight 2015 AEST","2015-12-25T24:00:00.0000000+10:00", true,  Instant.parse("2015-12-25T14:00:00Z")},
                new Object[]{"Xmas 2016 UTC",          "2016-12-25T00:00:00.0000000Z", false, Instant.parse("2016-12-25T00:00:00Z")},
                new Object[]{"BoxingDay 2016 UTC",     "2016-12-26T00:00:00.0000000Z", false, Instant.parse("2016-12-26T00:00:00Z")},
                new Object[]{"Xmas.Midnight 2016 UTC", "2016-12-25T24:00:00.0000000Z", true,  Instant.parse("2016-12-26T00:00:00Z")},
                new Object[]{"Xmas 2017 PST",          "2017-12-25T00:00:00.0000000-07:00", false, Instant.parse("2017-12-25T07:00:00Z")},
                new Object[]{"BoxingDay 2017 PST",     "2017-12-26T00:00:00.0000000-07:00", false, Instant.parse("2017-12-26T07:00:00Z")},
                new Object[]{"Xmas.Midnight 2017 PST", "2017-12-25T24:00:00.0000000-07:00", true,  Instant.parse("2017-12-26T07:00:00Z")},
        };
    }

    @Test
    @Parameters(method = "validTimestampTests")
    public void parse_WithValidTimestamp_ConvertsAsExpected(String reason, String jsonText, boolean expectedRepresentsEndOfTimePeriod, Instant expectedDateTimeOffset) {

        StatisticalDateTimeOffset expected = new StatisticalDateTimeOffset()
                .setRepresentsEndOfTimePeriod(expectedRepresentsEndOfTimePeriod)
                .setDateTimeOffset(expectedDateTimeOffset);

        StatisticalDateTimeOffset actual = StatisticalDateTimeOffsetDeserializer.parse(jsonText);

        assertEquals(reason + " (RepresentsEndOfTimePeriod)", expected.RepresentsEndOfTimePeriod, actual.RepresentsEndOfTimePeriod);
        assertEquals(reason + "(.DateTimeOffset)", expected.DateTimeOffset, actual.DateTimeOffset);
    }

    @Test
    @Parameters(method = "validTimestampTests")
    public void fromJson_WithValidTimestamp_ConvertsAsExpected(String reason, String jsonText, boolean expectedRepresentsEndOfTimePeriod, Instant expectedDateTimeOffset) {

        StatisticalDateTimeOffset expected = new StatisticalDateTimeOffset()
                .setRepresentsEndOfTimePeriod(expectedRepresentsEndOfTimePeriod)
                .setDateTimeOffset(expectedDateTimeOffset);

        String json = "\"" + jsonText + "\"";

        StatisticalDateTimeOffset actual =  gson.fromJson(json, StatisticalDateTimeOffset.class);

        assertEquals(reason + " (RepresentsEndOfTimePeriod)", expected.RepresentsEndOfTimePeriod, actual.RepresentsEndOfTimePeriod);
        assertEquals(reason + "(.DateTimeOffset)", expected.DateTimeOffset, actual.DateTimeOffset);
    }
}
