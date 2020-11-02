package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.CreateReadOnlyRedisMarshaller;

import java.io.Serializable;

public class CreateReadOnlyRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateReadOnlyRedisRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Request<CreateReadOnlyRedisRequest> getDryRunRequest() {
        Request<CreateReadOnlyRedisRequest> request = new CreateReadOnlyRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
