package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ModifyInstanceTypeRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyInstanceTypeRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<ModifyInstanceTypeRequest>{
	
	private static final long serialVersionUID = 1L;
	private String InstanceId;
	private String InstanceType;
	private Integer DataDiskGb;
	
	@Override
	public Request<ModifyInstanceTypeRequest> getDryRunRequest() {
		Request<ModifyInstanceTypeRequest> request = new ModifyInstanceTypeRequestMarshaller()
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
	public String getInstanceType() {
		return InstanceType;
	}
	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}
	public Integer getDataDiskGb() {
		return DataDiskGb;
	}
	public void setDataDiskGb(Integer dataDiskGb) {
		DataDiskGb = dataDiskGb;
	}

}
