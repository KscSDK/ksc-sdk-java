package com.ksc.network.vpc.model.NetworkAcl;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeNetworkAcls.
 * </p>
 */
@ToString
public class DescribeNetworkAclsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more NetworkAcl信息
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<NetworkAcl> NetworkAclSet;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

    public java.util.List<NetworkAcl> getNetworkAclSet() {
        if (NetworkAclSet == null) {
            NetworkAclSet = new com.ksc.internal.SdkInternalList<NetworkAcl>();
        }
        return NetworkAclSet;
    }



    public void setNetworkAclSet(java.util.Collection<NetworkAcl> networkAcls) {
        if (networkAcls == null) {
            this.NetworkAclSet = null;
            return;
        }

        this.NetworkAclSet = new com.ksc.internal.SdkInternalList<NetworkAcl>(networkAcls);
    }

    public DescribeNetworkAclsResult withNetworkAcls(NetworkAcl... networkAcls) {
        if (this.NetworkAclSet == null) {
            setNetworkAclSet(new com.ksc.internal.SdkInternalList<NetworkAcl>(networkAcls.length));
        }
        for (NetworkAcl ele : networkAcls) {
            this.NetworkAclSet.add(ele);
        }
        return this;
    }


    public DescribeNetworkAclsResult withNetworkAcls(java.util.Collection<NetworkAcl> networkAcls) {
        setNetworkAclSet(networkAcls);
        return this;
    }
}