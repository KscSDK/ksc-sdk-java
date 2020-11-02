package com.ksc.kec.model;

import java.util.List;
import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class InstanceTypeConfig {
	
    private List<AvailabilityZoneInfo> AvailabilityZoneSet;
	private String InstanceType;
	private String InstanceFamily;
	private Integer GPU;
	private Integer CPU;
	private Integer Memory;
	private Integer DataDiskMax;
	private Integer DataDiskMin;
	private Boolean SriovNetSupport;


	public InstanceTypeConfig withAvailabilityZoneSet(AvailabilityZoneInfo... availabilityZoneInfo_set) {
		if (this.AvailabilityZoneSet == null) {
			this.AvailabilityZoneSet = new SdkInternalList<AvailabilityZoneInfo>();
		}
		for (AvailabilityZoneInfo n : availabilityZoneInfo_set) {
			this.AvailabilityZoneSet.add(n);
		}
		return this;
	}

	public List<AvailabilityZoneInfo> getAvailabilityZoneSet() {
		return AvailabilityZoneSet;
	}

	public void setAvailabilityZoneSet(List<AvailabilityZoneInfo> availabilityZoneSet) {
		AvailabilityZoneSet = availabilityZoneSet;
	}

	public String getInstanceType() {
		return InstanceType;
	}

	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}

	public String getInstanceFamily() {
		return InstanceFamily;
	}

	public void setInstanceFamily(String instanceFamily) {
		InstanceFamily = instanceFamily;
	}

	public Integer getGPU() {
		return GPU;
	}

	public void setGPU(Integer gPU) {
		GPU = gPU;
	}

	public Integer getCPU() {
		return CPU;
	}

	public void setCPU(Integer cPU) {
		CPU = cPU;
	}

	public Integer getMemory() {
		return Memory;
	}

	public void setMemory(Integer memory) {
		Memory = memory;
	}

	public Integer getDataDiskMax() {
		return DataDiskMax;
	}

	public void setDataDiskMax(Integer dataDiskMax) {
		DataDiskMax = dataDiskMax;
	}

	public Integer getDataDiskMin() {
		return DataDiskMin;
	}

	public void setDataDiskMin(Integer dataDiskMin) {
		DataDiskMin = dataDiskMin;
	}

	public Boolean getSriovNetSupport() {
		return SriovNetSupport;
	}

	public void setSriovNetSupport(Boolean sriovNetSupport) {
		SriovNetSupport = sriovNetSupport;
	}

}
