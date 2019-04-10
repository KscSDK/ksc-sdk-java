package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.ListReadOnlyRedisMarshaller;

import java.io.Serializable;

public class ListReadOnlyRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ListReadOnlyRedisRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Request<ListReadOnlyRedisRequest> getDryRunRequest() {
        Request<ListReadOnlyRedisRequest> request = new ListReadOnlyRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
