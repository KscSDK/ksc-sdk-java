package com.ksc.memcached.model.security;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ListMemcachedSecurityRulesResponse {
    private Integer securityRuleId;
    private String cacheId;
    private String protocal;
    private Integer fromPort;
    private Integer toPort;
    private String cidr;

    public Integer getSecurityRuleId() {
        return securityRuleId;
    }

    public void setSecurityRuleId(Integer securityRuleId) {
        this.securityRuleId = securityRuleId;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getProtocal() {
        return protocal;
    }

    public void setProtocal(String protocal) {
        this.protocal = protocal;
    }

    public Integer getFromPort() {
        return fromPort;
    }

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public Integer getToPort() {
        return toPort;
    }

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }
}
