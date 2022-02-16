package com.ksc.redis.transform.parameter;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.ExportSnapshotRequest;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: DescribeCacheParameterGroupsMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeCacheParameterGroupsMarshaller implements Marshaller<Request<DescribeCacheParameterGroupsRequest>, DescribeCacheParameterGroupsRequest> {
    @Override
    public Request<DescribeCacheParameterGroupsRequest> marshall(DescribeCacheParameterGroupsRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeCacheParameterGroupsRequest> request = new DefaultRequest<DescribeCacheParameterGroupsRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheParameterGroups");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("SnapshotId", in.getName());
        request.addParameter("BucketName", in.getCacheParameterGroupId());
        request.addParameter("ObjectName",in.getParamVersion());
        return request;
    }

}
