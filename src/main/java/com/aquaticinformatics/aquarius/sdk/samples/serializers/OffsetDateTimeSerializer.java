package com.aquaticinformatics.aquarius.sdk.samples.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeSerializer implements JsonSerializer<OffsetDateTime> {

    public static final DateTimeFormatter FORMATTER = OffsetDateTimeDeserializer.FORMATTER;

    public static String format(OffsetDateTime offsetDateTime) {
        if (offsetDateTime.isAfter(OffsetDateTimeDeserializer.MaxConcreteValue))
            return OffsetDateTimeDeserializer.JsonMaxValue;

        if (offsetDateTime.isBefore(OffsetDateTimeDeserializer.MinConcreteValue))
            return OffsetDateTimeDeserializer.JsonMinValue;

        return FORMATTER.format(offsetDateTime);
    }

    @Override
    public JsonElement serialize(OffsetDateTime offsetDateTime, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(format(offsetDateTime));
    }
}
