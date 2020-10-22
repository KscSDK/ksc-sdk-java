package com.ksc.network.vpc.model.peering;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class RequesterVpcInfo {

    /**
     * 发起端账号ID
     */
    private String accountId;
    /**
     * 发起端Vpc的region
     */
    private String region;
    /**
     * 发起端Vpc的ID
     */
    private String vpcId;
    /**
     * CidrBlock
     */
    private String vpcName;
    /**
     * 发起端Vpc的对等连接ID
     */
    private String vpcPeeringConnectionId;
    /**
     * 发起端Vpc的网段信息
     */
    private String cidrBlock;


}
