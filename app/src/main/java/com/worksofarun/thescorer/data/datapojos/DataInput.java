package com.worksofarun.thescorer.data.datapojos;

import com.worksofarun.thescorer.data.helpers.DatabaseName;

/**
 * Created by akumars on 8/27/2015.
 */
public class DataInput {

    private Boolean loadFromJson;
    private Boolean loadFromDatabase;
    private String jsonFilePath;
    private DatabaseName dbName;

    public Boolean getLoadFromJson() {
        return loadFromJson;
    }

    public void setLoadFromJson(Boolean loadFromJson) {
        this.loadFromJson = loadFromJson;
    }

    public Boolean getLoadFromDatabase() {
        return loadFromDatabase;
    }

    public void setLoadFromDatabase(Boolean loadFromDatabase) {
        this.loadFromDatabase = loadFromDatabase;
    }

    public String getJsonFilePath() {
        return jsonFilePath;
    }

    public void setJsonFilePath(String jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
    }

    public DatabaseName getDbName() {
        return dbName;
    }

    public void setDbName(DatabaseName dbName) {
        this.dbName = dbName;
    }
}
