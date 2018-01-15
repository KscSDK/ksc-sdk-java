package com.ksc.network.vpc.model.NetworkAcl;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkAcl.ModifyNetworkAclRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyNetworkAcl.
 * </p>
 */
public class ModifyNetworkAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyNetworkAclRequest> {


    /**
     * NetworkAcl的ID
     */
    private String NetworkAclId;

    /**
     * NetworkAcl的名称
     */
    private String NetworkAclName;

    /**
     * NetworkAcl的备注
     */
    private String Description;

    public String getNetworkAclId() {
        return NetworkAclId;
    }

    public void setNetworkAclId(String networkAclId) {
        NetworkAclId = networkAclId;
    }

    public String getNetworkAclName() {
        return NetworkAclName;
    }

    public void setNetworkAclName(String networkAclName) {
        NetworkAclName = networkAclName;
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

        ModifyNetworkAclRequest that = (ModifyNetworkAclRequest) o;

        if (!NetworkAclId.equals(that.NetworkAclId)) return false;
        if (!NetworkAclName.equals(that.NetworkAclName)) return false;
        return Description.equals(that.Description);
    }

    @Override
    public int hashCode() {
        int result = NetworkAclId.hashCode();
        result = 31 * result + NetworkAclName.hashCode();
        result = 31 * result + Description.hashCode();
        return result;
    }

    @Override
    public ModifyNetworkAclRequest clone() {
        return (ModifyNetworkAclRequest) super.clone();
    }
	
    @Override
    public Request<ModifyNetworkAclRequest> getDryRunRequest() {
        Request<ModifyNetworkAclRequest> request = new ModifyNetworkAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}