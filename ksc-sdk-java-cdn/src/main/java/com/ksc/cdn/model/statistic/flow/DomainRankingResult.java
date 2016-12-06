package com.ksc.cdn.model.statistic.flow;

/**
 * DomainRankingResult
 * 域名排行查询结果
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class DomainRankingResult {
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
     * 域名统计数据，并按流量降序排列返回
     */
    private DomainRanking[] Datas;

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

    public DomainRanking[] getDatas() {
        return Datas;
    }

    public void setDatas(DomainRanking[] datas) {
        Datas = datas;
    }
}
