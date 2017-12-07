package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ListRelayErrInfo {
    private String app;
    private String pubtime;
    private String stoptime;
    private String streamname;
    private List<ListRelayErrInfoDetail> detail;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }

    public String getStreamname() {
        return streamname;
    }

    public void setStreamname(String streamname) {
        this.streamname = streamname;
    }

    public List<ListRelayErrInfoDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<ListRelayErrInfoDetail> detail) {
        this.detail = detail;
    }
}
