package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ForbidStreamRequest extends KscWebServiceRequest {
    private String Action;
    private String Version;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private int ForbidTillUnixTime;

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    @Override
    public String getVersion() {
        return Version;
    }

    @Override
    public void setVersion(String version) {
        Version = version;
    }

    public String getUniqueName() {
        return UniqueName;
    }

    public void setUniqueName(String uniqueName) {
        UniqueName = uniqueName;
    }

    public String getApp() {
        return App;
    }

    public void setApp(String app) {
        App = app;
    }

    public String getPubdomain() {
        return Pubdomain;
    }

    public void setPubdomain(String pubdomain) {
        Pubdomain = pubdomain;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public int getForbidTillUnixTime() {
        return ForbidTillUnixTime;
    }

    public void setForbidTillUnixTime(int forbidTillUnixTime) {
        ForbidTillUnixTime = forbidTillUnixTime;
    }
}
