package com.ksc.ket.model;

public class StartLoopResult {
	private Integer ErrNum;
	private String ErrMsg;
	private com.ksc.internal.SdkInternalList<StartLoopList> startLoopList;
	private com.ksc.internal.SdkInternalList<FilePathList> ErrFilePath;

	public void setStartLoopList(java.util.Collection<StartLoopList> startLoopList) {
		if (startLoopList != null) {
			this.startLoopList = new com.ksc.internal.SdkInternalList<StartLoopList>(startLoopList);
		}
	}

	public void addStartLoopList(StartLoopList... startLoopLists) {
		if (this.startLoopList == null) {
			this.startLoopList = new com.ksc.internal.SdkInternalList<StartLoopList>();
		}
		for (StartLoopList startLoopList : startLoopLists) {
			this.startLoopList.add(startLoopList);
		}
	}

	public void setErrFilePath(java.util.Collection<FilePathList> errFilePath) {
		if (errFilePath != null) {
			this.ErrFilePath = new com.ksc.internal.SdkInternalList<FilePathList>(errFilePath);
		}
	}

	public void addErrFilePath(FilePathList... errFilePaths) {
		if (this.ErrFilePath == null) {
			this.ErrFilePath = new com.ksc.internal.SdkInternalList<FilePathList>();
		}
		for (FilePathList errFilePath : errFilePaths) {
			this.ErrFilePath.add(errFilePath);
		}
	}

	public Integer getErrNum() {
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

	public com.ksc.internal.SdkInternalList<StartLoopList> getList() {
		return startLoopList;
	}

	public com.ksc.internal.SdkInternalList<FilePathList>getErrFilePath() {
		return ErrFilePath;
	}

	public void setStartLoopList(com.ksc.internal.SdkInternalList<StartLoopList> startLoopList) {
		this.startLoopList = startLoopList;
	}

}
