package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.CloneSecurityGroupMarshaller;

import java.io.Serializable;

public class CloneSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CloneSecurityGroupRequest> {
    private String name;
    private String description;
    private String srcSecurityGroupId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSrcSecurityGroupId() {
        return srcSecurityGroupId;
    }

    public void setSrcSecurityGroupId(String srcSecurityGroupId) {
        this.srcSecurityGroupId = srcSecurityGroupId;
    }

    @Override
    public Request<CloneSecurityGroupRequest> getDryRunRequest() {
        Request<CloneSecurityGroupRequest> request = new CloneSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
