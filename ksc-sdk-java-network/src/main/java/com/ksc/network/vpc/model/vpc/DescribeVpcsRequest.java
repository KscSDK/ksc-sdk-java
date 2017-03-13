package com.ksc.network.vpc.model.vpc;

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
public class DescribeVpcsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeVpcsRequest> {

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
    private com.ksc.internal.SdkInternalList<String> vpcIds;
    
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

    public java.util.List<String> getVpcIds() {
        if (vpcIds == null) {
            vpcIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return vpcIds;
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

    public void setVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
            return;
        }

        this.vpcIds = new com.ksc.internal.SdkInternalList<String>(vpcIds);
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

    public DescribeVpcsRequest withVpcIds(String... vpcIds) {
        if (this.vpcIds == null) {
            setVpcIds(new com.ksc.internal.SdkInternalList<String>(
                    vpcIds.length));
        }
        for (String ele : vpcIds) {
            this.vpcIds.add(ele);
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

    public DescribeVpcsRequest withVpcIds(java.util.Collection<String> vpcIds) {
        setVpcIds(vpcIds);
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

    public DescribeVpcsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeVpcsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeVpcsRequest> getDryRunRequest() {
        Request<DescribeVpcsRequest> request = new DescribeVpcsRequestMarshaller()
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
        if (getVpcIds() != null)
            sb.append("VpcIds: " + getVpcIds() + ",");
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

        if (obj instanceof DescribeVpcsRequest == false)
            return false;
        DescribeVpcsRequest other = (DescribeVpcsRequest) obj;
        if (other.getVpcIds() == null ^ this.getVpcIds() == null)
            return false;
        if (other.getVpcIds() != null
                && other.getVpcIds().equals(this.getVpcIds()) == false)
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
                + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcsRequest clone() {
        return (DescribeVpcsRequest) super.clone();
    }
}