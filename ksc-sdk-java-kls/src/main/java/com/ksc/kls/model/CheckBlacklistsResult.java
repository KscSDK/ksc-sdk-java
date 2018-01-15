package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/7/25.
 */
public class CheckBlacklistsResult {
    private  CheckBlacklisDetail Data;
    private String RequestId;

    public CheckBlacklisDetail getData() {
        return Data;
    }

    public void setData(CheckBlacklisDetail data) {
        Data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }
}
