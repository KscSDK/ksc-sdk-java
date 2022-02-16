package com.ksc.redis.model.parameter;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.parameter.DescribeCacheParameterGroupsMarshaller;
import com.ksc.redis.transform.parameter.ModifyCacheParameterGroupMarshaller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/***
 * @ClassName: ModifyCacheParameterGroupRequest
 * @Description:TODO
 * @version : V1.0
 */
public class ModifyCacheParameterGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyCacheParameterGroupRequest> {
    private String name;
    private String description;
    private String cacheParameterGroupId;

    private Map<String, Object> cacheParams;
    private String paramVersion;
    private List<String> parameterName;
    private List<String> parameterValue;
    private String protocol;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCacheParameterGroupId() {
        return cacheParameterGroupId;
    }

    public void setCacheParameterGroupId(String cacheParameterGroupId) {
        this.cacheParameterGroupId = cacheParameterGroupId;
    }

    public Map<String, Object> getCacheParams() {
        return cacheParams;
    }

    public void setCacheParams(Map<String, Object> cacheParams) {
        this.cacheParams = cacheParams;
    }

    public String getParamVersion() {
        return paramVersion;
    }

    public void setParamVersion(String paramVersion) {
        this.paramVersion = paramVersion;
    }

    public List<String> getParameterName() {
        return parameterName;
    }

    public void setParameterName(List<String> parameterName) {
        this.parameterName = parameterName;
    }

    public List<String> getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(List<String> parameterValue) {
        this.parameterValue = parameterValue;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    @Override
    public Request<ModifyCacheParameterGroupRequest> getDryRunRequest() throws Exception {
        Request<ModifyCacheParameterGroupRequest> request = new ModifyCacheParameterGroupMarshaller().marshall( this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
