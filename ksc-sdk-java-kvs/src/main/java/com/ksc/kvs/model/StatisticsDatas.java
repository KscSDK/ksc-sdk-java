package com.ksc.kvs.model;

public class StatisticsDatas {
	private String TimeStamp;
	private int Duration;
	private int Number;
	private com.ksc.internal.SdkInternalList<StatisticsVCodecs> VCodecs;
	private com.ksc.internal.SdkInternalList<StatisticsTypes> Types;

	public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public com.ksc.internal.SdkInternalList<StatisticsVCodecs> getVCodecs() {
		return VCodecs;
	}

	public void setVCodecs(java.util.Collection<StatisticsVCodecs> vCodecs) {
		if (vCodecs != null) {
			VCodecs = new com.ksc.internal.SdkInternalList<StatisticsVCodecs>(vCodecs);
		}
	}

	public void addVCodecs(StatisticsVCodecs... vCodecs) {
		if (VCodecs == null) {
			VCodecs = new com.ksc.internal.SdkInternalList<StatisticsVCodecs>();
		}
		for (StatisticsVCodecs vCodec : vCodecs) {
			VCodecs.add(vCodec);
		}
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public com.ksc.internal.SdkInternalList<StatisticsTypes> getTypes() {
		return Types;
	}

	public void setTypes(java.util.Collection<StatisticsTypes> types) {
		if (types != null) {
			Types = new com.ksc.internal.SdkInternalList<StatisticsTypes>(types);
		}
	}

	public void addTypes(StatisticsTypes... types) {
		if (Types == null) {
			Types = new com.ksc.internal.SdkInternalList<StatisticsTypes>();
		}
		for (StatisticsTypes type : types) {
			Types.add(type);
		}
	}
}
