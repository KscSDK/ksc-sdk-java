package com.ksc.network.eip.model;

import lombok.ToString;

@ToString
public class Address {
	/**
	 * 弹性IP
	 */
	private String publicIp;

	/**
	 * 弹性IP的状态，已绑定(associate)，未绑定(disassociate)
	 */
	private String state;

	/**
	 * 弹性IP的ID
	 */
	private String allocationId;

	/**
	 * 弹性IP创建时间
	 */
	private String createTime;

	/**
	 * 弹性IP的线路类型的ID
	 */
	private String lineId;

	/**
	 * 弹性IP的带宽
	 */
	private String bandWidth;

	/**
	 * 绑定弹性IP的实例类型，IP映射(Ipfwd)，负载均衡（Slb）
	 */
	private String instanceType;

	/**
	 * 弹性IP绑定的实例信息。绑定类型为Ipfwd时，InstanceId为云服务器的ID。绑定类型为Slb时，InstanceId为弹性IP的ID。
	 */
	private String instanceId;

	/**
	 * 网络接口的标识，当InstanceType为Ipfwd时，不可缺省。
	 */
	private String networkInterfaceId;

	/**
	 * 互联网网关的ID
	 */
	private String internetGatewayId;

	/**
	 * 项目的ID
	 */
	private String projectId;

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

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
}
