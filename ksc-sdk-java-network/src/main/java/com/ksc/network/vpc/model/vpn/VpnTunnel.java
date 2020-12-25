package com.ksc.network.vpc.model.vpn;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class VpnTunnel {

    /**
     * VPN通道的创建时间
     */
    private String createTime;
    /**
     * VPN通道的ID
     */
    private String vpnTunnelId;
    /**
     * VPN通道状态
     */
    private String state;
    /**
     * 客户网关的类型
     */
    private String type;
    /**
     * VPN通道的名称
     */
    private String vpnTunnelName;
    /**
     * GRE模式VPN的IP
     */
    private String vpnGreIp;
    /**
     * GRE模式客户的IP
     */
    private String customerGreIp;
    /**
     * GRE模式开启HA模式VPN的IP
     */
    private String haVpnGreIp;
    /**
     * GRE模式开启HA模式客户的IP
     */
    private String haCustomerGreIp;
    /**
     * VPN网关的ID
     */
    private String vpnGatewayId;
    /**
     * 客户网关的ID
     */
    private String customerGatewayId;
    /**
     * 对称加密的KEY，VPN端和客户端统一，用户自行填写
     */
    private String preSharedKey;
    /**
     * 认证算法
     */
    private String ikeAuthenAlgorithm;
    /**
     * 密钥加密算法的类型
     */
    private String ikeDHGroup;
    /**
     * ikey的加密算法
     */
    private String ikeEncryAlgorithm;
    /**
     * ipsec的加密算法
     */
    private String ipsecEncryAlgorithm;
    /**
     * ipsec算法
     */
    private String ipsecAuthenAlgorithm;
    /**
     * 生存周期，单位KB
     */
    private Integer ipsecLifetimeTraffic;
    /**
     * 生存周期，单位秒
     */
    private Integer ipsecLifetimeSecond;
    /**
     * 是否野蛮模式
     */
    private Boolean enableNatTraversal;
    /**
     * NAT ID
     */
    private String natId;
    /**
     * 额外的网段，用于VPN和对等连接后的VPC互通或者和云IDC互通
     */
    private List<String> extraCidrSet;

    public void addExtraCidrSet(String... extraCidrSet) {
        if (this.extraCidrSet == null) {
            this.extraCidrSet = new com.ksc.internal.SdkInternalList<String>();
        }
        for (String value : extraCidrSet) {
            this.extraCidrSet.add(value);
        }
    }

}
