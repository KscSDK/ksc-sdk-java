package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.RemoveImagesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class RemoveImagesRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<RemoveImagesRequest>{
	
	private static final long serialVersionUID = 1L;
	private String ImageId;

	@Override
	public Request<RemoveImagesRequest> getDryRunRequest() {
	    	
	    Request<RemoveImagesRequest> request = new RemoveImagesRequestMarshaller().marshall(this);
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
