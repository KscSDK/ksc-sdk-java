package com.ksc.memcached.model.instance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateMemcachedResponse {
    @JsonProperty(value = "CacheId")
    private String cacheId;
    @JsonProperty(value = "Name")
    private String name;
    @JsonProperty(value = "Size")
    private String size;
    @JsonProperty(value = "Port")
    private String port;
    @JsonProperty(value = "SubOrderId")
    private String subOrderId;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }
}
