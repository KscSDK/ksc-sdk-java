package com.ksc.krds.model.krdsInstance;

public class LockDBInstanceRequest extends BaseRequest<LockDBInstanceRequest>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
