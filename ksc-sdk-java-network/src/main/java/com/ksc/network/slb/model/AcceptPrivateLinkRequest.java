package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.AcceptPrivateLinkRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AcceptPrivateLink.
 * </p>
 */
@Data
public class AcceptPrivateLinkRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AcceptPrivateLinkRequest> {

    /**
     * PrivateLink的ID
     */
    private String privateLinkId;


    @Override
    public Request<AcceptPrivateLinkRequest> getDryRunRequest() {
        Request<AcceptPrivateLinkRequest> request = new AcceptPrivateLinkRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public AcceptPrivateLinkRequest clone() {
        return (AcceptPrivateLinkRequest) super.clone();
    }
}
