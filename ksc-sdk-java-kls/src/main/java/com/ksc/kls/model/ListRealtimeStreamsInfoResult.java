package com.ksc.kls.model;

public class ListRealtimeStreamsInfoResult {
    private  ListRealtimeStreamsInfoData Data;
    private String RequestId;

    public ListRealtimeStreamsInfoData getData() {
        return Data;
    }

    public void setData(ListRealtimeStreamsInfoData data) {
        Data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }
}
