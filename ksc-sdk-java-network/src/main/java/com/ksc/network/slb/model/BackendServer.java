package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class BackendServer {

    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 网卡的ID
     */
    private String networkInterfaceId;
    /**
     * 后端服务的IP
     */
    private String backendServerIp;
    /**
     * 实例ID
     */
    private String instanceId;
    /**
     * 后端服务组的ID
     */
    private String backendServerGroupId;
    /**
     * 绑定服务器组的注册ID
     */
    private String registerId;
    /**
     * 后端服务的端口
     */
    private String backendServerPort;
    /**
     * 实例的权重
     */
    private Integer weight;
    /**
     * 后端服务器状态
     */
    private String backendServerState;


}
