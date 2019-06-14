package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.CreateRedisSecurityGroupMarshaller;

import java.io.Serializable;
import java.util.List;


public class CreateRedisSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateRedisSecurityGroupRequest> {
    private String name;
    private String description;
    private List<String> securityGroupRules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public Request<CreateRedisSecurityGroupRequest> getDryRunRequest() {
        Request<CreateRedisSecurityGroupRequest> request = new CreateRedisSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
