package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kls.model.transform.CancelRecordRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CancelRecordRequest  extends KscWebServiceRequest implements DryRunSupportedRequest<CancelRecordRequest> {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Request<CancelRecordRequest> getDryRunRequest() {
        Request<CancelRecordRequest> request = new CancelRecordRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }
}
