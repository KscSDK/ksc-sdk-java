package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.RenameRedisMarshaller;

import java.io.Serializable;


public class RenameRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RenameRedisRequest> {
    private String cacheId;
    private String name;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Request<RenameRedisRequest> getDryRunRequest() {
        Request<RenameRedisRequest> request = new RenameRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
