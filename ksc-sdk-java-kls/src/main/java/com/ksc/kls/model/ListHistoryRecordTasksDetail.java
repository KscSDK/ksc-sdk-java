package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/5/3.
 */
public class ListHistoryRecordTasksDetail {
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String RetMsg;
    private int Count;
    private int OrderTime;
    private int RetCode;
    private int Toatal;
    private List<RecordDetail> Recs;

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

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public int getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(int orderTime) {
        OrderTime = orderTime;
    }

    public int getRetCode() {
        return RetCode;
    }

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }

    public int getToatal() {
        return Toatal;
    }

    public void setToatal(int toatal) {
        Toatal = toatal;
    }

    public List<RecordDetail> getRecs() {
        return Recs;
    }

    public void setRecs(List<RecordDetail> recs) {
        Recs = recs;
    }
}
