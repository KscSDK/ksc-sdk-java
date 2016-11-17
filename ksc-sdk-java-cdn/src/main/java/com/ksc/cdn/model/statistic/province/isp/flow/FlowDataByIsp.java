package com.ksc.cdn.model.statistic.province.isp.flow;

/**
 * FlowDataByIsp
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class FlowDataByIsp {
    /**
     * 运营商
     */
    private String Isp;
    /**
     * 边缘流量（该域名在该省份区域该运营商的边缘流量数据）
     */
    private Long Flow;

    public String getIsp() {
        return Isp;
    }

    public void setIsp(String isp) {
        Isp = isp;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }
}
