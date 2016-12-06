package com.ksc.cdn.model.statistic.province.isp.flow;

/**
 * FlowDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class FlowDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 边缘流量（所选域名在所选省份区域及运营商的流量数据合并值）
     */
    private Long Flow;
    /**
     * 每个域名的详细流量数据(仅当ResultType取值为1时返回此项数据)
     */
    private FlowDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public FlowDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(FlowDataByDomain[] domains) {
        Domains = domains;
    }
}
