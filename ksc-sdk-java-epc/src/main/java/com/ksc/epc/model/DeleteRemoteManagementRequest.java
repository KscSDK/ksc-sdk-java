package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DeleteRemoteManagementRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteRemoteManagement.
 * </p>
 */
@Data
public class DeleteRemoteManagementRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteRemoteManagementRequest> {

    /**
     * 带外管理ID
     */
    private String remoteManagementId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteRemoteManagementRequest that = (DeleteRemoteManagementRequest) o;
        if (remoteManagementId != null ? !remoteManagementId.equals(that.remoteManagementId) : that.remoteManagementId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (remoteManagementId != null ? remoteManagementId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteRemoteManagementRequest> getDryRunRequest() {
        Request<DeleteRemoteManagementRequest> request = new DeleteRemoteManagementRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteRemoteManagementRequest clone() {
        return (DeleteRemoteManagementRequest) super.clone();
    }
}

