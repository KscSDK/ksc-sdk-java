package com.ksc.network.vpc.model.SecurityGroups;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.SecurityGroups.ModifySecurityGroupEntryRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.ModifySecurityGroupRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateSecurityGroup.
 * </p>
 */
public class ModifySecurityGroupEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifySecurityGroupEntryRequest> {


    /**
     * 安全组规则的ID
     */
    private String SecurityGroupEntryId;

    /**
     * 安全组规则的备注
     */
    private String Description;

	public String getSecurityGroupEntryId() {
		return SecurityGroupEntryId;
	}

	public void setSecurityGroupEntryId(String securityGroupEntryId) {
		SecurityGroupEntryId = securityGroupEntryId;
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

        ModifySecurityGroupEntryRequest that = (ModifySecurityGroupEntryRequest) o;

        if (!SecurityGroupEntryId.equals(that.SecurityGroupEntryId)) return false;
        return Description.equals(that.Description);
    }

    @Override
    public int hashCode() {
        int result = SecurityGroupEntryId.hashCode();
        result = 31 * result + Description.hashCode();
        return result;
    }

    @Override
    public ModifySecurityGroupEntryRequest clone() {
        return (ModifySecurityGroupEntryRequest) super.clone();
    }
	
    @Override
    public Request<ModifySecurityGroupEntryRequest> getDryRunRequest() {
        Request<ModifySecurityGroupEntryRequest> request = new ModifySecurityGroupEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}