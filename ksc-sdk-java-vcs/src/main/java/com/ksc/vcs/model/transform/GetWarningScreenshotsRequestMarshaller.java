package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.GetWarningScreenshotsRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * GetWarningScreenshotsRequest Marshaller
 */

public class GetWarningScreenshotsRequestMarshaller extends BaseMarshaller<GetWarningScreenshotsRequest> implements
        Marshaller<Request<GetWarningScreenshotsRequest>, GetWarningScreenshotsRequest> {

    private static GetWarningScreenshotsRequestMarshaller instance;

    private GetWarningScreenshotsRequestMarshaller() {
    }

    public synchronized static GetWarningScreenshotsRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new GetWarningScreenshotsRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<GetWarningScreenshotsRequest> marshall(GetWarningScreenshotsRequest getWarningScreenshotsRequest) throws Exception {
        Request<GetWarningScreenshotsRequest> request = this.doCommonProc(getWarningScreenshotsRequest, HttpMethodName.GET, ParamConstant.GET_WARNING_SCREENSHOTS_ACTION, getWarningScreenshotsRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, getWarningScreenshotsRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, getWarningScreenshotsRequest.getApp());
        request.addParameter(ParamConstant.STREAM, getWarningScreenshotsRequest.getStream());
        request.addParameter(ParamConstant.START_TIME, String.valueOf(getWarningScreenshotsRequest.getStartTime()));
        request.addParameter(ParamConstant.END_TIME, String.valueOf(getWarningScreenshotsRequest.getEndTime()));
        return request;
    }

    @Override
    public void validateArgument(GetWarningScreenshotsRequest originalRequest) throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())
                || StringUtils.isNullOrEmpty(originalRequest.getStream())
                || originalRequest.getStartTime() == null
                || originalRequest.getEndTime() == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
