package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class StatisticalDateTimeOffsetDeserializer implements JsonDeserializer<StatisticalDateTimeOffset> {

    private static final String EndOfDayMidnightLiteral = "T24:00:00.0000000";
    private static final String EndOfDayMidnightPattern = "yyyy'-'MM'-'dd'" + EndOfDayMidnightLiteral + "'" + InstantDeserializer.ZoneFieldPattern;

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter
            .ofPattern(
                    "["+InstantDeserializer.Pattern+"]" +
                    "["+EndOfDayMidnightPattern+"]")
            .withLocale(Locale.US);

    @Override
    public StatisticalDateTimeOffset deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {

        return parse(jsonElement.getAsString());
    }

    public static StatisticalDateTimeOffset parse(String text){

        ZonedDateTime timestamp = FORMATTER.parse(text, ZonedDateTime::from);

        if (timestamp.toLocalTime() == LocalTime.MIDNIGHT && text.contains(EndOfDayMidnightLiteral))
        {
            return new StatisticalDateTimeOffset()
                    .setRepresentsEndOfTimePeriod(true)
                    .setDateTimeOffset(timestamp.toInstant());
        }

        return new StatisticalDateTimeOffset()
                .setRepresentsEndOfTimePeriod(false)
                .setDateTimeOffset(timestamp.toInstant());
    }
}
