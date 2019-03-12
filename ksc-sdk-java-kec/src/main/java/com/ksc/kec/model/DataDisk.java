package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class DataDisk {
	
	/**
	 * <p>
	 * 数据盘（云盘）的类型，数据盘n的类型，n 的取值范围为 [1, 3]。只支持I2、I2联网增强、N1和N2。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
	 * </p>
	 */
	private String Type;
	
	/**
	 * <p>
	 * 第 n 个数据盘（云盘）的容量大小，n 的取值范围为 [1, 3]。只支持I2、I2联网增强、N1和N2。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
	 * </p>
	 */
	private Integer Size;
	
	/**
	 * <p>
	 * 数据盘是否随实例释放，有效值：true：实例释放时，这块磁盘随实例一起释放。false：实例释放时，这块磁盘保留不释放。
	 * </p>
	 */
	private Boolean DeleteWithInstance;
	
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Integer getSize() {
		return Size;
	}
	public void setSize(Integer size) {
		Size = size;
	}
	public Boolean getDeleteWithInstance() {
		return DeleteWithInstance;
	}
	public void setDeleteWithInstance(Boolean deleteWithInstance) {
		DeleteWithInstance = deleteWithInstance;
	}

}
