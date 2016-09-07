package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class ListMetricsResult {

	private com.ksc.internal.SdkInternalList<Metric> Metrics;
	private Integer PageIndex;
	private Integer PageSize;

	public void withMetrics(Metric... metrics) {
		if (this.Metrics == null) {
			this.Metrics = new com.ksc.internal.SdkInternalList<Metric>();
		}
		for (Metric ele : metrics) {
			this.Metrics.add(ele);
		}
	}

	public com.ksc.internal.SdkInternalList<Metric> getMetrics() {
		return Metrics;
	}

	public void setMetrics(com.ksc.internal.SdkInternalList<Metric> metrics) {
		Metrics = metrics;
	}

	public Integer getPageIndex() {
		return PageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		PageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return PageSize;
	}

	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}
}
