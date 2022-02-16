package com.ksc.krds.model.database;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DescribeDatabaseRequest extends BaseRequest<DescribeDatabaseRequest> {

    private String DBInstanceIdentifier;
    private String Keyword;
    private String InstanceDatabaseName;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public String getInstanceDatabaseName() {
        return InstanceDatabaseName;
    }

    public void setInstanceDatabaseName(String instanceDatabaseName) {
        InstanceDatabaseName = instanceDatabaseName;
    }
}
