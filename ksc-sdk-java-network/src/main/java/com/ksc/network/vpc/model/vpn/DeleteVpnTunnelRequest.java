package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.DeleteVpnTunnelRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteVpnTunnel.
 * </p>
 */
@Data
public class DeleteVpnTunnelRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteVpnTunnelRequest> {

    /**
     * VPN通道的ID
     */
    private String vpnTunnelId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteVpnTunnelRequest that = (DeleteVpnTunnelRequest) o;
        if (vpnTunnelId != null ? !vpnTunnelId.equals(that.vpnTunnelId) : that.vpnTunnelId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpnTunnelId != null ? vpnTunnelId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteVpnTunnelRequest> getDryRunRequest() {
        Request<DeleteVpnTunnelRequest> request = new DeleteVpnTunnelRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteVpnTunnelRequest clone() {
        return (DeleteVpnTunnelRequest) super.clone();
    }
}

