package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DetachNetworkInterfaceRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DetachNetworkInterfaceRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DetachNetworkInterfaceRequest>{

	private static final long serialVersionUID = 1L;
	private String InstanceId;
	private String NetworkInterfaceId;
	
	@Override
	public Request<DetachNetworkInterfaceRequest> getDryRunRequest() {
		Request<DetachNetworkInterfaceRequest> request = new DetachNetworkInterfaceRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getNetworkInterfaceId() {
		return NetworkInterfaceId;
	}
	public void setNetworkInterfaceId(String networkInterfaceId) {
		NetworkInterfaceId = networkInterfaceId;
	}
	
}
