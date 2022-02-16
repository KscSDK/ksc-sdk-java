package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class GetCurrentDatabaseInfoResponse {

    private List<DbTables> Databases;

    public List<DbTables> getDatabases() {
        return Databases;
    }

    public void setDatabases(List<DbTables> databases) {
        Databases = databases;
    }
}
