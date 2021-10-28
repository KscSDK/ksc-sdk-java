package com.ksc.krds.model.database;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ksc.krds.model.krdsInstance.RetInstance;

import java.util.List;
import java.util.Map;

/***
 * @ClassName: DescribeInstanceAccountsResponse
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeInstanceAccountsResponse {

    public List<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(List<Account> accounts) {
        Accounts = accounts;
    }

    private List<Account> Accounts;

}
