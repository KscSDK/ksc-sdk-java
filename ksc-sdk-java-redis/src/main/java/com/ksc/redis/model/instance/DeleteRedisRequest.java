package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.DeleteRedisMarshaller;

import java.io.Serializable;

public class DeleteRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteRedisRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Request<DeleteRedisRequest> getDryRunRequest() {
        Request<DeleteRedisRequest> request = new DeleteRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
