package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.UpdateMemcachedPassWordMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;


public class UpdateMemcachedPassWordRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<UpdateMemcachedPassWordRequest> {
    private String cacheId;
    private String password;
    private Byte mode = 2;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getMode() {
        return mode;
    }

    public void setMode(Byte mode) {
        this.mode = mode;
    }

    @Override
    public Request<UpdateMemcachedPassWordRequest> getDryRunRequest() {
        Request<UpdateMemcachedPassWordRequest> request = new UpdateMemcachedPassWordMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
