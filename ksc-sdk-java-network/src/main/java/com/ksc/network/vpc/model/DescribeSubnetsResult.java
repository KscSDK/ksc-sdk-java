package com.ksc.network.vpc.model;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSubnets.
 * </p>
 */
@ToString
public class DescribeSubnetsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more Subnets.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Subnet> SubnetSet;
    
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

    /**
     * <p>
     * Information about one or more Subnets.
     * </p>
     * 
     * @param vpcs
     *        Information about one or more Subnets.
     */

    public void setSubnetSet(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.SubnetSet = null;
            return;
        }

        this.SubnetSet = new com.ksc.internal.SdkInternalList<Subnet>(subnets);
    }

    /**
     * <p>
     * Information about one or more Subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnets(java.util.Collection)} or
     * {@link #withSubnets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param subnets
     *        Information about one or more Subnets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubnetsResult withSubnets(Subnet... subnets) {
        if (this.SubnetSet == null) {
            setSubnetSet(new com.ksc.internal.SdkInternalList<Subnet>(subnets.length));
        }
        for (Subnet ele : subnets) {
            this.SubnetSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more Subnets.
     * </p>
     * 
     * @param vpcs
     *        Information about one or more Subnets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubnetsResult withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnetSet(subnets);
        return this;
    }
}