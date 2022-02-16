package com.ksc.network.vpc.model.havip;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.havip.DeleteHaVipRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteHaVip.
 * </p>
 */
@Data
public class DeleteHaVipRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteHaVipRequest> {

    /**
     * HaVip的id
     */
    private String haVipId;

    @Override
    public DeleteHaVipRequest clone() {
        return (DeleteHaVipRequest) super.clone();
    }

    @Override
    public Request<DeleteHaVipRequest> getDryRunRequest() {
        Request<DeleteHaVipRequest> request = new DeleteHaVipRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}