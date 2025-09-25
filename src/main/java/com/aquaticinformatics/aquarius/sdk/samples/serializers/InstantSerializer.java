package com.aquaticinformatics.aquarius.sdk.samples.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstantSerializer implements JsonSerializer<Instant> {

    public static final DateTimeFormatter FORMATTER = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.FORMATTER
            .withZone(ZoneId.of("UTC"));

    public static String format(Instant instant) {
        if (instant.isAfter(com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue))
            return com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.JsonMaxValue;

        if (instant.isBefore(com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MinConcreteValue))
            return InstantDeserializer.JsonMinValue;

        return FORMATTER.format(instant);
    }

    @Override
    public JsonElement serialize(Instant instant, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(format(instant));
    }
}
