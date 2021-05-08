package com.ksc.krds.model.krdsInstance;

public class LockDBInstanceRequest extends BaseRequest<LockDBInstanceRequest>{

    private String DBInstanceIdentifier;

    @Override
    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    @Override
    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
