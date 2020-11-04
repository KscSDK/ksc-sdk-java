package com.ksc.network.dns.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class HostedZone {

    /**
     * 域名的创建时间
     */
    private String createTime;
    /**
     * 域名的ID
     */
    private String hostedZoneId;
    /**
     * 域名的名称
     */
    private String hostedZoneName;
    /**
     * 域名的状态
     */
    private String status;


}
