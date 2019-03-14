package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.DeleteReadOnlyRedisMarshaller;

import java.io.Serializable;

public class DeleteReadOnlyRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteReadOnlyRedisRequest> {
    private String cacheId;
    private String nodeId;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Request<DeleteReadOnlyRedisRequest> getDryRunRequest() {
        Request<DeleteReadOnlyRedisRequest> request = new DeleteReadOnlyRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
