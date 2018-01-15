package com.ksc.network.vpc.model.Route;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeRoutes.
 * </p>
 */
@ToString
@EqualsAndHashCode
public class DescribeRoutesResult {
	
	private String RequestId;
	/**
     * <p>
     * 路由的信息.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Route> RouteSet;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

    public java.util.List<Route> getRouteSet() {
        if (RouteSet == null) {
        	RouteSet = new com.ksc.internal.SdkInternalList<Route>();
        }
        return RouteSet;
    }

    public void setRouteSet(java.util.Collection<Route> routes) {
        if (routes == null) {
            this.RouteSet = null;
            return;
        }

        this.RouteSet = new com.ksc.internal.SdkInternalList<Route>(routes);
    }

    public DescribeRoutesResult withRoutes(Route... routes) {
        if (this.RouteSet == null) {
            setRouteSet(new com.ksc.internal.SdkInternalList<Route>(routes.length));
        }
        for (Route ele : routes) {
            this.RouteSet.add(ele);
        }
        return this;
    }

    public DescribeRoutesResult withRoutes(java.util.Collection<Route> routes) {
        setRouteSet(routes);
        return this;
    }
}