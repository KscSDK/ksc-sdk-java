package com.ksc.network.vpc.model.SecurityGroups;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSecurityGroups.
 * </p>
 */
@ToString
@EqualsAndHashCode
public class DescribeSecurityGroupsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<SecurityGroup> SecurityGroupSet;
    /**
     * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
     */
    private String NextToken;

    public String getNextToken() {
        return NextToken;
    }

    public void setNextToken(String nextToken) {
        NextToken = nextToken;
    }
    
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

    public void setSecurityGroupSet(java.util.Collection<SecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.SecurityGroupSet = null;
            return;
        }

        this.SecurityGroupSet = new com.ksc.internal.SdkInternalList<SecurityGroup>(securityGroups);
    }

    public DescribeSecurityGroupsResult withSecurityGroups(SecurityGroup... securityGroups) {
        if (this.SecurityGroupSet == null) {
            setSecurityGroupSet(new com.ksc.internal.SdkInternalList<SecurityGroup>(securityGroups.length));
        }
        for (SecurityGroup ele : securityGroups) {
            this.SecurityGroupSet.add(ele);
        }
        return this;
    }

    public DescribeSecurityGroupsResult withSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        setSecurityGroupSet(securityGroups);
        return this;
    }
}