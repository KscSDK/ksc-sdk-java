package com.ksc.network.kcm.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Certificate {

    /**
     * 证书名称
     */
    private String CertificateName;
    /**
     * 证书ID
     */
    private String CertificateId;
    /**
     * 创建时间
     */
    private String CreateTime;
}
