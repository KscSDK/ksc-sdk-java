package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/7/25.
 */
public class CheckBlacklisDetail {
    private int CheckResult;
    private int RetCode;
    private String RetMsg;

    public int getCheckResult() {
        return CheckResult;
    }

    public void setCheckResult(int checkResult) {
        CheckResult = checkResult;
    }

    public int getRetCode() {
        return RetCode;
    }

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }
}
