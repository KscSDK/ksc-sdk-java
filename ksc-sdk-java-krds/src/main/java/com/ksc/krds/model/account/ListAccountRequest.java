package com.ksc.krds.model.account;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class ListAccountRequest extends BaseRequest<ListAccountRequest> {

    private String DBInstanceIdentifier;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
