package com.ksc.network.vpc.model.Nat;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Nat.DisassociateNatRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DisassociateNat.
 * </p>
 */
public class DisassociateNatRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DisassociateNatRequest> {

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

        DisassociateNatRequest that = (DisassociateNatRequest) o;

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
    public DisassociateNatRequest clone() {
        return (DisassociateNatRequest) super.clone();
    }

    @Override
    public Request<DisassociateNatRequest> getDryRunRequest() {
        Request<DisassociateNatRequest> request = new DisassociateNatRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}