package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.vcs.model.ListUniqueNamesRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * ListUniqueNamesRequest Marshaller
 */

public class ListUniqueNamesRequestMarshaller extends BaseMarshaller<ListUniqueNamesRequest> implements
        Marshaller<Request<ListUniqueNamesRequest>, ListUniqueNamesRequest> {

    private static ListUniqueNamesRequestMarshaller instance;

    private ListUniqueNamesRequestMarshaller() {
    }

    public synchronized static ListUniqueNamesRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new ListUniqueNamesRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<ListUniqueNamesRequest> marshall(ListUniqueNamesRequest listUniqueNamesRequest) throws Exception {
        Request<ListUniqueNamesRequest> request = this.doCommonProc(listUniqueNamesRequest, HttpMethodName.GET, ParamConstant.LIST_UNIQUE_NAMES_ACTION, listUniqueNamesRequest.getVersion());
        return request;
    }

    @Override
    public void validateArgument(ListUniqueNamesRequest originalRequest) throws Exception {
        if (originalRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
