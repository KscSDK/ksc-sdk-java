package com.ksc.ket.model;

public class GetPresetListResult {
	private Integer ErrNum;
	private String ErrMsg;
	private com.ksc.internal.SdkInternalList<PresetList> presetList;

	public void setPresetList(java.util.Collection<PresetList> presetList) {
		if (presetList != null) {
			this.presetList = new com.ksc.internal.SdkInternalList<PresetList>(presetList);
		}
	}

	public void addPresetList(PresetList... presetLists) {
		if (this.presetList == null) {
			this.presetList = new com.ksc.internal.SdkInternalList<PresetList>();
		}
		for (PresetList presetList : presetLists) {
			this.presetList.add(presetList);
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

	public com.ksc.internal.SdkInternalList<PresetList> getPresetList() {
		return presetList;
	}

	public void setPresetList(com.ksc.internal.SdkInternalList<PresetList> presetList) {
		this.presetList = presetList;
	}

}
