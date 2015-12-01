package com.thescorer.main.data.helpers;

import com.thescorer.main.data.service.impl.SportsTypeDataLoaderService;

/**
 * Created by akumars on 8/25/2015.
 */
public enum DataLoaderType {

    SPORTS_TYPE_LOADER("Sports Type Data loader", SportsTypeDataLoaderService.class),
    ;

    private String dataLoaderType;
    private Class dataLoaderServiceClass;

    private DataLoaderType(final String dataLoaderType, final Class dataLoaderServiceClass) {
        this.dataLoaderServiceClass = dataLoaderServiceClass;
        this.dataLoaderType = dataLoaderType;
    }

    public String getDataLoaderType() {
        return dataLoaderType;
    }

    public Class getDataLoaderServiceClass() {
        return dataLoaderServiceClass;
    }
}
