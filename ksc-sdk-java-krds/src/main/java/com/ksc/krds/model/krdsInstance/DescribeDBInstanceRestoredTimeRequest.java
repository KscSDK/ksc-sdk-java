package com.ksc.krds.model.krdsInstance;

public class DescribeDBInstanceRestoredTimeRequest extends BaseRequest<DescribeDBInstanceRestoredTimeRequest>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
