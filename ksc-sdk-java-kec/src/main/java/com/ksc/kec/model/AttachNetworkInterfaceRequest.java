package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.AttachNetworkInterfaceRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class AttachNetworkInterfaceRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<AttachNetworkInterfaceRequest>{
	
	private static final long serialVersionUID = 1L;
	private String InstanceId;
	private String SubnetId;
	private String PrivateIpAddress;
	private com.ksc.internal.SdkInternalList<String> securityGroupIds;
	
	public void withSecurityGroupIds(String... securityGroupIds) {
		if (this.securityGroupIds == null) {
			setSecurityGroupIds(new com.ksc.internal.SdkInternalList<String>());
		}
		for (String ele : securityGroupIds) {
			this.securityGroupIds.add(ele);
		}
	}
	@Override
	public Request<AttachNetworkInterfaceRequest> getDryRunRequest() {
		Request<AttachNetworkInterfaceRequest> request = new AttachNetworkInterfaceRequestMarshaller()
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
	public String getSubnetId() {
		return SubnetId;
	}
	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}
	public String getPrivateIpAddress() {
		return PrivateIpAddress;
	}
	public void setPrivateIpAddress(String privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}
	public com.ksc.internal.SdkInternalList<String> getSecurityGroupIds() {
		return securityGroupIds;
	}
	public void setSecurityGroupIds(com.ksc.internal.SdkInternalList<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}
	
}
