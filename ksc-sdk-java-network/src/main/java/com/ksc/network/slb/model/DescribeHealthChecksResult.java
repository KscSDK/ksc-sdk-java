package com.ksc.network.slb.model;

import java.io.Serializable;

import com.ksc.internal.SdkInternalList;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeHealthChecks.
 * </p>
 */
@ToString
public class DescribeHealthChecksResult implements Serializable, Cloneable {
	/**
	*
	*/
	private static final long serialVersionUID = -1152397641363296840L;
	private String RequestId;
	/**
	 * <p>
	 * 负载均衡信息
	 * </p>
	 */
	private SdkInternalList<HealthCheck> HealthCheckSet;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public SdkInternalList<HealthCheck> getHealthCheckSet() {
		return HealthCheckSet;
	}

	public void setHealthCheckSet(SdkInternalList<HealthCheck> healthCheckSet) {
		HealthCheckSet = healthCheckSet;
	}

	public void addHealthCheckSet(HealthCheck... healthChecks) {
		if (this.HealthCheckSet == null) {
			this.HealthCheckSet = new SdkInternalList<HealthCheck>();
		}
		for (HealthCheck healthCheck : healthChecks) {
			this.HealthCheckSet.add(healthCheck);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DescribeHealthChecksResult that = (DescribeHealthChecksResult) o;

		if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
		return HealthCheckSet != null ? HealthCheckSet.equals(that.HealthCheckSet) : that.HealthCheckSet == null;
	}

	@Override
	public int hashCode() {
		int result = RequestId != null ? RequestId.hashCode() : 0;
		result = 31 * result + (HealthCheckSet != null ? HealthCheckSet.hashCode() : 0);
		return result;
	}

	@Override
	public DescribeHealthChecksResult clone() {
		try {
			return (DescribeHealthChecksResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}
