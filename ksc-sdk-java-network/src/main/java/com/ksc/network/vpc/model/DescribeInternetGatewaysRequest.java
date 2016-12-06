package com.ksc.network.vpc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.transform.DescribeInternetGatewaysRequestMarshaller;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeInternetGateways.
 * </p>
 */
@ToString
public class DescribeInternetGatewaysRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeInternetGatewaysRequest> {
	/**
     * <p>
     * One or more InternetGateway IDs.
     * </p>
     * <p>
     * Default: Describes all your InternetGateways.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> internetGatewayIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more InternetGateway IDs.
     * </p>
     * <p>
     * Default: Describes all your InternetGateways.
     * </p>
     * 
     * @return One or more InternetGateway IDs.</p>
     *         <p>
     *         Default: Describes all your InternetGateways.
     */

    public java.util.List<String> getInternetGatewayIds() {
        if (internetGatewayIds == null) {
        	internetGatewayIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return internetGatewayIds;
    }

    /**
     * <p>
     * One or more InternetGateway IDs.
     * </p>
     * <p>
     * Default: Describes all your InternetGateways.
     * </p>
     * 
     * @param internetGatewayIds
     *        One or more InternetGateway IDs.</p>
     *        <p>
     *        Default: Describes all your InternetGateways.
     */

    public void setInternetGatewayIds(java.util.Collection<String> internetGatewayIds) {
        if (internetGatewayIds == null) {
            this.internetGatewayIds = null;
            return;
        }

        this.internetGatewayIds = new com.ksc.internal.SdkInternalList<String>(internetGatewayIds);
    }

    /**
     * <p>
     * One or more InternetGateway IDs.
     * </p>
     * <p>
     * Default: Describes all your InternetGateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInternetGatewayIds(java.util.Collection)} or
     * {@link #withInternetGatewayIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param internetGatewayIds
     *        One or more InternetGateway IDs.</p>
     *        <p>
     *        Default: Describes all your InternetGateways.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInternetGatewaysRequest withInternetGatewayIds(String... internetGatewayIds) {
        if (this.internetGatewayIds == null) {
            setInternetGatewayIds(new com.ksc.internal.SdkInternalList<String>(
            		internetGatewayIds.length));
        }
        for (String ele : internetGatewayIds) {
            this.internetGatewayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more InternetGateway IDs.
     * </p>
     * <p>
     * Default: Describes all your InternetGateways.
     * </p>
     * 
     * @param internetGatewayIds
     *        One or more InternetGateway IDs.</p>
     *        <p>
     *        Default: Describes all your InternetGateways.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInternetGatewaysRequest withInternetGatewayIds(java.util.Collection<String> internetGatewayIds) {
        setInternetGatewayIds(internetGatewayIds);
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

    public DescribeInternetGatewaysRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeInternetGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeInternetGatewaysRequest> getDryRunRequest() {
        Request<DescribeInternetGatewaysRequest> request = new DescribeInternetGatewaysRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
   
}