package com.ksc.network.vpc.model.Route;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class NextHop {
	/**
	 * 下一跳实例的ID
	 */
	private String GatewayId;
	/**
	 * 下一跳实例的名称
	 */
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
