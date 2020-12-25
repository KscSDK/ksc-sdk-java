package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.DescribeSecurityGroupsMarshaller;

import java.io.Serializable;

public class DescribeSecurityGroupsRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeSecurityGroupsRequest> {
    private Integer offset;
    private Integer limit;
    private String cacheId;
    private Boolean filterCache;
    private String searchKey;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Boolean getFilterCache() {
        return filterCache;
    }

    public void setFilterCache(Boolean filterCache) {
        this.filterCache = filterCache;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public Request<DescribeSecurityGroupsRequest> getDryRunRequest() {
        Request<DescribeSecurityGroupsRequest> request = new DescribeSecurityGroupsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
