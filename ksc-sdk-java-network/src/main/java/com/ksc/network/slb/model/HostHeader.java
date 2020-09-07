package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class HostHeader {

    /**
     * 域名的ID
     */
    private String HostHeaderId;
    /**
     * 域名创建时间
     */
    private String CreateTime;
    /**
     * 域名
     */
    private String HostHeader;
    /**
     * 监听器的ID
     */
    private String ListenerId;
    /**
     * 证书ID
     */
    private String CertificateId;
}
