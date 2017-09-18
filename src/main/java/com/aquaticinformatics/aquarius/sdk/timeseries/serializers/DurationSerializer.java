package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.time.Duration;

public class DurationSerializer implements JsonSerializer<Duration> {
    @Override
    public JsonElement serialize(Duration duration, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(format(duration));
    }

    public static String format(Duration duration) {
        if (duration.getSeconds() > DurationDeserializer.MaxConcreteValue.getSeconds())
            return DurationDeserializer.JsonMaxValue;

        if (duration.getSeconds() < DurationDeserializer.MinConcreteValue.getSeconds())
            return DurationDeserializer.JsonMinValue;

        if (duration.isNegative()) {
            // AQTS needs a leading minus sign
            return "-"+duration.negated().toString();
        }

        return duration.toString();
    }
}
