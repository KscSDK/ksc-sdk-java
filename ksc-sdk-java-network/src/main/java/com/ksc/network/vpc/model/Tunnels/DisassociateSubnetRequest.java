package com.ksc.network.vpc.model.Tunnels;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Tunnels.DisassociateSubnetRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DisassociateSubnet.
 * </p>
 */
public class DisassociateSubnetRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DisassociateSubnetRequest> {

	/**
	 * 隧道网关ID
	 */
	private String TunnelId;

    /**
     * 子网的ID
     */
    private String SubnetId;

    public String getTunnelId() {
        return TunnelId;
    }

    public void setTunnelId(String tunnelId) {
        TunnelId = tunnelId;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisassociateSubnetRequest that = (DisassociateSubnetRequest) o;

        if (!TunnelId.equals(that.TunnelId)) return false;
        return SubnetId.equals(that.SubnetId);
    }

    @Override
    public int hashCode() {
        int result = TunnelId.hashCode();
        result = 31 * result + SubnetId.hashCode();
        return result;
    }

    @Override
    public DisassociateSubnetRequest clone() {
        return (DisassociateSubnetRequest) super.clone();
    }

    @Override
    public Request<DisassociateSubnetRequest> getDryRunRequest() {
        Request<DisassociateSubnetRequest> request = new DisassociateSubnetRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}