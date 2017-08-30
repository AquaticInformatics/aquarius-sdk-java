package com.aquaticinformatics.aquarius.sdk.timeseries.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.lang.reflect.Type;
import java.util.Locale;

public class InstantDeserializer implements JsonDeserializer<Instant> {

    public static final String ZoneFieldPattern = "ZZZZZ";
    public static final String Pattern = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSS" + ZoneFieldPattern;

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter
            .ofPattern(Pattern)
            .withLocale(Locale.US);

    @Override
    public Instant deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        return parse(jsonElement.getAsString());
    }

    public static Instant parse(String text) {
        return FORMATTER.parse(text, Instant::from);
    }
}
