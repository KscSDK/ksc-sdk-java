package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/4/24.
 */
public class StartStreamRecordRequest {
    private String Action;
    private String Version;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private String Ks3FileNameM3u8;
    private String Ks3FullPathMP4;
    private int Mp4VodEnable;

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

    public int getMp4VodEnable() {
        return Mp4VodEnable;
    }

    public String getKs3FileNameM3u8() {
        return Ks3FileNameM3u8;
    }

    public String getKs3FullPathMP4() {
        return Ks3FullPathMP4;
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

    public void setMp4VodEnable(int mp4VodEnable) {
        Mp4VodEnable = mp4VodEnable;
    }

    public void setKs3FileNameM3u8(String ks3FileNameM3u8) {
        Ks3FileNameM3u8 = ks3FileNameM3u8;
    }

    public void setKs3FullPathMP4(String ks3FullPathMP4) {
        Ks3FullPathMP4 = ks3FullPathMP4;
    }

    public void setAction(String action) {
        Action = action;
    }

    public void setVersion(String version) {
        Version = version;
    }
}
