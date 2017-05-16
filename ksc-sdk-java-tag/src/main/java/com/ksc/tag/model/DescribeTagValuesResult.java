package com.ksc.tag.model;

import lombok.ToString;

@ToString
public class DescribeTagValuesResult {
	
	private String requestId;
	
	/**
	 * 本次查询返回的标签名称总数（与是否分页无关）
	 */
	private Integer tagValueSum;
	
	/**
	 * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
	 */
	private String nextToken;
	
	/**
	 * “标签”列表
	 */
	private com.ksc.internal.SdkInternalList<Tag> tagValueSet;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTagValueSum() {
		return tagValueSum;
	}

	public void setTagValueSum(Integer tagValueSum) {
		this.tagValueSum = tagValueSum;
	}

	public String getNextToken() {
		return nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public com.ksc.internal.SdkInternalList<Tag> getTagValueSet() {
		return tagValueSet;
	}

	public void setTagValueSet(com.ksc.internal.SdkInternalList<Tag> tagValueSet) {
		this.tagValueSet = tagValueSet;
	}
	
	public DescribeTagValuesResult withTagSet(Tag... tagSet) {
		if (this.tagValueSet == null) {
			setTagValueSet(new com.ksc.internal.SdkInternalList<Tag>());
		}
		for (Tag ele : tagSet) {
			this.tagValueSet.add(ele);
		}
		return this;
	}
	
}
