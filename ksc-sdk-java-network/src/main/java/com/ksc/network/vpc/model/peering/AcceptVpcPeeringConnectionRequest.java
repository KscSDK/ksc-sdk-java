package com.ksc.network.vpc.model.peering;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.peering.AcceptVpcPeeringConnectionRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AcceptVpcPeeringConnection.
 * </p>
 */
@Data
public class AcceptVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AcceptVpcPeeringConnectionRequest> {

    /**
     * peering的ID
     */
    private String vpcPeeringConnectionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AcceptVpcPeeringConnectionRequest that = (AcceptVpcPeeringConnectionRequest) o;
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
    public Request<AcceptVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<AcceptVpcPeeringConnectionRequest> request = new AcceptVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public AcceptVpcPeeringConnectionRequest clone() {
        return (AcceptVpcPeeringConnectionRequest) super.clone();
    }
}

