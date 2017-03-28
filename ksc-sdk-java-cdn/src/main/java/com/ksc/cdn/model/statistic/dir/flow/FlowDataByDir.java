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
public class FlowDataByDir {
	
	/**
	 *  目录名称
	 */
	private String Dir;
	
	/**
	 * 边缘流量（该目录下的边缘流量，若选择多个区域，则返回该目录下多个区域的数据合并值）
	 */
	private Long Flow;
	
	/**
	 * 该目录在每个区域的详细流量数据
	 */
	private FlowDataByRegion[] Regions;
}
