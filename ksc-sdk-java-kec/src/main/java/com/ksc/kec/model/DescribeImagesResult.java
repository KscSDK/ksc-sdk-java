package com.ksc.kec.model;

import java.util.List;

import com.ksc.internal.SdkInternalList;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeImages.
 * </p>
 */

@ToString
public class DescribeImagesResult {

	private String RequestId;

	private List<Image> ImagesSet = new SdkInternalList<Image>();

	public DescribeImagesResult withImageSet(Image... instances) {
		for (Image instance : instances) {
			this.ImagesSet.add(instance);
		}
		return this;
	}

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public List<Image> getImagesSet() {
		return ImagesSet;
	}

	public void setImagesSet(List<Image> imagesSet) {
		ImagesSet = imagesSet;
	}

}