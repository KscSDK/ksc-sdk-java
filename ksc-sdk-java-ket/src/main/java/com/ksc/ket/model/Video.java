package com.ksc.ket.model;

import java.util.List;

import com.ksc.internal.SdkInternalList;

public class Video {
	private int orientationAdapt;
	private String codec = "";
	private com.ksc.internal.SdkInternalList<Logo> logoList;
	private SdkInternalList<List<Logo>> multiImage;

	public void setMultiImage(java.util.Collection<List<Logo>> logosList) {
		if (logosList != null) {
			this.multiImage = new SdkInternalList<List<Logo>>(logosList);
		}
	}

	public void addMultiImage(SdkInternalList<Logo>... multiImage) {
		if (this.multiImage == null) {
			this.multiImage = new SdkInternalList<List<Logo>>();
		}
		for (SdkInternalList<Logo> logo : multiImage) {
			this.multiImage.add(logo);
		}
	}

	public int getOrientationAdapt() {
		return orientationAdapt;
	}

	public void setOrientationAdapt(int orientationAdapt) {
		this.orientationAdapt = orientationAdapt;
	}

	public com.ksc.internal.SdkInternalList<Logo> getLogoList() {
		return logoList;
	}

	public void setLogoList(java.util.Collection<Logo> logoList) {
		if (logoList != null) {
			this.logoList = new com.ksc.internal.SdkInternalList<Logo>(logoList);
		}
	}

	public void addLogoList(Logo... logos) {
		if (this.logoList == null) {
			this.logoList = new com.ksc.internal.SdkInternalList<Logo>();
		}
		for (Logo logo : logos) {
			this.logoList.add(logo);
		}
	}

	public void setLogoList(com.ksc.internal.SdkInternalList<Logo> logoList) {
		this.logoList = logoList;
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}

	public SdkInternalList<List<Logo>> getMultiImage() {
		return multiImage;
	}

	public void setMultiImage(SdkInternalList<List<Logo>> multiImage) {
		this.multiImage = multiImage;
	}

}
