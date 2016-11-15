package com.ksc.cdn.model.statistic.hitrate;


/**
 * Created by CrazyHorse on 24/10/2016.
 */
public class HitRateResult {
    private String StartTime;
    private String EndTime;
    private String CdnType;
    private String DomainIds;
    private HitRateData[] Datas;

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getCdnType() {
        return CdnType;
    }

    public void setCdnType(String cdnType) {
        CdnType = cdnType;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

    public HitRateData[] getDatas() {
        return Datas;
    }

    public void setDatas(HitRateData[] datas) {
        Datas = datas;
    }


}
