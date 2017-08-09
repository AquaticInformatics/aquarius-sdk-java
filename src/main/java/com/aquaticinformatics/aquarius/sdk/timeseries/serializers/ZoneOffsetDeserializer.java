package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.time.ZoneOffset;

public class ZoneOffsetDeserializer implements JsonDeserializer<ZoneOffset> {
    @Override
    public ZoneOffset deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {

        String value = json.getAsString();

        return ZoneOffset.of(value);
    }
}
