package com.ksc.offline.model;

public class GetTaskListResult {
	
	private String startdate;
	private String enddate;
	private int marker;
	private int count;
	private int total;
	private String errMsg;
	private int errNum;
	private com.ksc.internal.SdkInternalList<TaskInfo> TaskInfoList;
	
	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public int getMarker() {
		return marker;
	}

	public void setMarker(int marker) {
		this.marker = marker;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTaskInfoList(com.ksc.internal.SdkInternalList<TaskInfo> taskInfoList) {
		TaskInfoList = taskInfoList;
	}

	
	
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
	public com.ksc.internal.SdkInternalList<TaskInfo> getTaskInfoList() {
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
