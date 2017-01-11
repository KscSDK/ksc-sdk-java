package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.GetRecogCfgRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 *GetRecogCfgRequest Marshaller
 */

public class GetRecogCfgRequestMarshaller extends BaseMarshaller<GetRecogCfgRequest> implements
        Marshaller<Request<GetRecogCfgRequest>, GetRecogCfgRequest> {

    private static GetRecogCfgRequestMarshaller instance;

    private GetRecogCfgRequestMarshaller() {
    }

    public synchronized static GetRecogCfgRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new GetRecogCfgRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<GetRecogCfgRequest> marshall(GetRecogCfgRequest getRecogCfgRequest) throws Exception {
        Request<GetRecogCfgRequest> request = this.doCommonProc(getRecogCfgRequest, HttpMethodName.GET, ParamConstant.GET_RECOG_CFG_ACTION, getRecogCfgRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, getRecogCfgRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, getRecogCfgRequest.getApp());
        return request;
    }

    @Override
    public void validateArgument(GetRecogCfgRequest originalRequest) throws Exception {
        if (originalRequest == null ||
                StringUtils.isNullOrEmpty(originalRequest.getUniqueName()) ||
                StringUtils.isNullOrEmpty(originalRequest.getApp())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
