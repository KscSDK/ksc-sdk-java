package com.ksc.krds.model.krdsInstance;

public class UnLockDBInstanceRequest extends BaseRequest<UnLockDBInstanceRequest> {

    private String DBInstanceIdentifier;


    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
