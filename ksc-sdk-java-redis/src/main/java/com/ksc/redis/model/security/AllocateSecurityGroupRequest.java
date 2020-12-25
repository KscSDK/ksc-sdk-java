package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.AllocateSecurityGroupMarshaller;

import java.io.Serializable;
import java.util.List;

public class AllocateSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AllocateSecurityGroupRequest> {
    private List<String> cacheId;
    private List<String> securityGroupId;

    public List<String> getCacheId() {
        return cacheId;
    }

    public void setCacheId(List<String> cacheId) {
        this.cacheId = cacheId;
    }

    public List<String> getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public Request<AllocateSecurityGroupRequest> getDryRunRequest() {
        Request<AllocateSecurityGroupRequest> request = new AllocateSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
