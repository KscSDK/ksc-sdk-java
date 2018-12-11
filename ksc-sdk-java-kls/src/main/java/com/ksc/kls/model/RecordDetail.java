package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/4/27.
 */
public class RecordDetail {
    private String Bucket;
    private int StartUnixTime;
    private int EndUnixTime;
    private int Duration;
    private int FailDetail;
    private String Ks3FullPathM3U8;
    private String Ks3FullPathMP4;
    private int RecID;
    private int RecType;
    private int RecStatus;
    private String Stream;

    public String getBucket() {
        return Bucket;
    }

    public String getKs3FullPathM3U8() {
        return Ks3FullPathM3U8;
    }

    public String getKs3FullPathMP4() {
        return Ks3FullPathMP4;
    }

    public int getRecID() {
        return RecID;
    }

    public int getRecType() {
        return RecType;
    }

    public int getRecStatus() {
        return RecStatus;
    }

    public String getStream() {
        return Stream;
    }

    public int getStartUnixTime() {
        return StartUnixTime;
    }

    public int getEndUnixTime() {
        return EndUnixTime;
    }

    public int getDuration() {
        return Duration;
    }

    public int getFailDetail() {
        return FailDetail;
    }

    public void setBucket(String bucket) {
        Bucket = bucket;
    }

    public void setKs3FullPathM3U8(String ks3FullPathM3U8) {
        Ks3FullPathM3U8 = ks3FullPathM3U8;
    }

    public void setKs3FullPathMP4(String ks3FullPathMP4) {
        Ks3FullPathMP4 = ks3FullPathMP4;
    }

    public void setRecID(int recID) {
        RecID = recID;
    }

    public void setRecType(int recType) {
        RecType = recType;
    }

    public void setRecStatus(int recStatus) {
        RecStatus = recStatus;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public void setStartUnixTime(int startUnixTime) {
        StartUnixTime = startUnixTime;
    }

    public void setEndUnixTime(int endUnixTime) {
        EndUnixTime = endUnixTime;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public void setFailDetail(int failDetail) {
        FailDetail = failDetail;
    }
}
