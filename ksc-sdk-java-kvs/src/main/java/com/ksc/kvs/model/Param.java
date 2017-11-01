package com.ksc.kvs.model;

import java.util.List;

import com.ksc.internal.SdkInternalList;

public class Param {
	private String f;

	// avsample & avsnapshot
	private int width;
	private int height;
	private int shortSide;
	// avsample
	private int interval;
	private int spriteflag;
	private int spritew;
	private int spriteh;
	private Video video;
	private Audio audio;
	private int hlsTime;
	private int clearmeta;
	private int intelligentSwitch;
	private int autorotate;
	private int segment_time;
	private int start_segment_num;
	private int start_segment_time;
	private String segfile_acl;
	private String ss;
	// avlogo
	private List<Image> image;
	private SdkInternalList<List<Logo>> logos;
	// private List<List<Logo>> logos;

	public void setLogos(java.util.Collection<List<Logo>> logosList) {
		if (logosList != null) {
			this.logos = new SdkInternalList<List<Logo>>(logosList);
		}
	}

	public void addLogos(SdkInternalList<Logo>... logos) {
		if (this.logos == null) {
			this.logos = new SdkInternalList<List<Logo>>();
		}
		for (SdkInternalList<Logo> logo : logos) {
			this.logos.add(logo);
		}
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public int getHlsTime() {
		return hlsTime;
	}

	public void setHlsTime(int hlsTime) {
		this.hlsTime = hlsTime;
	}

	public int getClearmeta() {
		return clearmeta;
	}

	public void setClearmeta(int clearmeta) {
		this.clearmeta = clearmeta;
	}

	public int getShortSide() {
		return shortSide;
	}

	public void setShortSide(int shortSide) {
		this.shortSide = shortSide;
	}

	public int getIntelligentSwitch() {
		return intelligentSwitch;
	}

	public void setIntelligentSwitch(int intelligentSwitch) {
		this.intelligentSwitch = intelligentSwitch;
	}

	public int getAutorotate() {
		return autorotate;
	}

	public void setAutorotate(int autorotate) {
		this.autorotate = autorotate;
	}

	public int getSegment_time() {
		return segment_time;
	}

	public void setSegment_time(int segment_time) {
		this.segment_time = segment_time;
	}

	public int getStart_segment_num() {
		return start_segment_num;
	}

	public void setStart_segment_num(int start_segment_num) {
		this.start_segment_num = start_segment_num;
	}

	public int getStart_segment_time() {
		return start_segment_time;
	}

	public void setStart_segment_time(int start_segment_time) {
		this.start_segment_time = start_segment_time;
	}

	public String getSegfile_acl() {
		return segfile_acl;
	}

	public void setSegfile_acl(String segfile_acl) {
		this.segfile_acl = segfile_acl;
	}

	public List<List<Logo>> getLogos() {
		return logos;
	}

	public void setLogos(SdkInternalList<List<Logo>> logos) {
		this.logos = logos;
	}

	public int getSpriteflag() {
		return spriteflag;
	}

	public void setSpriteflag(int spriteflag) {
		this.spriteflag = spriteflag;
	}

	public int getSpritew() {
		return spritew;
	}

	public void setSpritew(int spritew) {
		this.spritew = spritew;
	}

	public int getSpriteh() {
		return spriteh;
	}

	public void setSpriteh(int spriteh) {
		this.spriteh = spriteh;
	}

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	// public List<List<Logo>> getLogos() {
	// return logos;
	// }
	//
	// public void setLogos(List<List<Logo>> logos) {
	// this.logos = logos;
	// }

}
