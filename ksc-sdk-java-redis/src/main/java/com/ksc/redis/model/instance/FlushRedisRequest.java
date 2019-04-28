package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.FlushRedisMarshaller;

import java.io.Serializable;


public class FlushRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<FlushRedisRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    @Override
    public Request<FlushRedisRequest> getDryRunRequest() {
        Request<FlushRedisRequest> request = new FlushRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
