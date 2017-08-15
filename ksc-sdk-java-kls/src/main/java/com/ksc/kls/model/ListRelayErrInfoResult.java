package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ListRelayErrInfoResult {
    private int count;
    private int duration;
    private int errno;
    private String errmsg;
    private List<ListRelayErrInfo> result;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public List<ListRelayErrInfo> getResult() {
        return result;
    }

    public void setResult(List<ListRelayErrInfo> result) {
        this.result = result;
    }
}
