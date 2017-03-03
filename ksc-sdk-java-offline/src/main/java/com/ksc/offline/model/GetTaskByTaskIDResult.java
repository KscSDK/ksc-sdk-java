package com.ksc.offline.model;

public class GetTaskByTaskIDResult {
	private String errMsg;
	private int errNum;
	private TaskInfo TaskInfo;

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public int getErrNum() {
		return errNum;
	}

	public void setErrNum(int errNum) {
		this.errNum = errNum;
	}

	public TaskInfo getTaskInfo() {
		return TaskInfo;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		TaskInfo = taskInfo;
	}

}
