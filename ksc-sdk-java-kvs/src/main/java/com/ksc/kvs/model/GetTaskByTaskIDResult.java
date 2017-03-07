package com.ksc.kvs.model;

public class GetTaskByTaskIDResult {
	private String ErrMsg;
	private int ErrNum;
	private TaskInfo TaskInfo;
	

	public TaskInfo getTaskInfo() {
		return TaskInfo;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}

	public int getErrNum() {
		return ErrNum;
	}

	public void setErrNum(int errNum) {
		ErrNum = errNum;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		TaskInfo = taskInfo;
	}

}
