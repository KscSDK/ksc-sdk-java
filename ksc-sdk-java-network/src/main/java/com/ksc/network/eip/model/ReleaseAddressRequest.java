package com.ksc.network.eip.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.eip.model.transform.AllocateAddressRequestMarshaller;
import com.ksc.network.eip.model.transform.ReleaseAddressRequestMarshaller;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.transform.SecurityGroups.AuthorizeSecurityGroupEntryRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.CreateSecurityGroupRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DescribeVpcsRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AuthorizeSecurityGroupEntry.
 * </p>
 */
public class ReleaseAddressRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ReleaseAddressRequest> {


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
		ReleaseAddressRequest other = (ReleaseAddressRequest) obj;
		if (AllocationId == null) {
			if (other.AllocationId != null)
				return false;
		} else if (!AllocationId.equals(other.AllocationId))
			return false;
		return true;
	}

	@Override
    public ReleaseAddressRequest clone() {
        return (ReleaseAddressRequest) super.clone();
    }
	
    @Override
    public Request<ReleaseAddressRequest> getDryRunRequest() {
        Request<ReleaseAddressRequest> request = new ReleaseAddressRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}