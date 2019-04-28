package com.ksc.redis.model.parameter;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.parameter.ListRedisParametersMarshaller;

import java.io.Serializable;


public class ListRedisParametersRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ListRedisParametersRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    @Override
    public Request<ListRedisParametersRequest> getDryRunRequest() {
        Request<ListRedisParametersRequest> request = new ListRedisParametersMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
