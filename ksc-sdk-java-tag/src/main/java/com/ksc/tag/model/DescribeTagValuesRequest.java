package com.ksc.tag.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.tag.model.transform.DescribeTagValuesRequestMarshaller;

public class DescribeTagValuesRequest extends KscWebServiceRequest
		implements Serializable, Cloneable,
		DryRunSupportedRequest<DescribeTagValuesRequest> {

	private static final long serialVersionUID = -2254227753125991473L;

	/**
	 * 标签分类
	 */
	private String tagKey;

	/**
	 * 用于限制本次查询结果返回的结果数量，如果仍有额外结果未显示，同时返回下次查询的起始点NextToken值
	 */
	private Integer maxResults;

	/**
	 * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点
	 */
	private String nextToken;

	public String getTagKey() {
		return tagKey;
	}

	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
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
	public Request<DescribeTagValuesRequest> getDryRunRequest() {
		Request<DescribeTagValuesRequest> request = new DescribeTagValuesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
