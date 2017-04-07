package com.ksc.network.vpc.model.Nat;

import lombok.ToString;

@ToString
public class NatIp {
	private String NatIp;

	public String getNatIp() {
		return NatIp;
	}

	public void setNatIp(String natIp) {
		NatIp = natIp;
	}
}
