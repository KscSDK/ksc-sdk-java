package com.ksc.network.vpc.model.subnet;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.subnet.ModifySubnetRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifySubnet.
 * </p>
 */
public class ModifySubnetRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifySubnetRequest> {

    /**
     * 子网的ID
     */
    private String SubnetId;
    /**
     * 子网的名称
     */
    private String SubnetName;
	/**
	 * 子网的Dns1
	 */
	private String Dns1;
	/**
	 * 子网的Dns2
	 */
	private String Dns2;

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}

	public String getSubnetName() {
		return SubnetName;
	}

	public void setSubnetName(String subnetName) {
		SubnetName = subnetName;
	}

	public String getDns1() {
		return Dns1;
	}

	public void setDns1(String dns1) {
		Dns1 = dns1;
	}

	public String getDns2() {
		return Dns2;
	}

	public void setDns2(String dns2) {
		Dns2 = dns2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ModifySubnetRequest that = (ModifySubnetRequest) o;

		if (!SubnetId.equals(that.SubnetId)) return false;
		if (!SubnetName.equals(that.SubnetName)) return false;
		if (!Dns1.equals(that.Dns1)) return false;
		return Dns2.equals(that.Dns2);
	}

	@Override
	public int hashCode() {
		int result = SubnetId.hashCode();
		result = 31 * result + SubnetName.hashCode();
		result = 31 * result + Dns1.hashCode();
		result = 31 * result + Dns2.hashCode();
		return result;
	}

	@Override
    public ModifySubnetRequest clone() {
        return (ModifySubnetRequest) super.clone();
    }

    @Override
    public Request<ModifySubnetRequest> getDryRunRequest() {
        Request<ModifySubnetRequest> request = new ModifySubnetRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}