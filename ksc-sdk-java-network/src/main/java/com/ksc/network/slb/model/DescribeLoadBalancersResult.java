package com.ksc.network.slb.model;

import java.io.Serializable;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeLoadBalancers.
 * </p>
 */
@ToString
public class DescribeLoadBalancersResult implements Serializable, Cloneable {
	/**
	* 
	*/
	private static final long serialVersionUID = -1152397641363296840L;
	private String RequestId;
	/**
	 * <p>
	 * 负载均衡信息的列表
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<LoadBalance> LoadBalancerDescriptions;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public com.ksc.internal.SdkInternalList<LoadBalance> getLoadBalancerDescriptions() {
		return LoadBalancerDescriptions;
	}

	public void setLoadBalancerDescriptions(com.ksc.internal.SdkInternalList<LoadBalance> loadBalancerDescriptions) {
		LoadBalancerDescriptions = loadBalancerDescriptions;
	}

	public void addLoadBalancerDescriptions(LoadBalance... loadBalances) {
		if (this.LoadBalancerDescriptions == null) {
			this.LoadBalancerDescriptions = new com.ksc.internal.SdkInternalList<LoadBalance>();
		}
		for (LoadBalance loadBalance : loadBalances) {
			this.LoadBalancerDescriptions.add(loadBalance);
		}
	}

}
