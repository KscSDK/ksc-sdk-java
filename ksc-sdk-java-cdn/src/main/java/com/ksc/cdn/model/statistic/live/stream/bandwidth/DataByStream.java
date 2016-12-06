package com.ksc.cdn.model.statistic.live.stream.bandwidth;

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
     * 边缘带宽（该流名的边缘带宽，若选择多个计费区域，则返回该域名多个计费区域的数据合并值）
     */
    private Long Bw;
    /**
     * 该流名在每个计费区域的带宽详细数据
     */
    private DataByRegion[] Regions;

    public String getStreamUrl() {
        return StreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        StreamUrl = streamUrl;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public DataByRegion[] getRegions() {
        return Regions;
    }

    public void setRegions(DataByRegion[] regions) {
        Regions = regions;
    }
}
