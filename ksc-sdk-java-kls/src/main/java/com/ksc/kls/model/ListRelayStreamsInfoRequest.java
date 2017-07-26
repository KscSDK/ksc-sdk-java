package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ListRelayStreamsInfoRequest  extends KscWebServiceRequest {
    private String Action;
    private String Version;
    private String uniquename;
    private String app;
    private int marker;
    private int limit;

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

    public String getUniquename() {
        return uniquename;
    }

    public void setUniquename(String uniquename) {
        this.uniquename = uniquename;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public int getMarker() {
        return marker;
    }

    public void setMarker(int marker) {
        this.marker = marker;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
