package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.RegisterBackendServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for RegisterBackendServer.
 * </p>
 */
@Data
public class RegisterBackendServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<RegisterBackendServerRequest> {

    /**
     * 后端服务组的ID
     */
    private String backendServerGroupId;
    /**
     * 后端服务的IP
     */
    private String backendServerIp;
    /**
     * 后端服务的端口
     */
    private String backendServerPort;
    /**
     * 实例的权重
     */
    private Integer weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RegisterBackendServerRequest that = (RegisterBackendServerRequest) o;
        if (backendServerGroupId != null ? !backendServerGroupId.equals(that.backendServerGroupId) : that.backendServerGroupId != null)
            return false;
        if (backendServerIp != null ? !backendServerIp.equals(that.backendServerIp) : that.backendServerIp != null)
            return false;
        if (backendServerPort != null ? !backendServerPort.equals(that.backendServerPort) : that.backendServerPort != null)
            return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (backendServerGroupId != null ? backendServerGroupId.hashCode() : 0);
        result = 31 * result + (backendServerIp != null ? backendServerIp.hashCode() : 0);
        result = 31 * result + (backendServerPort != null ? backendServerPort.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }


    @Override
    public Request<RegisterBackendServerRequest> getDryRunRequest() {
        Request<RegisterBackendServerRequest> request = new RegisterBackendServerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public RegisterBackendServerRequest clone() {
        return (RegisterBackendServerRequest) super.clone();
    }
}

