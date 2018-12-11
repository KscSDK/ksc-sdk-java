package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ListRelayErrInfoRequest extends KscWebServiceRequest {
    private String Action;
    private String Version;
    private String uniquename;
    private String app;
    private int marker;
    private int limit;
    private int starttime;
    private int duration;

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

    public int getStarttime() {
        return starttime;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
