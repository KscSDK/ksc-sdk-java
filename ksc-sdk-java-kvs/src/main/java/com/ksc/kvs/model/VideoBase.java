package com.ksc.kvs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class VideoBase {
    private Long VideoId;

    private String VideoTitle;

    private Long CreateTime;

    public Long getVideoId() {
        return VideoId;
    }

    public void setVideoId(Long videoId) {
        VideoId = videoId;
    }

    public Long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Long createTime) {
        CreateTime = createTime;
    }

    public String getVideoTitle() {
        return VideoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        VideoTitle = videoTitle;
    }
}
