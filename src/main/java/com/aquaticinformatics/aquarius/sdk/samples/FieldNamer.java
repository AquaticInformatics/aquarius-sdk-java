package com.aquaticinformatics.aquarius.sdk.samples;

import com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer;
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
        // So this boils down to lowercasing the first letter only
        String fieldName = field.getName();

        return fieldName.length() == 0
                ? fieldName
                : fieldName.substring(0, 1).toLowerCase() + fieldName.substring(1);
    }
}
