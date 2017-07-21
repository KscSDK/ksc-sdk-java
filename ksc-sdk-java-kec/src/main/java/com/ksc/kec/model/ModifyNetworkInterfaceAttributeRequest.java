package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ModifyNetworkInterfaceAttributeRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyNetworkInterfaceAttributeRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<ModifyNetworkInterfaceAttributeRequest>{
	
	private static final long serialVersionUID = 1L;
	private String InstanceId;
	private String NetworkInterfaceId;
	private String SubnetId;
	private String PrivateIpAddress;
	private String DNS1;
	private String DNS2;
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
	public Request<ModifyNetworkInterfaceAttributeRequest> getDryRunRequest() {
		Request<ModifyNetworkInterfaceAttributeRequest> request = new ModifyNetworkInterfaceAttributeRequestMarshaller()
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
	public String getDNS1() {
		return DNS1;
	}
	public void setDNS1(String dNS1) {
		DNS1 = dNS1;
	}
	public String getDNS2() {
		return DNS2;
	}
	public void setDNS2(String dNS2) {
		DNS2 = dNS2;
	}
	public com.ksc.internal.SdkInternalList<String> getSecurityGroupIds() {
		return securityGroupIds;
	}
	public void setSecurityGroupIds(com.ksc.internal.SdkInternalList<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}
	
}
