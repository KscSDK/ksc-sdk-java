package com.ksc.ket.model;

public class GetLoopList {
	private String outputFormat = "";
	private com.ksc.internal.SdkInternalList<LoopSrcInfo> srcInfo;
	private String app = "";
	private String pubDomain = "";
	private String preset = "";
	private String continueHour = "";
	private String taskID = "";
	private String streamID = "";
	private String createTime = "";

	public void setSrcInfo(java.util.Collection<LoopSrcInfo> srcInfo) {
		if (srcInfo != null) {
			this.srcInfo = new com.ksc.internal.SdkInternalList<LoopSrcInfo>(srcInfo);
		}
	}

	public void addSrcInfo(LoopSrcInfo... srcInfos) {
		if (this.srcInfo == null) {
			this.srcInfo = new com.ksc.internal.SdkInternalList<LoopSrcInfo>();
		}
		for (LoopSrcInfo srcInfo : srcInfos) {
			this.srcInfo.add(srcInfo);
		}
	}

	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}

	public com.ksc.internal.SdkInternalList<LoopSrcInfo> getSrcInfo() {
		return srcInfo;
	}

	public void setSrcInfo(com.ksc.internal.SdkInternalList<LoopSrcInfo> srcInfo) {
		this.srcInfo = srcInfo;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getPubDomain() {
		return pubDomain;
	}

	public void setPubDomain(String pubDomain) {
		this.pubDomain = pubDomain;
	}

	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

	public String getContinueHour() {
		return continueHour;
	}

	public void setContinueHour(String continueHour) {
		this.continueHour = continueHour;
	}

	public String getTaskID() {
		return taskID;
	}

	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}

	public String getStreamID() {
		return streamID;
	}

	public void setStreamID(String streamID) {
		this.streamID = streamID;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
