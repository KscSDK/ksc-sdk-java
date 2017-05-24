package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteListenersRequestMarshaller;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/24.
 */
public class DeleteListenersRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteListenersRequest> {

    /**
     * 监听器的ID
     */
    private String ListenerId;

    public String getListenerId() {
        return ListenerId;
    }

    public void setListenerId(String listenerId) {
        ListenerId = listenerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteListenersRequest that = (DeleteListenersRequest) o;

        return ListenerId != null ? ListenerId.equals(that.ListenerId) : that.ListenerId == null;
    }

    @Override
    public int hashCode() {
        return ListenerId != null ? ListenerId.hashCode() : 0;
    }

    @Override
    public DeleteListenersRequest clone() {
        return (DeleteListenersRequest) super.clone();
    }

    @Override
    public Request<DeleteListenersRequest> getDryRunRequest() {
        Request<DeleteListenersRequest> request = new DeleteListenersRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
