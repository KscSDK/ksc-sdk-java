
package com.ksc.network.slb.model;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ConfigureHealthCheck.
 * </p>
 */
@ToString
public class ConfigureHealthCheckResult implements Serializable, Cloneable {

	private String RequestId;

	private Integer Interval;

    private Integer UnhealthyThreshold;

    private String HealthCheckState;

    private String HealthCheckId;

    private Integer HealthyThreshold;

    private Integer Timeout;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Integer getInterval() {
        return Interval;
    }

    public void setInterval(Integer interval) {
        Interval = interval;
    }

    public Integer getUnhealthyThreshold() {
        return UnhealthyThreshold;
    }

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        UnhealthyThreshold = unhealthyThreshold;
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

    public Integer getTimeout() {
        return Timeout;
    }

    public void setTimeout(Integer timeout) {
        Timeout = timeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigureHealthCheckResult that = (ConfigureHealthCheckResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Interval != null ? !Interval.equals(that.Interval) : that.Interval != null) return false;
        if (UnhealthyThreshold != null ? !UnhealthyThreshold.equals(that.UnhealthyThreshold) : that.UnhealthyThreshold != null)
            return false;
        if (HealthCheckState != null ? !HealthCheckState.equals(that.HealthCheckState) : that.HealthCheckState != null)
            return false;
        if (HealthCheckId != null ? !HealthCheckId.equals(that.HealthCheckId) : that.HealthCheckId != null)
            return false;
        if (HealthyThreshold != null ? !HealthyThreshold.equals(that.HealthyThreshold) : that.HealthyThreshold != null)
            return false;
        return Timeout != null ? Timeout.equals(that.Timeout) : that.Timeout == null;
    }

    @Override
    public int hashCode() {
        int result = RequestId != null ? RequestId.hashCode() : 0;
        result = 31 * result + (Interval != null ? Interval.hashCode() : 0);
        result = 31 * result + (UnhealthyThreshold != null ? UnhealthyThreshold.hashCode() : 0);
        result = 31 * result + (HealthCheckState != null ? HealthCheckState.hashCode() : 0);
        result = 31 * result + (HealthCheckId != null ? HealthCheckId.hashCode() : 0);
        result = 31 * result + (HealthyThreshold != null ? HealthyThreshold.hashCode() : 0);
        result = 31 * result + (Timeout != null ? Timeout.hashCode() : 0);
        return result;
    }

    @Override
    public ConfigureHealthCheckResult clone() {
        try {
            return (ConfigureHealthCheckResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}