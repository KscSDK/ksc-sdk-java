package com.ksc.krds.model.account;

import com.ksc.krds.model.database.AccountPrivilege;
import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class CreateInstanceAccountActionRequest  extends BaseRequest<CreateInstanceAccountActionRequest> {
    private String DBInstanceIdentifier;
    private String InstanceAccountName;
    private String InstanceAccountPassword;
    private String InstanceAccountDescription;
    private List<AccountPrivilege> InstanceAccountPrivileges;

    public List<AccountPrivilege> getInstanceAccountPrivileges() {
        return InstanceAccountPrivileges;
    }

    public void setInstanceAccountPrivileges(List<AccountPrivilege> instanceAccountPrivileges) {
        InstanceAccountPrivileges = instanceAccountPrivileges;
    }

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

    public String getInstanceAccountPassword() {
        return InstanceAccountPassword;
    }

    public void setInstanceAccountPassword(String instanceAccountPassword) {
        InstanceAccountPassword = instanceAccountPassword;
    }

    public String getInstanceAccountDescription() {
        return InstanceAccountDescription;
    }

    public void setInstanceAccountDescription(String instanceAccountDescription) {
        InstanceAccountDescription = instanceAccountDescription;
    }

}
