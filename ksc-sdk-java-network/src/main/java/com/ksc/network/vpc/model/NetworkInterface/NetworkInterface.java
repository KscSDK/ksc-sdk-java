package com.ksc.network.vpc.model.NetworkInterface;

import lombok.ToString;

@ToString
public class NetworkInterface {
	private String VpcId;
	private String VpcName;
	private String SubnetId;
	private String SubnetName;
	private String CidrBlock;
	private String SecurityGroupId;
	private String SecurityGroupName;
	private String InstanceId;
	private String PrivateIpAddress;
	private String InstanceType;
	private String DNS2;
	private String DNS1;
	private String NetworkInterfaceId;

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getVpcName() {
		return VpcName;
	}

	public void setVpcName(String vpcName) {
		VpcName = vpcName;
	}

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
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

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getSecurityGroupName() {
		return SecurityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getPrivateIpAddress() {
		return PrivateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}

	public String getInstanceType() {
		return InstanceType;
	}

	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}

	public String getDNS2() {
		return DNS2;
	}

	public void setDNS2(String dNS2) {
		DNS2 = dNS2;
	}

	public String getDNS1() {
		return DNS1;
	}

	public void setDNS1(String dNS1) {
		DNS1 = dNS1;
	}

	public String getNetworkInterfaceId() {
		return NetworkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		NetworkInterfaceId = networkInterfaceId;
	}

}
