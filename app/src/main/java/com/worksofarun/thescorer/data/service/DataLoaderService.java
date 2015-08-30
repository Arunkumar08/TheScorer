package com.worksofarun.thescorer.data.service;

import com.worksofarun.thescorer.data.datapojos.DataInput;
import com.worksofarun.thescorer.data.datapojos.DataOutput;
import com.worksofarun.thescorer.data.datapojos.DataPojo;


/**
 * Created by akumars on 8/25/2015.
 */
public interface DataLoaderService<I, O> {

    public DataPojo loadData(DataPojo<I, O> dataPojo);
}
