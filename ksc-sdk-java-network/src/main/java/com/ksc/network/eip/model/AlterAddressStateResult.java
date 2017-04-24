
package com.ksc.network.eip.model;

import java.io.Serializable;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class AlterAddressStateResult implements Serializable, Cloneable {

	
	private String RequestId;

	private Boolean Return;
	
	public String getRequestId() {
		return RequestId;
	}


	public void setRequestId(String requestId) {
		RequestId = requestId;
	}


	public Boolean getReturn() {
		return Return;
	}


	public void setReturn(Boolean return1) {
		Return = return1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((RequestId == null) ? 0 : RequestId.hashCode());
		result = prime * result + ((Return == null) ? 0 : Return.hashCode());
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
		AlterAddressStateResult other = (AlterAddressStateResult) obj;
		if (RequestId == null) {
			if (other.RequestId != null)
				return false;
		} else if (!RequestId.equals(other.RequestId))
			return false;
		if (Return == null) {
			if (other.Return != null)
				return false;
		} else if (!Return.equals(other.Return))
			return false;
		return true;
	}
	
    @Override
    public AlterAddressStateResult clone() {
        try {
            return (AlterAddressStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}
	