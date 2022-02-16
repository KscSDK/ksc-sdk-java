package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreatePrivateLinkServerRequestMarshaller;
import com.ksc.network.slb.model.transform.ModifyPrivateLinkServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyPrivateLinkServer.
 * </p>
 */
@Data
public class ModifyPrivateLinkServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyPrivateLinkServerRequest> {

    /**
     * PrivateLink名称
     */
    private String privateLinkServerName;
    /**
     * PrivateLinkServer的ID
     */
    private String privateLinkServerId;
    /**
     * PrivateLinkServer的描述
     */
    private String description;



    @Override
    public Request<ModifyPrivateLinkServerRequest> getDryRunRequest() {
        Request<ModifyPrivateLinkServerRequest> request = new ModifyPrivateLinkServerRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyPrivateLinkServerRequest clone() {
        return (ModifyPrivateLinkServerRequest) super.clone();
    }
}
