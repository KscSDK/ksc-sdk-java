package com.ksc.offline.model;

public class TaskInfo {
	private String taskid;
	private String preset;
	private String dstBucket;
	private String dstDir;
	private String dstObjectKey;
	private String taskStatus;
	private String isTop;
	private String createTime;
	private com.ksc.internal.SdkInternalList<SrcInfo> SrcInfoList;

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

	public String getDstBucket() {
		return dstBucket;
	}

	public void setDstBucket(String dstBucket) {
		this.dstBucket = dstBucket;
	}

	public String getDstDir() {
		return dstDir;
	}

	public void setDstDir(String dstDir) {
		this.dstDir = dstDir;
	}

	public String getDstObjectKey() {
		return dstObjectKey;
	}

	public void setDstObjectKey(String dstObjectKey) {
		this.dstObjectKey = dstObjectKey;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getIsTop() {
		return isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public com.ksc.internal.SdkInternalList<SrcInfo> getSrcInfoList() {
		return SrcInfoList;
	}

	public void setSrcInfoList(java.util.Collection<SrcInfo> srcInfoList) {
		if (srcInfoList != null) {
			SrcInfoList = new com.ksc.internal.SdkInternalList<SrcInfo>(srcInfoList);
		}
	}

	public void addSrc(SrcInfo... scrinfos) {
		if (SrcInfoList == null) {
			SrcInfoList = new com.ksc.internal.SdkInternalList<SrcInfo>();
		}
		for (SrcInfo srcInfo : scrinfos) {
			SrcInfoList.add(srcInfo);
		}
	}

}
