package com.ksc.network.vpc.model.subnet;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSubnets.
 * </p>
 */
@ToString
@EqualsAndHashCode
public class DescribeSubnetsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more Subnets.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Subnet> SubnetSet;

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
     * Information about one or more Subnets.
     * </p>
     * 
     * @return Information about one or more Subnets.
     */
    public java.util.List<Subnet> getSubnetSet() {
        if (SubnetSet == null) {
        	SubnetSet = new com.ksc.internal.SdkInternalList<Subnet>();
        }
        return SubnetSet;
    }

    public void setSubnetSet(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.SubnetSet = null;
            return;
        }

        this.SubnetSet = new com.ksc.internal.SdkInternalList<Subnet>(subnets);
    }

    public DescribeSubnetsResult withSubnets(Subnet... subnets) {
        if (this.SubnetSet == null) {
            setSubnetSet(new com.ksc.internal.SdkInternalList<Subnet>(subnets.length));
        }
        for (Subnet ele : subnets) {
            this.SubnetSet.add(ele);
        }
        return this;
    }

    public DescribeSubnetsResult withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnetSet(subnets);
        return this;
    }
}