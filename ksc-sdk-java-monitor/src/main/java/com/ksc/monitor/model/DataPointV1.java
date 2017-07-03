package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class DataPointV1 {
	private Double Value;
	private String Timestamp;
	public Double getValue() {
		return Value;
	}
	public void setValue(Double value) {
		Value = value;
	}
	public String getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(String timestamp) {
		Timestamp = timestamp;
	}
	

}
