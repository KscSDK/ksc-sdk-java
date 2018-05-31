package com.ksc.cdn.model.statistic.live.playstat;

public class PlayStatDataByStream {

    /**
     * StreamUrl模式的URL形式的流名
     */
    private String StreamUrl;

    /**
     * 边缘带宽（该域名的总带宽，若选择多个区域，则返回该域名多个区域的数据合并值。该值和流维度数据求和会有一定误差）
     */
    private Long Bw;

    /**
     * 流量（该域名的总流量，若选择多个区域，则返回该域名多个区域的数据合并值。该值和流维度数据求和会有轻微误差）
     */
    private Long Flow;

    /**
     * 在线人数（该域名的总在线人数。该值和流维度数据求和会有一定误差）
     */
    private Long OnlineUser;

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

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public Long getOnlineUser() {
        return OnlineUser;
    }

    public void setOnlineUser(Long onlineUser) {
        OnlineUser = onlineUser;
    }
}
