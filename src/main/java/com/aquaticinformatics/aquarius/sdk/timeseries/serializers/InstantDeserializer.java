package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.lang.reflect.Type;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class InstantDeserializer implements JsonDeserializer<Instant> {

    public static final String ZoneFieldPattern = "ZZZZZ";
    public static final String DateAndTimePattern = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
    public static final String FractionalSecondsPattern = "'.'SSSSSSS";
    public static final String Pattern = DateAndTimePattern + FractionalSecondsPattern + ZoneFieldPattern;

    public static final DateTimeFormatter FORMATTER =
            new DateTimeFormatterBuilder().appendPattern(DateAndTimePattern)
                    .appendFraction(ChronoField.NANO_OF_SECOND, 0, 7, true)
                    .appendPattern(ZoneFieldPattern)
                    .toFormatter();

    public static final String JsonMaxValue = "MaxInstant";
    public static final String JsonMinValue = "MinInstant";
    public static final Instant MaxValue = Instant.MAX;
    public static final Instant MinValue = Instant.MIN;

    public static final String JsonMaxConcreteValue = "9999-12-31T23:59:59.9999999Z";
    public static final String JsonMinConcreteValue = "0001-01-01T00:00:00.0000000Z";
    public static final Instant MaxConcreteValue = FORMATTER.parse(JsonMaxConcreteValue, Instant::from);
    public static final Instant MinConcreteValue = FORMATTER.parse(JsonMinConcreteValue, Instant::from);

    @Override
    public Instant deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        return parse(jsonElement.getAsString());
    }

    public static Instant parse(String text) {
        if (text.equalsIgnoreCase(JsonMaxValue))
            return MaxValue;

        if (text.equalsIgnoreCase(JsonMinValue))
            return MinValue;

        return FORMATTER.parse(text, Instant::from);
    }
}
