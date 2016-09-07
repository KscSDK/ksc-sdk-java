package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class InstanceState {

	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
