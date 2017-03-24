package com.ksc.network.vpc.model.SecurityGroups;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class ModifySecurityGroupResult implements Serializable, Cloneable {

	
	private String RequestId;
	
	private String SecurityGroupType;

	private String CreateTime;
	
	private String VpcId;
	
	private String SecurityGroupId;
	
	private String SecurityGroupName;
	
	private SecurityGroupRule SecurityGroupEntrySet;
	
    
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


	public SecurityGroupRule getSecurityGroupEntrySet() {
		return SecurityGroupEntrySet;
	}


	public void setSecurityGroupEntrySet(SecurityGroupRule securityGroupEntrySet) {
		SecurityGroupEntrySet = securityGroupEntrySet;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((CreateTime == null) ? 0 : CreateTime.hashCode());
		result = prime * result
				+ ((RequestId == null) ? 0 : RequestId.hashCode());
		result = prime
				* result
				+ ((SecurityGroupEntrySet == null) ? 0 : SecurityGroupEntrySet
						.hashCode());
		result = prime * result
				+ ((SecurityGroupId == null) ? 0 : SecurityGroupId.hashCode());
		result = prime
				* result
				+ ((SecurityGroupName == null) ? 0 : SecurityGroupName
						.hashCode());
		result = prime
				* result
				+ ((SecurityGroupType == null) ? 0 : SecurityGroupType
						.hashCode());
		result = prime * result + ((VpcId == null) ? 0 : VpcId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModifySecurityGroupResult other = (ModifySecurityGroupResult) obj;
		if (CreateTime == null) {
			if (other.CreateTime != null)
				return false;
		} else if (!CreateTime.equals(other.CreateTime))
			return false;
		if (RequestId == null) {
			if (other.RequestId != null)
				return false;
		} else if (!RequestId.equals(other.RequestId))
			return false;
		if (SecurityGroupEntrySet == null) {
			if (other.SecurityGroupEntrySet != null)
				return false;
		} else if (!SecurityGroupEntrySet.equals(other.SecurityGroupEntrySet))
			return false;
		if (SecurityGroupId == null) {
			if (other.SecurityGroupId != null)
				return false;
		} else if (!SecurityGroupId.equals(other.SecurityGroupId))
			return false;
		if (SecurityGroupName == null) {
			if (other.SecurityGroupName != null)
				return false;
		} else if (!SecurityGroupName.equals(other.SecurityGroupName))
			return false;
		if (SecurityGroupType == null) {
			if (other.SecurityGroupType != null)
				return false;
		} else if (!SecurityGroupType.equals(other.SecurityGroupType))
			return false;
		if (VpcId == null) {
			if (other.VpcId != null)
				return false;
		} else if (!VpcId.equals(other.VpcId))
			return false;
		return true;
	}




















}