package com.ksc.cdn.model.statistic.flow;

/**
 * FlowDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class FlowDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 边缘流量（该域名的边缘流量，若选择多个区域，则返回该域名多个区域的数据合并值）
     */
    private Long Flow;
    /**
     * 回源流量（该域名的回源流量，若选择多个区域，则返回该域名多个区域的数据合并值）
     */
    private Long SrcFlow;
    /**
     * 该域名在每个区域的流量详细数据
     */
    private FlowDataByRegion[] Regions;

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

    public Long getSrcFlow() {
        return SrcFlow;
    }

    public void setSrcFlow(Long srcFlow) {
        SrcFlow = srcFlow;
    }

    public FlowDataByRegion[] getRegions() {
        return Regions;
    }

    public void setRegions(FlowDataByRegion[] regions) {
        Regions = regions;
    }
}
