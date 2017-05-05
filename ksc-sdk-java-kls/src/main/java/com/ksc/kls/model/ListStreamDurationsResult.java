package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/4.
 */
public class ListStreamDurationsResult {
    private ListStreamDurations Data;
    private String RequestId;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public ListStreamDurations getData() {
        return Data;
    }

    public void setData(ListStreamDurations data) {
        Data = data;
    }
}
