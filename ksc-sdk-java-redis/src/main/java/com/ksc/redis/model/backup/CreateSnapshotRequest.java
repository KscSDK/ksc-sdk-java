package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.CreateSnapshotMarshaller;

import java.io.Serializable;

public class CreateSnapshotRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateSnapshotRequest> {
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
    public Request<CreateSnapshotRequest> getDryRunRequest() {
        Request<CreateSnapshotRequest> request = new CreateSnapshotMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
