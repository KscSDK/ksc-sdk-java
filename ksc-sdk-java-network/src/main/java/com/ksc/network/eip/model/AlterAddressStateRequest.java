package com.ksc.network.eip.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.eip.model.transform.AlterAddressStateRequestMarshaller;
import com.ksc.network.eip.model.transform.DisassociateAddressRequestMarshaller;

/**
 * <p>
 * Contains the parameters for AuthorizeSecurityGroupEntry.
 * </p>
 */
public class AlterAddressStateRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AlterAddressStateRequest> {


    /**
     * 弹性IP的ID
     */
    private String AllocationId;

	/**
	 * 弹性IP的状态，wei（start ）、挂起（stop）
	 */
	private String State;

    public String getAllocationId() {
        return AllocationId;
    }

    public void setAllocationId(String allocationId) {
        AllocationId = allocationId;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlterAddressStateRequest that = (AlterAddressStateRequest) o;

        if (!AllocationId.equals(that.AllocationId)) return false;
        return State.equals(that.State);
    }

    @Override
    public int hashCode() {
        int result = AllocationId.hashCode();
        result = 31 * result + State.hashCode();
        return result;
    }

    @Override
    public AlterAddressStateRequest clone() {
        return (AlterAddressStateRequest) super.clone();
    }
	
    @Override
    public Request<AlterAddressStateRequest> getDryRunRequest() {
        Request<AlterAddressStateRequest> request = new AlterAddressStateRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}