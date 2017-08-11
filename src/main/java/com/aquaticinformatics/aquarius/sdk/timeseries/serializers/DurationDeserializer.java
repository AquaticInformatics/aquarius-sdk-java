package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.Duration;

public class DurationDeserializer implements JsonDeserializer<Duration> {
    @Override
    public Duration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return parse(jsonElement.getAsString());
    }

    public static Duration parse(String text) {
        return Duration.parse(text);
    }
}
