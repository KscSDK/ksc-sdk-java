package com.ksc.kec.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class Image {
	private String ImageId;

	private String Name;

	private String ImageState;

	private String CreationDate;

	private String Platform;

	private Boolean IsPublic;

	private Boolean IsNpe;

	private String UserCategory;

	private String SysDisk;

	private String Progress;

	private String ImageSource;

	private String InstanceId;
	
	private Boolean CloudInitSupport;

	private Boolean Ipv6Support;

	private Boolean IsModifyType;

	private Boolean IsCloudMarket;

	private List<SnapShot> SnapShotSet;

	public void withSnapShotSet(SnapShot... snapShots) {
		if (this.SnapShotSet == null) {
			this.setSnapShotSet(new com.ksc.internal.SdkInternalList<SnapShot>());
		}
		for (SnapShot ele : snapShots) {
			this.SnapShotSet.add(ele);
		}
	}

	@Data
	public static class SnapShot{

		/**
		 * 快照ID
		 */
		private String SnapshotId;

		/**
		 * 系统盘和数据盘快照类型
		 * 取值范围：local_snapshot本地盘快照，ebs_snapshot云盘快照
		 */
		private String DiskType;

		/**
		 * 创建此快照的磁盘大小，单位GB
		 */
		private Integer DiskSize;

		/**
		 * 磁盘类型
		 * 取值范围：data数据盘， system系统盘
		 */
		private String Type;

	}
}
