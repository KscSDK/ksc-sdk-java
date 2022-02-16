package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.transform.ListPrivateLinkServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;


@Data
public class ListPrivateLinkServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ListPrivateLinkServerRequest> {

    private String privateLinkServerId;
    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 单次调用可返回的最大条目数量.
     */
    private String maxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    private String nextToken;

    public void addFilters(Filter... filters) {
        if (this.filters == null) {
            this.filters = new com.ksc.internal.SdkInternalList<Filter>();
        }
        for (Filter filter : filters) {
            this.filters.add(filter);
        }
    }

    @Override
    public Request<ListPrivateLinkServerRequest> getDryRunRequest() {
        Request<ListPrivateLinkServerRequest> request = new ListPrivateLinkServerRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ListPrivateLinkServerRequest clone() {
        return (ListPrivateLinkServerRequest) super.clone();
    }
}
