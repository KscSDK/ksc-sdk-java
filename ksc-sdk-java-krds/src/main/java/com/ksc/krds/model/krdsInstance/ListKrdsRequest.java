package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.ListKrdsMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class ListKrdsRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<ListKrdsRequest> {

    public Request<ListKrdsRequest> getDryRunRequest() {
        Request<ListKrdsRequest> request = new ListKrdsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
