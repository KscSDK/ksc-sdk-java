package com.ksc.krds.model.audit;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class StartAuditRequest extends BaseRequest<StartAuditRequest> {

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
