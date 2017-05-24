package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ModifyInstanceImageRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyInstanceImageRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<ModifyInstanceImageRequest>{

	private static final long serialVersionUID = 1L;
	private String InstanceId;
	private String ImageId;
	private String InstancePassword;
	
	@Override
	public Request<ModifyInstanceImageRequest> getDryRunRequest() {
	    	
	    Request<ModifyInstanceImageRequest> request = new ModifyInstanceImageRequestMarshaller().marshall(this);
	    request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getImageId() {
		return ImageId;
	}
	public void setImageId(String imageId) {
		ImageId = imageId;
	}
	public String getInstancePassword() {
		return InstancePassword;
	}
	public void setInstancePassword(String instancePassword) {
		InstancePassword = instancePassword;
	}
	
}
