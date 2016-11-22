package com.ksc.cdn.model.statistic.live.domain;

/**
 * OnlineUserDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class OnlineUserDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 在线人数（所选域名合并值）
     */
    private Long OnlineUser;
    /**
     * 每个域名的详细请求数数据(仅当ResultType取值为1时返回此数据)
     */
    private OnlineUserDataByDomain[] Domains;

}
