package com.ksc.network.vpc.model.SecurityGroups;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeSecurityGroups.
 * </p>
 */
@ToString
public class DescribeSecurityGroupsRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeSecurityGroupsRequest> {
	/**
     * <p>
     * One or more SecurityGroup IDs.
     * </p>
     * <p>
     * Default: Describes all your SecurityGroups.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> securityGroupIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more SecurityGroup IDs.
     * </p>
     * <p>
     * Default: Describes all your SecurityGroups.
     * </p>
     * 
     * @return One or more SecurityGroup IDs.</p>
     *         <p>
     *         Default: Describes all your SecurityGroups.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
        	securityGroupIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more SecurityGroup IDs.
     * </p>
     * <p>
     * Default: Describes all your SecurityGroups.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more SecurityGroup IDs.</p>
     *        <p>
     *        Default: Describes all your SecurityGroups.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.ksc.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more SecurityGroup IDs.
     * </p>
     * <p>
     * Default: Describes all your SecurityGroups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or
     * {@link #withSecurityGroupIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more SecurityGroup IDs.</p>
     *        <p>
     *        Default: Describes all your SecurityGroups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSecurityGroupsRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.ksc.internal.SdkInternalList<String>(
            		securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more SecurityGroup IDs.
     * </p>
     * <p>
     * Default: Describes all your SecurityGroups.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more SecurityGroup IDs.</p>
     *        <p>
     *        Default: Describes all your SecurityGroups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSecurityGroupsRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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

    public DescribeSecurityGroupsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeSecurityGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeSecurityGroupsRequest> getDryRunRequest() {
       /*Request<DescribeSecurityGroupsRequest> request = new DescribeSubnetsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;*/
    	return null;
    }
   
}