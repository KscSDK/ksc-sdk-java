package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.DeleteRedisSecurityGroupRuleMarshaller;

import java.io.Serializable;


public class DeleteRedisSecurityGroupRuleRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteRedisSecurityGroupRuleRequest> {
    private String CacheSecurityGroupId;
    private String securityRuleId;

    public String getCacheSecurityGroupId() {
        return CacheSecurityGroupId;
    }

    public void setCacheSecurityGroupId(String cacheSecurityGroupId) {
        CacheSecurityGroupId = cacheSecurityGroupId;
    }

    public String getSecurityRuleId() {
        return securityRuleId;
    }

    public void setSecurityRuleId(String securityRuleId) {
        this.securityRuleId = securityRuleId;
    }

    @Override
    public Request<DeleteRedisSecurityGroupRuleRequest> getDryRunRequest() {
        Request<DeleteRedisSecurityGroupRuleRequest> request = new DeleteRedisSecurityGroupRuleMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
