package com.ksc.memcached.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.security.ListMemcachedSecurityRulesMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;


public class ListMemcachedSecurityRulesRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ListMemcachedSecurityRulesRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    @Override
    public Request<ListMemcachedSecurityRulesRequest> getDryRunRequest() {
        Request<ListMemcachedSecurityRulesRequest> request = new ListMemcachedSecurityRulesMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
