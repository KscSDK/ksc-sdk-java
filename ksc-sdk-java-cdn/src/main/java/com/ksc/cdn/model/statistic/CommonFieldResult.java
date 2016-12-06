package com.ksc.cdn.model.statistic;

/**
 * CommonFieldResult
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class CommonFieldResult {

    /**
     * 开始时间
     */
    private String StartTime;
    /**
     * 结束时间
     */
    private String EndTime;
    /**
     * 产品类型
     */
    private String CdnType;
    /**
     * 域名ID列表，逗号（半角）间隔
     */
    private String DomainIds;


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


}
