package com.ksc.network.vpc.model.NetworkAcl;

import java.io.Serializable;

import com.ksc.network.vpc.model.SecurityGroups.SecurityGroupRule;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class ModifyNetworkAclResult implements Serializable, Cloneable {

	
	private String CreateTime;
	
	private String VpcId;

	private String NetworkAclId;

	private String NetworkAclName;

    private String RequestId;


    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getNetworkAclId() {
        return NetworkAclId;
    }

    public void setNetworkAclId(String networkAclId) {
        NetworkAclId = networkAclId;
    }

    public String getNetworkAclName() {
        return NetworkAclName;
    }

    public void setNetworkAclName(String networkAclName) {
        NetworkAclName = networkAclName;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyNetworkAclResult that = (ModifyNetworkAclResult) o;

        if (!CreateTime.equals(that.CreateTime)) return false;
        if (!VpcId.equals(that.VpcId)) return false;
        if (!NetworkAclId.equals(that.NetworkAclId)) return false;
        if (!NetworkAclName.equals(that.NetworkAclName)) return false;
        return RequestId.equals(that.RequestId);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + NetworkAclId.hashCode();
        result = 31 * result + NetworkAclName.hashCode();
        result = 31 * result + RequestId.hashCode();
        return result;
    }

    @Override
    public ModifyNetworkAclResult clone() {
        try {
            return (ModifyNetworkAclResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}