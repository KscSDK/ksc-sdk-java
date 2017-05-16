package com.ksc.network.eip.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.eip.model.transform.AllocateAddressRequestMarshaller;
import com.ksc.network.eip.model.transform.AssociateAddressRequestMarshaller;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.transform.SecurityGroups.AuthorizeSecurityGroupEntryRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.CreateSecurityGroupRequestMarshaller;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;
import com.ksc.network.vpc.transform.vpc.DescribeVpcsRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AuthorizeSecurityGroupEntry.
 * </p>
 */
public class AssociateAddressRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociateAddressRequest> {


    /**
     * 弹性IP的ID
     */
    private String AllocationId;

    /**
     * 绑定弹性IP的实例类型，IP映射(Ipfwd)，负载均衡（Slb）
     */
    private String InstanceType;
    
    /**
     * 弹性IP绑定的实例信息。绑定类型为IP映射（Ipfwd）时，InstanceId是服务器的ID。绑定类型为负载均衡(Slb)时，InstanceId是负载均衡的ID。
     */
    private String InstanceId;
    
    /**
     * 网络接口的标识，绑定类型为IP映射（Ipfwd）时，不可缺省。绑定类型为负载均衡(Slb)时，可缺省。
     */
    private String NetworkInterfaceId;
    
    
	public String getAllocationId() {
		return AllocationId;
	}

	public void setAllocationId(String allocationId) {
		AllocationId = allocationId;
	}

	public String getInstanceType() {
		return InstanceType;
	}

	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((AllocationId == null) ? 0 : AllocationId.hashCode());
		result = prime * result
				+ ((InstanceId == null) ? 0 : InstanceId.hashCode());
		result = prime * result
				+ ((InstanceType == null) ? 0 : InstanceType.hashCode());
		result = prime
				* result
				+ ((NetworkInterfaceId == null) ? 0 : NetworkInterfaceId
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssociateAddressRequest other = (AssociateAddressRequest) obj;
		if (AllocationId == null) {
			if (other.AllocationId != null)
				return false;
		} else if (!AllocationId.equals(other.AllocationId))
			return false;
		if (InstanceId == null) {
			if (other.InstanceId != null)
				return false;
		} else if (!InstanceId.equals(other.InstanceId))
			return false;
		if (InstanceType == null) {
			if (other.InstanceType != null)
				return false;
		} else if (!InstanceType.equals(other.InstanceType))
			return false;
		if (NetworkInterfaceId == null) {
			if (other.NetworkInterfaceId != null)
				return false;
		} else if (!NetworkInterfaceId.equals(other.NetworkInterfaceId))
			return false;
		return true;
	}

	@Override
    public AssociateAddressRequest clone() {
        return (AssociateAddressRequest) super.clone();
    }
	
    @Override
    public Request<AssociateAddressRequest> getDryRunRequest() {
        Request<AssociateAddressRequest> request = new AssociateAddressRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}