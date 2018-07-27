package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class AvailabilityZone {

	private String AvailabilityZone;
	private String Region;
	
	public String getAvailabilityZone() {
		return AvailabilityZone;
	}
	public void setAvailabilityZone(String availabilityZone) {
		AvailabilityZone = availabilityZone;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	
}
