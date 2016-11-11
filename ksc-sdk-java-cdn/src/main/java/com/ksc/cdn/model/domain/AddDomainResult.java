package com.ksc.cdn.model.domain;

/**
 * AddDomainResult
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public class AddDomainResult {
    private String DomainId;
    private String DomainStatus;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    public String getDomainStatus() {
        return DomainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        DomainStatus = domainStatus;
    }
}
