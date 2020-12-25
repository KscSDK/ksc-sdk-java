package com.ksc.kec.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import com.ksc.internal.SdkInternalList;

@ToString
@EqualsAndHashCode
public class InstanceNetwork {

	/**
	 * 网络接口ID
	 * 类型: String
	 * 是否可缺省: 否
	 */
	private String NetworkInterfaceId;

	/**
	 * 网卡的类型
	 * 有效值:primary|extension
	 * 类型:String
	 * 是否可缺省: 否
	 */
	private String NetworkInterfaceType;

	/**
	 *
	 */
	private String VpcId;

	/**
	 * 子网ID
	 * 类型: String
	 * 是否可缺省: 否
	 */
	private String SubnetId;

	/**
	 * 网卡的MAC地址
	 * 类型:String
	 * 是否可缺省: 否
	 */
	private String MacAddress;

	/**
	 * 私有IP地址
	 * 类型: String
	 * 是否可缺省: 否
	 */
	private String PrivateIpAddress;

	@Deprecated
	/**
	 * SecurityGroupSet兼容该属性
	 */
	private List<InstanceSecurityGroup> GroupSet = new SdkInternalList<InstanceSecurityGroup>();

	/**
	 * 实例绑定的安全组集合
	 * 类型: 安全组标识（GroupIdentifier） 列表
	 * 是否可缺省: 否
	 */
	private List<InstanceNetworkSecurityGroup> SecurityGroupSet = new SdkInternalList<InstanceNetworkSecurityGroup>();

	/**
	 * 公网IP地址
	 * 类型: String
	 * 是否可缺省: 是
	 */
	private String PublicIp;

	/**
	 * 公网IP的ID
	 * 类型: String
	 * 是否可缺省: 是
	 */
	private String AllocationId;

	/**
	 *Ipv6公网IP地址集合
	 * 类型: String
	 * 是否可缺省: 是
	 */
	private List<Ipv6PublicIpAddress> Ipv6PublicIpAddressSet;

	public InstanceNetwork withNetworkSecurityGroup(
			InstanceSecurityGroup... sgs) {
		for (InstanceSecurityGroup s : sgs) {
			GroupSet.add(s);
		}
		return this;
	}

	public InstanceNetwork withInstanceNetworkSecurityGroup(
			InstanceNetworkSecurityGroup... sgs) {
		for (InstanceNetworkSecurityGroup s : sgs) {
			SecurityGroupSet.add(s);
		}
		return this;
	}

	public InstanceNetwork withIpv6PublicIpAddressSet(Ipv6PublicIpAddress... ipv6PublicIpAddressSet) {
		if (this.Ipv6PublicIpAddressSet == null) {
			this.Ipv6PublicIpAddressSet = new SdkInternalList<Ipv6PublicIpAddress>();
		}
		for (Ipv6PublicIpAddress n : ipv6PublicIpAddressSet) {
			this.Ipv6PublicIpAddressSet.add(n);
		}
		return this;
	}

	public String getNetworkInterfaceId() {
		return NetworkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		NetworkInterfaceId = networkInterfaceId;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}

	public String getMacAddress() {
		return MacAddress;
	}

	public void setMacAddress(String macAddress) {
		MacAddress = macAddress;
	}

	public String getPrivateIpAddress() {
		return PrivateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}

	public List<InstanceSecurityGroup> getGroupSet() {
		return GroupSet;
	}

	public void setGroupSet(List<InstanceSecurityGroup> groupSet) {
		GroupSet = groupSet;
	}

	public String getNetworkInterfaceType() {
		return NetworkInterfaceType;
	}

	public void setNetworkInterfaceType(String networkInterfaceType) {
		NetworkInterfaceType = networkInterfaceType;
	}

	public List<InstanceNetworkSecurityGroup> getSecurityGroupSet() {
		return SecurityGroupSet;
	}

	public void setSecurityGroupSet(List<InstanceNetworkSecurityGroup> securityGroupSet) {
		SecurityGroupSet = securityGroupSet;
	}

	public String getPublicIp() {
		return PublicIp;
	}

	public void setPublicIp(String publicIp) {
		PublicIp = publicIp;
	}

	public String getAllocationId() {
		return AllocationId;
	}

	public void setAllocationId(String allocationId) {
		AllocationId = allocationId;
	}

	public List<Ipv6PublicIpAddress> getIpv6PublicIpAddressSet() {
		return Ipv6PublicIpAddressSet;
	}

	public void setIpv6PublicIpAddressSet(List<Ipv6PublicIpAddress> ipv6PublicIpAddressSet) {
		Ipv6PublicIpAddressSet = ipv6PublicIpAddressSet;
	}

	@ToString
	@Setter
	public static class Ipv6PublicIpAddress {
		private String Ipv6PublicIpAddress;
	}
}
