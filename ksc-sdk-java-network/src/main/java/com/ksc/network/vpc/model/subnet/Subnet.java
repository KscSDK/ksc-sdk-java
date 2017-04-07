package com.ksc.network.vpc.model.subnet;

import lombok.ToString;
@ToString
public class Subnet {
	private String CreateTime;
	
	private String SubnetId;
	/**
	 * Vpc的ID
	 */
	private String VpcId;
	/**
	 * 子网的类型
	 */
	private String SubnetType;
	private String SubnetName;
	/**
	 * 子网的网络范围
	 */
	private String CidrBlock;
	private String DhcpIpFrom;
	private String DhcpIpTo;
	private String NetworkAclId;
	private String Dns1;
	private String Dns2;
	private String GatewayIp;
	private String NatId;
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
	
}
