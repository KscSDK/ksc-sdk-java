package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.ListAppsRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * ListAppsRequest Marshaller
 */

public class ListAppsRequestMarshaller extends BaseMarshaller<ListAppsRequest> implements
        Marshaller<Request<ListAppsRequest>, ListAppsRequest> {

    private static ListAppsRequestMarshaller instance;

    private ListAppsRequestMarshaller() {
    }

    public synchronized static ListAppsRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new ListAppsRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<ListAppsRequest> marshall(ListAppsRequest listAppsRequest) throws Exception {
        Request<ListAppsRequest> request = this.doCommonProc(listAppsRequest, HttpMethodName.GET, ParamConstant.LIST_APPS_ACTION, listAppsRequest.getVersion());
        request.addParameter(ParamConstant.UNIQUE_NAME, listAppsRequest.getUniqueName());
        return request;
    }

    @Override
    public void validateArgument(ListAppsRequest originalRequest) throws Exception {
        if (originalRequest == null ||
                StringUtils.isNullOrEmpty(originalRequest.getUniqueName())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}