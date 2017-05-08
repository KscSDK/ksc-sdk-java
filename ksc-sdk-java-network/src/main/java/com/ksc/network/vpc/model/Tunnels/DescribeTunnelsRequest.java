package com.ksc.network.vpc.model.Tunnels;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeTunnels.
 * </p>
 */
@ToString
public class DescribeTunnelsRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeTunnelsRequest> {

    private com.ksc.internal.SdkInternalList<String> tunnelIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;


    public java.util.List<String> getTunnelIds() {
        if (tunnelIds == null) {
            tunnelIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return tunnelIds;
    }


    public void setTunnelIds(java.util.Collection<String> tunnelIds) {
        if (tunnelIds == null) {
            this.tunnelIds = null;
            return;
        }

        this.tunnelIds = new com.ksc.internal.SdkInternalList<String>(tunnelIds);
    }



    public DescribeTunnelsRequest withTunnelIds(String... tunnelIds) {
        if (this.tunnelIds == null) {
            setTunnelIds(new com.ksc.internal.SdkInternalList<String>(
                    tunnelIds.length));
        }
        for (String ele : tunnelIds) {
            this.tunnelIds.add(ele);
        }
        return this;
    }



    public DescribeTunnelsRequest withTunnelIds(java.util.Collection<String> tunnelIds) {
        setTunnelIds(tunnelIds);
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

    public DescribeTunnelsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeTunnelsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeTunnelsRequest that = (DescribeTunnelsRequest) o;

        if (!tunnelIds.equals(that.tunnelIds)) return false;
        return filters.equals(that.filters);
    }

    @Override
    public int hashCode() {
        int result = tunnelIds.hashCode();
        result = 31 * result + filters.hashCode();
        return result;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeTunnelsRequest> getDryRunRequest() {
       /*Request<DescribeSecurityGroupsRequest> request = new DescribeSubnetsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;*/
    	return null;
    }
   
}