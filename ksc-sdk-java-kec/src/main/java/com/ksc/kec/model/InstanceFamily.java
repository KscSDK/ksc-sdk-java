package com.ksc.kec.model;

import java.util.List;
import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class InstanceFamily {
	
    private List<AvailabilityZoneInfo> AvailabilityZoneSet;
	private String InstanceFamilyName;
	private String InstanceFamily;


	public InstanceFamily withAvailabilityZoneSet(AvailabilityZoneInfo... availabilityZoneInfo_set) {
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

	public String getInstanceFamily() {
		return InstanceFamily;
	}

	public void setInstanceFamily(String instanceFamily) {
		InstanceFamily = instanceFamily;
	}

	public String getInstanceFamilyName() {
		return InstanceFamilyName;
	}

	public void setInstanceFamilyName(String instanceFamilyName) {
		InstanceFamilyName = instanceFamilyName;
	}

}
