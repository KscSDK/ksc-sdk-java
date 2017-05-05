package com.ksc.network.vpc.model.Nat;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Nat.DeleteNatRequestMarshaller;
import com.ksc.network.vpc.transform.Routes.DeleteRouteRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteSubnet.
 * </p>
 */
public class DeleteNatRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteNatRequest> {


    /**
     * Nat的ID
     */
    private String NatId;

    public String getNatId() {
        return NatId;
    }

    public void setNatId(String natId) {
        NatId = natId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteNatRequest that = (DeleteNatRequest) o;

        return NatId.equals(that.NatId);
    }

    @Override
    public int hashCode() {
        return NatId.hashCode();
    }

    @Override
    public DeleteNatRequest clone() {
        return (DeleteNatRequest) super.clone();
    }

    @Override
    public Request<DeleteNatRequest> getDryRunRequest() {
        Request<DeleteNatRequest> request = new DeleteNatRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}