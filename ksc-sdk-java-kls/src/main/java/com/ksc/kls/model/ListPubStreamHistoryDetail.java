package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/5/22.
 */
public class ListPubStreamHistoryDetail {
    private int RetCode;
    private String RetMsg;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private int StartUnixTime;
    private int EndUnixtime;
    private int OrderTime;
    private int Marker;
    private int Count;
    private int Total;
    private List<PubStreamHistoryDetail> Result;

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

    public int getStartUnixTime() {
        return StartUnixTime;
    }

    public void setStartUnixTime(int startUnixTime) {
        StartUnixTime = startUnixTime;
    }

    public int getEndUnixtime() {
        return EndUnixtime;
    }

    public void setEndUnixtime(int endUnixtime) {
        EndUnixtime = endUnixtime;
    }

    public int getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(int orderTime) {
        OrderTime = orderTime;
    }

    public int getMarker() {
        return Marker;
    }

    public void setMarker(int marker) {
        Marker = marker;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public List<PubStreamHistoryDetail> getResult() {
        return Result;
    }

    public void setResult(List<PubStreamHistoryDetail> result) {
        Result = result;
    }
}
