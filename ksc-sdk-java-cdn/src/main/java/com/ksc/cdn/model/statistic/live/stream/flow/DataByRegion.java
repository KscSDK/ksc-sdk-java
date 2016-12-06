package com.ksc.cdn.model.statistic.live.stream.flow;

/**
 * DataByRegion
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class DataByRegion {
    /**
     * 计费区域
     */
    private String Region;
    /**
     * 流量（该流名在该计费区域的回源流量数据）
     */
    private Long Flow;

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
}
