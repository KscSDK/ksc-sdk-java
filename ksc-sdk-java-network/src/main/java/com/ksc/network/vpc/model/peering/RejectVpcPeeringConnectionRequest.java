package com.ksc.network.vpc.model.peering;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.peering.RejectVpcPeeringConnectionRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for RejectVpcPeeringConnection.
 * </p>
 */
@Data
public class RejectVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<RejectVpcPeeringConnectionRequest> {

    /**
     * Peering的ID
     */
    private String vpcPeeringConnectionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RejectVpcPeeringConnectionRequest that = (RejectVpcPeeringConnectionRequest) o;
        if (vpcPeeringConnectionId != null ? !vpcPeeringConnectionId.equals(that.vpcPeeringConnectionId) : that.vpcPeeringConnectionId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpcPeeringConnectionId != null ? vpcPeeringConnectionId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<RejectVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<RejectVpcPeeringConnectionRequest> request = new RejectVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public RejectVpcPeeringConnectionRequest clone() {
        return (RejectVpcPeeringConnectionRequest) super.clone();
    }
}

