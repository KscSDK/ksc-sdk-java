package com.ksc.kvs.model;

public class TaskInfo {
	private String TaskID;
	private String Preset;
	private String DstBucket;
	private String DstDir;
	private String DstObjectKey;
	private String TaskStatus;
	private String IsTop;
	private String CreateTime;
	private com.ksc.internal.SdkInternalList<SrcInfo> SrcInfoList;
	
	private String DstAcl;
	private String CbUrl;
	private String CbMethod;
	private String ExtParam;
	private String ErrorMsg;
	private String ErrorCode;

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

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

	public String getPreset() {
		return Preset;
	}

	public void setPreset(String preset) {
		Preset = preset;
	}

	public String getDstBucket() {
		return DstBucket;
	}

	public void setDstBucket(String dstBucket) {
		DstBucket = dstBucket;
	}

	public String getDstDir() {
		return DstDir;
	}

	public void setDstDir(String dstDir) {
		DstDir = dstDir;
	}

	public String getDstObjectKey() {
		return DstObjectKey;
	}

	public void setDstObjectKey(String dstObjectKey) {
		DstObjectKey = dstObjectKey;
	}

	public String getTaskStatus() {
		return TaskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		TaskStatus = taskStatus;
	}

	public String getIsTop() {
		return IsTop;
	}

	public void setIsTop(String isTop) {
		IsTop = isTop;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getDstAcl() {
		return DstAcl;
	}

	public void setDstAcl(String dstAcl) {
		DstAcl = dstAcl;
	}

	public String getCbUrl() {
		return CbUrl;
	}

	public void setCbUrl(String cbUrl) {
		CbUrl = cbUrl;
	}

	public String getCbMethod() {
		return CbMethod;
	}

	public void setCbMethod(String cbMethod) {
		CbMethod = cbMethod;
	}

	public String getExtParam() {
		return ExtParam;
	}

	public void setExtParam(String extParam) {
		ExtParam = extParam;
	}

	public String getErrorMsg() {
		return ErrorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}

	public String getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}

	public void setSrcInfoList(com.ksc.internal.SdkInternalList<SrcInfo> srcInfoList) {
		SrcInfoList = srcInfoList;
	}

	
}
