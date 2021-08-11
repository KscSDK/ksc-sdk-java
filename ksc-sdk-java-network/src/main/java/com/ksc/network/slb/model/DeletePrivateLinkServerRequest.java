package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeletePrivateLinkServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeletePrivateLinkServer.
 * </p>
 */
@Data
public class DeletePrivateLinkServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeletePrivateLinkServerRequest> {

    /**
     * PrivateLinkServer的ID
     */
    private String privateLinkServerId;


    @Override
    public Request<DeletePrivateLinkServerRequest> getDryRunRequest() {
        Request<DeletePrivateLinkServerRequest> request = new DeletePrivateLinkServerRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeletePrivateLinkServerRequest clone() {
        return (DeletePrivateLinkServerRequest) super.clone();
    }
}
