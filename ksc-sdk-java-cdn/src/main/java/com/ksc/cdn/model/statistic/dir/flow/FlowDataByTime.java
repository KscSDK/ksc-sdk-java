package com.ksc.cdn.model.statistic.dir.flow;

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

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public Long getFlow() {
		return Flow;
	}

	public void setFlow(Long flow) {
		Flow = flow;
	}

	public FlowDataByDir[] getDirs() {
		return Dirs;
	}

	public void setDirs(FlowDataByDir[] dirs) {
		Dirs = dirs;
	}
}
