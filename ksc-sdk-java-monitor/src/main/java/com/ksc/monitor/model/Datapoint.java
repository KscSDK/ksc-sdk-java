package com.ksc.monitor.model;

import java.util.Date;

import lombok.ToString;

@ToString
public class Datapoint {
	private Double Average;
	private Double Max;
	private Double Min;
	private Double Sum;
	private Double SampleCount;
	private Date Timestamp;
	public Double getAverage() {
		return Average;
	}
	public void setAverage(Double average) {
		Average = average;
	}
	
	public Double getSum() {
		return Sum;
	}
	public void setSum(Double sum) {
		Sum = sum;
	}
	public Double getSampleCount() {
		return SampleCount;
	}
	public void setSampleCount(Double sampleCount) {
		SampleCount = sampleCount;
	}
	public Date getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(Date timestamp) {
		Timestamp = timestamp;
	}
	public Double getMax() {
		return Max;
	}
	public void setMax(Double max) {
		Max = max;
	}
	public Double getMin() {
		return Min;
	}
	public void setMin(Double min) {
		Min = min;
	}
	
}
