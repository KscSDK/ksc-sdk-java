package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.vcs.model.ListConfigurationsRequest;
import com.ksc.vcs.model.ParamConstant;

/**
 * ListConfigurationsRequest Marshaller
 */

public class ListConfigurationsRequestMarshaller extends BaseMarshaller<ListConfigurationsRequest> implements
        Marshaller<Request<ListConfigurationsRequest>, ListConfigurationsRequest> {

    private static ListConfigurationsRequestMarshaller instance;

    private ListConfigurationsRequestMarshaller() {
    }

    public synchronized static ListConfigurationsRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new ListConfigurationsRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<ListConfigurationsRequest> marshall(ListConfigurationsRequest listConfigurationsRequest) throws Exception {
        Request<ListConfigurationsRequest> request = this.doCommonProc(listConfigurationsRequest, HttpMethodName.GET, ParamConstant.LIST_CONFIGURATIONS_ACTION, listConfigurationsRequest.getVersion());
        return request;
    }

    @Override
    public void validateArgument(ListConfigurationsRequest originalRequest) throws Exception {
        if (originalRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
