package com.ksc.cdn.model.statistic.province.isp.bandwidth;

import lombok.ToString;

/**
 * BwDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
@ToString
public class BwDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 边缘带宽（所选域名在所选省份区域及运营商的带宽数据合并值）
     */
    private Long Bw;
    /**
     * 每个域名的详细带宽数据(仅当ResultType取值为1时返回此项数据)
     */
    private BwDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public BwDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(BwDataByDomain[] domains) {
        Domains = domains;
    }
}
