package com.ksc.ket.model;

public class SrcInfo {
	private String SrcUrl = "";
	private String UniqName = "";
	private String App = "";
	private String StreamID = "";
	private String Bucket = "";
	private String ObjectKey = "";
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

	public String getBucket() {
		return Bucket;
	}

	public void setBucket(String bucket) {
		Bucket = bucket;
	}

	public String getObjectKey() {
		return ObjectKey;
	}

	public void setObjectKey(String objectKey) {
		ObjectKey = objectKey;
	}

	public String getStreamID() {
		return StreamID;
	}

	public void setStreamID(String streamID) {
		StreamID = streamID;
	}

	public int getIndex() {
		return Index;
	}

	public void setIndex(int index) {
		Index = index;
	}

	public String getSrcUrl() {
		return SrcUrl;
	}

	public void setSrcUrl(String srcUrl) {
		SrcUrl = srcUrl;
	}

}
