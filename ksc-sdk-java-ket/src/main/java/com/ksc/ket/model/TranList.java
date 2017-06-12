package com.ksc.ket.model;

public class TranList {
	private String preset;
	private String OutputFormat;
	private String TaskID;
	private String TranStatus;
	private String StreamName;
	private String CreateTime;

	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

	public String getOutputFormat() {
		return OutputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		OutputFormat = outputFormat;
	}

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

	public String getTranStatus() {
		return TranStatus;
	}

	public void setTranStatus(String tranStatus) {
		TranStatus = tranStatus;
	}

	public String getStreamName() {
		return StreamName;
	}

	public void setStreamName(String streamName) {
		StreamName = streamName;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

}
