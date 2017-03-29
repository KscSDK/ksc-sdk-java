package com.ksc.cdn.model.statistic.dir.bandwidth;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ksc.cdn.model.statistic.dir.flow.FlowDataByDir;

@Data
public class BpsDataByTime {
	
	/**
	 * 时间点
	 */
	private String Time;

	/**
	 * 边缘带宽（该域名下所选目录的边缘带宽，若选择多个区域，则返回该域名下所选目录在多个区域的数据合并值）
	 */
	private Long Bw;
	
	/**
	 * 每个目录的详细带宽数据(仅当ResultType取值为1时返回此项数据)
	 */
	private BpsDataByDir[] Dirs;
	
}
