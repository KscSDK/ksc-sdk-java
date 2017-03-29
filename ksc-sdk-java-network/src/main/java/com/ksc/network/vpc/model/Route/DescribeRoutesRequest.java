package com.ksc.network.vpc.model.Route;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.vpc.DescribeVpcsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpcs.
 * </p>
 */
public class DescribeRoutesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeRoutesRequest> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5962326358979008715L;
	/**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> routeIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * 
     * @return One or more VPC IDs.</p>
     *         <p>
     *         Default: Describes all your VPCs.
     */

    public java.util.List<String> getRouteIds() {
        if (routeIds == null) {
        	routeIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return routeIds;
    }

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * 
     * @param vpcIds
     *        One or more VPC IDs.</p>
     *        <p>
     *        Default: Describes all your VPCs.
     */

    public void setRouteIds(java.util.Collection<String> routeIds) {
        if (routeIds == null) {
            this.routeIds = null;
            return;
        }

        this.routeIds = new com.ksc.internal.SdkInternalList<String>(routeIds);
    }

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcIds(java.util.Collection)} or
     * {@link #withVpcIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcIds
     *        One or more VPC IDs.</p>
     *        <p>
     *        Default: Describes all your VPCs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeRoutesRequest withRouteIds(String... routeIds) {
        if (this.routeIds == null) {
            setRouteIds(new com.ksc.internal.SdkInternalList<String>(
            		routeIds.length));
        }
        for (String ele : routeIds) {
            this.routeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * 
     * @param vpcIds
     *        One or more VPC IDs.</p>
     *        <p>
     *        Default: Describes all your VPCs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeRoutesRequest withRouteIds(java.util.Collection<String> vpcIds) {
        setRouteIds(routeIds);
        return this;
    }

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.ksc.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.ksc.internal.SdkInternalList<Filter>(
                filters);
    }

    public DescribeRoutesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeRoutesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeRoutesRequest> getDryRunRequest() {
        Request<DescribeRoutesRequest> request = new DescribeRoutesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRouteIds() != null)
            sb.append("VpcIds: " + getRouteIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filters == null) ? 0 : filters.hashCode());
		result = prime * result
				+ ((routeIds == null) ? 0 : routeIds.hashCode());
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
		DescribeRoutesRequest other = (DescribeRoutesRequest) obj;
		if (filters == null) {
			if (other.filters != null)
				return false;
		} else if (!filters.equals(other.filters))
			return false;
		if (routeIds == null) {
			if (other.routeIds != null)
				return false;
		} else if (!routeIds.equals(other.routeIds))
			return false;
		return true;
	}

	@Override
    public DescribeRoutesRequest clone() {
        return (DescribeRoutesRequest) super.clone();
    }
}