package com.ksc.network.vpc.model.Tunnels;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class AssociateSubnet {
	/**
	 * 子网的ID信息
	 */
	private String SubnetId;

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}
}
