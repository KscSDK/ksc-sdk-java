package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.CreateImageRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class CreateImageRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<CreateImageRequest>{
	
	private static final long serialVersionUID = 1L;

	private String InstanceId;
	
	private String Name;
	
    @Override
	public Request<CreateImageRequest> getDryRunRequest() {
    	
    	Request<CreateImageRequest> request = new CreateImageRequestMarshaller().marshall(this);
    	request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}


	public String getInstanceId() {
		return InstanceId;
	}


	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

}
