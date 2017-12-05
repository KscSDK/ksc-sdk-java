package com.ksc.kls.model;

import java.util.List;

public class ThirdStreamsInfoDetail {
    private String Node;
    private int FLR;
    private double BwReal;
    private String Vcodec;
    private String Acodec;
    private Long OnlineUser;
    private Long Bw;
    private double BwInAudio;
    private double BwIn;
    private double BwDiff;
    private int Width;
    private String Clientip;
    private double Curbitrate;
    private int Curfps;
    private int FrameRate;
    private int Height;
    private int Pubtime;
    private int SampleRate;
    private String Stream;
    private List<ThirdStreamsInfoPullsInfo> Pulls;

    public String getNode() {
        return Node;
    }

    public void setNode(String node) {
        Node = node;
    }

    public int getFLR() {
        return FLR;
    }

    public void setFLR(int FLR) {
        this.FLR = FLR;
    }

    public double getBwReal() {
        return BwReal;
    }

    public void setBwReal(double bwReal) {
        BwReal = bwReal;
    }

    public String getVcodec() {
        return Vcodec;
    }

    public void setVcodec(String vcodec) {
        Vcodec = vcodec;
    }

    public String getAcodec() {
        return Acodec;
    }

    public void setAcodec(String acodec) {
        Acodec = acodec;
    }

    public Long getOnlineUser() {
        return OnlineUser;
    }

    public void setOnlineUser(Long onlineUser) {
        OnlineUser = onlineUser;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public double getBwInAudio() {
        return BwInAudio;
    }

    public void setBwInAudio(double bwInAudio) {
        BwInAudio = bwInAudio;
    }

    public double getBwIn() {
        return BwIn;
    }

    public void setBwIn(double bwIn) {
        BwIn = bwIn;
    }

    public double getBwDiff() {
        return BwDiff;
    }

    public void setBwDiff(double bwDiff) {
        BwDiff = bwDiff;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public String getClientip() {
        return Clientip;
    }

    public void setClientip(String clientip) {
        Clientip = clientip;
    }

    public double getCurbitrate() {
        return Curbitrate;
    }

    public void setCurbitrate(double curbitrate) {
        Curbitrate = curbitrate;
    }

    public int getCurfps() {
        return Curfps;
    }

    public void setCurfps(int curfps) {
        Curfps = curfps;
    }

    public int getFrameRate() {
        return FrameRate;
    }

    public void setFrameRate(int frameRate) {
        FrameRate = frameRate;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getPubtime() {
        return Pubtime;
    }

    public void setPubtime(int pubtime) {
        Pubtime = pubtime;
    }

    public int getSampleRate() {
        return SampleRate;
    }

    public void setSampleRate(int sampleRate) {
        SampleRate = sampleRate;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public List<ThirdStreamsInfoPullsInfo> getPulls() {
        return Pulls;
    }

    public void setPulls(List<ThirdStreamsInfoPullsInfo> pulls) {
        Pulls = pulls;
    }
}
