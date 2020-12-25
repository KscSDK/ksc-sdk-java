package com.ksc.network.slb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class Rule {

    /**
     * 规则创建时间
     */
    private String createTime;
    /**
     * 规则的ID
     */
    private String ruleId;
    /**
     * 规则的路径
     */
    private String path;
    /**
     * 域名的ID
     */
    private String hostHeaderId;
    /**
     * 后端服务组的ID
     */
    private String backendServerGroupId;
    /**
     * 转发方式
     */
    private String method;
    /**
     * 是否同步监听器的健康检查、会话保持和转发算法
     */
    private String listenerSync;
    /**
     * 健康检查信息
     */
    private RuleHealthCheck healthCheck;
    /**
     * 会话保持信息
     */
    private RuleSession session;
    /**
     * 后端服务器列表
     */
    private List<BackendServer> backendServerSet;

    public void addBackendServerSet(BackendServer... backendServerSet) {
        if (this.backendServerSet == null) {
            this.backendServerSet = new com.ksc.internal.SdkInternalList<BackendServer>();
        }
        for (BackendServer value : backendServerSet) {
            this.backendServerSet.add(value);
        }
    }

}
