package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class InstanceConfigure {

	private Integer VCPU;

	private Integer MemoryGb;

	private Integer DataDiskGb;

	private String DataDiskType;

	public Integer getVCPU() {
		return VCPU;
	}

	public void setVCPU(Integer vCPU) {
		VCPU = vCPU;
	}

	public Integer getMemoryGb() {
		return MemoryGb;
	}

	public void setMemoryGb(Integer memoryGb) {
		MemoryGb = memoryGb;
	}

	public Integer getDataDiskGb() {
		return DataDiskGb;
	}

	public void setDataDiskGb(Integer dataDiskGb) {
		DataDiskGb = dataDiskGb;
	}

	public String getDataDiskType() {
		return DataDiskType;
	}

	public void setDataDiskType(String dataDiskType) {
		DataDiskType = dataDiskType;
	}

}
