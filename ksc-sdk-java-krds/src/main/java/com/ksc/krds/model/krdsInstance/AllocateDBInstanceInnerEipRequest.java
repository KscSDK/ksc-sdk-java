package com.ksc.krds.model.krdsInstance;

public class AllocateDBInstanceInnerEipRequest extends BaseRequest<AllocateDBInstanceInnerEipRequest>{
    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
