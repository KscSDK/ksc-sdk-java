package com.ksc.network.vpc.model.vpc;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpc.DeleteSecondaryCidrBlockRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteSecondaryCidrBlock.
 * </p>
 */
@Data
public class DeleteSecondaryCidrBlockRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteSecondaryCidrBlockRequest> {

    /**
     * Vpc的id
     */
    private String vpcId;
    /**
     * Cidr的ID
     */
    private String secondaryCidrId;


    @Override
    public DeleteSecondaryCidrBlockRequest clone() {
        return (DeleteSecondaryCidrBlockRequest) super.clone();
    }

    @Override
    public Request<DeleteSecondaryCidrBlockRequest> getDryRunRequest() {
        Request<DeleteSecondaryCidrBlockRequest> request = new DeleteSecondaryCidrBlockRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}