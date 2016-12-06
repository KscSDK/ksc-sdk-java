package com.ksc.cdn.model.statistic.live.domain;

/**
 * OnlineUserDataByRegion
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class OnlineUserDataByRegion {
    /**
     * 计费区域
     */
    private String Region;
    /**
     * 在线人数（所选域名合并值）
     */
    private Long OnlineUser;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Long getOnlineUser() {
        return OnlineUser;
    }

    public void setOnlineUser(Long onlineUser) {
        OnlineUser = onlineUser;
    }
}
