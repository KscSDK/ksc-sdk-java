package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class InstanceMonitor {

	private String State;

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}
