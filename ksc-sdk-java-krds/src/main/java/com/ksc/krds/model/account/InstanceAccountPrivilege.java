package com.ksc.krds.model.account;

public class InstanceAccountPrivilege {

    private String InstanceDatabaseName;
    private String Privilege;

    public InstanceAccountPrivilege(String instanceDatabaseName, String privilege) {
        InstanceDatabaseName = instanceDatabaseName;
        Privilege = privilege;
    }

    public InstanceAccountPrivilege() {
    }

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
