package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/22.
 */
public class StreamInfo {
    private String BwIn;
    private String BwInAudio;
    private String BwReal;
    private String Clientip;
    private int Curbitrate;
    private int Curfps;
    private String FrameRate;
    private String Height;
    private String SampleRate;
    private String Stream;
    private String Width;
    private int UpdateTime;
    private int Pubtime;

    public String getBwIn() {
        return BwIn;
    }

    public void setBwIn(String bwIn) {
        BwIn = bwIn;
    }

    public String getBwInAudio() {
        return BwInAudio;
    }

    public void setBwInAudio(String bwInAudio) {
        BwInAudio = bwInAudio;
    }

    public String getBwReal() {
        return BwReal;
    }

    public void setBwReal(String bwReal) {
        BwReal = bwReal;
    }

    public String getClientip() {
        return Clientip;
    }

    public void setClientip(String clientip) {
        Clientip = clientip;
    }

    public int getCurbitrate() {
        return Curbitrate;
    }

    public void setCurbitrate(int curbitrate) {
        Curbitrate = curbitrate;
    }

    public int getCurfps() {
        return Curfps;
    }

    public void setCurfps(int curfps) {
        Curfps = curfps;
    }

    public String getFrameRate() {
        return FrameRate;
    }

    public void setFrameRate(String frameRate) {
        FrameRate = frameRate;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getSampleRate() {
        return SampleRate;
    }

    public void setSampleRate(String sampleRate) {
        SampleRate = sampleRate;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getWidth() {
        return Width;
    }

    public void setWidth(String width) {
        Width = width;
    }

    public int getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(int updateTime) {
        UpdateTime = updateTime;
    }

    public int getPubtime() {
        return Pubtime;
    }

    public void setPubtime(int pubtime) {
        Pubtime = pubtime;
    }
}
