package com.ksc.cdn.model.statistic.dir.bandwidth;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ksc.cdn.model.statistic.dir.flow.FlowDataByRegion;

@Data
public class BpsDataByDir {
	

	/**
	 *  目录名称
	 */
	private String Dir;
	
	/**
	 * 边缘带宽（该目录下的边缘带宽，若选择多个区域，则返回该目录下多个区域的数据合并值）
	 */
	private Long Bw;
	
	/**
	 * 该目录在每个区域的详细带宽数据
	 */
	private BpsDataByRegion[] Regions;
}
