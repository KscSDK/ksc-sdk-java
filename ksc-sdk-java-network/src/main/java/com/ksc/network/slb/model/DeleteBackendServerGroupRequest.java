package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteBackendServerGroupRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteBackendServerGroup.
 * </p>
 */
@Data
public class DeleteBackendServerGroupRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteBackendServerGroupRequest> {

    /**
     * 后端服务组的ID
     */
    private String backendServerGroupId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteBackendServerGroupRequest that = (DeleteBackendServerGroupRequest) o;
        if (backendServerGroupId != null ? !backendServerGroupId.equals(that.backendServerGroupId) : that.backendServerGroupId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (backendServerGroupId != null ? backendServerGroupId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteBackendServerGroupRequest> getDryRunRequest() {
        Request<DeleteBackendServerGroupRequest> request = new DeleteBackendServerGroupRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteBackendServerGroupRequest clone() {
        return (DeleteBackendServerGroupRequest) super.clone();
    }
}

