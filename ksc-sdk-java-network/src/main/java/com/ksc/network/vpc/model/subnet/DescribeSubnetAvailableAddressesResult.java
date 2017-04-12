
package com.ksc.network.vpc.model.subnet;

import java.io.Serializable;

import com.ksc.network.vpc.model.vpc.Vpc;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class DescribeSubnetAvailableAddressesResult implements Serializable, Cloneable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4342231836921805816L;
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more VPCs.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<String> AvailableIpAddress;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

	/**
     * <p>
     * Information about one or more VPCs.
     * </p>
     * 
     * @return Information about one or more VPCs.
     */
    public java.util.List<String> getAvailableIpAddress() {
        if (AvailableIpAddress == null) {
            AvailableIpAddress = new com.ksc.internal.SdkInternalList<String>();
        }
        return AvailableIpAddress;
    }


    public void setVpcSet(java.util.Collection<String> availableAddresses) {
        if (availableAddresses == null) {
            this.AvailableIpAddress = null;
            return;
        }

        this.AvailableIpAddress = new com.ksc.internal.SdkInternalList<String>(availableAddresses);
    }

    public DescribeSubnetAvailableAddressesResult withAvailableIpAddress(String... availableAddresses) {
        if (this.AvailableIpAddress == null) {
            setVpcSet(new com.ksc.internal.SdkInternalList<String>(availableAddresses.length));
        }
        for (String ele : availableAddresses) {
            this.AvailableIpAddress.add(ele);
        }
        return this;
    }

    public DescribeSubnetAvailableAddressesResult withAvailableIpAddress(java.util.Collection<String> availableAddresses) {
        setVpcSet(availableAddresses);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSubnetAvailableAddressesResult == false)
            return false;
        DescribeSubnetAvailableAddressesResult other = (DescribeSubnetAvailableAddressesResult) obj;
        if (other.getAvailableIpAddress() == null ^ this.getAvailableIpAddress() == null)
            return false;
        if (other.getAvailableIpAddress() != null
                && other.getAvailableIpAddress().equals(this.getAvailableIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailableIpAddress() == null) ? 0 : getAvailableIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubnetAvailableAddressesResult clone() {
        try {
            return (DescribeSubnetAvailableAddressesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}