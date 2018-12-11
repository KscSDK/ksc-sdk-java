package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class GetMetricStatisticsBatchResult {
	
	private com.ksc.internal.SdkInternalList<Datapoint> Datapoints;
	private String Label;
	private String Instance;
	public com.ksc.internal.SdkInternalList<Datapoint> getDatapoints() {
		return Datapoints;
	}

	public void setDatapoints(com.ksc.internal.SdkInternalList<Datapoint> datapoints) {
		Datapoints = datapoints;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public void withDatapoints(Datapoint... Datapoints) {
		if (this.Datapoints == null) {
			this.Datapoints = new com.ksc.internal.SdkInternalList<Datapoint>();
		}
		for (Datapoint ele : Datapoints) {
			this.Datapoints.add(ele);
		}
	}

	public String getInstance() {
		return Instance;
	}

	public void setInstance(String instance) {
		Instance = instance;
	}
}
