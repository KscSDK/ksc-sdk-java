package com.ksc.network.vpc.model.NetworkAcl;

import lombok.ToString;

@ToString
public class NetworkAcl {
	private String CreateTime;
	
	private String VpcId;
	
	private String NetworkAclName;
	
	private String NetworkAclId;

	private String Description;

	private com.ksc.internal.SdkInternalList<NetworkAclEntry> NetworkAclEntrySet;

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

	public String getNetworkAclName() {
		return NetworkAclName;
	}

	public void setNetworkAclName(String networkAclName) {
		NetworkAclName = networkAclName;
	}

	public String getNetworkAclId() {
		return NetworkAclId;
	}

	public void setNetworkAclId(String networkAclId) {
		NetworkAclId = networkAclId;
	}

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public com.ksc.internal.SdkInternalList<NetworkAclEntry> getNetworkAclEntrySet() {
		return NetworkAclEntrySet;
	}

	public void setNetworkAclEntrySet(
			com.ksc.internal.SdkInternalList<NetworkAclEntry> networkAclEntrySet) {
		NetworkAclEntrySet = networkAclEntrySet;
	}
	
	public void addNetworkAclEntrySet(NetworkAclEntry... acls) {
		if (NetworkAclEntrySet == null) {
			NetworkAclEntrySet = new com.ksc.internal.SdkInternalList<NetworkAclEntry>();
		}
		for (NetworkAclEntry acl : acls) {
			NetworkAclEntrySet.add(acl);
		}
	}

}
