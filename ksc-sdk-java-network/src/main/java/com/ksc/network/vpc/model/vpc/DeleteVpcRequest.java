package com.ksc.network.vpc.model.vpc;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpc.DeleteVpcRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteVpc.
 * </p>
 */
public class DeleteVpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteVpcRequest> {

    /**
     * Vpc的ID
     */
    private String VpcId;
    
    public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((VpcId == null) ? 0 : VpcId.hashCode());
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
		DeleteVpcRequest other = (DeleteVpcRequest) obj;
		if (VpcId == null) {
			if (other.VpcId != null)
				return false;
		} else if (!VpcId.equals(other.VpcId))
			return false;
		return true;
	}

	@Override
    public DeleteVpcRequest clone() {
        return (DeleteVpcRequest) super.clone();
    }

    @Override
    public Request<DeleteVpcRequest> getDryRunRequest() {
        Request<DeleteVpcRequest> request = new DeleteVpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}