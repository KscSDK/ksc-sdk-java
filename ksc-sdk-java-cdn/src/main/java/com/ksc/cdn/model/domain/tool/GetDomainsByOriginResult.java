package com.ksc.cdn.model.domain.tool;

/**
 * description：
 * author：ZHOURONG
 * date: 2017/12/7
 * mail：yangxueyi@kingsoft.com
 */
public class GetDomainsByOriginResult {

    Domain[] Domains;

    public Domain[] getDomains() {
        return Domains;
    }

    public void setDomains(Domain[] domains) {
        Domains = domains;
    }
}
