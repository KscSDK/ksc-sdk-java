package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.internal.SdkInternalList;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.transform.DescribeListenersRequestMarshaller;

import java.io.Serializable;

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

	public SdkInternalList<Filter> getFilters() {
		return filters;
	}

	public void setFilters(SdkInternalList<Filter> filters) {
		this.filters = filters;
	}

	public SdkInternalList<String> getListenerIds() {
		return listenerIds;
	}

	public void setListenerIds(SdkInternalList<String> listenerIds) {
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DescribeListenersRequest that = (DescribeListenersRequest) o;

		if (filters != null ? !filters.equals(that.filters) : that.filters != null) return false;
		return listenerIds != null ? listenerIds.equals(that.listenerIds) : that.listenerIds == null;
	}

	@Override
	public int hashCode() {
		int result = filters != null ? filters.hashCode() : 0;
		result = 31 * result + (listenerIds != null ? listenerIds.hashCode() : 0);
		return result;
	}

	@Override
	public Request<DescribeListenersRequest> getDryRunRequest() {
		Request<DescribeListenersRequest> request = new DescribeListenersRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
