package com.ksc.network.vpc.model.SecurityGroups;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.SecurityGroups.DeleteSecurityGroupRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteSecurityGroup.
 * </p>
 */
public class DeleteSecurityGroupRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteSecurityGroupRequest> {


    /**
     * 安全组的ID
     */
    private String SecurityGroupId;
    

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((SecurityGroupId == null) ? 0 : SecurityGroupId.hashCode());
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
		DeleteSecurityGroupRequest other = (DeleteSecurityGroupRequest) obj;
		if (SecurityGroupId == null) {
			if (other.SecurityGroupId != null)
				return false;
		} else if (!SecurityGroupId.equals(other.SecurityGroupId))
			return false;
		return true;
	}

	@Override
    public DeleteSecurityGroupRequest clone() {
        return (DeleteSecurityGroupRequest) super.clone();
    }

    @Override
    public Request<DeleteSecurityGroupRequest> getDryRunRequest() {
        Request<DeleteSecurityGroupRequest> request = new DeleteSecurityGroupRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}