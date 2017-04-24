package com.ksc.network.vpc.model.VpcPeeringConnection;

import com.ksc.internal.SdkInternalList;
import com.ksc.network.vpc.model.Nat.AssociateNat;
import com.ksc.network.vpc.model.Nat.NatIp;

import lombok.ToString;

@ToString
public class VpcPeeringConnection {

	private AccepterVpcInfo AccepterVpcInfo;

	private String CreateTime;

	private String PeeringName;

	private RequesterVpcInfo RequesterVpcInfo;

	private String State;

    private String VpcPeeringConnectionType;

    private String VpcPeeringConnectionId;

    private Integer BandWidth;

    public com.ksc.network.vpc.model.VpcPeeringConnection.AccepterVpcInfo getAccepterVpcInfo() {
        return AccepterVpcInfo;
    }

    public void setAccepterVpcInfo(com.ksc.network.vpc.model.VpcPeeringConnection.AccepterVpcInfo accepterVpcInfo) {
        AccepterVpcInfo = accepterVpcInfo;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getPeeringName() {
        return PeeringName;
    }

    public void setPeeringName(String peeringName) {
        PeeringName = peeringName;
    }

    public com.ksc.network.vpc.model.VpcPeeringConnection.RequesterVpcInfo getRequesterVpcInfo() {
        return RequesterVpcInfo;
    }

    public void setRequesterVpcInfo(com.ksc.network.vpc.model.VpcPeeringConnection.RequesterVpcInfo requesterVpcInfo) {
        RequesterVpcInfo = requesterVpcInfo;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getVpcPeeringConnectionType() {
        return VpcPeeringConnectionType;
    }

    public void setVpcPeeringConnectionType(String vpcPeeringConnectionType) {
        VpcPeeringConnectionType = vpcPeeringConnectionType;
    }

    public String getVpcPeeringConnectionId() {
        return VpcPeeringConnectionId;
    }

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        VpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    public Integer getBandWidth() {
        return BandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        BandWidth = bandWidth;
    }
}
