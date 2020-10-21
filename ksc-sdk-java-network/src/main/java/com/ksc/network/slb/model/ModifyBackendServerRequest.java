package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifyBackendServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyBackendServer.
 * </p>
 */
@Data
public class ModifyBackendServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyBackendServerRequest> {

    /**
     * 后端服务的ID
     */
    private String registerId;
    /**
     * 实例的权重
     */
    private Integer weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyBackendServerRequest that = (ModifyBackendServerRequest) o;
        if (registerId != null ? !registerId.equals(that.registerId) : that.registerId != null)
            return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (registerId != null ? registerId.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyBackendServerRequest> getDryRunRequest() {
        Request<ModifyBackendServerRequest> request = new ModifyBackendServerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyBackendServerRequest clone() {
        return (ModifyBackendServerRequest) super.clone();
    }
}

