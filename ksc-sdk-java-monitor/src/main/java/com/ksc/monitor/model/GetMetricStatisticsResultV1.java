package com.ksc.monitor.model;
import lombok.ToString;

@ToString
public class GetMetricStatisticsResultV1 {
	private String Label;
	private DatapointV1 Datapoints;
	public DatapointV1 getDatapoints() {
		return Datapoints;
	}
	public void setDatapoints(DatapointV1 datapoints) {
		Datapoints = datapoints;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	

	

}
