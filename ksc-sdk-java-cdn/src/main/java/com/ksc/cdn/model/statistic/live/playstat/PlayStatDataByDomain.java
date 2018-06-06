package com.ksc.cdn.model.statistic.live.playstat;

import java.util.List;

public class PlayStatDataByDomain {

    /**
     * 域名Id
     */
    private String DomainId;

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

    /**
     * 每个时间粒度的播放统计数据，流量维度。仅RTMP、HDL协议会返回流维度数据，HLS的流并不显示流维度数据
     * (仅当StreamResultType取值为1时返回此数据)
     */
    private List<PlayStatDataByStream> Streams;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
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

    public List<PlayStatDataByStream> getStreams() {
        return Streams;
    }

    public void setStreams(List<PlayStatDataByStream> streams) {
        Streams = streams;
    }
}
