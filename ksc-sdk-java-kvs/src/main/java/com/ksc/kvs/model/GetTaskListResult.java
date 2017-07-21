package com.ksc.kvs.model;

public class GetTaskListResult {

	private String StartDate;
	private String EndDate;
	private int Marker;
	private int Count;
	private int Total;
	private String ErrMsg;
	private int ErrNum;
	private com.ksc.internal.SdkInternalList<TaskInfo> TaskInfoList;

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public int getMarker() {
		return Marker;
	}

	public void setMarker(int marker) {
		Marker = marker;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
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

	public void setTaskInfoList(com.ksc.internal.SdkInternalList<TaskInfo> taskInfoList) {
		TaskInfoList = taskInfoList;
	}

	public com.ksc.internal.SdkInternalList<TaskInfo> getTaskInfoList() {
		return TaskInfoList;
	}

	public void setTaskInfoList(java.util.Collection<TaskInfo> taskInfoList) {
		if (taskInfoList != null) {
			TaskInfoList = new com.ksc.internal.SdkInternalList<TaskInfo>(taskInfoList);
		}
	}

	public void addTask(TaskInfo... taskinfos) {
		if (TaskInfoList == null) {
			TaskInfoList = new com.ksc.internal.SdkInternalList<TaskInfo>();
		}
		for (TaskInfo taskinfo : taskinfos) {
			TaskInfoList.add(taskinfo);
		}
	}

}
