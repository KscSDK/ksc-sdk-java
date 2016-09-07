package com.ksc.epc.model;

import lombok.ToString;
@ToString
public class EpcHost {
	/**
	 * 云物理主机资源ID
	 */
	private String EpcHostId;
	/**
	 * 云物理主机名称
	 */
	private String HostName;
	/**
	 * 云物理主机类型,CAL或者DB
	 */
	private String HostType;
	/**
	 * CPU核数
	 */
	private Integer CoreCount;
	/**
	 * 内存大小，单位：G
	 */
	private String Memory;
	/**
	 * 云物理主机状态，创建中:Initializing; 创建失败：Failed；运行中：Running；重装中：Reinstalling； 重装失败：ReinstallFailed； 已关闭：Stopped；已停用： Locked
	 */
	private String EpcHostStatus;
	/**
	 * 操作系统名称
	 */
	private String OsName;
	/**
	 * 内网资源IP地址
	 */
	private String IpAddress;
	/**
	 * 云物理主机的VPC ID
	 */
	private String VpcId;
	/**
	 * 云物理主机虚拟网络接口ID
	 */
	private String VifId;
	/**
	 * 云物理主机的子网ID
	 */
	private String SubnetId;
	public String getEpcHostId() {
		return EpcHostId;
	}
	public void setEpcHostId(String epcHostId) {
		EpcHostId = epcHostId;
	}
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostName) {
		HostName = hostName;
	}
	public String getHostType() {
		return HostType;
	}
	public void setHostType(String hostType) {
		HostType = hostType;
	}
	public Integer getCoreCount() {
		return CoreCount;
	}
	public void setCoreCount(Integer coreCount) {
		CoreCount = coreCount;
	}
	public String getMemory() {
		return Memory;
	}
	public void setMemory(String memory) {
		Memory = memory;
	}
	public String getEpcHostStatus() {
		return EpcHostStatus;
	}
	public void setEpcHostStatus(String epcHostStatus) {
		EpcHostStatus = epcHostStatus;
	}
	public String getOsName() {
		return OsName;
	}
	public void setOsName(String osName) {
		OsName = osName;
	}
	public String getIpAddress() {
		return IpAddress;
	}
	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}
	public String getVpcId() {
		return VpcId;
	}
	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}
	public String getVifId() {
		return VifId;
	}
	public void setVifId(String vifId) {
		VifId = vifId;
	}
	public String getSubnetId() {
		return SubnetId;
	}
	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}
	
}
