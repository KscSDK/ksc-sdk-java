package com.ksc.network.vpc.model.NetworkInterface;

import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class NetworkInterface {
    /**
     * 网卡的DNS2
     */
    private String DNS2;
    /**
     * 网卡的DNS1
     */
    private String DNS1;
    /**
     * 安全组的信息
     */
    private com.ksc.internal.SdkInternalList<GroupIdentifier> SecurityGroupSet;
    /**
     * 主机的类型
     */
    private String InstanceType;
    /**
     * 主机的网卡在VPC中的IP
     */
    private String PrivateIpAddress;
    /**
     * 网卡的ID
     */
    private String NetworkInterfaceId;
    /**
     * 安全组的名称，请使用GroupIdentifier中返回值，2016年11月1日后将不提供此参数
     */
    private String SecurityGroupName;
    /**
     * 安全组的ID，请使用GroupIdentifier中返回值，2016年11月1日后将不提供此参数
     */
    private String SecurityGroupId;
    /**
     * 网卡的类型
     */
    private String NetworkInterfaceType;
    /**
     * 主机ID
     */
    private String InstanceId;
    /**
     * 网卡的MAC地址
     */
    private String MacAddress;
    /**
     * 辅助私网ip地址的信息
     */
    private com.ksc.internal.SdkInternalList<AssignedPrivateIpAddress> AssignedPrivateIpAddressSet;

    public String getDNS2() {
        return DNS2;
    }

    public void setDNS2(String DNS2) {
        this.DNS2 = DNS2;
    }

    public String getDNS1() {
        return DNS1;
    }

    public void setDNS1(String DNS1) {
        this.DNS1 = DNS1;
    }

    public SdkInternalList<GroupIdentifier> getSecurityGroupSet() {
        return SecurityGroupSet;
    }

    public void setSecurityGroupSet(SdkInternalList<GroupIdentifier> securityGroupSet) {
        SecurityGroupSet = securityGroupSet;
    }

    public String getInstanceType() {
        return InstanceType;
    }

    public void setInstanceType(String instanceType) {
        InstanceType = instanceType;
    }

    public String getPrivateIpAddress() {
        return PrivateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        PrivateIpAddress = privateIpAddress;
    }

    public String getNetworkInterfaceId() {
        return NetworkInterfaceId;
    }

    public void setNetworkInterfaceId(String networkInterfaceId) {
        NetworkInterfaceId = networkInterfaceId;
    }

    public String getSecurityGroupName() {
        return SecurityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        SecurityGroupName = securityGroupName;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public String getNetworkInterfaceType() {
        return NetworkInterfaceType;
    }

    public void setNetworkInterfaceType(String networkInterfaceType) {
        NetworkInterfaceType = networkInterfaceType;
    }

    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String instanceId) {
        InstanceId = instanceId;
    }

    public String getMacAddress() {
        return MacAddress;
    }

    public void setMacAddress(String macAddress) {
        MacAddress = macAddress;
    }

    public void addSecurityGroupSet(GroupIdentifier... groups) {
        if (SecurityGroupSet == null) {
            SecurityGroupSet = new com.ksc.internal.SdkInternalList<GroupIdentifier>();
        }
        for (GroupIdentifier group : groups) {
            SecurityGroupSet.add(group);
        }
    }

    public SdkInternalList<AssignedPrivateIpAddress> getAssignedPrivateIpAddressSet() {
        return AssignedPrivateIpAddressSet;
    }

    public void setAssignedPrivateIpAddressSet(SdkInternalList<AssignedPrivateIpAddress> assignedPrivateIpAddressSet) {
        AssignedPrivateIpAddressSet = assignedPrivateIpAddressSet;
    }

    public void addAssignedPrivateIpAddressSet(AssignedPrivateIpAddress... assignedPrivateIpAddresses) {
        if (AssignedPrivateIpAddressSet == null) {
            AssignedPrivateIpAddressSet = new com.ksc.internal.SdkInternalList<AssignedPrivateIpAddress>();
        }
        for (AssignedPrivateIpAddress ipAddress : assignedPrivateIpAddresses) {
            AssignedPrivateIpAddressSet.add(ipAddress);
        }
    }
}
