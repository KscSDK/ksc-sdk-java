package com.ksc.network.vpc.model.Route;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.Routes.CreateRouteRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateSubnet.
 * </p>
 */
public class CreateRouteRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateRouteRequest> {


    /**
     * Vpc的ID
     */
    private String VpcId;
    /**
     * 目标网段
     */
    private String DestinationCidrBlock;
    /**
     * 路由的类型，Tunnel为隧道网关，InternetGateway为互联网网关，Host为主机路由
     */
    private String RouteType;
    /**
     * 隧道网关ID，只有隧道网关类型路由需要填写此参数
     */
    private String TunnelId;
    /**
     * 云服务器的ID，只有主机路由需要填写此参数
     */
    private String InstanceId;
    
    
	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getDestinationCidrBlock() {
		return DestinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		DestinationCidrBlock = destinationCidrBlock;
	}

	public String getRouteType() {
		return RouteType;
	}

	public void setRouteType(String routeType) {
		RouteType = routeType;
	}

	public String getTunnelId() {
		return TunnelId;
	}

	public void setTunnelId(String tunnelId) {
		TunnelId = tunnelId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((DestinationCidrBlock == null) ? 0 : DestinationCidrBlock
						.hashCode());
		result = prime * result
				+ ((InstanceId == null) ? 0 : InstanceId.hashCode());
		result = prime * result
				+ ((RouteType == null) ? 0 : RouteType.hashCode());
		result = prime * result
				+ ((TunnelId == null) ? 0 : TunnelId.hashCode());
		result = prime * result + ((VpcId == null) ? 0 : VpcId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateRouteRequest other = (CreateRouteRequest) obj;
		if (DestinationCidrBlock == null) {
			if (other.DestinationCidrBlock != null)
				return false;
		} else if (!DestinationCidrBlock.equals(other.DestinationCidrBlock))
			return false;
		if (InstanceId == null) {
			if (other.InstanceId != null)
				return false;
		} else if (!InstanceId.equals(other.InstanceId))
			return false;
		if (RouteType == null) {
			if (other.RouteType != null)
				return false;
		} else if (!RouteType.equals(other.RouteType))
			return false;
		if (TunnelId == null) {
			if (other.TunnelId != null)
				return false;
		} else if (!TunnelId.equals(other.TunnelId))
			return false;
		if (VpcId == null) {
			if (other.VpcId != null)
				return false;
		} else if (!VpcId.equals(other.VpcId))
			return false;
		return true;
	}

	@Override
    public CreateRouteRequest clone() {
        return (CreateRouteRequest) super.clone();
    }

    @Override
    public Request<CreateRouteRequest> getDryRunRequest() {
        Request<CreateRouteRequest> request = new CreateRouteRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}