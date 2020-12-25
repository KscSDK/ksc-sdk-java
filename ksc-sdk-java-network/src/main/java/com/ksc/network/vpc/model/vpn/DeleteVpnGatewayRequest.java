package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.DeleteVpnGatewayRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteVpnGateway.
 * </p>
 */
@Data
public class DeleteVpnGatewayRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteVpnGatewayRequest> {

    /**
     * VPN网关ID
     */
    private String vpnGatewayId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteVpnGatewayRequest that = (DeleteVpnGatewayRequest) o;
        if (vpnGatewayId != null ? !vpnGatewayId.equals(that.vpnGatewayId) : that.vpnGatewayId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpnGatewayId != null ? vpnGatewayId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteVpnGatewayRequest> getDryRunRequest() {
        Request<DeleteVpnGatewayRequest> request = new DeleteVpnGatewayRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteVpnGatewayRequest clone() {
        return (DeleteVpnGatewayRequest) super.clone();
    }
}

