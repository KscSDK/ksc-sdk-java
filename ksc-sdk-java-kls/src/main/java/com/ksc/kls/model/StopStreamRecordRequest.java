package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kls.model.transform.StopStreamRecordMarshaller;
import com.ksc.model.DryRunSupportedRequest;

/**
 * Created by yangfan on 2017/4/24.
 */
public class StopStreamRecordRequest extends KscWebServiceRequest implements DryRunSupportedRequest<StopStreamRecordRequest> {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Request<StopStreamRecordRequest> getDryRunRequest() {
        Request<StopStreamRecordRequest> request = new StopStreamRecordMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }
}
