package com.ksc.ket.model;

public class GetPresetDetailResult {
	private Integer ErrNum;
	private String ErrMsg;
	private PresetDetail PresetDetail;

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

	public PresetDetail getPresetDetail() {
		return PresetDetail;
	}

	public void setPresetDetail(PresetDetail presetDetail) {
		PresetDetail = presetDetail;
	}

}
