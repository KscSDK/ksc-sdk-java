package com.ksc.offline.model;

public class ExtParam {
	private String ss;
	private int duration;
	private String hlsSegmentFilename;
	private String pattern;
	private String tsAcl;

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getHlsSegmentFilename() {
		return hlsSegmentFilename;
	}

	public void setHlsSegmentFilename(String hlsSegmentFilename) {
		this.hlsSegmentFilename = hlsSegmentFilename;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getTsAcl() {
		return tsAcl;
	}

	public void setTsAcl(String tsAcl) {
		this.tsAcl = tsAcl;
	}

}
