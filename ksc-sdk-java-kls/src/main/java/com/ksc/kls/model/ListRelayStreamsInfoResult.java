package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ListRelayStreamsInfoResult {
    private  int errno;
    private String errmsg;
    private int count;
    private List<RelayStreamsInfo> result;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<RelayStreamsInfo> getResult() {
        return result;
    }

    public void setResult(List<RelayStreamsInfo> result) {
        this.result = result;
    }
}
