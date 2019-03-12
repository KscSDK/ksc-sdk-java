package com.ksc.memcached.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.security.SetMemcachedSecurityRulesMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;
import java.util.List;

public class SetMemcachedSecurityRulesRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<SetMemcachedSecurityRulesRequest> {
    private String cacheId;
    private List<String> securityRules;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public List<String> getSecurityRules() {
        return securityRules;
    }

    public void setSecurityRules(List<String> securityRules) {
        this.securityRules = securityRules;
    }

    @Override
    public Request<SetMemcachedSecurityRulesRequest> getDryRunRequest() {
        Request<SetMemcachedSecurityRulesRequest> request = new SetMemcachedSecurityRulesMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
