package com.ksc.krds.model.krdsBackup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class GetTableRestorableTimeRequest extends BaseRequest<GetTableRestorableTimeRequest> {

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
