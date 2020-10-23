package com.ksc.network.vpc.model.vpn;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateVpnGateway.
 * </p>
 */
@Data
public class CreateVpnGatewayResult implements Serializable, Cloneable {

    private String RequestId;
    private VpnGateway VpnGateway;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateVpnGatewayResult that = (CreateVpnGatewayResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (VpnGateway != null ? !VpnGateway.equals(that.VpnGateway) : that.VpnGateway != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (VpnGateway != null ? VpnGateway.hashCode() : 0);
        return result;
    }


    @Override
    public CreateVpnGatewayResult clone() {
        try {
            return (CreateVpnGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
