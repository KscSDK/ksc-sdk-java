package com.ksc.network.vpc.model.Route;

import lombok.ToString;

@ToString
public class NextHop {
	private String GatewayId;
	
	private String GatewayName;

	public String getGatewayId() {
		return GatewayId;
	}

	public void setGatewayId(String gatewayId) {
		GatewayId = gatewayId;
	}

	public String getGatewayName() {
		return GatewayName;
	}

	public void setGatewayName(String gatewayName) {
		GatewayName = gatewayName;
	}
	
}
