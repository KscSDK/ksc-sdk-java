package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeInstanceTypeConfigsRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeInstanceTypeConfigsRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeInstanceTypeConfigsRequest>{

	private static final long serialVersionUID = 1L;
	
	private com.ksc.internal.SdkInternalList<Filter> filters;
	
	@Override
	public Request<DescribeInstanceTypeConfigsRequest> getDryRunRequest() {
		Request<DescribeInstanceTypeConfigsRequest> request = new DescribeInstanceTypeConfigsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
	public DescribeInstanceTypeConfigsRequest withFilters(
			java.util.Collection<Filter> filters) {
		setFilters(filters);
		return this;
	}
	
	public DescribeInstanceTypeConfigsRequest withFilters(Filter... filters) {
		if (this.filters == null) {
			setFilters(new com.ksc.internal.SdkInternalList<Filter>(
					filters.length));
		}
		for (Filter ele : filters) {
			this.filters.add(ele);
		}
		return this;
	}
	
	public void setFilters(java.util.Collection<Filter> filters) {
		if (filters == null) {
			this.filters = null;
			return;
		}

		this.filters = new com.ksc.internal.SdkInternalList<Filter>(
				filters);
	}
	
	public java.util.List<Filter> getFilters() {
		if (filters == null) {
			filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		return filters;
	}
	
}
