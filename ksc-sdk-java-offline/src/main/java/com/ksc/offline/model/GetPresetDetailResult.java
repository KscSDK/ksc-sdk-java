package com.ksc.offline.model;

public class GetPresetDetailResult {
	private int errNum;
	private String errMsg;
	
	private DetailPreset presetdetail;
	
	public DetailPreset getPresetdetail() {
		return presetdetail;
	}

	public void setPresetdetail(DetailPreset presetdetail) {
		this.presetdetail = presetdetail;
	}

	public int getErrNum() {
		return errNum;
	}

	public void setErrNum(int errNum) {
		this.errNum = errNum;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}


	
	
}
