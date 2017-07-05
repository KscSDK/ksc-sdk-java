package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class GetCustomMetricStatisticsResult {
	
	private com.ksc.internal.SdkInternalList<CustomDataPoint> Datapoints;
	private String Label;

	public com.ksc.internal.SdkInternalList<CustomDataPoint> getDatapoints() {
		return Datapoints;
	}

	public void setDatapoints(com.ksc.internal.SdkInternalList<CustomDataPoint> datapoints) {
		Datapoints = datapoints;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public void withDatapoints(CustomDataPoint... Datapoints) {
		if (this.Datapoints == null) {
			this.Datapoints = new com.ksc.internal.SdkInternalList<CustomDataPoint>();
		}
		for (CustomDataPoint ele : Datapoints) {
			this.Datapoints.add(ele);
		}
	}
}
