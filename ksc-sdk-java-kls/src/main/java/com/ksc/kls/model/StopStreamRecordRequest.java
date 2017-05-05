package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/4/24.
 */
public class StopStreamRecordRequest {
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private int RecID;
    private String Action;
    private String Version;

    public String getUniqueName() {
        return UniqueName;
    }

    public String getApp() {
        return App;
    }

    public String getAction() {
        return Action;
    }

    public String getVersion() {
        return Version;
    }

    public String getPubdomain() {
        return Pubdomain;
    }

    public String getStream() {
        return Stream;
    }

    public int getRecID() {
        return RecID;
    }

    public void setUniqueName(String uniqueName) {
        UniqueName = uniqueName;
    }

    public void setApp(String app) {
        App = app;
    }

    public void setPubdomain(String pubdomain) {
        Pubdomain = pubdomain;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public void setRecID(int recID) {
        RecID = recID;
    }

    public void setAction(String action) {
        Action = action;
    }

    public void setVersion(String version) {
        Version = version;
    }
}
