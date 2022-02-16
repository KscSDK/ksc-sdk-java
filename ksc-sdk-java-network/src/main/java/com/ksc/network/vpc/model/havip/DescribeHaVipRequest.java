package com.ksc.network.vpc.model.havip;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.internal.SdkInternalList;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.havip.DescribeHaVipRequestMarshaller;
import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeHaVip.
 * </p>
 */
@ToString
public class DescribeHaVipRequest extends KscWebServiceRequest implements
        DryRunSupportedRequest<DescribeHaVipRequest> {

    private SdkInternalList<String> haVipIds;

    private SdkInternalList<Filter> filters;

    public java.util.List<String> getHaVipIds() {
        if (haVipIds == null) {
            haVipIds = new SdkInternalList<String>();
        }
        return haVipIds;
    }


    public void setHaVipIds(java.util.Collection<String> haVipIds) {
        if (haVipIds == null) {
            this.haVipIds = null;
            return;
        }

        this.haVipIds = new SdkInternalList<String>(haVipIds);
    }


    public DescribeHaVipRequest withHaVipIds(String... haVipIds) {
        if (this.haVipIds == null) {
            setHaVipIds(new SdkInternalList<String>(haVipIds.length));
        }
        for (String ele : haVipIds) {
            this.haVipIds.add(ele);
        }
        return this;
    }


    public DescribeHaVipRequest withHaVipIds(java.util.Collection<String> haVipIds) {
        setHaVipIds(haVipIds);
        return this;
    }

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new SdkInternalList<Filter>();
        }
        return filters;
    }

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new SdkInternalList<Filter>(
                filters);
    }

    public DescribeHaVipRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeHaVipRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeHaVipRequest that = (DescribeHaVipRequest) o;

        if (!haVipIds.equals(that.haVipIds)) return false;
        return filters.equals(that.filters);
    }

    @Override
    public int hashCode() {
        int result = haVipIds.hashCode();
        result = 31 * result + filters.hashCode();
        return result;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeHaVipRequest> getDryRunRequest() {
        Request<DescribeHaVipRequest> request = new DescribeHaVipRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}