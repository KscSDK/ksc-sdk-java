package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.GetConfigurationRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * GetConfigurationRequest Marshaller
 */

public class GetConfigurationRequestMarshaller extends BaseMarshaller<GetConfigurationRequest> implements
        Marshaller<Request<GetConfigurationRequest>, GetConfigurationRequest> {

    private static GetConfigurationRequestMarshaller instance;

    private GetConfigurationRequestMarshaller() {
    }

    public synchronized static GetConfigurationRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new GetConfigurationRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<GetConfigurationRequest> marshall(GetConfigurationRequest getConfigurationRequest) throws Exception {
        Request<GetConfigurationRequest> request = this.doCommonProc(getConfigurationRequest, HttpMethodName.GET, ParamConstant.GET_CONFIGURATION_ACTION, getConfigurationRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, getConfigurationRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, getConfigurationRequest.getApp());
        return request;
    }

    @Override
    public void validateArgument(GetConfigurationRequest originalRequest) throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
