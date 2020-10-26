package com.ksc.network.vpc.model.vpn;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeVpnTunnels.
 * </p>
 */
@Data
public class DescribeVpnTunnelsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<VpnTunnel> VpnTunnelSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeVpnTunnelsResult that = (DescribeVpnTunnelsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (VpnTunnelSet != null ? !VpnTunnelSet.equals(that.VpnTunnelSet) : that.VpnTunnelSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (VpnTunnelSet != null ? VpnTunnelSet.hashCode() : 0);
        return result;
    }

    public void addVpnTunnelSet(VpnTunnel... vpnTunnels) {
		if (this.VpnTunnelSet == null) {
			this.VpnTunnelSet = new SdkInternalList<VpnTunnel>();
		}
		for (VpnTunnel vpnTunnel : vpnTunnels) {
			this.VpnTunnelSet.add(vpnTunnel);
		}
	}


    @Override
    public DescribeVpnTunnelsResult clone() {
        try {
            return (DescribeVpnTunnelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
