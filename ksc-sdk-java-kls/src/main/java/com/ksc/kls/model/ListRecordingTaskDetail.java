package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/5/3.
 */
public class ListRecordingTaskDetail {
    private String App;
    private  int   Count;
    private String Pubdomain;
    private  int   OrderTime;
    private String UNiqueName;
    private String RetMsg;
    private int Total;
    private int RetCode;
    private List<RecordingTaskDetail> Recs;

    public String getApp() {
        return App;
    }

    public void setApp(String app) {
        App = app;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public String getPubdomain() {
        return Pubdomain;
    }

    public void setPubdomain(String pubdomain) {
        Pubdomain = pubdomain;
    }

    public int getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(int orderTime) {
        OrderTime = orderTime;
    }

    public String getUNiqueName() {
        return UNiqueName;
    }

    public void setUNiqueName(String UNiqueName) {
        this.UNiqueName = UNiqueName;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getRetCode() {
        return RetCode;
    }

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }

    public List<RecordingTaskDetail> getRecs() {
        return Recs;
    }

    public void setRecs(List<RecordingTaskDetail> recs) {
        Recs = recs;
    }
}
