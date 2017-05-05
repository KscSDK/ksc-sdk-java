package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/3.
 */
public class StartStreamRecordDetail {
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private String RetMsg;
    private int RecID;
    private int RetCode;

    public String getUniqueName() {
        return UniqueName;
    }

    public void setUniqueName(String uniqueName) {
        UniqueName = uniqueName;
    }

    public String getApp() {
        return App;
    }

    public void setApp(String app) {
        App = app;
    }

    public String getPubdomain() {
        return Pubdomain;
    }

    public void setPubdomain(String pubdomain) {
        Pubdomain = pubdomain;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }

    public int getRecID() {
        return RecID;
    }

    public void setRecID(int recID) {
        RecID = recID;
    }

    public int getRetCode() {
        return RetCode;
    }

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }
}
