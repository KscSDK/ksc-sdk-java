package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.DeleteKrdsMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DeleteKrdsRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<DeleteKrdsRequest> {

    private String DBInstanceIdentifier;

    public Request<DeleteKrdsRequest> getDryRunRequest() {
        Request<DeleteKrdsRequest> request = new DeleteKrdsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}