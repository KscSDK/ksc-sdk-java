package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/2.
 */
public class RecordingTaskDetail {
    private String Bucket;
    private int Duration;
    private int StartUnixTime;
    private int EndUnixTime;
    private String Ks3FullPathM3U8;
    private String Ks3FullPathMP4;
    private String Stream;
    private int RecID;
    private int RecType;
    private int RecStatus;

    public String getBucket() {
        return Bucket;
    }

    public int getDuration() {
        return Duration;
    }

    public int getStartUnixTime() {
        return StartUnixTime;
    }

    public int getEndUnixTime() {
        return EndUnixTime;
    }

    public String getKs3FullPathM3U8() {
        return Ks3FullPathM3U8;
    }

    public String getKs3FullPathMP4() {
        return Ks3FullPathMP4;
    }

    public String getStream() {
        return Stream;
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

    public void setBucket(String bucket) {
        Bucket = bucket;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public void setStartUnixTime(int startUnixTime) {
        StartUnixTime = startUnixTime;
    }

    public void setEndUnixTime(int endUnixTime) {
        EndUnixTime = endUnixTime;
    }

    public void setKs3FullPathM3U8(String ks3FullPathM3U8) {
        Ks3FullPathM3U8 = ks3FullPathM3U8;
    }

    public void setKs3FullPathMP4(String ks3FullPathMP4) {
        Ks3FullPathMP4 = ks3FullPathMP4;
    }

    public void setStream(String stream) {
        Stream = stream;
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
}
