package com.ksc.tag.model;

import lombok.ToString;

@ToString
public class DescribeTagKeysResult {

	private String requestId;
	/**
	 * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
	 */
	private String nextToken;

	/**
	 * 本次查询返回的标签分类总数（与是否分页无关）
	 */
	private Integer tagKeySum;

	/**
	 * “标签分类”列表
	 */
	private com.ksc.internal.SdkInternalList<String> tagKeySet;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTagKeySum() {
		return tagKeySum;
	}

	public void setTagKeySum(Integer tagKeySum) {
		this.tagKeySum = tagKeySum;
	}

	public com.ksc.internal.SdkInternalList<String> getTagKeySet() {
		return tagKeySet;
	}

	public void setTagKeySet(
			com.ksc.internal.SdkInternalList<String> tagKeySet) {
		this.tagKeySet = tagKeySet;
	}

	public DescribeTagKeysResult withTagKeySet(String... keys) {
		if (this.tagKeySet == null) {
			setTagKeySet(new com.ksc.internal.SdkInternalList<String>());
		}
		for (String ele : keys) {
			this.tagKeySet.add(ele);
		}
		return this;
	}

}
