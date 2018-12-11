package com.ksc.ket.model;

public class TaskParam {
	private String data;
	private String uniqName;
	private String app;
	private String streamID;
	private String taskID;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTaskID() {
		return taskID;
	}

	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}

	public String getUniqName() {
		return uniqName;
	}

	public void setUniqName(String uniqName) {
		this.uniqName = uniqName;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getStreamID() {
		return streamID;
	}

	public void setStreamID(String streamID) {
		this.streamID = streamID;
	}

}