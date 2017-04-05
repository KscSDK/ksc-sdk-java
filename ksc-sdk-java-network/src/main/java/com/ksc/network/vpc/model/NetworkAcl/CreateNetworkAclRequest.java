package com.ksc.network.vpc.model.NetworkAcl;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkAcl.CreateNetworkAclRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.CreateVpcRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpcs.
 * </p>
 */
public class CreateNetworkAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateNetworkAclRequest> {


    /**
     * Vpc的ID
     */
    private String VpcId;
    /**
     * NetworkAcl的名称
     */
    private String NetworkAclName;
    /**
     * ACL的备注
     */
    private String Description;

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
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

        CreateNetworkAclRequest that = (CreateNetworkAclRequest) o;

        if (VpcId != null ? !VpcId.equals(that.VpcId) : that.VpcId != null) return false;
        if (NetworkAclName != null ? !NetworkAclName.equals(that.NetworkAclName) : that.NetworkAclName != null)
            return false;
        return Description != null ? Description.equals(that.Description) : that.Description == null;
    }

    @Override
    public int hashCode() {
        int result = VpcId != null ? VpcId.hashCode() : 0;
        result = 31 * result + (NetworkAclName != null ? NetworkAclName.hashCode() : 0);
        result = 31 * result + (Description != null ? Description.hashCode() : 0);
        return result;
    }

    @Override
    public CreateNetworkAclRequest clone() {
        return (CreateNetworkAclRequest) super.clone();
    }

    @Override
    public Request<CreateNetworkAclRequest> getDryRunRequest() {
        Request<CreateNetworkAclRequest> request = new CreateNetworkAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}