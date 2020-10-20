package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class LoadBalancerAclEntry {

    /**
     * ACL规则ID
     */
    private String loadBalancerAclEntryId;
    /**
     * LoadBalancerAcl规则的网段
     */
    private String cidrBlock;
    /**
     * LoadBalancerAcl的ID
     */
    private String loadBalancerAclId;
    /**
     * LoadBalancerAcl规则优先级
     */
    private String ruleNumber;
    /**
     * LoadBalancerAcl规则行为
     */
    private String ruleAction;
    /**
     * 协议
     */
    private String protocol;


}
