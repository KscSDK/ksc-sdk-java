package com.ksc.cdn.model.statistic.dir.flow;

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

	public String getDir() {
		return Dir;
	}

	public void setDir(String dir) {
		Dir = dir;
	}

	public Long getFlow() {
		return Flow;
	}

	public void setFlow(Long flow) {
		Flow = flow;
	}

	public FlowDataByRegion[] getRegions() {
		return Regions;
	}

	public void setRegions(FlowDataByRegion[] regions) {
		Regions = regions;
	}
}
