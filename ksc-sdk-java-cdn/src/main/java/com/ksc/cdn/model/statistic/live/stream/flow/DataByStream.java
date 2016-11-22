package com.ksc.cdn.model.statistic.live.stream.flow;

/**
 * DataByStream
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class DataByStream {
    /**
     * 流名
     */
    private String StreamUrl;
    /**
     * 流量（该流名的流量，若选择多个计费区域，则返回该域名多个计费区域的数据合并值）
     */
    private Long Flow;
    /**
     * 该流名在每个计费区域的流量详细数据
     */
    private DataByRegion[] Regions;

    public String getStreamUrl() {
        return StreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        StreamUrl = streamUrl;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public DataByRegion[] getRegions() {
        return Regions;
    }

    public void setRegions(DataByRegion[] regions) {
        Regions = regions;
    }
}
