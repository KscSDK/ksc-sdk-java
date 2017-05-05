package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/5/4.
 */
public class ListStreamDurations {
    private int RetCode;
    private String RetMsg;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private int Count;
    private List<StreamDurationsDetail> Result;

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

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public List<StreamDurationsDetail> getResult() {
        return Result;
    }

    public void setResult(List<StreamDurationsDetail> result) {
        Result = result;
    }
}
