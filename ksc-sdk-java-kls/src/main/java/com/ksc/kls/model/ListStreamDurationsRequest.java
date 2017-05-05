package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/4.
 */
public class ListStreamDurationsRequest {
    private String Action;
    private String Version;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private int StartUnixTime;
    private int EndUnixTime;

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getVersion() {
        return Version;
    }

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

    public int getStartUnixTime() {
        return StartUnixTime;
    }

    public void setStartUnixTime(int startUnixTime) {
        StartUnixTime = startUnixTime;
    }

    public int getEndUnixTime() {
        return EndUnixTime;
    }

    public void setEndUnixTime(int endUnixTime) {
        EndUnixTime = endUnixTime;
    }
}
