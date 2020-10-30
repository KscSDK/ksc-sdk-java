package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class RemoteManagement {

    /**
     * 带外管理ID
     */
    private String remoteManagementId;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 名称
     */
    private String name;


}
