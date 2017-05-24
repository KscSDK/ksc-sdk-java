package com.ksc.network.vpc.model.subnet;

import lombok.EqualsAndHashCode;
import lombok.ToString;
@ToString
@EqualsAndHashCode
public class Subnet {
    /**
     * 子网创建时间
     */
	private String CreateTime;
    /**
     * 子网的ID
     */
	private String SubnetId;
	/**
	 * Vpc的ID
	 */
	private String VpcId;
	/**
	 * 子网的类型，终端子网（Reserve）、普通子网（Normal）
	 */
	private String SubnetType;
    /**
     * 子网的名称
     */
	private String SubnetName;
	/**
	 * 子网的网络范围，例如：10.0.0.0/24
	 */
	private String CidrBlock;
    /**
     * DHCP起始IP，Reserve类型时可以缺省。
     */
	private String DhcpIpFrom;
    /**
     * DHCP结束IP，Reserve类型时可以缺省。
     */
	private String DhcpIpTo;
    /**
     * NetworkAcl的ID，Reserve类型时可以缺省。
     */
	private String NetworkAclId;
    /**
     * 子网的Dns1，Reserve类型时可以缺省。
     */
	private String Dns1;
    /**
     * 子网的Dns2，Reserve类型时可以缺省。
     */
	private String Dns2;
    /**
     * 网关的IP，Reserve类型时可以缺省。
     */
	private String GatewayIp;
    /**
     * NAT的ID，Reserve类型时可以缺省。
     */
	private String NatId;
    /**
     * 子网的可用IP数量
     */
	private String AvailbleIPNumber;
    /**
     * 可用区的名称
     */
	private String AvailabilityZoneName;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getSubnetType() {
        return SubnetType;
    }

    public void setSubnetType(String subnetType) {
        SubnetType = subnetType;
    }

    public String getSubnetName() {
        return SubnetName;
    }

    public void setSubnetName(String subnetName) {
        SubnetName = subnetName;
    }

    public String getCidrBlock() {
        return CidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        CidrBlock = cidrBlock;
    }

    public String getDhcpIpFrom() {
        return DhcpIpFrom;
    }

    public void setDhcpIpFrom(String dhcpIpFrom) {
        DhcpIpFrom = dhcpIpFrom;
    }

    public String getDhcpIpTo() {
        return DhcpIpTo;
    }

    public void setDhcpIpTo(String dhcpIpTo) {
        DhcpIpTo = dhcpIpTo;
    }

    public String getNetworkAclId() {
        return NetworkAclId;
    }

    public void setNetworkAclId(String networkAclId) {
        NetworkAclId = networkAclId;
    }

    public String getDns1() {
        return Dns1;
    }

    public void setDns1(String dns1) {
        Dns1 = dns1;
    }

    public String getDns2() {
        return Dns2;
    }

    public void setDns2(String dns2) {
        Dns2 = dns2;
    }

    public String getGatewayIp() {
        return GatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        GatewayIp = gatewayIp;
    }

    public String getNatId() {
        return NatId;
    }

    public void setNatId(String natId) {
        NatId = natId;
    }

    public String getAvailbleIPNumber() {
        return AvailbleIPNumber;
    }

    public void setAvailbleIPNumber(String availbleIPNumber) {
        AvailbleIPNumber = availbleIPNumber;
    }

    public String getAvailabilityZoneName() {
        return AvailabilityZoneName;
    }

    public void setAvailabilityZoneName(String availabilityZoneName) {
        AvailabilityZoneName = availabilityZoneName;
    }
}
