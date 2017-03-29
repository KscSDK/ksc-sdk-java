package com.ksc.network.vpc.model.Route;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.Routes.DeleteRouteRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.DeleteSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DeleteVpcRequestMarshaller;






import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteSubnet.
 * </p>
 */
public class DeleteRouteRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteRouteRequest> {


    /**
     * 路由的ID
     */
    private String RouteId;
    
    
	public String getRouteId() {
		return RouteId;
	}

	public void setRouteId(String routeId) {
		RouteId = routeId;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((RouteId == null) ? 0 : RouteId.hashCode());
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
		DeleteRouteRequest other = (DeleteRouteRequest) obj;
		if (RouteId == null) {
			if (other.RouteId != null)
				return false;
		} else if (!RouteId.equals(other.RouteId))
			return false;
		return true;
	}

	@Override
    public DeleteRouteRequest clone() {
        return (DeleteRouteRequest) super.clone();
    }

    @Override
    public Request<DeleteRouteRequest> getDryRunRequest() {
        Request<DeleteRouteRequest> request = new DeleteRouteRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}