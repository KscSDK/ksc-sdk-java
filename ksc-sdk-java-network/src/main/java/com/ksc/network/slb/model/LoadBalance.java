package com.ksc.network.slb.model;

import lombok.Data;
import lombok.ToString;

@Data
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
	 * 负载均衡类型，公网（public）是支持公网的负载均衡、私网（internal）是VPC内部的负载均衡
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

	/**
	 * 项目的ID
	 */
	private String ProjectId;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		LoadBalance that = (LoadBalance) o;

		if (CreateTime != null ? !CreateTime.equals(that.CreateTime) : that.CreateTime != null) return false;
		if (LoadBalancerName != null ? !LoadBalancerName.equals(that.LoadBalancerName) : that.LoadBalancerName != null)
			return false;
		if (VpcId != null ? !VpcId.equals(that.VpcId) : that.VpcId != null) return false;
		if (LoadBalancerId != null ? !LoadBalancerId.equals(that.LoadBalancerId) : that.LoadBalancerId != null)
			return false;
		if (Type != null ? !Type.equals(that.Type) : that.Type != null) return false;
		if (SubnetId != null ? !SubnetId.equals(that.SubnetId) : that.SubnetId != null) return false;
		if (AllocationId != null ? !AllocationId.equals(that.AllocationId) : that.AllocationId != null) return false;
		if (PublicIp != null ? !PublicIp.equals(that.PublicIp) : that.PublicIp != null) return false;
		if (State != null ? !State.equals(that.State) : that.State != null) return false;
		if (LoadBalancerState != null ? !LoadBalancerState.equals(that.LoadBalancerState) : that.LoadBalancerState != null)
			return false;
		return ProjectId != null ? ProjectId.equals(that.ProjectId) : that.ProjectId == null;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (CreateTime != null ? CreateTime.hashCode() : 0);
		result = 31 * result + (LoadBalancerName != null ? LoadBalancerName.hashCode() : 0);
		result = 31 * result + (VpcId != null ? VpcId.hashCode() : 0);
		result = 31 * result + (LoadBalancerId != null ? LoadBalancerId.hashCode() : 0);
		result = 31 * result + (Type != null ? Type.hashCode() : 0);
		result = 31 * result + (SubnetId != null ? SubnetId.hashCode() : 0);
		result = 31 * result + (AllocationId != null ? AllocationId.hashCode() : 0);
		result = 31 * result + (PublicIp != null ? PublicIp.hashCode() : 0);
		result = 31 * result + (State != null ? State.hashCode() : 0);
		result = 31 * result + (LoadBalancerState != null ? LoadBalancerState.hashCode() : 0);
		result = 31 * result + (ProjectId != null ? ProjectId.hashCode() : 0);
		return result;
	}
}
