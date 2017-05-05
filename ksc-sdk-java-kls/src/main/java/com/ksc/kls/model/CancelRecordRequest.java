package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CancelRecordRequest {
    private String Action;
    private String Version;
    private int RecID;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;

    public String getAction() {
        return Action;
    }

    public String getVersion() {
        return Version;
    }

    public int getRecID() {
        return RecID;
    }

    public String getUniqueName() {
        return UniqueName;
    }

    public String getApp() {
        return App;
    }

    public String getPubdomain() {
        return Pubdomain;
    }

    public String getStream() {
        return Stream;
    }

    public void setAction(String action) {
        Action = action;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public void setRecID(int recID) {
        RecID = recID;
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
}
