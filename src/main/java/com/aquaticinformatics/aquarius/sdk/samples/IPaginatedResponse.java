package com.aquaticinformatics.aquarius.sdk.samples;

import java.util.List;

public interface IPaginatedResponse<TDomainObject> {
    Integer getTotalCount();
    String getCursor();
    List<TDomainObject> getDomainObjects();
}
