package com.ksc.krds.model.krdsInstance;

public class ModifyDBInstanceSpecRequest extends BaseRequest<ModifyDBInstanceSpecRequest>{

    private String DBInstanceIdentifier;

    private String DBInstanceClass;

    private Boolean OrderOnly;


    private Integer Mem;
    private Integer Disk;
    public Integer getMem() {
        return Mem;
    }

    public void setMem(Integer mem) {
        Mem = mem;
    }

    public Integer getDisk() {
        return Disk;
    }

    public void setDisk(Integer disk) {
        Disk = disk;
    }

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
