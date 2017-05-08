package com.ksc.network.vpc.model.VpcPeeringConnection;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.VpcPeeringConnection.RejectVpcPeeringConnectionRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for RejectVpcPeeringConnection.
 * </p>
 */
public class RejectVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<RejectVpcPeeringConnectionRequest> {

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

        RejectVpcPeeringConnectionRequest that = (RejectVpcPeeringConnectionRequest) o;

        return VpcPeeringConnectionId != null ? VpcPeeringConnectionId.equals(that.VpcPeeringConnectionId) : that.VpcPeeringConnectionId == null;
    }

    @Override
    public int hashCode() {
        return VpcPeeringConnectionId != null ? VpcPeeringConnectionId.hashCode() : 0;
    }

    @Override
    public RejectVpcPeeringConnectionRequest clone() {
        return (RejectVpcPeeringConnectionRequest) super.clone();
    }

    @Override
    public Request<RejectVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<RejectVpcPeeringConnectionRequest> request = new RejectVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}