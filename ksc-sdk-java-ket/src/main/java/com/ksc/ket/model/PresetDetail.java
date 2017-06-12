package com.ksc.ket.model;

public class PresetDetail {
	private String preset;
	private String app;
	private String description;
	private String createTime;
	private String updateTime;
	private com.ksc.internal.SdkInternalList<Output> outputList;
	private Video video;
	private Audio audio;
	private HlsMbr hlsMbr;
	private Integer intelligentSwitch;
	private String intelligentCburl;

	public void setOutputList(java.util.Collection<Output> outputList) {
		if (outputList != null) {
			this.outputList = new com.ksc.internal.SdkInternalList<Output>(outputList);
		}
	}

	public void addOutputList(Output... ouputs) {
		if (this.outputList == null) {
			this.outputList = new com.ksc.internal.SdkInternalList<Output>();
		}
		for (Output output : ouputs) {
			this.outputList.add(output);
		}
	}

	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public HlsMbr getHlsMbr() {
		return hlsMbr;
	}

	public void setHlsMbr(HlsMbr hlsMbr) {
		this.hlsMbr = hlsMbr;
	}

	public com.ksc.internal.SdkInternalList<Output> getOutputList() {
		return outputList;
	}

	public void setOutputList(com.ksc.internal.SdkInternalList<Output> outputList) {
		this.outputList = outputList;
	}

	public Integer getIntelligentSwitch() {
		return intelligentSwitch;
	}

	public void setIntelligentSwitch(Integer intelligentSwitch) {
		this.intelligentSwitch = intelligentSwitch;
	}

	public String getIntelligentCburl() {
		return intelligentCburl;
	}

	public void setIntelligentCburl(String intelligentCburl) {
		this.intelligentCburl = intelligentCburl;
	}
}
