package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.RejectPrivateLinkRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for RejectPrivateLink.
 * </p>
 */
@Data
public class RejectPrivateLinkRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<RejectPrivateLinkRequest> {

    /**
     * PrivateLink的ID
     */
    private String privateLinkId;


    @Override
    public Request<RejectPrivateLinkRequest> getDryRunRequest() {
        Request<RejectPrivateLinkRequest> request = new RejectPrivateLinkRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public RejectPrivateLinkRequest clone() {
        return (RejectPrivateLinkRequest) super.clone();
    }
}
