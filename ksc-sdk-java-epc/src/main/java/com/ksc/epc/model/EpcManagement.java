package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class EpcManagement {

    /**
     * 远程管理ID
     */
    private String epcManagementId;
    /**
     * 远程管理IP
     */
    private String epcManagementIp;
    /**
     * 远程管理用户名
     */
    private String epcManagementUserName;
    /**
     * 远程管理密码
     */
    private String password;
    /**
     * 实例名称
     */
    private String hostName;
    /**
     * 实例SN
     */
    private String sn;


}
