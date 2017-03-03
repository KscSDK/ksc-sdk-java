package com.ksc.kvs.model;

public class GetPresetDetailResult {
	private int ErrNum;
	private String ErrMsg;
	
	private DetailPreset PresetDetail;

	public int getErrNum() {
		return ErrNum;
	}

	public void setErrNum(int errNum) {
		ErrNum = errNum;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}

	public DetailPreset getPresetDetail() {
		return PresetDetail;
	}

	public void setPresetDetail(DetailPreset presetDetail) {
		PresetDetail = presetDetail;
	}


}
