package com.ksc.kec.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.ksc.internal.SdkInternalList;

@ToString
@EqualsAndHashCode
public class InstanceNetwork {

	private String NetworkInterfaceId;

	private String VpcId;

	private String SubnetId;

	private String MacAddress;

	private String PrivateIpAddress;

	private List<InstanceSecurityGroup> GroupSet = new SdkInternalList<InstanceSecurityGroup>();

	public InstanceNetwork withNetworkSecurityGroup(
			InstanceSecurityGroup... sgs) {
		for (InstanceSecurityGroup s : sgs) {
			GroupSet.add(s);
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

}
