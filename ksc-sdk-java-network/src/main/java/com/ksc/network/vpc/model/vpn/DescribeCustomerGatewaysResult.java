package com.ksc.network.vpc.model.vpn;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeCustomerGateways.
 * </p>
 */
@Data
public class DescribeCustomerGatewaysResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<CustomerGateway> CustomerGatewaySet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeCustomerGatewaysResult that = (DescribeCustomerGatewaysResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (CustomerGatewaySet != null ? !CustomerGatewaySet.equals(that.CustomerGatewaySet) : that.CustomerGatewaySet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (CustomerGatewaySet != null ? CustomerGatewaySet.hashCode() : 0);
        return result;
    }

    public void addCustomerGatewaySet(CustomerGateway... customerGateways) {
		if (this.CustomerGatewaySet == null) {
			this.CustomerGatewaySet = new SdkInternalList<CustomerGateway>();
		}
		for (CustomerGateway customerGateway : customerGateways) {
			this.CustomerGatewaySet.add(customerGateway);
		}
	}


    @Override
    public DescribeCustomerGatewaysResult clone() {
        try {
            return (DescribeCustomerGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
