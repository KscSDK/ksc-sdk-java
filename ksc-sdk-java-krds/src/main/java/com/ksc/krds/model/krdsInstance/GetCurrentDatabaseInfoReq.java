package com.ksc.krds.model.krdsInstance;

public class GetCurrentDatabaseInfoReq extends BaseRequest<GetCurrentDatabaseInfoReq>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
