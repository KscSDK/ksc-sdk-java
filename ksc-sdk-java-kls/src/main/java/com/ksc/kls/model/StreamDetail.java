package com.ksc.kls.model;

/**
 * Created by yangfan on 2017/5/22.
 */
public class StreamDetail {
    private String Clientip;
    private int Fintime;
    private int Pubtime;
    private int StatusCode;
    private String StatusMessage;

    public String getClientip() {
        return Clientip;
    }

    public void setClientip(String clientip) {
        Clientip = clientip;
    }

    public int getFintime() {
        return Fintime;
    }

    public void setFintime(int fintime) {
        Fintime = fintime;
    }

    public int getPubtime() {
        return Pubtime;
    }

    public void setPubtime(int pubtime) {
        Pubtime = pubtime;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int statusCode) {
        StatusCode = statusCode;
    }

    public String getStatusMessage() {
        return StatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        StatusMessage = statusMessage;
    }
}
