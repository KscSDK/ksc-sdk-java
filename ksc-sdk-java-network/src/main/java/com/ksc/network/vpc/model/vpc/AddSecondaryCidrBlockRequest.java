package com.ksc.network.vpc.model.vpc;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpc.AddSecondaryCidrBlockRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AddSecondaryCidrBlock.
 * </p>
 */
@Data
public class AddSecondaryCidrBlockRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AddSecondaryCidrBlockRequest> {

    /**
     * Vpc的id
     */
    private String vpcId;
    /**
     * 网络范围，例如：10.0.0.0/16
     */
    private String cidrBlock;


    @Override
    public AddSecondaryCidrBlockRequest clone() {
        return (AddSecondaryCidrBlockRequest) super.clone();
    }

    @Override
    public Request<AddSecondaryCidrBlockRequest> getDryRunRequest() {
        Request<AddSecondaryCidrBlockRequest> request = new AddSecondaryCidrBlockRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}