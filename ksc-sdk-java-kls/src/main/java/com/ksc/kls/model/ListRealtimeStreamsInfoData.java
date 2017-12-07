package com.ksc.kls.model;

import java.util.List;

public class ListRealtimeStreamsInfoData {
    private String UniqueName;
    private String App;
    private Long Bw;
    private Long OnlineUser;
    private int Count;
    private List<ThirdStreamsInfoDetail> Streams;
    private int RetCode;
    private String RetMsg;

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

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public Long getOnlineUser() {
        return OnlineUser;
    }

    public void setOnlineUser(Long onlineUser) {
        OnlineUser = onlineUser;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public List<ThirdStreamsInfoDetail> getStreams() {
        return Streams;
    }

    public void setStreams(List<ThirdStreamsInfoDetail> streams) {
        Streams = streams;
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
