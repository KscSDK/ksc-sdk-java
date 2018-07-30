package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class AvailabilityZoneInfo {

	private String AzCode;

	public String getAzCode() {
		return AzCode;
	}

	public void setAzCode(String azCode) {
		AzCode = azCode;
	}
	
}
