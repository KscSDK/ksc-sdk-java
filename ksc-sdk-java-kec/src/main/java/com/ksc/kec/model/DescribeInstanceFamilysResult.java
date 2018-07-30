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
public class DescribeInstanceFamilysResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706216L;

	private String RequestId;

	private List<InstanceFamily> InstanceFamilySet = new SdkInternalList<InstanceFamily>();

	public DescribeInstanceFamilysResult withInstanceFamilysSet(InstanceFamily... instanceFamilys) {
		for (InstanceFamily instanceFamily : instanceFamilys) {
			this.InstanceFamilySet.add(instanceFamily);
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
	public DescribeInstanceFamilysResult clone() {
		try {
			return (DescribeInstanceFamilysResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}