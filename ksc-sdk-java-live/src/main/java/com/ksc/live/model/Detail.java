package com.ksc.live.model;

public class Detail {
	private String pubdomain;
	private String clientip;
	private String app;
	private String streamname;
	private int pubtime;
	private int curfps;
	private int curbitrate;
	private int update_time;
	private float framelossrate;

	public String getPubdomain() {
		return pubdomain;
	}

	public String getClientip() {
		return clientip;
	}

	public String getApp() {
		return app;
	}

	public String getStreamname() {
		return streamname;
	}

	public int getPubtime() {
		return pubtime;
	}

	public int getCurfps() {
		return curfps;
	}

	public int getCurbitrate() {
		return curbitrate;
	}

	public int getUpdate_time() {
		return update_time;
	}

	public float getFramelossrate() {
		return framelossrate;
	}

	public void setPubdomain(String pubdomain) {
		this.pubdomain = pubdomain;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public void setStreamname(String streamname) {
		this.streamname = streamname;
	}

	public void setPubtime(int pubtime) {
		this.pubtime = pubtime;
	}

	public void setCurfps(int curfps) {
		this.curfps = curfps;
	}

	public void setCurbitrate(int curbitrate) {
		this.curbitrate = curbitrate;
	}

	public void setUpdate_time(int update_time) {
		this.update_time = update_time;
	}

	public void setFramelossrate(float framelossrate) {
		this.framelossrate = framelossrate;
	}
}
