package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class LoadBalancerAcl {

    /**
     * 创建时间
     */
    private String createTime;
    /**
     * LoadBalancerAcl的名称
     */
    private String loadBalancerAclName;
    /**
     * LoadBalancerAcl的ID
     */
    private String loadBalancerAclId;
    /**
     * IP版本
     */
    private String ipVersion;
    /**
     * ACL规则信息
     */
    private List<LoadBalancerAclEntry> loadBalancerAclEntrySet;

    public void addLoadBalancerAclEntrySet(LoadBalancerAclEntry... loadBalancerAclEntrySet) {
        if (this.loadBalancerAclEntrySet == null) {
            this.loadBalancerAclEntrySet = new com.ksc.internal.SdkInternalList<LoadBalancerAclEntry>();
        }
        for (LoadBalancerAclEntry value : loadBalancerAclEntrySet) {
            this.loadBalancerAclEntrySet.add(value);
        }
    }

}
