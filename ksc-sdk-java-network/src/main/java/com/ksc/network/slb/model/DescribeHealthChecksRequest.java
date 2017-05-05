package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.transform.DescribeHealthChecksRequestMarshaller;

import java.io.Serializable;

public class DescribeHealthChecksRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<DescribeHealthChecksRequest> {

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
	 * <code>listener-id</code> - 监听器的ID
	 * </p>
	 * </li>
	 * </ul>
	 */
	private com.ksc.internal.SdkInternalList<Filter> filters;
	/**
	 * <p>
	 * 健康检查的ID
	 * </p>
	 * <p>
	 * Default: 描述region下所有的健康检查
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> healthCheckIds;

	public com.ksc.internal.SdkInternalList<Filter> getFilters() {
		if (filters == null) {
			filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		return filters;
	}

	public void setFilters(com.ksc.internal.SdkInternalList<Filter> filters) {
		this.filters = filters;
	}

	public com.ksc.internal.SdkInternalList<String> getHealthCheckIds() {
		if (healthCheckIds == null) {
			healthCheckIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return healthCheckIds;
	}

	public void setHealthCheckIds(com.ksc.internal.SdkInternalList<String> healthCheckIds) {
		this.healthCheckIds = healthCheckIds;
	}

	public void addFilters(Filter... filters) {
		if (this.filters == null) {
			this.filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		for (Filter filter : filters) {
			this.filters.add(filter);
		}
	}

	public void addHealthCheckIds(String... healthCheckIds) {
		if (this.healthCheckIds == null) {
			this.healthCheckIds = new com.ksc.internal.SdkInternalList<String>();
		}
		for (String healthCheckId : healthCheckIds) {
			this.healthCheckIds.add(healthCheckId);
		}
	}

	@Override
	public Request<DescribeHealthChecksRequest> getDryRunRequest() {
		Request<DescribeHealthChecksRequest> request = new DescribeHealthChecksRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
