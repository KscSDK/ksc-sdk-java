package com.ksc.epc.model;

import lombok.ToString;

@ToString
public class Disk {
	private String DiskName;
	private String Raid;
	private String Space;
	public String getDiskName() {
		return DiskName;
	}
	public void setDiskName(String diskName) {
		DiskName = diskName;
	}
	public String getRaid() {
		return Raid;
	}
	public void setRaid(String raid) {
		Raid = raid;
	}
	public String getSpace() {
		return Space;
	}
	public void setSpace(String space) {
		Space = space;
	}
	
}
