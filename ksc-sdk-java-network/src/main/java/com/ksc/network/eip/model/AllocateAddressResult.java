package com.ksc.network.eip.model;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class AllocateAddressResult implements Serializable, Cloneable {

	
	private String RequestId;

	private String PublicIp;
	
	private String AllocationId;
	
    @Override
    public AllocateAddressResult clone() {
        try {
            return (AllocateAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public String getPublicIp() {
		return PublicIp;
	}

	public void setPublicIp(String publicIp) {
		PublicIp = publicIp;
	}

	public String getAllocationId() {
		return AllocationId;
	}

	public void setAllocationId(String allocationId) {
		AllocationId = allocationId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((AllocationId == null) ? 0 : AllocationId.hashCode());
		result = prime * result
				+ ((PublicIp == null) ? 0 : PublicIp.hashCode());
		result = prime * result
				+ ((RequestId == null) ? 0 : RequestId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllocateAddressResult other = (AllocateAddressResult) obj;
		if (AllocationId == null) {
			if (other.AllocationId != null)
				return false;
		} else if (!AllocationId.equals(other.AllocationId))
			return false;
		if (PublicIp == null) {
			if (other.PublicIp != null)
				return false;
		} else if (!PublicIp.equals(other.PublicIp))
			return false;
		if (RequestId == null) {
			if (other.RequestId != null)
				return false;
		} else if (!RequestId.equals(other.RequestId))
			return false;
		return true;
	}
}