package com.ksc.cdn.model.statistic.flow;

/**
 * DomainRanking
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class DomainRanking{
    /**
     * 域名
     */
    private String Domain;
    /**
     * 域名Id
     */
    private String DomainId;
    /**
     * 边缘流量（该域名在所选时间段内的流量合并值）
     */
    private Long Flow;
    /**
     * 流量占比（该域名在所选时间段内的流量占所有域名流量总量的百分比）
     */
    private Double FlowProportion;
    /**
     * 带宽峰值，查询日期内的带宽峰值
     */
    private Long Bw;
    /**
     * 峰值时间点，查询日期内的峰值时间点
     */
    private String Timemax;
    /**
     * 边缘请求数即访问次数（该域名在所选时间段内访问次数合并值）
     */
    private Long Pv;

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public Double getFlowProportion() {
        return FlowProportion;
    }

    public void setFlowProportion(Double flowProportion) {
        FlowProportion = flowProportion;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public String getTimemax() {
        return Timemax;
    }

    public void setTimemax(String timemax) {
        Timemax = timemax;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }
}