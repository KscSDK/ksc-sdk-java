package com.ksc.cdn.model.domain;

/**
 * AddDomainResult
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public class AddDomainResult {
    private String DomainID;
    private String DomainStatus;

    public String getDomainID() {
        return DomainID;
    }

    public void setDomainID(String domainID) {
        DomainID = domainID;
    }

    public String getDomainStatus() {
        return DomainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        DomainStatus = domainStatus;
    }
}
