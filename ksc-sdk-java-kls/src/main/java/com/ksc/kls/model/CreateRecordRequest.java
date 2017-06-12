package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CreateRecordRequest  extends KscWebServiceRequest {
    private String Action;
    private String Version;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private int Mp4VodEnable;
    private String Ks3FileNameM3U8;
    private String Ks3FullPathMP4;
    private int StartUnixTime;
    private int EndUnixTime;

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

    public int getMp4VodEnable() {
        return Mp4VodEnable;
    }

    public void setMp4VodEnable(int mp4VodEnable) {
        Mp4VodEnable = mp4VodEnable;
    }

    public String getKs3FileNameM3U8() {
        return Ks3FileNameM3U8;
    }

    public void setKs3FileNameM3U8(String ks3FileNameM3U8) {
        Ks3FileNameM3U8 = ks3FileNameM3U8;
    }

    public String getKs3FullPathMP4() {
        return Ks3FullPathMP4;
    }

    public void setKs3FullPathMP4(String ks3FullPathMP4) {
        Ks3FullPathMP4 = ks3FullPathMP4;
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
