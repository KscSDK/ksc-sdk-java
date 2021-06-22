package com.ksc.krds.model.krdsInstance;

public class ReleaseDBInstanceEipRequest extends BaseRequest<ReleaseDBInstanceEipRequest>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
