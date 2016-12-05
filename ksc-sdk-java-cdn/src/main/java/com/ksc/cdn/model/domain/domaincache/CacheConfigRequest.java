package com.ksc.cdn.model.domain.domaincache;


import com.ksc.cdn.model.valid.FieldValidate;

import java.util.List;

/**
 * Created by CrazyHorse on 9/22/16.
 */

public class CacheConfigRequest {

    @FieldValidate
    private String DomainId;
    /**
     * 由CacheRule组成的数组，表示缓存规则列表。注意：该数组是有序的。
     */
    @FieldValidate
    private List<CacheRule> CacheRules;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public List<CacheRule> getCacheRules() {
        return CacheRules;
    }

    public void setCacheRules(List<CacheRule> cacheRules) {
        CacheRules = cacheRules;
    }


}
