package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.SetRedisSecurityRulesMarshaller;

import java.io.Serializable;
import java.util.List;

public class SetRedisSecurityRulesRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<SetRedisSecurityRulesRequest> {
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
    public Request<SetRedisSecurityRulesRequest> getDryRunRequest() {
        Request<SetRedisSecurityRulesRequest> request = new SetRedisSecurityRulesMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
