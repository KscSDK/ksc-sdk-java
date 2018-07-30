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

	private Boolean IsNpe;

	private String UserCategory;

	private String SysDisk;

	private String Progress;

	private String ImageSource;

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

	public Boolean getIsNpe() {
		return IsNpe;
	}

	public void setIsNpe(Boolean isNpe) {
		IsNpe = isNpe;
	}

	public String getUserCategory() {
		return UserCategory;
	}

	public void setUserCategory(String userCategory) {
		UserCategory = userCategory;
	}

	public String getSysDisk() {
		return SysDisk;
	}

	public void setSysDisk(String sysDisk) {
		SysDisk = sysDisk;
	}

	public String getProgress() {
		return Progress;
	}

	public void setProgress(String progress) {
		Progress = progress;
	}

	public String getImageSource() {
		return ImageSource;
	}

	public void setImageSource(String imageSource) {
		ImageSource = imageSource;
	}
}
