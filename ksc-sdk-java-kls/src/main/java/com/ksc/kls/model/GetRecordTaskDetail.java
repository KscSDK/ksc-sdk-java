package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/4.
 */
public class GetRecordTaskDetail {
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private int RecID;
    private int RecType;
    private String Bucket;
    private int StartUnixTime;
    private int EndUnixTime;
    private String Ks3FullPathM3U8;
    private String Ks3FullPathMP4;
    private String Duration;
    private int RecStatus;
    private int RetCode;
    private String RetMsg;

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

    public int getRecID() {
        return RecID;
    }

    public void setRecID(int recID) {
        RecID = recID;
    }

    public int getRecType() {
        return RecType;
    }

    public void setRecType(int recType) {
        RecType = recType;
    }

    public String getBucket() {
        return Bucket;
    }

    public void setBucket(String bucket) {
        Bucket = bucket;
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

    public String getKs3FullPathM3U8() {
        return Ks3FullPathM3U8;
    }

    public void setKs3FullPathM3U8(String ks3FullPathM3U8) {
        Ks3FullPathM3U8 = ks3FullPathM3U8;
    }

    public String getKs3FullPathMP4() {
        return Ks3FullPathMP4;
    }

    public void setKs3FullPathMP4(String ks3FullPathMP4) {
        Ks3FullPathMP4 = ks3FullPathMP4;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public int getRecStatus() {
        return RecStatus;
    }

    public void setRecStatus(int recStatus) {
        RecStatus = recStatus;
    }

    public int getRetCode() {
        return RetCode;
    }

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }
}
