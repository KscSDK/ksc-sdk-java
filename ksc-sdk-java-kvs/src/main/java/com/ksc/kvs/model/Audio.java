package com.ksc.kvs.model;

public class Audio {
	private String ar;
	private String ab;
	private String acodec;
	private int an;
	private String profile;
	private int aacheCompatible;
	private String resampler;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public int getAacheCompatible() {
		return aacheCompatible;
	}

	public void setAacheCompatible(int aacheCompatible) {
		this.aacheCompatible = aacheCompatible;
	}

	public String getResampler() {
		return resampler;
	}

	public void setResampler(String resampler) {
		this.resampler = resampler;
	}

	// avm3u8
	private int channels;

	public String getAr() {
		return ar;
	}

	public void setAr(String ar) {
		this.ar = ar;
	}

	public String getAb() {
		return ab;
	}

	public void setAb(String ab) {
		this.ab = ab;
	}

	public String getAcodec() {
		return acodec;
	}

	public void setAcodec(String acodec) {
		this.acodec = acodec;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public int getChannels() {
		return channels;
	}

	public void setChannels(int channels) {
		this.channels = channels;
	}

}
