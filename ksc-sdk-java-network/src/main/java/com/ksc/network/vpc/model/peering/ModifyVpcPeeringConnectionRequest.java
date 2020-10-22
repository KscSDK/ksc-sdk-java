package com.ksc.network.vpc.model.peering;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.peering.ModifyVpcPeeringConnectionRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyVpcPeeringConnection.
 * </p>
 */
@Data
public class ModifyVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcPeeringConnectionRequest> {

    /**
     * Peering的ID
     */
    private String vpcPeeringConnectionId;
    /**
     * 对等连接的带宽
     */
    private Integer bandWidth;
    /**
     * peering的名称
     */
    private String peeringName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyVpcPeeringConnectionRequest that = (ModifyVpcPeeringConnectionRequest) o;
        if (vpcPeeringConnectionId != null ? !vpcPeeringConnectionId.equals(that.vpcPeeringConnectionId) : that.vpcPeeringConnectionId != null)
            return false;
        if (bandWidth != null ? !bandWidth.equals(that.bandWidth) : that.bandWidth != null)
            return false;
        if (peeringName != null ? !peeringName.equals(that.peeringName) : that.peeringName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpcPeeringConnectionId != null ? vpcPeeringConnectionId.hashCode() : 0);
        result = 31 * result + (bandWidth != null ? bandWidth.hashCode() : 0);
        result = 31 * result + (peeringName != null ? peeringName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<ModifyVpcPeeringConnectionRequest> request = new ModifyVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyVpcPeeringConnectionRequest clone() {
        return (ModifyVpcPeeringConnectionRequest) super.clone();
    }
}

