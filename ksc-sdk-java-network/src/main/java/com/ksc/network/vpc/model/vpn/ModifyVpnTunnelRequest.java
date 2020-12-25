package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.ModifyVpnTunnelRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyVpnTunnel.
 * </p>
 */
@Data
public class ModifyVpnTunnelRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyVpnTunnelRequest> {

    /**
     * VPN通道的ID
     */
    private String vpnTunnelId;
    /**
     * VPN通道的名称
     */
    private String vpnTunnelName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyVpnTunnelRequest that = (ModifyVpnTunnelRequest) o;
        if (vpnTunnelId != null ? !vpnTunnelId.equals(that.vpnTunnelId) : that.vpnTunnelId != null)
            return false;
        if (vpnTunnelName != null ? !vpnTunnelName.equals(that.vpnTunnelName) : that.vpnTunnelName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpnTunnelId != null ? vpnTunnelId.hashCode() : 0);
        result = 31 * result + (vpnTunnelName != null ? vpnTunnelName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyVpnTunnelRequest> getDryRunRequest() {
        Request<ModifyVpnTunnelRequest> request = new ModifyVpnTunnelRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyVpnTunnelRequest clone() {
        return (ModifyVpnTunnelRequest) super.clone();
    }
}

