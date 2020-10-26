package com.ksc.kec.model;

import java.io.Serializable;
import java.util.List;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.RunInstancesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

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
	 * 云主机系统盘配置参数。若不指定该参数，则按照系统默认值进行分配。
	 * 类型：SystemDisk
	 * 是否可缺省：是
	 * </p>
	 */
	private SystemDisk SystemDisk;
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
	 * 本地数据盘快照ID，可基于快照创建数据盘；必须指定DataDiskGb且大小和快照大小相同，此参数才有效
	 * 类型: String
	 * 是否可缺省: 是
	 * </p>
	 */
	private String LocalVolumeSnapshotId;

	/**
	 * <p>
	 * 实例开机密码
	 * 是否可缺省: 否
	 * </p>
	 */
	private String InstancePassword;

	/**
	 * <p>
	 * 保留镜像设置登录。该参数只对使用自定义镜像有效。当该值填写为true，默认InstancePassword参数无效。（当InstancePassword、KeepImageLogin、KeyId.N都不传时，登录方式为创建后设置）
	 * 类型：Boolean
	 * 有效值：true | false
	 * 默认值：false
	 * 是否可以缺省：是
	 * </p>
	 */
	private Boolean KeepImageLogin;

	/**
	 * KeyId.N
	 *
	 * 密钥ID（当InstancePassword、KeepImageLogin、KeyId.N都不传时，登录方式为创建后设置）
	 * 类型：String
	 * 是否可缺省：是
	 */
	private List<String> KeyIds;

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

	/**
	 * <p>
	 * 容灾分组ID
	 * 类型：String
	 * 是否可缺省：是
	 * </p>
	 */
	private String DataGuardId;

	/**
	 * <p>
	 * 竞价实例的抢占策略，当参数ChargeType为Spot（竞价型实例）时生效
	 * 类型: String
	 * 有效值： SpotWithPriceLimit：设置上限价格的抢占式实例。合法值“当前市场价~按小时实时结算价格”区间，输入值不在此区间非法。 SpotAsPriceGo（默认）：系统自动出价，跟随当前市场实际价格
	 * 是否可缺省: 是
	 * </p>
	 */
	private String SpotStrategy;

	/**
	 * <p>
	 * 设置实例的每小时最高价格。参数SpotStrategy取值为SpotWithPriceLimit时生效
	 * 类型：Float
	 * 有效值：支持最大5位小数
	 * 是否可缺省：是
	 * </p>
	 */
	private Double SpotPriceLimit;
	
	/**
	 * <p>
	 * 数据盘（云盘）的支持
	 * 是否可缺省：是
	 * </p>
	 */
	private List<DataDisk> DataDisk;
	
	/**
	 * <p>
	 * 弹性IP的带宽
	 * 是否可缺省: 是，购买弹性IP时不可缺省
	 * </p>
	 */
	private Integer AddressBandWidth;
	
	/**
	 * <p>
	 * 弹性IP的链路类型的ID
	 * 是否可缺省: 是，购买弹性IP时不可缺省
	 * </p>
	 */
	private String LineId;
	
	/**
	 * <p>
	 * 弹性IP的计费类型
	 * 有效值: PrePaidByMonth ：包年包月，有到期时间，只能升带宽 PostPaidByPeak：按峰值月结，无到期时间，可升降带宽 PostPaidByDay：按日月结，无到期时间，可升降带宽 PostPaidByTransfer：按流量月结，无到期时间，可升降带宽 PostPaidByHour：按小时月结，无到期时间，可升降带宽
	 * 是否可缺省: 是，购买弹性IP时不可缺省
	 * </p>
	 */
	private String AddressChargeType;
	
	/**
	 * <p>
	 * 购买时长，只有购买包年包月弹性IP时不可缺省。
	 *是否可缺省: 是
	 * </p>
	 */
	private Integer AddressPurchaseTime;
	
	/**
	 * <p>
	 * 弹性IP项目的ID
	 *是否可缺省: 是
	 *缺省值: 默认项目
	 * </p>
	 */
	private String AddressProjectId;

	/**
	 * <p>
	 * 实例启动模板ID，使用启动模板创建实例；如果批量创建，实例名称后缀依然存在
	 * 类型: String
	 * 是否可缺省: 是
	 * 缺省值: 默认项目
	 * </p>
	 */
	private String ModelId;

	/**
	 * <p>
	 * 随主机定时删除绑定的弹性IP
	 * 类型：Boolean
	 * 是否可缺省：是
	 * 默认值：false
	 * 注：包年包月的弹性IP只解绑，不删除；只有AutoDeleteTime有效值生效时，该参数才生效
	 * </p>
	 */
	private String AutoDeleteTime;

	/**
	 * <p>
	 * 操作系统内部的计算机名
	 * 类型：String
	 * 有效值：字符长度为[2, 64]，不支持点号（.），每段允许字母（不限制大小写）、数字和短横线（-）组成
	 * 是否可缺省: 是
	 * </p>
	 */
	private String HostName;

	/**
	 * <p>
	 * 创建多台实例时为HostName增加有序后缀，有序后缀从1增加，例如host-1，
	 * 类型：int
	 * 有效值：0-9999
	 * 是否可缺省: 是，默认值为空；
	 * </p>
	 */
	private String HostNameSuffix;

	/**
	 * <p>
	 * 提供给实例启动时使用的用户自定义数据，需要以 base64 方式编码，支持的最大数据大小为 16KB
	 * 类型：String
	 * 有效值：需要以 base64 方式编码
	 * 是否可缺省: 是
	 * </p>
	 */
	private String UserData;


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

	public List<DataDisk> getDataDisk() {
		return DataDisk;
	}

	public void setDataDisk(List<DataDisk> dataDisk) {
		DataDisk = dataDisk;
	}

	public Integer getAddressBandWidth() {
		return AddressBandWidth;
	}

	public void setAddressBandWidth(Integer addressBandWidth) {
		AddressBandWidth = addressBandWidth;
	}

	public String getLineId() {
		return LineId;
	}

	public void setLineId(String lineId) {
		LineId = lineId;
	}

	public String getAddressChargeType() {
		return AddressChargeType;
	}

	public void setAddressChargeType(String addressChargeType) {
		AddressChargeType = addressChargeType;
	}

	public Integer getAddressPurchaseTime() {
		return AddressPurchaseTime;
	}

	public void setAddressPurchaseTime(Integer addressPurchaseTime) {
		AddressPurchaseTime = addressPurchaseTime;
	}

	public String getAddressProjectId() {
		return AddressProjectId;
	}

	public void setAddressProjectId(String addressProjectId) {
		AddressProjectId = addressProjectId;
	}

	public String getLocalVolumeSnapshotId() {
		return LocalVolumeSnapshotId;
	}

	public void setLocalVolumeSnapshotId(String localVolumeSnapshotId) {
		LocalVolumeSnapshotId = localVolumeSnapshotId;
	}

	public Boolean getKeepImageLogin() {
		return KeepImageLogin;
	}

	public void setKeepImageLogin(Boolean keepImageLogin) {
		KeepImageLogin = keepImageLogin;
	}

	public List<String> getKeyIds() {
		return KeyIds;
	}

	public void setKeyIds(List<String> keyIds) {
		KeyIds = keyIds;
	}

	public String getDataGuardId() {
		return DataGuardId;
	}

	public void setDataGuardId(String dataGuardId) {
		DataGuardId = dataGuardId;
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

	public String getModelId() {
		return ModelId;
	}

	public void setModelId(String modelId) {
		ModelId = modelId;
	}

	public String getAutoDeleteTime() {
		return AutoDeleteTime;
	}

	public void setAutoDeleteTime(String autoDeleteTime) {
		AutoDeleteTime = autoDeleteTime;
	}

	public String getHostName() {
		return HostName;
	}

	public void setHostName(String hostName) {
		HostName = hostName;
	}

	public String getHostNameSuffix() {
		return HostNameSuffix;
	}

	public void setHostNameSuffix(String hostNameSuffix) {
		HostNameSuffix = hostNameSuffix;
	}

	public String getUserData() {
		return UserData;
	}

	public void setUserData(String userData) {
		UserData = userData;
	}

	public com.ksc.kec.model.SystemDisk getSystemDisk() {
		return SystemDisk;
	}

	public void setSystemDisk(com.ksc.kec.model.SystemDisk systemDisk) {
		SystemDisk = systemDisk;
	}

	public void withDataDisks(DataDisk... dataDisks) {
		if (this.DataDisk == null) {
			setDataDisk(new com.ksc.internal.SdkInternalList<DataDisk>());
		}
		for (DataDisk ele : dataDisks) {
			this.DataDisk.add(ele);
		}
	}

	public void withKeyIds(String... keyIds) {
		if (this.KeyIds == null) {
			setKeyIds(new com.ksc.internal.SdkInternalList<String>());
		}
		for (String ele : keyIds) {
			this.KeyIds.add(ele);
		}
	}
}
