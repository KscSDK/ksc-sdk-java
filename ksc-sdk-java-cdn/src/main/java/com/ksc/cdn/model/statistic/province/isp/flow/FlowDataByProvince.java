package com.ksc.cdn.model.statistic.province.isp.flow;

/**
 * FlowDataByProvince
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class FlowDataByProvince {
    /**
     * 省份区域
     */
    private String Province;
    /**
     * 边缘流量（该域名在该省份区域的边缘流量数据）
     */
    private Long Flow;
    /**
     * 该域名在该省份每个运营商的流量详细数据
     */
    private FlowDataByIsp[] Isps;

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public FlowDataByIsp[] getIsps() {
        return Isps;
    }

    public void setIsps(FlowDataByIsp[] isps) {
        Isps = isps;
    }
}
