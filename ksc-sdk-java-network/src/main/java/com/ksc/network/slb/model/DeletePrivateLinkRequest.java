package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeletePrivateLinkRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeletePrivateLink.
 * </p>
 */
@Data
public class DeletePrivateLinkRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeletePrivateLinkRequest> {

    /**
     * PrivateLink的ID
     */
    private String privateLinkId;


    @Override
    public Request<DeletePrivateLinkRequest> getDryRunRequest() {
        Request<DeletePrivateLinkRequest> request = new DeletePrivateLinkRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeletePrivateLinkRequest clone() {
        return (DeletePrivateLinkRequest) super.clone();
    }
}
