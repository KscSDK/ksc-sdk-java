package com.ksc.epc.model;

import lombok.ToString;

@ToString
public class Cpu {
	/**
	 * CPU型号
	 */
	private String Model;
	/**
	 * CPU主频
	 */
	private String Frequence;
	/**
	 * CPU个数
	 */
	private Integer Count;
	/**
	 * CPU核数
	 */
	private Integer CoreCount;
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getFrequence() {
		return Frequence;
	}
	public void setFrequence(String frequence) {
		Frequence = frequence;
	}
	public Integer getCount() {
		return Count;
	}
	public void setCount(Integer count) {
		Count = count;
	}
	public Integer getCoreCount() {
		return CoreCount;
	}
	public void setCoreCount(Integer coreCount) {
		CoreCount = coreCount;
	}
	
}
