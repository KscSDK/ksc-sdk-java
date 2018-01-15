package com.ksc.offline.model;

public class OfflineResult {
	private int errNum;
	private String errMsg;
	private com.ksc.internal.SdkInternalList<Preset> PresetList;

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

	public com.ksc.internal.SdkInternalList<Preset> getPresetList() {
		return PresetList;
	}

	public void setPresetList(java.util.Collection<Preset> presetList) {
		if (presetList != null) {
			PresetList = new com.ksc.internal.SdkInternalList<Preset>(presetList);
		}
	}

	public void addPreset(Preset... presets) {
		if (PresetList == null) {
			PresetList = new com.ksc.internal.SdkInternalList<Preset>();
		}
		for (Preset preset : presets) {
			PresetList.add(preset);
		}
	}

}
