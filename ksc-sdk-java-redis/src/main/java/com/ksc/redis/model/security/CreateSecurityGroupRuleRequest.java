package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.CreateSecurityGroupRuleMarshaller;

import java.io.Serializable;
import java.util.List;

public class CreateSecurityGroupRuleRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateSecurityGroupRuleRequest> {
    private List<String> cidrs;
    private String securityGroupId;

    public List<String> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<String> cidrs) {
        this.cidrs = cidrs;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public Request<CreateSecurityGroupRuleRequest> getDryRunRequest() {
        Request<CreateSecurityGroupRuleRequest> request = new CreateSecurityGroupRuleMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
