package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.ListWarningStreamsRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * ListWarningStreamsRequest Marshaller
 */

public class ListWarningStreamsRequestMarshaller extends
        BaseMarshaller<ListWarningStreamsRequest> implements
        Marshaller<Request<ListWarningStreamsRequest>, ListWarningStreamsRequest> {

    private static ListWarningStreamsRequestMarshaller instance;

    private ListWarningStreamsRequestMarshaller() {
    }

    public synchronized static ListWarningStreamsRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new ListWarningStreamsRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<ListWarningStreamsRequest> marshall(
            ListWarningStreamsRequest listWarningStreamsRequest) throws Exception {
        Request<ListWarningStreamsRequest> request = this.doCommonProc(
                listWarningStreamsRequest, HttpMethodName.GET, ParamConstant.LIST_WARNING_STREAMS_ACTION,
                listWarningStreamsRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, listWarningStreamsRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, listWarningStreamsRequest.getApp());
        return request;
    }

    @Override
    public void validateArgument(ListWarningStreamsRequest originalRequest)
            throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }

}
