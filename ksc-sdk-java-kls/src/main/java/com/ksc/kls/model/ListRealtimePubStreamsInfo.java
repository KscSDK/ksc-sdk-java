package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/5/22.
 */
public class ListRealtimePubStreamsInfo {
    private String App;
    private String Pubdomain;
    private String RetMsg;
    private String UniqueName;
    private int Count;
    private int Marker;
    private int OrderTime;
    private int RetCode;
    private int Total;
    private List<StreamInfo> Result;

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

    public String getUniqueName() {
        return UniqueName;
    }

    public void setUniqueName(String uniqueName) {
        UniqueName = uniqueName;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public int getMarker() {
        return Marker;
    }

    public void setMarker(int marker) {
        Marker = marker;
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

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public List<StreamInfo> getResult() {
        return Result;
    }

    public void setResult(List<StreamInfo> result) {
        Result = result;
    }
}
