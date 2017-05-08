package com.ksc.network.vpc.model.Tunnels;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Tunnels.ModifyTunnelRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyTunnel.
 * </p>
 */
public class ModifyTunnelRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyTunnelRequest> {

    /**
     * 隧道网关ID
     */
    private String TunnelId;

    /**
     * 隧道网关的名称
     */
    private String TunnelName;

    public String getTunnelId() {
        return TunnelId;
    }

    public void setTunnelId(String tunnelId) {
        TunnelId = tunnelId;
    }

    public String getTunnelName() {
        return TunnelName;
    }

    public void setTunnelName(String tunnelName) {
        TunnelName = tunnelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyTunnelRequest that = (ModifyTunnelRequest) o;

        if (!TunnelId.equals(that.TunnelId)) return false;
        return TunnelName.equals(that.TunnelName);
    }

    @Override
    public int hashCode() {
        int result = TunnelId.hashCode();
        result = 31 * result + TunnelName.hashCode();
        return result;
    }

    @Override
    public ModifyTunnelRequest clone() {
        return (ModifyTunnelRequest) super.clone();
    }
	
    @Override
    public Request<ModifyTunnelRequest> getDryRunRequest() {
        Request<ModifyTunnelRequest> request = new ModifyTunnelRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}