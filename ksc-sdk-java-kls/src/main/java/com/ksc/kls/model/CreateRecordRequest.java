package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kls.model.transform.CreateRecordRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CreateRecordRequest  extends KscWebServiceRequest implements DryRunSupportedRequest<CreateRecordRequest> {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Request<CreateRecordRequest> getDryRunRequest() {
        Request<CreateRecordRequest> request = new CreateRecordRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }
}
