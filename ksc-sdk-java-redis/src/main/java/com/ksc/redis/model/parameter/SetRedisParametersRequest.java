package com.ksc.redis.model.parameter;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.parameter.SetRedisParametersMarshaller;

import java.io.Serializable;
import java.util.List;


public class SetRedisParametersRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<SetRedisParametersRequest> {
    private String cacheId;
    private Boolean resetAllParameters = false;
    private List<String> parameterName;
    private List<String> parameterValue;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
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

    @Override
    public Request<SetRedisParametersRequest> getDryRunRequest() {
        Request<SetRedisParametersRequest> request = new SetRedisParametersMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
