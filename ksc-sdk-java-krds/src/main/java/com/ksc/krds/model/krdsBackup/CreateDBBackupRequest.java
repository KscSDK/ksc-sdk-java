package com.ksc.krds.model.krdsBackup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class CreateDBBackupRequest extends BaseRequest<CreateDBBackupRequest> {

    private String DBInstanceIdentifier;

    private String DBBackupName;

    private String Description;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBBackupName() {
        return DBBackupName;
    }

    public void setDBBackupName(String DBBackupName) {
        this.DBBackupName = DBBackupName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
