package com.ksc.krds.model.account;

import com.ksc.krds.model.RdsResponse;

public class ListAccountSupportPrivilegesResponse extends RdsResponse {

    public SupportPrivileges SupportPrivileges;

    public com.ksc.krds.model.account.SupportPrivileges getSupportPrivileges() {
        return SupportPrivileges;
    }

    public void setSupportPrivileges(com.ksc.krds.model.account.SupportPrivileges supportPrivileges) {
        SupportPrivileges = supportPrivileges;
    }
}
