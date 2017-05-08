package com.ksc.network.vpc.model.Nat;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeNats.
 * </p>
 */
@ToString
public class DescribeNatsRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeNatsRequest> {

    private com.ksc.internal.SdkInternalList<String> natIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;


    public java.util.List<String> getNatIds() {
        if (natIds == null) {
            natIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return natIds;
    }


    public void setNatIds(java.util.Collection<String> natIds) {
        if (natIds == null) {
            this.natIds = null;
            return;
        }

        this.natIds = new com.ksc.internal.SdkInternalList<String>(natIds);
    }



    public DescribeNatsRequest withNatIds(String... natIds) {
        if (this.natIds == null) {
            setNatIds(new com.ksc.internal.SdkInternalList<String>(
                    natIds.length));
        }
        for (String ele : natIds) {
            this.natIds.add(ele);
        }
        return this;
    }



    public DescribeNatsRequest withNatIds(java.util.Collection<String> natIds) {
        setNatIds(natIds);
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

    public DescribeNatsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeNatsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeNatsRequest that = (DescribeNatsRequest) o;

        if (!natIds.equals(that.natIds)) return false;
        return filters.equals(that.filters);
    }

    @Override
    public int hashCode() {
        int result = natIds.hashCode();
        result = 31 * result + filters.hashCode();
        return result;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeNatsRequest> getDryRunRequest() {
       /*Request<DescribeSecurityGroupsRequest> request = new DescribeSubnetsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;*/
    	return null;
    }
   
}