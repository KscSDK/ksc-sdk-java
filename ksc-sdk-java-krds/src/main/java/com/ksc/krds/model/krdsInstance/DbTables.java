package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class DbTables {

    private String DatabaseName;
    private String WholeDatabase; // True False
    private List<String> TableNames;

    public String getDatabaseName() {
        return DatabaseName;
    }

    public void setDatabaseName(String databaseName) {
        DatabaseName = databaseName;
    }

    public String getWholeDatabase() {
        return WholeDatabase;
    }

    public void setWholeDatabase(String wholeDatabase) {
        WholeDatabase = wholeDatabase;
    }

    public List<String> getTableNames() {
        return TableNames;
    }

    public void setTableNames(List<String> tableNames) {
        TableNames = tableNames;
    }
}
