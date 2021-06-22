package com.ksc.krds.model.krdsInstance;

public class SwitchHARequest extends BaseRequest<SwitchHARequest>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
