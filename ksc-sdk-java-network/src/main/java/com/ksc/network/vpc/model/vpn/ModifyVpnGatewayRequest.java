package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.ModifyVpnGatewayRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyVpnGateway.
 * </p>
 */
@Data
public class ModifyVpnGatewayRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyVpnGatewayRequest> {

    /**
     * VPN网关ID
     */
    private String vpnGatewayId;
    /**
     * VPN网关的带宽
     */
    private Integer bandWidth;
    /**
     * VPN网关的名称
     */
    private String vpnGatewayName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyVpnGatewayRequest that = (ModifyVpnGatewayRequest) o;
        if (vpnGatewayId != null ? !vpnGatewayId.equals(that.vpnGatewayId) : that.vpnGatewayId != null)
            return false;
        if (bandWidth != null ? !bandWidth.equals(that.bandWidth) : that.bandWidth != null)
            return false;
        if (vpnGatewayName != null ? !vpnGatewayName.equals(that.vpnGatewayName) : that.vpnGatewayName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpnGatewayId != null ? vpnGatewayId.hashCode() : 0);
        result = 31 * result + (bandWidth != null ? bandWidth.hashCode() : 0);
        result = 31 * result + (vpnGatewayName != null ? vpnGatewayName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyVpnGatewayRequest> getDryRunRequest() {
        Request<ModifyVpnGatewayRequest> request = new ModifyVpnGatewayRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyVpnGatewayRequest clone() {
        return (ModifyVpnGatewayRequest) super.clone();
    }
}

