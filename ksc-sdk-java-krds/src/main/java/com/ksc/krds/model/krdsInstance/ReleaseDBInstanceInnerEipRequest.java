package com.ksc.krds.model.krdsInstance;

public class ReleaseDBInstanceInnerEipRequest extends BaseRequest<ReleaseDBInstanceInnerEipRequest>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
