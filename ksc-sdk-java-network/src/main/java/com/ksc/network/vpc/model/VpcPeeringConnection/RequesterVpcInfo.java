package com.ksc.network.vpc.model.VpcPeeringConnection;

import lombok.ToString;

@ToString
public class RequesterVpcInfo {
	private String AccountId;

	private String VpcName;

	private String CidrBlock;

	private String VpcId;

	private String Region;

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
