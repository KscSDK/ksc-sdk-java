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

	private static final long serialVersionUID = -8087390937209188452L;
	/**
	 * <p>
	 * 镜像ID
	 * 是否可缺省: 否
	 * </p>
	 */
	private String ImageId;
	/**
	 * <p>
	 * 实例套餐类型，如果调用时未指定实例套餐类型，默认值为I1.1A
	 * 是否可缺省: 是
	 * </p>
	 */
	private String InstanceType;
	/**
	 * <p>
	 * 数据卷容量，单位GB，容量限制依据 实例套餐类型定义 变化，如果调用时未指定，
	 * 则为相应实例套餐类型最小值。InstanceType为通用型主机。此参数不生效。
	 * 是否可缺省: 是
	 * </p>
	 */
	private Integer DataDiskGb;
	/**
	 * <p>
	 * 最大实例数，如果指定的实例数大于金山云在本region所能创建的最大实例数，
	 * 则会创建大于MinCount数量的最大允许实例数。
	 * 是否可缺省: 否
	 * </p>
	 */
	private Integer MaxCount;
	/**
	 * <p>
	 * 最小实例数，如果指定的实例数大于金山云在本region所能创建的最大实例数，则不会创建任何实例。
	 * 是否可缺省: 否
	 * </p>
	 */
	private Integer MinCount;
	/**
	 * <p>
	 * VPC环境下的子网ID，绑定到主网卡
	 * 是否可缺省: 否
	 * </p>
	 */
	private String SubnetId;
	/**
	 * <p>
	 * 实例开机密码
	 * 是否可缺省: 否
	 * </p>
	 */
	private String InstancePassword;
	/**
	 * <p>
	 * 计费类型，调用时需要明确指定，无默认值
	 * 是否可缺省: 否
	 * </p>
	 */
	private String ChargeType;
	/**
	 * <p>
	 * 购买时长，单位月
	 * 是否可缺省: 否
	 * </p>
	 */
	private Integer PurchaseTime;
	/**
	 * <p>
	 * 实例绑定的安全组，目前仅支持绑定一个安全组
	 * 是否可缺省: 否
	 * </p>
	 */
	private String SecurityGroupId;
	/**
	 * <p>
	 * 私有IP地址，指定子网IP地址范围内的任意有效值，代表实例的主IP地址，只能选择一个，
	 * 绑定到主网卡；如果未指定该参数，系统自动从有效地址池中随机选取一个。
	 * 是否可缺省: 是
	 * </p>
	 */
	private String PrivateIpAddress;
	/**
	 * <p>
	 * 实例名称，如果未指定，则自动生成，形如KSC-IN-[A-Z0-9]{10}
	 * 是否可缺省: 是
	 * </p>
	 */
	private String InstanceName;
	/**
	 * <p>
	 * 实例名称后缀，InstanceName参数如果缺省，此参数不生效；当大于1台的批量创建主机，
	 * 后缀编号自动+1，例如后缀输入5，主机名输入"host"，批量3台，则生成的三台主机名分别为："host-5"、"host-6"、"host-7"。
	 * 是否可缺省: 是
	 * </p>
	 */
	private String InstanceNameSuffix;
	/**
	 * <p>
	 * 开启增强联网，只支持IO优化型8核、16核套餐，
	 * 只支持- CentOS操作系统6.5、6.6、6.7、7.0、7.1，Ubuntu 14.04操作系统。
	 * 是否可缺省: 是
	 * </p>
	 */
	private Boolean SriovNetSupport;
	/**
	 * <p>
	 * 项目ID，
	 * 创建出的实例属于哪个项目。
	 * 是否可缺省: 是
	 * </p>
	 */
	private Long ProjectId;

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

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
