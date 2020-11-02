package com.ksc.kec.model;

import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Contains the output of ImageImportResult.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class ImageImportResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706216L;

	private String RequestId;
	private String ImageId;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	@Override
	public ImageImportResult clone() {
		try {
			return (ImageImportResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}