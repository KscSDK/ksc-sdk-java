package com.ksc.cdn.model.statistic.flow;

/**
 * FlowDataByRegion
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class FlowDataByRegion {
    /**
     * 区域
     * @see com.ksc.cdn.model.enums.RegionsEnum
     */
    private String Region;
    /**
     * 边缘流量（该域名在该区域的边缘流量数据）
     */
    private Long Flow;
    /**
     * 回源流量（该域名在该区域的边缘流量数据）
     */
    private Long SrcFlow;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
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
}
