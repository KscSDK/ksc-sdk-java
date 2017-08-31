package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kls.model.transform.StartStreamRecordMarshaller;
import com.ksc.model.DryRunSupportedRequest;

/**
 * Created by yangfan on 2017/4/24.
 */
public class StartStreamRecordRequest  extends KscWebServiceRequest implements DryRunSupportedRequest<StartStreamRecordRequest> {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Request<StartStreamRecordRequest> getDryRunRequest() {
        Request<StartStreamRecordRequest> request = new StartStreamRecordMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }
}
