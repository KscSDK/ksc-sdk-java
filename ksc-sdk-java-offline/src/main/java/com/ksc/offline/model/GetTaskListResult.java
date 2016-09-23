package com.ksc.offline.model;

public class GetTaskListResult {
	private String errMsg;
	private int errNum;
	private com.ksc.internal.SdkInternalList<TaskInfo> TaskInfoList;
	
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
	public com.ksc.internal.SdkInternalList<TaskInfo> getTaskInfoListt() {
		return TaskInfoList;
	}
	public void setTaskInfoList(java.util.Collection<TaskInfo> taskInfoList) {
		if (taskInfoList != null) {
			TaskInfoList = new com.ksc.internal.SdkInternalList<TaskInfo>(taskInfoList);
        }
	}
	
	public void addTask(TaskInfo... taskinfos){
		if (TaskInfoList == null) {
			TaskInfoList = new com.ksc.internal.SdkInternalList<TaskInfo>();
        }
		for(TaskInfo taskinfo:taskinfos){
			TaskInfoList.add(taskinfo);
		}
	}
	
	
}
