package com.ksc.network.vpc.model.vpn;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyCustomerGateway.
 * </p>
 */
@Data
public class ModifyCustomerGatewayResult implements Serializable, Cloneable {

    private String RequestId;
    private CustomerGateway CustomerGateway;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyCustomerGatewayResult that = (ModifyCustomerGatewayResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (CustomerGateway != null ? !CustomerGateway.equals(that.CustomerGateway) : that.CustomerGateway != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (CustomerGateway != null ? CustomerGateway.hashCode() : 0);
        return result;
    }


    @Override
    public ModifyCustomerGatewayResult clone() {
        try {
            return (ModifyCustomerGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
