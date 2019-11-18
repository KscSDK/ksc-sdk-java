package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.StatisticDBInstancesRequest;
import com.ksc.transform.Marshaller;

public class StatisticDBInstancesMarshaller implements Marshaller<Request<StatisticDBInstancesRequest>, StatisticDBInstancesRequest> {
    @Override
    public Request<StatisticDBInstancesRequest> marshall(StatisticDBInstancesRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<StatisticDBInstancesRequest> request = new DefaultRequest<StatisticDBInstancesRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "StatisticDBInstances");
        request.addParameter("Version", "2016-07-01");
        return request;
    }
}
