package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.DeleteMemcachedMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class DeleteMemcachedRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteMemcachedRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Request<DeleteMemcachedRequest> getDryRunRequest() {
        Request<DeleteMemcachedRequest> request = new DeleteMemcachedMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
