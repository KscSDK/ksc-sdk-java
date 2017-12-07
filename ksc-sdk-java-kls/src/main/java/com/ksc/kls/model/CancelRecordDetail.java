package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/2.
 */
public class CancelRecordDetail {
    private int RecID;
    private int Retcode;
    private String RetMsg;

    public int getRecID() {
        return RecID;
    }

    public int getRetcode() {
        return Retcode;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRecID(int recID) {
        RecID = recID;
    }

    public void setRetcode(int retcode) {
        Retcode = retcode;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }
}
