package com.ksc.offline.model;

import java.util.List;

public class Param {
	private String f;

	// avsample & avsnapshot
	private int width;
	private int height;
	private int shortSide;
	// avsample
	private int interval;

	private Video video;
	private Audio audio;

	private int hlsTime;
	private int clearmeta;

	private int intelligentSwitch;

	// avlogo
	private List<Image> image;

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

}
