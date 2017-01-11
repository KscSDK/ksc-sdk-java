package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.GetArchiveCfgRequest;
import com.ksc.vcs.model.ParamConstant;


/**
 * GetArchiveCfgRequest Marshaller
 */

public class GetArchiveCfgRequestMarshaller extends
        BaseMarshaller<GetArchiveCfgRequest> implements
        Marshaller<Request<GetArchiveCfgRequest>, GetArchiveCfgRequest> {

    private static GetArchiveCfgRequestMarshaller instance;

    private GetArchiveCfgRequestMarshaller() {
    }

    public synchronized static GetArchiveCfgRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new GetArchiveCfgRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<GetArchiveCfgRequest> marshall(
            GetArchiveCfgRequest getArchiveCfgRequest) throws Exception {
        Request<GetArchiveCfgRequest> request = this.doCommonProc(
                getArchiveCfgRequest, HttpMethodName.GET, ParamConstant.GET_ARCHIVE_CFG_ACTION,
                getArchiveCfgRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, getArchiveCfgRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, getArchiveCfgRequest.getApp());
        return request;
    }

    @Override
    public void validateArgument(GetArchiveCfgRequest originalRequest)
            throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }

}