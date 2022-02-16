package com.ksc.krds.model.database;

import java.util.List;

public class Account {

    private String InstanceAccountName;
    private String InstanceAccountDescription;
    private String Created;
    private String InstanceAccountType;
    private List<AccountPrivilege> InstanceAccountPrivileges;

    public String getInstanceAccountName() {
        return InstanceAccountName;
    }

    public void setInstanceAccountName(String instanceAccountName) {
        InstanceAccountName = instanceAccountName;
    }

    public String getInstanceAccountDescription() {
        return InstanceAccountDescription;
    }

    public void setInstanceAccountDescription(String instanceAccountDescription) {
        InstanceAccountDescription = instanceAccountDescription;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getInstanceAccountType() {
        return InstanceAccountType;
    }

    public void setInstanceAccountType(String instanceAccountType) {
        InstanceAccountType = instanceAccountType;
    }

    public List<AccountPrivilege> getInstanceAccountPrivileges() {
        return InstanceAccountPrivileges;
    }

    public void setInstanceAccountPrivileges(List<AccountPrivilege> instanceAccountPrivileges) {
        InstanceAccountPrivileges = instanceAccountPrivileges;
    }
}
