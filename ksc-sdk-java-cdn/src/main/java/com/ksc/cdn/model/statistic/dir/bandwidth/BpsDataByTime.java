package com.ksc.cdn.model.statistic.dir.bandwidth;

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


	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public Long getBw() {
		return Bw;
	}

	public void setBw(Long bw) {
		Bw = bw;
	}

	public BpsDataByDir[] getDirs() {
		return Dirs;
	}

	public void setDirs(BpsDataByDir[] dirs) {
		Dirs = dirs;
	}
}
