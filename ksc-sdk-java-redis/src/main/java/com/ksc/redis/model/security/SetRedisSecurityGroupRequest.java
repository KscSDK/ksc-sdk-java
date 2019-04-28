package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.SetRedisSecurityGroupMarshaller;

import java.io.Serializable;

public class SetRedisSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<SetRedisSecurityGroupRequest> {
    private String cacheId;
    private String cacheSecurityGroupId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getCacheSecurityGroupId() {
        return cacheSecurityGroupId;
    }

    public void setCacheSecurityGroupId(String cacheSecurityGroupId) {
        this.cacheSecurityGroupId = cacheSecurityGroupId;
    }

    @Override
    public Request<SetRedisSecurityGroupRequest> getDryRunRequest() {
        Request<SetRedisSecurityGroupRequest> request = new SetRedisSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
