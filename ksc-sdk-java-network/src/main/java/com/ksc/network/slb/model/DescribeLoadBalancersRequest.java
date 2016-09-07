package com.ksc.network.slb.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.transform.DescribeLoadBalancersRequestMarshaller;

public class DescribeLoadBalancersRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<DescribeLoadBalancersRequest> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2681670918913999259L;
	/**
	 * <p>
	 * One or more filters. Filter names and values are case-sensitive.
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * <code>vpc-id</code> - VPC的ID.
	 * </p>
	 * </li>
	 * </ul>
	 */
	private com.ksc.internal.SdkInternalList<Filter> filters;
	/**
	 * <p>
	 * One or more LoadBalancerIds.
	 * </p>
	 * <p>
	 * Default: Describes all your LoadBalancer.
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> loadBalancerIds;

	private String state;

	public com.ksc.internal.SdkInternalList<Filter> getFilters() {
		if (filters == null) {
			filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		return filters;
	}

	public void setFilters(com.ksc.internal.SdkInternalList<Filter> filters) {
		this.filters = filters;
	}

	public com.ksc.internal.SdkInternalList<String> getLoadBalancerIds() {
		if (loadBalancerIds == null) {
			loadBalancerIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return loadBalancerIds;
	}

	public void setLoadBalancerIds(com.ksc.internal.SdkInternalList<String> loadBalancerIds) {
		this.loadBalancerIds = loadBalancerIds;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void addFilters(Filter... filters) {
		if (this.filters == null) {
			this.filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		for (Filter filter : filters) {
			this.filters.add(filter);
		}
	}

	public void addLoadBalancerIds(String... loadBalancerIds) {
		if (this.loadBalancerIds == null) {
			this.loadBalancerIds = new com.ksc.internal.SdkInternalList<String>();
		}
		for (String loadBalancerId : loadBalancerIds) {
			this.loadBalancerIds.add(loadBalancerId);
		}
	}

	@Override
	public Request<DescribeLoadBalancersRequest> getDryRunRequest() {
		Request<DescribeLoadBalancersRequest> request = new DescribeLoadBalancersRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
