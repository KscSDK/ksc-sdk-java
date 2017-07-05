package com.ksc.monitor.model;
import lombok.ToString;

@ToString
public class ListCustomMetricsResult {

	private com.ksc.internal.SdkInternalList<MetricInfo> Metrics;

	public void withMetricInfos(MetricInfo... metrics) {
		if (this.Metrics == null) {
			this.Metrics = new com.ksc.internal.SdkInternalList<MetricInfo>();
		}
		for (MetricInfo ele : metrics) {
			this.Metrics.add(ele);
		}
	}

	public com.ksc.internal.SdkInternalList<MetricInfo> getMetrics() {
		return Metrics;
	}

	public void setMetrics(com.ksc.internal.SdkInternalList<MetricInfo> metrics) {
		Metrics = metrics;
	}

}
