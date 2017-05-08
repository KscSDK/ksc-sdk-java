package com.ksc.network.vpc.model.VpcPeeringConnection;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class RequesterVpcInfo {
    /**
     * 发起端账号ID
     */
    private String AccountId;
    /**
     * 发起端Vpc的名称
     */
	private String VpcName;
    /**
     * 发起端Vpc的网段信息
     */
	private String CidrBlock;
    /**
     * 发起端Vpc的ID
     */
	private String VpcId;
    /**
     * 发起端Vpc的region
     */
	private String Region;
    /**
     * 发起端VPC的对等连接ID
     */
	private String VpcPeeringConnectionId;

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    public String getVpcName() {
        return VpcName;
    }

    public void setVpcName(String vpcName) {
        VpcName = vpcName;
    }

    public String getCidrBlock() {
        return CidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        CidrBlock = cidrBlock;
    }

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

    public String getVpcPeeringConnectionId() {
        return VpcPeeringConnectionId;
    }

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        VpcPeeringConnectionId = vpcPeeringConnectionId;
    }
}
