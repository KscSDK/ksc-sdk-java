package com.ksc.network.vpc.model.VpcPeeringConnection;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class VpcPeeringConnection {
    /**
     * Peering接受端Vpc信息
     */
	private AccepterVpcInfo AccepterVpcInfo;
    /**
     * VPC创建时间
     */
	private String CreateTime;
    /**
     * peering的名称
     */
	private String PeeringName;
    /**
     * Peering发起端Vpc的信息
     */
	private RequesterVpcInfo RequesterVpcInfo;
    /**
     * peering的状态，申请中（pending-acceptance）状态的只能由发起端删除，已连接（active ）状态的发起端和接受端都可以删除，已拒绝（rejected ），连接失败（failed ）是对端网段重复或其他异常的导致失败的状态，已过期（expired ），连接中（provisioning ）是对方已经接受，对等连接联通的状态
     */
	private String State;
    /**
     * Vpc的对等连接类型。
     */
    private String VpcPeeringConnectionType;
    /**
     * Vpc的对等连接ID。
     */
    private String VpcPeeringConnectionId;
    /**
     * 对等连接的带宽上线
     */
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
