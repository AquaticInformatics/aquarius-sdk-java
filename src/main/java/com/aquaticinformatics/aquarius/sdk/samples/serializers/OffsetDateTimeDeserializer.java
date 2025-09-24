package com.aquaticinformatics.aquarius.sdk.samples.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;


public class OffsetDateTimeDeserializer implements JsonDeserializer<OffsetDateTime> {

    public static final String ZoneFieldPattern = "XXXXX";
    public static final String DateAndTimePattern = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
    public static final String FractionalSecondsPattern = "'.'SSS";
    public static final String Pattern = DateAndTimePattern + FractionalSecondsPattern + ZoneFieldPattern;

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter
            .ofPattern(Pattern)
            .withLocale(Locale.US);


    public static final String JsonMaxValue = "MaxOffsetDateTime";
    public static final String JsonMinValue = "MinOffsetDateTime";
    public static final OffsetDateTime MaxValue = OffsetDateTime.MAX;
    public static final OffsetDateTime MinValue = OffsetDateTime.MIN;

    public static final String JsonMaxConcreteValue = "9999-12-31T23:59:59.999-18:00";
    public static final String JsonMinConcreteValue = "0001-01-01T00:00:00.000+18:00";
    public static final OffsetDateTime MaxConcreteValue = FORMATTER.parse(JsonMaxConcreteValue, OffsetDateTime::from);
    public static final OffsetDateTime MinConcreteValue = FORMATTER.parse(JsonMinConcreteValue, OffsetDateTime::from);

    @Override
    public OffsetDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        return parse(jsonElement.getAsString());
    }


    public static OffsetDateTime parse(String text) {
        if (text.equalsIgnoreCase(JsonMaxValue))
            return MaxValue;

        if (text.equalsIgnoreCase(JsonMinValue))
            return MinValue;

        if (text.length() > 0 && text.charAt(text.length()-1) == ']') {
            text = text.substring(0, text.indexOf('['));
        }

        try {
            // Workaround for AQS-760 quirks: 2020-12-01T-08:00 || 2020-12-01T
            if (text.contains("T-") || text.contains("T+") || text.matches(".*T$"))
                text = text.replace("T", "T00:00:00.000");
            // Workaround for quirks: 2020-12-01T00:00:00.000
            if(!text.matches(".*([+-]\\d{2}:?\\d{2}|Z)$"))
                text = text+"Z";
            return FORMATTER.parse(text, OffsetDateTime::from);
        }
        catch(DateTimeParseException exception) {
            throw(exception);
        }
    }
}
