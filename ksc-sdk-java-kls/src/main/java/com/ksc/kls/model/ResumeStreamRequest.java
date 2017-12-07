package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kls.model.transform.ResumeStreamMarshaller;
import com.ksc.model.DryRunSupportedRequest;

/**
 * Created by yangfan on 2017/7/25.
 */
public class ResumeStreamRequest extends KscWebServiceRequest implements DryRunSupportedRequest<ResumeStreamRequest> {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Request<ResumeStreamRequest> getDryRunRequest() {
        Request<ResumeStreamRequest> request = new ResumeStreamMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }
}
