package com.ksc.kvs.model;

public class GetScreenshotNumberResult {
	private int ErrNum;
	private String ErrMsg;
	private String StartUnixTime;
	private String EndUnixTime;
	private String Granularity;
	private com.ksc.internal.SdkInternalList<StatisticsDatas> Datas;

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

	public String getStartUnixTime() {
		return StartUnixTime;
	}

	public void setStartUnixTime(String startUnixTime) {
		StartUnixTime = startUnixTime;
	}

	public String getEndUnixTime() {
		return EndUnixTime;
	}

	public void setEndUnixTime(String endUnixTime) {
		EndUnixTime = endUnixTime;
	}

	public String getGranularity() {
		return Granularity;
	}

	public void setGranularity(String granularity) {
		Granularity = granularity;
	}

	public com.ksc.internal.SdkInternalList<StatisticsDatas> getDatas() {
		return Datas;
	}

	public void setDatas(java.util.Collection<StatisticsDatas> datas) {
		if (datas != null) {
			datas = new com.ksc.internal.SdkInternalList<StatisticsDatas>(datas);
		}
	}

	public void addDatas(StatisticsDatas... datas) {
		if (Datas == null) {
			Datas = new com.ksc.internal.SdkInternalList<StatisticsDatas>();
		}
		for (StatisticsDatas data : datas) {
			Datas.add(data);
		}
	}
}
