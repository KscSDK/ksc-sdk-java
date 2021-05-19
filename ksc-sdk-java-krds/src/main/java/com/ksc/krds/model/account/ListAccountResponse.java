package com.ksc.krds.model.account;

import java.util.List;

public class ListAccountResponse {

    private List<Account> Account;
    private String DBInstanceIdentifier;

    public List<com.ksc.krds.model.account.Account> getAccount() {
        return Account;
    }

    public void setAccount(List<com.ksc.krds.model.account.Account> account) {
        Account = account;
    }

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}
