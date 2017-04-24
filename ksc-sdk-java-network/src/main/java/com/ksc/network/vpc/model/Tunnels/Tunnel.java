package com.ksc.network.vpc.model.Tunnels;

import com.ksc.network.vpc.model.Nat.NatIp;
import com.ksc.network.vpc.model.NetworkAcl.NetworkAclEntry;
import com.ksc.network.vpc.model.VpcPeeringConnection.AccepterVpcInfo;
import com.ksc.network.vpc.model.VpcPeeringConnection.RequesterVpcInfo;

import lombok.ToString;

@ToString
public class Tunnel {

	private String CreateTime;

	private String VpcId;

	private String TunnelName;

	private String TunnelId;

	private String TunnelIp;

    private String TunnelMode;

    private String DeviceName;

    private String GatewayIp;

    private String GatewayMac;

    private com.ksc.internal.SdkInternalList<AssociateRemoteCidr> AssociateRemoteCidrSet;

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
