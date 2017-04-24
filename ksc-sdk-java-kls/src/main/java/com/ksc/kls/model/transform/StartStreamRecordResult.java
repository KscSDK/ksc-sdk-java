package com.ksc.kls.model.transform;

/**
 * Created by yangfan on 2017/4/24.
 */
public class StartStreamRecordResult {
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

    public String getApp() {
        return App;
    }

    public String getPubdomain() {
        return Pubdomain;
    }

    public String getStream() {
        return Stream;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public int getRecID() {
        return RecID;
    }

    public int getRetCode() {
        return RetCode;
    }

    public void setUniqueName(String uniqueName) {
        UniqueName = uniqueName;
    }

    public void setApp(String app) {
        App = app;
    }

    public void setPubdomain(String pubdomain) {
        Pubdomain = pubdomain;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }

    public void setRecID(int recID) {
        RecID = recID;
    }

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }
}
