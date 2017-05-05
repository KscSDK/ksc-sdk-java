package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/4/24.
 */
public class GetRecordTaskRequest {
    private int RecID;
    private String Action;
    private String Version;

    public int getRecID() {
        return RecID;
    }

    public String getAction() {
        return Action;
    }

    public String getVersion() {
        return Version;
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

