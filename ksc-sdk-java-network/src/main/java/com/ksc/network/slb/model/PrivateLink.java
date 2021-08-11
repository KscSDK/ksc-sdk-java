package com.ksc.network.slb.model;

import lombok.Data;

/**
 * @author: hueason
 * @date: 2021/6/7 17:37
 * @description:
 */
@Data
public class PrivateLink {
    /**
     * PrivateLink客户端的创建时间
     */
    private String createTime;
    /**
     * PrivateLink的ID
     */
    private String privateLinkId;
    /**
     * PrivateLinkServer的ID
     */
    private String privateLinkServerId;
    /**
     * 关联监听器ID
     */
    private String listenerId;
    /**
     * 客户ID
     */
    private String accountId;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 连接状态
     * 申请中pending || 已连接active || 已拒绝rejected
     */
    private String connectionStatus;
}
