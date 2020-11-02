package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.DescribeRedisMarshaller;

import java.io.Serializable;

public class DescribeRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeRedisRequest> {
    private String cacheId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Request<DescribeRedisRequest> getDryRunRequest() {
        Request<DescribeRedisRequest> request = new DescribeRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
