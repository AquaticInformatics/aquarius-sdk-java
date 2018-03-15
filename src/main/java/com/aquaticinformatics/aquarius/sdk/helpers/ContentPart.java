package com.aquaticinformatics.aquarius.sdk.helpers;

public class ContentPart {

    private final String _fieldName;
    private final String _fieldValue;
    private final String _mimeType;

    public ContentPart(String fieldName, String fieldValue) {
        _fieldName = fieldName;
        _fieldValue = fieldValue;
        _mimeType = null;
    }

    public ContentPart(String fieldName, String fieldValue, String mimeType) {
        _fieldName = fieldName;
        _fieldValue = fieldValue;
        _mimeType = mimeType;
    }

    public String getFieldName() {
        return _fieldName;
    }

    public String getFieldValue() {
        return _fieldValue;
    }

    public String getMimeType() {
        return _mimeType;
    }
}
