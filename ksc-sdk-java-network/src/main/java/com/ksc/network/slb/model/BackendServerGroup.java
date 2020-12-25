package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class BackendServerGroup {

    /**
     * 后端服务组的创建时间
     */
    private String createTime;
    /**
     * Vpc的ID
     */
    private String vpcId;
    /**
     * 后端服务组的ID
     */
    private String backendServerGroupId;
    /**
     * 后端服务组的名称
     */
    private String backendServerGroupName;
    /**
     * 后端服务的数量
     */
    private Integer backendServerNumber;
    /**
     * 健康检查信息，仅镜像服务器有此参数
     */
    private HealthCheck healthCheck;


}
