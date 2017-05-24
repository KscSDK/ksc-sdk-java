package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ModifyImageAttributeRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyImageAttributeRequest extends KscWebServiceRequest
             implements Serializable, Cloneable, DryRunSupportedRequest<ModifyImageAttributeRequest>{
	
	private static final long serialVersionUID = 1L;
	private String ImageId;
	private String Name;
	
	 @Override
		public Request<ModifyImageAttributeRequest> getDryRunRequest() {
	    	
	    	Request<ModifyImageAttributeRequest> request = new ModifyImageAttributeRequestMarshaller().marshall(this);
	    	request.addParameter("DryRun", Boolean.toString(true));
			return request;
		}
	
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
	
}
