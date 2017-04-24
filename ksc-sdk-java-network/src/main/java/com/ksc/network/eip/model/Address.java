package com.ksc.network.eip.model;

import lombok.ToString;

@ToString
public class Address {
	private String publicIp;

	private String state;

	private String allocationId;

	private String createTime;

	private String lineId;

	private String bandWidth;

	private String instanceType;

	private String instanceId;

	private String networkInterfaceId;

	private String internetGatewayId;

	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getBandWidth() {
		return bandWidth;
	}

	public void setBandWidth(String bandWidth) {
		this.bandWidth = bandWidth;
	}

	public String getInstanceType() {
		return instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getNetworkInterfaceId() {
		return networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
	}

	public String getInternetGatewayId() {
		return internetGatewayId;
	}

	public void setInternetGatewayId(String internetGatewayId) {
		this.internetGatewayId = internetGatewayId;
	}
}
