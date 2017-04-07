package com.ksc.network.vpc.model.SecurityGroups;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.transform.SecurityGroups.CreateSecurityGroupRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DescribeVpcsRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateSecurityGroup.
 * </p>
 */
public class CreateSecurityGroupRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateSecurityGroupRequest> {


    /**
     * Vpc的ID
     */
    private String VpcId;

    /**
     * 安全组的名称
     */
    private String SecurityGroupName;
    
    
    public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
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
		result = prime
				* result
				+ ((SecurityGroupName == null) ? 0 : SecurityGroupName
						.hashCode());
		result = prime * result + ((VpcId == null) ? 0 : VpcId.hashCode());
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
		CreateSecurityGroupRequest other = (CreateSecurityGroupRequest) obj;
		if (SecurityGroupName == null) {
			if (other.SecurityGroupName != null)
				return false;
		} else if (!SecurityGroupName.equals(other.SecurityGroupName))
			return false;
		if (VpcId == null) {
			if (other.VpcId != null)
				return false;
		} else if (!VpcId.equals(other.VpcId))
			return false;
		return true;
	}

	@Override
    public CreateSecurityGroupRequest clone() {
        return (CreateSecurityGroupRequest) super.clone();
    }
	
    @Override
    public Request<CreateSecurityGroupRequest> getDryRunRequest() {
        Request<CreateSecurityGroupRequest> request = new CreateSecurityGroupRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}