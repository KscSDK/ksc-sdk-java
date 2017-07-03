package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class GetMetricStatisticsResultV1 {
	
	private com.ksc.internal.SdkInternalList<DataPointV1> Datapoints;
	private String Label;

	public com.ksc.internal.SdkInternalList<DataPointV1> getDatapoints() {
		return Datapoints;
	}

	public void setDatapoints(com.ksc.internal.SdkInternalList<DataPointV1> datapoints) {
		Datapoints = datapoints;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public void withDatapoints(DataPointV1... Datapoints) {
		if (this.Datapoints == null) {
			this.Datapoints = new com.ksc.internal.SdkInternalList<DataPointV1>();
		}
		for (DataPointV1 ele : Datapoints) {
			this.Datapoints.add(ele);
		}
	}
}
