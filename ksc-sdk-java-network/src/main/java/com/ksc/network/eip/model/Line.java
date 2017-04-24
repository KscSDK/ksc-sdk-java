package com.ksc.network.eip.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Line {
	private String LineId;

	private String LineName;

	private String LineType;

	public String getLineId() {
		return LineId;
	}

	public void setLineId(String lineId) {
		LineId = lineId;
	}

	public String getLineName() {
		return LineName;
	}

	public void setLineName(String lineName) {
		LineName = lineName;
	}

	public String getLineType() {
		return LineType;
	}

	public void setLineType(String lineType) {
		LineType = lineType;
	}
	
}
