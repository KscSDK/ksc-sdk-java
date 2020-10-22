package com.ksc.network.vpc.model.peering;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.peering.DeleteVpcPeeringConnectionRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteVpcPeeringConnection.
 * </p>
 */
@Data
public class DeleteVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteVpcPeeringConnectionRequest> {

    /**
     * Peering的ID
     */
    private String vpcPeeringConnectionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteVpcPeeringConnectionRequest that = (DeleteVpcPeeringConnectionRequest) o;
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
    public Request<DeleteVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<DeleteVpcPeeringConnectionRequest> request = new DeleteVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteVpcPeeringConnectionRequest clone() {
        return (DeleteVpcPeeringConnectionRequest) super.clone();
    }
}

