package com.ksc.network.vpc.model.vpn;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class CustomerGateway {

    /**
     * VPN客户网关的创建时间
     */
    private String createTime;
    /**
     * 客户网关的ID
     */
    private String customerGatewayId;
    /**
     * 客户网关的公网IP
     */
    private String customerGatewayAddress;
    /**
     * HA模式客户网关的公网IP
     */
    private String haCustomerGatewayAddress;
    /**
     * 客户网关的名称
     */
    private String customerGatewayName;


}
