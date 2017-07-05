package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class MetricInfo {
private String NameSpace;
private String MetricName;
private com.ksc.internal.SdkInternalList<String> Dimensions;
public String getNameSpace() {
	return NameSpace;
}
public void setNameSpace(String nameSpace) {
	NameSpace = nameSpace;
}
public String getMetricName() {
	return MetricName;
}
public void setMetricName(String metricName) {
	MetricName = metricName;
}

public com.ksc.internal.SdkInternalList<String> getDimensions() {
	return Dimensions;
}
public void setDimensions(com.ksc.internal.SdkInternalList<String> dimensions) {
	Dimensions = dimensions;
}
public void withDimensions(String... Dimensions) {
	if (this.Dimensions == null) {
		this.Dimensions = new com.ksc.internal.SdkInternalList<String>();
	}
	for (String ele : Dimensions) {
		this.Dimensions.add(ele);
	}
}
}
