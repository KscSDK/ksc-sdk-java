package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/7/25.
 */
public class RelayStreamsInfo {
    public String pubtime;
    public String clientip;
    public String app;
    public String streamname;
    public int curfps;
    public int curbitrate;
    public float framelossrate;

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getStreamname() {
        return streamname;
    }

    public void setStreamname(String streamname) {
        this.streamname = streamname;
    }

    public int getCurfps() {
        return curfps;
    }

    public void setCurfps(int curfps) {
        this.curfps = curfps;
    }

    public int getCurbitrate() {
        return curbitrate;
    }

    public void setCurbitrate(int curbitrate) {
        this.curbitrate = curbitrate;
    }

    public float getFramelossrate() {
        return framelossrate;
    }

    public void setFramelossrate(float framelossrate) {
        this.framelossrate = framelossrate;
    }
}
