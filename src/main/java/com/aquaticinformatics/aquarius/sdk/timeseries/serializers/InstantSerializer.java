package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class InstantSerializer implements JsonSerializer<Instant> {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter
            .ofPattern(InstantDeserializer.Pattern)
            .withLocale(Locale.US)
            .withZone( ZoneId.of("UTC"));

    @Override
    public JsonElement serialize(Instant instant, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(format(instant));
    }

    public static String format(Instant instant) {
        if (instant.isAfter(InstantDeserializer.MaxConcreteValue))
            return InstantDeserializer.JsonMaxValue;

        if (instant.isBefore(InstantDeserializer.MinConcreteValue))
            return InstantDeserializer.JsonMinValue;

        return FORMATTER.format(instant);
    }
}
