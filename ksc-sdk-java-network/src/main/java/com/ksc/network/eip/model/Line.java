package com.ksc.network.eip.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Line {
	/**
	 * 弹性IP的线路类型的ID
	 */
	private String LineId;

	/**
	 * 线路类型名称
	 */
	private String LineName;

	/**
	 * 弹性IP的类型，公网(Public)、金山云内网(Private)
	 */
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
