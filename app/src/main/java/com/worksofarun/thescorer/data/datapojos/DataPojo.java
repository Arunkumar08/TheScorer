package com.worksofarun.thescorer.data.datapojos;

import com.worksofarun.thescorer.data.helpers.DataLoaderType;

/**
 * Created by akumars on 8/25/2015.
 */
public class DataPojo<I,O> {

    private DataLoaderType loaderType;
    private I dataInput;
    private O dataOutput;

    public DataLoaderType getLoaderType() {
        return loaderType;
    }

    public void setLoaderType(DataLoaderType loaderType) {
        this.loaderType = loaderType;
    }

    public I getDataInput() {
        return dataInput;
    }

    public void setDataInput(I dataInput) {
        this.dataInput = dataInput;
    }

    public O getDataOutput() {
        return dataOutput;
    }

    public void setDataOutput(O dataOutput) {
        this.dataOutput = dataOutput;
    }
}
