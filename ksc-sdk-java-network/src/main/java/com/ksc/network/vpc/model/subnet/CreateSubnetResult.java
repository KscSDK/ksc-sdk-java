package com.ksc.network.vpc.model.subnet;

import com.ksc.network.vpc.model.vpc.Vpc;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateSubnet.
 * </p>
 */
@ToString
public class CreateSubnetResult implements Serializable, Cloneable {

	
	private String RequestId;

	private Subnet subnet;
	
	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public Subnet getSubnet() {
		return subnet;
	}

	public void setSubnet(Subnet subnet) {
		this.subnet = subnet;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		CreateSubnetResult other = (CreateSubnetResult) obj;
		if (RequestId == null) {
			if (other.RequestId != null)
				return false;
		} else if (!RequestId.equals(other.RequestId))
			return false;
		return true;
	}
	    
    @Override
    public CreateSubnetResult clone() {
        try {
            return (CreateSubnetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }	
}