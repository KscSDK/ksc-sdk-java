package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/7/25.
 */
public class GetBlacklistDetail {
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private int RetCode;
    private String RetMsg;
    private int Total;
    List<ListBlacklist> Recs;

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

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public List<ListBlacklist> getRecs() {
        return Recs;
    }

    public void setRecs(List<ListBlacklist> recs) {
        Recs = recs;
    }
}
