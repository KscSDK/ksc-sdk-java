package com.ksc.network.vpc.model.VpcPeeringConnection;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.VpcPeeringConnection.CreateVpcPeeringConnectionRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.CreateVpcRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpcs.
 * </p>
 */
public class CreateVpcPeeringConnectionRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateVpcPeeringConnectionRequest> {


    /**
     * 发起端Vpc的ID
     */
    private String VpcId;
    /**
     * 发起端region
     */
    private String Region;
    /**
     * 接受端账号ID
     */
    private String PeerAccountId;
    /**
     * 接受端Vpc的region
     */
    private String PeerRegion;
    /**
     * 接受端Vpc的ID
     */
    private String PeerVpcId;
    /**
     * peering的名称
     */
    private String PeeringName;
    /**
     * 对等连接的带宽，同机房时可缺省，带宽值为1000且不可修改，跨机房时不可缺省
     */
    private Integer BandWidth;
    /**
     * 对等连接的计费方式，同机房的对端连接此参数缺省，包年包月Monthly，按日月结Daily
     */
    private String ChargeType;

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPeerAccountId() {
        return PeerAccountId;
    }

    public void setPeerAccountId(String peerAccountId) {
        PeerAccountId = peerAccountId;
    }

    public String getPeerRegion() {
        return PeerRegion;
    }

    public void setPeerRegion(String peerRegion) {
        PeerRegion = peerRegion;
    }

    public String getPeerVpcId() {
        return PeerVpcId;
    }

    public void setPeerVpcId(String peerVpcId) {
        PeerVpcId = peerVpcId;
    }

    public String getPeeringName() {
        return PeeringName;
    }

    public void setPeeringName(String peeringName) {
        PeeringName = peeringName;
    }

    public Integer getBandWidth() {
        return BandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        BandWidth = bandWidth;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVpcPeeringConnectionRequest that = (CreateVpcPeeringConnectionRequest) o;

        if (!VpcId.equals(that.VpcId)) return false;
        if (!Region.equals(that.Region)) return false;
        if (!PeerAccountId.equals(that.PeerAccountId)) return false;
        if (!PeerRegion.equals(that.PeerRegion)) return false;
        if (!PeerVpcId.equals(that.PeerVpcId)) return false;
        if (!PeeringName.equals(that.PeeringName)) return false;
        if (!BandWidth.equals(that.BandWidth)) return false;
        return ChargeType.equals(that.ChargeType);
    }

    @Override
    public int hashCode() {
        int result = VpcId.hashCode();
        result = 31 * result + Region.hashCode();
        result = 31 * result + PeerAccountId.hashCode();
        result = 31 * result + PeerRegion.hashCode();
        result = 31 * result + PeerVpcId.hashCode();
        result = 31 * result + PeeringName.hashCode();
        result = 31 * result + BandWidth.hashCode();
        result = 31 * result + ChargeType.hashCode();
        return result;
    }

    @Override
    public CreateVpcPeeringConnectionRequest clone() {
        return (CreateVpcPeeringConnectionRequest) super.clone();
    }

    @Override
    public Request<CreateVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<CreateVpcPeeringConnectionRequest> request = new CreateVpcPeeringConnectionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}