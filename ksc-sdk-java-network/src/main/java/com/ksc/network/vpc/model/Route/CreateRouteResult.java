package com.ksc.network.vpc.model.Route;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateRoute.
 * </p>
 */
@ToString
public class CreateRouteResult implements Serializable, Cloneable {

	
	private String RequestId;

	private String RouteId;
	

	    
    @Override
    public CreateRouteResult clone() {
        try {
            return (CreateRouteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }



	public String getRequestId() {
		return RequestId;
	}



	public void setRequestId(String requestId) {
		RequestId = requestId;
	}



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
		result = prime * result
				+ ((RequestId == null) ? 0 : RequestId.hashCode());
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
		CreateRouteResult other = (CreateRouteResult) obj;
		if (RequestId == null) {
			if (other.RequestId != null)
				return false;
		} else if (!RequestId.equals(other.RequestId))
			return false;
		if (RouteId == null) {
			if (other.RouteId != null)
				return false;
		} else if (!RouteId.equals(other.RouteId))
			return false;
		return true;
	}	
}