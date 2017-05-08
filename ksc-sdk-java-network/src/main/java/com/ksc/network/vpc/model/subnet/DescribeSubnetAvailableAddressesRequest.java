package com.ksc.network.vpc.model.subnet;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.subnet.DescribeSubnetAvailableAddressesRequestMarshaller;
import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeSubnetAvailableAddresses.
 * </p>
 */
@ToString
public class DescribeSubnetAvailableAddressesRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeSubnetAvailableAddressesRequest> {

    private com.ksc.internal.SdkInternalList<Filter> filters;

    private Integer MaxResults;

    private String NextToken;

    public Integer getMaxResults() {
        return MaxResults;
    }

    public void setMaxResults(Integer maxResults) {
        MaxResults = maxResults;
    }

    public String getNextToken() {
        return NextToken;
    }

    public void setNextToken(String nextToken) {
        NextToken = nextToken;
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

    public DescribeSubnetAvailableAddressesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeSubnetAvailableAddressesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeSubnetAvailableAddressesRequest that = (DescribeSubnetAvailableAddressesRequest) o;

        if (!filters.equals(that.filters)) return false;
        if (!MaxResults.equals(that.MaxResults)) return false;
        return NextToken.equals(that.NextToken);
    }

    @Override
    public int hashCode() {
        int result = filters.hashCode();
        result = 31 * result + MaxResults.hashCode();
        result = 31 * result + NextToken.hashCode();
        return result;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeSubnetAvailableAddressesRequest> getDryRunRequest() {
       Request<DescribeSubnetAvailableAddressesRequest> request = new DescribeSubnetAvailableAddressesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
   
}