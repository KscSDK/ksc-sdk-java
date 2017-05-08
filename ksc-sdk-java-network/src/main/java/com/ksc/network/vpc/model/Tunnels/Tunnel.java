package com.ksc.network.vpc.model.Tunnels;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Tunnel {
    /**
     * 隧道网关的创建时间
     */
	private String CreateTime;
    /**
     * Vpc的ID
     */
	private String VpcId;
    /**
     * 隧道网关的名称
     */
	private String TunnelName;
    /**
     * 隧道网关的ID
     */
	private String TunnelId;
    /**
     * 隧道网关的IP
     */
	private String TunnelIp;
    /**
     * 隧道网关的作用范围，VPC（Vpc）是指隧道网关对整个VPC有效，子网(subnet)是指隧道网关对关联的子网有效
     */
    private String TunnelMode;
    /**
     * 设备名称
     */
    private String DeviceName;
    /**
     * 网关IP
     */
    private String GatewayIp;
    /**
     * 网关MAC
     */
    private String GatewayMac;
    /**
     * 隧道网关的接受端网段信息
     */
    private com.ksc.internal.SdkInternalList<AssociateRemoteCidr> AssociateRemoteCidrSet;
    /**
     * 隧道网关关联的子网信息
     */
    private com.ksc.internal.SdkInternalList<AssociateSubnet> AssociateSubnetSet;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getTunnelName() {
        return TunnelName;
    }

    public void setTunnelName(String tunnelName) {
        TunnelName = tunnelName;
    }

    public String getTunnelId() {
        return TunnelId;
    }

    public void setTunnelId(String tunnelId) {
        TunnelId = tunnelId;
    }

    public String getTunnelIp() {
        return TunnelIp;
    }

    public void setTunnelIp(String tunnelIp) {
        TunnelIp = tunnelIp;
    }

    public String getTunnelMode() {
        return TunnelMode;
    }

    public void setTunnelMode(String tunnelMode) {
        TunnelMode = tunnelMode;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public String getGatewayIp() {
        return GatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        GatewayIp = gatewayIp;
    }

    public String getGatewayMac() {
        return GatewayMac;
    }

    public void setGatewayMac(String gatewayMac) {
        GatewayMac = gatewayMac;
    }

    public com.ksc.internal.SdkInternalList<AssociateRemoteCidr> getAssociateRemoteCidrSet() {
        return AssociateRemoteCidrSet;
    }

    public void setAssociateRemoteCidrSet(
            com.ksc.internal.SdkInternalList<AssociateRemoteCidr> associateRemoteCidrSet) {
        AssociateRemoteCidrSet = associateRemoteCidrSet;
    }

    public void addAssociateRemoteCidrSet(AssociateRemoteCidr... tunnels) {
        if (AssociateRemoteCidrSet == null) {
            AssociateRemoteCidrSet = new com.ksc.internal.SdkInternalList<AssociateRemoteCidr>();
        }
        for (AssociateRemoteCidr tunnel : tunnels) {
            AssociateRemoteCidrSet.add(tunnel);
        }
    }

    public com.ksc.internal.SdkInternalList<AssociateSubnet> getAssociateSubnetSet() {
        return AssociateSubnetSet;
    }

    public void setAssociateSubnetSet(
            com.ksc.internal.SdkInternalList<AssociateSubnet> associateSubnetSet) {
        AssociateSubnetSet = associateSubnetSet;
    }

    public void addAssociateSubnetSet(AssociateSubnet... tunnels) {
        if (AssociateSubnetSet == null) {
            AssociateSubnetSet = new com.ksc.internal.SdkInternalList<AssociateSubnet>();
        }
        for (AssociateSubnet tunnel : tunnels) {
            AssociateSubnetSet.add(tunnel);
        }
    }
}
