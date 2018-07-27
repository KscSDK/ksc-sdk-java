package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeRegionsResult implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private String RequestId;
	private List<Region> RegionSet;
	
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	
	public DescribeRegionsResult withRegion(Region... instances) {
		if(this.RegionSet == null){
			this.RegionSet = new ArrayList<Region>();
		}
		for (Region instance : instances) {
			this.RegionSet.add(instance);
		}
		return this;
	}
	
}
