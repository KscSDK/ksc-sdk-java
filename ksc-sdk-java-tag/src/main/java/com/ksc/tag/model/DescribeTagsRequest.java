package com.ksc.tag.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.tag.model.transform.DescribeTagsRequestMarshaller;

import lombok.ToString;

@ToString
public class DescribeTagsRequest extends KscWebServiceRequest implements
		Serializable, Cloneable, DryRunSupportedRequest<DescribeTagsRequest> {

	private static final long serialVersionUID = -4895893920287499727L;

	/**
	 * 过滤参数列表，缺省描述当前region下所有的标签
	 */
	private com.ksc.internal.SdkInternalList<Filter> filters;

	/**
	 * 用于限制本次查询结果返回的结果数量，如果仍有额外结果未显示，同时返回下次查询的起始点NextToken值
	 */
	private Integer maxResults;

	/**
	 * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点
	 */
	private String nextToken;

	public java.util.List<Filter> getFilters() {
		if (filters == null) {
			filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		return filters;
	}

	public void setFilters(java.util.Collection<Filter> filters) {
		if (filters == null) {
			this.filters = null;
			return;
		}

		this.filters = new com.ksc.internal.SdkInternalList<Filter>(filters);
	}

	public DescribeTagsRequest withFilters(Filter... filters) {
		if (this.filters == null) {
			setFilters(new com.ksc.internal.SdkInternalList<Filter>(
					filters.length));
		}
		for (Filter ele : filters) {
			this.filters.add(ele);
		}
		return this;
	}

	public DescribeTagsRequest withFilters(
			java.util.Collection<Filter> filters) {
		setFilters(filters);
		return this;
	}

	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	@Override
	public Request<DescribeTagsRequest> getDryRunRequest() {
		Request<DescribeTagsRequest> request = new DescribeTagsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
