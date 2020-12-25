package com.ksc.network.vpc.model.peering;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class VpcPeeringConnection {

    /**
     * 对等连接创建时间
     */
    private String createTime;
    /**
     * Vpc的对等连接类型
     */
    private String vpcPeeringConnectionType;
    /**
     * peering的名称
     */
    private String peeringName;
    /**
     * peering的状态
     */
    private String state;
    /**
     * 对等连接的带宽
     */
    private Integer bandWidth;
    /**
     * 项目的ID
     */
    private String projectId;
    /**
     * 接收端信息
     */
    private AccepterVpcInfo accepterVpcInfo;
    /**
     * 发起端信息
     */
    private RequesterVpcInfo requesterVpcInfo;


}
