package com.ksc.ket.model;

public class ErrResult {
	private Integer ErrNum;
	private String ErrMsg;
	private String TaskID;

	public int getErrNum() {
		return ErrNum;
	}

	public void setErrNum(Integer errNum) {
		ErrNum = errNum;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

}
