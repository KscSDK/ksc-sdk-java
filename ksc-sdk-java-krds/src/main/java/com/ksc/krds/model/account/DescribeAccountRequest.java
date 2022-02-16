package com.ksc.krds.model.account;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DescribeAccountRequest extends BaseRequest<DescribeAccountRequest> {

    private String DBInstanceIdentifier;

    private String User;

    private String Host;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }
}
