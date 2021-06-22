package com.ksc.krds.model.database;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DeleteDatabaseRequest extends BaseRequest<DeleteDatabaseRequest> {

    private String InstanceDatabaseName;
    private String DBInstanceIdentifier;

    public String getInstanceDatabaseName() {
        return InstanceDatabaseName;
    }

    public void setInstanceDatabaseName(String instanceDatabaseName) {
        InstanceDatabaseName = instanceDatabaseName;
    }

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
