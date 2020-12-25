package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class InstanceConfigure {

	/**
	 * 实例VCPU的个数
	 * 类型: Integer
	 * 是否可缺省: 否
	 */
	private Integer VCPU;

	/**
	 * 实例内存的大小，单位GB
	 * 类型: Integer
	 * 是否可缺省: 否
	 */
	private Integer MemoryGb;

	/**
	 * 数据磁盘大小，单位GB
	 * 类型: Integer
	 * 是否可缺省: 否
	 */
	private Integer DataDiskGb;

	/**
	 * 数据磁盘类型
	 * 类型: String
	 * 有效值: SSD | SATA
	 * 是否可缺省: 否
	 */
	private String DataDiskType;

	/**
	 * 系统磁盘大小，单位GB
	 * 类型: Integer
	 * 是否可缺省: 否
	 */
	private Integer RootDiskGb;

	/**
	 * 异构计算（GPU或FPGA）规格
	 * 类型: String
	 * 是否可缺省：是
	 */
	private String Spec;

	public Integer getVCPU() {
		return VCPU;
	}

	public void setVCPU(Integer vCPU) {
		VCPU = vCPU;
	}

	public Integer getMemoryGb() {
		return MemoryGb;
	}

	public void setMemoryGb(Integer memoryGb) {
		MemoryGb = memoryGb;
	}

	public Integer getDataDiskGb() {
		return DataDiskGb;
	}

	public void setDataDiskGb(Integer dataDiskGb) {
		DataDiskGb = dataDiskGb;
	}

	public String getDataDiskType() {
		return DataDiskType;
	}

	public void setDataDiskType(String dataDiskType) {
		DataDiskType = dataDiskType;
	}

	public Integer getRootDiskGb() {
		return RootDiskGb;
	}

	public void setRootDiskGb(Integer rootDiskGb) {
		RootDiskGb = rootDiskGb;
	}

	public String getSpec() {
		return Spec;
	}

	public void setSpec(String spec) {
		Spec = spec;
	}
}
