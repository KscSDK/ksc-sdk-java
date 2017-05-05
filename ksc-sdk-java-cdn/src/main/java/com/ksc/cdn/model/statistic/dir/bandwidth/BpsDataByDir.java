package com.ksc.cdn.model.statistic.dir.bandwidth;

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

	public String getDir() {
		return Dir;
	}

	public void setDir(String dir) {
		Dir = dir;
	}

	public BpsDataByRegion[] getRegions() {
		return Regions;
	}

	public void setRegions(BpsDataByRegion[] regions) {
		Regions = regions;
	}

	public Long getBw() {
		return Bw;
	}

	public void setBw(Long bw) {
		Bw = bw;
	}
}
