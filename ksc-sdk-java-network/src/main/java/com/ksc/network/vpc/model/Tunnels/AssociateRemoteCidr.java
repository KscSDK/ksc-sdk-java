package com.ksc.network.vpc.model.Tunnels;

import lombok.ToString;

@ToString
public class AssociateRemoteCidr {
	private String CidrBlock;

	public String getCidrBlock() {
		return CidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		CidrBlock = cidrBlock;
	}
}
