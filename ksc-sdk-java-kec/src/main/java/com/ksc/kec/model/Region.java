package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class Region {

	private String RegionName;
	private String Region;

	public String getRegionName() {
		return RegionName;
	}

	public void setRegionName(String regionName) {
		RegionName = regionName;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}
}
