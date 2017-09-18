package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.Duration;

public class DurationDeserializer implements JsonDeserializer<Duration> {

    public static final String JsonMaxValue = "MaxDuration";
    public static final String JsonMinValue = "MinDuration";
    public static final Duration MaxValue = Duration.ofSeconds(Long.MAX_VALUE, 999_999_999);
    public static final Duration MinValue = Duration.ofSeconds(Long.MIN_VALUE, 999_999_999);

    public static final Duration MaxConcreteValue = Duration.ofDays(9999 * 365);//parse(JsonMaxConcreteValue);
    public static final Duration MinConcreteValue = MaxConcreteValue.negated();

    @Override
    public Duration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return parse(jsonElement.getAsString());
    }

    public static Duration parse(String text) {
        if (text.equalsIgnoreCase(JsonMaxValue))
            return MaxValue;

        if (text.equalsIgnoreCase(JsonMinValue))
            return MinValue;

        return Duration.parse(text);
    }
}
