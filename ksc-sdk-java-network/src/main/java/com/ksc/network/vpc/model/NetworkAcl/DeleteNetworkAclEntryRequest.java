package com.ksc.network.vpc.model.NetworkAcl;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkAcl.DeleteNetworkAclEntryRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteNetworkAclEntry.
 * </p>
 */
public class DeleteNetworkAclEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteNetworkAclEntryRequest> {


    /**
     * ACL的ID
     */
    private String NetworkAclId;

    /**
     * ACL规则的ID
     */
    private String NetworkAclEntryId;

	public String getNetworkAclId() {
		return NetworkAclId;
	}

	public void setNetworkAclId(String networkAclId) {
		NetworkAclId = networkAclId;
	}

	public String getNetworkAclEntryId() {
		return NetworkAclEntryId;
	}

	public void setNetworkAclEntryId(String networkAclEntryId) {
		NetworkAclEntryId = networkAclEntryId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DeleteNetworkAclEntryRequest that = (DeleteNetworkAclEntryRequest) o;

		if (!NetworkAclId.equals(that.NetworkAclId)) return false;
		return NetworkAclEntryId.equals(that.NetworkAclEntryId);
	}

	@Override
	public int hashCode() {
		int result = NetworkAclId.hashCode();
		result = 31 * result + NetworkAclEntryId.hashCode();
		return result;
	}

	@Override
    public DeleteNetworkAclEntryRequest clone() {
        return (DeleteNetworkAclEntryRequest) super.clone();
    }
	
    @Override
    public Request<DeleteNetworkAclEntryRequest> getDryRunRequest() {
        Request<DeleteNetworkAclEntryRequest> request = new DeleteNetworkAclEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}