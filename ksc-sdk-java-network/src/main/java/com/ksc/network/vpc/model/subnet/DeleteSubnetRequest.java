package com.ksc.network.vpc.model.subnet;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.subnet.DeleteSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DeleteVpcRequestMarshaller;




import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteSubnet.
 * </p>
 */
public class DeleteSubnetRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteSubnetRequest> {


    /**
     * 子网的ID
     */
    private String SubnetId;
    
    
    
	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((SubnetId == null) ? 0 : SubnetId.hashCode());
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
		DeleteSubnetRequest other = (DeleteSubnetRequest) obj;
		if (SubnetId == null) {
			if (other.SubnetId != null)
				return false;
		} else if (!SubnetId.equals(other.SubnetId))
			return false;
		return true;
	}

	@Override
    public DeleteSubnetRequest clone() {
        return (DeleteSubnetRequest) super.clone();
    }

    @Override
    public Request<DeleteSubnetRequest> getDryRunRequest() {
        Request<DeleteSubnetRequest> request = new DeleteSubnetRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}