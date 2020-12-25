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
	private String InstanceFamilyName;
	private List<SystemDiskQuotaInfo> SystemDiskQuotaSet;
	private List<DataDiskQuotaInfo> DataDiskQuotaSet;
	private Integer CPU;
	private Integer Memory;


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

	public String getInstanceFamilyName() {
		return InstanceFamilyName;
	}

	public void setInstanceFamilyName(String instanceFamilyName) {
		InstanceFamilyName = instanceFamilyName;
	}

	public List<SystemDiskQuotaInfo> getSystemDiskQuotaSet() {
		return SystemDiskQuotaSet;
	}

	public void setSystemDiskQuotaSet(List<SystemDiskQuotaInfo> systemDiskQuotaSet) {
		SystemDiskQuotaSet = systemDiskQuotaSet;
	}

	public List<DataDiskQuotaInfo> getDataDiskQuotaSet() {
		return DataDiskQuotaSet;
	}

	public void setDataDiskQuotaSet(List<DataDiskQuotaInfo> dataDiskQuotaSet) {
		DataDiskQuotaSet = dataDiskQuotaSet;
	}

	public InstanceTypeConfig withSystemDiskQuotaSet(SystemDiskQuotaInfo... systemDiskQuotaInfos) {
		if (this.SystemDiskQuotaSet == null) {
			this.SystemDiskQuotaSet = new SdkInternalList<SystemDiskQuotaInfo>();
		}
		for (SystemDiskQuotaInfo n : systemDiskQuotaInfos) {
			this.SystemDiskQuotaSet.add(n);
		}
		return this;
	}

	public InstanceTypeConfig withDataDiskQuotaSet(DataDiskQuotaInfo... dataDiskQuotaInfos) {
		if (this.DataDiskQuotaSet == null) {
			this.DataDiskQuotaSet = new SdkInternalList<DataDiskQuotaInfo>();
		}
		for (DataDiskQuotaInfo n : dataDiskQuotaInfos) {
			this.DataDiskQuotaSet.add(n);
		}
		return this;
	}
}
