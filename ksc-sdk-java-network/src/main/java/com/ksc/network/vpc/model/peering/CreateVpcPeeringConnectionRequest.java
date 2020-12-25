package com.ksc.network.vpc.model.peering;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.peering.CreateVpcPeeringConnectionRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateVpcPeeringConnection.
 * </p>
 */
@Data
public class CreateVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateVpcPeeringConnectionRequest> {

    /**
     * 发起端Vpc的ID
     */
    private String vpcId;
    /**
     * 发起端region
     */
    private String region;
    /**
     * 对等连接的带宽
     */
    private Integer bandWidth;
    /**
     * 接受端账号ID
     */
    private String peerAccountId;
    /**
     * 接受端Vpc的region
     */
    private String peerRegion;
    /**
     * 接受端Vpc的ID
     */
    private String peerVpcId;
    /**
     * peering的名称
     */
    private String peeringName;
    /**
     * 对等连接的计费方式，同机房的对端连接此参数缺省
     */
    private String chargeType;
    /**
     * 项目的ID
     */
    private String projectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateVpcPeeringConnectionRequest that = (CreateVpcPeeringConnectionRequest) o;
        if (vpcId != null ? !vpcId.equals(that.vpcId) : that.vpcId != null)
            return false;
        if (region != null ? !region.equals(that.region) : that.region != null)
            return false;
        if (bandWidth != null ? !bandWidth.equals(that.bandWidth) : that.bandWidth != null)
            return false;
        if (peerAccountId != null ? !peerAccountId.equals(that.peerAccountId) : that.peerAccountId != null)
            return false;
        if (peerRegion != null ? !peerRegion.equals(that.peerRegion) : that.peerRegion != null)
            return false;
        if (peerVpcId != null ? !peerVpcId.equals(that.peerVpcId) : that.peerVpcId != null)
            return false;
        if (peeringName != null ? !peeringName.equals(that.peeringName) : that.peeringName != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpcId != null ? vpcId.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (bandWidth != null ? bandWidth.hashCode() : 0);
        result = 31 * result + (peerAccountId != null ? peerAccountId.hashCode() : 0);
        result = 31 * result + (peerRegion != null ? peerRegion.hashCode() : 0);
        result = 31 * result + (peerVpcId != null ? peerVpcId.hashCode() : 0);
        result = 31 * result + (peeringName != null ? peeringName.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<CreateVpcPeeringConnectionRequest> request = new CreateVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateVpcPeeringConnectionRequest clone() {
        return (CreateVpcPeeringConnectionRequest) super.clone();
    }
}

