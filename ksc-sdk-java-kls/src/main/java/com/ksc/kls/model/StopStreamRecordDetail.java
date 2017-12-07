package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/3.
 */
public class StopStreamRecordDetail {
    private String Bucket;
    private String Ks3FullPathM3U8;
    private String Ks3FullPathMP4;
    private String RetMsg;
    private int Retcode;

    public String getBucket() {
        return Bucket;
    }

    public void setBucket(String bucket) {
        Bucket = bucket;
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

    public String getRetMsg() {
        return RetMsg;
    }

    public void setRetMsg(String retMsg) {
        RetMsg = retMsg;
    }

    public int getRetcode() {
        return Retcode;
    }

    public void setRetcode(int retcode) {
        Retcode = retcode;
    }
}
