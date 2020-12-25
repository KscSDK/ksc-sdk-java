package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DescribeHostHeadersRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeHostHeaders.
 * </p>
 */
@Data
public class DescribeHostHeadersRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeHostHeadersRequest> {

    /**
     * 域名的ID
     */
    private com.ksc.internal.SdkInternalList<String> hostHeaderIds;
    /**
     * 过滤条件
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeHostHeadersRequest that = (DescribeHostHeadersRequest) o;
        if (hostHeaderIds != null ? !hostHeaderIds.equals(that.hostHeaderIds) : that.hostHeaderIds != null)
            return false;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostHeaderIds != null ? hostHeaderIds.hashCode() : 0);
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        return result;
    }

    public void addFilters(Filter... filters) {
        if (this.filters == null) {
            this.filters = new com.ksc.internal.SdkInternalList<Filter>();
        }
        for (Filter filter : filters) {
            this.filters.add(filter);
        }
    }

    public void addHostHeaderIds(String... hostHeaderIds){
        if (this.hostHeaderIds == null) {
            this.hostHeaderIds = new com.ksc.internal.SdkInternalList<String>();
        }
        for(String id : hostHeaderIds){
            this.hostHeaderIds.add(id);
        }
    }

    @Override
    public Request<DescribeHostHeadersRequest> getDryRunRequest() {
        Request<DescribeHostHeadersRequest> request = new DescribeHostHeadersRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeHostHeadersRequest clone() {
        return (DescribeHostHeadersRequest) super.clone();
    }
}

