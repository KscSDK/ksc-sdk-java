package com.ksc.redis.model.parameter;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.parameter.DescribeCacheParameterGroupsMarshaller;

import java.io.Serializable;

/***
 * @ClassName: DescribeCacheParameterGroupsRequest
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeCacheParameterGroupsRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeCacheParameterGroupsRequest> {
    private String Name;
    private String CacheParameterGroupId;
    private String ParamVersion;
    private Integer Offset;
    private Integer Limit;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCacheParameterGroupId() {
        return CacheParameterGroupId;
    }

    public void setCacheParameterGroupId(String cacheParameterGroupId) {
        CacheParameterGroupId = cacheParameterGroupId;
    }

    public String getParamVersion() {
        return ParamVersion;
    }

    public void setParamVersion(String paramVersion) {
        ParamVersion = paramVersion;
    }

    public Integer getOffset() {
        return Offset;
    }

    public void setOffset(Integer offset) {
        Offset = offset;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setLimit(Integer limit) {
        Limit = limit;
    }


    @Override
    public Request<DescribeCacheParameterGroupsRequest> getDryRunRequest() {
        Request<DescribeCacheParameterGroupsRequest> request = new DescribeCacheParameterGroupsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
