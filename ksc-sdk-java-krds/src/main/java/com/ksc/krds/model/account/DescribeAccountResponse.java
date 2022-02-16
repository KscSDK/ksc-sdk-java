package com.ksc.krds.model.account;

public class DescribeAccountResponse {

    private String Host;
    private String User;

    public Privileges Privileges;

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public com.ksc.krds.model.account.Privileges getPrivileges() {
        return Privileges;
    }

    public void setPrivileges(com.ksc.krds.model.account.Privileges privileges) {
        Privileges = privileges;
    }
}
