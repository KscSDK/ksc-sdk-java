package com.ksc.kec.model;

import java.util.List;

import lombok.EqualsAndHashCode;
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

	private List<InstanceNetwork> NetworkInterfaceSet = new SdkInternalList<InstanceNetwork>();

	private String SriovNetSupport;

	private String CreationDate;

	private String AvailabilityZone;

	public String getAvailabilityZone() {
		return AvailabilityZone;
	}

	public void setAvailabilityZone(String availabilityZone) {
		AvailabilityZone = availabilityZone;
	}

	public Instance withNetworkSet(InstanceNetwork... network_set) {
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

}
