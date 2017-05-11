package com.ksc.network.slb.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.transform.DescribeInstancesWithListenerRequestMarshaller;
import com.ksc.network.slb.model.transform.DescribeListenersRequestMarshaller;

public class DescribeListenersRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<DescribeListenersRequest> {

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
	 * <code>load-balancer-id</code> - 负载均衡的ID
	 * </p>
	 * </li>
	 * </ul>
	 */
	private com.ksc.internal.SdkInternalList<Filter> filters;
	/**
	 * <p>
	 * 监听器的ID
	 * </p>
	 * <p>
	 * Default: 描述region下所有的监听器信息
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> listenerIds;

	public com.ksc.internal.SdkInternalList<Filter> getFilters() {
		if (filters == null) {
			filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		return filters;
	}

	public void setFilters(com.ksc.internal.SdkInternalList<Filter> filters) {
		this.filters = filters;
	}

	public com.ksc.internal.SdkInternalList<String> getListenerIds() {
		if (listenerIds == null) {
			listenerIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return listenerIds;
	}

	public void setListenerIds(com.ksc.internal.SdkInternalList<String> listenerIds) {
		this.listenerIds = listenerIds;
	}

	public void addFilters(Filter... filters) {
		if (this.filters == null) {
			this.filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		for (Filter filter : filters) {
			this.filters.add(filter);
		}
	}

	public void addListenerIds(String... listenerIds) {
		if (this.listenerIds == null) {
			this.listenerIds = new com.ksc.internal.SdkInternalList<String>();
		}
		for (String listenerId : listenerIds) {
			this.listenerIds.add(listenerId);
		}
	}

	@Override
	public Request<DescribeListenersRequest> getDryRunRequest() {
		Request<DescribeListenersRequest> request = new DescribeListenersRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
