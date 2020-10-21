package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifyBackendServerGroupRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyBackendServerGroup.
 * </p>
 */
@Data
public class ModifyBackendServerGroupRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyBackendServerGroupRequest> {

    /**
     * 后端服务组的ID
     */
    private String backendServerGroupId;
    /**
     * 后端服务组的名称
     */
    private String backendServerGroupName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyBackendServerGroupRequest that = (ModifyBackendServerGroupRequest) o;
        if (backendServerGroupId != null ? !backendServerGroupId.equals(that.backendServerGroupId) : that.backendServerGroupId != null)
            return false;
        if (backendServerGroupName != null ? !backendServerGroupName.equals(that.backendServerGroupName) : that.backendServerGroupName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (backendServerGroupId != null ? backendServerGroupId.hashCode() : 0);
        result = 31 * result + (backendServerGroupName != null ? backendServerGroupName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyBackendServerGroupRequest> getDryRunRequest() {
        Request<ModifyBackendServerGroupRequest> request = new ModifyBackendServerGroupRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyBackendServerGroupRequest clone() {
        return (ModifyBackendServerGroupRequest) super.clone();
    }
}

