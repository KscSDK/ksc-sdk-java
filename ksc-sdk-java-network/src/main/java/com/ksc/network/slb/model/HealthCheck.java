package com.ksc.network.slb.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;
/**
 * Created by LIUHONGMING on 2017/4/20.
 */
@ToString
@EqualsAndHashCode
public class HealthCheck {
    /**
     * 监听器的ID
     */
    private String ListenerId;

    /**
     * 健康检查保持的状态，开启（start ）、关闭（stop）
     */
    private String HealthCheckState;

    /**
     * 健康检查的ID
     */
    private String HealthCheckId;

    /**
     * 健康阈值
     */
    private Integer HealthyThreshold;

    /**
     * 健康检查时间间隔
     */
    private Integer Interval;

    /**
     * 健康检查超时时间
     */
    private Integer Timeout;

    /**
     * 不健康阈值
     */
    private Integer UnhealthyThreshold;

    /**
     * HTTP类型监听器健康检查的链接，HTTP类型监听器需要填写此参数，TCP类型监听器没有此参数
     */
    private String UrlPath;

    /**
     * 用于重置健康检查的域名，HTTP类型监听器可以填写此参数
     */
    private Boolean IsDefaultHostName;

    /**
     * HTTP类型健康检查的域名，HTTP类型监听器需要填写此参数，TCP类型监听器没有此参数
     */
    private String HostName;

    public String getListenerId() {
        return ListenerId;
    }

    public void setListenerId(String listenerId) {
        ListenerId = listenerId;
    }

    public String getHealthCheckState() {
        return HealthCheckState;
    }

    public void setHealthCheckState(String healthCheckState) {
        HealthCheckState = healthCheckState;
    }

    public String getHealthCheckId() {
        return HealthCheckId;
    }

    public void setHealthCheckId(String healthCheckId) {
        HealthCheckId = healthCheckId;
    }

    public Integer getHealthyThreshold() {
        return HealthyThreshold;
    }

    public void setHealthyThreshold(Integer healthyThreshold) {
        HealthyThreshold = healthyThreshold;
    }

    public Integer getInterval() {
        return Interval;
    }

    public void setInterval(Integer interval) {
        Interval = interval;
    }

    public Integer getTimeout() {
        return Timeout;
    }

    public void setTimeout(Integer timeout) {
        Timeout = timeout;
    }

    public Integer getUnhealthyThreshold() {
        return UnhealthyThreshold;
    }

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        UnhealthyThreshold = unhealthyThreshold;
    }

    public String getUrlPath() {
        return UrlPath;
    }

    public void setUrlPath(String urlPath) {
        UrlPath = urlPath;
    }

    public Boolean getDefaultHostName() {
        return IsDefaultHostName;
    }

    public void setDefaultHostName(Boolean defaultHostName) {
        IsDefaultHostName = defaultHostName;
    }

    public String getHostName() {
        return HostName;
    }

    public void setHostName(String hostName) {
        HostName = hostName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HealthCheck that = (HealthCheck) o;

        if (ListenerId != null ? !ListenerId.equals(that.ListenerId) : that.ListenerId != null) return false;
        if (HealthCheckState != null ? !HealthCheckState.equals(that.HealthCheckState) : that.HealthCheckState != null)
            return false;
        if (HealthCheckId != null ? !HealthCheckId.equals(that.HealthCheckId) : that.HealthCheckId != null)
            return false;
        if (HealthyThreshold != null ? !HealthyThreshold.equals(that.HealthyThreshold) : that.HealthyThreshold != null)
            return false;
        if (Interval != null ? !Interval.equals(that.Interval) : that.Interval != null) return false;
        if (Timeout != null ? !Timeout.equals(that.Timeout) : that.Timeout != null) return false;
        if (UnhealthyThreshold != null ? !UnhealthyThreshold.equals(that.UnhealthyThreshold) : that.UnhealthyThreshold != null)
            return false;
        if (UrlPath != null ? !UrlPath.equals(that.UrlPath) : that.UrlPath != null) return false;
        if (IsDefaultHostName != null ? !IsDefaultHostName.equals(that.IsDefaultHostName) : that.IsDefaultHostName != null)
            return false;
        return HostName != null ? HostName.equals(that.HostName) : that.HostName == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (ListenerId != null ? ListenerId.hashCode() : 0);
        result = 31 * result + (HealthCheckState != null ? HealthCheckState.hashCode() : 0);
        result = 31 * result + (HealthCheckId != null ? HealthCheckId.hashCode() : 0);
        result = 31 * result + (HealthyThreshold != null ? HealthyThreshold.hashCode() : 0);
        result = 31 * result + (Interval != null ? Interval.hashCode() : 0);
        result = 31 * result + (Timeout != null ? Timeout.hashCode() : 0);
        result = 31 * result + (UnhealthyThreshold != null ? UnhealthyThreshold.hashCode() : 0);
        result = 31 * result + (UrlPath != null ? UrlPath.hashCode() : 0);
        result = 31 * result + (IsDefaultHostName != null ? IsDefaultHostName.hashCode() : 0);
        result = 31 * result + (HostName != null ? HostName.hashCode() : 0);
        return result;
    }
}
