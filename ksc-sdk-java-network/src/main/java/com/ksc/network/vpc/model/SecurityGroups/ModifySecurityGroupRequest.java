package com.ksc.network.vpc.model.SecurityGroups;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.transform.SecurityGroups.CreateSecurityGroupRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.ModifySecurityGroupRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DescribeVpcsRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateSecurityGroup.
 * </p>
 */
public class ModifySecurityGroupRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifySecurityGroupRequest> {


    /**
     * 安全组的ID
     */
    private String SecurityGroupId;

    /**
     * 安全组的名称
     */
    private String SecurityGroupName;
    
    
	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getSecurityGroupName() {
		return SecurityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((SecurityGroupId == null) ? 0 : SecurityGroupId.hashCode());
		result = prime
				* result
				+ ((SecurityGroupName == null) ? 0 : SecurityGroupName
						.hashCode());
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
		ModifySecurityGroupRequest other = (ModifySecurityGroupRequest) obj;
		if (SecurityGroupId == null) {
			if (other.SecurityGroupId != null)
				return false;
		} else if (!SecurityGroupId.equals(other.SecurityGroupId))
			return false;
		if (SecurityGroupName == null) {
			if (other.SecurityGroupName != null)
				return false;
		} else if (!SecurityGroupName.equals(other.SecurityGroupName))
			return false;
		return true;
	}

	@Override
    public ModifySecurityGroupRequest clone() {
        return (ModifySecurityGroupRequest) super.clone();
    }
	
    @Override
    public Request<ModifySecurityGroupRequest> getDryRunRequest() {
        Request<ModifySecurityGroupRequest> request = new ModifySecurityGroupRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}