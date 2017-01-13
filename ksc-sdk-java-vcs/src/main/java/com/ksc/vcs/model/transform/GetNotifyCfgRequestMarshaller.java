package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.GetNotifyCfgRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * GetNotifyCfgRequest Marshaller
 */

public class GetNotifyCfgRequestMarshaller extends
        BaseMarshaller<GetNotifyCfgRequest> implements
        Marshaller<Request<GetNotifyCfgRequest>, GetNotifyCfgRequest> {

    private static GetNotifyCfgRequestMarshaller instance;

    private GetNotifyCfgRequestMarshaller() {

    }

    public synchronized static GetNotifyCfgRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new GetNotifyCfgRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<GetNotifyCfgRequest> marshall(
            GetNotifyCfgRequest getNotifyCfgRequest) throws Exception {
        Request<GetNotifyCfgRequest> request = this.doCommonProc(
                getNotifyCfgRequest, HttpMethodName.GET, ParamConstant.GET_NOTIFY_CFG_ACTION,
                getNotifyCfgRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, getNotifyCfgRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, getNotifyCfgRequest.getApp());
        return request;
    }

    @Override
    public void validateArgument(GetNotifyCfgRequest originalRequest)
            throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }

}
