package com.ksc.krds.model.account;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DeleteInstanceAccountActionRequest extends BaseRequest<DeleteInstanceAccountActionRequest> {

    private String InstanceAccountName;

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

    private String DBInstanceIdentifier;
}
