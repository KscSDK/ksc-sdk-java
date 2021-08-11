package com.ksc.network.slb.model;

import lombok.Data;


@Data
public class PrivateLinkServer {
    /**
     * PrivateLinkServer的描述
     */
    private String Description;

    /**
     * PrivateLink服务端的创建时间
     */
    private String CreateTime;

    /**
     * PrivateLinkServer的ID
     */
    private String PrivateLinkServerId;

    /**
     * PrivateLink名称
     */
    private String PrivateLinkServerName;

    /**
     * PrivateLink的数量
     */
    private String PrivateLinkNum;

    /**
     * 关联监听器ID
     */
    private String ListenerId;
}
