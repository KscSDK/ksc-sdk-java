package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/4.
 */
public class StreamDurationsDetail {
    private int Duration;
    private int StartTime;
    private int EndTime;
    private String Stream;

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public int getStartTime() {
        return StartTime;
    }

    public void setStartTime(int startTime) {
        StartTime = startTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public void setEndTime(int endTime) {
        EndTime = endTime;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }
}
