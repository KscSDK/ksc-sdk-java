package com.ksc.cdn.model.statistic.province.isp.flow;

/**
 * FlowDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class FlowDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 边缘流量（该域名的边缘流量，若选择多个省份区域多个运营商，则返回该域名多个省份区域多个运营商的数据合并值）
     */
    private Long Flow;
    /**
     * 该域名在每个省份区域的流量详细数据
     */
    private FlowDataByProvince[] Provinces;

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

    public FlowDataByProvince[] getProvinces() {
        return Provinces;
    }

    public void setProvinces(FlowDataByProvince[] provinces) {
        Provinces = provinces;
    }
}
