package com.ksc.kec.model;

import java.io.Serializable;
import java.util.List;

import com.ksc.internal.SdkInternalList;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeInstanceTypeConfigs.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeInstanceTypeConfigsResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706216L;

	private String RequestId;

	private List<InstanceTypeConfig> InstanceTypeConfigSet = new SdkInternalList<InstanceTypeConfig>();

	public DescribeInstanceTypeConfigsResult withInstanceTypeConfigsSet(InstanceTypeConfig... instanceTypeConfigs) {
		for (InstanceTypeConfig instanceTypeConfig : instanceTypeConfigs) {
			this.InstanceTypeConfigSet.add(instanceTypeConfig);
		}
		return this;
	}

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}


	@Override
	public DescribeInstanceTypeConfigsResult clone() {
		try {
			return (DescribeInstanceTypeConfigsResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}