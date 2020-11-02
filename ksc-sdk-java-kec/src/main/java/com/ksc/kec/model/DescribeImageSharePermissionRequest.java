package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.internal.SdkInternalList;
import com.ksc.kec.model.transform.DescribeImageSharePermissionMarshaller;
import com.ksc.kec.model.transform.ImageCopyRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeImageSharePermissionRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeImageSharePermissionRequest>{

	private static final long serialVersionUID = 1L;
	/**
	 * <p>
	 * 共享镜像镜像id
	 * 是否可缺省: 否
	 * </p>
	 */
	private String ImageId;

	@Override
	public Request<DescribeImageSharePermissionRequest> getDryRunRequest() {
		Request<DescribeImageSharePermissionRequest> request = new DescribeImageSharePermissionMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }
}
