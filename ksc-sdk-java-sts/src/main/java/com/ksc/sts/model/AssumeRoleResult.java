package com.ksc.sts.model;

import java.io.Serializable;

public class AssumeRoleResult implements Serializable, Cloneable {

    private static final long serialVersionUID = 2180023473308694096L;

    private Credentials credentials;

    private AssumeRoleUser assumeRoleUser;

    private String RequestId;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public AssumeRoleUser getAssumeRoleUser() {
        return assumeRoleUser;
    }

    public void setAssumeRoleUser(AssumeRoleUser assumeRoleUser) {
        this.assumeRoleUser = assumeRoleUser;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    @Override
    public String toString() {
        return "AssumeRoleResult [credentials=" + credentials
                + ", assumeRoleUser=" + assumeRoleUser + ", RequestId="
                + RequestId + "]";
    }
}
