package com.ksc.network.vpc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.DescribeSubnetsRequestMarshaller;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeSubnets.
 * </p>
 */
@ToString
public class DescribeSubnetsRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeSubnetsRequest> {
	/**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> subnetIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * 
     * @return One or more Subnet IDs.</p>
     *         <p>
     *         Default: Describes all your Subnets.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
        	subnetIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * 
     * @param subnetIds
     *        One or more Subnet IDs.</p>
     *        <p>
     *        Default: Describes all your Subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.ksc.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or
     * {@link #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param subnetIds
     *        One or more Subnet IDs.</p>
     *        <p>
     *        Default: Describes all your Subnets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubnetsRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.ksc.internal.SdkInternalList<String>(
            		subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * 
     * @param subnetIds
     *        One or more Subnet IDs.</p>
     *        <p>
     *        Default: Describes all your Subnets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubnetsRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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

    public DescribeSubnetsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeSubnetsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeSubnetsRequest> getDryRunRequest() {
       Request<DescribeSubnetsRequest> request = new DescribeSubnetsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
   
}