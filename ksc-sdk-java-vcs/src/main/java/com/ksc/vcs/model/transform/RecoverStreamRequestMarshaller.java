package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.RecoverStreamRequest;

/**
 * RecoverStreamRequest Marshaller
 */

public class RecoverStreamRequestMarshaller extends
        BaseMarshaller<RecoverStreamRequest> implements
        Marshaller<Request<RecoverStreamRequest>, RecoverStreamRequest> {

    private static RecoverStreamRequestMarshaller instance;

    private RecoverStreamRequestMarshaller() {
    }

    public synchronized static RecoverStreamRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new RecoverStreamRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<RecoverStreamRequest> marshall(RecoverStreamRequest recoverStreamRequest) throws Exception {
        Request<RecoverStreamRequest> request = this.doCommonProc(recoverStreamRequest, HttpMethodName.DELETE, ParamConstant.RECOVER_STREAM_ACTION, recoverStreamRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, recoverStreamRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, recoverStreamRequest.getApp());
        request.addParameter(ParamConstant.STREAM, recoverStreamRequest.getStream());

        return request;
    }

    @Override
    public void validateArgument(RecoverStreamRequest originalRequest) throws Exception {
        if (originalRequest == null ||
                StringUtils.isNullOrEmpty(originalRequest.getUniqueName()) ||
                StringUtils.isNullOrEmpty(originalRequest.getApp()) ||
                StringUtils.isNullOrEmpty(originalRequest.getStream())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
