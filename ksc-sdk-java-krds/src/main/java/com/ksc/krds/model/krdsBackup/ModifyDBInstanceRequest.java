package com.ksc.krds.model.krdsBackup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class ModifyDBInstanceRequest extends BaseRequest<ModifyDBInstanceRequest> {

    private String DBInstanceIdentifier;

    private String PreferredBackupTime;

    private String DBInstanceName;

    private String MasterUserPassword;

    private String DBParameterGroupId;

    private String SecurityGroupId;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getPreferredBackupTime() {
        return PreferredBackupTime;
    }

    public void setPreferredBackupTime(String preferredBackupTime) {
        PreferredBackupTime = preferredBackupTime;
    }

    public String getDBInstanceName() {
        return DBInstanceName;
    }

    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    public String getMasterUserPassword() {
        return MasterUserPassword;
    }

    public void setMasterUserPassword(String masterUserPassword) {
        MasterUserPassword = masterUserPassword;
    }

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }
}
