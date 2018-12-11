package com.ksc.kvs.model;


public class PlayInfo {
    private String Format;

    private String PlayURL;

    private Long Duration;

    private Float Size;

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getPlayURL() {
        return PlayURL;
    }

    public void setPlayURL(String playURL) {
        PlayURL = playURL;
    }

    public Long getDuration() {
        return Duration;
    }

    public void setDuration(Long duration) {
        Duration = duration;
    }

    public Float getSize() {
        return Size;
    }

    public void setSize(Float size) {
        Size = size;
    }
}
