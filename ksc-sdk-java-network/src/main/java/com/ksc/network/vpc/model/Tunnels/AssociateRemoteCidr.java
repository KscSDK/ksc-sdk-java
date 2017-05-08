package com.ksc.network.vpc.model.Tunnels;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class AssociateRemoteCidr {
	/**
	 * 网段
	 */
	private String CidrBlock;

	public String getCidrBlock() {
		return CidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		CidrBlock = cidrBlock;
	}
}
