package com.ksc.network.vpc.model.SecurityGroups;

import com.ksc.network.vpc.model.NetworkAcl.ModifyNetworkAclResult;
import com.ksc.network.vpc.model.NetworkAcl.NetworkAclEntry;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class ModifySecurityGroupResult implements Serializable, Cloneable {

    private String CreateTime;

    private String Description;

    private String VpcId;

    private String SecurityGroupId;

    private String SecurityGroupName;

    private String RequestId;

	private com.ksc.internal.SdkInternalList<SecurityGroupRule> SecurityGroupEntrySet;

    private String SecurityGroupType;

    @Override
    public ModifySecurityGroupResult clone() {
        try {
            return (ModifySecurityGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
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


	public String getSecurityGroupType() {
		return SecurityGroupType;
	}


	public void setSecurityGroupType(String securityGroupType) {
		SecurityGroupType = securityGroupType;
	}


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


	public String getSecurityGroupId() {
		return SecurityGroupId;
	}


	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}


	public String getSecurityGroupName() {
		return SecurityGroupName;
	}


	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}


	public java.util.List<SecurityGroupRule> getSecurityGroupEntrySet() {
		if (SecurityGroupEntrySet == null) {
			SecurityGroupEntrySet = new com.ksc.internal.SdkInternalList<SecurityGroupRule>();
		}
		return SecurityGroupEntrySet;
	}


	public void setSecurityGroupEntrySet(java.util.Collection<SecurityGroupRule> groupEntry) {
		if (groupEntry == null) {
			this.SecurityGroupEntrySet = null;
			return;
		}

		this.SecurityGroupEntrySet = new com.ksc.internal.SdkInternalList<SecurityGroupRule>(groupEntry);
	}

	public ModifySecurityGroupResult withSecurityGroupEntrySet(SecurityGroupRule... groupEntry) {
		if (this.SecurityGroupEntrySet == null) {
			setSecurityGroupEntrySet(new com.ksc.internal.SdkInternalList<SecurityGroupRule>(groupEntry.length));
		}
		for (SecurityGroupRule ele : groupEntry) {
			this.SecurityGroupEntrySet.add(ele);
		}
		return this;
	}

	public ModifySecurityGroupResult withSecurityGroupEntrySet(java.util.Collection<SecurityGroupRule> groupEntry) {
		setSecurityGroupEntrySet(groupEntry);
		return this;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySecurityGroupResult that = (ModifySecurityGroupResult) o;

        if (!CreateTime.equals(that.CreateTime)) return false;
        if (!Description.equals(that.Description)) return false;
        if (!VpcId.equals(that.VpcId)) return false;
        if (!SecurityGroupId.equals(that.SecurityGroupId)) return false;
        if (!SecurityGroupName.equals(that.SecurityGroupName)) return false;
        if (!RequestId.equals(that.RequestId)) return false;
        if (!SecurityGroupEntrySet.equals(that.SecurityGroupEntrySet)) return false;
        return SecurityGroupType.equals(that.SecurityGroupType);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + Description.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + SecurityGroupId.hashCode();
        result = 31 * result + SecurityGroupName.hashCode();
        result = 31 * result + RequestId.hashCode();
        result = 31 * result + SecurityGroupEntrySet.hashCode();
        result = 31 * result + SecurityGroupType.hashCode();
        return result;
    }
}