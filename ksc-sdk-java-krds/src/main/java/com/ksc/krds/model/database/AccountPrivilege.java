package com.ksc.krds.model.database;

public class AccountPrivilege {

    private String InstanceDatabaseName;
    private String Privilege;

    public String getInstanceDatabaseName() {
        return InstanceDatabaseName;
    }

    public void setInstanceDatabaseName(String instanceDatabaseName) {
        InstanceDatabaseName = instanceDatabaseName;
    }

    public String getPrivilege() {
        return Privilege;
    }

    public void setPrivilege(String privilege) {
        Privilege = privilege;
    }
}
