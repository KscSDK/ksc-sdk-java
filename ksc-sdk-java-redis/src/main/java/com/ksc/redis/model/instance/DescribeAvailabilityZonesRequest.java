package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.DescribeAvailabilityZonesMarshaller;

import java.io.Serializable;

public class DescribeAvailabilityZonesRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeAvailabilityZonesRequest> {
    @Override
    public Request<DescribeAvailabilityZonesRequest> getDryRunRequest() {
        Request<DescribeAvailabilityZonesRequest> request = new DescribeAvailabilityZonesMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
