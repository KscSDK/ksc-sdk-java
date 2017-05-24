package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeregisterInstancesFromListenerRequestMarshaller;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/24.
 */
public class DeregisterInstancesFromListenerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeregisterInstancesFromListenerRequest> {

    /**
     * 监听器和主机绑定的ID
     */
    private String RegisterId;

    public String getRegisterId() {
        return RegisterId;
    }

    public void setRegisterId(String registerId) {
        RegisterId = registerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeregisterInstancesFromListenerRequest that = (DeregisterInstancesFromListenerRequest) o;

        return RegisterId != null ? RegisterId.equals(that.RegisterId) : that.RegisterId == null;
    }

    @Override
    public int hashCode() {
        return RegisterId != null ? RegisterId.hashCode() : 0;
    }

    @Override
    public DeregisterInstancesFromListenerRequest clone() {
        return (DeregisterInstancesFromListenerRequest) super.clone();
    }

    @Override
    public Request<DeregisterInstancesFromListenerRequest> getDryRunRequest() {
        Request<DeregisterInstancesFromListenerRequest> request = new DeregisterInstancesFromListenerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
