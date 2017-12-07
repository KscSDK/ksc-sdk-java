package com.ksc.ket.model;

public class DstInfo {
	private String UniqName = "";
	private String App = "";
	private String StreamID = "";
	private String DstUrl = "";
	private int Mainly;
	private int Index;

	public String getUniqName() {
		return UniqName;
	}

	public void setUniqName(String uniqName) {
		UniqName = uniqName;
	}

	public String getApp() {
		return App;
	}

	public void setApp(String app) {
		App = app;
	}


	public int getMainly() {
		return Mainly;
	}

	public void setMainly(int mainly) {
		Mainly = mainly;
	}


	public String getStreamID() {
		return StreamID;
	}

	public void setStreamID(String streamID) {
		StreamID = streamID;
	}

	public String getDstUrl() {
		return DstUrl;
	}

	public void setDstUrl(String dstUrl) {
		DstUrl = dstUrl;
	}

	public int getIndex() {
		return Index;
	}

	public void setIndex(int index) {
		Index = index;
	}

}
