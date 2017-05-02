package com.ksc.network.slb;

import com.ksc.network.slb.model.*;

public interface KSCSLB {
	/**
	 * <p>
	 * Describes one or more of your LoadBalancers.
	 * </p>
	 * 
	 * @param describeLoadBalancersRequest
	 *            Contains the parameters for DescribeLoadBalancers.
	 * @return Result of the DescribeAddresses operation returned by the
	 *         service.
	 * @sample KSC.DescribeLoadBalancers
	 */

	/**
	 * 描述负载均衡
	 */
	public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest);

	/**
	 * 创建负载均衡
	 */
	public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest);

	/**
	 * 删除负载均衡
	 */
	public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

	/**
	 * 更新负载均衡信息
	 */
	public ModifyLoadBalancerResult modifyLoadBalancer(ModifyLoadBalancerRequest modifyLoadBalancerRequest);

	/**
	 * 创建监听器
	 */
	public CreateListenersResult createListeners(CreateListenersRequest createListenersRequest);

}
