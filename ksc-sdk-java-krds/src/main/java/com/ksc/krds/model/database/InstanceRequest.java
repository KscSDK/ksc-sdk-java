package com.ksc.krds.model.database;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class InstanceRequest extends BaseRequest<InstanceRequest> {

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
