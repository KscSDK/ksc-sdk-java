package com.ksc.ket.model;

public class Output {
	private Format format;
	private Switch _switch;
	private int index;
	private Video video;
	private Audio audio;
	private com.ksc.internal.SdkInternalList<Overlay> overlay;
	private com.ksc.internal.SdkInternalList<Amix> amix;

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public Switch getSwitch() {
		return _switch;
	}

	public void setSwitch(Switch _switch) {
		this._switch = _switch;
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

	public void setOverlay(java.util.Collection<Overlay> overlay) {
		if (overlay != null) {
			this.overlay = new com.ksc.internal.SdkInternalList<Overlay>(overlay);
		}
	}

	public void addOverlay(Overlay... overlays) {
		if (this.overlay == null) {
			this.overlay = new com.ksc.internal.SdkInternalList<Overlay>();
		}
		for (Overlay overlay : overlays) {
			this.overlay.add(overlay);
		}
	}

	public com.ksc.internal.SdkInternalList<Overlay> getOverlay() {
		return overlay;
	}

	public void setOverlay(com.ksc.internal.SdkInternalList<Overlay> overlay) {
		this.overlay = overlay;
	}

	public void setAmix(java.util.Collection<Amix> amix) {
		if (amix != null) {
			this.amix = new com.ksc.internal.SdkInternalList<Amix>(amix);
		}
	}

	public void addAmix(Amix... amixs) {
		if (this.amix == null) {
			this.amix = new com.ksc.internal.SdkInternalList<Amix>();
		}
		for (Amix amix : amixs) {
			this.amix.add(amix);
		}
	}

	public com.ksc.internal.SdkInternalList<Amix> getAmix() {
		return amix;
	}

	public void setAmix(com.ksc.internal.SdkInternalList<Amix> amix) {
		this.amix = amix;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
