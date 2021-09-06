package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.ListRedisMarshaller;

import java.io.Serializable;

public class ListRedisRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ListRedisRequest> {
    private String name;
    private String cacheId;
    private String vip;
    private String protocol;
    private String iamProjectId;
    private Integer offset = 0;
    private Integer limit = 10;
    private String vpcId;
    private String vnetId;
    private String orderBy;
    private String proxy;
    private String fuzzySearch;
    private String taskStatus;
    private String mode;
    private String tagKey;
    private String tagValue;

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

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVnetId() {
        return vnetId;
    }

    public void setVnetId(String vnetId) {
        this.vnetId = vnetId;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getFuzzySearch() {
        return fuzzySearch;
    }

    public void setFuzzySearch(String fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public Request<ListRedisRequest> getDryRunRequest() {
        Request<ListRedisRequest> request = new ListRedisMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
