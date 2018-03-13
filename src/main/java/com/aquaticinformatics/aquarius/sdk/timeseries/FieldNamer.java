package com.aquaticinformatics.aquarius.sdk.timeseries;

import com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;

public class FieldNamer implements IFieldNamer {
    @Override
    public void configure(GsonBuilder gsonBuilder) {
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
    }
}
