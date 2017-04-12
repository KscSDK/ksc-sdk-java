package com.ksc.network.vpc.model.Nat;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Nat.AssociateNatRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.AssociateNetworkAclRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteSubnet.
 * </p>
 */
public class AssociateNatRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociateNatRequest> {


	/**
	 * Nat的ID
	 */
	private String NatId;

    /**
     * 子网的ID
     */
    private String SubnetId;

    public String getNatId() {
        return NatId;
    }

    public void setNatId(String natId) {
        NatId = natId;
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

        AssociateNatRequest that = (AssociateNatRequest) o;

        if (!NatId.equals(that.NatId)) return false;
        return SubnetId.equals(that.SubnetId);
    }

    @Override
    public int hashCode() {
        int result = NatId.hashCode();
        result = 31 * result + SubnetId.hashCode();
        return result;
    }

    @Override
    public AssociateNatRequest clone() {
        return (AssociateNatRequest) super.clone();
    }

    @Override
    public Request<AssociateNatRequest> getDryRunRequest() {
        Request<AssociateNatRequest> request = new AssociateNatRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}