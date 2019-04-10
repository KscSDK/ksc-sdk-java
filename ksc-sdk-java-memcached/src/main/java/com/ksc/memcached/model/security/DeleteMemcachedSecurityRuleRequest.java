package com.ksc.memcached.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.security.DeleteMemcachedSecurityRuleMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class DeleteMemcachedSecurityRuleRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteMemcachedSecurityRuleRequest> {
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
    public Request<DeleteMemcachedSecurityRuleRequest> getDryRunRequest() {
        Request<DeleteMemcachedSecurityRuleRequest> request = new DeleteMemcachedSecurityRuleMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
