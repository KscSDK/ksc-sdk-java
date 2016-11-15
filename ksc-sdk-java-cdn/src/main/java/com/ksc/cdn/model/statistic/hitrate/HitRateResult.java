package com.ksc.cdn.model.statistic.hitrate;


/**
 * 获取域名某一时间段内流量命中率、请求数命中率数据
 * Created by CrazyHorse on 24/10/2016.
 */
public class HitRateResult {
    /**
     * 取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800
     */
    private String StartTime;
    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800
     */
    private String EndTime;
    /**
     * 产品类型
     * @see com.ksc.cdn.model.enums.CdnTypeEnum
     */
    private String CdnType;
    /**
     * 域名ID列表，逗号（半角）间隔
     */
    private String DomainIds;
    /**
     * 所选时间段内命中百分占比数据
     */
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
