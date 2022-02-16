package com.ksc.krds.model.database;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DescribeAccountRequest extends BaseRequest<DescribeAccountRequest> {

    private String DBInstanceIdentifier;
    private String Keyword;
    private String InstanceAccountName;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public String getInstanceAccountName() {
        return InstanceAccountName;
    }

    public void setInstanceAccountName(String instanceAccountName) {
        InstanceAccountName = instanceAccountName;
    }
}
