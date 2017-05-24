package com.ksc.network.eip.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.eip.model.transform.DisassociateAddressRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DisassociateAddress.
 * </p>
 */
public class DisassociateAddressRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DisassociateAddressRequest> {


    /**
     * 弹性IP的ID
     */
    private String AllocationId;
    

	public String getAllocationId() {
		return AllocationId;
	}

	public void setAllocationId(String allocationId) {
		AllocationId = allocationId;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((AllocationId == null) ? 0 : AllocationId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisassociateAddressRequest other = (DisassociateAddressRequest) obj;
		if (AllocationId == null) {
			if (other.AllocationId != null)
				return false;
		} else if (!AllocationId.equals(other.AllocationId))
			return false;
		return true;
	}

	@Override
    public DisassociateAddressRequest clone() {
        return (DisassociateAddressRequest) super.clone();
    }
	
    @Override
    public Request<DisassociateAddressRequest> getDryRunRequest() {
        Request<DisassociateAddressRequest> request = new DisassociateAddressRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}