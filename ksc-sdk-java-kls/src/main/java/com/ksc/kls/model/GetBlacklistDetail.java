package com.ksc.kls.model;



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
    private com.ksc.internal.SdkInternalList<ListBlacklist> Recs;

    public void setRecs(java.util.Collection<ListBlacklist> rec) {
        if (rec != null) {
            this.Recs = new com.ksc.internal.SdkInternalList<ListBlacklist>(rec);
        }
    }

    public void addList(ListBlacklist... lists) {
        if (this.Recs == null) {
            this.Recs = new com.ksc.internal.SdkInternalList<ListBlacklist>();
        }
        for (ListBlacklist list : lists) {
            this.Recs.add(list);
        }
    }

    public com.ksc.internal.SdkInternalList<ListBlacklist> getRecs() {
        return Recs;
    }

    public void setRecs(com.ksc.internal.SdkInternalList<ListBlacklist> recs) {
        this.Recs = recs;
    }

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






}
