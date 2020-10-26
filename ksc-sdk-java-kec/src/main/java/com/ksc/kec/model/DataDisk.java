package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class DataDisk {
	
	/**
	 * <p>
	 * 数据盘（云盘）的类型，数据盘n的类型，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、E1、N1、N2、N3、S3、I3、C3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
	 * 类型：String
	 * 有效值： SSD3.0，EHDD
	 * 是否可缺省：是
	 * </p>
	 */
	private String Type;
	
	/**
	 * <p>
	 * 第 n 个数据盘（云盘）的容量大小，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、E1、N1、N2、N3、S3、I3、C3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
	 * 类型：Integer
	 * 有效值： [10，16000]
	 * 是否可缺省：是
	 * </p>
	 */
	private Integer Size;
	
	/**
	 * <p>
	 * 数据盘是否随实例释放
	 * 类型：Boolean
	 * 有效值：
	 * true：实例释放时，这块磁盘随实例一起释放。
	 * false：实例释放时，这块磁盘保留不释放。
	 * 是否可缺省：是
	 * 默认值：false
	 * </p>
	 */
	private Boolean DeleteWithInstance;

	/**
	 * <p>
	 * 第 n 个数据盘（云盘）的快照ID，n 的取值范围为 [1, 8]。支持SSD3.0云硬盘和EHDD高效云盘。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。
	 * 类型：String
	 * 是否可缺省：是
	 * </p>
	 */
	private String SnapshotId;
	
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

	public String getSnapshotId() {
		return SnapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}
}
