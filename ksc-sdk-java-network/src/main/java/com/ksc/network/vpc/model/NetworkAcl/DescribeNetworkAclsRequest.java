package com.ksc.network.vpc.model.NetworkAcl;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeNetworkAcls.
 * </p>
 */
@ToString
public class DescribeNetworkAclsRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeNetworkAclsRequest> {
    /**
     * 一个或多个ACL的ID信息
     */
    private com.ksc.internal.SdkInternalList<String> networkAclIds;

    /**
     * vpc-id，VPC的ID
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;


    public java.util.List<String> getNetworkAclIds() {
        if (networkAclIds == null) {
            networkAclIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return networkAclIds;
    }


    public void setNetworkAclIds(java.util.Collection<String> networkAclIds) {
        if (networkAclIds == null) {
            this.networkAclIds = null;
            return;
        }

        this.networkAclIds = new com.ksc.internal.SdkInternalList<String>(networkAclIds);
    }



    public DescribeNetworkAclsRequest withNetworkAclIds(String... networkAclIds) {
        if (this.networkAclIds == null) {
            setNetworkAclIds(new com.ksc.internal.SdkInternalList<String>(
                    networkAclIds.length));
        }
        for (String ele : networkAclIds) {
            this.networkAclIds.add(ele);
        }
        return this;
    }



    public DescribeNetworkAclsRequest withNetworkAclIds(java.util.Collection<String> networkAclIds) {
        setNetworkAclIds(networkAclIds);
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

    public DescribeNetworkAclsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeNetworkAclsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeNetworkAclsRequest that = (DescribeNetworkAclsRequest) o;

        if (!networkAclIds.equals(that.networkAclIds)) return false;
        return filters.equals(that.filters);
    }

    @Override
    public int hashCode() {
        int result = networkAclIds.hashCode();
        result = 31 * result + filters.hashCode();
        return result;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeNetworkAclsRequest> getDryRunRequest() {
       /*Request<DescribeSecurityGroupsRequest> request = new DescribeSubnetsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;*/
    	return null;
    }
   
}