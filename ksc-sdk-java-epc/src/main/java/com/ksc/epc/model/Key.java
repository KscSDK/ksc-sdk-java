package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Key {

    /**
     * 密钥ID
     */
    private String keyId;
    /**
     * 公钥
     */
    private String publicKey;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 密钥名称
     */
    private String keyName;


}
