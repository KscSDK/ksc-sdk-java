package com.ksc.network.vpc.model.subnet;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSubnets.
 * </p>
 */
@ToString
public class DescribeSubnetAvailableAddressesResult {
	
	private String RequestId;

    private String AvailableIpAddress;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getAvailableIpAddress() {
        return AvailableIpAddress;
    }

    public void setAvailableIpAddress(String availableIpAddress) {
        AvailableIpAddress = availableIpAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeSubnetAvailableAddressesResult that = (DescribeSubnetAvailableAddressesResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return AvailableIpAddress.equals(that.AvailableIpAddress);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + AvailableIpAddress.hashCode();
        return result;
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