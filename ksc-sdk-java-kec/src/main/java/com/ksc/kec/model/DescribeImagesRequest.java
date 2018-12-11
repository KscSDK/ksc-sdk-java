package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeImagesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.ToString;

@ToString
public class DescribeImagesRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<DescribeImagesRequest>{
	private String ImageId;

	private String ImageType;

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getImageType() {
		return ImageType;
	}

	public void setImageType(String imageType) {
		ImageType = imageType;
	}

	@Override
	public Request<DescribeImagesRequest> getDryRunRequest() {
		Request<DescribeImagesRequest> request = new DescribeImagesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
}
