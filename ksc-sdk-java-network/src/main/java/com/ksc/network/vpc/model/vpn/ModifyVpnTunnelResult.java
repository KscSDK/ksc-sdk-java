package com.ksc.network.vpc.model.vpn;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyVpnTunnel.
 * </p>
 */
@Data
public class ModifyVpnTunnelResult implements Serializable, Cloneable {

    private String RequestId;
    private VpnTunnel VpnTunnel;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyVpnTunnelResult that = (ModifyVpnTunnelResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (VpnTunnel != null ? !VpnTunnel.equals(that.VpnTunnel) : that.VpnTunnel != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (VpnTunnel != null ? VpnTunnel.hashCode() : 0);
        return result;
    }


    @Override
    public ModifyVpnTunnelResult clone() {
        try {
            return (ModifyVpnTunnelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
