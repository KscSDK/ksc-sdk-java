package com.ksc.network.vpc.model.VpcPeeringConnection;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.VpcPeeringConnection.ModifyVpcPeeringConnectionRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyVpcPeeringConnection.
 * </p>
 */
public class ModifyVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcPeeringConnectionRequest> {

    /**
     * Peering的ID
     */
    private String VpcPeeringConnectionId;

    /**
     * peering的名称
     */
    private String PeeringName;

    public String getVpcPeeringConnectionId() {
        return VpcPeeringConnectionId;
    }

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        VpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    public String getPeeringName() {
        return PeeringName;
    }

    public void setPeeringName(String peeringName) {
        PeeringName = peeringName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVpcPeeringConnectionRequest that = (ModifyVpcPeeringConnectionRequest) o;

        if (!VpcPeeringConnectionId.equals(that.VpcPeeringConnectionId)) return false;
        return PeeringName.equals(that.PeeringName);
    }

    @Override
    public int hashCode() {
        int result = VpcPeeringConnectionId.hashCode();
        result = 31 * result + PeeringName.hashCode();
        return result;
    }

    @Override
    public ModifyVpcPeeringConnectionRequest clone() {
        return (ModifyVpcPeeringConnectionRequest) super.clone();
    }
	
    @Override
    public Request<ModifyVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<ModifyVpcPeeringConnectionRequest> request = new ModifyVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}