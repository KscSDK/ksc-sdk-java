package com.ksc.network.vpc.model.NetworkInterface;

import com.ksc.internal.SdkInternalList;
import com.ksc.network.vpc.model.Route.NextHop;
import com.ksc.network.vpc.model.SecurityGroups.SecurityGroupRule;
import lombok.ToString;

@ToString
public class NetworkInterface {
    private String DNS2;

    private String DNS1;

    private String VpcId;

    private String VpcName;

    private com.ksc.internal.SdkInternalList<GroupIdentifier> SecurityGroupSet;

    private String InstanceType;

    private String PrivateIpAddress;

    private String NetworkInterfaceId;

    private String SecurityGroupName;

    private String SecurityGroupId;

    private String NetworkInterfaceType;

    private String InstanceId;

    private String MacAddress;

    private String SubnetId;

	private String SubnetName;

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

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getVpcName() {
        return VpcName;
    }

    public void setVpcName(String vpcName) {
        VpcName = vpcName;
    }

    public com.ksc.internal.SdkInternalList<GroupIdentifier> getSecurityGroupSet() {
        return SecurityGroupSet;
    }

    public void setSecurityGroupEntrySet(com.ksc.internal.SdkInternalList<GroupIdentifier> securityGroupSet) {
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

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    public String getSubnetName() {
        return SubnetName;
    }

    public void setSubnetName(String subnetName) {
        SubnetName = subnetName;
    }

    public void addSecurityGroupSet(GroupIdentifier... groups) {
        if (SecurityGroupSet == null) {
            SecurityGroupSet = new com.ksc.internal.SdkInternalList<GroupIdentifier>();
        }
        for (GroupIdentifier group : groups) {
            SecurityGroupSet.add(group);
        }
    }
}
