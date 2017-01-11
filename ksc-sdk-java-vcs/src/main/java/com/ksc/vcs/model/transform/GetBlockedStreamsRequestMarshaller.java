package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.GetBlockedStreamsRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * GetBlockedStreamsRequest Marshaller
 */

public class GetBlockedStreamsRequestMarshaller extends
        BaseMarshaller<GetBlockedStreamsRequest> implements
        Marshaller<Request<GetBlockedStreamsRequest>, GetBlockedStreamsRequest> {

    private static GetBlockedStreamsRequestMarshaller instance;

    private GetBlockedStreamsRequestMarshaller() {
    }

    public synchronized static GetBlockedStreamsRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new GetBlockedStreamsRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<GetBlockedStreamsRequest> marshall(
            GetBlockedStreamsRequest getBlockedStreamsRequest) throws Exception {
        Request<GetBlockedStreamsRequest> request = this.doCommonProc(
                getBlockedStreamsRequest, HttpMethodName.GET, ParamConstant.GET_BLOCKED_STREAMS_ACTION,
                getBlockedStreamsRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, getBlockedStreamsRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, getBlockedStreamsRequest.getApp());
        request.addParameter(ParamConstant.START_TIME, String.valueOf(getBlockedStreamsRequest.getStartTime()));
        request.addParameter(ParamConstant.END_TIME, String.valueOf(getBlockedStreamsRequest.getEndTime()));
        return request;
    }

    @Override
    public void validateArgument(GetBlockedStreamsRequest originalRequest)
            throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())
                || StringUtils.isNullOrEmpty(String.valueOf(originalRequest.getStartTime()))
                || StringUtils.isNullOrEmpty(String.valueOf(originalRequest.getEndTime()))) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }

}
