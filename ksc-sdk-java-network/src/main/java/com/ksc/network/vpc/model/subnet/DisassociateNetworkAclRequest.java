package com.ksc.network.vpc.model.subnet;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.subnet.AssociateNetworkAclRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.DisassociateNetworkAclRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteSubnet.
 * </p>
 */
public class DisassociateNetworkAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DisassociateNetworkAclRequest> {


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

        DisassociateNetworkAclRequest that = (DisassociateNetworkAclRequest) o;

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
    public DisassociateNetworkAclRequest clone() {
        return (DisassociateNetworkAclRequest) super.clone();
    }

    @Override
    public Request<DisassociateNetworkAclRequest> getDryRunRequest() {
        Request<DisassociateNetworkAclRequest> request = new DisassociateNetworkAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}