package com.ksc.kvs.model;

import java.util.List;

public class GetPlayInfoResult {
    private String RequestId;

    private VideoBase VideoBase;

    private List<PlayInfo> PlayInfoList;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public com.ksc.kvs.model.VideoBase getVideoBase() {
        return VideoBase;
    }

    public void setVideoBase(com.ksc.kvs.model.VideoBase videoBase) {
        VideoBase = videoBase;
    }

    public List<PlayInfo> getPlayInfoList() {
        return PlayInfoList;
    }

    public void setPlayInfoList(List<PlayInfo> playInfoList) {
        PlayInfoList = playInfoList;
    }
}
