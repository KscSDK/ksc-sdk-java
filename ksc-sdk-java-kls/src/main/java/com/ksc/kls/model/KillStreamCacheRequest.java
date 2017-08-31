package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.auth.policy.Action;
import com.ksc.kls.model.transform.ForbidStreamMarshaller;
import com.ksc.kls.model.transform.KillStreamCacheMarshaller;
import com.ksc.model.DryRunSupportedRequest;

/**
 * Created by yangfan on 2017/5/19.
 */
public class KillStreamCacheRequest extends KscWebServiceRequest implements DryRunSupportedRequest<KillStreamCacheRequest> {
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;

    @Override
    public Request<KillStreamCacheRequest> getDryRunRequest() {
        Request<KillStreamCacheRequest> request = new KillStreamCacheMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return null;
    }
}
