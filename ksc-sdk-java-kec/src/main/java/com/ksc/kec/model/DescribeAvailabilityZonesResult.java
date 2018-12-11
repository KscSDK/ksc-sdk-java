package com.ksc.kec.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeAvailabilityZonesResult implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private String RequestId;
	private List<AvailabilityZone> AvailabilityZoneSet;
	
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public List<AvailabilityZone> getAvailabilityZoneSet() {
		return AvailabilityZoneSet;
	}

	public void setAvailabilityZoneSet(List<AvailabilityZone> availabilityZoneSet) {
		AvailabilityZoneSet = availabilityZoneSet;
	}

	public DescribeAvailabilityZonesResult withAvailabilityZone(AvailabilityZone... instances) {
		if(this.AvailabilityZoneSet == null){
			this.AvailabilityZoneSet = new ArrayList<AvailabilityZone>();
		}
		for (AvailabilityZone instance : instances) {
			this.AvailabilityZoneSet.add(instance);
		}
		return this;
	}
	
}
