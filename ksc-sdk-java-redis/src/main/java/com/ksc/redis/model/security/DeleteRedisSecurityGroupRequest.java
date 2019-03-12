package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.DeleteRedisSecurityGroupMarshaller;

import java.io.Serializable;


public class DeleteRedisSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteRedisSecurityGroupRequest> {
    private String cacheSecurityGroupId;

    public String getCacheSecurityGroupId() {
        return cacheSecurityGroupId;
    }

    public void setCacheSecurityGroupId(String cacheSecurityGroupId) {
        this.cacheSecurityGroupId = cacheSecurityGroupId;
    }

    @Override
    public Request<DeleteRedisSecurityGroupRequest> getDryRunRequest() {
        Request<DeleteRedisSecurityGroupRequest> request = new DeleteRedisSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
