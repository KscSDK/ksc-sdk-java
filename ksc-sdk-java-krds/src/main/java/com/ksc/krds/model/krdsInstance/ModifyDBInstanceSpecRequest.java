package com.ksc.krds.model.krdsInstance;

public class ModifyDBInstanceSpecRequest extends BaseRequest<ModifyDBInstanceSpecRequest>{

    private String DBInstanceIdentifier;

    private String DBInstanceClass;

    private Boolean OrderOnly = false;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    public Boolean getOrderOnly() {
        return OrderOnly;
    }

    public void setOrderOnly(Boolean orderOnly) {
        OrderOnly = orderOnly;
    }
}
