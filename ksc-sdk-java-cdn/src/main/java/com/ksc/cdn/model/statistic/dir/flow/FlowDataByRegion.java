package com.ksc.cdn.model.statistic.dir.flow;

public class FlowDataByRegion {
	
	/**
	 * 区域名称
	 */
	private String Region;
	
	/**
	 * 边缘流量（该目录在该区域的边缘流量数据）
	 */
	private Long Flow;

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public Long getFlow() {
		return Flow;
	}

	public void setFlow(Long flow) {
		Flow = flow;
	}
}
