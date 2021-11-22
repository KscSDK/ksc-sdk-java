package com.ksc.network.vpc.model.havip;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.havip.CreateHaVipRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateHaVip.
 * </p>
 */
@Data
public class CreateHaVipRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateHaVipRequest> {

    /**
     * 子网的ID
     */
    private String subnetId;
    /**
     * HaVip的IP地址
     */
    private String ipAddress;


    @Override
    public CreateHaVipRequest clone() {
        return (CreateHaVipRequest) super.clone();
    }

    @Override
    public Request<CreateHaVipRequest> getDryRunRequest() {
        Request<CreateHaVipRequest> request = new CreateHaVipRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}