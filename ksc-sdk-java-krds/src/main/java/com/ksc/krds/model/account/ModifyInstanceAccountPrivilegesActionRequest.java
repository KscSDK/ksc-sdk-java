package com.ksc.krds.model.account;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class ModifyInstanceAccountPrivilegesActionRequest extends BaseRequest<ModifyInstanceAccountPrivilegesActionRequest> {


    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getInstanceAccountName() {
        return InstanceAccountName;
    }

    public void setInstanceAccountName(String instanceAccountName) {
        InstanceAccountName = instanceAccountName;
    }

    public List<InstanceAccountPrivilege> getInstanceAccountPrivileges() {
        return InstanceAccountPrivileges;
    }

    public void setInstanceAccountPrivileges(List<InstanceAccountPrivilege> instanceAccountPrivileges) {
        InstanceAccountPrivileges = instanceAccountPrivileges;
    }

    private String DBInstanceIdentifier;
    private String InstanceAccountName;

    private List<InstanceAccountPrivilege> InstanceAccountPrivileges;


}
