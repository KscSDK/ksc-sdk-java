package com.ksc.cdn.model.statistic.dir.bandwidth;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
public class BpsDataByRegion {
	

	/**
	 * 区域名称
	 */
	private String Region;
	
	/**
	 * 边缘带宽（该目录在该区域的边缘带宽数据）
	 */
	private Long Bw;
}
