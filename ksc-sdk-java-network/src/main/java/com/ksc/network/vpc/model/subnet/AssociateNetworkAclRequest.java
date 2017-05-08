package com.ksc.network.vpc.model.subnet;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.subnet.AssociateNetworkAclRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AssociateNetworkAcl.
 * </p>
 */
public class AssociateNetworkAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociateNetworkAclRequest> {

	/**
	 * NetworkAcl的ID
	 */
	private String NetworkAclId;

    /**
     * 子网的ID
     */
    private String SubnetId;

    public String getNetworkAclId() {
        return NetworkAclId;
    }

    public void setNetworkAclId(String networkAclId) {
        NetworkAclId = networkAclId;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssociateNetworkAclRequest that = (AssociateNetworkAclRequest) o;

        if (!NetworkAclId.equals(that.NetworkAclId)) return false;
        return SubnetId.equals(that.SubnetId);
    }

    @Override
    public int hashCode() {
        int result = NetworkAclId.hashCode();
        result = 31 * result + SubnetId.hashCode();
        return result;
    }

    @Override
    public AssociateNetworkAclRequest clone() {
        return (AssociateNetworkAclRequest) super.clone();
    }

    @Override
    public Request<AssociateNetworkAclRequest> getDryRunRequest() {
        Request<AssociateNetworkAclRequest> request = new AssociateNetworkAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}