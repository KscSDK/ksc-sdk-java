package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class Metric {
	private String InstanceId;
	private String MetricName;
	private String Namespace;
	private Integer Interval ;
	/**
	 * 监控数值的类型
	 */
	private String Type;
	/**
	 * 监控指标的单位 %、Bps、bps、B等
	 */
	private String Unit;
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getMetricName() {
		return MetricName;
	}
	public void setMetricName(String metricName) {
		MetricName = metricName;
	}
	public String getNamespace() {
		return Namespace;
	}
	public void setNamespace(String namespace) {
		Namespace = namespace;
	}
	public Integer getInterval() {
		return Interval;
	}
	public void setInterval(Integer interval) {
		Interval = interval;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	
}
