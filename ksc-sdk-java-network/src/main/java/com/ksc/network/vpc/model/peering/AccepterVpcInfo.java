package com.ksc.network.vpc.model.peering;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class AccepterVpcInfo {

    /**
     * 接受端账号ID
     */
    private String accountId;
    /**
     * 接受端Vpc的region
     */
    private String region;
    /**
     * 接受端Vpc的ID
     */
    private String vpcId;
    /**
     * CidrBlock
     */
    private String vpcName;
    /**
     * 接受端Vpc的对等连接ID
     */
    private String vpcPeeringConnectionId;
    /**
     * 接受端Vpc的网段信息
     */
    private String cidrBlock;


}
