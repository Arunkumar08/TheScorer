package com.thescorer.main.data.service;

import com.thescorer.main.data.datapojos.DataPojo;


/**
 * Created by akumars on 8/25/2015.
 */
public interface DataLoaderService<I, O> {

    public DataPojo loadData(DataPojo<I, O> dataPojo);
}
