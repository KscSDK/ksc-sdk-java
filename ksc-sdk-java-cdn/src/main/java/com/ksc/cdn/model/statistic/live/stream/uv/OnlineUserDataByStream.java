package com.ksc.cdn.model.statistic.live.stream.uv;

import com.ksc.cdn.model.statistic.live.domain.OnlineUserDataByRegion;

/**
 * OnlineUserDataByStream
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class OnlineUserDataByStream {
    /**
     * 流名
     */
    private String StreamUrl;
    /**
     * 在线人数
     */
    private Long OnlineUser;
    /**
     * 该域名在每个计费区域的详细数据
     */
    private OnlineUserDataByRegion[] Regions;

    public String getStreamUrl() {
        return StreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        StreamUrl = streamUrl;
    }

    public Long getOnlineUser() {
        return OnlineUser;
    }

    public void setOnlineUser(Long onlineUser) {
        OnlineUser = onlineUser;
    }

    public OnlineUserDataByRegion[] getRegions() {
        return Regions;
    }

    public void setRegions(OnlineUserDataByRegion[] regions) {
        Regions = regions;
    }
}
