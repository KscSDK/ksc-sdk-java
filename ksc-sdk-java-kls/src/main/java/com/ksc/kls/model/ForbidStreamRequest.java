package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kls.model.transform.ForbidStreamMarshaller;
import com.ksc.model.DryRunSupportedRequest;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ForbidStreamRequest extends KscWebServiceRequest implements DryRunSupportedRequest<ForbidStreamRequest> {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Request<ForbidStreamRequest> getDryRunRequest() {
        Request<ForbidStreamRequest> request = new ForbidStreamMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }
}
