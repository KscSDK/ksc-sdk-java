package com.ksc.network.vpc.model.NetworkAcl;

import java.io.Serializable;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class ModifyNetworkAclEntryResult implements Serializable, Cloneable {

	
	private String CreateTime;
	
	private String VpcId;

	private String NetworkAclEntryId;

	private String Description;

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

    public String getNetworkAclEntryId() {
        return NetworkAclEntryId;
    }

    public void setNetworkAclEntryId(String networkAclEntryId) {
        NetworkAclEntryId = networkAclEntryId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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

        ModifyNetworkAclEntryResult that = (ModifyNetworkAclEntryResult) o;

        if (!CreateTime.equals(that.CreateTime)) return false;
        if (!VpcId.equals(that.VpcId)) return false;
        if (!NetworkAclEntryId.equals(that.NetworkAclEntryId)) return false;
        if (!Description.equals(that.Description)) return false;
        return RequestId.equals(that.RequestId);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + NetworkAclEntryId.hashCode();
        result = 31 * result + Description.hashCode();
        result = 31 * result + RequestId.hashCode();
        return result;
    }

    @Override
    public ModifyNetworkAclEntryResult clone() {
        try {
            return (ModifyNetworkAclEntryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}