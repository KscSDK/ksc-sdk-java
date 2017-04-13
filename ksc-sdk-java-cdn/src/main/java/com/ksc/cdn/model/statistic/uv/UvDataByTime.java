package com.ksc.cdn.model.statistic.uv;

/**
 * UvDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class UvDataByTime {

    /**
     * 时间点
     */
    private String Time;

    /**
     * 独立请求的IP个数，（所选域名合并值）
     */
    private Long Uv;

    /**
     * 每个域名的详细独立请求的IP个数数据ResultType取值为1时返回此项数据))
     */
    private UvDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Long getUv() {
        return Uv;
    }

    public void setUv(Long uv) {
        Uv = uv;
    }

    public UvDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(UvDataByDomain[] domains) {
        Domains = domains;
    }
}
