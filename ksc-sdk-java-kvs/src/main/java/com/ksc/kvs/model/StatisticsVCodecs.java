package com.ksc.kvs.model;

public class StatisticsVCodecs {
	private String VCodec;
	private int Duration;
	private com.ksc.internal.SdkInternalList<StatisticsResolutions> Resolutions;

	public String getVCodec() {
		return VCodec;
	}

	public void setVCodec(String vCodec) {
		VCodec = vCodec;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public com.ksc.internal.SdkInternalList<StatisticsResolutions> getResolutions() {
		return Resolutions;
	}

	public void setResolutions(java.util.Collection<StatisticsResolutions> resolutions) {
		if (resolutions != null){
			Resolutions = new com.ksc.internal.SdkInternalList<StatisticsResolutions>(resolutions);
		}
	}
	public void addResolutions(StatisticsResolutions... resolutions) {
		if (Resolutions == null) {
			Resolutions = new com.ksc.internal.SdkInternalList<StatisticsResolutions>();
		}
		for (StatisticsResolutions resolution : resolutions) {
			Resolutions.add(resolution);
		}
	}

}
