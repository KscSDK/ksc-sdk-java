package com.ksc.krds.model.krdsInstance;

public class AllocateDBInstanceEipRequest extends BaseRequest<AllocateDBInstanceEipRequest>{

    private String DBInstanceIdentifier;

    private Integer Port;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }
}
