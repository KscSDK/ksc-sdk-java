package com.ksc.krds.model.krdsBackup;

import java.util.List;

public class GetHistoryDatabaseInfoResponse {
    public List<Database> getDatabases() {
        return Databases;
    }

    public void setDatabases(List<Database> databases) {
        Databases = databases;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    private List<Database> Databases;
    private String RequestId;


    public static  class Database{
        public String getDatabaseName() {
            return DatabaseName;
        }

        public void setDatabaseName(String databaseName) {
            DatabaseName = databaseName;
        }


        private String DatabaseName;

        public String[] getTableNames() {
            return TableNames;
        }

        public void setTableNames(String[] tableNames) {
            TableNames = tableNames;
        }

        private String[] TableNames;

    }
}
