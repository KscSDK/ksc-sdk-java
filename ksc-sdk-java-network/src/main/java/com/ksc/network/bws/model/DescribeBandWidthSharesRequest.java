package com.ksc.network.bws.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.bws.model.transform.DescribeBandWidthSharesRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeBandWidthShares.
 * </p>
 */
@Data
public class DescribeBandWidthSharesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeBandWidthSharesRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 共享带宽的ID
     */
    private com.ksc.internal.SdkInternalList<String> bandWidthShareIds;
    /**
     * 项目ID
     */
    private com.ksc.internal.SdkInternalList<String> projectIds;
    /**
     * 单次调用可返回的最大条目数量.
     */
    private String maxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    private String nextToken;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeBandWidthSharesRequest that = (DescribeBandWidthSharesRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (bandWidthShareIds != null ? !bandWidthShareIds.equals(that.bandWidthShareIds) : that.bandWidthShareIds != null)
            return false;
        if (projectIds != null ? !projectIds.equals(that.projectIds) : that.projectIds != null)
            return false;
        if (maxResults != null ? !maxResults.equals(that.maxResults) : that.maxResults != null)
            return false;
        if (nextToken != null ? !nextToken.equals(that.nextToken) : that.nextToken != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (bandWidthShareIds != null ? bandWidthShareIds.hashCode() : 0);
        result = 31 * result + (projectIds != null ? projectIds.hashCode() : 0);
        result = 31 * result + (maxResults != null ? maxResults.hashCode() : 0);
        result = 31 * result + (nextToken != null ? nextToken.hashCode() : 0);
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

    public void addBandWidthShareIds(String... bandWidthShareIds) {
        if (this.bandWidthShareIds == null) {
            this.bandWidthShareIds = new com.ksc.internal.SdkInternalList<String>();
        }
        for (String value : bandWidthShareIds) {
            this.bandWidthShareIds.add(value);
        }
    }

    public void addProjectIds(String... projectIds) {
        if (this.projectIds == null) {
            this.projectIds = new com.ksc.internal.SdkInternalList<String>();
        }
        for (String value : projectIds) {
            this.projectIds.add(value);
        }
    }

    @Override
    public Request<DescribeBandWidthSharesRequest> getDryRunRequest() {
        Request<DescribeBandWidthSharesRequest> request = new DescribeBandWidthSharesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeBandWidthSharesRequest clone() {
        return (DescribeBandWidthSharesRequest) super.clone();
    }
}

