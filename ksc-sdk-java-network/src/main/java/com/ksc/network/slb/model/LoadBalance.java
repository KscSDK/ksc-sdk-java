package com.ksc.network.slb.model;

import lombok.ToString;

@ToString
public class LoadBalance {
	/**
	 * 负载均衡创建时间
	 */
	private String CreateTime;
	/**
	 * 负载均衡的名称
	 */
	private String LoadBalancerName;
	/**
	 * Vpc的ID
	 */
	private String VpcId;
	/**
	 * 负载均衡的ID
	 */
	private String LoadBalancerId;
	/**
	 * 提供特殊的负载均衡，在VPC内部的负载均衡
	 */
	private String Type;
	/**
	 * 子网的ID
	 */
	private String SubnetId;
	/**
	 * EIP的ID
	 */
	private String AllocationId;
	/**
	 * 弹性IP
	 */
	private String PublicIp;
	/**
	 * 负载均衡的状态，已绑定，未绑定
	 */
	private String State;
	/**
	 * 负载均衡的状态，开启和关闭状态
	 */
	private String LoadBalancerState;

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getLoadBalancerName() {
		return LoadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		LoadBalancerName = loadBalancerName;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getLoadBalancerId() {
		return LoadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}

	public String getAllocationId() {
		return AllocationId;
	}

	public void setAllocationId(String allocationId) {
		AllocationId = allocationId;
	}

	public String getPublicIp() {
		return PublicIp;
	}

	public void setPublicIp(String publicIp) {
		PublicIp = publicIp;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getLoadBalancerState() {
		return LoadBalancerState;
	}

	public void setLoadBalancerState(String loadBalancerState) {
		LoadBalancerState = loadBalancerState;
	}

}
