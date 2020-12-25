package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class NetworkInterfaceAttribute {

    /**
     * 网卡的ID
     */
    private String networkInterfaceId;
    /**
     * 网卡的类型，主网卡(primary)、从网卡(extension)
     */
    private String networkInterfaceType;
    /**
     * 云物理主机的子网ID
     */
    private String subnetId;
    /**
     * 服务器的网卡在VPC中的IP
     */
    private String privateIpAddress;
    /**
     * DNS 1的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变。
     */
    private String dNS1;
    /**
     * DNS 2的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变。
     */
    private String dNS2;
    /**
     * 云物理服务器MAC
     */
    private String mac;
    /**
     * 安全组的信息
     */
    private List<SecurityGroup> securityGroupSet;

    public void addSecurityGroupSet(SecurityGroup... securityGroupSet) {
        if (this.securityGroupSet == null) {
            this.securityGroupSet = new com.ksc.internal.SdkInternalList<SecurityGroup>();
        }
        for (SecurityGroup value : securityGroupSet) {
            this.securityGroupSet.add(value);
        }
    }
    public void setSecurityGroupSet(List<SecurityGroup> securityGroupSet) {
        this.securityGroupSet = new com.ksc.internal.SdkInternalList<SecurityGroup>(securityGroupSet);
    }

}
