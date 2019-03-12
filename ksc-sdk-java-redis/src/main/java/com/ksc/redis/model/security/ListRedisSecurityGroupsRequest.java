package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.ListRedisSecurityGroupsMarshaller;

import java.io.Serializable;


public class ListRedisSecurityGroupsRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ListRedisSecurityGroupsRequest> {
    private String name;
    private String cacheSecurityGroupId;
    private Integer offset = 0;
    private Integer limit = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCacheSecurityGroupId() {
        return cacheSecurityGroupId;
    }

    public void setCacheSecurityGroupId(String cacheSecurityGroupId) {
        this.cacheSecurityGroupId = cacheSecurityGroupId;
    }

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

    @Override
    public Request<ListRedisSecurityGroupsRequest> getDryRunRequest() {
        Request<ListRedisSecurityGroupsRequest> request = new ListRedisSecurityGroupsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
