package com.ksc.tag.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.tag.model.transform.DescribeTagKeysRequestMarshaller;

public class DescribeTagKeysRequest extends KscWebServiceRequest
		implements Serializable, Cloneable,
		DryRunSupportedRequest<DescribeTagKeysRequest> {

	private static final long serialVersionUID = -8876069314183571503L;

	/**
	 * 资源类型
	 */
	private String resourceType;

	/**
	 * 用于限制本次查询结果返回的结果数量，如果仍有额外结果未显示，同时返回下次查询的起始点NextToken值
	 */
	private Integer maxResults;

	/**
	 * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点
	 */
	private String nextToken;

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
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
	public Request<DescribeTagKeysRequest> getDryRunRequest() {
		Request<DescribeTagKeysRequest> request = new DescribeTagKeysRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
