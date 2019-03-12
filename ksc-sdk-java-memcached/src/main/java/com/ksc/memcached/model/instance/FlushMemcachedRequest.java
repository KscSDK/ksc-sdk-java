package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.FlushMemcachedMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;


public class FlushMemcachedRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<FlushMemcachedRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    @Override
    public Request<FlushMemcachedRequest> getDryRunRequest() {
        Request<FlushMemcachedRequest> request = new FlushMemcachedMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
