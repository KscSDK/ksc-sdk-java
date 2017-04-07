package com.ksc.network.vpc.model.NetworkAcl;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkAcl.ModifyNetworkAclEntryRequestMarshaller;
import com.ksc.network.vpc.transform.NetworkAcl.ModifyNetworkAclRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateSecurityGroup.
 * </p>
 */
public class ModifyNetworkAclEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyNetworkAclEntryRequest> {


    /**
     * ACL规则的ID
     */
    private String NetworkAclEntryId;

    /**
     * ACL的描述
     */
    private String Description;

    public String getNetworkAclEntryId() {
        return NetworkAclEntryId;
    }

    public void setNetworkAclEntryId(String networkAclEntryId) {
        NetworkAclEntryId = networkAclEntryId;
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

        ModifyNetworkAclEntryRequest that = (ModifyNetworkAclEntryRequest) o;

        if (!NetworkAclEntryId.equals(that.NetworkAclEntryId)) return false;
        return Description.equals(that.Description);
    }

    @Override
    public int hashCode() {
        int result = NetworkAclEntryId.hashCode();
        result = 31 * result + Description.hashCode();
        return result;
    }

    @Override
    public ModifyNetworkAclEntryRequest clone() {
        return (ModifyNetworkAclEntryRequest) super.clone();
    }
	
    @Override
    public Request<ModifyNetworkAclEntryRequest> getDryRunRequest() {
        Request<ModifyNetworkAclEntryRequest> request = new ModifyNetworkAclEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}