package com.ksc.network.vpc.model;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSecurityGroups.
 * </p>
 */
@ToString
public class DescribeSecurityGroupsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<SecurityGroup> SecurityGroupSet;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

	/**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * 
     * @return Information about one or more SecurityGroups.
     */
    public java.util.List<SecurityGroup> getSecurityGroupSet() {
        if (SecurityGroupSet == null) {
        	SecurityGroupSet = new com.ksc.internal.SdkInternalList<SecurityGroup>();
        }
        return SecurityGroupSet;
    }

    /**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * 
     * @param vpcs
     *        Information about one or more SecurityGroups.
     */

    public void setSecurityGroupSet(java.util.Collection<SecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.SecurityGroupSet = null;
            return;
        }

        this.SecurityGroupSet = new com.ksc.internal.SdkInternalList<SecurityGroup>(securityGroups);
    }

    /**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or
     * {@link #withSecurityGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param securityGroups
     *        Information about one or more SecurityGroups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSecurityGroupsResult withSecurityGroups(SecurityGroup... securityGroups) {
        if (this.SecurityGroupSet == null) {
            setSecurityGroupSet(new com.ksc.internal.SdkInternalList<SecurityGroup>(securityGroups.length));
        }
        for (SecurityGroup ele : securityGroups) {
            this.SecurityGroupSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * 
     * @param securityGroups
     *        Information about one or more SecurityGroups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSecurityGroupsResult withSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        setSecurityGroupSet(securityGroups);
        return this;
    }
}