package com.ksc.network.vpc.model.Tunnels;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Nat.AssociateNatRequestMarshaller;
import com.ksc.network.vpc.transform.Tunnels.AssociateSubnetRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteSubnet.
 * </p>
 */
public class AssociateSubnetRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociateSubnetRequest> {


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

        AssociateSubnetRequest that = (AssociateSubnetRequest) o;

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
    public AssociateSubnetRequest clone() {
        return (AssociateSubnetRequest) super.clone();
    }

    @Override
    public Request<AssociateSubnetRequest> getDryRunRequest() {
        Request<AssociateSubnetRequest> request = new AssociateSubnetRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}