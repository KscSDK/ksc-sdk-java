package com.ksc.network.vpc.model.InternetGateways;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Portfwd {
	private String PortfwdId;

	public String getPortfwdId() {
		return PortfwdId;
	}

	public void setPortfwdId(String portfwdId) {
		PortfwdId = portfwdId;
	}
	
}
