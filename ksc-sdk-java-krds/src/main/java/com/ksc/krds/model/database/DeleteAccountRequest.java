package com.ksc.krds.model.database;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DeleteAccountRequest extends BaseRequest<DeleteAccountRequest> {

    private String InstanceAccountName;
    private String DBInstanceIdentifier;

    public String getInstanceAccountName() {
        return InstanceAccountName;
    }

    public void setInstanceAccountName(String instanceAccountName) {
        InstanceAccountName = instanceAccountName;
    }

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
