package com.ksc.krds.model.krdsBackup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class GetHistoryDatabaseInfoRequest extends BaseRequest<GetHistoryDatabaseInfoRequest> {

    private String DBInstanceIdentifier;
    private String DBBackupIdentifier;
    private String RestorableTime;

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

    public String getRestorableTime() {
        return RestorableTime;
    }

    public void setRestorableTime(String restorableTime) {
        RestorableTime = restorableTime;
    }
}
