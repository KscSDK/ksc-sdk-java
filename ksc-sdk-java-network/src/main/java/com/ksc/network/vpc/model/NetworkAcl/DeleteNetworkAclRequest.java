package com.ksc.network.vpc.model.NetworkAcl;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkAcl.DeleteNetworkAclRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteNetworkAcl.
 * </p>
 */
public class DeleteNetworkAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteNetworkAclRequest> {


    /**
     * NetworkAcl的ID
     */
    private String NetworkAclId;

    public String getNetworkAclId() {
        return NetworkAclId;
    }

    public void setNetworkAclId(String networkAclId) {
        NetworkAclId = networkAclId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteNetworkAclRequest that = (DeleteNetworkAclRequest) o;

        return NetworkAclId.equals(that.NetworkAclId);
    }

    @Override
    public int hashCode() {
        return NetworkAclId.hashCode();
    }

    @Override
    public DeleteNetworkAclRequest clone() {
        return (DeleteNetworkAclRequest) super.clone();
    }

    @Override
    public Request<DeleteNetworkAclRequest> getDryRunRequest() {
        Request<DeleteNetworkAclRequest> request = new DeleteNetworkAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}