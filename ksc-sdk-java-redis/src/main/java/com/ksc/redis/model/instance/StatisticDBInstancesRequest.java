package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.StatisticDBInstancesMarshaller;

import java.io.Serializable;

public class StatisticDBInstancesRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<StatisticDBInstancesRequest> {
    @Override
    public Request<StatisticDBInstancesRequest> getDryRunRequest() {
        Request<StatisticDBInstancesRequest> request = new StatisticDBInstancesMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
