package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.ListRedisSecurityRulesMarshaller;

import java.io.Serializable;


public class ListRedisSecurityRulesRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ListRedisSecurityRulesRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    @Override
    public Request<ListRedisSecurityRulesRequest> getDryRunRequest() {
        Request<ListRedisSecurityRulesRequest> request = new ListRedisSecurityRulesMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
