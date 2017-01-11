package com.ksc.vcs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.vcs.model.ParamConstant;

public abstract class BaseMarshaller<T> {


    public Request<T> getRequest(T t) {
        KscWebServiceRequest originalRequest = (KscWebServiceRequest) t;
        Request<T> request = new DefaultRequest<T>(
                originalRequest, ParamConstant.SERVICE_NAME);
        return request;
    }

    public Request<T> doCommonProc(T originalRequest, HttpMethodName httpMethod, String action, String version) throws Exception {
        Request<T> request = this.getRequest(originalRequest);
        this.validateArgument(originalRequest);

        request.addParameter(ParamConstant.API_ACTION, action);
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = ParamConstant.DEFAULT_VERSION;
        }
        request.addParameter(ParamConstant.API_VERSION, version);
        request.setHttpMethod(httpMethod);
        return request;
    }

    public abstract void validateArgument(T originalRequest) throws Exception;
}
