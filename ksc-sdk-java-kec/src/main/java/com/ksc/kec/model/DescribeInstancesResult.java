package com.ksc.kec.model;

import java.io.Serializable;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeInstances.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeInstancesResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706216L;

	private Integer Marker;

	private Integer InstanceCount;

	private String RequestId;

	private List<Instance> InstancesSet = new SdkInternalList<Instance>();

	public DescribeInstancesResult withInstancesSet(Instance... instances) {
		for (Instance instance : instances) {
			this.InstancesSet.add(instance);
		}
		return this;
	}

	public Integer getMarker() {
		return Marker;
	}

	public void setMarker(Integer marker) {
		Marker = marker;
	}

	public Integer getInstanceCount() {
		return InstanceCount;
	}

	public void setInstanceCount(Integer instanceCount) {
		InstanceCount = instanceCount;
	}

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public List<Instance> getInstancesSet() {
		return InstancesSet;
	}

	public void setInstancesSet(List<Instance> instancesSet) {
		InstancesSet = instancesSet;
	}

	@Override
	public DescribeInstancesResult clone() {
		try {
			return (DescribeInstancesResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}