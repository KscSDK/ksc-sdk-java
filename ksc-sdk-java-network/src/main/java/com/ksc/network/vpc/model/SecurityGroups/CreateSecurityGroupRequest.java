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

	/**
	 * 安全组的备注
	 */
	private String Description;

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSecurityGroupRequest that = (CreateSecurityGroupRequest) o;

        if (!VpcId.equals(that.VpcId)) return false;
        if (!SecurityGroupName.equals(that.SecurityGroupName)) return false;
        return Description.equals(that.Description);
    }

    @Override
    public int hashCode() {
        int result = VpcId.hashCode();
        result = 31 * result + SecurityGroupName.hashCode();
        result = 31 * result + Description.hashCode();
        return result;
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