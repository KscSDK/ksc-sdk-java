package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.ResizeRedisMarshaller;

import java.io.Serializable;


public class ResizeRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ResizeRedisRequest> {
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
    public Request<ResizeRedisRequest> getDryRunRequest() {
        Request<ResizeRedisRequest> request = new ResizeRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
