package com.ksc.network.vpc.model.VpcPeeringConnection;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.VpcPeeringConnection.DeleteVpcPeeringConnectionRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DeleteVpcRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpcs.
 * </p>
 */
public class DeleteVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteVpcPeeringConnectionRequest> {


    /**
     * Peering的ID
     */
    private String VpcPeeringConnectionId;

	public String getVpcPeeringConnectionId() {
		return VpcPeeringConnectionId;
	}

	public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
		VpcPeeringConnectionId = vpcPeeringConnectionId;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteVpcPeeringConnectionRequest that = (DeleteVpcPeeringConnectionRequest) o;

        return VpcPeeringConnectionId != null ? VpcPeeringConnectionId.equals(that.VpcPeeringConnectionId) : that.VpcPeeringConnectionId == null;
    }

    @Override
    public int hashCode() {
        return VpcPeeringConnectionId != null ? VpcPeeringConnectionId.hashCode() : 0;
    }

    @Override
    public DeleteVpcPeeringConnectionRequest clone() {
        return (DeleteVpcPeeringConnectionRequest) super.clone();
    }

    @Override
    public Request<DeleteVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<DeleteVpcPeeringConnectionRequest> request = new DeleteVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}