package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/7/25.
 */
public class GetBlacklistResult {
    private  GetBlacklistDetail Data;
    private String RequestId;

    public GetBlacklistDetail getData() {
        return Data;
    }

    public void setData(GetBlacklistDetail data) {
        Data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }
}
