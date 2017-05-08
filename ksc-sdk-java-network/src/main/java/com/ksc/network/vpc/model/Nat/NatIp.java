package com.ksc.network.vpc.model.Nat;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class NatIp {

	/**
	 * Nat的IP
     */
	private String NatIp;

	public String getNatIp() {
		return NatIp;
	}

	public void setNatIp(String natIp) {
		NatIp = natIp;
	}
}
