package com.ksc.tag.model;

import lombok.ToString;

@ToString
public class TagDescription {

	/**
	 * 标签分类
	 */
	private String key;

	/**
	 * 标签名称/值
	 */
	private String value;

	/**
	 * 资源ID
	 */
	private String resourceId;

	/**
	 * 资源类型
	 */
	private String resourceType;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

}
