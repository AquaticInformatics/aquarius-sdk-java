package com.aquaticinformatics.aquarius.sdk.samples;

import com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer;
import com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

public class FieldNamer implements IFieldNamer, FieldNamingStrategy {
    @Override
    public void configure(GsonBuilder gsonBuilder) {
        gsonBuilder.setFieldNamingStrategy(this);
    }

    @Override
    public String translateName(Field field) {
        // Make sure the field is camelCase, not PascalCase.
        return SdkServiceClient.camelCase(field.getName());
    }
}
