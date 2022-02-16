package com.ksc.network.vpc.model.havip;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.havip.AssociateHaVipRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AssociateHaVip.
 * </p>
 */
@Data
public class AssociateHaVipRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociateHaVipRequest> {

    /**
     * HaVip的id
     */
    private String haVipId;
    /**
     * 与HaVip绑定的弹性网卡ID
     */
    private String networkInterfaceId;

    @Override
    public AssociateHaVipRequest clone() {
        return (AssociateHaVipRequest) super.clone();
    }

    @Override
    public Request<AssociateHaVipRequest> getDryRunRequest() {
        Request<AssociateHaVipRequest> request = new AssociateHaVipRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}