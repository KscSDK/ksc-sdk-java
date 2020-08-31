package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.DeallocateSecurityGroupMarshaller;

import java.io.Serializable;
import java.util.List;

public class DeallocateSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeallocateSecurityGroupRequest> {
    private List<String> cacheId;
    private String securityGroupId;

    public List<String> getCacheId() {
        return cacheId;
    }

    public void setCacheId(List<String> cacheId) {
        this.cacheId = cacheId;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public Request<DeallocateSecurityGroupRequest> getDryRunRequest() {
        Request<DeallocateSecurityGroupRequest> request = new DeallocateSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
