package com.ksc.network.vpc.model.Tunnels;

import java.io.Serializable;

import com.ksc.network.vpc.model.VpcPeeringConnection.VpcPeeringConnection;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class ModifyTunnelResult implements Serializable, Cloneable {


    private String RequestId;

    private Tunnel Tunnel;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public com.ksc.network.vpc.model.Tunnels.Tunnel getTunnel() {
        return Tunnel;
    }

    public void setTunnel(com.ksc.network.vpc.model.Tunnels.Tunnel tunnel) {
        Tunnel = tunnel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyTunnelResult that = (ModifyTunnelResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return Tunnel.equals(that.Tunnel);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + Tunnel.hashCode();
        return result;
    }

    @Override
    public ModifyTunnelResult clone() {
        try {
            return (ModifyTunnelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}