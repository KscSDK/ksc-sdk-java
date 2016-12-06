package com.ksc.cdn.model.statistic.live.domain;

/**
 * OnlineUserDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class OnlineUserDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 在线人数（所选域名合并值）
     */
    private Long OnlineUser;
    /**
     * 该域名在每个计费区域的详细数据
     */
    private OnlineUserDataByRegion[] Regions;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
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
