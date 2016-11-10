package com.ksc.cdn.model.domain;

import com.ksc.cdn.model.valid.FieldValidate;

import java.util.List;

/**
 * Created by CrazyHorse on 9/22/16.
 */
public class OriginAdvancedConfigRequest {

    @FieldValidate
    private String DomainId;
    @FieldValidate
    private String Enable;
    @FieldValidate
    private String OriginType;
    @FieldValidate
    private List<OriginAdvancedItem> OriginAdvancedItems;
    @FieldValidate
    private String OriginPolicy;

    private Long OriginPolicyBestCount;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getOriginType() {
        return OriginType;
    }

    public void setOriginType(String originType) {
        OriginType = originType;
    }

    public List<OriginAdvancedItem> getOriginAdvancedItems() {
        return OriginAdvancedItems;
    }

    public void setOriginAdvancedItems(List<OriginAdvancedItem> originAdvancedItems) {
        OriginAdvancedItems = originAdvancedItems;
    }

    public String getOriginPolicy() {
        return OriginPolicy;
    }

    public void setOriginPolicy(String originPolicy) {
        OriginPolicy = originPolicy;
    }

    public Long getOriginPolicyBestCount() {
        return OriginPolicyBestCount;
    }

    public void setOriginPolicyBestCount(Long originPolicyBestCount) {
        OriginPolicyBestCount = originPolicyBestCount;
    }

    public class OriginAdvancedItem {
        @FieldValidate
        private String OriginLine;
        @FieldValidate
        private String Origin;

        public String getOriginLine() {
            return OriginLine;
        }

        public void setOriginLine(String originLine) {
            OriginLine = originLine;
        }

        public String getOrigin() {
            return Origin;
        }

        public void setOrigin(String origin) {
            Origin = origin;
        }
    }
}
