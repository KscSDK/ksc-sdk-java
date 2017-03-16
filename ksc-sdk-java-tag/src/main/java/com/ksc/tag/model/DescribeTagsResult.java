package com.ksc.tag.model;

import java.io.Serializable;

import lombok.ToString;

@ToString
public class DescribeTagsResult implements Serializable, Cloneable {

	private static final long serialVersionUID = 7810997963056861914L;

	private String requestId;

	/**
	 * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
	 */
	private String nextToken;

	/**
	 * 返回匹配当前过滤参数的描述结果的总数（与是否分页无关）
	 */
	private Integer tagSum;

	/**
	 * “标签描述”列表
	 */
	private com.ksc.internal.SdkInternalList<TagDescription> tagSet;

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

	public Integer getTagSum() {
		return tagSum;
	}

	public void setTagSum(Integer tagSum) {
		this.tagSum = tagSum;
	}

	public com.ksc.internal.SdkInternalList<TagDescription> getTagSet() {
		return tagSet;
	}

	public void setTagSet(
			com.ksc.internal.SdkInternalList<TagDescription> tagSet) {
		this.tagSet = tagSet;
	}

	public DescribeTagsResult withTagSet(TagDescription... tagSet) {
		if (this.tagSet == null) {
			setTagSet(new com.ksc.internal.SdkInternalList<TagDescription>());
		}
		for (TagDescription ele : tagSet) {
			this.tagSet.add(ele);
		}
		return this;
	}

}
