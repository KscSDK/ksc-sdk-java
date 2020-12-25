package com.ksc.network.vpc.model.vpn;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class VpnGateway {

    /**
     * VPN网关创建时间
     */
    private String createTime;
    /**
     * Vpc的ID
     */
    private String vpcId;
    /**
     * VPN网关ID
     */
    private String vpnGatewayId;
    /**
     * VPN网关的名称
     */
    private String vpnGatewayName;
    /**
     * VPN的公网IP
     */
    private String gatewayAddress;
    /**
     * VPN网关的带宽
     */
    private Integer bandWidth;
    /**
     * HA模式VPN的公网IP
     */
    private String haGatewayAddress;
    /**
     * VPN的类型
     */
    private String vpnSwitchType;
    /**
     * 项目的ID
     */
    private String projectId;


}
