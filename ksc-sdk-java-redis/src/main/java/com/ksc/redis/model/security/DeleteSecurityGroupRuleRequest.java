package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.DeleteSecurityGroupRuleMarshaller;

import java.io.Serializable;
import java.util.List;

public class DeleteSecurityGroupRuleRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteSecurityGroupRuleRequest> {
    private String securityGroupId;
    private List<String> securityGroupRuleId;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public List<String> getSecurityGroupRuleId() {
        return securityGroupRuleId;
    }

    public void setSecurityGroupRuleId(List<String> securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
    }

    @Override
    public Request<DeleteSecurityGroupRuleRequest> getDryRunRequest() {
        Request<DeleteSecurityGroupRuleRequest> request = new DeleteSecurityGroupRuleMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
