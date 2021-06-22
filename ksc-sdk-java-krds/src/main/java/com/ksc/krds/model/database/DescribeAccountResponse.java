package com.ksc.krds.model.database;

import java.util.List;

public class DescribeAccountResponse {

    private List<Account> Accounts;

    public List<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(List<Account> accounts) {
        Accounts = accounts;
    }
}
