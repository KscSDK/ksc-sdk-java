package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.ListMemcachedMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class ListMemcachedRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ListMemcachedRequest> {
    private String name;
    private String cacheId;
    private String vip;
    private String protocol;
    private String iamProjectId;
    private Integer offset = 0;
    private Integer limit = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIamProjectId() {
        return iamProjectId;
    }

    public void setIamProjectId(String iamProjectId) {
        this.iamProjectId = iamProjectId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Request<ListMemcachedRequest> getDryRunRequest() {
        Request<ListMemcachedRequest> request = new ListMemcachedMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
