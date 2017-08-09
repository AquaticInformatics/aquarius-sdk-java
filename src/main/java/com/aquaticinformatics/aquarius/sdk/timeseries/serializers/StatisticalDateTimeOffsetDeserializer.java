package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset;
import com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.Instant;

public class StatisticalDateTimeOffsetDeserializer implements JsonDeserializer<StatisticalDateTimeOffset> {
    @Override
    public StatisticalDateTimeOffset deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {

        String value = json.getAsString();

        Instant timestamp = InstantDeserializer.parse(value);

        return new StatisticalDateTimeOffset().setDateTimeOffset(timestamp);
    }
}
