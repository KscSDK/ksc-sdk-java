package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ListRelayErrInfoDetail {
    private String clientip;
    private int errcode;
    private String pubdomain;
    private int time;

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getPubdomain() {
        return pubdomain;
    }

    public void setPubdomain(String pubdomain) {
        this.pubdomain = pubdomain;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
