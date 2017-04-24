package com.ksc.network.vpc.model.Tunnels;

import lombok.ToString;

@ToString
public class AssociateSubnet {
	private String SubnetId;

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}
}
