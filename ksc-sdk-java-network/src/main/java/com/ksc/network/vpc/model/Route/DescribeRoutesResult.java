package com.ksc.network.vpc.model.Route;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSecurityGroups.
 * </p>
 */
@ToString
public class DescribeRoutesResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Route> RouteSet;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

	/*
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * 
     * @return Information about one or more SecurityGroups.
     */
    public java.util.List<Route> getRouteSet() {
        if (RouteSet == null) {
        	RouteSet = new com.ksc.internal.SdkInternalList<Route>();
        }
        return RouteSet;
    }

    /**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * 
     * @param vpcs
     *        Information about one or more SecurityGroups.
     */

    public void setRouteSet(java.util.Collection<Route> routes) {
        if (routes == null) {
            this.RouteSet = null;
            return;
        }

        this.RouteSet = new com.ksc.internal.SdkInternalList<Route>(routes);
    }

    /**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or
     * {@link #withSecurityGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param securityGroups
     *        Information about one or more SecurityGroups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeRoutesResult withRoutes(Route... routes) {
        if (this.RouteSet == null) {
            setRouteSet(new com.ksc.internal.SdkInternalList<Route>(routes.length));
        }
        for (Route ele : routes) {
            this.RouteSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     * 
     * @param securityGroups
     *        Information about one or more SecurityGroups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeRoutesResult withRoutes(java.util.Collection<Route> routes) {
        setRouteSet(routes);
        return this;
    }
}