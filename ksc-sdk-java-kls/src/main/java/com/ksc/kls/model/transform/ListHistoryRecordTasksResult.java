package com.ksc.kls.model.transform;

/**
 * Created by yangfan on 2017/4/24.
 */
public class ListHistoryRecordTasksResult {
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;
    private String RecID;
    private String Bucket;
    private String Ks3FullPathM3U8;
    private String Ks3FullPathMP4;
    private String RetMsg;
    private int Count;
    private int OrderTime;
    private int RecType;
    private int RecStatus;
    private int StartUnixTime;
    private int EndUnixTime;
    private int Duration;
    private int RetCode;

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

    public String getRecID() {
        return RecID;
    }

    public String getBucket() {
        return Bucket;
    }

    public String getKs3FullPathM3U8() {
        return Ks3FullPathM3U8;
    }

    public String getKs3FullPathMP4() {
        return Ks3FullPathMP4;
    }

    public String getRetMsg() {
        return RetMsg;
    }

    public int getCount() {
        return Count;
    }

    public int getOrderTime() {
        return OrderTime;
    }

    public int getRecType() {
        return RecType;
    }

    public int getRecStatus() {
        return RecStatus;
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

    public int getRetCode() {
        return RetCode;
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

    public void setRecID(String recID) {
        RecID = recID;
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

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }

    public void setCount(int count) {
        Count = count;
    }

    public void setOrderTime(int orderTime) {
        OrderTime = orderTime;
    }

    public void setRecType(int recType) {
        RecType = recType;
    }

    public void setRecStatus(int recStatus) {
        RecStatus = recStatus;
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

    public void setRetCode(int retCode) {
        RetCode = retCode;
    }
}
