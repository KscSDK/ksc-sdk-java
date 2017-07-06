package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class CustomDataPoint {
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

	@Override
	public String toString() {
		return "Datapoint{" +
				"Value=" + Value +
				", Timestamp='" + Timestamp + '\'' +
				'}';
	}
}
