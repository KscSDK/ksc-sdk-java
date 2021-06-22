package com.ksc.krds.model.krdsInstance;

public class OverrideDBInstanceRequest extends BaseRequest<OverrideDBInstanceRequest>{

    private String DBInstanceIdentifier;

    private String DBBackupIdentifier;

    private String BackupName;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBBackupIdentifier() {
        return DBBackupIdentifier;
    }

    public void setDBBackupIdentifier(String DBBackupIdentifier) {
        this.DBBackupIdentifier = DBBackupIdentifier;
    }

    public String getBackupName() {
        return BackupName;
    }

    public void setBackupName(String backupName) {
        BackupName = backupName;
    }
}
