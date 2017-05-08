package com.ksc.network.vpc.model.Tunnels;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Tunnels.AssociateRemoteCidrRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AssociateRemoteCidr.
 * </p>
 */
public class AssociateRemoteCidrRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociateRemoteCidrRequest> {

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

        AssociateRemoteCidrRequest that = (AssociateRemoteCidrRequest) o;

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
    public AssociateRemoteCidrRequest clone() {
        return (AssociateRemoteCidrRequest) super.clone();
    }

    @Override
    public Request<AssociateRemoteCidrRequest> getDryRunRequest() {
        Request<AssociateRemoteCidrRequest> request = new AssociateRemoteCidrRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}