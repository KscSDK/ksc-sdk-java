package com.ksc.cdn.model.domain.domaindetail;

import com.ksc.cdn.model.valid.FieldValidate;

import java.util.List;

/**
 * Created by CrazyHorse on 9/22/16.
 * 设置高级回源策略
 */
public class OriginAdvancedConfigRequest extends OriginAdvancedConfig {

    @FieldValidate
    private String DomainId;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }


}
