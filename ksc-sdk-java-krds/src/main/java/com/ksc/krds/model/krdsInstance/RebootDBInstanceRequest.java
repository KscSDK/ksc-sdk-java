package com.ksc.krds.model.krdsInstance;

public class RebootDBInstanceRequest extends BaseRequest<RebootDBInstanceRequest>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
