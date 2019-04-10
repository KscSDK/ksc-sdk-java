package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ImageCopyResult.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class ImageCopyResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -4895893764015706216L;

	private String RequestId;
	private Boolean Return;
	private String Message;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public Boolean getReturn() {
		return Return;
	}

	public void setReturn(Boolean aReturn) {
		Return = aReturn;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public ImageCopyResult clone() {
		try {
			return (ImageCopyResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}