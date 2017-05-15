package com.ksc.network.vpc.model.SecurityGroups;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
<<<<<<< HEAD
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.transform.SecurityGroups.AuthorizeSecurityGroupEntryRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.CreateSecurityGroupRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.RevokeSecurityGroupEntryRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DescribeVpcsRequestMarshaller;
=======
import com.ksc.network.vpc.transform.SecurityGroups.RevokeSecurityGroupEntryRequestMarshaller;
>>>>>>> v4.0.0

import java.io.Serializable;

/**
 * <p>
<<<<<<< HEAD
 * Contains the parameters for AuthorizeSecurityGroupEntry.
=======
 * Contains the parameters for RevokeSecurityGroupEntry.
>>>>>>> v4.0.0
 * </p>
 */
public class RevokeSecurityGroupEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<RevokeSecurityGroupEntryRequest> {

<<<<<<< HEAD

=======
>>>>>>> v4.0.0
    /**
     * 安全组的ID
     */
    private String SecurityGroupId;

    /**
     * 安全组规则的ID
     */
    private String SecurityGroupEntryId;
<<<<<<< HEAD
    

=======
>>>>>>> v4.0.0

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getSecurityGroupEntryId() {
		return SecurityGroupEntryId;
	}

	public void setSecurityGroupEntryId(String securityGroupEntryId) {
		SecurityGroupEntryId = securityGroupEntryId;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((SecurityGroupEntryId == null) ? 0 : SecurityGroupEntryId
						.hashCode());
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
		RevokeSecurityGroupEntryRequest other = (RevokeSecurityGroupEntryRequest) obj;
		if (SecurityGroupEntryId == null) {
			if (other.SecurityGroupEntryId != null)
				return false;
		} else if (!SecurityGroupEntryId.equals(other.SecurityGroupEntryId))
			return false;
		if (SecurityGroupId == null) {
			if (other.SecurityGroupId != null)
				return false;
		} else if (!SecurityGroupId.equals(other.SecurityGroupId))
			return false;
		return true;
	}

	@Override
    public RevokeSecurityGroupEntryRequest clone() {
        return (RevokeSecurityGroupEntryRequest) super.clone();
    }
	
    @Override
    public Request<RevokeSecurityGroupEntryRequest> getDryRunRequest() {
        Request<RevokeSecurityGroupEntryRequest> request = new RevokeSecurityGroupEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }


<<<<<<< HEAD

=======
>>>>>>> v4.0.0
}