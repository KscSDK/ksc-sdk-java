package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kls.model.transform.ListRealtimeStreamsInfoMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class ListRealtimeStreamsInfoRequest  extends KscWebServiceRequest implements DryRunSupportedRequest<ListRealtimeStreamsInfoRequest> {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Request<ListRealtimeStreamsInfoRequest> getDryRunRequest() {
        Request<ListRealtimeStreamsInfoRequest> request = new ListRealtimeStreamsInfoMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }

}
