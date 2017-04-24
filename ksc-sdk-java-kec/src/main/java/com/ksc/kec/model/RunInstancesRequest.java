package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.RunInstancesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for RunInstances.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class RunInstancesRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<RunInstancesRequest> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8087390937209188452L;

	private String ImageId;
	private String InstanceType;
	private Integer DataDiskGb;
	private Integer MaxCount;
	private Integer MinCount;
	private String SubnetId;
	private String InstancePassword;
	private String ChargeType;
	private Integer PurchaseTime;
	private String SecurityGroupId;
	private String PrivateIpAddress;
	private String InstanceName;
	private String InstanceNameSuffix;
	private Boolean SriovNetSupport;

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getInstanceType() {
		return InstanceType;
	}

	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}

	public Integer getDataDiskGb() {
		return DataDiskGb;
	}

	public void setDataDiskGb(Integer dataDiskGb) {
		DataDiskGb = dataDiskGb;
	}

	public Integer getMaxCount() {
		return MaxCount;
	}

	public void setMaxCount(Integer maxCount) {
		MaxCount = maxCount;
	}

	public Integer getMinCount() {
		return MinCount;
	}

	public void setMinCount(Integer minCount) {
		MinCount = minCount;
	}

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}

	public String getInstancePassword() {
		return InstancePassword;
	}

	public void setInstancePassword(String instancePassword) {
		InstancePassword = instancePassword;
	}

	public String getChargeType() {
		return ChargeType;
	}

	public void setChargeType(String chargeType) {
		ChargeType = chargeType;
	}

	public Integer getPurchaseTime() {
		return PurchaseTime;
	}

	public void setPurchaseTime(Integer purchaseTime) {
		PurchaseTime = purchaseTime;
	}

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getPrivateIpAddress() {
		return PrivateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}

	public String getInstanceName() {
		return InstanceName;
	}

	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}

	public String getInstanceNameSuffix() {
		return InstanceNameSuffix;
	}

	public void setInstanceNameSuffix(String instanceNameSuffix) {
		InstanceNameSuffix = instanceNameSuffix;
	}

	public Boolean getSriovNetSupport() {
		return SriovNetSupport;
	}

	public void setSriovNetSupport(Boolean sriovNetSupport) {
		SriovNetSupport = sriovNetSupport;
	}

	@Override
	public Request<RunInstancesRequest> getDryRunRequest() {
		Request<RunInstancesRequest> request = new RunInstancesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
