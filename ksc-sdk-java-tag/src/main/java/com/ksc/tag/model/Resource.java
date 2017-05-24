package com.ksc.tag.model;

import lombok.ToString;

@ToString
public class Resource {

	/**
	 * 资源ID
	 */
	private String id;

	/**
	 * 资源类型
	 */
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
