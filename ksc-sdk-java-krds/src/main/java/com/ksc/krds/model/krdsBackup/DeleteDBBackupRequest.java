package com.ksc.krds.model.krdsBackup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DeleteDBBackupRequest extends BaseRequest<DeleteDBBackupRequest> {

    private String DBBackupIdentifier;

    public String getDBBackupIdentifier() {
        return DBBackupIdentifier;
    }

    public void setDBBackupIdentifier(String DBBackupIdentifier) {
        this.DBBackupIdentifier = DBBackupIdentifier;
    }
}
