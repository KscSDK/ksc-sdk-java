package com.ksc.krds.model.krdsInstance;

public class GenerateDBAdminURLRequest extends BaseRequest<GenerateDBAdminURLRequest>{

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
