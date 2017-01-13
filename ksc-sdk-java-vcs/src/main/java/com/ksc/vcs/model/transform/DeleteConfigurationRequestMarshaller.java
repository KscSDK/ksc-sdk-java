package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.DeleteConfigurationRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * DeleteConfigurationRequest Marshaller
 */

public class DeleteConfigurationRequestMarshaller extends BaseMarshaller<DeleteConfigurationRequest> implements
        Marshaller<Request<DeleteConfigurationRequest>, DeleteConfigurationRequest> {

    private static DeleteConfigurationRequestMarshaller instance;

    private DeleteConfigurationRequestMarshaller() {
    }

    public synchronized static DeleteConfigurationRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteConfigurationRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<DeleteConfigurationRequest> marshall(DeleteConfigurationRequest deleteConfigurationRequest) throws Exception {
        Request<DeleteConfigurationRequest> request = this.doCommonProc(deleteConfigurationRequest, HttpMethodName.DELETE, ParamConstant.DELETE_CONFIGURATION_ACTION, deleteConfigurationRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, deleteConfigurationRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, deleteConfigurationRequest.getApp());
        return request;
    }

    @Override
    public void validateArgument(DeleteConfigurationRequest originalRequest) throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
