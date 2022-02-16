package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreatePrivateLinkServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreatePrivateLinkServer.
 * </p>
 */
@Data
public class CreatePrivateLinkServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreatePrivateLinkServerRequest> {

    /**
     * PrivateLink名称
     */
    private String privateLinkServerName;
    /**
     * 关联监听器ID
     */
    private String listenerId;
    /**
     * PrivateLinkServer的描述
     */
    private String description;

    private String projectId;


    @Override
    public Request<CreatePrivateLinkServerRequest> getDryRunRequest() {
        Request<CreatePrivateLinkServerRequest> request = new CreatePrivateLinkServerRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreatePrivateLinkServerRequest clone() {
        return (CreatePrivateLinkServerRequest) super.clone();
    }
}
