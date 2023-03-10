package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribePriceRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Contains the parameters for RunInstances.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribePriceRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<DescribePriceRequest> {

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

	/** <p>
	 * 最大实例数，如果指定的实例数大于金山云在本region所能创建的最大实例数，
			* 则会创建大于MinCount数量的最大允许实例数。
			* 是否可缺省: 否
	 * </p>
			*/
	private Integer MaxCount;


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
	 * 数据盘（云盘）的支持
	 * 是否可缺省：是
	 * </p>
	 */
	private List<DataDisk> DataDisk;
	



	/**
	 * <p>
	 数据卷容量，单位GB，容量限制依据 实例套餐类型定义 变化，如果调用时未指定，
	 则为相应实例套餐类型最小值。InstanceType为通用型主机N1、N2、N3或者为本地NVMe机型I4时，此参数不生效。。
	 * </p>
	 */
	private Integer DataDiskGb;




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



	@Override
	public Request<DescribePriceRequest> getDryRunRequest() {
		Request<DescribePriceRequest> request = new DescribePriceRequestMarshaller()
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


}
