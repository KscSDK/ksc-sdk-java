package com.ksc.ket.model;

public class Video {
	private int orientationAdapt;
	private com.ksc.internal.SdkInternalList<Logo> logoList;

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

}
