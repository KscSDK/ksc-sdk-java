package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ListBlacklist {
    private String Stream;
    private int ForbidUnixTime;
    private int ForbidTillUnixTime;

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public int getForbidUnixTime() {
        return ForbidUnixTime;
    }

    public void setForbidUnixTime(int forbidUnixTime) {
        ForbidUnixTime = forbidUnixTime;
    }

    public int getForbidTillUnixTime() {
        return ForbidTillUnixTime;
    }

    public void setForbidTillUnixTime(int forbidTillUnixTime) {
        ForbidTillUnixTime = forbidTillUnixTime;
    }
}
