package com.ksc.network.vpc.model.AvailabilityZone;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.AvailabilityZone.DescribeAvailabilityZonesRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeAvailabilityZones.
 * </p>
 */
public class DescribeAvailabilityZonesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeAvailabilityZonesRequest> {

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
    private com.ksc.internal.SdkInternalList<String> zoneNames;
    
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

    public java.util.List<String> getZoneNames() {
        if (zoneNames == null) {
        	zoneNames = new com.ksc.internal.SdkInternalList<String>();
        }
        return zoneNames;
    }

    public void setZoneNames(java.util.Collection<String> zoneNames) {
        if (zoneNames == null) {
            this.zoneNames = null;
            return;
        }

        this.zoneNames = new com.ksc.internal.SdkInternalList<String>(zoneNames);
    }

    public DescribeAvailabilityZonesRequest withZoneNames(String... zoneNames) {
        if (this.zoneNames == null) {
            setZoneNames(new com.ksc.internal.SdkInternalList<String>(
            		zoneNames.length));
        }
        for (String ele : zoneNames) {
            this.zoneNames.add(ele);
        }
        return this;
    }

    public DescribeAvailabilityZonesRequest withZoneNames(java.util.Collection<String> zoneNames) {
        setZoneNames(zoneNames);
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

    public DescribeAvailabilityZonesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeAvailabilityZonesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeAvailabilityZonesRequest> getDryRunRequest() {
        Request<DescribeAvailabilityZonesRequest> request = new DescribeAvailabilityZonesRequestMarshaller()
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
        if (getZoneNames() != null)
            sb.append("ZoneNames: " + getZoneNames() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailabilityZonesRequest == false)
            return false;
        DescribeAvailabilityZonesRequest other = (DescribeAvailabilityZonesRequest) obj;
        if (other.getZoneNames() == null ^ this.getZoneNames() == null)
            return false;
        if (other.getZoneNames() != null
                && other.getZoneNames().equals(this.getZoneNames()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getZoneNames() == null) ? 0 : getZoneNames().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAvailabilityZonesRequest clone() {
        return (DescribeAvailabilityZonesRequest) super.clone();
    }
}