package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class RuleHealthCheck {

    /**
     * 健康检查响应超时时间
     */
    private Integer timeout;
    /**
     * 健康检查时间间隔
     */
    private Integer interval;
    /**
     * 健康阈值
     */
    private Integer healthyThreshold;
    /**
     * 不健康阈值
     */
    private Integer unhealthyThreshold;
    /**
     * 健康检查的ID
     */
    private String healthCheckId;
    /**
     * 健康检查保持的状态
     */
    private String healthCheckState;
    /**
     * 健康检查域名
     */
    private String hostName;
    /**
     * 健康检查URI
     */
    private String urlPath;


}
