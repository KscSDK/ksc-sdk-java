package com.ksc.krds.model.database;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/***
 * @ClassName: CreateInstanceAccountActionRequest
 * @Description:TODO
 * @version : V1.0
 */
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
