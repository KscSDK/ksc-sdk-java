package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.ResizeMemcachedMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;


public class ResizeMemcachedRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ResizeMemcachedRequest> {
    private String cacheId;
    private Integer capacity;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public Request<ResizeMemcachedRequest> getDryRunRequest() {
        Request<ResizeMemcachedRequest> request = new ResizeMemcachedMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
