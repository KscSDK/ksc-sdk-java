package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.ModifyRedisSecurityGroupMarshaller;

import java.io.Serializable;
import java.util.List;

public class ModifyRedisSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyRedisSecurityGroupRequest> {
    private String cacheSecurityGroupId;
    private String description;
    private List<String> securityGroupRules;

    public String getCacheSecurityGroupId() {
        return cacheSecurityGroupId;
    }

    public void setCacheSecurityGroupId(String cacheSecurityGroupId) {
        this.cacheSecurityGroupId = cacheSecurityGroupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(List<String> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
    }

    @Override
    public Request<ModifyRedisSecurityGroupRequest> getDryRunRequest() {
        Request<ModifyRedisSecurityGroupRequest> request = new ModifyRedisSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
