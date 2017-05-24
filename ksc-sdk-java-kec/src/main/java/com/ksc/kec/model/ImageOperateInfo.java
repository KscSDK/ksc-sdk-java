package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class ImageOperateInfo {
	
	private String ImageId;
	private Boolean Return;
	
	public Boolean getReturn() {
		return Return;
	}
	public void setReturn(Boolean return1) {
		Return = return1;
	}
	public String getImageId() {
		return ImageId;
	}
	public void setImageId(String imageId) {
		ImageId = imageId;
	}
	
}
