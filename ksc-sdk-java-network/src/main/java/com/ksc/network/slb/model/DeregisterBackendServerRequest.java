package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeregisterBackendServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeregisterBackendServer.
 * </p>
 */
@Data
public class DeregisterBackendServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeregisterBackendServerRequest> {

    /**
     * 后端服务的ID
     */
    private String registerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeregisterBackendServerRequest that = (DeregisterBackendServerRequest) o;
        if (registerId != null ? !registerId.equals(that.registerId) : that.registerId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (registerId != null ? registerId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeregisterBackendServerRequest> getDryRunRequest() {
        Request<DeregisterBackendServerRequest> request = new DeregisterBackendServerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeregisterBackendServerRequest clone() {
        return (DeregisterBackendServerRequest) super.clone();
    }
}

