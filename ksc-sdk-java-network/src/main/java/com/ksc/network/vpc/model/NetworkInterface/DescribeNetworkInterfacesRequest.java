package com.ksc.network.vpc.model.NetworkInterface;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.NetworkInterface.DescribeNetworkInterfacesRequestMarshaller;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeVpcs.
 * </p>
 */
@ToString
public class DescribeNetworkInterfacesRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeNetworkInterfacesRequest> {
	/**
     * <p>
     * One or more NetworkInterface IDs.
     * </p>
     * <p>
     * Default: Describes all your NetworkInterfaces.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> networkInterfaceIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more NetworkInterface IDs.
     * </p>
     * <p>
     * Default: Describes all your NetworkInterfaces.
     * </p>
     * 
     * @return One or more NetworkInterface IDs.</p>
     *         <p>
     *         Default: Describes all your NetworkInterfaces.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        if (networkInterfaceIds == null) {
        	networkInterfaceIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return networkInterfaceIds;
    }

    /**
     * <p>
     * One or more NetworkInterface IDs.
     * </p>
     * <p>
     * Default: Describes all your NetworkInterfaces.
     * </p>
     * 
     * @param networkInterfaceIds
     *        One or more NetworkInterface IDs.</p>
     *        <p>
     *        Default: Describes all your NetworkInterfaces.
     */

    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new com.ksc.internal.SdkInternalList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * One or more NetworkInterface IDs.
     * </p>
     * <p>
     * Default: Describes all your NetworkInterfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNetworkInterfaceIds(java.util.Collection)} or
     * {@link #withNetworkInterfaceIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        One or more NetworkInterface IDs.</p>
     *        <p>
     *        Default: Describes all your NetworkInterfaces.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new com.ksc.internal.SdkInternalList<String>(
            		networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more NetworkInterface IDs.
     * </p>
     * <p>
     * Default: Describes all your NetworkInterfaces.
     * </p>
     * 
     * @param networkInterfaceIds
     *        One or more NetworkInterface IDs.</p>
     *        <p>
     *        Default: Describes all your NetworkInterfaces.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
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

    public DescribeNetworkInterfacesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeNetworkInterfacesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeNetworkInterfacesRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfacesRequest> request = new DescribeNetworkInterfacesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
   
}