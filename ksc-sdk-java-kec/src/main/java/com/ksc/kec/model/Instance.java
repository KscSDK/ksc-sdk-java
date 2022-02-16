package com.ksc.kec.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import com.ksc.internal.SdkInternalList;

@ToString
@EqualsAndHashCode
public class Instance {

	private String InstanceId;

	private String InstanceName;

	private String InstanceType;

	private InstanceConfigure InstanceConfigure;

	private String ImageId;

	private String SubnetId;

	private String PrivateIpAddress;

	private InstanceState InstanceState;

	private InstanceMonitor Monitoring;

	private List<InstanceNetwork> NetworkInterfaceSet;

	private String SriovNetSupport;

	private String CreationDate;

	private String AvailabilityZone;

	private Long ProjectId;

	private String ServiceEndTime;

	private String ChargeType;

	private Integer ProductType;

	private Boolean IsShowSriovNetSupport;

	private String AvailabilityZoneName;

	private String AutoScalingType;

	private Integer ProductWhat;

	private SystemDisk SystemDisk;

	private String HostName;

	private String UserData;

	private String StoppedMode;

	private String AutoDeleteTime;

	private Boolean AutoDeleteEip;

	private String SpotRecyclingTime;

	private String SpotStrategy;

	private Double SpotPriceLimit;

	private List<DataDisk> DataDiskSet;

	private DataGuard DataGuard;

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

	public String getAvailabilityZone() {
		return AvailabilityZone;
	}

	public void setAvailabilityZone(String availabilityZone) {
		AvailabilityZone = availabilityZone;
	}

	public Instance withNetworkSet(InstanceNetwork... network_set) {
		if (this.NetworkInterfaceSet == null) {
			this.NetworkInterfaceSet = new SdkInternalList<InstanceNetwork>();
		}
		for (InstanceNetwork n : network_set) {
			this.NetworkInterfaceSet.add(n);
		}
		return this;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getInstanceName() {
		return InstanceName;
	}

	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}

	public String getInstanceType() {
		return InstanceType;
	}

	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}

	public InstanceConfigure getInstanceConfigure() {
		return InstanceConfigure;
	}

	public void setInstanceConfigure(InstanceConfigure instanceConfigure) {
		InstanceConfigure = instanceConfigure;
	}

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}

	public String getPrivateIpAddress() {
		return PrivateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}

	public InstanceState getInstanceState() {
		return InstanceState;
	}

	public void setInstanceState(InstanceState instanceState) {
		InstanceState = instanceState;
	}

	public InstanceMonitor getMonitoring() {
		return Monitoring;
	}

	public void setMonitoring(InstanceMonitor monitoring) {
		Monitoring = monitoring;
	}

	public List<InstanceNetwork> getNetworkInterfaceSet() {
		return NetworkInterfaceSet;
	}

	public void setNetworkInterfaceSet(List<InstanceNetwork> networkInterfaceSet) {
		NetworkInterfaceSet = networkInterfaceSet;
	}

	public String getSriovNetSupport() {
		return SriovNetSupport;
	}

	public void setSriovNetSupport(String sriovNetSupport) {
		SriovNetSupport = sriovNetSupport;
	}

	public String getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}

	public String getServiceEndTime() {
		return ServiceEndTime;
	}

	public void setServiceEndTime(String serviceEndTime) {
		ServiceEndTime = serviceEndTime;
	}

	public String getChargeType() {
		return ChargeType;
	}

	public void setChargeType(String chargeType) {
		ChargeType = chargeType;
	}

	public Integer getProductType() {
		return ProductType;
	}

	public void setProductType(Integer productType) {
		ProductType = productType;
	}

	public Boolean getShowSriovNetSupport() {
		return IsShowSriovNetSupport;
	}

	public void setShowSriovNetSupport(Boolean showSriovNetSupport) {
		IsShowSriovNetSupport = showSriovNetSupport;
	}

	public String getAvailabilityZoneName() {
		return AvailabilityZoneName;
	}

	public void setAvailabilityZoneName(String availabilityZoneName) {
		AvailabilityZoneName = availabilityZoneName;
	}

	public String getAutoScalingType() {
		return AutoScalingType;
	}

	public void setAutoScalingType(String autoScalingType) {
		AutoScalingType = autoScalingType;
	}

	public Integer getProductWhat() {
		return ProductWhat;
	}

	public void setProductWhat(Integer productWhat) {
		ProductWhat = productWhat;
	}

	public com.ksc.kec.model.SystemDisk getSystemDisk() {
		return SystemDisk;
	}

	public void setSystemDisk(com.ksc.kec.model.SystemDisk systemDisk) {
		SystemDisk = systemDisk;
	}

	public String getHostName() {
		return HostName;
	}

	public void setHostName(String hostName) {
		HostName = hostName;
	}

	public String getUserData() {
		return UserData;
	}

	public void setUserData(String userData) {
		UserData = userData;
	}

	public String getStoppedMode() {
		return StoppedMode;
	}

	public void setStoppedMode(String stoppedMode) {
		StoppedMode = stoppedMode;
	}

	public String getAutoDeleteTime() {
		return AutoDeleteTime;
	}

	public void setAutoDeleteTime(String autoDeleteTime) {
		AutoDeleteTime = autoDeleteTime;
	}

	public Boolean getAutoDeleteEip() {
		return AutoDeleteEip;
	}

	public void setAutoDeleteEip(Boolean autoDeleteEip) {
		AutoDeleteEip = autoDeleteEip;
	}

	public String getSpotRecyclingTime() {
		return SpotRecyclingTime;
	}

	public void setSpotRecyclingTime(String spotRecyclingTime) {
		SpotRecyclingTime = spotRecyclingTime;
	}

	public String getSpotStrategy() {
		return SpotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		SpotStrategy = spotStrategy;
	}

	public Double getSpotPriceLimit() {
		return SpotPriceLimit;
	}

	public void setSpotPriceLimit(Double spotPriceLimit) {
		SpotPriceLimit = spotPriceLimit;
	}

	public List<DataDisk> getDataDiskSet() {
		return DataDiskSet;
	}

	public void setDataDiskSet(List<DataDisk> dataDiskSet) {
		DataDiskSet = dataDiskSet;
	}

	public Instance.DataGuard getDataGuard() {
		return DataGuard;
	}

	public void setDataGuard(Instance.DataGuard dataGuard) {
		DataGuard = dataGuard;
	}

	public Instance withDataDisks(DataDisk... dataDisks) {
		if (this.DataDiskSet == null) {
			this.DataDiskSet = new SdkInternalList<DataDisk>();
		}
		for (DataDisk n : dataDisks) {
			this.DataDiskSet.add(n);
		}
		return this;
	}

	@ToString
	@Data
	public static class DataDisk {
		private String DiskId;
		private String DiskType;
		private Integer DiskSize;
		private Boolean DeleteWithInstance;
	}

	@Data
	@ToString
	public static class DataGuard {
		private String DataGuardId;
		private String DataGuardName;
	}
}
