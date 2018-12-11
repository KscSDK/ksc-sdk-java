package com.ksc.ket.model;

public class QueryDirectorTaskResult {
	private String preset = "";
	private String taskStatus = "";
	private String errMsg = "";
	private int errNum;
	private com.ksc.internal.SdkInternalList<SrcInfo> srcInfo;
	private com.ksc.internal.SdkInternalList<DstInfo> dstInfo;
	private com.ksc.internal.SdkInternalList<Output> output;

	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
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

	public void setSrcInfo(java.util.Collection<SrcInfo> srcInfo) {
		if (srcInfo != null) {
			this.srcInfo = new com.ksc.internal.SdkInternalList<SrcInfo>(srcInfo);
		}
	}

	public void addSrcInfo(SrcInfo... srcInfos) {
		if (this.srcInfo == null) {
			this.srcInfo = new com.ksc.internal.SdkInternalList<SrcInfo>();
		}
		for (SrcInfo srcInfo : srcInfos) {
			this.srcInfo.add(srcInfo);
		}
	}

	public com.ksc.internal.SdkInternalList<SrcInfo> getSrcInfo() {
		return srcInfo;
	}

	public void setSrcInfo(com.ksc.internal.SdkInternalList<SrcInfo> srcInfo) {
		this.srcInfo = srcInfo;
	}

	public void setDstInfo(java.util.Collection<DstInfo> dstInfo) {
		if (dstInfo != null) {
			this.dstInfo = new com.ksc.internal.SdkInternalList<DstInfo>(dstInfo);
		}
	}

	public void addSrcInfo(DstInfo... dstInfos) {
		if (this.dstInfo == null) {
			this.dstInfo = new com.ksc.internal.SdkInternalList<DstInfo>();
		}
		for (DstInfo dstInfo : dstInfos) {
			this.dstInfo.add(dstInfo);
		}
	}

	public com.ksc.internal.SdkInternalList<DstInfo> getDstInfo() {
		return dstInfo;
	}

	public void setDstInfo(com.ksc.internal.SdkInternalList<DstInfo> dstInfo) {
		this.dstInfo = dstInfo;
	}

	public void setOutput(java.util.Collection<Output> output) {
		if (output != null) {
			this.output = new com.ksc.internal.SdkInternalList<Output>(output);
		}
	}

	public void addOutput(Output... outputs) {
		if (this.output == null) {
			this.output = new com.ksc.internal.SdkInternalList<Output>();
		}
		for (Output output : outputs) {
			this.output.add(output);
		}
	}

	public com.ksc.internal.SdkInternalList<Output> getOutput() {
		return output;
	}

	public void setOutput(com.ksc.internal.SdkInternalList<Output> output) {
		this.output = output;
	}

}
