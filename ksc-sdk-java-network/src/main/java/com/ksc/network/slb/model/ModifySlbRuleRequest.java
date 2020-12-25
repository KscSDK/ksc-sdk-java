package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifySlbRuleRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifySlbRule.
 * </p>
 */
@Data
public class ModifySlbRuleRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifySlbRuleRequest> {

    /**
     * 规则ID
     */
    private String ruleId;
    /**
     * 后端服务器组的ID
     */
    private String backendServerGroupId;
    /**
     * 是否同步监听器的健康检查、会话保持和转发算法。
     */
    private String listenerSync;
    /**
     * 转发方式，在ListenerSync为off时有效且必选，其他情况会忽略此值
     */
    private String method;
    /**
     * 会话保持的状态，在ListenerSync为off时有效且必选，其他情况会忽略此值
     */
    private String sessionState;
    /**
     * 会话保持超时时间，在SessionState为start时有效且必填，其他情况会忽略此值。
     */
    private Long sessionPersistencePeriod;
    /**
     * 会话类型，在SessionState为start时有效且必选，其他情况会忽略此值
     */
    private String cookieType;
    /**
     * 健康检查的状态，在ListenerSync为off时有效且必选，其他情况会忽略此值
     */
    private String cookieName;
    /**
     * 健康检查响应超时时间，在HealthCheckState为start时有效且必填，其他情况会忽略此值。
     */
    private Integer timeout;
    /**
     * 健康检查时间间隔，在HealthCheckState为start时有效且必填，其他情况会忽略此值。
     */
    private Integer interval;
    /**
     * 健康阈值，在HealthCheckState为start时有效且必填，其他情况会忽略此值
     */
    private Integer healthyThreshold;
    /**
     * 不健康阈值，在HealthCheckState为start时有效且必填，其他情况会忽略此值。
     */
    private Integer unhealthyThreshold;
    /**
     * 健康检查URI，在HealthCheckState为start时有效且必填，其他情况会忽略此值。
     */
    private String urlPath;
    /**
     * 健康检查域名，在HealthCheckState为start时有效，其他情况会忽略此值。
     */
    private String hostName;
    /**
     * 健康检查的状态，在ListenerSync为off时有效且必选，其他情况会忽略此值
     */
    private String healthCheckState;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifySlbRuleRequest that = (ModifySlbRuleRequest) o;
        if (ruleId != null ? !ruleId.equals(that.ruleId) : that.ruleId != null)
            return false;
        if (backendServerGroupId != null ? !backendServerGroupId.equals(that.backendServerGroupId) : that.backendServerGroupId != null)
            return false;
        if (listenerSync != null ? !listenerSync.equals(that.listenerSync) : that.listenerSync != null)
            return false;
        if (method != null ? !method.equals(that.method) : that.method != null)
            return false;
        if (sessionState != null ? !sessionState.equals(that.sessionState) : that.sessionState != null)
            return false;
        if (sessionPersistencePeriod != null ? !sessionPersistencePeriod.equals(that.sessionPersistencePeriod) : that.sessionPersistencePeriod != null)
            return false;
        if (cookieType != null ? !cookieType.equals(that.cookieType) : that.cookieType != null)
            return false;
        if (cookieName != null ? !cookieName.equals(that.cookieName) : that.cookieName != null)
            return false;
        if (timeout != null ? !timeout.equals(that.timeout) : that.timeout != null)
            return false;
        if (interval != null ? !interval.equals(that.interval) : that.interval != null)
            return false;
        if (healthyThreshold != null ? !healthyThreshold.equals(that.healthyThreshold) : that.healthyThreshold != null)
            return false;
        if (unhealthyThreshold != null ? !unhealthyThreshold.equals(that.unhealthyThreshold) : that.unhealthyThreshold != null)
            return false;
        if (urlPath != null ? !urlPath.equals(that.urlPath) : that.urlPath != null)
            return false;
        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null)
            return false;
        if (healthCheckState != null ? !healthCheckState.equals(that.healthCheckState) : that.healthCheckState != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (ruleId != null ? ruleId.hashCode() : 0);
        result = 31 * result + (backendServerGroupId != null ? backendServerGroupId.hashCode() : 0);
        result = 31 * result + (listenerSync != null ? listenerSync.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (sessionState != null ? sessionState.hashCode() : 0);
        result = 31 * result + (sessionPersistencePeriod != null ? sessionPersistencePeriod.hashCode() : 0);
        result = 31 * result + (cookieType != null ? cookieType.hashCode() : 0);
        result = 31 * result + (cookieName != null ? cookieName.hashCode() : 0);
        result = 31 * result + (timeout != null ? timeout.hashCode() : 0);
        result = 31 * result + (interval != null ? interval.hashCode() : 0);
        result = 31 * result + (healthyThreshold != null ? healthyThreshold.hashCode() : 0);
        result = 31 * result + (unhealthyThreshold != null ? unhealthyThreshold.hashCode() : 0);
        result = 31 * result + (urlPath != null ? urlPath.hashCode() : 0);
        result = 31 * result + (hostName != null ? hostName.hashCode() : 0);
        result = 31 * result + (healthCheckState != null ? healthCheckState.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifySlbRuleRequest> getDryRunRequest() {
        Request<ModifySlbRuleRequest> request = new ModifySlbRuleRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifySlbRuleRequest clone() {
        return (ModifySlbRuleRequest) super.clone();
    }
}

