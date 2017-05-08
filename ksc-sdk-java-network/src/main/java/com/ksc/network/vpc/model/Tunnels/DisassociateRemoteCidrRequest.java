package com.ksc.network.vpc.model.Tunnels;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Tunnels.DisassociateRemoteCidrRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DisassociateRemoteCidr.
 * </p>
 */
public class DisassociateRemoteCidrRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DisassociateRemoteCidrRequest> {

	/**
	 * 隧道网关ID
	 */
	private String TunnelId;

    /**
     * 网段
     */
    private String CidrBlock;

    public String getTunnelId() {
        return TunnelId;
    }

    public void setTunnelId(String tunnelId) {
        TunnelId = tunnelId;
    }

    public String getCidrBlock() {
        return CidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        CidrBlock = cidrBlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisassociateRemoteCidrRequest that = (DisassociateRemoteCidrRequest) o;

        if (!TunnelId.equals(that.TunnelId)) return false;
        return CidrBlock.equals(that.CidrBlock);
    }

    @Override
    public int hashCode() {
        int result = TunnelId.hashCode();
        result = 31 * result + CidrBlock.hashCode();
        return result;
    }

    @Override
    public DisassociateRemoteCidrRequest clone() {
        return (DisassociateRemoteCidrRequest) super.clone();
    }

    @Override
    public Request<DisassociateRemoteCidrRequest> getDryRunRequest() {
        Request<DisassociateRemoteCidrRequest> request = new DisassociateRemoteCidrRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}