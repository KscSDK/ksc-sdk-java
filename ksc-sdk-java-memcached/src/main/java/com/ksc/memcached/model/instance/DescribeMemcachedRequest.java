package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.DescribeMemcachedMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class DescribeMemcachedRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeMemcachedRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Request<DescribeMemcachedRequest> getDryRunRequest() {
        Request<DescribeMemcachedRequest> request = new DescribeMemcachedMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
