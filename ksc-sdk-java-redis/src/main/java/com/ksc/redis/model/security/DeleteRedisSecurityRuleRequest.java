package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.DeleteRedisSecurityRuleMarshaller;

import java.io.Serializable;

public class DeleteRedisSecurityRuleRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteRedisSecurityRuleRequest> {
    private String cacheId;
    private String securityRuleId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getSecurityRuleId() {
        return securityRuleId;
    }

    public void setSecurityRuleId(String securityRuleId) {
        this.securityRuleId = securityRuleId;
    }

    @Override
    public Request<DeleteRedisSecurityRuleRequest> getDryRunRequest() {
        Request<DeleteRedisSecurityRuleRequest> request = new DeleteRedisSecurityRuleMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
