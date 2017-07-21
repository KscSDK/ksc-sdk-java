package com.ksc.kvs.model;

public class QueryPipelineResult {
	private int ErrNum;
	private int Quota;
	private int RegularDuration;
	private String ErrMsg;
	private String Description;
	private String State;
	private String RegularStart;
	private TaskStatus taskStatus;

	public int getErrNum() {
		return ErrNum;
	}

	public void setErrNum(int errNum) {
		ErrNum = errNum;
	}

	public int getQuota() {
		return Quota;
	}

	public void setQuota(int quota) {
		Quota = quota;
	}

	public int getRegularDuration() {
		return RegularDuration;
	}

	public void setRegularDuration(int regularDuration) {
		RegularDuration = regularDuration;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getRegularStart() {
		return RegularStart;
	}

	public void setRegularStart(String regularStart) {
		RegularStart = regularStart;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

}
