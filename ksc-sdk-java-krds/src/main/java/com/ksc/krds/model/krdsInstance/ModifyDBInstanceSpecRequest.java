package com.ksc.krds.model.krdsInstance;

public class ModifyDBInstanceSpecRequest extends BaseRequest<ModifyDBInstanceSpecRequest>{

    private String DBInstanceClass;

    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }
}
