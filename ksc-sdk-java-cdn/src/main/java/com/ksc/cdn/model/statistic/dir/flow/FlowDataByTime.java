package com.ksc.cdn.model.statistic.dir.flow;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
public class FlowDataByTime {

	/**
	 * 时间点
	 */
	private String Time;

	/**
	 * 边缘流量（该域名下所选目录的边缘流量，若选择多个区域，则返回该域名下所选目录在多个区域的数据合并值）
	 */
	private Long Flow;
	
	/**
	 * 每个目录的详细流量数据(仅当ResultType取值为1时返回此项数据)
	 */
	private FlowDataByDir[] Dirs;
}
