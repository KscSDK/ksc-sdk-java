package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class Image {
	private String ImageId;
	
	private String Name;

	private String ImageState;

	private String CreationDate;

	private String Platform;

	private Boolean IsPublic;

	private String InstanceId;

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getImageState() {
		return ImageState;
	}

	public void setImageState(String imageState) {
		ImageState = imageState;
	}

	public String getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}

	public String getPlatform() {
		return Platform;
	}

	public void setPlatform(String platform) {
		Platform = platform;
	}

	public Boolean getIsPublic() {
		return IsPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		IsPublic = isPublic;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	
}
