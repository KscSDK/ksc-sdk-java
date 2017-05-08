package com.ksc.network.vpc.model.vpc;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpc.ModifyVpcRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyVpc.
 * </p>
 */
public class ModifyVpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcRequest> {

    /**
     * Vpc的ID
     */
    private String VpcId;
    /**
     * Vpc的名称
     */
    private String VpcName;
    
    
    public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getVpcName() {
		return VpcName;
	}

	public void setVpcName(String vpcName) {
		VpcName = vpcName;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((VpcId == null) ? 0 : VpcId.hashCode());
		result = prime * result + ((VpcName == null) ? 0 : VpcName.hashCode());
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
		ModifyVpcRequest other = (ModifyVpcRequest) obj;
		if (VpcId == null) {
			if (other.VpcId != null)
				return false;
		} else if (!VpcId.equals(other.VpcId))
			return false;
		if (VpcName == null) {
			if (other.VpcName != null)
				return false;
		} else if (!VpcName.equals(other.VpcName))
			return false;
		return true;
	}

	@Override
    public ModifyVpcRequest clone() {
        return (ModifyVpcRequest) super.clone();
    }

    @Override
    public Request<ModifyVpcRequest> getDryRunRequest() {
        Request<ModifyVpcRequest> request = new ModifyVpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}