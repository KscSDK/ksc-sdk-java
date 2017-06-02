package com.ksc.cdn.model.statistic.dir.bandwidth;

public class BpsDataByRegion {
	

	/**
	 * 区域名称
	 */
	private String Region;
	
	/**
	 * 边缘带宽（该目录在该区域的边缘带宽数据）
	 */
	private Long Bw;

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public Long getBw() {
		return Bw;
	}

	public void setBw(Long bw) {
		Bw = bw;
	}
}
