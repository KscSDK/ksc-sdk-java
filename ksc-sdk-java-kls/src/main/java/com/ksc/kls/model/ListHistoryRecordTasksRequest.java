package com.ksc.kls.model;


/**
 * Created by yangfan on 2017/4/24.
 */
public class ListHistoryRecordTasksRequest {

    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private int RecType;
    private int Limit;
    private int Marker;
    private int OrderTime;
    private int StartUnixTime;
    private int EndUnixTime;
    private String Action;
    private String Version;

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

    public int getRecType() {
        return RecType;
    }

    public int getLimit() {
        return Limit;
    }

    public int getMarker() {
        return Marker;
    }

    public int getOrderTime() {
        return OrderTime;
    }

    public int getStartUnixTime() {
        return StartUnixTime;
    }

    public int getEndUnixTime() {
        return EndUnixTime;
    }

    public String getAction() {
        return Action;
    }

    public String getVersion() {
        return Version;
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

    public void setRecType(int recType) {
        RecType = recType;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public void setMarker(int marker) {
        Marker = marker;
    }

    public void setOrderTime(int orderTime) {
        OrderTime = orderTime;
    }

    public void setStartUnixTime(int startUnixTime) {
        StartUnixTime = startUnixTime;
    }

    public void setEndUnixTime(int endUnixTime) {
        EndUnixTime = endUnixTime;
    }

    public void setAction(String action) {
        Action = action;
    }

    public void setVersion(String version) {
        Version = version;
    }
}

