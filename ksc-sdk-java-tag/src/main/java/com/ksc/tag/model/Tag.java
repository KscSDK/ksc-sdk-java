package com.ksc.tag.model;

import lombok.ToString;

@ToString
public class Tag {
	/**
	 * 标签分类
	 */
	private String key;

	/**
	 * 标签名称/值
	 */
	private String value;
	

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

}
