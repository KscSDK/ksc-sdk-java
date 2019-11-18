package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.DescribeRegionsMarshaller;

import java.io.Serializable;

public class DescribeRegionsRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeRegionsRequest> {
    @Override
    public Request<DescribeRegionsRequest> getDryRunRequest() {
        Request<DescribeRegionsRequest> request = new DescribeRegionsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
