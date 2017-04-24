package com.ksc.kls.model.transform;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CancelRecordResult {
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
