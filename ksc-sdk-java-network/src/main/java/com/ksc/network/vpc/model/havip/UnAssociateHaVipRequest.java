package com.ksc.network.vpc.model.havip;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.havip.UnAssociateHaVipRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for UnAssociateHaVip.
 * </p>
 */
@Data
public class UnAssociateHaVipRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<UnAssociateHaVipRequest> {

    /**
     * HaVip的id
     */
    private String haVipId;
    /**
     * 与HaVip绑定的弹性网卡ID
     */
    private String networkInterfaceId;

    @Override
    public UnAssociateHaVipRequest clone() {
        return (UnAssociateHaVipRequest) super.clone();
    }

    @Override
    public Request<UnAssociateHaVipRequest> getDryRunRequest() {
        Request<UnAssociateHaVipRequest> request = new UnAssociateHaVipRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}