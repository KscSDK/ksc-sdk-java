package com.ksc.network.vpc.model.SecurityGroups;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateSecurityGroup.
 * </p>
 */
@ToString
public class CreateSecurityGroupResult implements Serializable, Cloneable {

	
	private String RequestId;

	private SecurityGroup SecurityGroup;
	
	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public SecurityGroup getSecurityGroup() {
		return SecurityGroup;
	}

	public void setSecurityGroup(SecurityGroup securityGroup) {
		SecurityGroup = securityGroup;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((RequestId == null) ? 0 : RequestId.hashCode());
		result = prime * result
				+ ((SecurityGroup == null) ? 0 : SecurityGroup.hashCode());
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
		CreateSecurityGroupResult other = (CreateSecurityGroupResult) obj;
		if (RequestId == null) {
			if (other.RequestId != null)
				return false;
		} else if (!RequestId.equals(other.RequestId))
			return false;
		if (SecurityGroup == null) {
			if (other.SecurityGroup != null)
				return false;
		} else if (!SecurityGroup.equals(other.SecurityGroup))
			return false;
		return true;
	}
	

    
    @Override
    public CreateSecurityGroupResult clone() {
        try {
            return (CreateSecurityGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}