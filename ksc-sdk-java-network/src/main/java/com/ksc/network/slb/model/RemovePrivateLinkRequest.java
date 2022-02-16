package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeletePrivateLinkRequestMarshaller;
import com.ksc.network.slb.model.transform.RemovePrivateLinkRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for RemovePrivateLink.
 * </p>
 */
@Data
public class RemovePrivateLinkRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<RemovePrivateLinkRequest> {

    /**
     * PrivateLink的ID
     */
    private String privateLinkId;


    @Override
    public Request<RemovePrivateLinkRequest> getDryRunRequest() {
        Request<RemovePrivateLinkRequest> request = new RemovePrivateLinkRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public RemovePrivateLinkRequest clone() {
        return (RemovePrivateLinkRequest) super.clone();
    }
}
