package com.ksc.krds.model.database;

public class DatabasePrivilege {
    private String InstanceAccountName;
    private MysqlPrivilegeMap.FrontPrivilege Privilege;

    public String getInstanceAccountName() {
        return InstanceAccountName;
    }

    public void setInstanceAccountName(String instanceAccountName) {
        InstanceAccountName = instanceAccountName;
    }

    public MysqlPrivilegeMap.FrontPrivilege getPrivilege() {
        return Privilege;
    }

    public void setPrivilege(MysqlPrivilegeMap.FrontPrivilege privilege) {
        Privilege = privilege;
    }
}
