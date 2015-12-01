package com.thescorer.main.data.service.impl;


import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by akumars on 7/22/2015.
 */
public class JsonFileLoaderService<T> {

    final ObjectMapper mapper = new ObjectMapper();

    /**
     * To read the json file and convert to JAVA pojo object
     * @param filePath
     * @param pojoClass
     * @return
     */
    public T loadFileToPojo(final String filePath,
                            final Class<T> pojoClass) throws IOException {
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        final File sportsInfoFile = new File(filePath);
        FileInputStream inputStream = new FileInputStream(sportsInfoFile);
        return loadFileToPojo(inputStream, pojoClass);
    }

    /**
     * To read the json file and convert to JAVA pojo object
     * @param pojoClass
     * @return
     */
    public T loadFileToPojo(final InputStream inputStream,
                            final Class<T> pojoClass) throws IOException {
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        T pojo = mapper.readValue(inputStream, pojoClass);
        return pojo;
    }
}

