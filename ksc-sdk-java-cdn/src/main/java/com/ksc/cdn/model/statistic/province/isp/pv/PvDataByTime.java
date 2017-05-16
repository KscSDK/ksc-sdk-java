package com.ksc.cdn.model.statistic.province.isp.pv;

/**
 * PvDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class PvDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 边缘请求数（所选域名合并值）
     */
    private Long Pv;
    /**
     * 每个域名的详细请求数数据(仅当ResultType取值为1时返回此项数据))
     */
    private PvDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public PvDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(PvDataByDomain[] domains) {
        Domains = domains;
    }
}