package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.AssociatePrivateLinkServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AssociatePrivateLinkServer.
 * </p>
 */
@Data
public class AssociatePrivateLinkServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociatePrivateLinkServerRequest> {

    /**
     * PrivateLinkServer的ID
     */
    private String privateLinkServerId;
    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;
    /**
     * 监听器的协议端口
     */
    private String ListenerPort;

    private String projectId;


    @Override
    public Request<AssociatePrivateLinkServerRequest> getDryRunRequest() {
        Request<AssociatePrivateLinkServerRequest> request = new AssociatePrivateLinkServerRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public AssociatePrivateLinkServerRequest clone() {
        return (AssociatePrivateLinkServerRequest) super.clone();
    }
}
