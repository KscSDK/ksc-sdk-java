package com.ksc.network.eip.model;

import java.io.Serializable;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeAddresses.
 * </p>
 */
@ToString
public class DescribeAddressesResult implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3044211011711856722L;
	
	private String RequestId;
    /**
     * <p>
     * Information about one or more Elastic IP addresses.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<Address> AddressesSet;
    
    private String NextToken;
    
    public String getNextToken() {
		return NextToken;
	}
	public void setNextToken(String nextToken) {
		this.NextToken = nextToken;
	}
	/**
     * <p>
     * Information about one or more Elastic IP addresses.
     * </p>
     * 
     * @return Information about one or more Elastic IP addresses.
     */
    public java.util.List<Address> getAddresses() {
        if (AddressesSet == null) {
            AddressesSet = new com.ksc.internal.SdkInternalList<Address>();
        }
        return AddressesSet;
    }
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

	/**
     * <p>
     * Information about one or more Elastic IP AddressesSet.
     * </p>
     * 
     * @param AddressesSet
     *        Information about one or more Elastic IP AddressesSet.
     */

    public void setAddressesSet(java.util.Collection<Address> AddressesSet) {
        if (AddressesSet == null) {
            this.AddressesSet = null;
            return;
        }

        this.AddressesSet = new com.ksc.internal.SdkInternalList<Address>(
                AddressesSet);
    }

    /**
     * <p>
     * Information about one or more Elastic IP AddressesSet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAddressesSet(java.util.Collection)} or
     * {@link #withAddressesSet(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param AddressesSet
     *        Information about one or more Elastic IP AddressesSet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAddressesResult withAddressesSet(Address... AddressesSet) {
        if (this.AddressesSet == null) {
            setAddressesSet(new com.ksc.internal.SdkInternalList<Address>(
                    AddressesSet.length));
        }
        for (Address ele : AddressesSet) {
            this.AddressesSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more Elastic IP AddressesSet.
     * </p>
     * 
     * @param AddressesSet
     *        Information about one or more Elastic IP AddressesSet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAddressesResult withAddressesSet(
            java.util.Collection<Address> AddressesSet) {
        setAddressesSet(AddressesSet);
        return this;
    }
}